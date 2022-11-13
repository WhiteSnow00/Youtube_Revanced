import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import java.util.List;
import io.grpc.Status;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public class asax extends arua
{
    private static final arua c;
    public final aruo a;
    public arua b;
    private final ScheduledFuture d;
    private final Executor e;
    private volatile boolean f;
    private Status g;
    private List h;
    private asaw i;
    private arbu j;
    
    static {
        Logger.getLogger(asax.class.getName());
        c = new asau();
    }
    
    protected asax(final Executor e, final ScheduledExecutorService scheduledExecutorService, final arup arup) {
        this.h = new ArrayList();
        e.getClass();
        this.e = e;
        scheduledExecutorService.getClass();
        this.a = aruo.b();
        ScheduledFuture<?> schedule;
        if (arup == null) {
            schedule = null;
        }
        else {
            final long min = Math.min(Long.MAX_VALUE, arup.b(TimeUnit.NANOSECONDS));
            final long n = Math.abs(min) / TimeUnit.SECONDS.toNanos(1L);
            final long abs = Math.abs(min);
            final long nanos = TimeUnit.SECONDS.toNanos(1L);
            final StringBuilder sb = new StringBuilder();
            if (min < 0L) {
                sb.append("ClientCall started after deadline exceeded. Deadline exceeded after -");
            }
            else {
                sb.append("Deadline exceeded after ");
            }
            sb.append(n);
            sb.append(String.format(Locale.US, ".%09d", abs % nanos));
            sb.append("s. ");
            schedule = scheduledExecutorService.schedule((Runnable)new asat(this, sb, 1), min, TimeUnit.NANOSECONDS);
        }
        this.d = schedule;
    }
    
    private final void j(final Runnable runnable) {
        synchronized (this) {
            if (!this.f) {
                this.h.add(runnable);
                return;
            }
            monitorexit(this);
            runnable.run();
        }
    }
    
    public final void b(final String s, final Throwable t) {
        final Status b = Status.b;
        Status status;
        if (s != null) {
            status = b.withDescription(s);
        }
        else {
            status = b.withDescription("Call cancelled without message");
        }
        Status c = status;
        if (t != null) {
            c = status.c(t);
        }
        this.e(c, false);
    }
    
    public final void c() {
        this.j(new arcu(this, 14));
    }
    
    protected void d() {
    }
    
    public final void e(final Status g, final boolean b) {
        synchronized (this) {
            arbu j;
            boolean b2;
            if (this.b == null) {
                this.i(asax.c);
                j = this.j;
                this.g = g;
                b2 = false;
            }
            else {
                if (b) {
                    return;
                }
                b2 = true;
                j = null;
            }
            monitorexit(this);
            if (b2) {
                this.j((Runnable)new asat(this, g, 0));
            }
            else {
                if (j != null) {
                    this.e.execute((Runnable)new asav(this, j, g, null, null));
                }
                this.h();
            }
            this.d();
        }
    }
    
    public final void f(final int n) {
        if (this.f) {
            this.b.f(n);
            return;
        }
        this.j(new aasq(this, n, 16));
    }
    
    public final void g(final Object o) {
        if (this.f) {
            this.b.g(o);
            return;
        }
        this.j((Runnable)new asat(this, o, 2));
    }
    
    public final void h() {
        final ArrayList h = new ArrayList();
        while (true) {
            monitorenter(this);
            try {
                if (this.h.isEmpty()) {
                    this.h = null;
                    this.f = true;
                    final asaw i = this.i;
                    monitorexit(this);
                    if (i != null) {
                        this.e.execute((Runnable)new asas(this, i));
                    }
                    return;
                }
                final List h2 = this.h;
                this.h = h;
                monitorexit(this);
                final Iterator iterator = h2.iterator();
                while (iterator.hasNext()) {
                    ((Runnable)iterator.next()).run();
                }
                h2.clear();
            }
            finally {
                monitorexit(this);
                while (true) {}
            }
        }
    }
    
    public final void i(final arua b) {
        final arua b2 = this.b;
        adkp.T(b2 == null, "realCall already set to %s", (Object)b2);
        final ScheduledFuture d = this.d;
        if (d != null) {
            d.cancel(false);
        }
        this.b = b;
    }
    
    public final void l(final arbu j, final arwk arwk) {
        adkp.R(this.j == null, (Object)"already started");
        synchronized (this) {
            j.getClass();
            this.j = j;
            final Status g = this.g;
            final boolean f = this.f;
            arbu i = j;
            if (!f) {
                i = new asaw(j, null, null);
                this.i = (asaw)i;
            }
            monitorexit(this);
            if (g != null) {
                this.e.execute((Runnable)new asav(this, i, g, null, null));
                return;
            }
            if (f) {
                this.b.l(i, arwk);
                return;
            }
            this.j((Runnable)new arfj(this, i, arwk, 3, (byte[])null, (byte[])null));
        }
    }
    
    public final String toString() {
        final aezo ab = adkp.ab((Object)this);
        ab.b("realCall", (Object)this.b);
        return ab.toString();
    }
}
