import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afsy extends afsu implements aftr
{
    protected afsy() {
    }
    
    protected abstract aftr b();
    
    public ListenableFuture j(final Runnable runnable, final Object o) {
        return this.b().j(runnable, o);
    }
    
    public ListenableFuture rt(final Callable callable) {
        return this.b().rt(callable);
    }
    
    public ListenableFuture rw(final Runnable runnable) {
        return this.b().rw(runnable);
    }
}
