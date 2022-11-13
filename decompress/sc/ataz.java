// 
// Decompiled by Procyon v0.6.0
// 

final class ataz implements ashy, asir
{
    final asif a;
    final Object b;
    asir c;
    Object d;
    
    public ataz(final asif a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.c = asjv.a;
        this.d = null;
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
        this.c = asjv.a;
    }
    
    @Override
    public final boolean tA() {
        return this.c == asjv.a;
    }
    
    @Override
    public final void tu(final Object d) {
        this.d = d;
    }
    
    @Override
    public final void tx() {
        this.c = asjv.a;
        final Object d = this.d;
        if (d != null) {
            this.d = null;
            this.a.ts(d);
            return;
        }
        this.a.ts(this.b);
    }
}
