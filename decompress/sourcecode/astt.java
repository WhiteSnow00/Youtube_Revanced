import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class astt extends AtomicReference implements asic
{
    private static final long serialVersionUID = -5791853038359966195L;
    final asgz a;
    
    public astt(final asgz a, final astu astu) {
        super(astu);
        this.a = a;
    }
    
    public final void dispose() {
        final astu astu = this.getAndSet(null);
        if (astu != null) {
            astu.ai(this);
        }
    }
    
    public final boolean tx() {
        return this.get() == null;
    }
}
