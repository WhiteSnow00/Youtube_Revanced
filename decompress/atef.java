import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atef extends AtomicReference implements asln
{
    private static final long serialVersionUID = -1100270633763673112L;
    final asku a;
    
    public atef(final asku a) {
        this.a = a;
    }
    
    @Override
    public final void dispose() {
        final atef andSet = this.getAndSet(this);
        if (andSet != null && andSet != this) {
            ((ateg)andSet).f(this);
        }
    }
    
    @Override
    public final boolean tz() {
        return this.get() == this;
    }
}
