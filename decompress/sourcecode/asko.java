import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asko extends AtomicReference implements asgo, asic
{
    private static final long serialVersionUID = -7545121636549663526L;
    
    public final void b(final Throwable t) {
        this.lazySet(asjg.a);
        aulo.r((Throwable)new asim(t));
    }
    
    public final void d(final asic asic) {
        asjg.f(this, asic);
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    public final void tu() {
        this.lazySet(asjg.a);
    }
    
    public final boolean tx() {
        return this.get() == asjg.a;
    }
}
