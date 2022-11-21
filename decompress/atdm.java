import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atdm extends AtomicInteger implements asln, asks
{
    private static final long serialVersionUID = -3852313036005250360L;
    final Object a;
    public final atje b;
    final atdl c;
    public volatile boolean d;
    public Throwable e;
    final AtomicBoolean f;
    final AtomicBoolean g;
    final AtomicReference h;
    
    public atdm(final int n, final atdl c, final Object a) {
        this.f = new AtomicBoolean();
        this.g = new AtomicBoolean();
        this.h = new AtomicReference();
        this.b = new atje(n);
        this.c = c;
        this.a = a;
    }
    
    public final void a() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final atje b = this.b;
        asku asku = this.h.get();
        int n = 1;
        while (true) {
            if (asku != null) {
                while (true) {
                    final boolean d = this.d;
                    final Object tv = b.tv();
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
                            asku.b(e);
                            return;
                        }
                        if (tv == null) {
                            this.h.lazySet(null);
                            asku.tw();
                            return;
                        }
                    }
                    if (tv == null) {
                        break;
                    }
                    asku.tt(tv);
                }
            }
            final int addAndGet = this.addAndGet(-n);
            if (addAndGet == 0) {
                return;
            }
            n = addAndGet;
            if (asku != null) {
                continue;
            }
            asku = this.h.get();
            n = addAndGet;
        }
    }
    
    @Override
    public final void aP(final asku asku) {
        if (!this.g.compareAndSet(false, true)) {
            asms.g((Throwable)new IllegalStateException("Only one Observer allowed!"), asku);
            return;
        }
        asku.d(this);
        this.h.lazySet(asku);
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
    public final boolean tz() {
        return this.f.get();
    }
}
