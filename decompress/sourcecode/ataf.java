import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ataf extends ashe
{
    final asho a;
    final long b;
    final long c;
    final TimeUnit d;
    
    public ataf(final long b, final long c, final TimeUnit d, final asho a) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public final void f(final ashj ashj) {
        final atae atae = new atae(ashj);
        ashj.d((asic)atae);
        final asho a = this.a;
        if (a instanceof atgu) {
            final ashn a2 = a.a();
            asjg.f((AtomicReference)atae, (asic)a2);
            a2.c((Runnable)atae, this.b, this.c, this.d);
            return;
        }
        asjg.f((AtomicReference)atae, a.d((Runnable)atae, this.b, this.c, this.d));
    }
}
