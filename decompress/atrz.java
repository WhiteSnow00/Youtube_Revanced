import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atrz implements atsa
{
    private final AtomicReference a;
    
    public atrz(final atsa atsa) {
        this.a = new AtomicReference((V)atsa);
    }
    
    @Override
    public final Iterator a() {
        final atsa atsa = this.a.getAndSet(null);
        if (atsa != null) {
            return atsa.a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
