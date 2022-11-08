// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.area;

import java.util.function.Consumer;

final class WindowAreaControllerImpl$rearDisplayMode$1$1 extends atni implements atml
{
    final /* synthetic */ WindowAreaControllerImpl this$0;
    
    public WindowAreaControllerImpl$rearDisplayMode$1$1(final WindowAreaControllerImpl this$0) {
        this.this$0 = this$0;
        super(1);
    }
    
    public final void invoke(final int n) {
        Consumer access$getRearDisplaySessionConsumer$p;
        if ((access$getRearDisplaySessionConsumer$p = WindowAreaControllerImpl.access$getRearDisplaySessionConsumer$p(this.this$0)) == null) {
            atnh.b("rearDisplaySessionConsumer");
            access$getRearDisplaySessionConsumer$p = null;
        }
        access$getRearDisplaySessionConsumer$p.accept(n);
    }
}
