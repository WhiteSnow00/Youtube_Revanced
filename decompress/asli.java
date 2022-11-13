// 
// Decompiled by Procyon v0.6.0
// 

public final class asli implements ashd, aukg
{
    final aukf a;
    asir b;
    
    public asli(final aukf a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asir b) {
        if (asjv.g(this.b, b)) {
            this.b = b;
            this.a.f((aukg)this);
        }
    }
    
    public final void e(final long n) {
    }
    
    public final void tt() {
        this.b.dispose();
    }
    
    @Override
    public final void tx() {
        this.a.tx();
    }
}
