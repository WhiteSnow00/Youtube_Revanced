import android.support.v7.widget.RecyclerView;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import java.util.Locale;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.text.SimpleDateFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtk extends iw implements gtg
{
    private static final SimpleDateFormat E;
    public static final long a;
    public boolean A;
    public boolean B;
    public abwp C;
    public gtw D;
    private final gti F;
    private final atke G;
    public long b;
    public long c;
    public long d;
    public final atke e;
    public final atke f;
    public final atke g;
    public final Executor h;
    public final Handler i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public gtv o;
    public TextView p;
    public gth q;
    public gtl r;
    public float s;
    public float t;
    public String u;
    public int v;
    public int w;
    public final int x;
    public final Runnable y;
    public final LinearInterpolator z;
    
    static {
        E = new SimpleDateFormat("m:ss.S", Locale.getDefault());
        a = TimeUnit.SECONDS.toMillis(1L);
    }
    
    public gtk(final Context context, final atke e, final atke f, final atke g, final atke g2, final Executor h, final Handler i) {
        this.b = 5000L;
        this.c = 60000L;
        this.d = 30000L;
        this.l = "";
        this.m = "";
        this.n = "";
        this.s = 0.0f;
        this.t = 1.0f;
        this.u = null;
        this.w = 0;
        this.A = false;
        this.B = true;
        this.e = e;
        this.f = f;
        this.g = g;
        this.G = g2;
        this.h = h;
        this.i = i;
        this.z = new LinearInterpolator();
        final int az = tpe.aZ(context.getResources().getDisplayMetrics(), 120);
        this.x = az;
        this.w = az;
        this.F = new gti(this);
        this.y = (Runnable)new gsb(this, 3);
    }
    
    public static String g(final long n) {
        return h(n, false);
    }
    
    public static String h(long seconds, final boolean b) {
        long n = seconds;
        if (b) {
            n = seconds + 50L;
        }
        seconds = TimeUnit.MILLISECONDS.toSeconds(n);
        return String.format(Locale.getDefault(), "%1$d.%2$d", seconds, n % 1000L / 100L);
    }
    
    private final void o() {
        ((abpq)this.f.a()).C();
    }
    
    private final void p() {
        final gtw d = this.D;
        if (d != null) {
            final long af = this.C.f() - this.C.h();
            final long g = this.C.g();
            final long h = this.C.h();
            final long n = this.d / 2L;
            final long h2 = this.C.h();
            ((RecyclerView)d).aH(d.ag);
            d.ad = (Runnable)new gtp(d, g - h + n, 0);
            final gts gts = (gts)((RecyclerView)d).m;
            gts.i(d.af = af, d.ac, h2);
            gts.rZ();
        }
    }
    
    public final void a() {
        this.o();
        this.f().f();
        this.i.removeCallbacks(this.y);
        ((RecyclerView)this.D).an();
    }
    
    @Override
    public final void b(final RecyclerView recyclerView, final int n) {
        if (n == 0) {
            if (this.D == recyclerView) {
                this.o();
                this.f().f();
                this.i.removeCallbacks(this.y);
                this.A = false;
            }
        }
        else if (n == 1) {
            if (this.D == recyclerView) {
                this.A = true;
                this.l();
            }
        }
        else if (n == 2) {
            if (this.D == recyclerView) {
                this.A = true;
            }
        }
        else if (n == 100) {
            final gtw d = this.D;
            if (d != recyclerView) {
                this.A = false;
                if (d != null) {
                    ((RecyclerView)d).aH(d.ag);
                    ((RecyclerView)d).aH(d.ah);
                    d.ad = null;
                }
                this.D = (gtw)recyclerView;
                this.p();
            }
        }
        else if (n == 101 && this.D == recyclerView) {
            this.A = false;
            this.h.execute(aeun.h((Runnable)new fsi(this, recyclerView, 16)));
        }
    }
    
    public final void d(final float s, final float t) {
        this.s = s;
        this.t = t;
        final gti f = this.f();
        f.e();
        f.g(true);
        f.d();
        this.k();
    }
    
    public final long e(final float n) {
        final long al = this.D.aL();
        final long am = this.D.aM();
        final abwp c = this.C;
        long h;
        if (c != null) {
            h = c.h();
        }
        else {
            h = 0L;
        }
        return (long)(n * (am - al) + al) + h;
    }
    
    public final gti f() {
        final gti f = this.F;
        f.a.clear();
        f.b.clear();
        return this.F;
    }
    
    public final void i(final float s) {
        this.s = s;
        final gti f = this.f();
        f.e();
        f.g(true);
        f.d();
    }
    
    public final void j(final String u, final int v) {
        this.u = u;
        this.v = v;
    }
    
    public final void k() {
        final gtw d = this.D;
        if (d != null && ((RecyclerView)d).F == 0) {
            this.i.removeCallbacks(this.y);
            this.y.run();
        }
        ((abbs)this.G.a()).oE();
    }
    
    public final void l() {
        ((abpq)this.f.a()).a();
        ((abbs)this.G.a()).oE();
    }
    
    public final void m(final abwp c) {
        this.C = c;
        this.p();
    }
    
    public final void n(long n) {
        final gtw d = this.D;
        if (d != null && this.r != null) {
            final abwp c = this.C;
            if (c != null) {
                final long n2 = n - c.h();
                final long al = d.aL();
                n = this.D.aM() - al;
                if (n > 0L) {
                    final gtl r = this.r;
                    final float n3 = (n2 - al) / (float)n;
                    if (r != null) {
                        r.e = n3;
                        r.postInvalidate();
                    }
                    final gtv o = this.o;
                    if (o != null) {
                        o.b = n3;
                        final int measuredWidth = o.getMeasuredWidth();
                        final float b = o.b;
                        final int e = o.e;
                        final float c2 = b * (measuredWidth - (e + e)) + e - o.d.width() / 2.0f;
                        o.c = c2;
                        final float max = Math.max(0.0f, c2);
                        o.c = max;
                        o.c = Math.min(max, (float)(measuredWidth - o.d.width()));
                        o.postInvalidate();
                        if (n2 >= 0L) {
                            this.o.a(gtk.E.format(n2));
                            return;
                        }
                        this.o.a("");
                    }
                }
            }
        }
    }
    
    @Override
    public final void py(final RecyclerView recyclerView, final int n, final int n2) {
        this.i(this.s);
    }
}
