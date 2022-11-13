// 
// Decompiled by Procyon v0.6.0
// 

final class atcz implements ashy, asir
{
    final ashy a;
    final asjs b;
    asir c;
    boolean d;
    
    public atcz(final ashy a, final asjs b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (!this.d) {
            this.d = true;
            this.a.b(t);
            return;
        }
        atqx.j(t);
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
        if (!this.d) {
            this.a.tu(o);
            try {
                if (this.b.a(o)) {
                    this.d = true;
                    this.c.dispose();
                    this.a.tx();
                }
            }
            finally {
                final Throwable t;
                asgz.c(t);
                this.c.dispose();
                this.b(t);
            }
        }
    }
    
    @Override
    public final void tx() {
        if (!this.d) {
            this.d = true;
            this.a.tx();
        }
    }
}
