import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aswy extends AtomicReference implements ashy, ashd, asir
{
    private static final long serialVersionUID = -8948264376121066672L;
    final ashy a;
    ashw b;
    
    public aswy(final ashy a, final ashw b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.h((AtomicReference)this, asir);
    }
    
    @Override
    public final void dispose() {
        asjv.b((AtomicReference)this);
    }
    
    @Override
    public final boolean tA() {
        return asjv.c((asir)this.get());
    }
    
    @Override
    public final void tu(final Object o) {
        this.a.tu(o);
    }
    
    @Override
    public final void tx() {
        final ashw b = this.b;
        if (b == null) {
            this.a.tx();
            return;
        }
        this.b = null;
        b.aP(this);
    }
}
