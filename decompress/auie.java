import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.net.SocketTimeoutException;
import java.util.concurrent.LinkedBlockingQueue;
import java.io.InterruptedIOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class auie implements Executor
{
    private final BlockingQueue a;
    private boolean b;
    private boolean c;
    private InterruptedIOException d;
    private RuntimeException e;
    
    public auie() {
        this.a = new LinkedBlockingQueue();
    }
    
    private final Runnable d(final boolean b, final long n) {
        Label_0021: {
            if (b) {
                break Label_0021;
            }
            try {
                Runnable runnable = this.a.take();
                while (true) {
                    if (runnable != null) {
                        return runnable;
                    }
                    throw new SocketTimeoutException();
                    runnable = this.a.poll(n, TimeUnit.NANOSECONDS);
                    continue;
                }
            }
            catch (final InterruptedException ex) {
                final InterruptedIOException ex2 = new InterruptedIOException();
                ex2.initCause(ex);
                throw ex2;
            }
        }
    }
    
    public final void a() {
        this.b(0);
    }
    
    public final void b(final int n) {
        final long nanoTime = System.nanoTime();
        final long convert = TimeUnit.NANOSECONDS.convert(n, TimeUnit.MILLISECONDS);
        if (this.c) {
            final InterruptedIOException d = this.d;
            if (d != null) {
                throw d;
            }
            throw this.e;
        }
        else {
            if (!this.b) {
                this.b = true;
            Label_0080_Outer:
                while (this.b) {
                    while (true) {
                        if (n == 0) {
                            try {
                                this.d(false, 0L).run();
                                continue Label_0080_Outer;
                                this.d(true, convert - System.nanoTime() + nanoTime).run();
                                continue Label_0080_Outer;
                            }
                            catch (final RuntimeException e) {
                                this.b = false;
                                this.c = true;
                                throw this.e = e;
                            }
                            catch (final InterruptedIOException d2) {
                                this.b = false;
                                this.c = true;
                                throw this.d = d2;
                            }
                            break;
                        }
                        continue;
                    }
                }
                return;
            }
            throw new IllegalStateException("Cannot run loop when it is already running.");
        }
    }
    
    public final void c() {
        this.b = false;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        if (runnable != null) {
            try {
                this.a.put(runnable);
                return;
            }
            catch (final InterruptedException ex) {
                throw new RejectedExecutionException(ex);
            }
        }
        throw new IllegalArgumentException();
    }
}
