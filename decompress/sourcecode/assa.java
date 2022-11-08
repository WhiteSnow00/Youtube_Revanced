import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class assa extends AtomicReference implements Runnable, asgw, aujq
{
    private static final long serialVersionUID = -3517602651313910099L;
    final aujp a;
    final long b;
    final TimeUnit c;
    final asho d;
    final AtomicLong e;
    final asjk f;
    aujq g;
    
    public assa(final aujp a, final long b, final TimeUnit c, final asho d) {
        this.e = new AtomicLong();
        this.f = new asjk();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void b(final Throwable t) {
        this.g();
        this.a.b(t);
    }
    
    public abstract void d();
    
    public final void e(final long n) {
        if (athh.h(n)) {
            atnp.i(this.e, n);
        }
    }
    
    public final void f(final aujq g) {
        if (athh.i(this.g, g)) {
            this.g = g;
            this.a.f((aujq)this);
            final asjk f = this.f;
            final asho d = this.d;
            final long b = this.b;
            asjg.h(f, d.d((Runnable)this, b, b, this.c));
            g.e(Long.MAX_VALUE);
        }
    }
    
    final void g() {
        asjg.b(this.f);
    }
    
    public final void tq() {
        this.g();
        this.g.tq();
    }
    
    public final void tr(final Object o) {
        this.lazySet(o);
    }
    
    public final void tu() {
        this.g();
        this.d();
    }
}
