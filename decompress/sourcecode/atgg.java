import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atgg extends asho
{
    static final atgk b;
    static final atgk c;
    static final atgf d;
    static final atgd e;
    private static final long h;
    private static final TimeUnit i;
    final ThreadFactory f;
    final AtomicReference g;
    
    static {
        i = TimeUnit.SECONDS;
        h = Long.getLong("rx2.io-keep-alive-time", 60L);
        ((atgi)(d = new atgf((ThreadFactory)new atgk("RxCachedThreadSchedulerShutdown")))).dispose();
        final int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5)));
        final atgk atgk = b = new atgk("RxCachedThreadScheduler", max);
        c = new atgk("RxCachedWorkerPoolEvictor", max);
        (e = new atgd(0L, null, atgk)).a();
    }
    
    public atgg() {
        final atgk b = atgg.b;
        this.f = b;
        final atgd e = atgg.e;
        final AtomicReference g = new AtomicReference(e);
        this.g = g;
        final atgd atgd = new atgd(atgg.h, atgg.i, b);
        while (!g.compareAndSet((Object)e, (Object)atgd)) {
            if (g.get() != e) {
                atgd.a();
            }
        }
    }
    
    public final ashn a() {
        return (ashn)new atge((atgd)this.g.get());
    }
}
