import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asze extends AtomicReference implements askk, asln
{
    private static final long serialVersionUID = -2187421758664251153L;
    final askk a;
    final aszd b;
    
    public asze(final askk a) {
        this.a = a;
        this.b = new aszd(this);
    }
    
    @Override
    public final void b(final Throwable t) {
        asmr.b(this.b);
        if (this.getAndSet(asmr.a) != asmr.a) {
            this.a.b(t);
            return;
        }
        aqvq.w(t);
    }
    
    final void c() {
        if (asmr.b(this)) {
            this.a.tw();
        }
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this, asln);
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
        asmr.b(this.b);
    }
    
    @Override
    public final void tr(final Object o) {
        asmr.b(this.b);
        if (this.getAndSet(asmr.a) != asmr.a) {
            this.a.tr(o);
        }
    }
    
    @Override
    public final void tw() {
        asmr.b(this.b);
        if (this.getAndSet(asmr.a) != asmr.a) {
            this.a.tw();
        }
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
