// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.util.Log;
import com.google.vr.vrcore.common.api.HeadTrackingState;
import android.os.Handler;
import java.lang.ref.WeakReference;

final class VrCoreSdkClient$DaydreamListenerImpl extends ardd
{
    private final WeakReference closeVrRunnableWeak;
    private final WeakReference fadeOverlayViewWeak;
    private final WeakReference gvrApiWeak;
    private final Handler safeguardHandler;
    
    static /* bridge */ void -$$Nest$mapplyColorfulFadeImpl(final VrCoreSdkClient$DaydreamListenerImpl vrCoreSdkClient$DaydreamListenerImpl, final int n, final long n2, final int n3) {
        vrCoreSdkClient$DaydreamListenerImpl.applyColorfulFadeImpl(1, 350L, -16777216);
    }
    
    static /* bridge */ void -$$Nest$mresumeHeadTrackingImpl(final VrCoreSdkClient$DaydreamListenerImpl vrCoreSdkClient$DaydreamListenerImpl, final HeadTrackingState headTrackingState) {
        vrCoreSdkClient$DaydreamListenerImpl.resumeHeadTrackingImpl(null);
    }
    
    public VrCoreSdkClient$DaydreamListenerImpl(final GvrApi gvrApi, final FadeOverlayView fadeOverlayView, final Runnable runnable) {
        this.safeguardHandler = new VrCoreSdkClient$DaydreamListenerImpl$1(this);
        this.gvrApiWeak = new WeakReference((T)gvrApi);
        this.fadeOverlayViewWeak = new WeakReference((T)fadeOverlayView);
        this.closeVrRunnableWeak = new WeakReference((T)runnable);
    }
    
    private void applyColorfulFadeImpl(final int n, final long n2, final int n3) {
        final FadeOverlayView fadeOverlayView = (FadeOverlayView)this.fadeOverlayViewWeak.get();
        if (fadeOverlayView == null) {
            return;
        }
        this.cancelSafeguard(2);
        fadeOverlayView.post((Runnable)new VrCoreSdkClient$DaydreamListenerImpl$2(this, fadeOverlayView, n, n2, n3));
        if (n == 2) {
            this.rescheduleSafeguard(2, n2 + 5500L);
        }
    }
    
    private void cancelSafeguard(final int n) {
        this.safeguardHandler.removeMessages(n);
    }
    
    private void rescheduleSafeguard(final int n, final long n2) {
        this.cancelSafeguard(n);
        this.safeguardHandler.sendEmptyMessageDelayed(n, n2);
    }
    
    private void resumeHeadTrackingImpl(final HeadTrackingState headTrackingState) {
        final GvrApi gvrApi = (GvrApi)this.gvrApiWeak.get();
        if (gvrApi == null) {
            Log.w("VrCoreSdkClient", "Invalid resumeHeadTracking() call: GvrApi no longer valid");
            return;
        }
        this.cancelSafeguard(1);
        VrCoreSdkClient.-$$Nest$smresumeTracking(gvrApi, headTrackingState);
    }
    
    public void applyColorfulFade(final int n, final long n2, final int n3) {
        this.applyColorfulFadeImpl(n, n2, n3);
    }
    
    public void applyFade(final int n, final long n2) {
        this.applyColorfulFadeImpl(n, n2, -16777216);
    }
    
    public void deprecated_setLensOffsets(final float n, final float n2, final float n3, final float n4) {
        final GvrApi gvrApi = (GvrApi)this.gvrApiWeak.get();
        if (gvrApi == null) {
            Log.w("VrCoreSdkClient", "Invalid setLensOffsets() call: GvrApi no longer valid");
            return;
        }
        gvrApi.setLensOffset(n, n2, 0.0f);
    }
    
    public void dumpDebugData() {
        final GvrApi gvrApi = (GvrApi)this.gvrApiWeak.get();
        if (gvrApi == null) {
            Log.w("VrCoreSdkClient", "Invalid dumpDebugData() call: GvrApi no longer valid");
            return;
        }
        gvrApi.dumpDebugData();
    }
    
    public void invokeCloseAction() {
        final Runnable runnable = (Runnable)this.closeVrRunnableWeak.get();
        if (runnable == null) {
            Log.w("VrCoreSdkClient", "Invalid invokeCloseAction() call: Runnable no longer valid");
            return;
        }
        arcq.a(runnable);
    }
    
    public void recenterHeadTracking() {
        final GvrApi gvrApi = (GvrApi)this.gvrApiWeak.get();
        if (gvrApi == null) {
            Log.w("VrCoreSdkClient", "Invalid recenterHeadTracking() call: GvrApi no longer valid");
            return;
        }
        gvrApi.recenterTracking();
    }
    
    public HeadTrackingState requestStopTracking() {
        final GvrApi gvrApi = (GvrApi)this.gvrApiWeak.get();
        HeadTrackingState headTrackingState = null;
        if (gvrApi == null) {
            Log.w("VrCoreSdkClient", "Invalid requestStopTracking() call: GvrApi no longer valid");
            return null;
        }
        final byte[] pauseTrackingGetState = gvrApi.pauseTrackingGetState();
        this.rescheduleSafeguard(1, 5000L);
        if (pauseTrackingGetState != null) {
            headTrackingState = new HeadTrackingState(pauseTrackingGetState);
        }
        return headTrackingState;
    }
    
    public void resetSafeguards() {
        this.safeguardHandler.removeCallbacksAndMessages((Object)null);
    }
    
    public void resumeHeadTracking(final HeadTrackingState headTrackingState) {
        this.resumeHeadTrackingImpl(headTrackingState);
    }
    
    public void setLensOffset(final float n, final float n2, final float n3) {
        final GvrApi gvrApi = (GvrApi)this.gvrApiWeak.get();
        if (gvrApi == null) {
            Log.w("VrCoreSdkClient", "Invalid setLensOffset() call: GvrApi no longer valid");
            return;
        }
        gvrApi.setLensOffset(n, n2, n3);
    }
}
