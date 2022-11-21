import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxh extends AtomicInteger implements askk, aunb
{
    private static final long serialVersionUID = 3520831347801429610L;
    final auna a;
    final AtomicLong b;
    final AtomicReference c;
    final asmv d;
    final askm[] e;
    int f;
    long g;
    
    public asxh(final auna a, final askm[] e) {
        this.a = a;
        this.e = e;
        this.b = new AtomicLong();
        this.d = new asmv();
        this.c = new AtomicReference((V)atli.a);
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.h(this.d, asln);
    }
    
    @Override
    public final void e(final long n) {
        if (atkw.h(n)) {
            auop.A(this.b, n);
            this.f();
        }
    }
    
    final void f() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final AtomicReference c = this.c;
        final auna a = this.a;
        final asmv d = this.d;
        while (!d.tz()) {
            final Object value = c.get();
            Label_0166: {
                if (value != null) {
                    if (value != atli.a) {
                        final long g = this.g;
                        if (g == this.b.get()) {
                            break Label_0166;
                        }
                        this.g = g + 1L;
                        c.lazySet(null);
                        a.tt(value);
                    }
                    else {
                        c.lazySet(null);
                    }
                    if (!d.tz()) {
                        final int f = this.f;
                        final askm[] e = this.e;
                        final int length = e.length;
                        if (f == 2) {
                            a.tw();
                            return;
                        }
                        this.f = f + 1;
                        e[f].ag(this);
                    }
                }
            }
            if (this.decrementAndGet() == 0) {
                return;
            }
        }
        c.lazySet(null);
    }
    
    @Override
    public final void tr(final Object o) {
        this.c.lazySet(o);
        this.f();
    }
    
    @Override
    public final void ts() {
        asmr.b(this.d);
    }
    
    @Override
    public final void tw() {
        this.c.lazySet(atli.a);
        this.f();
    }
}
