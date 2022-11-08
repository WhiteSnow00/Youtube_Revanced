import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

final class astl implements asgw, asic
{
    final ashq a;
    aujq b;
    Collection c;
    
    public astl(final ashq a, final Collection c) {
        this.a = a;
        this.c = c;
    }
    
    public final void b(final Throwable t) {
        this.c = null;
        this.b = (aujq)athh.a;
        this.a.b(t);
    }
    
    public final void dispose() {
        this.b.tq();
        this.b = (aujq)athh.a;
    }
    
    public final void f(final aujq b) {
        if (athh.i(this.b, b)) {
            this.b = b;
            this.a.d((asic)this);
            b.e(Long.MAX_VALUE);
        }
    }
    
    public final void tr(final Object o) {
        this.c.add(o);
    }
    
    public final void tu() {
        this.b = (aujq)athh.a;
        this.a.tp((Object)this.c);
    }
    
    public final boolean tx() {
        return this.b == athh.a;
    }
}
