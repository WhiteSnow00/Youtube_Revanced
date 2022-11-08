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

public final class gtb extends iw implements gsx
{
    private static final SimpleDateFormat E;
    public static final long a;
    public boolean A;
    public boolean B;
    public abul C;
    public gtn D;
    private final gsz F;
    private final atjj G;
    public long b;
    public long c;
    public long d;
    public final atjj e;
    public final atjj f;
    public final atjj g;
    public final Executor h;
    public final Handler i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public gtm o;
    public TextView p;
    public gsy q;
    public gtc r;
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
    
    public gtb(final Context context, final atjj e, final atjj f, final atjj g, final atjj g2, final Executor h, final Handler i) {
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
        final int az = tmy.aZ(context.getResources().getDisplayMetrics(), 120);
        this.x = az;
        this.w = az;
        this.F = new gsz(this);
        this.y = new grt(this, 4);
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
        ((abno)this.f.a()).D();
    }
    
    private final void p() {
        final gtn d = this.D;
        if (d != null) {
            final long ak = this.C.f() - this.C.h();
            final long g = this.C.g();
            final long h = this.C.h();
            final long d2 = this.d;
            final long h2 = this.C.h();
            d.aH(d.al);
            d.ae = new gtg(d, g - h + d2 / 2L, 0);
            final gtj gtj = (gtj)d.m;
            gtj.j(d.ak = ak, d.ad, h2);
            gtj.rT();
        }
    }
    
    @Override
    public final void a() {
        this.o();
        this.f().f();
        this.i.removeCallbacks(this.y);
        this.D.an();
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
            final gtn d = this.D;
            if (d != recyclerView) {
                this.A = false;
                if (d != null) {
                    d.aH(d.al);
                    d.aH(d.am);
                    d.ae = null;
                }
                this.D = (gtn)recyclerView;
                this.p();
            }
        }
        else if (n == 101 && this.D == recyclerView) {
            this.A = false;
            this.h.execute(aesm.h((Runnable)new fsa(this, recyclerView, 16)));
        }
    }
    
    @Override
    public final void d(final float s, final float t) {
        this.s = s;
        this.t = t;
        final gsz f = this.f();
        f.e();
        f.g(true);
        f.d();
        this.k();
    }
    
    public final long e(final float n) {
        final long al = this.D.aL();
        final long am = this.D.aM();
        final abul c = this.C;
        long h;
        if (c != null) {
            h = c.h();
        }
        else {
            h = 0L;
        }
        return (long)(n * (am - al) + al) + h;
    }
    
    public final gsz f() {
        final gsz f = this.F;
        f.a.clear();
        f.b.clear();
        return this.F;
    }
    
    public final void i(final float s) {
        this.s = s;
        final gsz f = this.f();
        f.e();
        f.g(true);
        f.d();
    }
    
    public final void j(final String u, final int v) {
        this.u = u;
        this.v = v;
    }
    
    public final void k() {
        final gtn d = this.D;
        if (d != null && d.F == 0) {
            this.i.removeCallbacks(this.y);
            this.y.run();
        }
        ((aazx)this.G.a()).oE();
    }
    
    public final void l() {
        ((abno)this.f.a()).a();
        ((aazx)this.G.a()).oE();
    }
    
    public final void m(final abul c) {
        this.C = c;
        this.p();
    }
    
    public final void n(long al) {
        final gtn d = this.D;
        if (d != null && this.r != null) {
            final abul c = this.C;
            if (c != null) {
                final long n = al - c.h();
                al = d.aL();
                final long n2 = this.D.aM() - al;
                if (n2 > 0L) {
                    final float n3 = (n - al) / (float)n2;
                    final gtc r = this.r;
                    if (r != null) {
                        r.e = n3;
                        r.postInvalidate();
                    }
                    final gtm o = this.o;
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
                        if (n >= 0L) {
                            this.o.a(gtb.E.format(n));
                            return;
                        }
                        this.o.a("");
                    }
                }
            }
        }
    }
    
    @Override
    public final void pu(final RecyclerView recyclerView, final int n, final int n2) {
        this.i(this.s);
    }
}
