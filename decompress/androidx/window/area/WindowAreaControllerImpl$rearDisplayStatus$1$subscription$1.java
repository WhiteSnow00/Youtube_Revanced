// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.area;

import java.util.function.Consumer;

final class WindowAreaControllerImpl$rearDisplayStatus$1$subscription$1 extends atni implements atml
{
    final /* synthetic */ Consumer $listener;
    
    public WindowAreaControllerImpl$rearDisplayStatus$1$subscription$1(final Consumer $listener) {
        this.$listener = $listener;
        super(1);
    }
    
    public final void invoke(final int n) {
        this.$listener.accept(n);
    }
}
