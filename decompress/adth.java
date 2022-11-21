import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import j$.util.Optional;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adth
{
    public static final Executor a;
    
    static {
        a = afwd.a;
    }
    
    public static afxj a(final Optional optional) {
        ExecutorService singleThreadExecutor;
        if (optional.isPresent()) {
            singleThreadExecutor = (ExecutorService)optional.get();
        }
        else {
            singleThreadExecutor = Executors.newSingleThreadExecutor();
        }
        return afxr.c(singleThreadExecutor);
    }
    
    public static afxk b(final Optional optional) {
        if (optional.isPresent()) {
            return afxr.e((ScheduledExecutorService)optional.get());
        }
        final arxs arxs = new arxs(null);
        arxs.k("heartbeat-thread-%d");
        arxs.j(true);
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor)Executors.newScheduledThreadPool(1, arxs.o(arxs));
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        return afxr.e(scheduledThreadPoolExecutor);
    }
}
