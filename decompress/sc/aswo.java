import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aswo extends AtomicReference implements Runnable, asir
{
    private static final long serialVersionUID = 2875964065294031672L;
    final asho a;
    
    public aswo(final asho a) {
        this.a = a;
    }
    
    @Override
    public final void dispose() {
        asjv.b((AtomicReference)this);
    }
    
    @Override
    public final void run() {
        this.a.ts(0L);
    }
    
    @Override
    public final boolean tA() {
        return asjv.c((asir)this.get());
    }
}
