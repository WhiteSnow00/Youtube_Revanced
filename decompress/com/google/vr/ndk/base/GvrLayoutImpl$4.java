// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

class GvrLayoutImpl$4 implements Runnable
{
    final /* synthetic */ GvrLayoutImpl this$0;
    
    public GvrLayoutImpl$4(final GvrLayoutImpl this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void run() {
        GvrLayoutImpl.-$$Nest$fgetuiLayout(this.this$0).invokeCloseButtonListener();
    }
}
