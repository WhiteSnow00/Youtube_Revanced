// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.java.area;

@atlr(b = "androidx.window.java.area.WindowAreaControllerJavaAdapter$addRearDisplayStatusListener$1$1", c = "WindowAreaControllerJavaAdapter.kt", d = "invokeSuspend", e = { 73 })
final class WindowAreaControllerJavaAdapter$addRearDisplayStatusListener$1$1 extends atlv implements atmp
{
    final /* synthetic */ akn $consumer;
    final /* synthetic */ attm $statusFlow;
    int label;
    
    public WindowAreaControllerJavaAdapter$addRearDisplayStatusListener$1$1(final attm $statusFlow, final akn $consumer, final atld atld) {
        this.$statusFlow = $statusFlow;
        this.$consumer = $consumer;
        super(2, atld);
    }
    
    public final atld create(final Object o, final atld atld) {
        return (atld)new WindowAreaControllerJavaAdapter$addRearDisplayStatusListener$1$1(this.$statusFlow, this.$consumer, atld);
    }
    
    public final Object invoke(final atpz atpz, final atld atld) {
        return ((WindowAreaControllerJavaAdapter$addRearDisplayStatusListener$1$1)((atln)this).create(atpz, atld)).invokeSuspend(atjv.a);
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
            final attm $statusFlow = this.$statusFlow;
            final WindowAreaControllerJavaAdapter$addRearDisplayStatusListener$1$1$1 windowAreaControllerJavaAdapter$addRearDisplayStatusListener$1$1$1 = new WindowAreaControllerJavaAdapter$addRearDisplayStatusListener$1$1$1(this.$consumer);
            this.label = 1;
            if ($statusFlow.a((attn)windowAreaControllerJavaAdapter$addRearDisplayStatusListener$1$1$1, (atld)this) == a) {
                return a;
            }
        }
        return atjv.a;
    }
}
