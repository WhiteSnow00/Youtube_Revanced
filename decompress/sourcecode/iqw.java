import com.google.android.libraries.youtube.player.ui.PlayerView;
import android.app.Activity;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import java.util.concurrent.TimeUnit;
import android.view.View;
import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.vr.ndk.base.DaydreamApi;
import java.util.concurrent.CopyOnWriteArraySet;
import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import android.graphics.Bitmap;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.HashSet;
import com.google.android.libraries.youtube.player.features.onesie.BandaidConnectionOpenerController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.PlayerCollapsedStateMonitor;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import android.view.ViewGroup;
import java.util.Set;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqw implements fnw, fjo, abtg, fnp, abnq
{
    final fnq A;
    public final lgs B;
    public final ixr C;
    public final fjp D;
    public final fvp E;
    public final gko F;
    public final Optional G;
    public final wzw H;
    public final asib I;
    public final Set J;
    public final boolean K;
    public final boolean L;
    public ViewGroup M;
    public fob N;
    public boolean O;
    public gkm P;
    public boolean Q;
    public YouTubePlayerViewNotForReflection R;
    public final uyf S;
    public final uyi T;
    public final iqp U;
    final qv V;
    public final ruo W;
    public final xpn X;
    public final elw Y;
    public qpt Z;
    public final iqt a;
    private final wwv aa;
    private final aauv ab;
    private final xlv ac;
    private final abjd ad;
    private final abni ae;
    private final gme af;
    private final atjj ag;
    private final lho ah;
    private final Executor ai;
    private final abpj aj;
    private final tdg ak;
    private final arud al;
    private final hmb am;
    private final cca an;
    public final kxb b;
    public final kwz c;
    public final tny d;
    public final tdz e;
    public final abns f;
    public final YouTubePlayerOverlaysLayout g;
    public final atjj h;
    public final fbi i;
    public final aamx j;
    public final iqo k;
    public final abli l;
    public final iqh m;
    public final aawb n;
    public final abth o;
    public final xfq p;
    public final atjj q;
    final atjj r;
    public final PlayerCollapsedStateMonitor s;
    public final iqp t;
    public final abno u;
    public final aapf v;
    public final atjj w;
    public final fgn x;
    public final toa y;
    public final BandaidConnectionOpenerController z;
    
    public iqw(final iqt a, final kxb b, final kwz c, final tny d, final tdz e, final abns f, final YouTubePlayerOverlaysLayout g, final atjj h, final hmb am, final fbi i, final aamx j, final iqo k, final abli l, final iqh m, final ruo w, final aawb n, final wwv aa, final abth o, final xfq p63, final atjj q, final atjj r, final aauv ab, final xlv ac, final PlayerCollapsedStateMonitor s, final iqp u, final iqp t, final abno u2, final abjd ad, final abni ae, final aapf v, final cca an, final atjj w2, final fgn x, final gme af, final toa y, final BandaidConnectionOpenerController z, final atjj ag, final fnq a2, final lgs b2, final qv v2, final lho ah, final fjp d2, final uyf s2, final arud al, final uyi t2, final Executor ai, final fvp e2, final tdg ak, final gko f2, final Optional g2, final wzw h2, final uyi uyi, final vup vup, final ixr c2, final elw y2, final abpj aj, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.I = new asib();
        this.J = new HashSet();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.am = am;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.W = w;
        this.n = n;
        this.aa = aa;
        this.o = o;
        this.p = p63;
        this.q = q;
        this.r = r;
        this.ab = ab;
        this.ac = ac;
        this.s = s;
        this.U = u;
        this.t = t;
        this.u = u2;
        this.ad = ad;
        this.ae = ae;
        this.v = v;
        this.an = an;
        this.w = w2;
        this.x = x;
        this.af = af;
        this.y = y;
        this.z = z;
        this.ag = ag;
        this.A = a2;
        this.B = b2;
        this.V = v2;
        this.ah = ah;
        this.D = d2;
        this.S = s2;
        this.al = al;
        this.T = t2;
        this.ai = ai;
        this.E = e2;
        this.ak = ak;
        this.F = f2;
        this.G = g2;
        this.H = h2;
        this.X = new xpn(vup, "player_fragment_peer", (auh)a.a, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.C = c2;
        this.Y = y2;
        this.K = uyi.aX();
        this.L = uyi.f(45377879L);
        this.aj = aj;
    }
    
    private final void u(final PlaybackStartDescriptor playbackStartDescriptor, final boolean b, final PlaybackServiceState playbackServiceState, final Bitmap bitmap, final aorm aorm, final wyn g) {
        final abln j = this.k.j();
        if (j != null) {
            j.b();
        }
        final fkk i = this.D.j();
        final fkk d = fkk.d;
        int n = -1;
        if (i == d) {
            final akak f = this.al.f();
            alvs alvs;
            if ((alvs = f.e) == null) {
                alvs = alvs.a;
            }
            if ((alvs.c & Integer.MIN_VALUE) != 0x0) {
                alvs alvs2;
                if ((alvs2 = f.e) == null) {
                    alvs2 = alvs.a;
                }
                n = alvs2.Q;
            }
        }
        else {
            final akak f2 = this.al.f();
            alvs alvs3;
            if ((alvs3 = f2.e) == null) {
                alvs3 = alvs.a;
            }
            if ((alvs3.c & 0x40000000) != 0x0) {
                alvs alvs4;
                if ((alvs4 = f2.e) == null) {
                    alvs4 = alvs.a;
                }
                n = alvs4.P;
            }
        }
        final boolean e = this.D.j().e();
        boolean b2 = false;
        if (e) {
            b2 = b2;
            if (!b) {
                b2 = true;
            }
        }
        final abia a = abib.a();
        a.f(n);
        a.e();
        a.b(b2);
        final aioe b3 = playbackStartDescriptor.b;
        if (b3 != null && ((agzd)b3).rs((agyr)WatchEndpointOuterClass.watchEndpoint) && (((apqg)((agzd)b3).rr((agyr)WatchEndpointOuterClass.watchEndpoint)).c & 0x10) != 0x0) {
            apqe apqe;
            if ((apqe = ((apqg)((agzd)b3).rr((agyr)WatchEndpointOuterClass.watchEndpoint)).A) == null) {
                apqe = apqe.a;
            }
            if ((apqe.b & 0x1) != 0x0) {
                a.j = Optional.of((Object)apqe.c);
            }
            if ((apqe.b & 0x2) != 0x0) {
                aply aply;
                if ((aply = aply.b(apqe.d)) == null) {
                    aply = aply.a;
                }
                a.i = Optional.of((Object)aply);
            }
        }
        if (g != null) {
            a.g = g;
            final boolean k = this.f.e().j;
            final agza builder = ((agzi)alkg.a).createBuilder();
            builder.copyOnWrite();
            final alkg alkg = (alkg)builder.instance;
            alkg.b |= 0x400;
            alkg.m = (k ^ true);
            g.a((alkg)builder.build());
        }
        if (playbackServiceState != null) {
            this.ae.g(playbackServiceState, a.a());
        }
        else {
            this.ae.e(playbackStartDescriptor, a.a());
        }
        final long c = playbackStartDescriptor.c();
        aorm aorm3;
        final aorm aorm2 = aorm3 = null;
        if (c == 0L) {
            final aioe b4 = playbackStartDescriptor.b;
            aorm3 = aorm2;
            if (b4 != null) {
                final apqg apqg = (apqg)((agzd)b4).rr((agyr)WatchEndpointOuterClass.watchEndpoint);
                aorm3 = aorm2;
                if ((apqg.b & 0x1000) != 0x0 && (aorm3 = apqg.n) == null) {
                    aorm3 = aorm.a;
                }
            }
        }
        final fnu fnu = new fnu(bitmap, aorm, aorm3);
        final Iterator iterator = this.J.iterator();
        while (iterator.hasNext()) {
            ((fnx)iterator.next()).g(ezp.e(playbackStartDescriptor), fnu);
        }
    }
    
    private static final Optional v(final aioe aioe) {
        if (aioe == null || (aioe.b & 0x1) == 0x0 || !((agzd)aioe).rs((agyr)WatchEndpointOuterClass.watchEndpoint)) {
            return Optional.empty();
        }
        final apqg apqg = (apqg)((agzd)aioe).rr((agyr)WatchEndpointOuterClass.watchEndpoint);
        appx appx;
        if ((appx = apqg.s) == null) {
            appx = appx.a;
        }
        if ((appx.b & 0x2) != 0x0) {
            appx appx2;
            if ((appx2 = apqg.s) == null) {
                appx2 = appx.a;
            }
            anwx anwx;
            if ((anwx = anwx.b(appx2.c)) == null) {
                anwx = anwx.a;
            }
            return Optional.of((Object)anwx);
        }
        return Optional.empty();
    }
    
    private final void w(final PlaybackStartDescriptor playbackStartDescriptor, final PlaybackServiceState playbackServiceState, final wyn wyn) {
        this.u(playbackStartDescriptor, false, playbackServiceState, null, null, wyn);
    }
    
    public final void a() {
        if (!ezp.i(this.u)) {
            return;
        }
        if (!this.ae.m()) {
            final elw e = this.B.e();
            final PlaybackServiceState n = this.u.n(false);
            if (e != null) {
                final abhx d = PlaybackStartDescriptor.d();
                d.a = e.b();
                this.s(d.a(), n);
            }
        }
    }
    
    public final void b(final boolean b) {
        final abno u = this.u;
        int n = 1;
        if (b) {
            n = 3;
        }
        u.ac(n);
    }
    
    public final void c() {
        this.b.c();
        this.a();
    }
    
    public final void d(final boolean b) {
        if (!this.Y.y(this)) {
            return;
        }
        if (this.D.j().e()) {
            this.ah.j(false);
            this.n(false);
        }
        else if (b && !this.Q) {
            this.n(true);
        }
        final aauw aauw = (aauw)this.ag.a();
        aauw.a.j();
        if (aauw.a.r) {
            aauw.c();
        }
        aauw.g = null;
        aauw.j = null;
        aauw.i = null;
        final aavb aavb = (aavb)aauw.b;
        aavb.b = null;
        aavb.c = null;
        final DaydreamApi d = aauw.d;
        if (d != null) {
            d.close();
            aauw.d = null;
        }
        aauw.g(this.ab);
        this.z.g();
        final hmb am = this.am;
        final boolean e = ((fbj)am.e).e();
        final int n = 3;
        int a;
        if (!e) {
            final fbg fbg = (fbg)am.f;
            final PlayerResponseModel e2 = fbg.e;
            ahws i;
            if (e2 == null || (i = aaja.i(e2.y())) == null) {
                i = null;
            }
            a = n;
            if (!fbg.b(i)) {
                ((fbg)am.f).a();
                a = n;
            }
        }
        else if (Build$VERSION.SDK_INT >= 28 && ((PackageManager)am.b).isPackageSuspended()) {
            a = n;
        }
        else {
            final abno abno = (abno)((atjj)am.c).a();
            szc.f();
            final ardu j = abno.e.j();
            a = j.a;
            final int n2 = a - 1;
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 == 3) {
                        ((fbg)am.f).a();
                    }
                }
                else {
                    ((xic)((atjj)am.d).a()).h();
                    ((fbg)am.f).b((ahws)j.b);
                }
            }
            else {
                ((fob)((atjj)am.a).a()).a();
                final fbg fbg2 = (fbg)am.f;
                fbg2.b.h();
                if (fbg2.a.f()) {
                    final fbi b2 = fbg2.b;
                    b2.t = 2;
                    b2.g = b2.f.c();
                    b2.g();
                    final fbf c = fbg2.c;
                    tcp.n((aum)c.e, c.g.b(c.f.c()), (trb)etd.d, (trb)new exr(c, 7));
                }
                final fbi b3 = fbg2.b;
                final PlayerResponseModel e3 = fbg2.e;
                ahwh p = null;
                Label_0693: {
                    if (e3 != null) {
                        final akuv y = e3.y();
                        if (y != null && (y.b & 0x800) != 0x0) {
                            akum akum;
                            if ((akum = y.j) == null) {
                                akum = akum.a;
                            }
                            ahwt a2;
                            if (akum.b == 64657230) {
                                akum akum2;
                                if ((akum2 = y.j) == null) {
                                    akum2 = akum.a;
                                }
                                if (akum2.b == 64657230) {
                                    a2 = (ahwt)akum2.c;
                                }
                                else {
                                    a2 = ahwt.a;
                                }
                            }
                            else {
                                a2 = null;
                            }
                            if (a2 != null) {
                                ahws ahws;
                                if ((ahws = a2.d) == null) {
                                    ahws = ahws.a;
                                }
                                if ((ahws.b & 0x4) != 0x0) {
                                    ahws ahws2;
                                    if ((ahws2 = a2.d) == null) {
                                        ahws2 = ahws.a;
                                    }
                                    if ((p = ahws2.e) == null) {
                                        p = ahwh.a;
                                    }
                                    break Label_0693;
                                }
                            }
                        }
                    }
                    p = null;
                }
                b3.p = p;
            }
        }
        if (!this.D.j().e() && a != 2) {
            this.X.d();
        }
        final iqt a3 = this.a;
        a3.od().getClass();
        final boolean finishing = a3.od().isFinishing();
        final boolean b4 = this.u.V() || a == 1;
        if (ezp.i(this.u)) {
            if (finishing && !b4) {
                this.n(false);
            }
            else if (!finishing) {
                this.b.h(false);
            }
        }
        final bu od = this.a.od();
        if (od != null && ((Activity)od).isChangingConfigurations()) {
            if (!b4) {
                this.u.a();
            }
        }
        else {
            this.u.C(finishing);
        }
        this.x.c();
        this.u.ac(1);
        final qv v = this.V;
        v.b = false;
        final Iterator iterator = ((CopyOnWriteArraySet)v.a).iterator();
        while (iterator.hasNext()) {
            ((foa)iterator.next()).lV();
        }
        ((atid)v.c).tr((Object)false);
        this.af.b(new qpt(this, (byte[])null));
    }
    
    public final void f(final boolean b) {
        this.Y.a = this;
        this.z.h();
        this.u.F();
        final aauw b2 = (aauw)this.ag.a();
        b2.b(this.ab);
        final bu od = this.a.od();
        final qpt z = this.Z;
        final tdg ak = this.ak;
        od.getClass();
        b2.g = od;
        z.getClass();
        b2.j = z;
        b2.i = ak;
        b2.a.k();
        b2.d = DaydreamApi.create((Context)b2.g);
        final aavb aavb = (aavb)b2.b;
        aavb.b = b2;
        aavb.c = od;
        final YouTubePlayerViewNotForReflection r = this.R;
        if (r != null) {
            this.u.z(((PlayerView)r).d, (abhn)this.r.a(), this.H.C);
        }
        int n;
        if (this.D.j().f()) {
            n = 2;
        }
        else if (!b) {
            n = 1;
        }
        else {
            n = 3;
        }
        this.u.ac(n);
        final qv v = this.V;
        v.b = true;
        final Iterator iterator = ((CopyOnWriteArraySet)v.a).iterator();
        while (iterator.hasNext()) {
            ((foa)iterator.next()).qB();
        }
        ((atid)v.c).tr((Object)true);
        this.an.n(this.D.j());
        this.m(false);
        if (!ezp.i(this.u)) {
            this.af.a(new qpt(this, (byte[])null));
        }
        this.X.e();
    }
    
    public final void g() {
        this.u.ag();
    }
    
    public final View h() {
        return ((br)this.a).O;
    }
    
    public final void i(final fkg fkg, final fkk fkk, final wyn g) {
        if (this.V.b) {
            final PlaybackStartDescriptor a = fkg.a.a;
            if (this.u.S(a) && fkg.d != 3) {
                return;
            }
            if (fkk != null) {
                this.an.o(fkk);
            }
            final abjc a2 = this.ad.a(a);
            if (a2 instanceof abix) {
                final abix abix = (abix)a2;
                final String k = a.k();
                final Executor ai = this.ai;
                final abia a3 = abib.a();
                a3.g = g;
                abix.h(a, k, ai, a3.a());
            }
        }
    }
    
    public final void j() {
        final fob n = this.N;
        if (n == null) {
            return;
        }
        n.b();
    }
    
    public final void k(final fkg fkg, final fkk fkk, final boolean b, final wyn g) {
        if (this.V.b) {
            final WatchDescriptor a = fkg.a;
            final PlaybackStartDescriptor a2 = a.a;
            final abno u = this.u;
            ajba ajba;
            if (fkk == fkk.j) {
                ajba = ajba.c;
            }
            else {
                ajba = ajba.b;
            }
            szc.f();
            final agkb s = u.s;
            if (s.a) {
                ((atid)s.c).tr((Object)ajba);
            }
            Label_0684: {
                if (this.u.S(a2)) {
                    final WatchDescriptor a3 = fkg.a;
                    final PlaybackStartDescriptor a4 = a3.a;
                    this.e.d((Object)new aaks());
                    if (g != null) {
                        g.c("pl_int");
                    }
                    final int d = fkg.d;
                    if (d == 1) {
                        if (this.aj.d()) {
                            this.u.D();
                            this.u.ag();
                            this.b.f(a4, a3.h() ^ true);
                            this.n.k(this.aa, a4.b);
                            return;
                        }
                        zjp.b(zjo.a, zjn.j, "INLINE_INCEPT is set but client does not support ContextualPlaybackConfig");
                    }
                    else {
                        int n = d;
                        while (true) {
                            Label_0253: {
                                if (a4.u()) {
                                    break Label_0253;
                                }
                                if ((n = d) == 2) {
                                    n = 2;
                                    break Label_0253;
                                }
                                if (n != 3) {
                                    return;
                                }
                                break Label_0684;
                            }
                            final aioe b2 = a4.b;
                            final abno u2 = this.u;
                            if (gkt.K(this.S)) {
                                final Optional v = v(b2);
                                if (!v.isEmpty() && b2 != null) {
                                    final apqg apqg = (apqg)((agzd)b2).rr((agyr)WatchEndpointOuterClass.watchEndpoint);
                                    final abtt q = u2.q();
                                    int d2;
                                    if (q == null) {
                                        d2 = 0;
                                    }
                                    else {
                                        d2 = (int)q.c();
                                    }
                                    final agza builder = ((agzi)alfq.a).createBuilder();
                                    final anwx anwx = (anwx)v.get();
                                    builder.copyOnWrite();
                                    final alfq alfq = (alfq)builder.instance;
                                    alfq.c = anwx.H;
                                    alfq.b |= 0x1;
                                    builder.copyOnWrite();
                                    final alfq alfq2 = (alfq)builder.instance;
                                    alfq2.b |= 0x2;
                                    alfq2.d = d2;
                                    final long millis = TimeUnit.SECONDS.toMillis((int)apqg.k);
                                    builder.copyOnWrite();
                                    final alfq alfq3 = (alfq)builder.instance;
                                    alfq3.b |= 0x4;
                                    alfq3.e = (int)millis;
                                    final alfq i = (alfq)builder.build();
                                    final agza builder2 = ((agzi)alff.a).createBuilder();
                                    builder2.copyOnWrite();
                                    final alff alff = (alff)builder2.instance;
                                    i.getClass();
                                    alff.I = i;
                                    alff.c |= 0x4000000;
                                    final alff alff2 = (alff)builder2.build();
                                    this.aa.D((wxz)new wws(b2.c));
                                    this.aa.J(3, (wxz)new wws(b2.c), alff2);
                                }
                            }
                            final Optional v2 = v(a4.b);
                            if (gkt.L(this.S) && v2.isPresent() && v2.get() != anwx.a) {
                                this.u.ab(a4.c(), (anwx)v2.get());
                                continue;
                            }
                            this.u.aa(a4.c());
                            continue;
                        }
                    }
                }
            }
            if (fkk != null) {
                this.an.o(fkk);
            }
            if (!this.f.cd().w()) {
                final abjc a5 = this.ad.a(a2);
                if (a5 instanceof abix) {
                    final abix abix = (abix)a5;
                    final String k = a2.k();
                    final Executor ai = this.ai;
                    final abia a6 = abib.a();
                    a6.g = g;
                    abix.h(a2, k, ai, a6.a());
                }
            }
            this.b.f(a2, a.h() ^ true);
            this.u(a2, b, null, fkg.c, fkg.b, g);
            if (fkg.e) {
                this.ae.k(true);
            }
        }
    }
    
    public final void l(final fnx fnx) {
        this.J.add(fnx);
    }
    
    public final asic[] lX(final abns abns) {
        final asic am = abns.I((aexg)imx.g, (aexg)imx.h).am((asix)new iqv(this, 0), (asix)hnn.t);
        asic asic;
        if (((uyi)abns.cd().h).bx()) {
            asic = abns.R().am((asix)new ign(this, 19), (asix)hnn.t);
        }
        else {
            asic = abns.Q().R().P(ashw.a()).am((asix)new ign(this, 19), (asix)hnn.t);
        }
        return new asic[] { am, asic, abns.T().am((asix)new ign(this, 20), (asix)hnn.t) };
    }
    
    public final void m(final boolean b) {
        final boolean i = ezp.i(this.u);
        if (i == (this.D.j() != fkk.a)) {
            return;
        }
        if (i) {
            final boolean f = this.u.f();
            if (this.O) {
                this.ah.n(false);
            }
            else {
                this.ah.r(false);
            }
            if (f && !this.u.f()) {
                this.u.ag();
                final ViewGroup m = this.M;
                if (m != null) {
                    m.post((Runnable)new ihc(this, 7));
                }
            }
            return;
        }
        if (!b) {
            return;
        }
        this.ah.j(false);
    }
    
    public final void n(final boolean b) {
        final xlo g = this.ac.g();
        final boolean b2 = this.V.b;
        int n = 0;
        if (!b2) {
            n = n;
            if (this.u.V()) {
                n = 1;
            }
        }
        if (g == null) {
            if (n == 0) {
                if (b) {
                    this.b.h(true);
                }
                this.u.ak(14);
                this.u.t();
                if (b) {
                    return;
                }
                this.b.b();
                final Iterator iterator = this.J.iterator();
                while (iterator.hasNext()) {
                    ((fnx)iterator.next()).f();
                }
            }
        }
    }
    
    public final void oK(final fkk fkk) {
        if (fkk == fkk.a) {
            this.n(false);
        }
        this.an.n(fkk);
    }
    
    public final void q(final PlaybackStartDescriptor playbackStartDescriptor, final wyn wyn) {
        playbackStartDescriptor.o(this.u.f() ^ true);
        this.w(playbackStartDescriptor, null, wyn);
    }
    
    public final void r() {
        if (this.u.f() && !this.v.r) {
            final iqt a = this.a;
            if (!a.au()) {
                final bu od = a.od();
                od.getClass();
                if (od.isInMultiWindowMode()) {
                    return;
                }
                this.A.a(3);
            }
        }
    }
    
    public final void s(final PlaybackStartDescriptor playbackStartDescriptor, final PlaybackServiceState playbackServiceState) {
        this.w(playbackStartDescriptor, playbackServiceState, null);
    }
    
    public final void t(final yzx yzx) {
        if ("surfaceunavailable".equals(yzx.m())) {
            this.r();
        }
    }
}
