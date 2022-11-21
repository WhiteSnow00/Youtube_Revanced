import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class assh extends AtomicReference implements asjz, asln
{
    private static final long serialVersionUID = 8606673141535671828L;
    final assi a;
    
    public assh(final assi a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final assi a = this.a;
        a.d.d(this);
        a.b(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this, asln);
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    @Override
    public final void tw() {
        final assi a = this.a;
        a.d.d(this);
        a.tw();
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
