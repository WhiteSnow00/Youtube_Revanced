import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aftu extends afrm
{
    private final Object a;
    private int b;
    private boolean c;
    
    public aftu() {
        this.a = new Object();
        this.b = 0;
        this.c = false;
    }
    
    private final void a() {
        synchronized (this.a) {
            final int b = this.b - 1;
            this.b = b;
            if (b == 0) {
                this.a.notifyAll();
            }
        }
    }
    
    public final boolean awaitTermination(long nanos, final TimeUnit timeUnit) {
        nanos = timeUnit.toNanos(nanos);
        final Object a = this.a;
        monitorenter(a);
        try {
            while (!this.c || this.b != 0) {
                if (nanos <= 0L) {
                    monitorexit(a);
                    return false;
                }
                final long nanoTime = System.nanoTime();
                TimeUnit.NANOSECONDS.timedWait(this.a, nanos);
                nanos -= System.nanoTime() - nanoTime;
            }
            monitorexit(a);
            return true;
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void execute(final Runnable runnable) {
        synchronized (this.a) {
            if (!this.c) {
                ++this.b;
                monitorexit(this.a);
                try {
                    runnable.run();
                    return;
                }
                finally {
                    this.a();
                }
            }
            throw new RejectedExecutionException("Executor already shutdown");
        }
    }
    
    public final boolean isShutdown() {
        synchronized (this.a) {
            return this.c;
        }
    }
    
    public final boolean isTerminated() {
        synchronized (this.a) {
            final boolean c = this.c;
            boolean b = false;
            if (c) {
                b = b;
                if (this.b == 0) {
                    b = true;
                }
            }
            return b;
        }
    }
    
    public final void shutdown() {
        synchronized (this.a) {
            this.c = true;
            if (this.b == 0) {
                this.a.notifyAll();
            }
        }
    }
    
    public final List shutdownNow() {
        this.shutdown();
        return Collections.emptyList();
    }
}
