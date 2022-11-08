import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atoh implements atoi
{
    private final AtomicReference a;
    
    public atoh(final atoi atoi) {
        this.a = new AtomicReference((V)atoi);
    }
    
    @Override
    public final Iterator a() {
        final atoi atoi = this.a.getAndSet(null);
        if (atoi != null) {
            return atoi.a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
