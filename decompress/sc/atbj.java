import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atbj extends AtomicReference implements asir
{
    private static final long serialVersionUID = -1100270633763673112L;
    final ashy a;
    
    public atbj(final ashy a) {
        this.a = a;
    }
    
    @Override
    public final void dispose() {
        final atbj andSet = this.getAndSet(this);
        if (andSet != null && andSet != this) {
            ((atbk)andSet).f(this);
        }
    }
    
    @Override
    public final boolean tA() {
        return this.get() == this;
    }
}
