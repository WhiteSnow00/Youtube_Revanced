import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.lang.ref.WeakReference;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acg implements ListenableFuture
{
    final WeakReference a;
    public final acb b;
    
    public acg(final acc acc) {
        this.b = (acb)new acf(this);
        this.a = new WeakReference((T)acc);
    }
    
    public final boolean a(final Throwable t) {
        final acb b = this.b;
        acb.f((Object)t);
        if (acb.b.d(b, (Object)null, (Object)new abu(t))) {
            acb.d(b);
            return true;
        }
        return false;
    }
    
    public final void addListener(final Runnable runnable, final Executor executor) {
        this.b.addListener(runnable, executor);
    }
    
    public final boolean cancel(final boolean b) {
        final acc acc = (acc)this.a.get();
        boolean cancel;
        final boolean b2 = cancel = this.b.cancel(b);
        if (b2) {
            cancel = b2;
            if (acc != null) {
                acc.a = null;
                acc.b = null;
                ((acb)acc.c).e((Object)null);
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
