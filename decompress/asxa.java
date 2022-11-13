import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxa extends AtomicReference implements asif
{
    private static final long serialVersionUID = 8042919737683345351L;
    final asxb a;
    volatile Object b;
    
    public asxa(final asxb a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final asxb a = this.a;
        if (aqsz.y(a.f, this, null) && atih.e((AtomicReference)a.d, t)) {
            a.g.tt();
            a.d();
            a.g();
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f((AtomicReference)this, asir);
    }
    
    @Override
    public final void ts(final Object b) {
        this.b = b;
        this.a.g();
    }
}
