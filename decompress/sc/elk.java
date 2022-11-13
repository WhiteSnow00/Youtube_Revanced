import java.io.File;
import android.view.MotionEvent;
import android.app.Activity;
import android.view.View;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;
import java.util.concurrent.CountDownLatch;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class elk implements elm
{
    private static elk m;
    public final Context a;
    public final myv b;
    public final myx c;
    public final myj d;
    public final CountDownLatch e;
    volatile long f;
    public final Object g;
    public volatile boolean h;
    public volatile boolean i;
    public final int j;
    public final adge k;
    public final pvh l;
    private final Executor n;
    private final ems o;
    private final eml p;
    private final qcy q;
    
    public elk(final Context a, final myj d, final adge k, final myv b, final myx c, final qcy q, final Executor n, final mwg mwg, final int j, final ems o, final eml p15, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.f = 0L;
        this.g = new Object();
        this.i = false;
        this.a = a;
        this.d = d;
        this.k = k;
        this.b = b;
        this.c = c;
        this.q = q;
        this.n = n;
        this.j = j;
        this.o = o;
        this.p = p15;
        this.i = false;
        this.e = new CountDownLatch(1);
        this.l = new pvh(mwg);
    }
    
    public static elk a(final String s, final Context context, final boolean b, final boolean b2) {
        synchronized (elk.class) {
            return b(s, context, Executors.newCachedThreadPool(), b, b2);
        }
    }
    
    @Deprecated
    public static elk b(final String c, final Context context, final Executor executor, final boolean b, final boolean b2) {
        synchronized (elk.class) {
            if (elk.m == null) {
                final sko sko = new sko();
                sko.e(false);
                sko.b = true;
                sko.d |= 0x2;
                if (c != null) {
                    sko.c = c;
                    sko.e(b);
                    if (sko.d == 3) {
                        final CharSequence c2 = sko.c;
                        if (c2 != null) {
                            final myk myk = new myk((String)c2, sko.a, sko.b);
                            final myj a = myj.a(context, executor, b2);
                            elx a2;
                            if (mdx.x.e()) {
                                a2 = elx.a(context);
                            }
                            else {
                                a2 = null;
                            }
                            ems c3;
                            if (mdx.y.e()) {
                                c3 = ems.c(context, executor);
                            }
                            else {
                                c3 = null;
                            }
                            eml eml;
                            if (mdx.p.e()) {
                                eml = new eml();
                            }
                            else {
                                eml = null;
                            }
                            final eht a3 = myo.a;
                            final eht a4 = myp.a;
                            final myq myq = new myq(context, executor, a, myk);
                            if (myq.c.b) {
                                myq.d = myq.b((Callable)new lle(myq, 9));
                            }
                            else {
                                myq.d = nnv.c((Object)myo.a);
                            }
                            myq.e = myq.b((Callable)new lle(myq, 10));
                            final emh emh = new emh(context);
                            final qcy qcy = new qcy(myk, myq, new emq(context, emh), emh, a2, c3, eml);
                            final int t = ntc.T(context, a);
                            final mwg mwg = new mwg();
                            (elk.m = new elk(context, a, new adge(context, t), new myv(context, t, (myr)new elp(a, 1), (boolean)mdx.c.e()), new myx(context, qcy, a, mwg, (byte[])null, (byte[])null, (byte[])null, (byte[])null), qcy, executor, mwg, t, c3, eml, null, null, null, null)).j();
                            elk.m.l();
                            return elk.m;
                        }
                    }
                    final StringBuilder sb = new StringBuilder();
                    if (sko.c == null) {
                        sb.append(" clientVersion");
                    }
                    if ((0x1 & sko.d) == 0x0) {
                        sb.append(" shouldGetAdvertisingId");
                    }
                    if ((sko.d & 0x2) == 0x0) {
                        sb.append(" isGooglePlayServicesAvailable");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                throw new NullPointerException("Null clientVersion");
            }
            return elk.m;
        }
    }
    
    private final void q() {
        final ems o = this.o;
        if (o != null) {
            o.d();
        }
    }
    
    public final String c(final Context context, final String s) {
        return this.d(context, s, null, null);
    }
    
    public final String d(final Context context, final String s, final View view, final Activity activity) {
        this.q();
        if (mdx.p.e()) {
            this.p.a();
        }
        this.l();
        final myl a = this.c.a();
        if (a != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            final String a2 = a.a(context, s, view, activity);
            this.d.f(5000, System.currentTimeMillis() - currentTimeMillis, a2);
            return a2;
        }
        return "";
    }
    
    public final String e(final Context context) {
        this.q();
        if (mdx.p.e()) {
            this.p.b();
        }
        this.l();
        final myl a = this.c.a();
        if (a != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            final String c = a.c(context);
            this.d.f(5001, System.currentTimeMillis() - currentTimeMillis, c);
            return c;
        }
        return "";
    }
    
    public final String f(final Context context, final byte[] array) {
        return null;
    }
    
    public final String g(final Context context, final View view, final Activity activity) {
        this.q();
        if (mdx.p.e()) {
            this.p.c(context, view);
        }
        this.l();
        final myl a = this.c.a();
        if (a != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            final String b = a.b(context, view, activity);
            this.d.f(5002, System.currentTimeMillis() - currentTimeMillis, b);
            return b;
        }
        return "";
    }
    
    public final void h(final MotionEvent motionEvent) {
        final myl a = this.c.a();
        if (a != null) {
            try {
                a.d(motionEvent);
            }
            catch (final myw myw) {
                this.d.c(myw.a, -1L, (Exception)myw);
            }
        }
    }
    
    public final void i(final int n, final int n2, final int n3) {
    }
    
    final void j() {
        synchronized (this) {
            final long currentTimeMillis = System.currentTimeMillis();
            final addo p = this.p();
            if (p == null) {
                this.d.d(4013, System.currentTimeMillis() - currentTimeMillis);
                return;
            }
            if (this.c.b(p)) {
                this.i = true;
                this.e.countDown();
            }
        }
    }
    
    public final void k(final View view) {
        ((emq)this.q.d).d(view);
    }
    
    public final void l() {
        if (!this.h) {
            synchronized (this.g) {
                if (!this.h) {
                    if (System.currentTimeMillis() / 1000L - this.f < 3600L) {
                        return;
                    }
                    final myx c = this.c;
                    Object o = c.b;
                    synchronized (o) {
                        final myu a = c.a;
                        addo a2;
                        if (a != null) {
                            a2 = a.a;
                            monitorexit(o);
                        }
                        else {
                            monitorexit(o);
                            a2 = null;
                        }
                        if ((a2 == null || ((eny)a2.d).e - System.currentTimeMillis() / 1000L < 3600L) && ntc.S(this.j)) {
                            o = this.n;
                            ((Executor)o).execute((Runnable)new elj(this));
                        }
                    }
                }
            }
        }
    }
    
    public final boolean m() {
        return this.n();
    }
    
    public final boolean n() {
        synchronized (this) {
            return this.i;
        }
    }
    
    public final boolean o() {
        try {
            this.e.await();
            return this.n();
        }
        catch (final InterruptedException ex) {
            return this.n();
        }
    }
    
    public final addo p() {
        final boolean s = ntc.S(this.j);
        final addo addo = null;
        addo addo2 = null;
        if (!s) {
            return null;
        }
        if (mdx.b.e()) {
            final myv b = this.b;
            final long currentTimeMillis = System.currentTimeMillis();
            synchronized (myv.a) {
                final eny g = b.g(1);
                if (g == null) {
                    b.e(4022, currentTimeMillis);
                    monitorexit(myv.a);
                }
                else {
                    final File a = b.a(g.c);
                    File file;
                    if (!(file = new File(a, "pcam.jar")).exists()) {
                        file = new File(a, "pcam");
                    }
                    final File file2 = new File(a, "pcbc");
                    final File file3 = new File(a, "pcopt");
                    b.e(5016, currentTimeMillis);
                    final addo addo3 = new addo(g, file, file2, file3);
                    monitorexit(myv.a);
                    addo2 = addo3;
                }
                return addo2;
            }
        }
        final adge k = this.k;
        final eny h = k.h(1);
        addo addo4;
        if (h == null) {
            addo4 = addo;
        }
        else {
            final String c = h.c;
            File file4;
            if (!(file4 = ntc.N(c, "pcam.jar", k.d())).exists()) {
                file4 = ntc.N(c, "pcam", k.d());
            }
            addo4 = new addo(h, file4, ntc.N(c, "pcbc", k.d()), ntc.N(c, "pcopt", k.d()));
        }
        return addo4;
    }
}
