// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

class CardboardViewNativeImpl$6 implements Runnable
{
    final CardboardViewNativeImpl this$0;
    final GvrViewerParams val$newParams;
    
    public CardboardViewNativeImpl$6(final CardboardViewNativeImpl this$0, final GvrViewerParams val$newParams) {
        this.this$0 = this$0;
        this.val$newParams = val$newParams;
    }
    
    @Override
    public void run() {
        final CardboardViewNativeImpl this$0 = this.this$0;
        CardboardViewNativeImpl.-$$Nest$mnativeSetGvrViewerParams(this$0, CardboardViewNativeImpl.-$$Nest$fgetnativeCardboardView(this$0), this.val$newParams.toByteArray());
    }
}
