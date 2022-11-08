import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atum
{
    private static final Method a;
    
    static {
        Method a2;
        try {
            ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        }
        finally {
            a2 = null;
        }
        a = a2;
    }
    
    public static final void a(final Executor executor) {
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor)executor;
            }
            else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor == null) {
                return;
            }
            final Method a = atum.a;
            if (a == null) {
                return;
            }
            a.invoke(scheduledThreadPoolExecutor, true);
        }
        finally {}
    }
}
