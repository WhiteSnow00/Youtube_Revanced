import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ataq extends AtomicInteger implements asir, ashw
{
    private static final long serialVersionUID = -3852313036005250360L;
    final Object a;
    public final atgh b;
    final atap c;
    public volatile boolean d;
    public Throwable e;
    final AtomicBoolean f;
    final AtomicBoolean g;
    final AtomicReference h;
    
    public ataq(final int n, final atap c, final Object a) {
        this.f = new AtomicBoolean();
        this.g = new AtomicBoolean();
        this.h = new AtomicReference();
        this.b = new atgh(n);
        this.c = c;
        this.a = a;
    }
    
    public final void a() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final atgh b = this.b;
        ashy ashy = this.h.get();
        int n = 1;
        while (true) {
            if (ashy != null) {
                while (true) {
                    final boolean d = this.d;
                    final Object tw = b.tw();
                    if (this.f.get()) {
                        this.b.c();
                        this.c.f(this.a);
                        this.h.lazySet(null);
                        return;
                    }
                    if (d) {
                        final Throwable e = this.e;
                        if (e != null) {
                            this.b.c();
                            this.h.lazySet(null);
                            ashy.b(e);
                            return;
                        }
                        if (tw == null) {
                            this.h.lazySet(null);
                            ashy.tx();
                            return;
                        }
                    }
                    if (tw == null) {
                        break;
                    }
                    ashy.tu(tw);
                }
            }
            final int addAndGet = this.addAndGet(-n);
            if (addAndGet == 0) {
                return;
            }
            n = addAndGet;
            if (ashy != null) {
                continue;
            }
            ashy = this.h.get();
            n = addAndGet;
        }
    }
    
    @Override
    public final void aP(final ashy ashy) {
        if (!this.g.compareAndSet(false, true)) {
            asjw.g((Throwable)new IllegalStateException("Only one Observer allowed!"), ashy);
            return;
        }
        ashy.d(this);
        this.h.lazySet(ashy);
        if (this.f.get()) {
            this.h.lazySet(null);
            return;
        }
        this.a();
    }
    
    @Override
    public final void dispose() {
        if (this.f.compareAndSet(false, true) && this.getAndIncrement() == 0) {
            this.h.lazySet(null);
            this.c.f(this.a);
        }
    }
    
    @Override
    public final boolean tA() {
        return this.f.get();
    }
}
