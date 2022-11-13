import java.util.concurrent.atomic.AtomicLongArray;

// 
// Decompiled by Procyon v0.6.0
// 

final class atdy implements aukg
{
    final int a;
    final int b;
    final atdz c;
    
    public atdy(final atdz c, final int a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void e(final long n) {
        if (athz.h(n)) {
            final AtomicLongArray b = this.c.b;
            long value;
            do {
                value = b.get(this.a);
                if (value == Long.MAX_VALUE) {
                    return;
                }
            } while (!b.compareAndSet(this.a, value, asfn.y(value, n)));
            if (this.c.l.get() == this.b) {
                this.c.d();
            }
        }
    }
    
    public final void tt() {
        if (this.c.b.compareAndSet(this.a + this.b, 0L, 1L)) {
            final atdz c = this.c;
            final int b = this.b;
            if (c.b.decrementAndGet(b + b) == 0L) {
                c.k = true;
                c.f.tt();
                if (c.getAndIncrement() == 0) {
                    c.g.c();
                }
            }
        }
    }
}
