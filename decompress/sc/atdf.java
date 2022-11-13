import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class atdf implements ashy, asir
{
    final ashy a;
    final TimeUnit b;
    long c;
    asir d;
    
    public atdf(final ashy a, final TimeUnit b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asir d) {
        if (asjv.g(this.d, d)) {
            this.d = d;
            this.c = asid.e(this.b);
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
        final long e = asid.e(this.b);
        final long c = this.c;
        this.c = e;
        this.a.tu(new atjk(o, e - c, this.b));
    }
    
    @Override
    public final void tx() {
        this.a.tx();
    }
}
