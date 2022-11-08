import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asmi extends AtomicReference implements Runnable, asic
{
    private static final long serialVersionUID = 3167244060586201109L;
    final asgo a;
    
    public asmi(final asgo a) {
        this.a = a;
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    @Override
    public final void run() {
        this.a.tu();
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
