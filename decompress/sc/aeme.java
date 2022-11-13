import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.List;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.ArrayDeque;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.Deque;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeme implements ExecutorService
{
    public final Deque a;
    public boolean b;
    public int c;
    private final Executor d;
    private final boolean e;
    private ListenableFuture f;
    private final aemd g;
    
    private aeme(final Executor d, final boolean e) {
        this.a = new ArrayDeque();
        this.c = 1;
        this.g = new aemd(this, 0);
        this.d = d;
        this.e = e;
    }
    
    public static aeme c(final Executor executor, final boolean b) {
        return new aeme(executor, b);
    }
    
    public final void a() {
        qdt.h();
        synchronized (this.a) {
            this.b = false;
            monitorexit(this.a);
            this.execute(afwb.a);
        }
    }
    
    @Override
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
    
    public final void b() {
        qdt.h();
        synchronized (this.a) {
            this.b = true;
            this.c = 1;
            final ListenableFuture f = this.f;
            if (f != null) {
                f.cancel(false);
                this.f = null;
            }
        }
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        runnable.getClass();
        synchronized (this.a) {
            Label_0093: {
                if (!this.b) {
                    final int c = this.c;
                    if (c != 3) {
                        if (c != 2) {
                            this.a.add(runnable);
                            this.f = afwm.p(aeun.h((Runnable)this.g), this.d);
                            this.c = 2;
                            monitorexit(this.a);
                            break Label_0093;
                        }
                    }
                }
                this.a.add(runnable);
                monitorexit(this.a);
            }
            synchronized (this.a) {
                final boolean l = qdt.l();
                int n2;
                final int n = n2 = 0;
                if (l) {
                    n2 = n;
                    if (this.e) {
                        n2 = n;
                        if (!this.b) {
                            n2 = n;
                            if (this.c != 3) {
                                final ListenableFuture f = this.f;
                                f.getClass();
                                f.cancel(false);
                                this.f = null;
                                this.c = 2;
                                n2 = 1;
                            }
                        }
                    }
                }
                monitorexit(this.a);
                if (n2 != 0) {
                    this.g.run();
                }
            }
        }
    }
    
    @Override
    public final List invokeAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final List invokeAll(final Collection collection, final long n, final TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Object invokeAny(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Object invokeAny(final Collection collection, final long n, final TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean isShutdown() {
        return false;
    }
    
    @Override
    public final boolean isTerminated() {
        return false;
    }
    
    @Override
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Future submit(final Runnable runnable) {
        return (Future)afwm.p(runnable, (Executor)this);
    }
    
    @Override
    public final Future submit(final Runnable runnable, final Object o) {
        return (Future)afwm.q((Callable)new zuj(runnable, o, 11), (Executor)this);
    }
    
    @Override
    public final Future submit(final Callable callable) {
        return (Future)afwm.q(callable, (Executor)this);
    }
}
