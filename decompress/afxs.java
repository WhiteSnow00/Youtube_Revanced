import java.util.concurrent.TimeUnit;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afxs
{
    public double a;
    public double b;
    public double c;
    public long d;
    public final agpb e;
    private volatile Object f;
    
    public afxs(final agpb e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.e = e;
        this.d = 0L;
    }
    
    public final Object a() {
        final Object f;
        if ((f = this.f) == null) {
            synchronized (this) {
                if (this.f == null) {
                    this.f = new Object();
                }
            }
        }
        return f;
    }
    
    public final void b(final long d) {
        final long d2 = this.d;
        if (d > d2) {
            final double c = this.c;
            final double n = (double)(d - d2);
            Double.isNaN(n);
            this.a = Math.min(this.b, this.a + n / c);
            this.d = d;
        }
    }
    
    @Override
    public final String toString() {
        final Locale root = Locale.ROOT;
        synchronized (this.a()) {
            final double n = (double)TimeUnit.SECONDS.toMicros(1L);
            final double c = this.c;
            Double.isNaN(n);
            final double n2 = n / c;
            monitorexit(this.a());
            return String.format(root, "RateLimiter[stableRate=%3.1fqps]", n2);
        }
    }
}
