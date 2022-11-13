import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atbr extends AtomicReference implements ashy, asir
{
    private static final long serialVersionUID = 854110278590336484L;
    final ashy a;
    asir b;
    
    public atbr(final ashy a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        asjv.b(this);
        this.a.b(t);
    }
    
    @Override
    public final void d(final asir b) {
        if (asjv.g(this.b, b)) {
            this.b = b;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.b.dispose();
        asjv.b(this);
    }
    
    @Override
    public final boolean tA() {
        return this.b.tA();
    }
    
    @Override
    public final void tu(final Object o) {
        this.a.tu(o);
    }
    
    @Override
    public final void tx() {
        asjv.b(this);
        this.a.tx();
    }
}
