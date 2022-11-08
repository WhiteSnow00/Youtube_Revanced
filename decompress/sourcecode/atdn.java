import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class atdn extends AtomicInteger implements Runnable, asgw, aujq
{
    private static final long serialVersionUID = 9222303586456402150L;
    final int a;
    final int b;
    final atfo c;
    final ashn d;
    aujq e;
    volatile boolean f;
    Throwable g;
    final AtomicLong h;
    volatile boolean i;
    int j;
    
    public atdn(final int a, final atfo c, final ashn d) {
        this.h = new AtomicLong();
        this.a = a;
        this.c = c;
        this.b = a - (a >> 2);
        this.d = d;
    }
    
    public final void b(final Throwable g) {
        if (this.f) {
            aulo.r(g);
            return;
        }
        this.g = g;
        this.f = true;
        this.d();
    }
    
    final void d() {
        if (this.getAndIncrement() == 0) {
            this.d.a((Runnable)this);
        }
    }
    
    public final void e(final long n) {
        if (athh.h(n)) {
            atnp.i(this.h, n);
            this.d();
        }
    }
    
    public final void tq() {
        if (!this.i) {
            this.i = true;
            this.e.tq();
            this.d.dispose();
            if (this.getAndIncrement() == 0) {
                this.c.c();
            }
        }
    }
    
    public final void tr(final Object o) {
        if (this.f) {
            return;
        }
        if (!this.c.j(o)) {
            this.e.tq();
            this.b((Throwable)new asil("Queue is full?!"));
            return;
        }
        this.d();
    }
    
    public final void tu() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.d();
    }
}
