import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aswo extends AtomicReference implements ashj, asgz, asic
{
    private static final long serialVersionUID = -8948264376121066672L;
    final ashj a;
    final asjc b;
    
    public aswo(final ashj a, final asjc b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    public final void d(final asic asic) {
        asjg.h(this, asic);
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    public final void tp(final Object o) {
        try {
            final ashh ashh = (ashh)this.b.a(o);
            asjv.b((Object)ashh, "The mapper returned a null Publisher");
            ashh.aJ((ashj)this);
        }
        finally {
            final Throwable t;
            asey.d(t);
            this.a.b(t);
        }
    }
    
    public final void tr(final Object o) {
        this.a.tr(o);
    }
    
    public final void tu() {
        this.a.tu();
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
