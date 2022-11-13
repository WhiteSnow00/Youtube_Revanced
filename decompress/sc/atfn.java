import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atfn extends AtomicReference implements Runnable, asif, asir
{
    private static final long serialVersionUID = 3528003840217436037L;
    final asif a;
    final asid b;
    Object c;
    Throwable d;
    
    public atfn(final asif a, final asid b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable d) {
        this.d = d;
        asjv.h(this, this.b.f(this));
    }
    
    @Override
    public final void d(final asir asir) {
        if (asjv.f(this, asir)) {
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        asjv.b(this);
    }
    
    @Override
    public final void run() {
        final Throwable d = this.d;
        if (d != null) {
            this.a.b(d);
            return;
        }
        this.a.ts(this.c);
    }
    
    @Override
    public final boolean tA() {
        return asjv.c(this.get());
    }
    
    @Override
    public final void ts(final Object c) {
        this.c = c;
        asjv.h(this, this.b.f(this));
    }
}
