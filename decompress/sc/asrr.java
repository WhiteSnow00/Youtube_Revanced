import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

final class asrr extends AtomicLong implements aukg
{
    private static final long serialVersionUID = -4453897557930727610L;
    final aukf a;
    volatile asrs b;
    long c;
    
    public asrr(final aukf a) {
        this.a = a;
    }
    
    public final void e(final long n) {
        if (athz.h(n)) {
            asfn.x(this, n);
            final asrs b = this.b;
            if (b != null) {
                b.d();
            }
        }
    }
    
    public final void tt() {
        if (this.get() != Long.MIN_VALUE && this.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            final asrs b = this.b;
            if (b != null) {
                b.g(this);
                b.d();
            }
        }
    }
}
