import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class astf implements asgw, aujq
{
    final aujp a;
    final TimeUnit b;
    aujq c;
    long d;
    
    public astf(final aujp a, final TimeUnit b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    public final void e(final long n) {
        this.c.e(n);
    }
    
    public final void f(final aujq c) {
        if (athh.i(this.c, c)) {
            this.d = asho.e(this.b);
            this.c = c;
            this.a.f((aujq)this);
        }
    }
    
    public final void tq() {
        this.c.tq();
    }
    
    public final void tr(final Object o) {
        final long e = asho.e(this.b);
        final long d = this.d;
        this.d = e;
        this.a.tr((Object)new atip(o, e - d, this.b));
    }
    
    public final void tu() {
        this.a.tu();
    }
}
