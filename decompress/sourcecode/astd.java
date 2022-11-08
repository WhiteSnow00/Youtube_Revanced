import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class astd extends AtomicInteger implements Runnable, asgw, aujq
{
    private static final long serialVersionUID = -8296689127439125014L;
    final aujp a;
    final long b;
    final TimeUnit c;
    final ashn d;
    final boolean e;
    final AtomicReference f;
    final AtomicLong g;
    aujq h;
    volatile boolean i;
    Throwable j;
    volatile boolean k;
    volatile boolean l;
    long m;
    boolean n;
    
    public astd(final aujp a, final long b, final TimeUnit c, final ashn d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new AtomicReference();
        this.g = new AtomicLong();
    }
    
    public final void b(final Throwable j) {
        this.j = j;
        this.i = true;
        this.d();
    }
    
    final void d() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final AtomicReference f = this.f;
        final AtomicLong g = this.g;
        final aujp a = this.a;
        int addAndGet = 1;
        while (!this.k) {
            final boolean i = this.i;
            if (i && this.j != null) {
                f.lazySet(null);
                a.b(this.j);
                this.d.dispose();
                return;
            }
            final Object value = f.get();
            if (i) {
                if (value != null && this.e) {
                    final Object andSet = f.getAndSet(null);
                    final long m = this.m;
                    if (m != g.get()) {
                        this.m = m + 1L;
                        a.tr(andSet);
                        a.tu();
                    }
                    else {
                        a.b((Throwable)new asil("Could not emit final value due to lack of requests"));
                    }
                }
                else {
                    f.lazySet(null);
                    a.tu();
                }
                this.d.dispose();
                return;
            }
            if (value == null) {
                if (this.l) {
                    this.n = false;
                    this.l = false;
                }
            }
            else if (!this.n || this.l) {
                final Object andSet2 = f.getAndSet(null);
                final long j = this.m;
                if (j != g.get()) {
                    a.tr(andSet2);
                    this.m = j + 1L;
                    this.l = false;
                    this.n = true;
                    this.d.b((Runnable)this, this.b, this.c);
                    continue;
                }
                this.h.tq();
                a.b((Throwable)new asil("Could not emit value due to lack of requests"));
                this.d.dispose();
                return;
            }
            if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                return;
            }
        }
        f.lazySet(null);
    }
    
    public final void e(final long n) {
        if (athh.h(n)) {
            atnp.i(this.g, n);
        }
    }
    
    public final void f(final aujq h) {
        if (athh.i(this.h, h)) {
            this.h = h;
            this.a.f((aujq)this);
            h.e(Long.MAX_VALUE);
        }
    }
    
    @Override
    public final void run() {
        this.l = true;
        this.d();
    }
    
    public final void tq() {
        this.k = true;
        this.h.tq();
        this.d.dispose();
        if (this.getAndIncrement() == 0) {
            this.f.lazySet(null);
        }
    }
    
    public final void tr(final Object o) {
        this.f.set(o);
        this.d();
    }
    
    public final void tu() {
        this.i = true;
        this.d();
    }
}
