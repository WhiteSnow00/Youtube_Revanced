import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class aak implements ListenableFuture
{
    public aak() {
    }
    
    public final void addListener(final Runnable runnable, final Executor executor) {
        afc.j(runnable);
        afc.j(executor);
        try {
            executor.execute(runnable);
        }
        catch (final RuntimeException ex) {
            final StringBuilder sb = new StringBuilder("Experienced RuntimeException while attempting to notify ");
            sb.append(runnable);
            sb.append(" on Executor ");
            sb.append(executor);
            yj.b("ImmediateFuture", sb.toString(), (Throwable)ex);
        }
    }
    
    public final boolean cancel(final boolean b) {
        return false;
    }
    
    public abstract Object get();
    
    public final Object get(final long n, final TimeUnit timeUnit) {
        afc.j(timeUnit);
        return this.get();
    }
    
    public final boolean isCancelled() {
        return false;
    }
    
    public final boolean isDone() {
        return true;
    }
}
