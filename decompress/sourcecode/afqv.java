import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afqv extends afst implements Runnable
{
    ListenableFuture a;
    Class b;
    Object c;
    
    public afqv(final ListenableFuture a, final Class b, final Object c) {
        a.getClass();
        this.a = a;
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public static ListenableFuture e(final ListenableFuture listenableFuture, final Class clazz, final aexg aexg, final Executor executor) {
        final afqu afqu = new afqu(listenableFuture, clazz, aexg);
        listenableFuture.addListener((Runnable)afqu, afva.h(executor, (afrl)afqu));
        return (ListenableFuture)afqu;
    }
    
    public static ListenableFuture f(final ListenableFuture listenableFuture, final Class clazz, final afry afry, final Executor executor) {
        final afqt afqt = new afqt(listenableFuture, clazz, afry);
        listenableFuture.addListener((Runnable)afqt, afva.h(executor, (afrl)afqt));
        return (ListenableFuture)afqt;
    }
    
    protected final void b() {
        ((afrl)this).k((Future)this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }
    
    public abstract Object c(final Object p0, final Throwable p1);
    
    public abstract void d(final Object p0);
    
    protected final String ns() {
        final ListenableFuture a = this.a;
        final Class b = this.b;
        final Object c = this.c;
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
        if (b != null && c != null) {
            final String string3 = b.toString();
            final String string4 = c.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string2);
            sb2.append("exceptionType=[");
            sb2.append(string3);
            sb2.append("], fallback=[");
            sb2.append(string4);
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
        final Class b = this.b;
        final Object c = this.c;
        boolean b2 = true;
        final boolean b3 = a == null;
        final boolean b4 = b == null;
        if (c != null) {
            b2 = false;
        }
        if (!(b2 | (b3 | b4))) {
            if (!((afrl)this).isCancelled()) {
                this.a = null;
                Throwable cause = null;
                Object o = null;
                try {
                    Throwable h;
                    if (a instanceof aful) {
                        h = ((aful)a).h();
                    }
                    else {
                        h = null;
                    }
                    cause = h;
                    if (h != null) {
                        goto Label_0135;
                    }
                    final Object u = afva.u((Future)a);
                    cause = h;
                    o = u;
                }
                catch (final Error cause) {
                    goto Label_0135;
                }
                catch (final RuntimeException ex) {}
                catch (final ExecutionException ex2) {
                    Label_0235: {
                        if ((cause = ex2.getCause()) == null) {
                            final String value = String.valueOf(((Future)a).getClass());
                            final String value2 = String.valueOf(ex2.getClass());
                            final StringBuilder sb = new StringBuilder("Future type ");
                            sb.append(value);
                            sb.append(" threw ");
                            sb.append(value2);
                            sb.append(" without a cause");
                            cause = new NullPointerException(sb.toString());
                            break Label_0235;
                        }
                        break Label_0235;
                    }
                    goto Label_0135;
                }
                if (cause == null) {
                    ((afrl)this).set(o);
                    return;
                }
                if (b.isInstance(cause)) {
                    try {
                        final Object c2 = this.c(c, cause);
                        this.b = null;
                        this.c = null;
                        this.d(c2);
                        return;
                    }
                    finally {
                        try {
                            final Throwable exception;
                            afva.c(exception);
                            ((afrl)this).setException(exception);
                            return;
                        }
                        finally {
                            this.b = null;
                            this.c = null;
                        }
                    }
                }
                ((afrl)this).setFuture(a);
            }
        }
    }
}
