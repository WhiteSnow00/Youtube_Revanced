import android.os.Binder;
import android.os.Build$VERSION;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ocm extends ThreadPoolExecutor
{
    public ocm(final int n, final int n2, final long n3, final TimeUnit timeUnit, final BlockingQueue blockingQueue, final ThreadFactory threadFactory) {
        super(n, n2, n3, timeUnit, blockingQueue, threadFactory);
    }
    
    @Override
    protected final void afterExecute(final Runnable runnable, final Throwable t) {
        super.afterExecute(runnable, t);
        if (Build$VERSION.SDK_INT < 31) {
            Binder.flushPendingCommands();
        }
    }
}
