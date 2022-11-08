import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

final class atif extends AtomicLong implements aujq
{
    private static final long serialVersionUID = 3562861878281475070L;
    final aujp a;
    final atig b;
    
    public atif(final aujp a, final atig b) {
        this.a = a;
        this.b = b;
    }
    
    public final void e(final long n) {
        if (athh.h(n)) {
            atnp.j(this, n);
        }
    }
    
    public final void tq() {
        if (this.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.b.aE(this);
        }
    }
}
