import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aswp extends ashn
{
    final long a;
    final TimeUnit b;
    final asid c;
    
    public aswp(final long a, final TimeUnit b, final asid c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    protected final void ah(final asho asho) {
        final aswo aswo = new aswo(asho);
        asho.d(aswo);
        asjv.h((AtomicReference)aswo, this.c.c(aswo, this.a, this.b));
    }
}
