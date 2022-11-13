import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asyh extends AtomicReference implements ashy
{
    private static final long serialVersionUID = -4823716997131257941L;
    final asyi a;
    final int b;
    
    public asyh(final asyi a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        final asyi a = this.a;
        if (atih.e((AtomicReference)a.h, t)) {
            a.a();
            a.c();
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f((AtomicReference)this, asir);
    }
    
    @Override
    public final void tu(final Object o) {
        this.a.d(this.b, o);
    }
    
    @Override
    public final void tx() {
        final asyi a = this.a;
        final int b = this.b;
        synchronized (a) {
            final Object[] d = a.d;
            if (d == null) {
                return;
            }
            final boolean b2 = d[b] == null;
            if (b2 || ++a.j == d.length) {
                a.g = true;
            }
            monitorexit(a);
            if (b2) {
                a.a();
            }
            a.c();
        }
    }
}
