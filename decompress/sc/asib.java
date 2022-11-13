import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class asib implements Runnable
{
    final Runnable a;
    final asjz b;
    final long c;
    long d;
    long e;
    long f;
    final asic g;
    
    public asib(final asic g, final long f, final Runnable a, final long e, final asjz b, final long c) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final void run() {
        this.a.run();
        if (!this.b.tA()) {
            final long d = asic.d(TimeUnit.NANOSECONDS);
            final long a = asid.a;
            final long e = this.e;
            long n = 0L;
            Label_0133: {
                if (a + d >= e) {
                    final long c = this.c;
                    if (d < e + c + asid.a) {
                        final long f = this.f;
                        final long d2 = this.d + 1L;
                        this.d = d2;
                        n = f + d2 * c;
                        break Label_0133;
                    }
                }
                final long c2 = this.c;
                n = d + c2;
                final long d3 = this.d + 1L;
                this.d = d3;
                this.f = n - c2 * d3;
            }
            this.e = d;
            asjv.h(this.b, this.g.b(this, n - d, TimeUnit.NANOSECONDS));
        }
    }
}
