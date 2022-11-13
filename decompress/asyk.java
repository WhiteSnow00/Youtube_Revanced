import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asyk extends AtomicReference implements ashy
{
    private static final long serialVersionUID = 2620149119579502636L;
    final ashy a;
    final asyl b;
    
    public asyk(final ashy a, final asyl b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        final asyl b = this.b;
        if (atih.e((AtomicReference)b.c, t)) {
            final boolean e = b.e;
            b.g.dispose();
            b.h = false;
            b.f();
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.h((AtomicReference)this, asir);
    }
    
    @Override
    public final void tu(final Object o) {
        this.a.tu(o);
    }
    
    @Override
    public final void tx() {
        final asyl b = this.b;
        b.h = false;
        b.f();
    }
}
