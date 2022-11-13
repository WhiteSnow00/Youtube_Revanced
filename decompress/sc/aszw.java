import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class aszw extends AtomicInteger implements asir, ashy
{
    private static final long serialVersionUID = 8443155186132538303L;
    final ashd a;
    final atid b;
    final asjr c;
    final asiq d;
    asir e;
    volatile boolean f;
    
    public aszw(final ashd a, final asjr c) {
        this.a = a;
        this.c = c;
        this.b = new atid();
        this.d = new asiq();
        this.lazySet(1);
    }
    
    @Override
    public final void b(Throwable d) {
        if (atih.e((AtomicReference)this.b, d)) {
            this.dispose();
            if (this.getAndSet(0) > 0) {
                d = atih.d((AtomicReference)this.b);
                this.a.b(d);
            }
            return;
        }
        atqx.j(d);
    }
    
    @Override
    public final void d(final asir e) {
        if (asjv.g(this.e, e)) {
            this.e = e;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.f = true;
        this.e.dispose();
        this.d.dispose();
    }
    
    @Override
    public final boolean tA() {
        return this.e.tA();
    }
    
    @Override
    public final void tu(final Object o) {
        try {
            final ashf ashf = (ashf)this.c.a(o);
            askk.b((Object)ashf, "The mapper returned a null CompletableSource");
            this.getAndIncrement();
            final aszv aszv = new aszv(this);
            if (!this.f && this.d.c(aszv)) {
                ashf.Y(aszv);
            }
        }
        finally {
            final Throwable t;
            asgz.c(t);
            this.e.dispose();
            this.b(t);
        }
    }
    
    @Override
    public final void tx() {
        if (this.decrementAndGet() == 0) {
            final Throwable d = atih.d((AtomicReference)this.b);
            if (d != null) {
                this.a.b(d);
                return;
            }
            this.a.tx();
        }
    }
}
