import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asld extends AtomicReference implements ashd, asir
{
    private static final long serialVersionUID = -7545121636549663526L;
    
    @Override
    public final void b(final Throwable t) {
        this.lazySet(asjv.a);
        atqx.j((Throwable)new asjb(t));
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f((AtomicReference)this, asir);
    }
    
    @Override
    public final void dispose() {
        asjv.b((AtomicReference)this);
    }
    
    @Override
    public final boolean tA() {
        return this.get() == asjv.a;
    }
    
    @Override
    public final void tx() {
        this.lazySet(asjv.a);
    }
}
