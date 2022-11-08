import java.util.concurrent.TimeUnit;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asad
{
    private final Random a;
    private final long b;
    private final long c;
    private long d;
    
    public asad() {
        this.a = new Random();
        final long nanos = TimeUnit.SECONDS.toNanos(1L);
        this.b = nanos;
        this.c = TimeUnit.MINUTES.toNanos(2L);
        this.d = nanos;
    }
    
    public final long a() {
        final long d = this.d;
        final double n = (double)d;
        Double.isNaN(n);
        this.d = Math.min((long)(1.6 * n), this.c);
        Double.isNaN(n);
        final double n2 = -0.2 * n;
        Double.isNaN(n);
        final double n3 = n * 0.2;
        agot.u(n3 >= n2);
        return d + (long)(this.a.nextDouble() * (n3 - n2) + n2);
    }
}
