import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.List;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afsu extends afbq implements ExecutorService
{
    protected afsu() {
    }
    
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        return this.d().awaitTermination(n, timeUnit);
    }
    
    protected abstract ExecutorService d();
    
    public void execute(final Runnable runnable) {
        this.d().execute(runnable);
    }
    
    public final List invokeAll(final Collection collection) {
        return this.d().invokeAll((Collection<? extends Callable<Object>>)collection);
    }
    
    public final List invokeAll(final Collection collection, final long n, final TimeUnit timeUnit) {
        return this.d().invokeAll((Collection<? extends Callable<Object>>)collection, n, timeUnit);
    }
    
    public final Object invokeAny(final Collection collection) {
        return this.d().invokeAny((Collection<? extends Callable<Object>>)collection);
    }
    
    public final Object invokeAny(final Collection collection, final long n, final TimeUnit timeUnit) {
        return this.d().invokeAny((Collection<? extends Callable<Object>>)collection, n, timeUnit);
    }
    
    public final boolean isShutdown() {
        return this.d().isShutdown();
    }
    
    public final boolean isTerminated() {
        return this.d().isTerminated();
    }
    
    public void shutdown() {
        this.d().shutdown();
    }
    
    public List shutdownNow() {
        return this.d().shutdownNow();
    }
    
    public Future submit(final Runnable runnable) {
        return this.d().submit(runnable);
    }
    
    public Future submit(final Runnable runnable, final Object o) {
        return this.d().submit(runnable, o);
    }
    
    public Future submit(final Callable callable) {
        return this.d().submit((Callable<Object>)callable);
    }
}
