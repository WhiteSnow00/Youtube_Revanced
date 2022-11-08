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

public final class elj implements ell
{
    private static elj m;
    public final Context a;
    public final mxq b;
    public final mxs c;
    public final mxe d;
    public final CountDownLatch e;
    volatile long f;
    public final Object g;
    public volatile boolean h;
    public volatile boolean i;
    public final int j;
    public final adec k;
    public final qpt l;
    private final Executor n;
    private final emr o;
    private final emk p;
    private final qbo q;
    
    public elj(final Context a, final mxe d, final adec k, final mxq b, final mxs c, final qbo q, final Executor n, final mvb mvb, final int j, final emr o, final emk p15, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
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
        this.l = new qpt(mvb);
    }
    
    public static elj a(final String s, final Context context, final boolean b, final boolean b2) {
        synchronized (elj.class) {
            return b(s, context, Executors.newCachedThreadPool(), b, b2);
        }
    }
    
    @Deprecated
    public static elj b(final String c, final Context context, final Executor executor, final boolean b, final boolean b2) {
        synchronized (elj.class) {
            if (elj.m == null) {
                final sii sii = new sii();
                sii.e(false);
                sii.b = true;
                sii.d |= 0x2;
                if (c != null) {
                    sii.c = c;
                    sii.e(b);
                    if (sii.d == 3) {
                        final CharSequence c2 = sii.c;
                        if (c2 != null) {
                            final mxf mxf = new mxf((String)c2, sii.a, sii.b);
                            final mxe a = mxe.a(context, executor, b2);
                            elw a2;
                            if (mcs.x.e()) {
                                a2 = elw.a(context);
                            }
                            else {
                                a2 = null;
                            }
                            emr c3;
                            if (mcs.y.e()) {
                                c3 = emr.c(context, executor);
                            }
                            else {
                                c3 = null;
                            }
                            emk emk;
                            if (mcs.p.e()) {
                                emk = new emk();
                            }
                            else {
                                emk = null;
                            }
                            final ehs a3 = mxj.a;
                            final ehs a4 = mxk.a;
                            final mxl mxl = new mxl(context, executor, a, mxf);
                            if (mxl.c.b) {
                                mxl.d = mxl.b((Callable)new lkb(mxl, 5));
                            }
                            else {
                                mxl.d = nmr.c((Object)mxj.a);
                            }
                            mxl.e = mxl.b((Callable)new lkb(mxl, 6));
                            final emg emg = new emg(context);
                            final qbo qbo = new qbo(mxf, mxl, new emp(context, emg), emg, a2, c3, emk);
                            final int o = meo.o(context, a);
                            final mvb mvb = new mvb();
                            (elj.m = new elj(context, a, new adec(context, o), new mxq(context, o, (mxm)new elo(a, 1), (boolean)mcs.c.e()), new mxs(context, qbo, a, mvb, null, null, null, null), qbo, executor, mvb, o, c3, emk, null, null, null, null)).j();
                            elj.m.l();
                            return elj.m;
                        }
                    }
                    final StringBuilder sb = new StringBuilder();
                    if (sii.c == null) {
                        sb.append(" clientVersion");
                    }
                    if ((0x1 & sii.d) == 0x0) {
                        sb.append(" shouldGetAdvertisingId");
                    }
                    if ((sii.d & 0x2) == 0x0) {
                        sb.append(" isGooglePlayServicesAvailable");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                throw new NullPointerException("Null clientVersion");
            }
            return elj.m;
        }
    }
    
    private final void q() {
        final emr o = this.o;
        if (o != null) {
            o.d();
        }
    }
    
    public final String c(final Context context, final String s) {
        return this.d(context, s, null, null);
    }
    
    public final String d(final Context context, final String s, final View view, final Activity activity) {
        this.q();
        if (mcs.p.e()) {
            this.p.a();
        }
        this.l();
        final mxg a = this.c.a();
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
        if (mcs.p.e()) {
            this.p.b();
        }
        this.l();
        final mxg a = this.c.a();
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
        if (mcs.p.e()) {
            this.p.c(context, view);
        }
        this.l();
        final mxg a = this.c.a();
        if (a != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            final String b = a.b(context, view, activity);
            this.d.f(5002, System.currentTimeMillis() - currentTimeMillis, b);
            return b;
        }
        return "";
    }
    
    public final void h(final MotionEvent motionEvent) {
        final mxg a = this.c.a();
        if (a != null) {
            try {
                a.d(motionEvent);
            }
            catch (final mxr mxr) {
                this.d.c(mxr.a, -1L, mxr);
            }
        }
    }
    
    public final void i(final int n, final int n2, final int n3) {
    }
    
    final void j() {
        synchronized (this) {
            final long currentTimeMillis = System.currentTimeMillis();
            final adbl p = this.p();
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
        ((emp)this.q.d).d(view);
    }
    
    public final void l() {
        if (!this.h) {
            synchronized (this.g) {
                if (!this.h) {
                    if (System.currentTimeMillis() / 1000L - this.f < 3600L) {
                        return;
                    }
                    final mxs c = this.c;
                    Object b = c.b;
                    synchronized (b) {
                        final mxp a = c.a;
                        adbl a2;
                        if (a != null) {
                            a2 = a.a;
                            monitorexit(b);
                        }
                        else {
                            monitorexit(b);
                            a2 = null;
                        }
                        if ((a2 == null || ((enx)a2.d).e - System.currentTimeMillis() / 1000L < 3600L) && meo.n(this.j)) {
                            final Executor n = this.n;
                            b = new eli(this);
                            n.execute((Runnable)b);
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
    
    public final adbl p() {
        final boolean n = meo.n(this.j);
        final adbl adbl = null;
        adbl adbl2 = null;
        if (!n) {
            return null;
        }
        if (mcs.b.e()) {
            final mxq b = this.b;
            final long currentTimeMillis = System.currentTimeMillis();
            synchronized (mxq.a) {
                final enx g = b.g(1);
                if (g == null) {
                    b.e(4022, currentTimeMillis);
                    monitorexit(mxq.a);
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
                    final adbl adbl3 = new adbl(g, file, file2, file3);
                    monitorexit(mxq.a);
                    adbl2 = adbl3;
                }
                return adbl2;
            }
        }
        final adec k = this.k;
        final enx h = k.h(1);
        adbl adbl4;
        if (h == null) {
            adbl4 = adbl;
        }
        else {
            final String c = h.c;
            File file4;
            if (!(file4 = nmr.E(c, "pcam.jar", k.d())).exists()) {
                file4 = nmr.E(c, "pcam", k.d());
            }
            adbl4 = new adbl(h, file4, nmr.E(c, "pcbc", k.d()), nmr.E(c, "pcopt", k.d()));
        }
        return adbl4;
    }
}
