import java.util.Iterator;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.Set;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class afrs extends afrw
{
    private static final Logger c;
    public afci a;
    private final boolean d;
    private final boolean e;
    
    static {
        c = Logger.getLogger(afrs.class.getName());
    }
    
    public afrs(final afci a, final boolean d, final boolean e) {
        super(a.size());
        a.getClass();
        this.a = a;
        this.d = d;
        this.e = e;
    }
    
    private final void p(final Throwable exception) {
        exception.getClass();
        if (this.d && !((afrl)this).setException(exception)) {
            Set set;
            if ((set = super.seenExceptions) == null) {
                final Set q = aesy.q();
                this.c(q);
                afrw.b.b((afrw)this, q);
                set = super.seenExceptions;
                set.getClass();
            }
            if (r(set, exception)) {
                q(exception);
                return;
            }
        }
        if (exception instanceof Error) {
            q(exception);
        }
    }
    
    private static void q(final Throwable t) {
        String s;
        if (!(t instanceof Error)) {
            s = "Got more than one input Future failure. Logging failures after the first";
        }
        else {
            s = "Input Future failed with Error";
        }
        afrs.c.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", s, t);
    }
    
    private static boolean r(final Set set, Throwable cause) {
        while (cause != null) {
            if (!set.add(cause)) {
                return false;
            }
            cause = cause.getCause();
        }
        return true;
    }
    
    protected final void b() {
        final afci a = this.a;
        int n = 1;
        this.o(1);
        final boolean cancelled = ((afrl)this).isCancelled();
        if (a == null) {
            n = 0;
        }
        if ((n & (cancelled ? 1 : 0)) != 0x0) {
            final boolean l = ((afrl)this).l();
            final afie k = a.k();
            while (((Iterator)k).hasNext()) {
                ((Future)((Iterator)k).next()).cancel(l);
            }
        }
    }
    
    public final void c(final Set set) {
        set.getClass();
        if (!((afrl)this).isCancelled()) {
            final Throwable h = ((afrl)this).h();
            h.getClass();
            r(set, h);
        }
    }
    
    public abstract void d(final int p0, final Object p1);
    
    public final void e(final int n, final Future error) {
        try {
            this.d(n, afva.u((Future)error));
        }
        catch (final Error error) {
            goto Label_0015;
        }
        catch (final RuntimeException ex) {}
        catch (final ExecutionException ex2) {
            this.p(ex2.getCause());
        }
    }
    
    public final void f(final afci afci) {
        final int a = afrw.b.a((afrw)this);
        int n = 0;
        agot.E(a >= 0, (Object)"Less than 0 remaining futures");
        if (a == 0) {
            if (afci != null) {
                final afie k = afci.k();
                while (((Iterator)k).hasNext()) {
                    final Future future = (Future)((Iterator)k).next();
                    if (!future.isCancelled()) {
                        this.e(n, future);
                    }
                    ++n;
                }
            }
            super.seenExceptions = null;
            this.m();
            this.o(2);
        }
    }
    
    public abstract void m();
    
    final void n() {
        final afci a = this.a;
        a.getClass();
        if (a.isEmpty()) {
            this.m();
            return;
        }
        if (this.d) {
            final afie k = this.a.k();
            int n = 0;
            while (((Iterator)k).hasNext()) {
                final ListenableFuture listenableFuture = (ListenableFuture)((Iterator)k).next();
                listenableFuture.addListener((Runnable)new afrq(this, listenableFuture, n), (Executor)afsl.a);
                ++n;
            }
        }
        else {
            afci a2;
            if (this.e) {
                a2 = this.a;
            }
            else {
                a2 = null;
            }
            final afrr afrr = new afrr(this, a2);
            final afie i = this.a.k();
            while (((Iterator)i).hasNext()) {
                ((ListenableFuture)((Iterator)i).next()).addListener((Runnable)afrr, (Executor)afsl.a);
            }
        }
    }
    
    protected final String ns() {
        final afci a = this.a;
        if (a != null) {
            return "futures=".concat(a.toString());
        }
        return super.ns();
    }
    
    public void o(final int n) {
        this.a = null;
    }
}
