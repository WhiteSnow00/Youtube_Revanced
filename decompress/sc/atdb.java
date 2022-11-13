import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atdb extends AtomicReference implements Runnable, ashy, asir
{
    private static final long serialVersionUID = 786994795061867455L;
    final ashy a;
    final long b;
    final TimeUnit c;
    final asic d;
    asir e;
    volatile boolean f;
    boolean g;
    
    public atdb(final ashy a, final TimeUnit c, final asic d) {
        this.a = a;
        this.b = 300L;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.g) {
            atqx.j(t);
            return;
        }
        this.g = true;
        this.a.b(t);
        this.d.dispose();
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
        this.e.dispose();
        this.d.dispose();
    }
    
    @Override
    public final void run() {
        this.f = false;
    }
    
    @Override
    public final boolean tA() {
        return this.d.tA();
    }
    
    @Override
    public final void tu(final Object o) {
        if (!this.f && !this.g) {
            this.f = true;
            this.a.tu(o);
            final asir asir = this.get();
            if (asir != null) {
                asir.dispose();
            }
            asjv.h(this, this.d.b(this, this.b, this.c));
        }
    }
    
    @Override
    public final void tx() {
        if (!this.g) {
            this.g = true;
            this.a.tx();
            this.d.dispose();
        }
    }
}
