import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class assr extends AtomicReference implements Runnable, asgw, aujq
{
    private static final long serialVersionUID = 8094547886072529208L;
    final aujp a;
    final ashn b;
    final AtomicReference c;
    final AtomicLong d;
    final boolean e;
    aujo f;
    
    public assr(final aujp a, final ashn b, final aujo f, final boolean b2) {
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = new AtomicReference();
        this.d = new AtomicLong();
        this.e = (b2 ^ true);
    }
    
    public final void b(final Throwable t) {
        this.a.b(t);
        this.b.dispose();
    }
    
    final void d(final long n, final aujq aujq) {
        if (!this.e && Thread.currentThread() != this.get()) {
            this.b.a((Runnable)new assq(aujq, n, 0));
            return;
        }
        aujq.e(n);
    }
    
    public final void e(long andSet) {
        if (athh.h(andSet)) {
            final aujq aujq = this.c.get();
            if (aujq != null) {
                this.d(andSet, aujq);
                return;
            }
            atnp.i(this.d, andSet);
            final aujq aujq2 = this.c.get();
            if (aujq2 != null) {
                andSet = this.d.getAndSet(0L);
                if (andSet != 0L) {
                    this.d(andSet, aujq2);
                }
            }
        }
    }
    
    public final void f(final aujq aujq) {
        if (athh.g(this.c, aujq)) {
            final long andSet = this.d.getAndSet(0L);
            if (andSet != 0L) {
                this.d(andSet, aujq);
            }
        }
    }
    
    @Override
    public final void run() {
        this.lazySet(Thread.currentThread());
        final aujo f = this.f;
        this.f = null;
        f.as((aujp)this);
    }
    
    public final void tq() {
        athh.f(this.c);
        this.b.dispose();
    }
    
    public final void tr(final Object o) {
        this.a.tr(o);
    }
    
    public final void tu() {
        this.a.tu();
        this.b.dispose();
    }
}
