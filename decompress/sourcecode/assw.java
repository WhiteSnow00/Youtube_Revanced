import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class assw extends AtomicBoolean implements asgw, aujq
{
    private static final long serialVersionUID = -5636543848937116287L;
    final aujp a;
    final long b;
    boolean c;
    aujq d;
    long e;
    
    public assw(final aujp a) {
        this.a = a;
        this.b = 1L;
        this.e = 1L;
    }
    
    public final void b(final Throwable t) {
        if (!this.c) {
            this.c = true;
            this.d.tq();
            this.a.b(t);
            return;
        }
        aulo.r(t);
    }
    
    public final void e(final long n) {
        if (!athh.h(n)) {
            return;
        }
        if (!this.get() && this.compareAndSet(false, true) && n >= this.b) {
            this.d.e(Long.MAX_VALUE);
            return;
        }
        this.d.e(n);
    }
    
    public final void f(final aujq d) {
        if (athh.i(this.d, d)) {
            this.d = d;
            if (this.b == 0L) {
                d.tq();
                this.c = true;
                athe.d(this.a);
                return;
            }
            this.a.f((aujq)this);
        }
    }
    
    public final void tq() {
        this.d.tq();
    }
    
    public final void tr(final Object o) {
        if (!this.c) {
            final long e = this.e;
            final long e2 = -1L + e;
            this.e = e2;
            if (e > 0L) {
                this.a.tr(o);
                if (e2 == 0L) {
                    this.d.tq();
                    this.tu();
                }
            }
        }
    }
    
    public final void tu() {
        if (!this.c) {
            this.c = true;
            this.a.tu();
        }
    }
}
