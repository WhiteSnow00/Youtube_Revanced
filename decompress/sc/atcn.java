// 
// Decompiled by Procyon v0.6.0
// 

final class atcn implements ashy, asir
{
    final ashy a;
    long b;
    asir c;
    
    public atcn(final ashy a) {
        this.a = a;
        this.b = 1L;
    }
    
    @Override
    public final void b(final Throwable t) {
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
        if (this.b != 0L) {
            this.b = 0L;
            return;
        }
        this.a.tu(o);
    }
    
    @Override
    public final void tx() {
        this.a.tx();
    }
}
