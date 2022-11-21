import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asyw extends AtomicReference implements askk, asln
{
    private static final long serialVersionUID = 8571289934935992137L;
    final asmv a;
    final askk b;
    
    public asyw(final askk b) {
        this.b = b;
        this.a = new asmv();
    }
    
    @Override
    public final void b(final Throwable t) {
        this.b.b(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this, asln);
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
        asmr.b(this.a);
    }
    
    @Override
    public final void tr(final Object o) {
        this.b.tr(o);
    }
    
    @Override
    public final void tw() {
        this.b.tw();
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
