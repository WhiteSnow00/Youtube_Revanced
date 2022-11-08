// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.view.MotionEvent;
import android.view.View;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.vrcore.logging.api.VREventParcelable;
import android.content.Context;
import com.google.vr.sdk.proto.Display$DisplayParams;
import android.util.DisplayMetrics;
import android.view.View$OnTouchListener;

class SdkDaydreamTouchListener extends AbstractDaydreamTouchListener implements View$OnTouchListener
{
    private final GvrApi gvrApi;
    private final GvrLayoutImpl gvrLayout;
    private final boolean isDaydreamImageAlignmentEnabled;
    private final aral vrParamsProvider;
    
    public SdkDaydreamTouchListener(final GvrLayoutImpl gvrLayout) {
        this.gvrLayout = gvrLayout;
        final GvrApi gvrApi = gvrLayout.getGvrApi();
        this.gvrApi = gvrApi;
        afoo afoo;
        if ((afoo = afoo.a(gvrApi.getSdkConfigurationParams().daydreamImageAlignment_)) == null) {
            afoo = afoo.UNKNOWN_ALIGNMENT;
        }
        this.isDaydreamImageAlignmentEnabled = (afoo != afoo.DISABLED && !gvrApi.getSdkConfigurationParams().touchOverlayEnabled_);
        final Context context = gvrLayout.getContext();
        this.vrParamsProvider = aqql.o(context);
        final SdkDaydreamTouchListener$FinishInitializationTask sdkDaydreamTouchListener$FinishInitializationTask = new SdkDaydreamTouchListener$FinishInitializationTask(this, null);
        sdkDaydreamTouchListener$FinishInitializationTask.display = aqzg.r(context);
        sdkDaydreamTouchListener$FinishInitializationTask.execute((Object[])new Void[0]);
    }
    
    private void init(final DisplayMetrics displayMetrics, final Display$DisplayParams display$DisplayParams, final aqzf aqzf) {
        this.initWithDisplayParams(displayMetrics, display$DisplayParams, aqzf);
        this.refreshViewerProfile();
    }
    
    @Override
    protected boolean isDaydreamImageAlignmentEnabled() {
        return this.isDaydreamImageAlignmentEnabled;
    }
    
    @Override
    protected void logEvent(final afoj afoj, final afoi afoi) {
        if (this.gvrLayout.getVrCoreSdkClient() != null && this.gvrLayout.getVrCoreSdkClient().getLoggingService() != null) {
            final VREventParcelable vrEventParcelable = new VREventParcelable(afoj.Z, afoi);
            try {
                this.gvrLayout.getVrCoreSdkClient().getLoggingService().a(vrEventParcelable);
                return;
            }
            catch (final RemoteException ex) {
                Log.w("SdkDaydreamTouchListener", "Unable to log alignment event");
                return;
            }
        }
        Log.w("SdkDaydreamTouchListener", "Unable to log alignment event; logging service not available.");
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        return this.handleTouch(motionEvent, 0.0f, 0.0f);
    }
    
    public void refreshViewerProfile() {
        new SdkDaydreamTouchListener$RefreshViewerProfileTask(this, null).execute((Object[])new Void[0]);
    }
    
    @Override
    protected void setLensOffset(final float n, final float n2, final float n3) {
        this.gvrApi.setLensOffset(n, n2, 0.0f);
    }
    
    public void shutdown() {
        this.vrParamsProvider.f();
    }
}
