// 
// Decompiled by Procyon v0.6.0
// 

final class asqg implements ashy, aukg
{
    final aukf a;
    asir b;
    
    public asqg(final aukf a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asir b) {
        this.b = b;
        this.a.f((aukg)this);
    }
    
    public final void e(final long n) {
    }
    
    public final void tt() {
        this.b.dispose();
    }
    
    @Override
    public final void tu(final Object o) {
        this.a.tu(o);
    }
    
    @Override
    public final void tx() {
        this.a.tx();
    }
}
