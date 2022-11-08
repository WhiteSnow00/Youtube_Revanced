import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public class athg extends AtomicInteger implements aujq
{
    private static final long serialVersionUID = -2189523197179400958L;
    aujq f;
    long g;
    final AtomicReference h;
    final AtomicLong i;
    final AtomicLong j;
    volatile boolean k;
    public boolean l;
    
    public athg() {
        this.h = new AtomicReference();
        this.i = new AtomicLong();
        this.j = new AtomicLong();
    }
    
    public final void e(final long n) {
        if (athh.h(n)) {
            if (this.l) {
                return;
            }
            if (this.get() == 0 && this.compareAndSet(0, 1)) {
                final long g = this.g;
                if (g != Long.MAX_VALUE) {
                    final long k = atnp.k(g, n);
                    this.g = k;
                    if (k == Long.MAX_VALUE) {
                        this.l = true;
                    }
                }
                final aujq f = this.f;
                if (this.decrementAndGet() != 0) {
                    this.h();
                }
                if (f != null) {
                    f.e(n);
                }
                return;
            }
            atnp.i(this.i, n);
            this.g();
        }
    }
    
    final void g() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        this.h();
    }
    
    final void h() {
        int i = 1;
        long n = 0L;
        aujq aujq = null;
        long n4;
        aujq aujq2;
        do {
            aujq f;
            if ((f = this.h.get()) != null) {
                f = this.h.getAndSet(null);
            }
            long n2;
            if ((n2 = this.i.get()) != 0L) {
                n2 = this.i.getAndSet(0L);
            }
            long n3;
            if ((n3 = this.j.get()) != 0L) {
                n3 = this.j.getAndSet(0L);
            }
            final aujq f2 = this.f;
            if (this.k) {
                if (f2 != null) {
                    f2.tq();
                    this.f = null;
                }
                n4 = n;
                aujq2 = aujq;
                if (f != null) {
                    f.tq();
                    n4 = n;
                    aujq2 = aujq;
                }
            }
            else {
                long g;
                final long n5 = g = this.g;
                if (n5 != Long.MAX_VALUE) {
                    long k;
                    final long n6 = k = atnp.k(n5, n2);
                    if (n6 != Long.MAX_VALUE) {
                        final long n7 = k = n6 - n3;
                        if (n7 < 0L) {
                            athh.b(n7);
                            k = 0L;
                        }
                    }
                    this.g = k;
                    g = k;
                }
                if (f != null) {
                    this.f = f;
                    n4 = n;
                    aujq2 = aujq;
                    if (g != 0L) {
                        n4 = atnp.k(n, g);
                        aujq2 = f;
                    }
                }
                else {
                    n4 = n;
                    aujq2 = aujq;
                    if (f2 != null) {
                        n4 = n;
                        aujq2 = aujq;
                        if (n2 != 0L) {
                            n4 = atnp.k(n, n2);
                            aujq2 = f2;
                        }
                    }
                }
            }
            i = this.addAndGet(-i);
            n = n4;
            aujq = aujq2;
        } while (i != 0);
        if (n4 != 0L) {
            aujq2.e(n4);
        }
    }
    
    public final void i(long g) {
        if (this.l) {
            return;
        }
        if (this.get() != 0 || !this.compareAndSet(0, 1)) {
            atnp.i(this.j, g);
            this.g();
            return;
        }
        final long g2 = this.g;
        if (g2 != Long.MAX_VALUE) {
            final long n = g = g2 - g;
            if (n < 0L) {
                athh.b(n);
                g = 0L;
            }
            this.g = g;
        }
        if (this.decrementAndGet() == 0) {
            return;
        }
        this.h();
    }
    
    public final void j(aujq f) {
        if (this.k) {
            f.tq();
            return;
        }
        asjv.b((Object)f, "s is null");
        if (this.get() == 0 && this.compareAndSet(0, 1)) {
            this.f = f;
            final long g = this.g;
            if (this.decrementAndGet() != 0) {
                this.h();
            }
            if (g != 0L) {
                f.e(g);
            }
            return;
        }
        f = this.h.getAndSet(f);
        this.g();
    }
    
    public void tq() {
        if (!this.k) {
            this.k = true;
            this.g();
        }
    }
}
