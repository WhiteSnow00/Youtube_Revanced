import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atgq extends asic implements Runnable
{
    final Executor a;
    final atgf b;
    volatile boolean c;
    final AtomicInteger d;
    final asiq e;
    
    public atgq(final Executor a) {
        this.d = new AtomicInteger();
        this.e = new asiq();
        this.a = a;
        this.b = new atgf();
    }
    
    public final asir a(final Runnable runnable) {
        if (this.c) {
            return (asir)asjw.a;
        }
        final atgo atgo = new atgo(atqx.i(runnable));
        this.b.j(atgo);
        if (this.d.getAndIncrement() == 0) {
            try {
                this.a.execute(this);
            }
            catch (final RejectedExecutionException ex) {
                this.c = true;
                this.b.c();
                atqx.j((Throwable)ex);
                return (asir)asjw.a;
            }
        }
        return (asir)atgo;
    }
    
    public final asir b(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        if (n <= 0L) {
            return this.a(runnable);
        }
        if (this.c) {
            return (asir)asjw.a;
        }
        final asjz asjz = new asjz();
        final asjz asjz2 = new asjz((asir)asjz);
        final athf athf = new athf((Runnable)new atgp(this, asjz2, atqx.i(runnable)), (asju)this.e);
        this.e.c((asir)athf);
        final Executor a = this.a;
        Label_0148: {
            if (a instanceof ScheduledExecutorService) {
                try {
                    athf.a((Future)((ScheduledExecutorService)a).schedule((Callable<Object>)athf, n, timeUnit));
                    break Label_0148;
                }
                catch (final RejectedExecutionException ex) {
                    this.c = true;
                    atqx.j((Throwable)ex);
                    return (asir)asjw.a;
                }
            }
            athf.a((Future)new atgm(atgr.b.c((Runnable)athf, n, timeUnit)));
        }
        asjv.h((AtomicReference)asjz, (asir)athf);
        return (asir)asjz2;
    }
    
    public final void dispose() {
        if (!this.c) {
            this.c = true;
            this.e.dispose();
            if (this.d.getAndIncrement() == 0) {
                this.b.c();
            }
        }
    }
    
    public final void run() {
        final atgf b = this.b;
        int addAndGet = 1;
    Label_0007:
        while (!this.c) {
            do {
                final Runnable runnable = (Runnable)b.tw();
                if (runnable == null) {
                    if (this.c) {
                        b.c();
                        return;
                    }
                    if ((addAndGet = this.d.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue Label_0007;
                }
                else {
                    runnable.run();
                }
            } while (!this.c);
            b.c();
            return;
        }
        b.c();
    }
    
    public final boolean tA() {
        return this.c;
    }
}
