import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.AbstractExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afrm extends AbstractExecutorService implements aftr
{
    public final ListenableFuture j(final Runnable runnable, final Object o) {
        return (ListenableFuture)super.submit(runnable, o);
    }
    
    @Override
    protected final RunnableFuture newTaskFor(final Runnable runnable, final Object o) {
        return (RunnableFuture)afuj.e(runnable, o);
    }
    
    @Override
    protected final RunnableFuture newTaskFor(final Callable callable) {
        return (RunnableFuture)afuj.d(callable);
    }
    
    public ListenableFuture rt(final Callable callable) {
        return (ListenableFuture)super.submit((Callable<Object>)callable);
    }
    
    public final ListenableFuture rw(final Runnable runnable) {
        return (ListenableFuture)super.submit(runnable);
    }
}
