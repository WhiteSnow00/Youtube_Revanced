import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxx extends AtomicReference implements askk, asln
{
    private static final long serialVersionUID = 4375739915521278546L;
    final askk a;
    final asmn b;
    final asmn c;
    final Callable d;
    asln e;
    
    public asxx(final askk a, final asmn b, final asmn c, final Callable d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void b(final Throwable t) {
        try {
            final askm askm = (askm)this.c.a(t);
            asng.b(askm, "The onErrorMapper returned a null MaybeSource");
            askm.ag(new asxz(this, 1));
        }
        catch (final Exception ex) {
            asjv.a(ex);
            this.a.b(new aslv(new Throwable[] { t, ex }));
        }
    }
    
    @Override
    public final void d(final asln e) {
        if (asmr.g(this.e, e)) {
            this.e = e;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
        this.e.dispose();
    }
    
    @Override
    public final void tr(final Object o) {
        try {
            final askm askm = (askm)this.b.a(o);
            asng.b(askm, "The onSuccessMapper returned a null MaybeSource");
            askm.ag(new asxz(this, 1));
        }
        catch (final Exception ex) {
            asjv.a(ex);
            this.a.b(ex);
        }
    }
    
    @Override
    public final void tw() {
        try {
            final askm askm = this.d.call();
            asng.b(askm, "The onCompleteSupplier returned a null MaybeSource");
            askm.ag(new asxz(this, 1));
        }
        catch (final Exception ex) {
            asjv.a(ex);
            this.a.b(ex);
        }
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
