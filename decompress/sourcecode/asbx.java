import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Callable;
import java.util.List;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

final class asbx implements ScheduledExecutorService
{
    final ScheduledExecutorService a;
    
    public asbx(final ScheduledExecutorService a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        return this.a.awaitTermination(n, timeUnit);
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.a.execute(runnable);
    }
    
    @Override
    public final List invokeAll(final Collection collection) {
        return this.a.invokeAll((Collection<? extends Callable<Object>>)collection);
    }
    
    @Override
    public final List invokeAll(final Collection collection, final long n, final TimeUnit timeUnit) {
        return this.a.invokeAll((Collection<? extends Callable<Object>>)collection, n, timeUnit);
    }
    
    @Override
    public final Object invokeAny(final Collection collection) {
        return this.a.invokeAny((Collection<? extends Callable<Object>>)collection);
    }
    
    @Override
    public final Object invokeAny(final Collection collection, final long n, final TimeUnit timeUnit) {
        return this.a.invokeAny((Collection<? extends Callable<Object>>)collection, n, timeUnit);
    }
    
    @Override
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }
    
    @Override
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }
    
    @Override
    public final ScheduledFuture schedule(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        return this.a.schedule(runnable, n, timeUnit);
    }
    
    @Override
    public final ScheduledFuture schedule(final Callable callable, final long n, final TimeUnit timeUnit) {
        return this.a.schedule((Callable<Object>)callable, n, timeUnit);
    }
    
    @Override
    public final ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        return this.a.scheduleAtFixedRate(runnable, n, n2, timeUnit);
    }
    
    @Override
    public final ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        return this.a.scheduleWithFixedDelay(runnable, n, n2, timeUnit);
    }
    
    @Override
    public final void shutdown() {
        throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
    }
    
    @Override
    public final List shutdownNow() {
        throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
    }
    
    @Override
    public final Future submit(final Runnable runnable) {
        return this.a.submit(runnable);
    }
    
    @Override
    public final Future submit(final Runnable runnable, final Object o) {
        return this.a.submit(runnable, o);
    }
    
    @Override
    public final Future submit(final Callable callable) {
        return this.a.submit((Callable<Object>)callable);
    }
}
