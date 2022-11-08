import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public interface afts extends ScheduledExecutorService, aftr
{
    aftq e(final Runnable p0, final long p1, final TimeUnit p2);
    
    aftq f(final Callable p0, final long p1, final TimeUnit p2);
    
    aftq g(final Runnable p0, final long p1, final long p2, final TimeUnit p3);
    
    aftq h(final Runnable p0, final long p1, final long p2, final TimeUnit p3);
}
