// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.java.layout;

final class WindowInfoTrackerCallbackAdapter$addListener$1$1$1 implements attn
{
    final /* synthetic */ akn $consumer;
    
    public WindowInfoTrackerCallbackAdapter$addListener$1$1$1(final akn $consumer) {
        this.$consumer = $consumer;
    }
    
    public final Object emit(final Object o, final atld atld) {
        this.$consumer.accept(o);
        return atjv.a;
    }
}
