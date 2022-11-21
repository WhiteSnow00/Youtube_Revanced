import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class atcv extends AtomicInteger implements asku, asln
{
    private static final long serialVersionUID = 8600231336733376951L;
    final asku a;
    final aslm b;
    final AtomicInteger c;
    final atla d;
    final asmn e;
    final AtomicReference f;
    asln g;
    volatile boolean h;
    
    public atcv(final asku a, final asmn e) {
        this.a = a;
        this.e = e;
        this.b = new aslm();
        this.d = new atla();
        this.c = new AtomicInteger(1);
        this.f = new AtomicReference();
    }
    
    @Override
    public final void b(final Throwable t) {
        this.c.decrementAndGet();
        if (atle.e(this.d, t)) {
            this.b.dispose();
            this.g();
            return;
        }
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln g) {
        if (asmr.g(this.g, g)) {
            this.g = g;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.h = true;
        this.g.dispose();
        this.b.dispose();
    }
    
    final void f() {
        final atje atje = this.f.get();
        if (atje != null) {
            atje.c();
        }
    }
    
    final void g() {
        if (this.getAndIncrement() == 0) {
            this.h();
        }
    }
    
    final void h() {
        final asku a = this.a;
        final AtomicInteger c = this.c;
        final AtomicReference f = this.f;
        int addAndGet = 1;
        while (!this.h) {
            if (this.d.get() != null) {
                final Throwable d = atle.d(this.d);
                this.f();
                a.b(d);
                return;
            }
            final int value = c.get();
            final atje atje = f.get();
            Object tv;
            if (atje != null) {
                tv = atje.tv();
            }
            else {
                tv = null;
            }
            if (value == 0) {
                if (tv == null) {
                    final Throwable d2 = atle.d(this.d);
                    if (d2 != null) {
                        a.b(d2);
                        return;
                    }
                    a.tw();
                    return;
                }
            }
            else if (tv == null) {
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
                continue;
            }
            a.tt(tv);
        }
        this.f();
    }
    
    @Override
    public final void tt(final Object o) {
        try {
            final askm askm = (askm)this.e.a(o);
            asng.b(askm, "The mapper returned a null MaybeSource");
            this.c.getAndIncrement();
            final atcu atcu = new atcu(this);
            if (!this.h && this.b.c(atcu)) {
                askm.ag(atcu);
            }
        }
        finally {
            final Throwable t;
            asjv.a(t);
            this.g.dispose();
            this.b(t);
        }
    }
    
    @Override
    public final void tw() {
        this.c.decrementAndGet();
        this.g();
    }
    
    @Override
    public final boolean tz() {
        return this.h;
    }
}
