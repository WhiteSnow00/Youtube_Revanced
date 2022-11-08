import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atgu extends asho
{
    public final ashn a() {
        return (ashn)new atgt();
    }
    
    public final asic c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        try {
            timeUnit.sleep(n);
            aulo.q(runnable).run();
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
            aulo.r((Throwable)ex);
        }
        return (asic)asjh.a;
    }
    
    public final asic f(final Runnable runnable) {
        aulo.q(runnable).run();
        return (asic)asjh.a;
    }
}
