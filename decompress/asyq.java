import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asyq extends AtomicInteger implements ashu
{
    private static final long serialVersionUID = 4883307006032401862L;
    final ashu a;
    final atid b;
    final atgh c;
    volatile boolean d;
    
    public asyq(final ashu a) {
        this.a = a;
        this.b = new atid();
        this.c = new atgh(16);
    }
    
    public final void a() {
        if (!this.a.tA()) {
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
        if (!this.a.tA()) {
            if (!this.d) {
                if (o == null) {
                    final NullPointerException ex = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                    if (!this.g(ex)) {
                        atqx.j((Throwable)ex);
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
                    final atgh c = this.c;
                    synchronized (c) {
                        ((askt)c).j(o);
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
    
    public final void d(final asjl asjl) {
        throw null;
    }
    
    public final void f(final asir asir) {
        asjv.d((AtomicReference)this.a, asir);
    }
    
    public final boolean g(final Throwable t) {
        if (!this.a.tA()) {
            if (!this.d) {
                Throwable t2;
                if ((t2 = t) == null) {
                    t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (atih.e((AtomicReference)this.b, t2)) {
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
        final ashu a = this.a;
        final atgh c = this.c;
        final atid b = this.b;
        int addAndGet = 1;
        while (!a.tA()) {
            if (b.get() != null) {
                c.c();
                a.b(atih.d((AtomicReference)b));
                return;
            }
            final boolean d = this.d;
            final Object tw = c.tw();
            if (d) {
                if (tw == null) {
                    a.a();
                    return;
                }
            }
            else if (tw == null) {
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
                continue;
            }
            a.c(tw);
        }
        c.c();
    }
    
    public final boolean tA() {
        return this.a.tA();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
