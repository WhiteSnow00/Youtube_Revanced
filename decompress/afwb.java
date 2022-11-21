import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class afwb extends afxg
{
    private final Executor a;
    final afwc b;
    
    public afwb(final afwc b, final Executor a) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public abstract void c(final Object p0);
    
    @Override
    public final void d(final Throwable exception) {
        afwc.p(this.b);
        if (exception instanceof ExecutionException) {
            ((afvd)this.b).setException(exception.getCause());
            return;
        }
        if (exception instanceof CancellationException) {
            ((afvd)this.b).cancel(false);
            return;
        }
        ((afvd)this.b).setException(exception);
    }
    
    @Override
    public final void e(final Object o) {
        afwc.p(this.b);
        this.c(o);
    }
    
    final void f() {
        try {
            this.a.execute(this);
        }
        catch (final RejectedExecutionException exception) {
            ((afvd)this.b).setException(exception);
        }
    }
    
    @Override
    public final boolean g() {
        return ((afvd)this.b).isDone();
    }
}
