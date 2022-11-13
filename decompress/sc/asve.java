import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asve extends AtomicReference implements asho, asir
{
    private static final long serialVersionUID = 4375739915521278546L;
    final asho a;
    final asjr b;
    asir c;
    
    public asve(final asho a, final asjr b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asir c) {
        if (asjv.g(this.c, c)) {
            this.c = c;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        asjv.b((AtomicReference)this);
        this.c.dispose();
    }
    
    @Override
    public final boolean tA() {
        return asjv.c((asir)this.get());
    }
    
    @Override
    public final void ts(final Object o) {
        try {
            final ashq ashq = (ashq)this.b.a(o);
            askk.b((Object)ashq, "The mapper returned a null MaybeSource");
            if (!this.tA()) {
                ashq.ag(new asvd(this, 0));
            }
        }
        catch (final Exception ex) {
            asgz.c(ex);
            this.a.b(ex);
        }
    }
    
    @Override
    public final void tx() {
        this.a.tx();
    }
}
