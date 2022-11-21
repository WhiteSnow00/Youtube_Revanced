import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asnz extends AtomicReference implements asjz, asln
{
    private static final long serialVersionUID = -7545121636549663526L;
    
    @Override
    public final void b(final Throwable t) {
        this.lazySet(asmr.a);
        aqvq.w((Throwable)new aslx(t));
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
        this.lazySet(asmr.a);
    }
    
    @Override
    public final boolean tz() {
        return this.get() == asmr.a;
    }
}
