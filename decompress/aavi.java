import java.util.Map;
import android.media.AudioManager;
import android.content.res.Resources;
import android.view.KeyEvent;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import android.content.Context;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aavi implements abbs, abeg, abcy, aaqy
{
    private final ViewGroup a;
    private final Context b;
    private aaus c;
    private boolean d;
    private boolean e;
    private abbr f;
    private abef g;
    private abcx h;
    private ControlsState i;
    private long j;
    private long k;
    private long l;
    private long m;
    private ControlsOverlayStyle n;
    private boolean o;
    private VideoQuality[] p;
    private int q;
    private boolean r;
    
    public aavi(final ViewGroup a, final Context b) {
        this.a = a;
        this.b = b;
        this.i = ControlsState.b();
        this.n = ControlsOverlayStyle.a;
        this.o = true;
    }
    
    private final void e() {
        this.oU(this.n);
        this.oD(this.d);
        this.b(this.e);
        this.n(this.j, this.k, this.l, this.m);
        this.f(this.i);
        this.pm(this.o);
        this.o(this.p, this.q, this.r);
    }
    
    private final void g(final aaus c) {
        this.c = c;
        if (c != null) {
            final abbr f = this.f;
            if (f != null) {
                c.g = f;
            }
            final abef g = this.g;
            if (g != null) {
                c.h = g;
            }
            final abcx h = this.h;
            if (h != null) {
                c.i = h;
            }
            this.e();
        }
    }
    
    public final void b(final boolean b) {
        final aaus c = this.c;
        if (c != null) {
            final aavg e = c.e;
            e.c = b;
            e.a();
        }
        this.e = b;
    }
    
    public final void d() {
        this.n(0L, 0L, 0L, 0L);
    }
    
    public final void f(final ControlsState i) {
        i.getClass();
        final aaus c = this.c;
        if (c != null) {
            final boolean b = i.b;
            c.j = b;
            ((aasb)c.b).rS(b ^ true);
            c.i();
            final abbx a = i.a;
            if (a == abbx.b) {
                this.c.a();
            }
            else if (a == abbx.c) {
                final aaus c2 = this.c;
                c2.k = false;
                c2.e.b(1);
                c2.i();
            }
            else if (a == abbx.f) {
                final aaus c3 = this.c;
                c3.o = true;
                c3.m = true;
                c3.k = false;
                c3.e.b(3);
                c3.i();
            }
        }
        this.i = i;
    }
    
    public final void m(final boolean b) {
    }
    
    public final void n(final long j, final long n, final long l, final long m) {
        final aaus c = this.c;
        if (c != null) {
            final aaur c2 = c.c;
            c2.h = l;
            final aarn b = c2.b;
            final boolean i = aakt.l(j, l);
            if (b.e != i) {
                b.e = i;
                b.c();
            }
            final aast a = c2.a;
            final long n2 = j / 1000L;
            final long n3 = l / 1000L;
            final String k = tvb.j(n2);
            final String j2 = tvb.j(n3);
            final StringBuilder sb = new StringBuilder();
            sb.append(k);
            sb.append("/");
            sb.append(j2);
            a.y(sb.toString());
            final aauz f = c2.f;
            if (l <= 0L) {
                ttr.b("Cannot have a negative time for video duration!");
            }
            else {
                f.g = l;
                long n4;
                if (m > l) {
                    n4 = l;
                }
                else {
                    n4 = m;
                }
                f.h = n;
                final long n5 = l - n;
                if (n5 <= 0L) {
                    final float[] e = f.e;
                    e[0] = 1.0f;
                    e[1] = 0.0f;
                }
                else {
                    final float[] e2 = f.e;
                    final float n6 = (float)(j - n);
                    final float n7 = (float)n5;
                    final float n8 = n6 / n7;
                    e2[0] = n8;
                    float n9;
                    if (n4 > j) {
                        n9 = (n4 - j) / n7;
                    }
                    else {
                        n9 = 0.0f;
                    }
                    e2[1] = n9;
                    float n10 = n8;
                    if (n8 > 1.0f) {
                        n10 = 1.0f;
                    }
                    e2[0] = n10;
                    float n11 = n9;
                    if (n9 > 1.0f) {
                        n11 = 1.0f;
                    }
                    e2[1] = n11;
                }
                final float[] e3 = f.e;
                e3[2] = 1.0f - e3[0] - e3[1];
                f.a.g(e3);
                final float j3 = f.e[0];
                if (j3 < 0.0f || j3 > 1.01) {
                    final StringBuilder sb2 = new StringBuilder("percentWidth invalid - ");
                    sb2.append(j3);
                    ttr.b(sb2.toString());
                }
                ((aapi)f.c).k(f.a.h * (j3 - f.j), 0.0f, 0.0f);
                f.j = j3;
            }
        }
        this.j = j;
        this.k = n;
        this.l = l;
        this.m = m;
    }
    
    public final void o(final VideoQuality[] p3, final int q, final boolean r) {
        if (p3 != null && q >= 0) {
            int length = p3.length;
            if (length != 0) {
                final aaus c = this.c;
                if (c != null) {
                    final String b = p3[q].b;
                    --length;
                    final String b2 = p3[length].b;
                    final boolean b3 = q == length;
                    final aark e = c.c.e;
                    e.h = b;
                    e.i = b2;
                    e.e = b3;
                    if (e.g) {
                        e.g = b3;
                    }
                    e.a();
                }
                this.p = p3;
                this.q = q;
                this.r = r;
            }
        }
    }
    
    public final void oD(final boolean b) {
        final aaus c = this.c;
        if (c != null) {
            final aavg e = c.e;
            e.b = b;
            e.a();
        }
        this.d = b;
    }
    
    public final void oE() {
    }
    
    public final void oF() {
        this.n = ControlsOverlayStyle.a;
        this.i = ControlsState.b();
        this.e();
    }
    
    public final void oG(final String s, final boolean b) {
    }
    
    public final void oH(final boolean b) {
    }
    
    public final void oU(final ControlsOverlayStyle n) {
        final aaus c = this.c;
        if (c != null) {
            final aavg e = c.e;
            e.a = n;
            e.a();
            final aaur c2 = c.c;
            final aauz f = c2.f;
            f.k = n;
            final aasd a = f.a;
            final int q = n.q;
            adkp.H(true);
            a.e[0].g(q);
            f.a.c(f.a());
            final boolean b = ControlsOverlayStyle.b(n);
            c2.i = b;
            ((aasb)c2.b).l = (b ^ true);
            ((aasb)c2.a).rS(b);
            c2.b();
        }
        this.n = n;
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return false;
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        return false;
    }
    
    public final void pl(final abbr abbr) {
        this.f = abbr;
        final aaus c = this.c;
        if (c != null) {
            c.g = abbr;
        }
    }
    
    public final void pm(final boolean b) {
        final aaus c = this.c;
        if (c != null) {
            final aauz f = c.c.f;
            f.m = b;
            f.a.c(f.a());
        }
        this.o = b;
    }
    
    public final void pn(final long n, final long n2, final long n3, final long n4, final long n5) {
        aale.e((abbs)this, n, n3, n4, n5);
    }
    
    public final void r(final boolean b) {
    }
    
    public final void rT(final aatn aatn, final aatj aatj) {
        final adlp adlp = new adlp(this.a, this.b, aatn, aatj);
        final aasz f = new aasz(((aatv)adlp.c).a(), ((aatj)adlp.f).m, (byte[])null, (byte[])null);
        ((aarc)f).k(0.0f, 14.0f, 0.0f);
        final Object a = adlp.a;
        ((aaus)a).f = f;
        ((aarc)a).m((aarz)f);
        final aaur c = new aaur((Resources)adlp.e, (AudioManager)((Context)adlp.b).getSystemService("audio"), (aatn)adlp.d, ((aatj)adlp.f).m, ((aatv)adlp.c).a(), new afhd((aaus)adlp.a), new afhd(adlp, null, null), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        ((aarc)c).k(0.0f, aatt.a(-60.0f), 0.0f);
        c.a(((aatj)adlp.f).g);
        final Object a2 = adlp.a;
        ((aaus)a2).c = c;
        ((aarc)a2).m((aarz)c);
        final aavg e = new aavg((Resources)adlp.e, ((aatv)adlp.c).a(), new afhd(adlp, null), (aatn)adlp.d, (byte[])null, (byte[])null, (byte[])null);
        ((aarc)e).k(0.0f, 7.0f, 0.0f);
        final Object a3 = adlp.a;
        ((aaus)a3).e = e;
        ((aarc)a3).m((aarz)e);
        ((aaus)adlp.a).q = ((aatn)adlp.d).k;
        final aapl b = new aapl((ViewGroup)adlp.g, (Context)adlp.b, ((aaus)adlp.a).a, ((aatv)adlp.c).a(), ((aatn)adlp.d).a.c(), 10.5f, true);
        ((aapi)b).k(0.0f, 7.0f, 0.0f);
        ((aasb)b).rS(true);
        final Object a4 = adlp.a;
        ((aaus)a4).b = b;
        ((aarc)a4).m((aarz)b);
        ((aatn)adlp.d).a((aatl)adlp.a);
        ((aatn)adlp.d).b((aatm)adlp.a);
        final Object f2 = adlp.f;
        final Object a5 = adlp.a;
        final aatj aatj2 = (aatj)f2;
        aatj2.e = (aatf)a5;
        aatj2.h(((aaus)a5).n);
        final Object f3 = adlp.f;
        final Object a6 = adlp.a;
        final aatj aatj3 = (aatj)f3;
        aatj3.h = (aath)a6;
        aatj3.i = (aatg)a6;
        this.g((aaus)a6);
        aatj.c((aaru)a6);
    }
    
    public final void rU() {
        this.g(null);
    }
    
    public final void re(final abcx abcx) {
        this.h = abcx;
        final aaus c = this.c;
        if (c != null) {
            c.i = abcx;
        }
    }
    
    public final void rh(final boolean b) {
    }
    
    public final void rk(final abef abef) {
        this.g = abef;
        final aaus c = this.c;
        if (c != null) {
            c.h = abef;
        }
    }
    
    public final void rl() {
    }
    
    public final void s(final CharSequence charSequence) {
    }
    
    public final void u(final Map map) {
    }
    
    public final void v() {
    }
    
    public final void x() {
        aale.c((abbs)this);
    }
    
    public final void y(final anew anew, final boolean b) {
    }
}
