import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class askx implements Runnable
{
    final Runnable a;
    final asmv b;
    final long c;
    long d;
    long e;
    long f;
    final asky g;
    
    public askx(final asky g, final long f, final Runnable a, final long e, final asmv b, final long c) {
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
        if (!this.b.tz()) {
            final long d = asky.d(TimeUnit.NANOSECONDS);
            final long a = askz.a;
            final long e = this.e;
            long n = 0L;
            Label_0133: {
                if (a + d >= e) {
                    final long c = this.c;
                    if (d < e + c + askz.a) {
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
            asmr.h(this.b, this.g.b(this, n - d, TimeUnit.NANOSECONDS));
        }
    }
}
