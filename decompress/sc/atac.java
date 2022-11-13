import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class atac extends AtomicInteger implements ashy, asir
{
    private static final long serialVersionUID = 8600231336733376951L;
    final ashy a;
    final asiq b;
    final AtomicInteger c;
    final atid d;
    final asjr e;
    final AtomicReference f;
    asir g;
    volatile boolean h;
    
    public atac(final ashy a, final asjr e) {
        this.a = a;
        this.e = e;
        this.b = new asiq();
        this.d = new atid();
        this.c = new AtomicInteger(1);
        this.f = new AtomicReference();
    }
    
    @Override
    public final void b(final Throwable t) {
        this.c.decrementAndGet();
        if (atih.e((AtomicReference)this.d, t)) {
            this.b.dispose();
            this.g();
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir g) {
        if (asjv.g(this.g, g)) {
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
        final atgh atgh = this.f.get();
        if (atgh != null) {
            atgh.c();
        }
    }
    
    final void g() {
        if (this.getAndIncrement() == 0) {
            this.h();
        }
    }
    
    final void h() {
        final ashy a = this.a;
        final AtomicInteger c = this.c;
        final AtomicReference f = this.f;
        int addAndGet = 1;
        while (!this.h) {
            if (this.d.get() != null) {
                final Throwable d = atih.d((AtomicReference)this.d);
                this.f();
                a.b(d);
                return;
            }
            final int value = c.get();
            final atgh atgh = f.get();
            Object tw;
            if (atgh != null) {
                tw = atgh.tw();
            }
            else {
                tw = null;
            }
            if (value == 0) {
                if (tw == null) {
                    final Throwable d2 = atih.d((AtomicReference)this.d);
                    if (d2 != null) {
                        a.b(d2);
                        return;
                    }
                    a.tx();
                    return;
                }
            }
            else if (tw == null) {
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
                continue;
            }
            a.tu(tw);
        }
        this.f();
    }
    
    @Override
    public final boolean tA() {
        return this.h;
    }
    
    @Override
    public final void tu(final Object o) {
        try {
            final asih asih = (asih)this.e.a(o);
            askk.b((Object)asih, "The mapper returned a null SingleSource");
            this.c.getAndIncrement();
            final atab atab = new atab(this);
            if (!this.h && this.b.c(atab)) {
                asih.ae(atab);
            }
        }
        finally {
            final Throwable t;
            asgz.c(t);
            this.g.dispose();
            this.b(t);
        }
    }
    
    @Override
    public final void tx() {
        this.c.decrementAndGet();
        this.g();
    }
}
