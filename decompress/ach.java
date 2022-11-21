import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.lang.ref.WeakReference;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ach implements ListenableFuture
{
    final WeakReference a;
    public final acc b;
    
    public ach(final acd acd) {
        this.b = (acc)new acg(this);
        this.a = new WeakReference((T)acd);
    }
    
    public final boolean a(final Throwable t) {
        final acc b = this.b;
        acc.f((Object)t);
        if (acc.b.d(b, null, new abv(t))) {
            acc.d(b);
            return true;
        }
        return false;
    }
    
    public final void addListener(final Runnable runnable, final Executor executor) {
        this.b.addListener(runnable, executor);
    }
    
    public final boolean cancel(final boolean b) {
        final acd acd = (acd)this.a.get();
        boolean cancel;
        final boolean b2 = cancel = this.b.cancel(b);
        if (b2) {
            cancel = b2;
            if (acd != null) {
                acd.a = null;
                acd.b = null;
                ((acc)acd.c).e((Object)null);
                cancel = true;
            }
        }
        return cancel;
    }
    
    public final Object get() {
        return this.b.get();
    }
    
    public final Object get(final long n, final TimeUnit timeUnit) {
        return this.b.get(n, timeUnit);
    }
    
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }
    
    public final boolean isDone() {
        return this.b.isDone();
    }
    
    @Override
    public final String toString() {
        return this.b.toString();
    }
}
