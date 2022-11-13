import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class athm extends asid
{
    @Override
    public final asic a() {
        return (asic)new athl();
    }
    
    @Override
    public final asir c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        try {
            timeUnit.sleep(n);
            atqx.i(runnable).run();
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
            atqx.j((Throwable)ex);
        }
        return (asir)asjw.a;
    }
    
    @Override
    public final asir f(final Runnable runnable) {
        atqx.i(runnable).run();
        return (asir)asjw.a;
    }
}
