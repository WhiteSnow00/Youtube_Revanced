import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;

// 
// Decompiled by Procyon v0.6.0
// 

final class odg implements RunnableScheduledFuture
{
    private final RunnableScheduledFuture a;
    
    public odg(final RunnableScheduledFuture a) {
        this.a = a;
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        return this.a.cancel(b);
    }
    
    @Override
    public final Object get() {
        return this.a.get();
    }
    
    @Override
    public final Object get(final long n, final TimeUnit timeUnit) {
        return odh.a(this.a, n, timeUnit);
    }
    
    @Override
    public final long getDelay(final TimeUnit timeUnit) {
        long n;
        if (TimeUnit.NANOSECONDS.convert(n = this.a.getDelay(timeUnit), timeUnit) > 2147483647999999999L) {
            n = timeUnit.convert(2147483647999999999L, TimeUnit.NANOSECONDS);
        }
        return n;
    }
    
    @Override
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }
    
    @Override
    public final boolean isDone() {
        return this.a.isDone();
    }
    
    @Override
    public final boolean isPeriodic() {
        return this.a.isPeriodic();
    }
    
    @Override
    public final void run() {
        this.a.run();
    }
}
