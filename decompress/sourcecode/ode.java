import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ode extends afsy implements afts
{
    protected ode() {
    }
    
    protected abstract afts c();
    
    public aftq e(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        return this.c().e(runnable, n, timeUnit);
    }
    
    public aftq f(final Callable callable, final long n, final TimeUnit timeUnit) {
        return this.c().f(callable, n, timeUnit);
    }
    
    public aftq g(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        return this.c().g(runnable, n, n2, timeUnit);
    }
    
    public aftq h(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        return this.c().h(runnable, n, n2, timeUnit);
    }
}
