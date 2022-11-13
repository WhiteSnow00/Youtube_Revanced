import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxd extends AtomicReference implements ashy, asho, asir
{
    private static final long serialVersionUID = -8948264376121066672L;
    final ashy a;
    final asjr b;
    
    public asxd(final ashy a, final asjr b) {
        this.a = a;
        this.b = b;
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
    public final void ts(final Object o) {
        try {
            final ashw ashw = (ashw)this.b.a(o);
            askk.b((Object)ashw, "The mapper returned a null Publisher");
            ashw.aP(this);
        }
        finally {
            final Throwable t;
            asgz.c(t);
            this.a.b(t);
        }
    }
    
    @Override
    public final void tu(final Object o) {
        this.a.tu(o);
    }
    
    @Override
    public final void tx() {
        this.a.tx();
    }
}
