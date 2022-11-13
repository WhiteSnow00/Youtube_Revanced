import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.concurrent.CancellationException;
import io.grpc.Status;
import java.nio.charset.Charset;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

final class asab extends arua
{
    private static final Logger h;
    public final arwo a;
    public final Executor b;
    public final arzs c;
    public final aruo d;
    public asac e;
    public volatile boolean f;
    public arur g;
    private final boolean i;
    private volatile ScheduledFuture j;
    private final boolean k;
    private artx l;
    private boolean m;
    private boolean n;
    private final ScheduledExecutorService o;
    private final xra p;
    
    static {
        h = Logger.getLogger(asab.class.getName());
        "gzip".getBytes(Charset.forName("US-ASCII"));
    }
    
    public asab(final arwo a, final Executor executor, final artx l, final xra p7, final ScheduledExecutorService o, final arzs c, final byte[] array) {
        this.g = arur.b;
        final aruj a2 = aruj.a;
        this.a = a;
        final String b = a.b;
        System.identityHashCode(this);
        final int a3 = asgy.a;
        final afum a4 = afum.a;
        boolean k = false;
        if (executor == a4) {
            this.b = new asfg();
            this.i = true;
        }
        else {
            this.b = new asfk(executor);
            this.i = false;
        }
        this.c = c;
        this.d = aruo.b();
        final arwn a5 = a.a;
        if (a5 == arwn.a || a5 == arwn.c) {
            k = true;
        }
        this.k = k;
        this.l = l;
        this.p = p7;
        this.o = o;
    }
    
    private final void h(final Object o) {
        adkp.R(this.e != null, (Object)"Not started");
        adkp.R(this.m ^ true, (Object)"call was cancelled");
        adkp.R(this.n ^ true, (Object)"call was half-closed");
        try {
            final asac e = this.e;
            if (e instanceof asfe) {
                final asfe asfe = (asfe)e;
                final asez q = asfe.q;
                if (q.a) {
                    q.f.a.n(asfe.e.b(o));
                }
                else {
                    asfe.s(new aseu(asfe, o));
                }
            }
            else {
                e.n(this.a.b(o));
            }
            if (!this.k) {
                this.e.d();
            }
        }
        catch (final Error error) {
            this.e.c(Status.b.withDescription("Client sendMessage() failed with Error"));
            throw error;
        }
        catch (final RuntimeException ex) {
            this.e.c(Status.b.c((Throwable)ex).withDescription("Failed to stream message"));
        }
    }
    
    public final void b(final String s, final Throwable t) {
        final int a = asgy.a;
        Throwable t2 = t;
        Label_0047: {
            if (s != null || (t2 = t) != null) {
                break Label_0047;
            }
            try {
                t2 = new CancellationException("Cancelled without a message or cause");
                asab.h.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", t2);
                if (this.m) {
                    return;
                }
                this.m = true;
                try {
                    if (this.e != null) {
                        final Status b = Status.b;
                        Status status;
                        if (s != null) {
                            status = b.withDescription(s);
                        }
                        else {
                            status = b.withDescription("Call cancelled without message");
                        }
                        Status c = status;
                        if (t2 != null) {
                            c = status.c(t2);
                        }
                        this.e.c(c);
                    }
                }
                finally {
                    this.e();
                }
            }
            finally {}
        }
    }
    
    public final void c() {
        final int a = asgy.a;
        try {
            adkp.R(this.e != null, (Object)"Not started");
            adkp.R(this.m ^ true, (Object)"call was cancelled");
            adkp.R(this.n ^ true, (Object)"call already half-closed");
            this.n = true;
            this.e.e();
        }
        finally {}
    }
    
    public final arup d() {
        arup b;
        if ((b = this.l.b) == null) {
            b = null;
        }
        return b;
    }
    
    public final void e() {
        final ScheduledFuture j = this.j;
        if (j != null) {
            j.cancel(false);
        }
    }
    
    public final void f(final int n) {
        final int a = asgy.a;
        try {
            adkp.R(this.e != null, (Object)"Not started");
            adkp.I(true, (Object)"Number requested must be non-negative");
            this.e.g(n);
        }
        finally {}
    }
    
    public final void g(final Object o) {
        final int a = asgy.a;
        try {
            this.h(o);
        }
        finally {}
    }
    
    public final void l(final arbu arbu, arwk l) {
        final int a = asgy.a;
        try {
            adkp.R(this.e == null, (Object)"Already started");
            adkp.R(this.m ^ true, (Object)"call was cancelled");
            arbu.getClass();
            l.getClass();
            final asdm asdm = (asdm)this.l.e(asdm.a);
            if (asdm != null) {
                final Long b = asdm.b;
                if (b != null) {
                    final arup c = arup.c((long)b, TimeUnit.NANOSECONDS);
                    final arup b2 = this.l.b;
                    if (b2 == null || c.a(b2) < 0) {
                        this.l = this.l.a(c);
                    }
                }
                final Boolean c2 = asdm.c;
                if (c2 != null) {
                    artx i;
                    if (c2) {
                        i = new artx(this.l);
                        i.e = Boolean.TRUE;
                    }
                    else {
                        i = new artx(this.l);
                        i.e = Boolean.FALSE;
                    }
                    this.l = i;
                }
                final Integer d = asdm.d;
                if (d != null) {
                    final artx j = this.l;
                    final Integer f = j.f;
                    if (f != null) {
                        this.l = j.b(Math.min(f, asdm.d));
                    }
                    else {
                        this.l = j.b((int)d);
                    }
                }
                final Integer e = asdm.e;
                if (e != null) {
                    final artx k = this.l;
                    final Integer g = k.g;
                    if (g != null) {
                        this.l = k.c(Math.min(g, asdm.e));
                    }
                    else {
                        this.l = k.c((int)e);
                    }
                }
            }
            final aruh a2 = arug.a;
            final arur g2 = this.g;
            l.d(asby.f);
            l.d(asby.b);
            if (a2 != arug.a) {
                l.f(asby.b, (Object)"identity");
            }
            l.d(asby.c);
            final byte[] d2 = g2.d;
            if (d2.length != 0) {
                l.f(asby.c, (Object)d2);
            }
            l.d(asby.d);
            l.d(asby.e);
            final arup d3 = this.d();
            if (d3 != null && d3.d()) {
                this.e = (asac)new asbn(Status.e.withDescription("ClientCall started after deadline exceeded: ".concat(d3.toString())), asby.l(this.l), (byte[])null, (byte[])null);
            }
            else {
                final arup b3 = this.l.b;
                final Logger h = asab.h;
                if (h.isLoggable(Level.FINE) && d3 != null) {
                    if (d3.equals((Object)null)) {
                        final StringBuilder sb = new StringBuilder(String.format(Locale.US, "Call timeout set to '%d' ns, due to context deadline.", Math.max(0L, d3.b(TimeUnit.NANOSECONDS))));
                        if (b3 == null) {
                            sb.append(" Explicit call timeout was not set.");
                        }
                        else {
                            sb.append(String.format(Locale.US, " Explicit call timeout was '%d' ns.", b3.b(TimeUnit.NANOSECONDS)));
                        }
                        h.logp(Level.FINE, "io.grpc.internal.ClientCallImpl", "logIfContextNarrowedTimeout", sb.toString());
                    }
                }
                final xra p = this.p;
                final arwo a3 = this.a;
                final artx m = this.l;
                final aruo d4 = this.d;
                final Object a4 = p.a;
                Label_0871: {
                    if (!((asdf)a4).O) {
                        final asaf p2 = p.p(new arvp(a3, l, m));
                        final aruo a5 = d4.a();
                        final arva[] l2 = asby.l(m);
                        try {
                            l = (arwk)p2.l(a3, l, m, l2);
                            break Label_0871;
                        }
                        finally {
                            d4.c(a5);
                        }
                    }
                    final asfd a6 = ((asdf)a4).J.a;
                    final asdm asdm2 = (asdm)m.e(asdm.a);
                    asff f2;
                    if (asdm2 == null) {
                        f2 = null;
                    }
                    else {
                        f2 = asdm2.f;
                    }
                    asbz g3;
                    if (asdm2 == null) {
                        g3 = null;
                    }
                    else {
                        g3 = asdm2.g;
                    }
                    l = (arwk)new asfe(p, a3, l, m, f2, g3, a6, d4, null);
                }
                this.e = (asac)l;
            }
            if (this.i) {
                this.e.f();
            }
            final Integer f3 = this.l.f;
            if (f3 != null) {
                this.e.k(f3);
            }
            final Integer g4 = this.l.g;
            if (g4 != null) {
                this.e.l(g4);
            }
            if (d3 != null) {
                this.e.i(d3);
            }
            this.e.h((arui)a2);
            this.e.j(this.g);
            this.c.b();
            this.e.m(new arzz(this, arbu, null, null));
            aruo.d((Object)afum.a, (Object)"executor");
            if (d3 != null && !d3.equals((Object)null) && this.o != null) {
                final long b4 = d3.b(TimeUnit.NANOSECONDS);
                this.j = this.o.schedule((Runnable)new ascn((Runnable)new asaa(this, b4)), b4, TimeUnit.NANOSECONDS);
            }
            if (this.f) {
                this.e();
            }
        }
        finally {}
    }
    
    public final String toString() {
        final aezo ab = adkp.ab((Object)this);
        ab.b("method", (Object)this.a);
        return ab.toString();
    }
}
