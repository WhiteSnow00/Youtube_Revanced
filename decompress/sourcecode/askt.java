// 
// Decompiled by Procyon v0.6.0
// 

public final class askt implements asgo, aujq
{
    final aujp a;
    asic b;
    
    public askt(final aujp a) {
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    public final void d(final asic b) {
        if (asjg.g(this.b, b)) {
            this.b = b;
            this.a.f((aujq)this);
        }
    }
    
    public final void e(final long n) {
    }
    
    public final void tq() {
        this.b.dispose();
    }
    
    public final void tu() {
        this.a.tu();
    }
}
