import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public class aae implements ListenableFuture
{
    private final ListenableFuture a;
    public acb b;
    
    public aae() {
        this.a = sl.c((acd)new aak(this, 1));
    }
    
    public aae(final ListenableFuture a) {
        aff.k((Object)a);
        this.a = a;
    }
    
    public static aae a(final ListenableFuture listenableFuture) {
        aae aae;
        if (listenableFuture instanceof aae) {
            aae = (aae)listenableFuture;
        }
        else {
            aae = new aae(listenableFuture);
        }
        return aae;
    }
    
    public final void addListener(final Runnable runnable, final Executor executor) {
        this.a.addListener(runnable, executor);
    }
    
    public final void b(final Throwable t) {
        final acb b = this.b;
        if (b != null) {
            b.d(t);
        }
    }
    
    public boolean cancel(final boolean b) {
        return this.a.cancel(b);
    }
    
    public Object get() {
        return this.a.get();
    }
    
    public Object get(final long n, final TimeUnit timeUnit) {
        return this.a.get(n, timeUnit);
    }
    
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }
    
    public final boolean isDone() {
        return this.a.isDone();
    }
}
