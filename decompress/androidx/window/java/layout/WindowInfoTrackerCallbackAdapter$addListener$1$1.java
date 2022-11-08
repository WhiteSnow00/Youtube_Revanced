// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.java.layout;

@atlr(b = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", c = "WindowInfoTrackerCallbackAdapter.kt", d = "invokeSuspend", e = { 78 })
final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends atlv implements atmp
{
    final /* synthetic */ akn $consumer;
    final /* synthetic */ attm $flow;
    int label;
    
    public WindowInfoTrackerCallbackAdapter$addListener$1$1(final attm $flow, final akn $consumer, final atld atld) {
        this.$flow = $flow;
        this.$consumer = $consumer;
        super(2, atld);
    }
    
    public final atld create(final Object o, final atld atld) {
        return (atld)new WindowInfoTrackerCallbackAdapter$addListener$1$1(this.$flow, this.$consumer, atld);
    }
    
    public final Object invoke(final atpz atpz, final atld atld) {
        return ((WindowInfoTrackerCallbackAdapter$addListener$1$1)((atln)this).create(atpz, atld)).invokeSuspend(atjv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final atlk a = atlk.a;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arxj.h(o);
        }
        else {
            arxj.h(o);
            final attm $flow = this.$flow;
            final WindowInfoTrackerCallbackAdapter$addListener$1$1$1 windowInfoTrackerCallbackAdapter$addListener$1$1$1 = new WindowInfoTrackerCallbackAdapter$addListener$1$1$1(this.$consumer);
            this.label = 1;
            if ($flow.a((attn)windowInfoTrackerCallbackAdapter$addListener$1$1$1, (atld)this) == a) {
                return a;
            }
        }
        return atjv.a;
    }
}
