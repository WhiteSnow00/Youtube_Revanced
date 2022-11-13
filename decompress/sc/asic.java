import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class asic implements asir
{
    public static final long d(final TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }
    
    public asir a(final Runnable runnable) {
        return this.b(runnable, 0L, TimeUnit.NANOSECONDS);
    }
    
    public abstract asir b(final Runnable p0, final long p1, final TimeUnit p2);
    
    public asir c(Runnable i, final long n, long nanos, final TimeUnit timeUnit) {
        final asjz asjz = new asjz();
        final asjz asjz2 = new asjz(asjz);
        i = atqx.i(i);
        nanos = timeUnit.toNanos(nanos);
        final long d = d(TimeUnit.NANOSECONDS);
        final asir b = this.b(new asib(this, d + timeUnit.toNanos(n), i, d, asjz2, nanos), n, timeUnit);
        if (b == asjw.a) {
            return b;
        }
        asjv.h(asjz, b);
        return asjz2;
    }
}
