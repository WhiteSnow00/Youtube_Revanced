import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class atdd extends AtomicInteger implements Runnable, ashy, asir
{
    private static final long serialVersionUID = -8296689127439125014L;
    final ashy a;
    final long b;
    final TimeUnit c;
    final asic d;
    final boolean e;
    final AtomicReference f;
    asir g;
    volatile boolean h;
    Throwable i;
    volatile boolean j;
    volatile boolean k;
    boolean l;
    
    public atdd(final ashy a, final long b, final TimeUnit c, final asic d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new AtomicReference();
    }
    
    @Override
    public final void b(final Throwable i) {
        this.i = i;
        this.h = true;
        this.f();
    }
    
    @Override
    public final void d(final asir g) {
        if (asjv.g(this.g, g)) {
            this.g = g;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.j = true;
        this.g.dispose();
        this.d.dispose();
        if (this.getAndIncrement() == 0) {
            this.f.lazySet(null);
        }
    }
    
    final void f() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final AtomicReference f = this.f;
        final ashy a = this.a;
        int addAndGet = 1;
        while (!this.j) {
            final boolean h = this.h;
            if (h && this.i != null) {
                f.lazySet(null);
                a.b(this.i);
                this.d.dispose();
                return;
            }
            final Object value = f.get();
            if (h) {
                final Object andSet = f.getAndSet(null);
                if (value != null && this.e) {
                    a.tu(andSet);
                }
                a.tx();
                this.d.dispose();
                return;
            }
            if (value == null) {
                if (this.k) {
                    this.l = false;
                    this.k = false;
                }
            }
            else if (!this.l || this.k) {
                a.tu(f.getAndSet(null));
                this.k = false;
                this.l = true;
                this.d.b(this, this.b, this.c);
                continue;
            }
            if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                return;
            }
        }
        f.lazySet(null);
    }
    
    @Override
    public final void run() {
        this.k = true;
        this.f();
    }
    
    @Override
    public final boolean tA() {
        return this.j;
    }
    
    @Override
    public final void tu(final Object o) {
        this.f.set(o);
        this.f();
    }
    
    @Override
    public final void tx() {
        this.h = true;
        this.f();
    }
}
