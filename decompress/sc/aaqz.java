import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.Iterator;
import com.google.vr.sdk.base.GvrView$StereoRenderer;
import android.opengl.GLSurfaceView$EGLWindowSurfaceFactory;
import android.view.View;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.List;
import android.os.Handler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaqz implements aapm, aatw, abps, tgg
{
    public final aanx A;
    public final aeea B;
    private final Context C;
    private final tgd D;
    private final atke E;
    private final Handler F;
    private volatile boolean G;
    private String H;
    private String I;
    private boolean J;
    private boolean K;
    private volatile int L;
    private volatile boolean M;
    private volatile boolean N;
    private volatile float O;
    private volatile float P;
    private final abrj Q;
    public final abjj a;
    public final yzz b;
    public final List c;
    public final aarb d;
    public aasj e;
    public aaqc f;
    public aapn g;
    public aarg h;
    public aatn i;
    public aasm j;
    public aatj k;
    public aasx l;
    public Runnable m;
    public zdv n;
    public Handler o;
    public aatw p;
    public boolean q;
    public volatile boolean r;
    public volatile int s;
    public volatile int t;
    public vjj u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public final yzz z;
    
    public aaqz(final Context c, final tgd d, final abjj a, final yzz z, final yzz b, final atke e, final aeea b2, final abrj q, final byte[] array, final byte[] array2) {
        final Handler f = new Handler(c.getMainLooper());
        this.c = new ArrayList();
        this.x = 3;
        this.u = vjj.e;
        this.y = 1;
        this.H = "";
        c.getClass();
        this.C = c;
        d.getClass();
        this.D = d;
        this.F = f;
        a.getClass();
        this.a = a;
        z.getClass();
        this.z = z;
        b.getClass();
        this.b = b;
        e.getClass();
        this.E = e;
        b2.getClass();
        this.B = b2;
        q.getClass();
        this.Q = q;
        this.A = new aanx(c);
        this.d = new aarb(c);
    }
    
    public static int r(final aapn aapn, final aatn aatn) {
        if (aapn == null && aatn == null) {
            return 1;
        }
        if (aapn == null) {
            return 2;
        }
        if (aatn == null) {
            return 3;
        }
        return 4;
    }
    
    private final void t() {
        if (this.v()) {
            this.f.e();
            this.l();
        }
    }
    
    private final void u(final PlayerResponseModel playerResponseModel) {
        this.H = playerResponseModel.J();
        this.I = playerResponseModel.F();
        if (this.v()) {
            final aatj k = this.k;
            if (k != null) {
                k.l(this.H, this.I);
            }
        }
    }
    
    private final boolean v() {
        return this.g != null && this.f != null;
    }
    
    public final View a(final Context context, final Handler o, final boolean b, final boolean b2) {
        aaqc f;
        if (!"com.google.android.apps.youtube.mango".equals(this.C.getPackageName()) && !this.Q.y()) {
            if (b2) {
                f = new aapw(context);
            }
            else {
                f = new aaqb(context);
            }
        }
        else {
            f = new aaqa(context);
        }
        (this.f = f).j(false);
        this.f.h(this.m);
        try {
            this.d.b(b);
        }
        catch (final aatr aatr) {
            this.s(aatr);
        }
        int n = 8;
        int n2;
        if (b && this.d.c() == 1) {
            n = 10;
            n2 = 2;
        }
        else {
            n2 = 8;
        }
        this.f.l(n, n, n, n2);
        this.f.f((GLSurfaceView$EGLWindowSurfaceFactory)this.d);
        final aapn g = this.g;
        if (g != null) {
            g.onRendererShutdown();
        }
        final aapn g2 = (aapn)this.E.a();
        this.g = g2;
        final jfz d = new jfz(this, 20);
        if (!g2.k) {
            g2.f = this;
            g2.e = this;
            g2.d = (atke)d;
        }
        this.o = o;
        this.f.i((GvrView$StereoRenderer)this.g);
        if (this.q) {
            this.t();
        }
        return (View)this.f.a();
    }
    
    final aaua b() {
        final aatz c = aatz.c;
        if (!this.M || this.r) {
            aatz aatz = c;
            if (!this.N) {
                return new aaua(aatz, this.O, this.P);
            }
            aatz = c;
            if (!this.r) {
                return new aaua(aatz, this.O, this.P);
            }
        }
        aatz aatz = c;
        if (Math.min(this.s, this.t) <= this.L) {
            aatz = c;
            if (this.O > 0.0f) {
                if (this.G) {
                    aatz = aatz.b;
                }
                else {
                    aatz = aatz.a;
                }
            }
        }
        return new aaua(aatz, this.O, this.P);
    }
    
    public final void c(final aaqy aaqy) {
        aaqy.getClass();
        this.c.add(aaqy);
        this.m((Runnable)new aagj(this, aaqy, 12));
    }
    
    public final void d() {
        final aatn i = this.i;
        if (i == null) {
            return;
        }
        if (this.l == null) {
            try {
                final aasx l = new aasx(this.C, i);
                this.l = l;
                ((aarc)this.i).n(0, (aarz)l);
            }
            catch (final aatr aatr) {
                this.s(aatr);
                return;
            }
        }
        if (this.k == null) {
            try {
                (this.k = new aatj(this.C, this.f.a(), this.i)).t(this.J, this.K);
                this.k.i(this.r);
                ((aarc)this.i).m((aarz)this.k);
                if (this.i != null && this.k != null) {
                    final Iterator iterator = this.c.iterator();
                    while (iterator.hasNext()) {
                        ((aaqy)iterator.next()).rT(this.i, this.k);
                    }
                }
                this.k.l(this.H, this.I);
            }
            catch (final aatr aatr2) {
                this.s(aatr2);
            }
        }
    }
    
    public final void f(final aans aans) {
        final vjj u = this.u;
        if (aans.c() != null && aans.c().h()) {
            final PlayerResponseModel a = aans.a();
            VideoStreamingData n;
            if (a != null) {
                n = a.n();
            }
            else {
                n = null;
            }
            if (n == null) {
                ttr.b("Could not retrieve VideoStreamingData for the Ad - unable to determine video type; falling back to 2D.");
                this.u = vjj.a;
            }
            else {
                this.u = n.e();
                this.u(a);
            }
        }
        else {
            final PlayerResponseModel b = aans.b();
            if (b != null) {
                final PlayerConfigModel m = b.m();
                vjj u2;
                if (b.n() != null) {
                    u2 = b.n().e();
                }
                else {
                    u2 = vjj.e;
                }
                this.u = u2;
                this.v = m.ap();
                this.u(b);
                final aneh c = m.c;
                boolean j = false;
                Label_0212: {
                    if ((c.c & 0x1) != 0x0) {
                        appt appt;
                        if ((appt = c.u) == null) {
                            appt = appt.a;
                        }
                        if (appt.c) {
                            j = true;
                            break Label_0212;
                        }
                    }
                    j = false;
                }
                this.J = j;
                this.K = m.af();
                appt appt2;
                if ((appt2 = m.c.u) == null) {
                    appt2 = appt.a;
                }
                this.w = appt2.e;
                if (this.v()) {
                    final aatj k = this.k;
                    if (k != null) {
                        k.t(this.J, this.K);
                    }
                }
                final aapn g = this.g;
                if (g != null) {
                    g.j = m.ac();
                }
                ajra ajra;
                if ((ajra = m.c.e) == null) {
                    ajra = ajra.b;
                }
                this.L = ajra.am;
                this.M = m.ag(this.u);
                final ajra e = m.c.e;
                ajra b2;
                if (e == null) {
                    b2 = ajra.b;
                }
                else {
                    b2 = e;
                }
                final int bp = aqsx.bP(b2.an);
                boolean n2 = false;
                Label_0451: {
                    while (true) {
                        Label_0411: {
                            if (bp == 0) {
                                break Label_0411;
                            }
                            if (bp != 6) {
                                break Label_0411;
                            }
                            n2 = true;
                            break Label_0451;
                        }
                        ajra b3;
                        if ((b3 = e) == null) {
                            b3 = ajra.b;
                        }
                        final int bp2 = aqsx.bP(b3.an);
                        if (bp2 != 0 && bp2 == 3) {
                            continue;
                        }
                        break;
                    }
                    n2 = false;
                }
                this.N = n2;
                ajra ajra2;
                if ((ajra2 = m.c.e) == null) {
                    ajra2 = ajra.b;
                }
                this.O = ajra2.ao;
                ajra ajra3;
                if ((ajra3 = m.c.e) == null) {
                    ajra3 = ajra.b;
                }
                this.P = ajra3.ap;
                this.p(this.b());
            }
            else {
                this.u = vjj.e;
            }
        }
        this.n(this.u, this.v);
        final vjj u3 = this.u;
        if (u != u3) {
            final Handler o = this.o;
            if (o != null) {
                o.obtainMessage(3, u3.ordinal(), 0).sendToTarget();
            }
        }
        if (this.g != null && aans.c() != null && aans.c().a(new abke[] { abke.f, abke.i })) {
            final aapn g2 = this.g;
            final aase b4 = g2.b;
            b4.s = b4.a.a();
            b4.d();
            g2.i = true;
        }
    }
    
    public final void g(final aant aant) {
        final aasj e = this.e;
        if (e != null) {
            final long e2 = aant.e();
            if (e.e) {
                final aasi b = e.b;
                b.i = e2;
                b.j = System.currentTimeMillis();
            }
        }
    }
    
    public final void h(final aanw aanw) {
        final aasj e = this.e;
        Label_0110: {
            if (e != null && e.e) {
                final aasi b = e.b;
                long n;
                if (aanw.a() == 2 && b.f) {
                    b.f = false;
                    n = 30000L;
                }
                else {
                    if (aanw.a() == 2 || b.f) {
                        break Label_0110;
                    }
                    b.f = true;
                    final Handler a = b.a;
                    if (a != null) {
                        a.removeCallbacks(b.g);
                    }
                    n = 0L;
                }
                b.c(n);
            }
        }
        this.G = aanw.e();
        this.p(this.b());
    }
    
    public final void i() {
        if (this.v()) {
            final aarc g = this.g.g;
            if (g != null) {
                g.d = true;
            }
            this.D.d((Object)new aanu());
        }
    }
    
    public final void j() {
        if (this.v()) {
            this.f.d();
            this.g.a();
        }
        this.q = false;
    }
    
    public final void k() {
        this.t();
        this.q = true;
    }
    
    public final void l() {
        if (!this.v()) {
            return;
        }
        this.g.c(this.r);
        this.g.h = this.h;
        this.a.q(this.r);
        final boolean r = this.r;
        if (this.v()) {
            if (r) {
                this.f.g((Runnable)new aaog(this, 7));
                this.f.a().setClickable(true);
            }
            else {
                this.f.g(null);
                this.f.a().setClickable(false);
            }
        }
        this.m((Runnable)new aaog(this, 6));
        this.p(this.b());
        this.o.obtainMessage(2, (int)(this.r ? 1 : 0), 0).sendToTarget();
    }
    
    public final asir[] lX(final abpu abpu) {
        return new asir[] { ((ashi)abpu.p().a).j(aale.s(abpu.bM(), 32L)).j(aale.q(1)).an((asjm)new aaoe(this, 18), (asjm)aaof.g), ((ashi)abpu.p().e).j(aale.s(abpu.bM(), 32L)).j(aale.q(1)).an((asjm)new aaoe(this, 19), (asjm)aaof.g), ((ashi)abpu.p().k).j(aale.s(abpu.bM(), 32L)).j(aale.q(1)).an((asjm)new aaoe(this, 20), (asjm)aaof.g) };
    }
    
    public final void m(final Runnable runnable) {
        final aapn g = this.g;
        if (g != null) {
            g.c.add(runnable);
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        final StringBuilder sb = new StringBuilder("unsupported op code: ");
                        sb.append(n);
                        throw new IllegalStateException(sb.toString());
                    }
                    this.h((aanw)o);
                }
                else {
                    this.g((aant)o);
                }
            }
            else {
                this.f((aans)o);
            }
        }
        else {
            array = new Class[] { aans.class, aant.class, aanw.class };
        }
        return array;
    }
    
    public final void n(final vjj vjj, final boolean b) {
        if (this.v()) {
            if (this.i != null) {
                String.valueOf(vjj);
                this.m(new aaqd(this, vjj, b));
            }
        }
    }
    
    public final void o(final aarg h, final boolean r) {
        this.h = h;
        this.r = r;
        this.l();
        if (r && this.q) {
            this.D.d((Object)new aanu());
        }
    }
    
    public final void p(final aaua aaua) {
        this.m((Runnable)new aagj(this, aaua, 11));
    }
    
    public final boolean q() {
        return !this.r && !this.u.a();
    }
    
    public final void s(final aatr aatr) {
        final StringBuilder sb = new StringBuilder();
        sb.append(aatr.getMessage());
        sb.append("\n");
        final StackTraceElement[] stackTrace = aatr.getStackTrace();
        for (int length = stackTrace.length, i = 0; i < length; ++i) {
            sb.append(stackTrace[i]);
            sb.append("\n");
        }
        ttr.b(sb.toString());
        this.F.post((Runnable)new aagj(this, aatr, 10));
    }
}
