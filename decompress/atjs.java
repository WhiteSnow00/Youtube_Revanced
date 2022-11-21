import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ConcurrentLinkedQueue;

// 
// Decompiled by Procyon v0.6.0
// 

final class atjs implements Runnable
{
    public final long a;
    public final ConcurrentLinkedQueue b;
    final aslm c;
    public final ThreadFactory d;
    private final ScheduledExecutorService e;
    private final Future f;
    
    public atjs(long nanos, final TimeUnit timeUnit, final ThreadFactory d) {
        if (timeUnit != null) {
            nanos = timeUnit.toNanos(nanos);
        }
        else {
            nanos = 0L;
        }
        this.a = nanos;
        this.b = new ConcurrentLinkedQueue();
        this.c = new aslm();
        this.d = d;
        ScheduledExecutorService scheduledThreadPool;
        ScheduledFuture<?> scheduleWithFixedDelay;
        if (timeUnit != null) {
            scheduledThreadPool = Executors.newScheduledThreadPool(1, atjv.c);
            scheduleWithFixedDelay = scheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
        }
        else {
            scheduledThreadPool = null;
            scheduleWithFixedDelay = null;
        }
        this.e = scheduledThreadPool;
        this.f = scheduleWithFixedDelay;
    }
    
    final void a() {
        this.c.dispose();
        final Future f = this.f;
        if (f != null) {
            f.cancel(true);
        }
        final ScheduledExecutorService e = this.e;
        if (e != null) {
            e.shutdownNow();
        }
    }
    
    @Override
    public final void run() {
        if (!this.b.isEmpty()) {
            final long nanoTime = System.nanoTime();
            for (final atju atju : this.b) {
                if (atju.a > nanoTime) {
                    break;
                }
                if (!this.b.remove(atju)) {
                    continue;
                }
                this.c.h((asln)atju);
            }
        }
    }
}
