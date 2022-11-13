import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asmm extends AtomicReference implements Runnable, ashd, asir
{
    private static final long serialVersionUID = 8571289934935992137L;
    final ashd a;
    final asid b;
    Throwable c;
    
    public asmm(final ashd a, final asid b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable c) {
        this.c = c;
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
        final Throwable c = this.c;
        if (c != null) {
            this.c = null;
            this.a.b(c);
            return;
        }
        this.a.tx();
    }
    
    @Override
    public final boolean tA() {
        return asjv.c((asir)this.get());
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.a);
    }
    
    @Override
    public final void tx() {
        asjv.h((AtomicReference)this, this.b.f(this));
    }
}
