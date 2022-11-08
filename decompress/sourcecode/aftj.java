import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public class aftj extends afrl
{
    public static aftj m(final ListenableFuture listenableFuture) {
        Object o;
        if (listenableFuture instanceof aftj) {
            o = listenableFuture;
        }
        else {
            o = new afsv(listenableFuture);
        }
        return (aftj)o;
    }
    
    public final aftj n(final long n, final TimeUnit timeUnit, final ScheduledExecutorService scheduledExecutorService) {
        return (aftj)afva.t((ListenableFuture)this, n, timeUnit, scheduledExecutorService);
    }
}
