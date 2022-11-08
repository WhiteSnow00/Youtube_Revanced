import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

final class asrc extends AtomicLong implements aujq
{
    private static final long serialVersionUID = -4453897557930727610L;
    final aujp a;
    volatile asrd b;
    long c;
    
    public asrc(final aujp a) {
        this.a = a;
    }
    
    public final void e(final long n) {
        if (athh.h(n)) {
            atnp.j(this, n);
            final asrd b = this.b;
            if (b != null) {
                b.d();
            }
        }
    }
    
    public final void tq() {
        if (this.get() != Long.MIN_VALUE && this.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            final asrd b = this.b;
            if (b != null) {
                b.g(this);
                b.d();
            }
        }
    }
}
