import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adgv implements tci
{
    private final /* synthetic */ int a;
    private final Object b;
    
    public adgv(final atjj b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public adgv(final Executor b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void c(final Throwable t) {
        if (this.a != 0) {
            trn.d("Crashing on uncaught exception", t);
            ((Executor)this.b).execute((Runnable)new spz(t, 16));
            return;
        }
        trn.d("Background Thread Uncaught Exception, log serverside", t);
        ((aeim)((atjj)this.b).a()).o(Thread.currentThread(), t);
    }
}
