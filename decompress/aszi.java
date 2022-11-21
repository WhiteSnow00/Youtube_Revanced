import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aszi extends AtomicReference implements askk
{
    private static final long serialVersionUID = 8663801314800248617L;
    final aszh a;
    
    public aszi(final aszh a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final aszh a = this.a;
        if (asmr.b(a)) {
            a.a.b(t);
            return;
        }
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this, asln);
    }
    
    @Override
    public final void tr(final Object o) {
        this.a.c();
    }
    
    @Override
    public final void tw() {
        this.a.c();
    }
}
