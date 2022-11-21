import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class askz
{
    static final long a;
    
    static {
        a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L));
    }
    
    public static final long e(final TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }
    
    public abstract asky a();
    
    public asln c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        final asky a = this.a();
        final askv askv = new askv(aqvq.v(runnable), a);
        a.b(askv, n, timeUnit);
        return askv;
    }
    
    public asln d(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        final asky a = this.a();
        final askw askw = new askw(aqvq.v(runnable), a);
        final asln c = a.c(askw, n, n2, timeUnit);
        if (c == asms.a) {
            return c;
        }
        return askw;
    }
    
    public asln f(final Runnable runnable) {
        return this.c(runnable, 0L, TimeUnit.NANOSECONDS);
    }
}
