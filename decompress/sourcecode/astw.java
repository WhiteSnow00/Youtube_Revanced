import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class astw extends AtomicInteger implements asgz, aujq
{
    private static final long serialVersionUID = 3520831347801429610L;
    final aujp a;
    final AtomicLong b;
    final AtomicReference c;
    final asjk d;
    final ashb[] e;
    int f;
    long g;
    
    public astw(final aujp a, final ashb[] e) {
        this.a = a;
        this.e = e;
        this.b = new AtomicLong();
        this.d = new asjk();
        this.c = new AtomicReference((V)atht.a);
    }
    
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    public final void d(final asic asic) {
        asjg.h(this.d, asic);
    }
    
    public final void e(final long n) {
        if (athh.h(n)) {
            atnp.i(this.b, n);
            this.f();
        }
    }
    
    final void f() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final AtomicReference c = this.c;
        final aujp a = this.a;
        final asjk d = this.d;
        while (!((asic)d).tx()) {
            final Object value = c.get();
            Label_0163: {
                if (value != null) {
                    if (value != atht.a) {
                        final long g = this.g;
                        if (g == this.b.get()) {
                            break Label_0163;
                        }
                        this.g = g + 1L;
                        c.lazySet(null);
                        a.tr(value);
                    }
                    else {
                        c.lazySet(null);
                    }
                    if (!((asic)d).tx()) {
                        final int f = this.f;
                        final ashb[] e = this.e;
                        final int length = e.length;
                        if (f == 2) {
                            a.tu();
                            return;
                        }
                        this.f = f + 1;
                        e[f].ag((asgz)this);
                    }
                }
            }
            if (this.decrementAndGet() == 0) {
                return;
            }
        }
        c.lazySet(null);
    }
    
    public final void tp(final Object o) {
        this.c.lazySet(o);
        this.f();
    }
    
    public final void tq() {
        asjg.b(this.d);
    }
    
    public final void tu() {
        this.c.lazySet(atht.a);
        this.f();
    }
}
