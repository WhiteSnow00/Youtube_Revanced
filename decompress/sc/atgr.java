import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atgr extends asid
{
    static final asid b;
    final Executor c;
    
    static {
        final asid a = atjj.a;
        final asjr h = atqx.h;
        b = a;
    }
    
    public atgr(final Executor c) {
        this.c = c;
    }
    
    @Override
    public final asic a() {
        return (asic)new atgq(this.c);
    }
    
    @Override
    public final asir c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        final Runnable i = atqx.i(runnable);
        if (this.c instanceof ScheduledExecutorService) {
            try {
                final athe athe = new athe(i);
                ((atgi)athe).a(((ScheduledExecutorService)this.c).schedule((Callable<Object>)athe, n, timeUnit));
                return (asir)athe;
            }
            catch (final RejectedExecutionException ex) {
                atqx.j((Throwable)ex);
                return (asir)asjw.a;
            }
        }
        final atgn atgn = new atgn(i);
        asjv.h(atgn.a, atgr.b.c((Runnable)new ymr(this, atgn, 4), n, timeUnit));
        return atgn;
    }
    
    @Override
    public final asir d(Runnable i, final long n, final long n2, final TimeUnit timeUnit) {
        if (this.c instanceof ScheduledExecutorService) {
            i = atqx.i(i);
            try {
                final athd athd = new athd(i);
                ((atgi)athd).a(((ScheduledExecutorService)this.c).scheduleAtFixedRate((Runnable)athd, n, n2, timeUnit));
                return (asir)athd;
            }
            catch (final RejectedExecutionException ex) {
                atqx.j((Throwable)ex);
                return (asir)asjw.a;
            }
        }
        return super.d(i, n, n2, timeUnit);
    }
    
    @Override
    public final asir f(Runnable i) {
        i = atqx.i(i);
        try {
            if (this.c instanceof ExecutorService) {
                final athe athe = new athe(i);
                ((atgi)athe).a(((ExecutorService)this.c).submit((Callable<Object>)athe));
                return (asir)athe;
            }
            final atgo atgo = new atgo(i);
            this.c.execute(atgo);
            return atgo;
        }
        catch (final RejectedExecutionException ex) {
            atqx.j((Throwable)ex);
            return (asir)asjw.a;
        }
    }
}
