import java.util.concurrent.Callable;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ScheduledThreadPoolExecutor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ocl extends ScheduledThreadPoolExecutor
{
    public ocl(final ThreadFactory threadFactory) {
        super(1, threadFactory);
    }
    
    @Override
    protected final RunnableScheduledFuture decorateTask(final Runnable runnable, final RunnableScheduledFuture runnableScheduledFuture) {
        return odh.b(runnableScheduledFuture);
    }
    
    @Override
    protected final RunnableScheduledFuture decorateTask(final Callable callable, final RunnableScheduledFuture runnableScheduledFuture) {
        return odh.b(runnableScheduledFuture);
    }
}
