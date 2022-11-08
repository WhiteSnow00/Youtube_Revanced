import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.lang.ref.WeakReference;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acf implements ListenableFuture
{
    final WeakReference a;
    public final aca b;
    
    public acf(final acb acb) {
        this.b = (aca)new ace(this);
        this.a = new WeakReference((T)acb);
    }
    
    public final boolean a(final Throwable t) {
        final aca b = this.b;
        aca.f((Object)t);
        if (aca.b.d(b, (Object)null, (Object)new abt(t))) {
            aca.d(b);
            return true;
        }
        return false;
    }
    
    public final void addListener(final Runnable runnable, final Executor executor) {
        this.b.addListener(runnable, executor);
    }
    
    public final boolean cancel(final boolean b) {
        final acb acb = (acb)this.a.get();
        boolean cancel;
        final boolean b2 = cancel = this.b.cancel(b);
        if (b2) {
            cancel = b2;
            if (acb != null) {
                acb.a = null;
                acb.b = null;
                ((aca)acb.c).e((Object)null);
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
