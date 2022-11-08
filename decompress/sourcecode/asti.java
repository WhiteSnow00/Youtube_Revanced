import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asti extends asgt
{
    final asho b;
    final long c;
    final TimeUnit d;
    
    public asti(final long c, final TimeUnit d, final asho b) {
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public final void at(final aujp aujp) {
        final asth asth = new asth(aujp);
        aujp.f((aujq)asth);
        asjg.i(asth, this.b.c((Runnable)asth, this.c, this.d));
    }
}
