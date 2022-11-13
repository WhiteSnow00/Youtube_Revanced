import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asvb extends AtomicReference implements asho, asir
{
    private static final long serialVersionUID = 4375739915521278546L;
    final asho a;
    final asjr b;
    final asjr c;
    final Callable d;
    asir e;
    
    public asvb(final asho a, final asjr b, final asjr c, final Callable d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void b(final Throwable t) {
        try {
            final ashq ashq = (ashq)this.c.a((Object)t);
            askk.b((Object)ashq, "The onErrorMapper returned a null MaybeSource");
            ashq.ag(new asvd(this, 1));
        }
        catch (final Exception ex) {
            asgz.c(ex);
            this.a.b(new asiz(new Throwable[] { t, ex }));
        }
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
        asjv.b((AtomicReference)this);
        this.e.dispose();
    }
    
    @Override
    public final boolean tA() {
        return asjv.c((asir)this.get());
    }
    
    @Override
    public final void ts(final Object o) {
        try {
            final ashq ashq = (ashq)this.b.a(o);
            askk.b((Object)ashq, "The onSuccessMapper returned a null MaybeSource");
            ashq.ag(new asvd(this, 1));
        }
        catch (final Exception ex) {
            asgz.c(ex);
            this.a.b(ex);
        }
    }
    
    @Override
    public final void tx() {
        try {
            final ashq ashq = this.d.call();
            askk.b((Object)ashq, "The onCompleteSupplier returned a null MaybeSource");
            ashq.ag(new asvd(this, 1));
        }
        catch (final Exception ex) {
            asgz.c(ex);
            this.a.b(ex);
        }
    }
}
