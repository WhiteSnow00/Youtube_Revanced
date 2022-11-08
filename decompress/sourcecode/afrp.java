import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afrp extends afst implements Runnable
{
    ListenableFuture a;
    Object b;
    
    public afrp(final ListenableFuture a, final Object b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public static ListenableFuture e(final ListenableFuture listenableFuture, final aexg aexg, final Executor executor) {
        aexg.getClass();
        final afro afro = new afro(listenableFuture, aexg);
        listenableFuture.addListener((Runnable)afro, afva.h(executor, (afrl)afro));
        return (ListenableFuture)afro;
    }
    
    public static ListenableFuture f(final ListenableFuture listenableFuture, final afry afry, final Executor executor) {
        executor.getClass();
        final afrn afrn = new afrn(listenableFuture, afry);
        listenableFuture.addListener((Runnable)afrn, afva.h(executor, (afrl)afrn));
        return (ListenableFuture)afrn;
    }
    
    protected final void b() {
        ((afrl)this).k((Future)this.a);
        this.a = null;
        this.b = null;
    }
    
    public abstract Object c(final Object p0, final Object p1);
    
    public abstract void d(final Object p0);
    
    protected final String ns() {
        final ListenableFuture a = this.a;
        final Object b = this.b;
        final String ns = super.ns();
        String string2;
        if (a != null) {
            final String string = a.toString();
            final StringBuilder sb = new StringBuilder("inputFuture=[");
            sb.append(string);
            sb.append("], ");
            string2 = sb.toString();
        }
        else {
            string2 = "";
        }
        if (b != null) {
            final String string3 = b.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string2);
            sb2.append("function=[");
            sb2.append(string3);
            sb2.append("]");
            return sb2.toString();
        }
        if (ns != null) {
            return string2.concat(ns);
        }
        return null;
    }
    
    public final void run() {
        final ListenableFuture a = this.a;
        final Object b = this.b;
        final boolean cancelled = ((afrl)this).isCancelled();
        boolean b2 = true;
        final boolean b3 = a == null;
        if (b != null) {
            b2 = false;
        }
        if (cancelled | b3 | b2) {
            return;
        }
        this.a = null;
        if (a.isCancelled()) {
            ((afrl)this).setFuture(a);
            return;
        }
        try {
            final Object u = afva.u((Future)a);
            try {
                final Object c = this.c(b, u);
                this.b = null;
                this.d(c);
            }
            finally {
                try {
                    final Throwable exception;
                    afva.c(exception);
                    ((afrl)this).setException(exception);
                }
                finally {
                    this.b = null;
                }
            }
        }
        catch (final Error exception2) {
            ((afrl)this).setException((Throwable)exception2);
        }
        catch (final RuntimeException exception3) {
            ((afrl)this).setException((Throwable)exception3);
        }
        catch (final ExecutionException ex) {
            ((afrl)this).setException(ex.getCause());
        }
        catch (final CancellationException ex2) {
            ((afrl)this).cancel(false);
        }
    }
}
