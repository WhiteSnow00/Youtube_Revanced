import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asje extends AtomicReference implements asic
{
    private static final long serialVersionUID = 5718521705281392066L;
    
    public asje(final asiw asiw) {
        super(asiw);
    }
    
    public final void dispose() {
        if (this.get() != null) {
            final asiw asiw = this.getAndSet(null);
            if (asiw != null) {
                try {
                    asiw.a();
                }
                catch (final Exception ex) {
                    asey.d((Throwable)ex);
                    aulo.r((Throwable)ex);
                }
            }
        }
    }
    
    public final boolean tx() {
        return this.get() == null;
    }
}
