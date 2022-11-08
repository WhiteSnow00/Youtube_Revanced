// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.java.area;

import androidx.window.area.WindowAreaStatus;

final class WindowAreaControllerJavaAdapter$addRearDisplayStatusListener$1$1$1 implements attn
{
    final /* synthetic */ akn $consumer;
    
    public WindowAreaControllerJavaAdapter$addRearDisplayStatusListener$1$1$1(final akn $consumer) {
        this.$consumer = $consumer;
    }
    
    public final Object emit(final WindowAreaStatus windowAreaStatus, final atld atld) {
        this.$consumer.accept((Object)windowAreaStatus);
        return atjv.a;
    }
}
