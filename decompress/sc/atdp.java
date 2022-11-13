import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class atdp extends AtomicInteger implements Runnable, ashy, asir
{
    static final Object a;
    private static final long serialVersionUID = 2233020065421370272L;
    final ashy b;
    final int c;
    final atdo d;
    final AtomicReference e;
    final AtomicInteger f;
    final atgf g;
    final atid h;
    final AtomicBoolean i;
    volatile boolean j;
    atkb k;
    
    static {
        a = new Object();
    }
    
    public atdp(final ashy b, final int c) {
        this.b = b;
        this.c = c;
        this.d = new atdo(this);
        this.e = new AtomicReference();
        this.f = new AtomicInteger(1);
        this.g = new atgf();
        this.h = new atid();
        this.i = new AtomicBoolean();
    }
    
    @Override
    public final void b(final Throwable t) {
        ((atiq)this.d).dispose();
        if (atih.e((AtomicReference)this.h, t)) {
            this.j = true;
            this.f();
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir asir) {
        if (asjv.f(this.e, asir)) {
            this.g();
        }
    }
    
    @Override
    public final void dispose() {
        if (this.i.compareAndSet(false, true)) {
            ((atiq)this.d).dispose();
            if (this.f.decrementAndGet() == 0) {
                asjv.b(this.e);
            }
        }
    }
    
    final void f() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final ashy b = this.b;
        final atgf g = this.g;
        final atid h = this.h;
        int addAndGet = 1;
        while (this.f.get() != 0) {
            final atkb k = this.k;
            final boolean j = this.j;
            if (j && h.get() != null) {
                g.c();
                final Throwable d = atih.d((AtomicReference)h);
                if (k != null) {
                    this.k = null;
                    k.b(d);
                }
                b.b(d);
                return;
            }
            final Object tw = g.tw();
            if (j) {
                if (tw == null) {
                    final Throwable d2 = atih.d((AtomicReference)h);
                    if (d2 == null) {
                        if (k != null) {
                            this.k = null;
                            k.tx();
                        }
                        b.tx();
                        return;
                    }
                    if (k != null) {
                        this.k = null;
                        k.b(d2);
                    }
                    b.b(d2);
                    return;
                }
            }
            else if (tw == null) {
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
                continue;
            }
            if (tw != atdp.a) {
                k.tu(tw);
            }
            else {
                if (k != null) {
                    this.k = null;
                    k.tx();
                }
                if (this.i.get()) {
                    continue;
                }
                final atkb i = new atkb(this.c, (Runnable)this);
                this.k = i;
                this.f.getAndIncrement();
                b.tu(i);
            }
        }
        g.c();
        this.k = null;
    }
    
    final void g() {
        this.g.j(atdp.a);
        this.f();
    }
    
    @Override
    public final void run() {
        if (this.f.decrementAndGet() == 0) {
            asjv.b(this.e);
        }
    }
    
    @Override
    public final boolean tA() {
        return this.i.get();
    }
    
    @Override
    public final void tu(final Object o) {
        this.g.j(o);
        this.f();
    }
    
    @Override
    public final void tx() {
        ((atiq)this.d).dispose();
        this.j = true;
        this.f();
    }
}
