import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afrg extends afrl implements afrf
{
    @Override
    public final void addListener(final Runnable runnable, final Executor executor) {
        super.addListener(runnable, executor);
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        return super.cancel(b);
    }
    
    @Override
    public final Object get() {
        return super.get();
    }
    
    @Override
    public final Object get(final long n, final TimeUnit timeUnit) {
        return super.get(n, timeUnit);
    }
    
    @Override
    public final boolean isCancelled() {
        return super.isCancelled();
    }
    
    @Override
    public final boolean isDone() {
        return super.isDone();
    }
}
