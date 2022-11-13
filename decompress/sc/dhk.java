import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.List;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhk implements ExecutorService
{
    public static final long a;
    private static volatile int b;
    private final ExecutorService c;
    
    static {
        a = TimeUnit.SECONDS.toMillis(10L);
    }
    
    public dhk(final ExecutorService c) {
        this.c = c;
    }
    
    public static int a() {
        if (dhk.b == 0) {
            dhk.b = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return dhk.b;
    }
    
    @Override
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        return this.c.awaitTermination(n, timeUnit);
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.c.execute(runnable);
    }
    
    @Override
    public final List invokeAll(final Collection collection) {
        return this.c.invokeAll((Collection<? extends Callable<Object>>)collection);
    }
    
    @Override
    public final List invokeAll(final Collection collection, final long n, final TimeUnit timeUnit) {
        return this.c.invokeAll((Collection<? extends Callable<Object>>)collection, n, timeUnit);
    }
    
    @Override
    public final Object invokeAny(final Collection collection) {
        return this.c.invokeAny((Collection<? extends Callable<Object>>)collection);
    }
    
    @Override
    public final Object invokeAny(final Collection collection, final long n, final TimeUnit timeUnit) {
        return this.c.invokeAny((Collection<? extends Callable<Object>>)collection, n, timeUnit);
    }
    
    @Override
    public final boolean isShutdown() {
        return this.c.isShutdown();
    }
    
    @Override
    public final boolean isTerminated() {
        return this.c.isTerminated();
    }
    
    @Override
    public final void shutdown() {
        this.c.shutdown();
    }
    
    @Override
    public final List shutdownNow() {
        return this.c.shutdownNow();
    }
    
    @Override
    public final Future submit(final Runnable runnable) {
        return this.c.submit(runnable);
    }
    
    @Override
    public final Future submit(final Runnable runnable, final Object o) {
        return this.c.submit(runnable, o);
    }
    
    @Override
    public final Future submit(final Callable callable) {
        return this.c.submit((Callable<Object>)callable);
    }
    
    @Override
    public final String toString() {
        return this.c.toString();
    }
}
