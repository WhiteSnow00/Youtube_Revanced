import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aszu extends AtomicReference implements asku, asjz, asln
{
    private static final long serialVersionUID = -8948264376121066672L;
    final asku a;
    asks b;
    
    public aszu(final asku a, final asks b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.h(this, asln);
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    @Override
    public final void tt(final Object o) {
        this.a.tt(o);
    }
    
    @Override
    public final void tw() {
        final asks b = this.b;
        if (b == null) {
            this.a.tw();
            return;
        }
        this.b = null;
        b.aP(this);
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
