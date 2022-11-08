import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atjc extends AtomicReference implements asic
{
    private static final long serialVersionUID = -7650903191002190468L;
    final ashq a;
    
    public atjc(final ashq a, final atjd atjd) {
        this.a = a;
        this.lazySet(atjd);
    }
    
    public final void dispose() {
        final atjd atjd = this.getAndSet(null);
        if (atjd != null) {
            atjd.ag(this);
        }
    }
    
    public final boolean tx() {
        return this.get() == null;
    }
}
