import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class asho
{
    static final long a;
    
    static {
        a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L));
    }
    
    public static final long e(final TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }
    
    public abstract ashn a();
    
    public asic c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        final ashn a = this.a();
        final ashk ashk = new ashk(aulo.q(runnable), a);
        a.b((Runnable)ashk, n, timeUnit);
        return (asic)ashk;
    }
    
    public asic d(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        final ashn a = this.a();
        final ashl ashl = new ashl(aulo.q(runnable), a);
        final asic c = a.c((Runnable)ashl, n, n2, timeUnit);
        if (c == asjh.a) {
            return c;
        }
        return (asic)ashl;
    }
    
    public asic f(final Runnable runnable) {
        return this.c(runnable, 0L, TimeUnit.NANOSECONDS);
    }
}
