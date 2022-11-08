// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

class CardboardViewNativeImpl$7 implements Runnable
{
    final /* synthetic */ CardboardViewNativeImpl this$0;
    final /* synthetic */ ScreenParams val$screenParams;
    
    public CardboardViewNativeImpl$7(final CardboardViewNativeImpl this$0, final ScreenParams val$screenParams) {
        this.this$0 = this$0;
        this.val$screenParams = val$screenParams;
    }
    
    @Override
    public void run() {
        CardboardViewNativeImpl.-$$Nest$fgetrendererHelper(this.this$0).setScreenParams(this.val$screenParams);
        final CardboardViewNativeImpl this$0 = this.this$0;
        CardboardViewNativeImpl.-$$Nest$mnativeSetScreenParams(this$0, CardboardViewNativeImpl.-$$Nest$fgetnativeCardboardView(this$0), this.val$screenParams.getWidth(), this.val$screenParams.getHeight(), this.val$screenParams.getWidthMeters() / this.val$screenParams.getWidth(), this.val$screenParams.getHeightMeters() / this.val$screenParams.getHeight(), this.val$screenParams.getBorderSizeMeters());
    }
}
