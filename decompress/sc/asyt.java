import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class asyt implements ashy, asir
{
    final ashy a;
    final long b;
    final TimeUnit c;
    final asic d;
    asir e;
    asir f;
    volatile long g;
    boolean h;
    
    public asyt(final ashy a, final long b, final TimeUnit c, final asic d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.h) {
            atqx.j(t);
            return;
        }
        final asir f = this.f;
        if (f != null) {
            asjv.b((AtomicReference)f);
        }
        this.h = true;
        this.a.b(t);
        this.d.dispose();
    }
    
    @Override
    public final void d(final asir e) {
        if (asjv.g(this.e, e)) {
            this.e = e;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.e.dispose();
        this.d.dispose();
    }
    
    @Override
    public final boolean tA() {
        return this.d.tA();
    }
    
    @Override
    public final void tu(final Object o) {
        if (this.h) {
            return;
        }
        final long g = this.g + 1L;
        this.g = g;
        final asir f = this.f;
        if (f != null) {
            asjv.b((AtomicReference)f);
        }
        final asys f2 = new asys(o, g, this);
        asjv.h((AtomicReference)(this.f = (asir)f2), this.d.b((Runnable)f2, this.b, this.c));
    }
    
    @Override
    public final void tx() {
        if (this.h) {
            return;
        }
        this.h = true;
        final asir f = this.f;
        if (f != null) {
            asjv.b((AtomicReference)f);
        }
        if (f != null) {
            ((asys)f).run();
        }
        this.a.tx();
        this.d.dispose();
    }
}
