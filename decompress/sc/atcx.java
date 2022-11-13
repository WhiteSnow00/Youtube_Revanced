import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class atcx extends AtomicInteger implements ashy, asir
{
    private static final long serialVersionUID = 1418547743690811973L;
    final ashy a;
    final AtomicReference b;
    final atcw c;
    final atid d;
    
    public atcx(final ashy a) {
        this.a = a;
        this.b = new AtomicReference();
        this.c = new atcw(this);
        this.d = new atid();
    }
    
    @Override
    public final void b(final Throwable t) {
        asjv.b(this.c);
        aufk.i(this.a, t, (AtomicInteger)this, this.d);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f(this.b, asir);
    }
    
    @Override
    public final void dispose() {
        asjv.b(this.b);
        asjv.b(this.c);
    }
    
    final void f() {
        asjv.b(this.b);
        aufk.g(this.a, (AtomicInteger)this, this.d);
    }
    
    @Override
    public final boolean tA() {
        return asjv.c(this.b.get());
    }
    
    @Override
    public final void tu(final Object o) {
        final ashy a = this.a;
        final atid d = this.d;
        if (this.get() == 0 && this.compareAndSet(0, 1)) {
            a.tu(o);
            if (this.decrementAndGet() != 0) {
                final Throwable d2 = atih.d((AtomicReference)d);
                if (d2 != null) {
                    a.b(d2);
                    return;
                }
                a.tx();
            }
        }
    }
    
    @Override
    public final void tx() {
        asjv.b(this.c);
        aufk.g(this.a, (AtomicInteger)this, this.d);
    }
}
