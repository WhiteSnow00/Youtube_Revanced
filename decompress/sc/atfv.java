import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atfv extends AtomicReference implements Runnable, asif, asir
{
    private static final long serialVersionUID = 37497744973048446L;
    final asif a;
    final AtomicReference b;
    final atfu c;
    asih d;
    final long e;
    final TimeUnit f;
    
    public atfv(final asif a, final asih d, final long e, final TimeUnit f) {
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.b = new AtomicReference();
        if (d != null) {
            this.c = new atfu(a);
            return;
        }
        this.c = null;
    }
    
    @Override
    public final void b(final Throwable t) {
        final asir asir = this.get();
        if (asir != asjv.a && this.compareAndSet((asjv)asir, asjv.a)) {
            asjv.b(this.b);
            this.a.b(t);
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f(this, asir);
    }
    
    @Override
    public final void dispose() {
        asjv.b(this);
        asjv.b(this.b);
        final atfu c = this.c;
        if (c != null) {
            asjv.b(c);
        }
    }
    
    @Override
    public final void run() {
        final asir asir = this.get();
        if (asir != asjv.a && this.compareAndSet((asjv)asir, asjv.a)) {
            if (asir != null) {
                asir.dispose();
            }
            final asih d = this.d;
            if (d == null) {
                this.a.b(new TimeoutException(atih.c(this.e, this.f)));
                return;
            }
            this.d = null;
            d.ae(this.c);
        }
    }
    
    @Override
    public final boolean tA() {
        return asjv.c(this.get());
    }
    
    @Override
    public final void ts(final Object o) {
        final asir asir = this.get();
        if (asir != asjv.a && this.compareAndSet((asjv)asir, asjv.a)) {
            asjv.b(this.b);
            this.a.ts(o);
        }
    }
}
