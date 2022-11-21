import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class asky implements asln
{
    public static final long d(final TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }
    
    public asln a(final Runnable runnable) {
        return this.b(runnable, 0L, TimeUnit.NANOSECONDS);
    }
    
    public abstract asln b(final Runnable p0, final long p1, final TimeUnit p2);
    
    public asln c(Runnable v, final long n, long nanos, final TimeUnit timeUnit) {
        final asmv asmv = new asmv();
        final asmv asmv2 = new asmv(asmv);
        v = aqvq.v(v);
        nanos = timeUnit.toNanos(nanos);
        final long d = d(TimeUnit.NANOSECONDS);
        final asln b = this.b(new askx(this, d + timeUnit.toNanos(n), v, d, asmv2, nanos), n, timeUnit);
        if (b == asms.a) {
            return b;
        }
        asmr.h(asmv, b);
        return asmv2;
    }
}
