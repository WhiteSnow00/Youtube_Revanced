import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atbn extends AtomicReference implements asir
{
    private static final long serialVersionUID = 7463222674719692880L;
    final ashy a;
    
    public atbn(final ashy a, final atbo atbo) {
        this.a = a;
        this.lazySet(atbo);
    }
    
    @Override
    public final void dispose() {
        final atbo atbo = this.getAndSet(null);
        if (atbo != null) {
            atbo.f(this);
        }
    }
    
    @Override
    public final boolean tA() {
        return this.get() == null;
    }
}
