import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aszw extends AtomicReference implements aslb
{
    private static final long serialVersionUID = 8042919737683345351L;
    final aszx a;
    volatile Object b;
    
    public aszw(final aszx a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final aszx a = this.a;
        if (areq.J(a.f, this, null) && atle.e(a.d, t)) {
            a.g.ts();
            a.d();
            a.g();
            return;
        }
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this, asln);
    }
    
    @Override
    public final void tr(final Object b) {
        this.b = b;
        this.a.g();
    }
}
