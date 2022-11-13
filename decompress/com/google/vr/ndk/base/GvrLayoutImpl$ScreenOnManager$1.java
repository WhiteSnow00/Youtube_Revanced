// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

class GvrLayoutImpl$ScreenOnManager$1 implements Runnable
{
    final GvrLayoutImpl$ScreenOnManager this$0;
    final boolean val$newIsEnabled;
    
    public GvrLayoutImpl$ScreenOnManager$1(final GvrLayoutImpl$ScreenOnManager this$0, final boolean val$newIsEnabled) {
        this.this$0 = this$0;
        this.val$newIsEnabled = val$newIsEnabled;
    }
    
    @Override
    public void run() {
        final boolean -$$Nest$fgetisEnabled = GvrLayoutImpl$ScreenOnManager.-$$Nest$fgetisEnabled(this.this$0);
        final boolean val$newIsEnabled = this.val$newIsEnabled;
        if (-$$Nest$fgetisEnabled == val$newIsEnabled) {
            return;
        }
        GvrLayoutImpl$ScreenOnManager.-$$Nest$fputisEnabled(this.this$0, val$newIsEnabled);
        GvrLayoutImpl$ScreenOnManager.-$$Nest$mupdateSetScreenOn(this.this$0);
    }
}
