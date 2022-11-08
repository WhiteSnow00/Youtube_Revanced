import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class atgc implements Callable, asic
{
    static final FutureTask a;
    final Runnable b;
    final AtomicReference c;
    final AtomicReference d;
    final ExecutorService e;
    Thread f;
    
    static {
        a = new FutureTask(asju.b, null);
    }
    
    public atgc(final Runnable b, final ExecutorService e) {
        this.b = b;
        this.d = new AtomicReference();
        this.c = new AtomicReference();
        this.e = e;
    }
    
    final void a(final Future future) {
        Future future2;
        do {
            future2 = this.d.get();
            if (future2 == atgc.a) {
                future.cancel(this.f != Thread.currentThread());
            }
        } while (!atvp.d(this.d, (Object)future2, (Object)future));
    }
    
    public final void dispose() {
        final AtomicReference d = this.d;
        final FutureTask a = atgc.a;
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
    
    public final boolean tx() {
        return this.d.get() == atgc.a;
    }
}
