import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Queue;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asae implements Executor
{
    private final Thread.UncaughtExceptionHandler a;
    private final Queue b;
    private final AtomicReference c;
    
    public asae(final Thread.UncaughtExceptionHandler a) {
        this.b = new ConcurrentLinkedQueue();
        this.c = new AtomicReference();
        a.getClass();
        this.a = a;
    }
    
    public final void a() {
    Label_0000:
        while (true) {
            final AtomicReference c = this.c;
            final Thread currentThread = Thread.currentThread();
            do {
                if (c.compareAndSet(null, currentThread)) {
                    try {
                        while (true) {
                            final Runnable runnable = this.b.poll();
                            if (runnable == null) {
                                break;
                            }
                            try {
                                runnable.run();
                            }
                            finally {
                                final Throwable t;
                                this.a.uncaughtException(Thread.currentThread(), t);
                            }
                        }
                        this.c.set(null);
                        if (this.b.isEmpty()) {
                            return;
                        }
                        continue Label_0000;
                    }
                    finally {
                        this.c.set(null);
                    }
                }
            } while (c.get() == null);
            break;
        }
    }
    
    public final void b(final Runnable runnable) {
        final Queue b = this.b;
        runnable.getClass();
        b.add(runnable);
    }
    
    public final void c() {
        adme.U(Thread.currentThread() == this.c.get(), "Not called from the SynchronizationContext");
    }
    
    public final asck d(final Runnable runnable, final long n, final TimeUnit timeUnit, final ScheduledExecutorService scheduledExecutorService) {
        final asad asad = new asad(runnable);
        return new asck(asad, (ScheduledFuture)scheduledExecutorService.schedule(new asac(this, asad, runnable), n, timeUnit));
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.b(runnable);
        this.a();
    }
}
