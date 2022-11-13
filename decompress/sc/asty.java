import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

final class asty extends athv implements ashl, aukg
{
    private static final long serialVersionUID = -8134157938864266736L;
    aukg a;
    
    public asty(final aukf aukf, final Collection g) {
        super(aukf);
        this.g = g;
    }
    
    public final void b(final Throwable t) {
        this.g = null;
        this.f.b(t);
    }
    
    public final void f(final aukg a) {
        if (athz.i(this.a, a)) {
            this.a = a;
            this.f.f((aukg)this);
            a.e(Long.MAX_VALUE);
        }
    }
    
    public final void tt() {
        super.tt();
        this.a.tt();
    }
    
    public final void tu(final Object o) {
        final Collection collection = (Collection)this.g;
        if (collection != null) {
            collection.add(o);
        }
    }
    
    public final void tx() {
        this.g((Object)this.g);
    }
}
