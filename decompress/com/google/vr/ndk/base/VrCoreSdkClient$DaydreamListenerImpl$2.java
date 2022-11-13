// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

class VrCoreSdkClient$DaydreamListenerImpl$2 implements Runnable
{
    final int val$color;
    final long val$durationMillis;
    final FadeOverlayView val$fadeOverlayView;
    final int val$fadeType;
    
    public VrCoreSdkClient$DaydreamListenerImpl$2(final VrCoreSdkClient$DaydreamListenerImpl vrCoreSdkClient$DaydreamListenerImpl, final FadeOverlayView val$fadeOverlayView, final int val$fadeType, final long val$durationMillis, final int val$color) {
        this.val$fadeOverlayView = val$fadeOverlayView;
        this.val$fadeType = val$fadeType;
        this.val$durationMillis = val$durationMillis;
        this.val$color = val$color;
    }
    
    @Override
    public void run() {
        this.val$fadeOverlayView.startFade(this.val$fadeType, this.val$durationMillis, this.val$color);
    }
}
