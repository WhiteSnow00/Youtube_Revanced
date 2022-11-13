import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atdh extends AtomicReference implements ashy, asir
{
    private static final long serialVersionUID = 3764492702657003550L;
    public final ashy a;
    final long b;
    final TimeUnit c;
    public final asic d;
    final asjz e;
    public final AtomicLong f;
    public final AtomicReference g;
    public ashw h;
    
    public atdh(final ashy a, final long b, final TimeUnit c, final asic d, final ashw h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
        this.e = new asjz();
        this.f = new AtomicLong();
        this.g = new AtomicReference();
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            asjv.b(this.e);
            this.a.b(t);
            this.d.dispose();
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f(this.g, asir);
    }
    
    @Override
    public final void dispose() {
        asjv.b(this.g);
        asjv.b(this);
        this.d.dispose();
    }
    
    final void f(final long n) {
        asjv.h(this.e, this.d.b((Runnable)new astf(n, this, 2), this.b, this.c));
    }
    
    @Override
    public final boolean tA() {
        return asjv.c(this.get());
    }
    
    @Override
    public final void tu(final Object o) {
        final long value = this.f.get();
        if (value != Long.MAX_VALUE) {
            final AtomicLong f = this.f;
            final long n = 1L + value;
            if (f.compareAndSet(value, n)) {
                this.e.get().dispose();
                this.a.tu(o);
                this.f(n);
            }
        }
    }
    
    @Override
    public final void tx() {
        if (this.f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            asjv.b(this.e);
            this.a.tx();
            this.d.dispose();
        }
    }
}
