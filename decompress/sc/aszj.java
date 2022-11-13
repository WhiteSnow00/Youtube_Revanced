import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

final class aszj implements ashy, asir
{
    final asif a;
    final Object b;
    asir c;
    long d;
    boolean e;
    
    public aszj(final asif a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.e) {
            atqx.j(t);
            return;
        }
        this.e = true;
        this.a.b(t);
    }
    
    @Override
    public final void d(final asir c) {
        if (asjv.g(this.c, c)) {
            this.c = c;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.c.dispose();
    }
    
    @Override
    public final boolean tA() {
        return this.c.tA();
    }
    
    @Override
    public final void tu(final Object o) {
        if (this.e) {
            return;
        }
        final long d = this.d;
        if (d == 0L) {
            this.e = true;
            this.c.dispose();
            this.a.ts(o);
            return;
        }
        this.d = d + 1L;
    }
    
    @Override
    public final void tx() {
        if (!this.e) {
            this.e = true;
            final Object b = this.b;
            if (b != null) {
                this.a.ts(b);
                return;
            }
            this.a.b(new NoSuchElementException());
        }
    }
}
