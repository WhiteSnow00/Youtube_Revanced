import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public class athy extends AtomicInteger implements aukg
{
    private static final long serialVersionUID = -2189523197179400958L;
    aukg f;
    long g;
    final AtomicReference h;
    final AtomicLong i;
    final AtomicLong j;
    volatile boolean k;
    public boolean l;
    
    public athy() {
        this.h = new AtomicReference();
        this.i = new AtomicLong();
        this.j = new AtomicLong();
    }
    
    public final void e(final long n) {
        if (athz.h(n)) {
            if (this.l) {
                return;
            }
            if (this.get() == 0 && this.compareAndSet(0, 1)) {
                final long g = this.g;
                if (g != Long.MAX_VALUE) {
                    final long y = asfn.y(g, n);
                    this.g = y;
                    if (y == Long.MAX_VALUE) {
                        this.l = true;
                    }
                }
                final aukg f = this.f;
                if (this.decrementAndGet() != 0) {
                    this.h();
                }
                if (f != null) {
                    f.e(n);
                }
                return;
            }
            asfn.w(this.i, n);
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
        aukg aukg = null;
        long n = 0L;
        long n4;
        aukg aukg2;
        do {
            aukg f;
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
            final aukg f2 = this.f;
            if (this.k) {
                if (f2 != null) {
                    f2.tt();
                    this.f = null;
                }
                n4 = n;
                aukg2 = aukg;
                if (f != null) {
                    f.tt();
                    n4 = n;
                    aukg2 = aukg;
                }
            }
            else {
                long g;
                final long n5 = g = this.g;
                if (n5 != Long.MAX_VALUE) {
                    long y;
                    final long n6 = y = asfn.y(n5, n2);
                    if (n6 != Long.MAX_VALUE) {
                        final long n7 = y = n6 - n3;
                        if (n7 < 0L) {
                            athz.b(n7);
                            y = 0L;
                        }
                    }
                    this.g = y;
                    g = y;
                }
                if (f != null) {
                    this.f = f;
                    n4 = n;
                    aukg2 = aukg;
                    if (g != 0L) {
                        n4 = asfn.y(n, g);
                        aukg2 = f;
                    }
                }
                else {
                    n4 = n;
                    aukg2 = aukg;
                    if (f2 != null) {
                        n4 = n;
                        aukg2 = aukg;
                        if (n2 != 0L) {
                            n4 = asfn.y(n, n2);
                            aukg2 = f2;
                        }
                    }
                }
            }
            i = this.addAndGet(-i);
            n = n4;
            aukg = aukg2;
        } while (i != 0);
        if (n4 != 0L) {
            aukg2.e(n4);
        }
    }
    
    public final void i(long g) {
        if (this.l) {
            return;
        }
        if (this.get() != 0 || !this.compareAndSet(0, 1)) {
            asfn.w(this.j, g);
            this.g();
            return;
        }
        final long g2 = this.g;
        if (g2 != Long.MAX_VALUE) {
            final long n = g = g2 - g;
            if (n < 0L) {
                athz.b(n);
                g = 0L;
            }
            this.g = g;
        }
        if (this.decrementAndGet() == 0) {
            return;
        }
        this.h();
    }
    
    public final void j(aukg f) {
        if (this.k) {
            f.tt();
            return;
        }
        askk.b((Object)f, "s is null");
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
    
    public void tt() {
        if (!this.k) {
            this.k = true;
            this.g();
        }
    }
}
