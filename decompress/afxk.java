import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public interface afxk extends ScheduledExecutorService, afxj
{
    afxi e(final Runnable p0, final long p1, final TimeUnit p2);
    
    afxi f(final Callable p0, final long p1, final TimeUnit p2);
    
    afxi g(final Runnable p0, final long p1, final long p2, final TimeUnit p3);
    
    afxi h(final Runnable p0, final long p1, final long p2, final TimeUnit p3);
}
