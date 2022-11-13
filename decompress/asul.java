import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class asul extends AtomicInteger implements asho, aukg
{
    private static final long serialVersionUID = 3520831347801429610L;
    final aukf a;
    final AtomicLong b;
    final AtomicReference c;
    final asjz d;
    final ashq[] e;
    int f;
    long g;
    
    public asul(final aukf a, final ashq[] e) {
        this.a = a;
        this.e = e;
        this.b = new AtomicLong();
        this.d = new asjz();
        this.c = new AtomicReference((V)atil.a);
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.h((AtomicReference)this.d, asir);
    }
    
    public final void e(final long n) {
        if (athz.h(n)) {
            asfn.w(this.b, n);
            this.f();
        }
    }
    
    final void f() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final AtomicReference c = this.c;
        final aukf a = this.a;
        final asjz d = this.d;
        while (!((asir)d).tA()) {
            final Object value = c.get();
            Label_0166: {
                if (value != null) {
                    if (value != atil.a) {
                        final long g = this.g;
                        if (g == this.b.get()) {
                            break Label_0166;
                        }
                        this.g = g + 1L;
                        c.lazySet(null);
                        a.tu(value);
                    }
                    else {
                        c.lazySet(null);
                    }
                    if (!((asir)d).tA()) {
                        final int f = this.f;
                        final ashq[] e = this.e;
                        final int length = e.length;
                        if (f == 2) {
                            a.tx();
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
    public final void ts(final Object o) {
        this.c.lazySet(o);
        this.f();
    }
    
    public final void tt() {
        asjv.b((AtomicReference)this.d);
    }
    
    @Override
    public final void tx() {
        this.c.lazySet(atil.a);
        this.f();
    }
}
