import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asuf extends AtomicReference implements ashl
{
    private static final long serialVersionUID = 3256684027868224024L;
    final asue a;
    final int b;
    boolean c;
    
    public asuf(final asue a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        final asue a = this.a;
        final int b = this.b;
        a.h = true;
        athz.f(a.e);
        a.g(b);
        aufk.j(a.a, t, (AtomicInteger)a, a.g);
    }
    
    public final void f(final aukg aukg) {
        athz.k((AtomicReference)this, aukg, Long.MAX_VALUE);
    }
    
    public final void tu(final Object o) {
        if (!this.c) {
            this.c = true;
        }
        this.a.d.set(this.b, o);
    }
    
    public final void tx() {
        final asue a = this.a;
        final int b = this.b;
        if (!this.c) {
            a.h = true;
            athz.f(a.e);
            a.g(b);
            aufk.h(a.a, (AtomicInteger)a, a.g);
        }
    }
}
