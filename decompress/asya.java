import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asya extends AtomicReference implements askk, asln
{
    private static final long serialVersionUID = 4375739915521278546L;
    final askk a;
    final asmn b;
    asln c;
    
    public asya(final askk a, final asmn b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asln c) {
        if (asmr.g(this.c, c)) {
            this.c = c;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
        this.c.dispose();
    }
    
    @Override
    public final void tr(final Object o) {
        try {
            final askm askm = (askm)this.b.a(o);
            asng.b(askm, "The mapper returned a null MaybeSource");
            if (!this.tz()) {
                askm.ag(new asxz(this, 0));
            }
        }
        catch (final Exception ex) {
            asjv.a(ex);
            this.a.b(ex);
        }
    }
    
    @Override
    public final void tw() {
        this.a.tw();
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
