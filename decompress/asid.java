import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class asid
{
    static final long a;
    
    static {
        a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L));
    }
    
    public static final long e(final TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }
    
    public abstract asic a();
    
    public asir c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        final asic a = this.a();
        final ashz ashz = new ashz(atqx.i(runnable), a);
        a.b((Runnable)ashz, n, timeUnit);
        return (asir)ashz;
    }
    
    public asir d(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        final asic a = this.a();
        final asia asia = new asia(atqx.i(runnable), a);
        final asir c = a.c((Runnable)asia, n, n2, timeUnit);
        if (c == asjw.a) {
            return c;
        }
        return (asir)asia;
    }
    
    public asir f(final Runnable runnable) {
        return this.c(runnable, 0L, TimeUnit.NANOSECONDS);
    }
}
