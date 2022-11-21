import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asmp extends AtomicReference implements asln
{
    private static final long serialVersionUID = 5718521705281392066L;
    
    public asmp(final asmh asmh) {
        super(asmh);
    }
    
    @Override
    public final void dispose() {
        if (this.get() != null) {
            final asmh asmh = this.getAndSet(null);
            if (asmh != null) {
                try {
                    asmh.a();
                }
                catch (final Exception ex) {
                    asjv.a(ex);
                    aqvq.w((Throwable)ex);
                }
            }
        }
    }
    
    @Override
    public final boolean tz() {
        return this.get() == null;
    }
}
