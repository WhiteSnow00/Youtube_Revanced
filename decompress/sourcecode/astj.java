import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

final class astj extends athd implements asgw, aujq
{
    private static final long serialVersionUID = -8134157938864266736L;
    aujq a;
    
    public astj(final aujp aujp, final Collection g) {
        super(aujp);
        this.g = g;
    }
    
    public final void b(final Throwable t) {
        this.g = null;
        this.f.b(t);
    }
    
    public final void f(final aujq a) {
        if (athh.i(this.a, a)) {
            this.a = a;
            this.f.f((aujq)this);
            a.e(Long.MAX_VALUE);
        }
    }
    
    public final void tq() {
        super.tq();
        this.a.tq();
    }
    
    public final void tr(final Object o) {
        final Collection collection = (Collection)this.g;
        if (collection != null) {
            collection.add(o);
        }
    }
    
    public final void tu() {
        this.g((Object)this.g);
    }
}
