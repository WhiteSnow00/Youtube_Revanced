import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.List;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afwm extends affg implements ExecutorService
{
    protected afwm() {
    }
    
    @Override
    protected /* bridge */ Object a() {
        throw null;
    }
    
    @Override
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        return this.d().awaitTermination(n, timeUnit);
    }
    
    protected abstract ExecutorService d();
    
    @Override
    public void execute(final Runnable runnable) {
        this.d().execute(runnable);
    }
    
    @Override
    public final List invokeAll(final Collection collection) {
        return this.d().invokeAll((Collection<? extends Callable<Object>>)collection);
    }
    
    @Override
    public final List invokeAll(final Collection collection, final long n, final TimeUnit timeUnit) {
        return this.d().invokeAll((Collection<? extends Callable<Object>>)collection, n, timeUnit);
    }
    
    @Override
    public final Object invokeAny(final Collection collection) {
        return this.d().invokeAny((Collection<? extends Callable<Object>>)collection);
    }
    
    @Override
    public final Object invokeAny(final Collection collection, final long n, final TimeUnit timeUnit) {
        return this.d().invokeAny((Collection<? extends Callable<Object>>)collection, n, timeUnit);
    }
    
    @Override
    public final boolean isShutdown() {
        return this.d().isShutdown();
    }
    
    @Override
    public final boolean isTerminated() {
        return this.d().isTerminated();
    }
    
    @Override
    public void shutdown() {
        this.d().shutdown();
    }
    
    @Override
    public List shutdownNow() {
        return this.d().shutdownNow();
    }
    
    @Override
    public Future submit(final Runnable runnable) {
        return this.d().submit(runnable);
    }
    
    @Override
    public Future submit(final Runnable runnable, final Object o) {
        return this.d().submit(runnable, o);
    }
    
    @Override
    public Future submit(final Callable callable) {
        return this.d().submit((Callable<Object>)callable);
    }
}
