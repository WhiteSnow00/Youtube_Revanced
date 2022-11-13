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

public final class athj extends asid
{
    static final athc b;
    static final ScheduledExecutorService c;
    final AtomicReference d;
    
    static {
        (c = Executors.newScheduledThreadPool(0)).shutdown();
        b = new athc("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5))), true);
    }
    
    public athj() {
        final athc b = athj.b;
        (this.d = new AtomicReference()).lazySet(athh.a((ThreadFactory)b));
    }
    
    @Override
    public final asic a() {
        return (asic)new athi((ScheduledExecutorService)this.d.get());
    }
    
    @Override
    public final asir c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        final athe athe = new athe(atqx.i(runnable));
        Label_0040: {
            if (n > 0L) {
                break Label_0040;
            }
            try {
                Object o = this.d.get().submit((Callable<V>)athe);
                while (true) {
                    ((atgi)athe).a((Future)o);
                    return (asir)athe;
                    o = this.d.get().schedule((Callable<T>)athe, n, timeUnit);
                    continue;
                }
            }
            catch (final RejectedExecutionException ex) {
                atqx.j((Throwable)ex);
                return (asir)asjw.a;
            }
        }
    }
    
    @Override
    public final asir d(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        final Runnable i = atqx.i(runnable);
        if (n2 <= 0L) {
            final ScheduledExecutorService scheduledExecutorService = this.d.get();
            final atgu atgu = new atgu(i, scheduledExecutorService);
            Label_0054: {
                if (n > 0L) {
                    break Label_0054;
                }
                try {
                    Future<Object> future = scheduledExecutorService.submit((Callable<Object>)atgu);
                    while (true) {
                        atgu.a(future);
                        return atgu;
                        future = scheduledExecutorService.schedule((Callable<Object>)atgu, n, timeUnit);
                        continue;
                    }
                }
                catch (final RejectedExecutionException ex) {
                    atqx.j((Throwable)ex);
                    return (asir)asjw.a;
                }
            }
        }
        final athd athd = new athd(i);
        try {
            ((atgi)athd).a(this.d.get().scheduleAtFixedRate((Runnable)athd, n, n2, timeUnit));
            return (asir)athd;
        }
        catch (final RejectedExecutionException ex2) {
            atqx.j((Throwable)ex2);
            return (asir)asjw.a;
        }
    }
}
