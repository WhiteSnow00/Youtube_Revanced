import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxb extends AtomicInteger implements ashl, aukg
{
    static final asxa a;
    private static final long serialVersionUID = -5402190102429853762L;
    final aukf b;
    final asjr c;
    final atid d;
    final AtomicLong e;
    final AtomicReference f;
    aukg g;
    volatile boolean h;
    volatile boolean i;
    long j;
    
    static {
        a = new asxa((asxb)null);
    }
    
    public asxb(final aukf b, final asjr c) {
        this.b = b;
        this.c = c;
        this.d = new atid();
        this.e = new AtomicLong();
        this.f = new AtomicReference();
    }
    
    public final void b(final Throwable t) {
        if (atih.e((AtomicReference)this.d, t)) {
            this.d();
            this.h = true;
            this.g();
            return;
        }
        atqx.j(t);
    }
    
    final void d() {
        final AtomicReference f = this.f;
        final asxa a = asxb.a;
        final asxa asxa = f.getAndSet(a);
        if (asxa != null && asxa != a) {
            asjv.b((AtomicReference)asxa);
        }
    }
    
    public final void e(final long n) {
        asfn.w(this.e, n);
        this.g();
    }
    
    public final void f(final aukg g) {
        if (athz.i(this.g, g)) {
            this.g = g;
            this.b.f((aukg)this);
            g.e(Long.MAX_VALUE);
        }
    }
    
    final void g() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final aukf b = this.b;
        final atid d = this.d;
        final AtomicReference f = this.f;
        final AtomicLong e = this.e;
        long j = this.j;
        int addAndGet = 1;
        while (!this.i) {
            if (d.get() != null) {
                b.b(atih.d((AtomicReference)d));
                return;
            }
            final boolean h = this.h;
            final asxa asxa = f.get();
            Label_0180: {
                if (h) {
                    if (asxa == null) {
                        final Throwable d2 = atih.d((AtomicReference)d);
                        if (d2 != null) {
                            b.b(d2);
                            return;
                        }
                        b.tx();
                        return;
                    }
                }
                else if (asxa == null) {
                    break Label_0180;
                }
                if (asxa.b != null) {
                    if (j != e.get()) {
                        aqsz.y(f, asxa, null);
                        b.tu(asxa.b);
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
    
    public final void tt() {
        this.i = true;
        this.g.tt();
        this.d();
    }
    
    public final void tu(final Object o) {
        final asxa asxa = this.f.get();
        if (asxa != null) {
            asjv.b((AtomicReference)asxa);
        }
        try {
            final asih asih = (asih)this.c.a(o);
            askk.b((Object)asih, "The mapper returned a null SingleSource");
            final asxa asxa2 = new asxa(this);
            asxa asxa3;
            do {
                asxa3 = this.f.get();
                if (asxa3 == asxb.a) {
                    return;
                }
            } while (!aqsz.y(this.f, asxa3, asxa2));
            asih.ae(asxa2);
        }
        finally {
            final Throwable t;
            asgz.c(t);
            this.g.tt();
            this.f.getAndSet(asxb.a);
            this.b(t);
        }
    }
    
    public final void tx() {
        this.h = true;
        this.g();
    }
}
