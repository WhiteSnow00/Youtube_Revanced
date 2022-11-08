// 
// Decompiled by Procyon v0.6.0
// 

final class assl implements asgw, aujq
{
    final aujp a;
    long b;
    aujq c;
    
    public assl(final aujp a) {
        this.a = a;
        this.b = 1L;
    }
    
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    public final void e(final long n) {
        this.c.e(n);
    }
    
    public final void f(final aujq c) {
        if (athh.i(this.c, c)) {
            final long b = this.b;
            this.c = c;
            this.a.f((aujq)this);
            c.e(b);
        }
    }
    
    public final void tq() {
        this.c.tq();
    }
    
    public final void tr(final Object o) {
        if (this.b != 0L) {
            this.b = 0L;
            return;
        }
        this.a.tr(o);
    }
    
    public final void tu() {
        this.a.tu();
    }
}
