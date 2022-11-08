// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

final class WindowInfoTrackerImpl$windowLayoutInfo$2$2 extends atni implements atma
{
    final /* synthetic */ akn $listener;
    final /* synthetic */ WindowInfoTrackerImpl this$0;
    
    public WindowInfoTrackerImpl$windowLayoutInfo$2$2(final WindowInfoTrackerImpl this$0, final akn $listener) {
        this.this$0 = this$0;
        this.$listener = $listener;
        super(0);
    }
    
    public final void invoke() {
        WindowInfoTrackerImpl.access$getWindowBackend$p(this.this$0).unregisterLayoutChangeCallback(this.$listener);
    }
}
