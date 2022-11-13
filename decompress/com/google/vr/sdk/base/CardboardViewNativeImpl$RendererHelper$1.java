// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

class CardboardViewNativeImpl$RendererHelper$1 implements Runnable
{
    final CardboardViewNativeImpl$RendererHelper this$1;
    
    public CardboardViewNativeImpl$RendererHelper$1(final CardboardViewNativeImpl$RendererHelper this$1) {
        this.this$1 = this$1;
    }
    
    @Override
    public void run() {
        if ((CardboardViewNativeImpl$RendererHelper.-$$Nest$fgetrenderer(this.this$1) != null || CardboardViewNativeImpl$RendererHelper.-$$Nest$fgetstereoRenderer(this.this$1) != null) && CardboardViewNativeImpl$RendererHelper.-$$Nest$fgetsurfaceCreated(this.this$1)) {
            CardboardViewNativeImpl$RendererHelper.-$$Nest$fputsurfaceCreated(this.this$1, false);
            CardboardViewNativeImpl$RendererHelper.-$$Nest$mcallOnRendererShutdown(this.this$1);
        }
        CardboardViewNativeImpl.-$$Nest$fgetshutdownLatch(this.this$1.this$0).countDown();
    }
}
