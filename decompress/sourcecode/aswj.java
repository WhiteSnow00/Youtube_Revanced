import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aswj extends AtomicReference implements ashj, asgo, asic
{
    private static final long serialVersionUID = -8948264376121066672L;
    final ashj a;
    ashh b;
    
    public aswj(final ashj a, final ashh b) {
        this.b = b;
        this.a = a;
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
    
    public final void tr(final Object o) {
        this.a.tr(o);
    }
    
    public final void tu() {
        final ashh b = this.b;
        if (b == null) {
            this.a.tu();
            return;
        }
        this.b = null;
        b.aJ((ashj)this);
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
