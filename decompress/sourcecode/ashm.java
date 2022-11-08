import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class ashm implements Runnable
{
    final Runnable a;
    final asjk b;
    final long c;
    long d;
    long e;
    long f;
    final /* synthetic */ ashn g;
    
    public ashm(final ashn g, final long f, final Runnable a, final long e, final asjk b, final long c) {
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
        if (!this.b.tx()) {
            final long d = ashn.d(TimeUnit.NANOSECONDS);
            final long a = asho.a;
            final long e = this.e;
            long n = 0L;
            Label_0133: {
                if (a + d >= e) {
                    final long c = this.c;
                    if (d < e + c + asho.a) {
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
            asjg.h((AtomicReference)this.b, this.g.b((Runnable)this, n - d, TimeUnit.NANOSECONDS));
        }
    }
}
