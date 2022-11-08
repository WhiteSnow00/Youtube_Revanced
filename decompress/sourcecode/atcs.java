import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atcs extends ashe
{
    final asho a;
    final long b;
    final TimeUnit c;
    
    public atcs(final long b, final TimeUnit c, final asho a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public final void f(final ashj ashj) {
        final atcr atcr = new atcr(ashj);
        ashj.d((asic)atcr);
        asjg.i((AtomicReference)atcr, this.a.c((Runnable)atcr, this.b, this.c));
    }
}
