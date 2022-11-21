import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

final class asun extends AtomicLong implements aunb
{
    private static final long serialVersionUID = -4453897557930727610L;
    final auna a;
    volatile asuo b;
    long c;
    
    public asun(final auna a) {
        this.a = a;
    }
    
    @Override
    public final void e(final long n) {
        if (atkw.h(n)) {
            auop.B((AtomicLong)this, n);
            final asuo b = this.b;
            if (b != null) {
                b.d();
            }
        }
    }
    
    @Override
    public final void ts() {
        if (this.get() != Long.MIN_VALUE && this.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            final asuo b = this.b;
            if (b != null) {
                b.g(this);
                b.d();
            }
        }
    }
}
