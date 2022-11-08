import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atgp
{
    public static final boolean a;
    public static final int b;
    static final AtomicReference c;
    public static final Map d;
    
    static {
        c = new AtomicReference();
        d = (Map)new ConcurrentHashMap();
        final Properties properties = System.getProperties();
        boolean a2 = false;
        int int1 = 0;
    Label_0091:
        while (true) {
            Label_0061: {
                if (!properties.containsKey("rx2.purge-enabled")) {
                    a2 = true;
                    break Label_0061;
                }
                final boolean boolean1;
                a2 = (boolean1 = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled")));
                if (a2) {
                    break Label_0061;
                }
                int1 = 1;
                a2 = boolean1;
                break Label_0091;
            }
            boolean boolean1 = a2;
            if (!properties.containsKey("rx2.purge-period-seconds")) {
                continue;
            }
            try {
                int1 = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            }
            catch (final NumberFormatException ex) {
                boolean1 = a2;
                continue;
            }
            break;
        }
        a = a2;
        b = int1;
        if (a2) {
        Label_0103:
            while (true) {
                final AtomicReference c2 = atgp.c;
                if (c2.get() != null) {
                    break;
                }
                final ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1, new atgk("RxSchedulerPurge"));
                while (!c2.compareAndSet(null, scheduledThreadPool)) {
                    if (c2.get() != null) {
                        scheduledThreadPool.shutdownNow();
                        continue Label_0103;
                    }
                }
                final aess aess = new aess(5);
                final long n = atgp.b;
                scheduledThreadPool.scheduleAtFixedRate((Runnable)aess, n, n, TimeUnit.SECONDS);
            }
        }
    }
    
    public static ScheduledExecutorService a(final ThreadFactory threadFactory) {
        final ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (atgp.a && scheduledThreadPool instanceof ScheduledThreadPoolExecutor) {
            atgp.d.put(scheduledThreadPool, scheduledThreadPool);
        }
        return scheduledThreadPool;
    }
}
