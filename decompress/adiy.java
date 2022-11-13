import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adiy implements ten
{
    private final int a;
    private final Object b;
    
    public adiy(final atke b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public adiy(final Executor b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final Runnable a(final Runnable runnable) {
        return runnable;
    }
    
    public final Callable b(final Callable callable) {
        return callable;
    }
    
    public final void c(final Throwable t) {
        if (this.a != 0) {
            ttr.d("Crashing on uncaught exception", t);
            ((Executor)this.b).execute((Runnable)new srv(t, 17));
            return;
        }
        ttr.d("Background Thread Uncaught Exception, log serverside", t);
        ((aekp)((atke)this.b).a()).o(Thread.currentThread(), t);
    }
    
    public final void d() {
    }
    
    public final void e(final Throwable t) {
        if (this.a != 0) {
            tbi.i((ten)this, t);
            return;
        }
        tbi.i((ten)this, t);
    }
}
