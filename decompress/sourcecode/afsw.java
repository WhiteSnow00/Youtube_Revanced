import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afsw extends afbq implements Future, ListenableFuture
{
    protected afsw() {
    }
    
    public final void addListener(final Runnable runnable, final Executor executor) {
        this.ru().addListener(runnable, executor);
    }
    
    public boolean cancel(final boolean b) {
        return this.rv().cancel(b);
    }
    
    public Object get() {
        return this.rv().get();
    }
    
    public Object get(final long n, final TimeUnit timeUnit) {
        return this.rv().get(n, timeUnit);
    }
    
    public final boolean isCancelled() {
        return this.rv().isCancelled();
    }
    
    public final boolean isDone() {
        return this.rv().isDone();
    }
    
    protected abstract ListenableFuture ru();
}
