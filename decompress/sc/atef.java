import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class atef extends AtomicInteger implements Runnable, ashl, aukg
{
    private static final long serialVersionUID = 9222303586456402150L;
    final int a;
    final int b;
    final atgg c;
    final asic d;
    aukg e;
    volatile boolean f;
    Throwable g;
    final AtomicLong h;
    volatile boolean i;
    int j;
    
    public atef(final int a, final atgg c, final asic d) {
        this.h = new AtomicLong();
        this.a = a;
        this.c = c;
        this.b = a - (a >> 2);
        this.d = d;
    }
    
    public final void b(final Throwable g) {
        if (this.f) {
            atqx.j(g);
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
        if (athz.h(n)) {
            asfn.w(this.h, n);
            this.d();
        }
    }
    
    public final void tt() {
        if (!this.i) {
            this.i = true;
            this.e.tt();
            this.d.dispose();
            if (this.getAndIncrement() == 0) {
                this.c.c();
            }
        }
    }
    
    public final void tu(final Object o) {
        if (this.f) {
            return;
        }
        if (!this.c.j(o)) {
            this.e.tt();
            this.b(new asja("Queue is full?!"));
            return;
        }
        this.d();
    }
    
    public final void tx() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.d();
    }
}
