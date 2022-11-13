import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asjt extends AtomicReference implements asir
{
    private static final long serialVersionUID = 5718521705281392066L;
    
    public asjt(final asjl asjl) {
        super(asjl);
    }
    
    @Override
    public final void dispose() {
        if (this.get() != null) {
            final asjl asjl = this.getAndSet(null);
            if (asjl != null) {
                try {
                    asjl.a();
                }
                catch (final Exception ex) {
                    asgz.c(ex);
                    atqx.j((Throwable)ex);
                }
            }
        }
    }
    
    @Override
    public final boolean tA() {
        return this.get() == null;
    }
}
