import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class afsj extends afto
{
    private final Executor a;
    final /* synthetic */ afsk b;
    
    public afsj(final afsk b, final Executor a) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public abstract void c(final Object p0);
    
    public final void d(final Throwable exception) {
        afsk.p(this.b);
        if (exception instanceof ExecutionException) {
            ((afrl)this.b).setException(exception.getCause());
            return;
        }
        if (exception instanceof CancellationException) {
            ((afrl)this.b).cancel(false);
            return;
        }
        ((afrl)this.b).setException(exception);
    }
    
    public final void e(final Object o) {
        afsk.p(this.b);
        this.c(o);
    }
    
    final void f() {
        try {
            this.a.execute((Runnable)this);
        }
        catch (final RejectedExecutionException exception) {
            ((afrl)this.b).setException(exception);
        }
    }
    
    public final boolean g() {
        return ((afrl)this.b).isDone();
    }
}
