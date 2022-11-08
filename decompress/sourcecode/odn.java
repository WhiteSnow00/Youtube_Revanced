import java.util.concurrent.Future;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Delayed;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class odn extends afrm implements afts
{
    public final oas a;
    public final Handler b;
    
    public odn(final oas a, final Handler b) {
        this.a = a;
        this.b = b;
    }
    
    public static int a(final Delayed delayed, final Delayed delayed2) {
        final long delay = delayed2.getDelay(TimeUnit.MILLISECONDS);
        final long delay2 = delayed.getDelay(TimeUnit.MILLISECONDS);
        if (delay > delay2) {
            return -1;
        }
        if (delay == delay2) {
            return 0;
        }
        return 1;
    }
    
    private final aftq c(final Runnable runnable, long millis, final long n, final TimeUnit timeUnit, final boolean b) {
        millis = timeUnit.toMillis(millis);
        final odl odl = new odl(this, runnable, millis + this.a.d(), timeUnit.toMillis(n), b);
        this.b.postDelayed((Runnable)odl, millis);
        this.d((ListenableFuture)odl, odl);
        return (aftq)odl;
    }
    
    private final void d(final ListenableFuture listenableFuture, final Runnable runnable) {
        listenableFuture.addListener((Runnable)new nlt(this, runnable, 16), (Executor)afsl.a);
    }
    
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
    
    public final aftq e(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        return this.f(Executors.callable(runnable), n, timeUnit);
    }
    
    public final void execute(final Runnable runnable) {
        this.b.post(runnable);
    }
    
    public final aftq f(final Callable callable, long millis, final TimeUnit timeUnit) {
        millis = timeUnit.toMillis(millis);
        final odm odm = new odm(this, callable, this.a.d() + millis);
        this.b.postDelayed((Runnable)odm, millis);
        this.d((ListenableFuture)odm, odm);
        return (aftq)odm;
    }
    
    public final aftq g(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        return this.c(runnable, n, n2, timeUnit, true);
    }
    
    public final aftq h(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        return this.c(runnable, n, n2, timeUnit, false);
    }
    
    public final boolean isShutdown() {
        return false;
    }
    
    public final boolean isTerminated() {
        return false;
    }
    
    public final ListenableFuture rt(final Callable callable) {
        final SettableFuture create = SettableFuture.create();
        this.b.post((Runnable)new odk(create, callable));
        return (ListenableFuture)create;
    }
    
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }
    
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
