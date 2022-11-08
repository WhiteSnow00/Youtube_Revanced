import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asxy extends AtomicInteger implements ashf
{
    private static final long serialVersionUID = 4883307006032401862L;
    final ashf a;
    final athl b;
    final atfp c;
    volatile boolean d;
    
    public asxy(final ashf a) {
        this.a = a;
        this.b = new athl();
        this.c = new atfp(16);
    }
    
    public final void a() {
        if (!this.a.tx()) {
            if (!this.d) {
                this.d = true;
                this.h();
            }
        }
    }
    
    public final void b(final Throwable t) {
        throw null;
    }
    
    public final void c(final Object o) {
        if (!this.a.tx()) {
            if (!this.d) {
                if (o == null) {
                    final NullPointerException ex = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                    if (!this.g(ex)) {
                        aulo.r((Throwable)ex);
                    }
                    return;
                }
                Label_0108: {
                    if (this.get() == 0 && this.compareAndSet(0, 1)) {
                        this.a.c(o);
                        if (this.decrementAndGet() == 0) {
                            return;
                        }
                        break Label_0108;
                    }
                    final atfp c = this.c;
                    synchronized (c) {
                        ((aske)c).j(o);
                        monitorexit(c);
                        if (this.getAndIncrement() != 0) {
                            return;
                        }
                        this.i();
                    }
                }
            }
        }
    }
    
    public final void d(final asiw asiw) {
        throw null;
    }
    
    public final void f(final asic asic) {
        asjg.d((AtomicReference)this.a, asic);
    }
    
    public final boolean g(final Throwable t) {
        if (!this.a.tx()) {
            if (!this.d) {
                Throwable t2;
                if ((t2 = t) == null) {
                    t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (athp.e(this.b, t2)) {
                    this.d = true;
                    this.h();
                    return true;
                }
            }
        }
        return false;
    }
    
    final void h() {
        if (this.getAndIncrement() == 0) {
            this.i();
        }
    }
    
    final void i() {
        final ashf a = this.a;
        final atfp c = this.c;
        final athl b = this.b;
        int addAndGet = 1;
        while (!a.tx()) {
            if (b.get() != null) {
                c.c();
                a.b(athp.d(b));
                return;
            }
            final boolean d = this.d;
            final Object tt = c.tt();
            if (d) {
                if (tt == null) {
                    a.a();
                    return;
                }
            }
            else if (tt == null) {
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
                continue;
            }
            a.c(tt);
        }
        c.c();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
    
    public final boolean tx() {
        return this.a.tx();
    }
}
