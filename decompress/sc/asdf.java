import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.net.URISyntaxException;
import java.net.URI;
import java.util.concurrent.ScheduledExecutorService;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.CountDownLatch;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import io.grpc.Status;
import java.util.regex.Pattern;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asdf extends arvx implements arve
{
    public static final Logger a;
    static final Pattern b;
    static final Status c;
    static final Status d;
    static final Status e;
    public static final asdo f;
    public static final arvd g;
    public static final arua h;
    public final AtomicBoolean A;
    public boolean B;
    public boolean C;
    public volatile boolean D;
    public final arzs E;
    public final arzu F;
    public final artz G;
    public final arvc H;
    public final asdc I;
    public asdo J;
    public boolean K;
    public final boolean L;
    public final long M;
    public final long N;
    public final boolean O;
    final ascc P;
    public int Q;
    public asbm R;
    public final auch S;
    public arzp T;
    public final xra U;
    public final xra V;
    private final String W;
    private final arwr X;
    private final arwp Y;
    private final arzp Z;
    private final asea aa;
    private final ascv ab;
    private final ascv ac;
    private final long ad;
    private final arty ae;
    private boolean af;
    private final Set ag;
    private final CountDownLatch ah;
    private final asdp ai;
    private final aseo aj;
    public final arvf i;
    public final asah j;
    public final asdd k;
    public final Executor l;
    public final asfw m;
    public final arxk n;
    public final arur o;
    public final asao p;
    public final String q;
    public arwu r;
    public ascx s;
    public volatile arvs t;
    public boolean u;
    public final Set v;
    public Collection w;
    public final Object x;
    public final asaz y;
    public final asde z;
    
    static {
        a = Logger.getLogger(asdf.class.getName());
        b = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
        c = Status.l.withDescription("Channel shutdownNow invoked");
        d = Status.l.withDescription("Channel shutdown invoked");
        e = Status.l.withDescription("Subchannel shutdown invoked");
        f = new asdo(null, new HashMap(), new HashMap(), null, null, null);
        g = new ascp();
        h = new ascr();
    }
    
    public asdf(final asdj asdj, final asah asah, final asea asea, final afaq afaq, final List list, final asfw m) {
        final arxk n = new arxk((Thread.UncaughtExceptionHandler)new wib(this, 8));
        this.n = n;
        this.p = new asao();
        this.v = new HashSet(16, 0.75f);
        this.x = new Object();
        this.ag = new HashSet(1, 0.75f);
        this.z = new asde(this);
        this.A = new AtomicBoolean(false);
        this.ah = new CountDownLatch(1);
        this.Q = 1;
        this.J = asdf.f;
        this.K = false;
        this.S = new auch((short[])null);
        final ascu ascu = new ascu(this);
        this.ai = ascu;
        this.P = new ascw(this);
        this.U = new xra(this);
        final String h = asdj.h;
        h.getClass();
        this.W = h;
        final arvf b = arvf.b("Channel", h);
        this.i = b;
        this.m = m;
        final asea c = asdj.c;
        c.getClass();
        this.aa = c;
        final Object a = c.a();
        a.getClass();
        this.l = (Executor)a;
        final asea d = asdj.d;
        d.getClass();
        final ascv ac = new ascv(d);
        this.ac = ac;
        final arzr j = new arzr(asah, (Executor)ac);
        this.j = (asah)j;
        new arzr(asah, (Executor)ac);
        final asdd k = new asdd(((asah)j).b());
        this.k = k;
        final long a2 = m.a();
        final StringBuilder sb = new StringBuilder("Channel for '");
        sb.append(h);
        sb.append("'");
        final arzu f = new arzu(b, a2, sb.toString());
        this.F = f;
        final arzt g = new arzt(f, m);
        this.G = g;
        final arxc i = asby.j;
        this.O = true;
        final arzp z = new arzp(arvw.b());
        this.Z = z;
        final arwt arwt = new arwt(true, z);
        i.getClass();
        final arwp y = new arwp(Integer.valueOf(443), i, n, arwt, (ScheduledExecutorService)k, (artz)g, (Executor)ac);
        this.Y = y;
        final arwr g2 = asdj.g;
        this.X = g2;
        this.r = o(h, g2, y);
        this.ab = new ascv(asea);
        final asaz y2 = new asaz((Executor)a, n);
        this.y = y2;
        y2.f = ascu;
        y2.c = new arcu(ascu, 16);
        y2.d = new arcu(ascu, 17);
        y2.e = new arcu(ascu, 18);
        this.L = true;
        final asdc l = new asdc(this, this.r.a());
        this.I = l;
        this.ae = aruf.a((arty)l, list);
        afaq.getClass();
        final long l2 = asdj.l;
        if (l2 == -1L) {
            this.ad = -1L;
        }
        else {
            adkp.L(l2 >= asdj.b, "invalid idleTimeoutMillis %s", l2);
            this.ad = asdj.l;
        }
        this.aj = new aseo((Runnable)new asba(this, 15), (Executor)n, ((asah)j).b(), afam.c());
        final arur j2 = asdj.j;
        j2.getClass();
        this.o = j2;
        asdj.k.getClass();
        this.q = asdj.i;
        this.N = 16777216L;
        this.M = 1048576L;
        final xra v = new xra(m);
        this.V = v;
        this.E = v.q();
        final arvc m2 = asdj.m;
        m2.getClass();
        this.H = m2;
        arvc.a((Map)m2.b, (arve)this);
    }
    
    private static arwu o(final String s, final arwr arwr, final arwp arwp) {
        final StringBuilder sb = new StringBuilder();
        URI uri;
        try {
            uri = new URI(s);
        }
        catch (final URISyntaxException ex) {
            sb.append(ex.getMessage());
            uri = null;
        }
        if (uri != null) {
            final arwu a = arwr.a(uri, arwp);
            if (a != null) {
                return a;
            }
        }
        final boolean matches = asdf.b.matcher(s).matches();
        final String s2 = "";
        if (!matches) {
            try {
                final String b = arwr.b();
                final StringBuilder sb2 = new StringBuilder("/");
                sb2.append(s);
                final arwu a2 = arwr.a(new URI(b, "", sb2.toString(), null), arwp);
                if (a2 != null) {
                    return a2;
                }
            }
            catch (final URISyntaxException ex2) {
                throw new IllegalArgumentException(ex2);
            }
        }
        String string = s2;
        if (sb.length() > 0) {
            final String string2 = sb.toString();
            final StringBuilder sb3 = new StringBuilder(" (");
            sb3.append(string2);
            sb3.append(")");
            string = sb3.toString();
        }
        throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", s, string));
    }
    
    public final arua a(final arwo arwo, final artx artx) {
        return this.ae.a(arwo, artx);
    }
    
    public final String b() {
        return this.ae.b();
    }
    
    public final arvf c() {
        return this.i;
    }
    
    public final Executor d(final artx artx) {
        Executor executor;
        if ((executor = artx.c) == null) {
            executor = this.l;
        }
        return executor;
    }
    
    public final void e(final boolean b) {
        final aseo aj = this.aj;
        aj.e = false;
        if (b) {
            final ScheduledFuture f = aj.f;
            if (f != null) {
                f.cancel(false);
                aj.f = null;
            }
        }
    }
    
    public final void f() {
        this.n.c();
        final arzp t = this.T;
        if (t != null) {
            t.a();
            this.T = null;
            this.R = null;
        }
    }
    
    final void g() {
        this.n.c();
        if (!this.A.get()) {
            if (!this.u) {
                if (!this.P.a.isEmpty()) {
                    this.e(false);
                }
                else {
                    this.k();
                }
                if (this.s != null) {
                    return;
                }
                this.G.a(2, "Exiting idle mode");
                final ascx s = new ascx(this);
                s.a = new arzk(this.Z, (arvn)s);
                this.s = s;
                this.r.d(new ateg(this, s, this.r));
                this.af = true;
            }
        }
    }
    
    public final void h() {
        if (this.B) {
            for (final asck asck : this.v) {
                final Status c = asdf.c;
                asck.g(c);
                asck.d.execute((Runnable)new asat(asck, c, 14));
            }
            final Iterator iterator2 = this.ag.iterator();
            if (iterator2.hasNext()) {
                final aseb aseb = (aseb)iterator2.next();
                throw null;
            }
        }
    }
    
    public final void i() {
        if (this.D) {
            return;
        }
        if (this.A.get() && this.v.isEmpty() && this.ag.isEmpty()) {
            this.G.a(2, "Terminated");
            arvc.b((Map)this.H.b, (arve)this);
            this.aa.b(this.l);
            this.ab.b();
            this.ac.b();
            this.j.close();
            this.D = true;
            this.ah.countDown();
        }
    }
    
    public final void j() {
        this.n.c();
        if (this.af) {
            this.r.b();
        }
    }
    
    public final void k() {
        final long ad = this.ad;
        if (ad == -1L) {
            return;
        }
        final aseo aj = this.aj;
        final long nanos = TimeUnit.MILLISECONDS.toNanos(ad);
        final long d = aj.a() + nanos;
        aj.e = true;
        if (d - aj.d < 0L || aj.f == null) {
            final ScheduledFuture f = aj.f;
            if (f != null) {
                f.cancel(false);
            }
            aj.f = aj.a.schedule(new ased(aj, 3), nanos, TimeUnit.NANOSECONDS);
        }
        aj.d = d;
    }
    
    public final void l(final boolean b) {
        this.n.c();
        if (b) {
            adkp.R(this.af, (Object)"nameResolver is not started");
            adkp.R(this.s != null, (Object)"lbHelper is null");
        }
        if (this.r != null) {
            this.f();
            this.r.c();
            this.af = false;
            if (b) {
                this.r = o(this.W, this.X, this.Y);
            }
            else {
                this.r = null;
            }
        }
        final ascx s = this.s;
        if (s != null) {
            final arzk a = s.a;
            a.b.c();
            a.b = null;
            this.s = null;
        }
        this.t = null;
    }
    
    public final void m(final arvs t) {
        this.t = t;
        this.y.a(t);
    }
    
    public final void n() {
        this.G.a(1, "shutdown() called");
        if (!this.A.compareAndSet(false, true)) {
            return;
        }
        this.n.execute((Runnable)new asba(this, 11));
        final asdc i = this.I;
        i.c.n.execute((Runnable)new asba(i, 17));
        this.n.execute((Runnable)new asba(this, 10));
    }
    
    public final String toString() {
        final aezo ab = adkp.ab((Object)this);
        ab.f("logId", this.i.a);
        ab.b("target", (Object)this.W);
        return ab.toString();
    }
}
