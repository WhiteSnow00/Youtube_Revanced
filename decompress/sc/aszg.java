import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

final class aszg implements ashy, asir
{
    final ashy a;
    final Object b;
    final boolean c;
    asir d;
    long e;
    boolean f;
    
    public aszg(final ashy a, final Object b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.f) {
            atqx.j(t);
            return;
        }
        this.f = true;
        this.a.b(t);
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
    }
    
    @Override
    public final boolean tA() {
        return this.d.tA();
    }
    
    @Override
    public final void tu(final Object o) {
        if (this.f) {
            return;
        }
        final long e = this.e;
        if (e == 0L) {
            this.f = true;
            this.d.dispose();
            this.a.tu(o);
            this.a.tx();
            return;
        }
        this.e = e + 1L;
    }
    
    @Override
    public final void tx() {
        if (!this.f) {
            this.f = true;
            final Object b = this.b;
            if (b == null && this.c) {
                this.a.b(new NoSuchElementException());
                return;
            }
            if (b != null) {
                this.a.tu(b);
            }
            this.a.tx();
        }
    }
}
