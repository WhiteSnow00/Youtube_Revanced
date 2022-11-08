// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

class GvrLayoutImpl$2 implements Runnable
{
    final /* synthetic */ GvrLayoutImpl this$0;
    
    public GvrLayoutImpl$2(final GvrLayoutImpl this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void run() {
        if (GvrLayoutImpl.-$$Nest$fgetvrCoreSdkClient(this.this$0) != null) {
            GvrLayoutImpl.-$$Nest$fgetvrCoreSdkClient(this.this$0).onExitingFromVr();
        }
    }
}
