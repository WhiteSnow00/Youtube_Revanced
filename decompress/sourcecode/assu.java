import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class assu extends AtomicInteger implements asgw, aujq
{
    static final asst a;
    private static final long serialVersionUID = -3491074160481096299L;
    final aujp b;
    final asjc c;
    final int d;
    final boolean e;
    volatile boolean f;
    final athl g;
    volatile boolean h;
    aujq i;
    final AtomicReference j;
    final AtomicLong k;
    volatile long l;
    
    static {
        athh.f(a = new asst(null, -1L, 1));
    }
    
    public assu(final aujp b, final asjc c, final int d) {
        this.j = new AtomicReference();
        this.k = new AtomicLong();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = false;
        this.g = new athl();
    }
    
    public final void b(final Throwable t) {
        if (!this.f && athp.e(this.g, t)) {
            this.d();
            this.f = true;
            this.g();
            return;
        }
        aulo.r(t);
    }
    
    final void d() {
        final asst asst = this.j.get();
        final asst a = assu.a;
        if (asst != a) {
            final asst asst2 = this.j.getAndSet(a);
            if (asst2 != a && asst2 != null) {
                athh.f(asst2);
            }
        }
    }
    
    public final void e(final long n) {
        if (athh.h(n)) {
            atnp.i(this.k, n);
            if (this.l == 0L) {
                this.i.e(Long.MAX_VALUE);
                return;
            }
            this.g();
        }
    }
    
    public final void f(final aujq i) {
        if (athh.i(this.i, i)) {
            this.i = i;
            this.b.f((aujq)this);
        }
    }
    
    final void g() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final aujp b = this.b;
        int addAndGet = 1;
    Label_0351_Outer:
        while (!this.h) {
            if (this.f) {
                if (this.g.get() != null) {
                    this.d();
                    b.b(athp.d(this.g));
                    return;
                }
                if (this.j.get() == null) {
                    b.tu();
                    return;
                }
            }
            final asst asst = this.j.get();
            aske d;
            if (asst != null) {
                d = asst.d;
            }
            else {
                d = null;
            }
            Label_0412: {
                if (d != null) {
                    if (asst.e) {
                        if (this.g.get() != null) {
                            this.d();
                            b.b(athp.d(this.g));
                            return;
                        }
                        if (d.i()) {
                            aulo.s(this.j, (Object)asst, (Object)null);
                            continue Label_0351_Outer;
                        }
                    }
                    final long value = this.k.get();
                    long n = 0L;
                    while (true) {
                        while (n != value) {
                            if (this.h) {
                                return;
                            }
                            final boolean e = asst.e;
                            Object o = null;
                            boolean b2 = false;
                            try {
                                d.tt();
                            }
                            finally {
                                final Throwable t;
                                asey.d(t);
                                athh.f(asst);
                                athp.e(this.g, t);
                                o = null;
                                b2 = true;
                            }
                            Label_0267: {
                                if (asst == this.j.get()) {
                                    if (b2) {
                                        if (this.g.get() != null) {
                                            b.b(athp.d(this.g));
                                            return;
                                        }
                                        if (o == null) {
                                            aulo.s(this.j, (Object)asst, (Object)null);
                                            break Label_0267;
                                        }
                                    }
                                    else if (o == null) {
                                        break;
                                    }
                                    b.tr(o);
                                    ++n;
                                    continue Label_0351_Outer;
                                }
                            }
                            final boolean b3 = true;
                            if (n != 0L && !this.h) {
                                if (value != Long.MAX_VALUE) {
                                    this.k.addAndGet(-n);
                                }
                                if (asst.f != 1) {
                                    asst.get().e(n);
                                }
                            }
                            if (!b3) {
                                break Label_0412;
                            }
                            continue Label_0351_Outer;
                        }
                        final boolean b3 = false;
                        continue;
                    }
                }
            }
            if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                return;
            }
        }
        this.j.lazySet(null);
    }
    
    public final void tq() {
        if (!this.h) {
            this.h = true;
            this.i.tq();
            this.d();
        }
    }
    
    public final void tr(final Object o) {
        if (this.f) {
            return;
        }
        final long l = this.l + 1L;
        this.l = l;
        final asst asst = this.j.get();
        if (asst != null) {
            athh.f(asst);
        }
        try {
            final aujo aujo = (aujo)this.c.a(o);
            asjv.b((Object)aujo, "The publisher returned is null");
            final asst asst2 = new asst(this, l, this.d);
            asst asst3;
            do {
                asst3 = this.j.get();
                if (asst3 == assu.a) {
                    return;
                }
            } while (!aulo.s(this.j, (Object)asst3, (Object)asst2));
            aujo.as((aujp)asst2);
        }
        finally {
            final Throwable t;
            asey.d(t);
            this.i.tq();
            this.b(t);
        }
    }
    
    public final void tu() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.g();
    }
}
