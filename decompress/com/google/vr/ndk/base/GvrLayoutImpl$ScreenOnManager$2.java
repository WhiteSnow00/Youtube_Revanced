// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.os.SystemClock;

class GvrLayoutImpl$ScreenOnManager$2 implements Runnable
{
    final GvrLayoutImpl$ScreenOnManager this$0;
    final boolean val$newIsIdle;
    
    public GvrLayoutImpl$ScreenOnManager$2(final GvrLayoutImpl$ScreenOnManager this$0, final boolean val$newIsIdle) {
        this.this$0 = this$0;
        this.val$newIsIdle = val$newIsIdle;
    }
    
    @Override
    public void run() {
        try {
            if (SystemClock.elapsedRealtime() - GvrLayoutImpl$ScreenOnManager.-$$Nest$fgetlastResumeTimeMillis(this.this$0) < GvrLayoutImpl$ScreenOnManager.-$$Nest$sfgetQUIET_PERIOD_AFTER_RESUME_MILLIS()) {
                return;
            }
            GvrLayoutImpl$ScreenOnManager.-$$Nest$fgetisIdle(this.this$0);
            GvrLayoutImpl$ScreenOnManager.-$$Nest$fputisIdle(this.this$0, this.val$newIsIdle);
            GvrLayoutImpl$ScreenOnManager.-$$Nest$mupdateSetScreenOn(this.this$0);
        }
        finally {}
    }
}
