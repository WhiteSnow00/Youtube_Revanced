import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atgr extends asho
{
    static final atgk b;
    static final ScheduledExecutorService c;
    final AtomicReference d;
    
    static {
        (c = Executors.newScheduledThreadPool(0)).shutdown();
        b = new atgk("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5))), true);
    }
    
    public atgr() {
        final atgk b = atgr.b;
        (this.d = new AtomicReference()).lazySet(atgp.a(b));
    }
    
    public final ashn a() {
        return (ashn)new atgq((ScheduledExecutorService)this.d.get());
    }
    
    public final asic c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        final atgm atgm = new atgm(aulo.q(runnable));
        Label_0040: {
            if (n > 0L) {
                break Label_0040;
            }
            try {
                Object o = this.d.get().submit((Callable<V>)atgm);
                while (true) {
                    ((atfq)atgm).a((Future)o);
                    return (asic)atgm;
                    o = this.d.get().schedule((Callable<T>)atgm, n, timeUnit);
                    continue;
                }
            }
            catch (final RejectedExecutionException ex) {
                aulo.r((Throwable)ex);
                return (asic)asjh.a;
            }
        }
    }
    
    public final asic d(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        final Runnable q = aulo.q(runnable);
        if (n2 <= 0L) {
            final ScheduledExecutorService scheduledExecutorService = this.d.get();
            final atgc atgc = new atgc(q, scheduledExecutorService);
            Label_0054: {
                if (n > 0L) {
                    break Label_0054;
                }
                try {
                    Object o = scheduledExecutorService.submit((Callable<V>)atgc);
                    while (true) {
                        atgc.a((Future)o);
                        return (asic)atgc;
                        o = scheduledExecutorService.schedule((Callable<T>)atgc, n, timeUnit);
                        continue;
                    }
                }
                catch (final RejectedExecutionException ex) {
                    aulo.r((Throwable)ex);
                    return (asic)asjh.a;
                }
            }
        }
        final atgl atgl = new atgl(q);
        try {
            ((atfq)atgl).a((Future)this.d.get().scheduleAtFixedRate((Runnable)atgl, n, n2, timeUnit));
            return (asic)atgl;
        }
        catch (final RejectedExecutionException ex2) {
            aulo.r((Throwable)ex2);
            return (asic)asjh.a;
        }
    }
}
