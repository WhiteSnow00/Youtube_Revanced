import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class atbu extends AtomicBoolean implements ashy, asir
{
    private static final long serialVersionUID = -7419642935409022375L;
    final ashy a;
    final atbv b;
    final atbt c;
    asir d;
    
    public atbu(final ashy a, final atbv b, final atbt c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.compareAndSet(false, true)) {
            this.b.b(this.c);
            this.a.b(t);
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir d) {
        if (asjv.g(this.d, d)) {
            this.d = d;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.d.dispose();
        if (this.compareAndSet(false, true)) {
            final atbv b = this.b;
            final atbt c = this.c;
            synchronized (b) {
                final atbt b2 = b.b;
                if (b2 == null || b2 != c) {
                    return;
                }
                final long c2 = c.c - 1L;
                c.c = c2;
                if (c2 == 0L && c.d) {
                    b.c(c);
                }
            }
        }
    }
    
    @Override
    public final boolean tA() {
        return this.d.tA();
    }
    
    @Override
    public final void tu(final Object o) {
        this.a.tu(o);
    }
    
    @Override
    public final void tx() {
        if (this.compareAndSet(false, true)) {
            this.b.b(this.c);
            this.a.tx();
        }
    }
}
