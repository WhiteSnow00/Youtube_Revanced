import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asup extends AtomicReference implements asgz, asic
{
    private static final long serialVersionUID = 4375739915521278546L;
    final asgz a;
    final asjc b;
    asic c;
    
    public asup(final asgz a, final asjc b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    public final void d(final asic c) {
        if (asjg.g(this.c, c)) {
            this.c = c;
            this.a.d((asic)this);
        }
    }
    
    public final void dispose() {
        asjg.b(this);
        this.c.dispose();
    }
    
    public final void tp(final Object o) {
        try {
            final ashb ashb = (ashb)this.b.a(o);
            asjv.b((Object)ashb, "The mapper returned a null MaybeSource");
            if (!this.tx()) {
                ashb.ag((asgz)new asuo(this, 0));
            }
        }
        catch (final Exception ex) {
            asey.d((Throwable)ex);
            this.a.b((Throwable)ex);
        }
    }
    
    public final void tu() {
        this.a.tu();
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
