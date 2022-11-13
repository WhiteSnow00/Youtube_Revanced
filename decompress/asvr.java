import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asvr extends AtomicReference implements Runnable, asho, asir
{
    private static final long serialVersionUID = 8571289934935992137L;
    final asho a;
    final asid b;
    Object c;
    Throwable d;
    
    public asvr(final asho a, final asid b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable d) {
        this.d = d;
        asjv.h((AtomicReference)this, this.b.f(this));
    }
    
    @Override
    public final void d(final asir asir) {
        if (asjv.f((AtomicReference)this, asir)) {
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        asjv.b((AtomicReference)this);
    }
    
    @Override
    public final void run() {
        final Throwable d = this.d;
        if (d != null) {
            this.d = null;
            this.a.b(d);
            return;
        }
        final Object c = this.c;
        if (c != null) {
            this.c = null;
            this.a.ts(c);
            return;
        }
        this.a.tx();
    }
    
    @Override
    public final boolean tA() {
        return asjv.c((asir)this.get());
    }
    
    @Override
    public final void ts(final Object c) {
        this.c = c;
        asjv.h((AtomicReference)this, this.b.f(this));
    }
    
    @Override
    public final void tx() {
        asjv.h((AtomicReference)this, this.b.f(this));
    }
}
