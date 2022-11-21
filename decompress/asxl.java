import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxl extends AtomicReference implements asjz, asln
{
    private static final long serialVersionUID = 703409937383992161L;
    final askk a;
    final askm b;
    
    public asxl(final askk a, final askm b) {
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
        this.b.ag(new asyq(this, this.a, 1));
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
