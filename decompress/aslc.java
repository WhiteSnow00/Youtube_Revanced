// 
// Decompiled by Procyon v0.6.0
// 

public final class aslc implements ashy, asir
{
    final ashy a;
    final asjm b;
    final asjg c;
    asir d;
    
    public aslc(final ashy a, final asjm b, final asjg c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.d != asjv.a) {
            this.d = (asir)asjv.a;
            this.a.b(t);
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir d) {
        try {
            this.b.a(d);
            if (asjv.g(this.d, d)) {
                this.d = d;
                this.a.d(this);
            }
        }
        finally {
            final Throwable t;
            asgz.c(t);
            d.dispose();
            this.d = (asir)asjv.a;
            asjw.g(t, this.a);
        }
    }
    
    @Override
    public final void dispose() {
        final asir d = this.d;
        if (d != asjv.a) {
            this.d = (asir)asjv.a;
            try {
                this.c.a();
            }
            finally {
                final Throwable t;
                asgz.c(t);
                atqx.j(t);
            }
            d.dispose();
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
        if (this.d != asjv.a) {
            this.d = (asir)asjv.a;
            this.a.tx();
        }
    }
}
