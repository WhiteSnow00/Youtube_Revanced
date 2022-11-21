import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adko implements tfq
{
    private final int a;
    private final Object b;
    
    public adko(final atnb b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public adko(final Executor b, final int a) {
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
            tut.d("Crashing on uncaught exception", t);
            ((Executor)this.b).execute((Runnable)new svg(t, 14));
            return;
        }
        tut.d("Background Thread Uncaught Exception, log serverside", t);
        ((aheu)((atnb)this.b).a()).w(Thread.currentThread(), t);
    }
    
    public final void d() {
    }
    
    public final void e(final Throwable t) {
        if (this.a != 0) {
            tcl.o((tfq)this, t);
            return;
        }
        tcl.o((tfq)this, t);
    }
}
