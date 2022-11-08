import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class assf extends AtomicInteger implements asgw, aujq
{
    private static final long serialVersionUID = -1776795561228106469L;
    final aujp a;
    final asit b;
    final askd c;
    final AtomicLong d;
    final int e;
    final int f;
    volatile boolean g;
    volatile boolean h;
    Throwable i;
    aujq j;
    Object k;
    int l;
    
    public assf(final aujp a, final asit b, final Object k, final int e) {
        this.a = a;
        this.b = b;
        this.k = k;
        this.e = e;
        this.f = e - (e >> 2);
        (this.c = (askd)new atfo(e)).j(k);
        this.d = new AtomicLong();
    }
    
    public final void b(final Throwable i) {
        if (this.h) {
            aulo.r(i);
            return;
        }
        this.i = i;
        this.h = true;
        this.d();
    }
    
    final void d() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final aujp a = this.a;
        final askd c = this.c;
        final int f = this.f;
        int l = this.l;
        int addAndGet = 1;
        do {
            final long value = this.d.get();
            long n = 0L;
            while (n != value) {
                if (this.g) {
                    c.c();
                    return;
                }
                final boolean h = this.h;
                if (h) {
                    final Throwable i = this.i;
                    if (i != null) {
                        c.c();
                        a.b(i);
                        return;
                    }
                }
                final Object tt = c.tt();
                if (h) {
                    if (tt == null) {
                        a.tu();
                        return;
                    }
                }
                else if (tt == null) {
                    break;
                }
                a.tr(tt);
                final long n2 = n + 1L;
                final int n3 = ++l;
                n = n2;
                if (n3 != f) {
                    continue;
                }
                this.j.e((long)f);
                l = 0;
                n = n2;
            }
            if (n == value && this.h) {
                final Throwable j = this.i;
                if (j != null) {
                    c.c();
                    a.b(j);
                    return;
                }
                if (c.i()) {
                    a.tu();
                    return;
                }
            }
            if (n != 0L) {
                atnp.m(this.d, n);
            }
            this.l = l;
        } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
    }
    
    public final void e(final long n) {
        if (athh.h(n)) {
            atnp.i(this.d, n);
            this.d();
        }
    }
    
    public final void f(final aujq j) {
        if (athh.i(this.j, j)) {
            this.j = j;
            this.a.f((aujq)this);
            j.e((long)(this.e - 1));
        }
    }
    
    public final void tq() {
        this.g = true;
        this.j.tq();
        if (this.getAndIncrement() == 0) {
            this.c.c();
        }
    }
    
    public final void tr(Object a) {
        if (this.h) {
            return;
        }
        final Object k = this.k;
        try {
            a = this.b.a(k, a);
            asjv.b(a, "The accumulator returned a null value");
            this.k = a;
            this.c.j(a);
            this.d();
        }
        finally {
            final Throwable t;
            asey.d(t);
            this.j.tq();
            this.b(t);
        }
    }
    
    public final void tu() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.d();
    }
}
