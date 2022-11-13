import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class atec extends AtomicInteger implements aukg
{
    private static final long serialVersionUID = 3100232009247827843L;
    final aukf a;
    final ateb[] b;
    final atid c;
    final AtomicLong d;
    volatile boolean e;
    final AtomicInteger f;
    
    public atec(final aukf a, final int n, final int n2) {
        this.c = new atid();
        this.d = new AtomicLong();
        this.f = new AtomicInteger();
        this.a = a;
        final ateb[] b = new ateb[n];
        for (int i = 0; i < n; ++i) {
            b[i] = new ateb(this, n2);
        }
        this.b = b;
        this.f.lazySet(n);
    }
    
    final void a() {
        final ateb[] b = this.b;
        for (int length = b.length, i = 0; i < length; ++i) {
            b[i].e = null;
        }
    }
    
    public abstract void b();
    
    public abstract void d();
    
    public final void e(final long n) {
        if (athz.h(n)) {
            asfn.w(this.d, n);
            this.b();
        }
    }
    
    public abstract void f(final Throwable p0);
    
    public abstract void g(final ateb p0, final Object p1);
    
    public final void tt() {
        if (!this.e) {
            this.e = true;
            final ateb[] b = this.b;
            for (int length = b.length, i = 0; i < length; ++i) {
                athz.f((AtomicReference)b[i]);
            }
            if (this.getAndIncrement() == 0) {
                this.a();
            }
        }
    }
}
