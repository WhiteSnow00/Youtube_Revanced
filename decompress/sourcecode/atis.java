import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atis extends AtomicReference implements asic
{
    private static final long serialVersionUID = -7650903191002190468L;
    final asgo a;
    
    public atis(final asgo a, final atit atit) {
        this.a = a;
        this.lazySet(atit);
    }
    
    public final void dispose() {
        final atit atit = this.getAndSet(null);
        if (atit != null) {
            atit.ab(this);
        }
    }
    
    public final boolean tx() {
        return this.get() == null;
    }
}
