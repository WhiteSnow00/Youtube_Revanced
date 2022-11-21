import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asog extends AtomicReference implements asjz, asln
{
    private static final long serialVersionUID = -4101678820158072998L;
    final asjz a;
    final askb b;
    
    public asog(final asjz a, final askb b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asln asln) {
        if (asmr.f(this, asln)) {
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    @Override
    public final void tw() {
        this.b.Y(new asof(this, this.a));
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
