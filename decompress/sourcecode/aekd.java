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

public final class aekd implements ExecutorService
{
    public final Deque a;
    public boolean b;
    public int c;
    private final Executor d;
    private final boolean e;
    private ListenableFuture f;
    private final aekc g;
    
    private aekd(final Executor d, final boolean e) {
        this.a = new ArrayDeque();
        this.c = 1;
        this.g = new aekc(this, 0);
        this.d = d;
        this.e = e;
    }
    
    public static aekd c(final Executor executor, final boolean b) {
        return new aekd(executor, b);
    }
    
    public final void a() {
        qcj.s();
        synchronized (this.a) {
            this.b = false;
            monitorexit(this.a);
            this.execute(afua.a);
        }
    }
    
    @Override
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
    
    public final void b() {
        qcj.s();
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
            Label_0089: {
                if (!this.b) {
                    final int c = this.c;
                    if (c != 3) {
                        if (c != 2) {
                            this.a.add(runnable);
                            this.f = afva.p(aesm.h((Runnable)this.g), this.d);
                            this.c = 2;
                            monitorexit(this.a);
                            break Label_0089;
                        }
                    }
                }
                this.a.add(runnable);
                monitorexit(this.a);
            }
            synchronized (this.a) {
                final boolean w = qcj.w();
                int n2;
                final int n = n2 = 0;
                if (w) {
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
        return (Future)afva.p(runnable, (Executor)this);
    }
    
    @Override
    public final Future submit(final Runnable runnable, final Object o) {
        return (Future)afva.q((Callable)new aejg(runnable, o, 4), (Executor)this);
    }
    
    @Override
    public final Future submit(final Callable callable) {
        return (Future)afva.q(callable, (Executor)this);
    }
}
