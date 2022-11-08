import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class astq extends AtomicReference implements asgw
{
    private static final long serialVersionUID = 3256684027868224024L;
    final astp a;
    final int b;
    boolean c;
    
    public astq(final astp a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        final astp a = this.a;
        final int b = this.b;
        a.h = true;
        athh.f(a.e);
        a.g(b);
        aubt.x(a.a, t, (AtomicInteger)a, a.g);
    }
    
    public final void f(final aujq aujq) {
        athh.k(this, aujq, Long.MAX_VALUE);
    }
    
    public final void tr(final Object o) {
        if (!this.c) {
            this.c = true;
        }
        this.a.d.set(this.b, o);
    }
    
    public final void tu() {
        final astp a = this.a;
        final int b = this.b;
        if (!this.c) {
            a.h = true;
            athh.f(a.e);
            a.g(b);
            aubt.v(a.a, (AtomicInteger)a, a.g);
        }
    }
}
