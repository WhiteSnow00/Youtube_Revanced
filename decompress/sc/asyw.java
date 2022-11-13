import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asyw implements ashy, asir
{
    public final ashy a;
    final long b;
    final TimeUnit c;
    public final asic d;
    asir e;
    
    public asyw(final ashy a, final long b, final TimeUnit c, final asic d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.d.b((Runnable)new xoo(this, t, 5), 0L, this.c);
    }
    
    @Override
    public final void d(final asir e) {
        if (asjv.g(this.e, e)) {
            this.e = e;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.e.dispose();
        this.d.dispose();
    }
    
    @Override
    public final boolean tA() {
        return this.d.tA();
    }
    
    @Override
    public final void tu(final Object o) {
        this.d.b((Runnable)new xoo(this, o, 6), this.b, this.c);
    }
    
    @Override
    public final void tx() {
        this.d.b(new ased(this, 11), this.b, this.c);
    }
}
