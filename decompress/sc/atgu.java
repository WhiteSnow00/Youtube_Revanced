import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class atgu implements Callable, asir
{
    static final FutureTask a;
    final Runnable b;
    final AtomicReference c;
    final AtomicReference d;
    final ExecutorService e;
    Thread f;
    
    static {
        a = new FutureTask(askj.b, null);
    }
    
    public atgu(final Runnable b, final ExecutorService e) {
        this.b = b;
        this.d = new AtomicReference();
        this.c = new AtomicReference();
        this.e = e;
    }
    
    final void a(final Future future) {
        Future future2;
        do {
            future2 = this.d.get();
            if (future2 == atgu.a) {
                future.cancel(this.f != Thread.currentThread());
            }
        } while (!atzb.d(this.d, future2, future));
    }
    
    @Override
    public final /* bridge */ Object call() {
        this.f = Thread.currentThread();
        try {
            this.b.run();
            final Future<Object> submit = this.e.submit((Callable<Object>)this);
            Future future;
            do {
                future = this.c.get();
                if (future == atgu.a) {
                    submit.cancel(this.f != Thread.currentThread());
                    break;
                }
            } while (!atzb.d(this.c, future, submit));
            this.f = null;
        }
        finally {
            this.f = null;
            final Throwable t;
            atqx.j(t);
        }
        return null;
    }
    
    @Override
    public final void dispose() {
        final AtomicReference d = this.d;
        final FutureTask a = atgu.a;
        final Future future = d.getAndSet(a);
        final boolean b = true;
        if (future != null && future != a) {
            future.cancel(this.f != Thread.currentThread());
        }
        final Future future2 = this.c.getAndSet(a);
        if (future2 != null && future2 != a) {
            future2.cancel(this.f != Thread.currentThread() && b);
        }
    }
    
    @Override
    public final boolean tA() {
        return this.d.get() == atgu.a;
    }
}
