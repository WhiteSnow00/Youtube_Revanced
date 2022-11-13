import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atax extends asht
{
    final asid a;
    final long b;
    final long c;
    final TimeUnit d;
    
    public atax(final long b, final long c, final TimeUnit d, final asid a) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public final void f(final ashy ashy) {
        final ataw ataw = new ataw(ashy);
        ashy.d((asir)ataw);
        final asid a = this.a;
        if (a instanceof athm) {
            final asic a2 = a.a();
            asjv.f((AtomicReference)ataw, (asir)a2);
            a2.c((Runnable)ataw, this.b, this.c, this.d);
            return;
        }
        asjv.f((AtomicReference)ataw, a.d((Runnable)ataw, this.b, this.c, this.d));
    }
}
