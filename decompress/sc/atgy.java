import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atgy extends asid
{
    static final athc b;
    static final athc c;
    static final atgx d;
    static final atgv e;
    private static final long h;
    private static final TimeUnit i;
    final ThreadFactory f;
    final AtomicReference g;
    
    static {
        i = TimeUnit.SECONDS;
        h = Long.getLong("rx2.io-keep-alive-time", 60L);
        ((atha)(d = new atgx((ThreadFactory)new athc("RxCachedThreadSchedulerShutdown")))).dispose();
        final int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5)));
        final athc athc = b = new athc("RxCachedThreadScheduler", max);
        c = new athc("RxCachedWorkerPoolEvictor", max);
        (e = new atgv(0L, (TimeUnit)null, (ThreadFactory)athc)).a();
    }
    
    public atgy() {
        final athc b = atgy.b;
        this.f = (ThreadFactory)b;
        final atgv e = atgy.e;
        final AtomicReference g = new AtomicReference(e);
        this.g = g;
        final atgv atgv = new atgv(atgy.h, atgy.i, (ThreadFactory)b);
        while (!g.compareAndSet((Object)e, (Object)atgv)) {
            if (g.get() != e) {
                atgv.a();
            }
        }
    }
    
    @Override
    public final asic a() {
        return (asic)new atgw((atgv)this.g.get());
    }
}
