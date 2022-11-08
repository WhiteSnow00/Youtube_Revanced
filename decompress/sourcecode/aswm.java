import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class aswm extends AtomicInteger implements asgw, aujq
{
    static final aswl a;
    private static final long serialVersionUID = -5402190102429853762L;
    final aujp b;
    final asjc c;
    final athl d;
    final AtomicLong e;
    final AtomicReference f;
    aujq g;
    volatile boolean h;
    volatile boolean i;
    long j;
    
    static {
        a = new aswl((aswm)null);
    }
    
    public aswm(final aujp b, final asjc c) {
        this.b = b;
        this.c = c;
        this.d = new athl();
        this.e = new AtomicLong();
        this.f = new AtomicReference();
    }
    
    public final void b(final Throwable t) {
        if (athp.e(this.d, t)) {
            this.d();
            this.h = true;
            this.g();
            return;
        }
        aulo.r(t);
    }
    
    final void d() {
        final AtomicReference f = this.f;
        final aswl a = aswm.a;
        final aswl aswl = f.getAndSet(a);
        if (aswl != null && aswl != a) {
            asjg.b(aswl);
        }
    }
    
    public final void e(final long n) {
        atnp.i(this.e, n);
        this.g();
    }
    
    public final void f(final aujq g) {
        if (athh.i(this.g, g)) {
            this.g = g;
            this.b.f((aujq)this);
            g.e(Long.MAX_VALUE);
        }
    }
    
    final void g() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final aujp b = this.b;
        final athl d = this.d;
        final AtomicReference f = this.f;
        final AtomicLong e = this.e;
        long j = this.j;
        int addAndGet = 1;
        while (!this.i) {
            if (d.get() != null) {
                b.b(athp.d(d));
                return;
            }
            final boolean h = this.h;
            final aswl aswl = f.get();
            Label_0171: {
                if (h) {
                    if (aswl == null) {
                        final Throwable d2 = athp.d(d);
                        if (d2 != null) {
                            b.b(d2);
                            return;
                        }
                        b.tu();
                        return;
                    }
                }
                else if (aswl == null) {
                    break Label_0171;
                }
                if (aswl.b != null) {
                    if (j != e.get()) {
                        atqc.g(f, (Object)aswl, (Object)null);
                        b.tr(aswl.b);
                        ++j;
                        continue;
                    }
                }
            }
            this.j = j;
            if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                return;
            }
        }
    }
    
    public final void tq() {
        this.i = true;
        this.g.tq();
        this.d();
    }
    
    public final void tr(final Object o) {
        final aswl aswl = this.f.get();
        if (aswl != null) {
            asjg.b(aswl);
        }
        try {
            final ashs ashs = (ashs)this.c.a(o);
            asjv.b((Object)ashs, "The mapper returned a null SingleSource");
            final aswl aswl2 = new aswl(this);
            aswl aswl3;
            do {
                aswl3 = this.f.get();
                if (aswl3 == aswm.a) {
                    return;
                }
            } while (!atqc.g(this.f, (Object)aswl3, (Object)aswl2));
            ashs.ad((ashq)aswl2);
        }
        finally {
            final Throwable t;
            asey.d(t);
            this.g.tq();
            this.f.getAndSet(aswm.a);
            this.b(t);
        }
    }
    
    public final void tu() {
        this.h = true;
        this.g();
    }
}
