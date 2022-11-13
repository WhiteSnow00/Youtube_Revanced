import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asui extends AtomicReference implements asir
{
    private static final long serialVersionUID = -5791853038359966195L;
    final asho a;
    
    public asui(final asho a, final asuj asuj) {
        super(asuj);
        this.a = a;
    }
    
    @Override
    public final void dispose() {
        final asuj asuj = this.getAndSet(null);
        if (asuj != null) {
            asuj.ai(this);
        }
    }
    
    @Override
    public final boolean tA() {
        return this.get() == null;
    }
}
