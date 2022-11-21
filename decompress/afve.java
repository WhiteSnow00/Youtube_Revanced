import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.AbstractExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afve extends AbstractExecutorService implements afxj
{
    @Override
    public final ListenableFuture j(final Runnable runnable, final Object o) {
        return (ListenableFuture)super.submit(runnable, o);
    }
    
    @Override
    protected final RunnableFuture newTaskFor(final Runnable runnable, final Object o) {
        return (RunnableFuture)afyc.e(runnable, o);
    }
    
    @Override
    protected final RunnableFuture newTaskFor(final Callable callable) {
        return (RunnableFuture)afyc.d(callable);
    }
    
    @Override
    public final ListenableFuture rC(final Runnable runnable) {
        return (ListenableFuture)super.submit(runnable);
    }
    
    @Override
    public ListenableFuture rz(final Callable callable) {
        return (ListenableFuture)super.submit((Callable<Object>)callable);
    }
    
    @Override
    public final /* bridge */ Future submit(final Runnable runnable) {
        return (Future)this.rC(runnable);
    }
    
    @Override
    public final /* bridge */ Future submit(final Runnable runnable, final Object o) {
        return (Future)this.j(runnable, o);
    }
    
    @Override
    public /* bridge */ Future submit(final Callable callable) {
        return (Future)this.rz(callable);
    }
}
