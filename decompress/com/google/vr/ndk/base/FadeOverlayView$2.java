// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.os.Message;
import android.os.Looper;
import android.os.Handler;

class FadeOverlayView$2 extends Handler
{
    final /* synthetic */ FadeOverlayView this$0;
    
    public FadeOverlayView$2(final FadeOverlayView this$0, final Looper looper) {
        this.this$0 = this$0;
        super(looper);
    }
    
    public void handleMessage(final Message message) {
        if (message.what == 77337733) {
            this.this$0.startFade(1, 350L, -16777216);
            return;
        }
        super.handleMessage(message);
    }
}
