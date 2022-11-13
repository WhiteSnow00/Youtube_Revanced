import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atdk extends asht
{
    final asid a;
    final long b;
    final TimeUnit c;
    
    public atdk(final long b, final TimeUnit c, final asid a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public final void f(final ashy ashy) {
        final atdj atdj = new atdj(ashy);
        ashy.d((asir)atdj);
        asjv.i((AtomicReference)atdj, this.a.c((Runnable)atdj, this.b, this.c));
    }
}
