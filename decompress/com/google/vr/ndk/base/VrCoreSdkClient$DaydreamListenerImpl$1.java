// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import com.google.vr.vrcore.common.api.HeadTrackingState;
import android.util.Log;
import android.os.Message;
import android.os.Handler;

class VrCoreSdkClient$DaydreamListenerImpl$1 extends Handler
{
    final VrCoreSdkClient$DaydreamListenerImpl this$0;
    
    public VrCoreSdkClient$DaydreamListenerImpl$1(final VrCoreSdkClient$DaydreamListenerImpl this$0) {
        this.this$0 = this$0;
    }
    
    public void handleMessage(final Message message) {
        final int what = message.what;
        if (what == 1) {
            Log.w("VrCoreSdkClient", "Forcing tracking resume: VrCore unresponsive");
            VrCoreSdkClient$DaydreamListenerImpl.-$$Nest$mresumeHeadTrackingImpl(this.this$0, (HeadTrackingState)null);
            return;
        }
        if (what != 2) {
            super.handleMessage(message);
            return;
        }
        Log.w("VrCoreSdkClient", "Forcing fade in: VrCore unresponsive");
        VrCoreSdkClient$DaydreamListenerImpl.-$$Nest$mapplyColorfulFadeImpl(this.this$0, 1, 350L, -16777216);
    }
}
