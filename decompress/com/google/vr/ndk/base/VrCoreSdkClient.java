// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.app.ActivityManager;
import android.app.Activity;
import android.os.Parcelable;
import android.os.Bundle;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import android.os.RemoteException;
import android.util.Log;
import android.content.Intent;
import com.google.vr.vrcore.common.api.HeadTrackingState;
import android.content.ServiceConnection;
import android.app.PendingIntent;
import android.app.AlertDialog;
import android.content.Context;
import android.content.ComponentName;

class VrCoreSdkClient
{
    private final Runnable closeVrRunnable;
    private final ComponentName componentName;
    private final Context context;
    private final VrCoreSdkClient$DaydreamListenerImpl daydreamListener;
    private aras daydreamManager;
    private final DaydreamUtilsWrapper daydreamUtils;
    private final FadeOverlayView fadeOverlayView;
    private final GvrApi gvrApi;
    private AlertDialog helpCenterDialog;
    private boolean isBound;
    private boolean isEnabled;
    private boolean isResumed;
    private arbq loggingService;
    private Runnable onDonNotNeededListener;
    private PendingIntent optionalReentryIntent;
    private final ServiceConnection serviceConnection;
    private final boolean shouldBind;
    private int vrCoreClientApiVersion;
    private araw vrCoreSdkService;
    
    public VrCoreSdkClient(final Context context, final GvrApi gvrApi, final ComponentName componentName, final DaydreamUtilsWrapper daydreamUtils, final Runnable closeVrRunnable, final FadeOverlayView fadeOverlayView) {
        this.isEnabled = true;
        this.serviceConnection = (ServiceConnection)new VrCoreSdkClient$1(this);
        this.context = context;
        this.gvrApi = gvrApi;
        this.componentName = componentName;
        this.daydreamUtils = daydreamUtils;
        this.closeVrRunnable = closeVrRunnable;
        this.fadeOverlayView = fadeOverlayView;
        this.daydreamListener = new VrCoreSdkClient$DaydreamListenerImpl(gvrApi, fadeOverlayView, closeVrRunnable);
        this.shouldBind = this.hasCompatibleSdkService(context);
        gvrApi.setIgnoreManualTrackerPauseResume(true);
    }
    
    private boolean doBind() {
        if (this.isBound) {
            return true;
        }
        if (this.shouldBind) {
            final Intent intent = new Intent("com.google.vr.vrcore.BIND_SDK_SERVICE");
            intent.setPackage("com.google.vr.vrcore");
            if (this.isBound = this.context.bindService(intent, this.serviceConnection, 1)) {
                return this.isBound;
            }
        }
        this.handleBindFailed();
        return this.isBound;
    }
    
    private void doUnbind() {
        if (this.isResumed) {
            this.resumeTracking(null);
        }
        else {
            this.gvrApi.pauseTrackingGetState();
        }
        if (!this.isBound) {
            return;
        }
        final aras daydreamManager = this.daydreamManager;
        if (daydreamManager != null) {
            try {
                daydreamManager.q(this.componentName);
            }
            catch (final RemoteException ex) {
                Log.w("VrCoreSdkClient", "Failed to unregister Daydream listener: ".concat(ex.toString()));
            }
            this.daydreamManager = null;
        }
        this.vrCoreSdkService = null;
        this.loggingService = null;
        this.context.unbindService(this.serviceConnection);
        this.isBound = false;
    }
    
    private void handleBindFailed() {
        this.doUnbind();
        this.warnIfIncompatibleClient();
    }
    
    private void handleNoDaydreamManager() {
        this.doUnbind();
        this.warnIfIncompatibleClient();
    }
    
    private void handlePrepareVrFailed() {
        this.doUnbind();
        this.closeVrRunnable.run();
    }
    
    private boolean hasCompatibleSdkService(final Context context) {
        try {
            final int vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(context);
            this.vrCoreClientApiVersion = vrCoreClientApiVersion;
            if (vrCoreClientApiVersion >= 5) {
                return true;
            }
            Log.w("VrCoreSdkClient", String.format("VrCore service obsolete, GVR SDK requires API %d but found API %d.", 5, this.vrCoreClientApiVersion));
            return false;
        }
        catch (final aran aran) {
            return false;
        }
    }
    
    private int prepareVr(final HeadTrackingState headTrackingState) {
        if (this.vrCoreClientApiVersion < 13) {
            return this.daydreamManager.a(this.componentName, headTrackingState);
        }
        final DaydreamCompatibility componentDaydreamCompatibility = DaydreamUtils.getComponentDaydreamCompatibility(this.context, this.componentName);
        PendingIntent pendingIntent;
        if ((pendingIntent = this.optionalReentryIntent) == null) {
            final Intent vrIntent = DaydreamApi.createVrIntent(this.componentName);
            vrIntent.addFlags(536870912);
            final Context context = this.context;
            if (!(context instanceof arak)) {
                final Activity t = aqzg.t(context);
                if (t != null && t.getIntent() != null) {
                    vrIntent.putExtras(t.getIntent());
                    vrIntent.fillIn(t.getIntent(), 2);
                }
            }
            pendingIntent = PendingIntent.getActivity(this.context, 0, vrIntent, 1073741824);
        }
        if (this.vrCoreClientApiVersion >= 22) {
            final Bundle bundle = new Bundle();
            bundle.putParcelable("COMPONENT_NAME_KEY", (Parcelable)this.componentName);
            bundle.putInt("DAYDREAM_COMPATIBILITY_KEY", componentDaydreamCompatibility.toDeprecated());
            bundle.putInt("DAYDREAM_COMPATIBILITY_BITMASK_KEY", componentDaydreamCompatibility.getSupportedHeadsets());
            bundle.putParcelable("OPTIONAL_REENTRY_INTENT_KEY", (Parcelable)pendingIntent);
            bundle.putBoolean("IS_USING_VR_DISPLAY_SERVICE_KEY", this.gvrApi.usingVrDisplayService());
            return this.daydreamManager.g(bundle, headTrackingState);
        }
        return this.daydreamManager.b(this.componentName, componentDaydreamCompatibility.toDeprecated(), pendingIntent, headTrackingState);
    }
    
    private static void resumeTracking(final GvrApi gvrApi, final HeadTrackingState headTrackingState) {
        byte[] array2;
        final byte[] array = array2 = null;
        if (headTrackingState != null) {
            final byte[] a = headTrackingState.a;
            array2 = array;
            if (a != null) {
                if (a.length == 0) {
                    array2 = array;
                }
                else {
                    array2 = a;
                }
            }
        }
        gvrApi.resumeTrackingSetState(array2);
    }
    
    private void resumeTracking(final HeadTrackingState headTrackingState) {
        resumeTracking(this.gvrApi, headTrackingState);
        final FadeOverlayView fadeOverlayView = this.fadeOverlayView;
        if (fadeOverlayView != null) {
            fadeOverlayView.flushAutoFade();
        }
    }
    
    private void warnIfIncompatibleClient() {
        if (!this.daydreamUtils.isDaydreamPhone(this.context) && this.daydreamUtils.isDaydreamRequiredComponent(this.context) && !ActivityManager.isRunningInTestHarness()) {
            final AlertDialog helpCenterDialog = this.helpCenterDialog;
            if (helpCenterDialog != null) {
                helpCenterDialog.show();
                return;
            }
            this.helpCenterDialog = araj.b(this.context, this.closeVrRunnable);
        }
    }
    
    public HeadTrackingState getHeadTrackingState() {
        return new HeadTrackingState();
    }
    
    public arbq getLoggingService() {
        return this.loggingService;
    }
    
    public void onExitingFromVr() {
        final aras daydreamManager = this.daydreamManager;
        if (daydreamManager == null) {
            return;
        }
        if (this.vrCoreClientApiVersion >= 16) {
            try {
                daydreamManager.h();
            }
            catch (final RemoteException ex) {
                Log.e("VrCoreSdkClient", "Failed to signal exit from VR to VrCore: ".concat(ex.toString()));
            }
        }
    }
    
    public void onPause() {
        this.isResumed = false;
        this.daydreamListener.resetSafeguards();
        if (this.isEnabled) {
            this.doUnbind();
        }
    }
    
    public boolean onResume() {
        this.isResumed = true;
        return this.isEnabled && this.doBind();
    }
    
    public void setEnabled(final boolean b) {
        if (this.isEnabled == b) {
            return;
        }
        this.isEnabled = b;
        this.gvrApi.setIgnoreManualTrackerPauseResume(b);
        if (this.isResumed) {
            if (this.isEnabled) {
                this.doBind();
                return;
            }
            this.doUnbind();
        }
    }
    
    public void setOnDonNotNeededListener(final Runnable onDonNotNeededListener) {
        this.onDonNotNeededListener = onDonNotNeededListener;
    }
    
    public void setReentryIntent(final PendingIntent optionalReentryIntent) {
        this.optionalReentryIntent = optionalReentryIntent;
    }
}
