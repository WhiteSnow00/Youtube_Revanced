import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asum extends AtomicReference implements asgz, asic
{
    private static final long serialVersionUID = 4375739915521278546L;
    final asgz a;
    final asjc b;
    final asjc c;
    final Callable d;
    asic e;
    
    public asum(final asgz a, final asjc b, final asjc c, final Callable d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void b(final Throwable t) {
        try {
            final ashb ashb = (ashb)this.c.a((Object)t);
            asjv.b((Object)ashb, "The onErrorMapper returned a null MaybeSource");
            ashb.ag((asgz)new asuo(this, 1));
        }
        catch (final Exception ex) {
            asey.d((Throwable)ex);
            this.a.b((Throwable)new asik(new Throwable[] { t, ex }));
        }
    }
    
    public final void d(final asic e) {
        if (asjg.g(this.e, e)) {
            this.e = e;
            this.a.d((asic)this);
        }
    }
    
    public final void dispose() {
        asjg.b(this);
        this.e.dispose();
    }
    
    public final void tp(final Object o) {
        try {
            final ashb ashb = (ashb)this.b.a(o);
            asjv.b((Object)ashb, "The onSuccessMapper returned a null MaybeSource");
            ashb.ag((asgz)new asuo(this, 1));
        }
        catch (final Exception ex) {
            asey.d((Throwable)ex);
            this.a.b((Throwable)ex);
        }
    }
    
    public final void tu() {
        try {
            final ashb ashb = this.d.call();
            asjv.b((Object)ashb, "The onCompleteSupplier returned a null MaybeSource");
            ashb.ag((asgz)new asuo(this, 1));
        }
        catch (final Exception ex) {
            asey.d((Throwable)ex);
            this.a.b((Throwable)ex);
        }
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
