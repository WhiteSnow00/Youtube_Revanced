import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
import java.util.function.Supplier;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity;
import com.google.protos.youtube.api.innertube.ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand;
import com.google.protos.youtube.api.innertube.ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand;
import com.google.protos.youtube.api.innertube.ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint;
import com.google.protos.youtube.api.innertube.MenuEndpointOuterClass$MenuEndpoint;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand;
import com.google.protos.youtube.api.innertube.NerdStatsEndpointOuterClass$NerdStatsEndpoint;
import com.google.protos.youtube.api.innertube.FlagVideoEndpointOuterClass$FlagVideoEndpoint;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity;
import com.google.android.apps.youtube.embeddedplayer.service.permissions.b;
import java.util.Set;
import java.util.List;
import java.util.Collection;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import android.content.Context;
import java.util.Map;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esk implements aeno, aenw, ariw
{
    public atjj A;
    public atjj B;
    public atjj C;
    public atjj D;
    public atjj E;
    public atjj F;
    public atjj G;
    public atjj H;
    public atjj I;
    public atjj J;
    public atjj K;
    public atjj L;
    public atjj M;
    public atjj N;
    public atjj O;
    public atjj P;
    public atjj Q;
    public atjj R;
    public atjj S;
    public atjj T;
    public atjj U;
    public atjj V;
    public atjj W;
    public atjj X;
    public atjj Y;
    public atjj Z;
    public final Activity a;
    private atjj aA;
    private atjj aB;
    private atjj aC;
    private atjj aD;
    private atjj aE;
    private atjj aF;
    private atjj aG;
    private atjj aH;
    private atjj aI;
    private atjj aJ;
    private atjj aK;
    private atjj aL;
    private atjj aM;
    private atjj aN;
    private atjj aO;
    private atjj aP;
    private atjj aQ;
    private atjj aR;
    private atjj aS;
    private atjj aT;
    private atjj aU;
    private atjj aV;
    private atjj aW;
    private atjj aX;
    private atjj aY;
    private atjj aZ;
    public atjj aa;
    public atjj ab;
    public atjj ac;
    public atjj ad;
    public atjj ae;
    public atjj af;
    public atjj ag;
    public atjj ah;
    public atjj ai;
    public atjj aj;
    public atjj ak;
    public atjj al;
    public atjj am;
    public atjj an;
    public atjj ao;
    public atjj ap;
    public atjj aq;
    public atjj ar;
    public atjj as;
    public atjj at;
    public atjj au;
    public atjj av;
    public atjj aw;
    public atjj ax;
    public atjj ay;
    public final aeoe az;
    public final eqv b;
    private atjj ba;
    private atjj bb;
    private atjj bc;
    private atjj bd;
    private atjj be;
    private atjj bf;
    private final esr bg;
    private final esl bh;
    private final esk bi;
    public atjj c;
    public atjj d;
    public atjj e;
    public atjj f;
    public atjj g;
    public atjj h;
    public atjj i;
    public atjj j;
    public atjj k;
    public atjj l;
    public atjj m;
    public atjj n;
    public atjj o;
    public atjj p;
    public atjj q;
    public atjj r;
    public atjj s;
    public atjj t;
    public atjj u;
    public atjj v;
    public atjj w;
    public atjj x;
    public atjj y;
    public atjj z;
    
    public esk() {
    }
    
    public esk(final eqv b, final esr bg, final esl bh, final Activity a, final aeoe az) {
        this.bi = this;
        this.b = b;
        this.bg = bg;
        this.bh = bh;
        this.a = a;
        this.az = az;
        this.c = (atjj)new epo(b, bg, this, 0);
        this.e = (atjj)new epo(b, bg, this, 4);
        this.aA = (atjj)new epo(b, bg, this, 6);
        this.aB = (atjj)new epo(b, bg, this, 7);
        this.f = (atjj)new epo(b, bg, this, 5);
        this.g = arjj.b((atjj)new epo(b, bg, this, 8));
        this.h = (atjj)new epo(b, bg, this, 10);
        this.aC = arjj.b((atjj)new epo(b, bg, this, 12));
        this.aD = arjj.b((atjj)new epo(b, bg, this, 13));
        this.aE = arjj.b((atjj)new epo(b, bg, this, 14));
        this.aF = arjj.b((atjj)new epo(b, bg, this, 15));
        this.i = arjj.b((atjj)new epo(b, bg, this, 17));
        this.j = (atjj)new epo(b, bg, this, 18);
        this.aG = arjj.b((atjj)new epo(b, bg, this, 16));
        this.l = (atjj)new epo(b, bg, this, 22);
        this.m = (atjj)new epo(b, bg, this, 21);
        this.n = (atjj)new epo(b, bg, this, 23);
        this.o = (atjj)new epo(b, bg, this, 24);
        this.aH = (atjj)new arjb();
        this.aI = arjj.b((atjj)new epo(b, bg, this, 28));
        this.p = (atjj)new epo(b, bg, this, 31);
        this.q = (atjj)new epo(b, bg, this, 30);
        this.aJ = (atjj)new epo(b, bg, this, 29);
        this.aK = (atjj)new epo(b, bg, this, 32);
        this.aL = (atjj)new epo(b, bg, this, 33);
        this.s = (atjj)new epo(b, bg, this, 36);
        this.r = (atjj)new epo(b, bg, this, 35);
        this.aM = (atjj)new epo(b, bg, this, 34);
        this.t = (atjj)new epo(b, bg, this, 37);
        final epo an = new epo(b, bg, this, 27);
        this.aN = (atjj)an;
        this.u = arjj.b((atjj)an);
        this.v = (atjj)new epo(b, bg, this, 26);
        this.w = (atjj)new epo(b, bg, this, 38);
        this.x = (atjj)new epo(b, bg, this, 25);
        this.y = arjj.b((atjj)new epo(b, bg, this, 20));
        this.aO = arjj.b((atjj)new epo(b, bg, this, 19));
        this.aP = arjj.b((atjj)new epo(b, bg, this, 39));
        this.aQ = arjj.b((atjj)new epo(b, bg, this, 40));
        this.aR = arjj.b((atjj)new epo(b, bg, this, 41));
        this.aS = (atjj)new epo(b, bg, this, 11);
        this.k = arjc.c((atjj)new epo(b, bg, this, 9));
        this.aT = (atjj)new epo(b, bg, this, 42);
        this.aU = (atjj)new epo(b, bg, this, 43);
        this.z = arjj.b((atjj)new epo(b, bg, this, 3));
        this.A = arjj.b((atjj)new epo(b, bg, this, 44));
        this.B = arjj.b((atjj)new epo(b, bg, this, 45));
        this.d = arjj.b((atjj)new epo(b, bg, this, 2));
        final epo av = new epo(b, bg, this, 1);
        this.aV = (atjj)av;
        arjb.b(this.aH, arjj.b((atjj)av));
        this.C = (atjj)new epo(b, bg, this, 46);
        this.D = (atjj)new epo(b, bg, this, 47);
        this.E = (atjj)new epo(b, bg, this, 48);
        this.F = (atjj)new epo(b, bg, this, 49);
        this.G = (atjj)new epo(b, bg, this, 50);
        this.H = (atjj)new epo(b, bg, this, 51);
        this.I = (atjj)new epo(b, bg, this, 52);
        this.aW = (atjj)new epo(b, bg, this, 53);
        this.J = (atjj)new epo(b, bg, this, 54);
        this.aX = (atjj)new epo(b, bg, this, 56);
        this.K = (atjj)new epo(b, bg, this, 57);
        this.L = (atjj)new epo(b, bg, this, 55);
        this.M = (atjj)new epo(b, bg, this, 58);
        this.N = (atjj)new epo(b, bg, this, 59);
        this.O = (atjj)new epo(b, bg, this, 60);
        this.P = (atjj)new epo(b, bg, this, 61);
        this.aY = (atjj)new epo(b, bg, this, 62);
        this.Q = (atjj)new epo(b, bg, this, 64);
        this.R = (atjj)new epo(b, bg, this, 65);
        this.S = (atjj)new epo(b, bg, this, 63);
        this.T = (atjj)new epo(b, bg, this, 66);
        this.U = arjc.c((atjj)new epo(b, bg, this, 67));
        this.aZ = (atjj)new epo(b, bg, this, 68);
        this.V = (atjj)new epo(b, bg, this, 69);
        this.W = (atjj)new epo(b, bg, this, 70);
        this.X = (atjj)new epo(b, bg, this, 73);
        this.ba = (atjj)new epo(b, bg, this, 72);
        this.bb = (atjj)new epo(b, bg, this, 74);
        final epo bc = new epo(b, bg, this, 71);
        this.bc = (atjj)bc;
        this.Y = arjc.c((atjj)bc);
        this.Z = arjc.c((atjj)new epo(b, bg, this, 75));
        this.aa = (atjj)new epo(b, bg, this, 76);
        this.bd = (atjj)new epo(b, bg, this, 77);
        this.ab = (atjj)new epo(b, bg, this, 78);
        this.be = (atjj)new epo(b, bg, this, 79);
        this.bf = (atjj)new epo(b, bg, this, 80);
        this.ac = (atjj)new epo(b, bg, this, 81);
        this.ad = (atjj)new epo(b, bg, this, 82);
        this.ae = (atjj)new epo(b, bg, this, 83);
        this.af = (atjj)new epo(b, bg, this, 84);
        this.ag = (atjj)new epo(b, bg, this, 85);
        this.ah = (atjj)new epo(b, bg, this, 86);
        this.ai = (atjj)new epo(b, bg, this, 87);
        this.aj = (atjj)new epo(b, bg, this, 88);
        this.ak = (atjj)new epo(b, bg, this, 89);
        this.al = (atjj)new epo(b, bg, this, 90);
        this.am = (atjj)new epo(b, bg, this, 91);
        this.an = (atjj)new epo(b, bg, this, 92);
        this.ao = (atjj)new epo(b, bg, this, 93);
        this.ap = (atjj)new epo(b, bg, this, 94);
        this.aq = (atjj)new epo(b, bg, this, 95);
        this.ar = (atjj)new epo(b, bg, this, 96);
        this.as = (atjj)new epo(b, bg, this, 97);
        this.at = (atjj)new epo(b, bg, this, 98);
        this.au = (atjj)new epo(b, bg, this, 99);
        this.av = (atjj)new epo(b, bg, this, 101);
        this.aw = (atjj)new epo(b, bg, this, 100);
        this.ax = (atjj)new epo(b, bg, this, 102);
        this.ay = (atjj)new epo(b, bg, this, 103);
    }
    
    private final oom bk() {
        return onk.l(this.Q());
    }
    
    private final osf bl() {
        return okq.b(aexq.k(this.aI.a()));
    }
    
    private final ouk bm() {
        return ops.p((aexq)aewp.a, (otd)this.f.a());
    }
    
    private final abzv bn() {
        final abzv ae = ((acat)aqqm.k((Object)this.c.a(), (Class)acat.class)).aE();
        ae.getClass();
        return ae;
    }
    
    private final Map bo() {
        return (Map)afcw.m((Object)ajtu.class, (Object)abzu.p(new aeby((otd)this.f.a())));
    }
    
    private final boolean bp() {
        return nzj.C((Context)this.b.c.a(), aexq.k(this.b.a.k()));
    }
    
    private static Map bq() {
        return onk.o(aexq.k(afgm.b));
    }
    
    public final osz A() {
        return okq.e((otm)this.aH.a(), (ort)this.d.a(), this.bm(), (otd)this.f.a(), bq(), this.bl());
    }
    
    public final osz B() {
        return ops.i((otm)this.aH.a(), aexq.k(this.b.ic.a()), (otd)this.f.a(), (ort)this.d.a(), (otl)okq.i((Map)afcw.m((Object)argv.class, (Object)okq.h((Context)this.b.c.a(), (otd)this.f.a())), (Map)afgm.b, (otd)this.f.a()), aexq.k(this.b.a.gp()), aexq.k(this.b.a.a()), aexq.k(this.b.a.go()));
    }
    
    public final osz C() {
        return nzj.v((otm)this.aH.a(), (ort)this.d.a(), (otd)this.f.a());
    }
    
    public final osz D() {
        return okq.f((otm)this.aH.a(), (ort)this.d.a(), this.bm(), (otd)this.f.a(), bq(), this.bl(), this.bp(), aexq.k(this.b.a.k()), aexq.k(this.b.a.gm()), aexq.k(this.b.a.gn()), aexq.k(this.b.a.go()));
    }
    
    public final otd E() {
        final Context context = (Context)this.b.c.a();
        arjc.b(this.aA);
        return abzu.h(arjc.b(this.aB));
    }
    
    public final ote F() {
        return ops.j(aexq.k(this.b.bt()));
    }
    
    public final JSEnvironment G() {
        return ops.k(aexq.k(this.b.cL.a()));
    }
    
    public final slt H() {
        final slt ac = ((snb)((arix)((aeoe)this.g.a()).a()).aR()).ac();
        ac.getClass();
        return ac;
    }
    
    public final typ I() {
        final typ ag = ((tyx)((arix)((aeoe)this.g.a()).a()).aR()).ag();
        ag.getClass();
        return ag;
    }
    
    public final tze J() {
        final tze ai = ((gvd)((arix)((aeoe)this.g.a()).a()).aR()).ai();
        ai.getClass();
        return ai;
    }
    
    public final tzs K() {
        final tzs aj = ((gvd)((arix)((aeoe)this.g.a()).a()).aR()).aj();
        aj.getClass();
        return aj;
    }
    
    public final wwv L() {
        final wwv ax = ((hxq)((arix)((aeoe)this.g.a()).a()).aR()).ax();
        ax.getClass();
        return ax;
    }
    
    public final xpj M() {
        final xpj ay = ((xpg)((arix)((aeoe)this.g.a()).a()).aR()).ay();
        ay.getClass();
        return ay;
    }
    
    public final abns N() {
        final abns ac = ((lhx)((arix)((aeoe)this.g.a()).a()).aR()).aC();
        ac.getClass();
        return ac;
    }
    
    public final actx O() {
        final actx an = ((lhw)((arix)((aeoe)this.g.a()).a()).aR()).aN();
        an.getClass();
        return an;
    }
    
    public final aexq P() {
        final Activity a = this.a;
        Label_0016: {
            if (a != null) {
                break Label_0016;
            }
            try {
                Object o = aewp.a;
                return (aexq)o;
                o = aexq.k(a);
                return (aexq)o;
            }
            catch (final ClassCastException ex) {
                throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(String.valueOf(String.valueOf(a))), ex);
            }
        }
    }
    
    public final asho Q() {
        return ops.o(aexq.k(this.b.bf.a()));
    }
    
    public final Object R() {
        return new hfw((bu)this.i.a(), (auip)this.b.a.aq.a(), null, null, null, null);
    }
    
    public final Object S() {
        return hlu.q((ggs)this.D.a());
    }
    
    public final String T() {
        return ops.f(aexq.k(this.b.da()));
    }
    
    public final Collection U() {
        return oog.a(this.Y());
    }
    
    public final List V() {
        return onk.i((Map)afcw.p((Object)ony.class, (Object)onk.d(onk.c(this.b.cO, arjc.b(this.A))), (Object)altw.class, (Object)abzu.i(acbj.e((uyi)this.b.do.a(), this.bo(), (otd)this.f.a())), (Object)acdi.class, (Object)acbj.c(acbj.h()), (Object)aqes.class, (Object)ohw.e((Object)ohw.f())), (Set)afgq.a);
    }
    
    public final Map W() {
        final afct i = afcw.i(37);
        i.g((Object)aqer.class, (Object)new ohu((osb)this.b.fO.a(), 19));
        i.g((Object)aqef.class, (Object)new fsy(arjc.b(this.d), this.Q(), 7));
        i.g((Object)aqeg.class, (Object)onk.m(arjc.b(this.d), aexq.k(this.b.a.gr()), this.Q()));
        i.g((Object)aqeq.class, (Object)onk.s(arjc.b(this.d)));
        i.g((Object)aqda.class, (Object)onk.q(arjc.b(this.d), this.Q()));
        i.g((Object)aqfa.class, (Object)new oox((osb)this.b.fO.a(), aexq.k(this.b.cQ.a()), 0));
        i.g((Object)aqdh.class, (Object)new oot((osb)this.b.fO.a(), arjc.b(this.d), aexq.k(this.b.cQ.a()), 1));
        i.g((Object)aqew.class, (Object)new oox((osb)this.b.fO.a(), aexq.k(this.b.cQ.a()), 1, (byte[])null));
        i.g((Object)aqep.class, (Object)onk.n());
        i.g((Object)aqcc.class, (Object)this.bk());
        i.g((Object)aqdn.class, (Object)this.e.a());
        i.g((Object)aqeh.class, (Object)onk.r(ops.n(), arjc.b(this.d)));
        i.g((Object)amsd.class, (Object)this.b.a.gP());
        i.g((Object)amiw.class, (Object)acbj.s((addp)this.b.a.X.a(), (otd)this.f.a()));
        final aeby ak = ((acaq)((arix)((aeoe)this.g.a()).a()).aR()).Ak();
        ak.getClass();
        i.g((Object)aqlc.class, (Object)acbj.t(ak, (uyi)this.b.a.b.a(), (otd)this.f.a()));
        final vax vax = (vax)this.k.a();
        final acbo acbo = (acbo)this.b.cv.a();
        final uyi uyi = (uyi)this.b.cF.a();
        final acdn acdn = (acdn)this.b.cr.a();
        i.g((Object)aioe.class, (Object)acbj.f(vax, acbo, uyi));
        i.g((Object)ajck.class, (Object)new ohu((ohr)this.aT.a(), 2));
        i.g((Object)ajcr.class, (Object)new ohu((ohr)this.aT.a(), 4));
        i.g((Object)anjd.class, (Object)ohw.i((oht)this.bn()));
        i.g((Object)ajcw.class, (Object)ohw.g((oht)this.bn()));
        i.g((Object)aoed.class, (Object)ohw.l((oht)this.bn()));
        i.g((Object)ajcs.class, (Object)com.google.android.apps.youtube.embeddedplayer.service.permissions.b.p((oht)this.bn()));
        i.g((Object)aqlj.class, (Object)ohw.k((ohn)this.aU.a()));
        i.g((Object)aqli.class, (Object)ohw.j((ohn)this.aU.a(), (otd)this.f.a()));
        i.g((Object)aqlq.class, (Object)ohw.o((ohn)this.aU.a(), (otd)this.f.a()));
        i.g((Object)aqla.class, (Object)com.google.android.apps.youtube.embeddedplayer.service.permissions.b.o((ohn)this.aU.a()));
        i.g((Object)altm.class, (Object)ohw.c());
        i.g((Object)altn.class, (Object)ohw.h());
        i.g((Object)acdb.class, (Object)acbj.g((Context)this.c.a()));
        i.g((Object)aivj.class, (Object)acbj.j(arjc.b(this.d), (thh)this.b.P.a()));
        i.g((Object)aqii.class, (Object)com.google.android.apps.youtube.embeddedplayer.service.permissions.b.m((Context)this.b.c.a()));
        i.g((Object)aopz.class, (Object)ohw.n(arjc.b(this.b.a.ag)));
        i.g((Object)aoiy.class, (Object)ohw.m(arjc.b(this.b.a.ag)));
        i.g((Object)ajhm.class, (Object)acbj.n((Context)this.c.a(), arjc.b(this.v), acey.t((acko)this.b.et.a()), arjc.b(this.d)));
        i.g((Object)aqil.class, (Object)ohw.b((otd)this.f.a()));
        i.g((Object)aqih.class, (Object)com.google.android.apps.youtube.embeddedplayer.service.permissions.b.n());
        i.g((Object)aqle.class, (Object)acbj.k(this.p));
        return (Map)i.c();
    }
    
    public final Map X() {
        final afct i = afcw.i(10);
        i.g((Object)arhp.class, (Object)this.D());
        i.g((Object)argw.class, (Object)this.v());
        i.g((Object)arhc.class, (Object)this.y());
        i.g((Object)arhm.class, (Object)this.C());
        i.g((Object)arhe.class, (Object)this.A());
        i.g((Object)argy.class, (Object)this.w());
        i.g((Object)arhd.class, (Object)this.z());
        i.g((Object)arhb.class, (Object)this.x());
        i.g((Object)arhh.class, (Object)this.B());
        i.g((Object)args.class, (Object)this.u());
        return (Map)i.c();
    }
    
    public final Map Y() {
        final afct i = afcw.i(8);
        i.g((Object)argr.class, (Object)okq.j());
        i.g((Object)arhf.class, (Object)onk.e());
        i.g((Object)argx.class, (Object)okq.l());
        i.g((Object)argz.class, (Object)onk.t((ort)this.d.a(), (mck)this.aK.a(), aexq.k(this.b.a.gx())));
        i.g((Object)arhj.class, (Object)onk.g());
        i.g((Object)arhn.class, (Object)onk.j((Map)afcw.m((Object)argu.class, (Object)onk.u()), (Map)afcw.n((Object)acdj.class, (Object)acbj.d(acbj.i()), (Object)aqen.class, (Object)ohw.d(new oiq((otd)this.f.a()))), aexq.k(this.b.a.gw()), (otd)this.f.a()));
        i.g((Object)arhi.class, (Object)onk.f((Map)afcw.o((Object)oqg.class, (Object)okq.q((ort)this.d.a(), (mck)this.aK.a()), (Object)oqi.class, (Object)okq.p((ort)this.d.a(), (mck)this.aK.a()), (Object)oqj.class, (Object)okq.r((ort)this.d.a(), (mck)this.aK.a())), this.bo(), (otd)this.f.a(), aexq.k(this.b.a.gh())));
        i.g((Object)arhq.class, (Object)onk.k((otd)this.f.a()));
        return (Map)i.c();
    }
    
    public final Map Z() {
        return (Map)afcw.m((Object)ReelWatchActivity.class, (Object)this.aS);
    }
    
    public final Context a() {
        final Context a = ((hjz)((arix)((aeoe)this.g.a()).a()).aR()).a();
        a.getClass();
        return a;
    }
    
    public final van aP() {
        final atjj c = this.c;
        final atjj k = this.k;
        final eqv b = this.b;
        return new van(c, k, b.jh, b.bp, (char[])null);
    }
    
    public final hyq aQ() {
        final hyq xe = ((gvm)((arix)((aeoe)this.g.a()).a()).aR()).xE();
        xe.getClass();
        return xe;
    }
    
    public final sin aR() {
        final sin yp = ((lhx)((arix)((aeoe)this.g.a()).a()).aR()).yp();
        yp.getClass();
        return yp;
    }
    
    public final kct aS() {
        final kct yb = ((krg)((arix)((aeoe)this.g.a()).a()).aR()).yB();
        yb.getClass();
        return yb;
    }
    
    public final cya aT() {
        final cya yq = ((hkb)((arix)((aeoe)this.g.a()).a()).aR()).yQ();
        yq.getClass();
        return yq;
    }
    
    public final e aV() {
        final atjj c = this.c;
        final atjj j = this.j;
        final eqv b = this.b;
        return new e(c, j, b.fj, b.dO, (short[])null, (byte[])null);
    }
    
    public final phq aW() {
        return new phq(this.r, ops.l(aexq.k(this.b.a.al.a())));
    }
    
    public final blt aX() {
        final blt za = ((jnj)((arix)((aeoe)this.g.a()).a()).aR()).za();
        za.getClass();
        return za;
    }
    
    public final cya aY() {
        final cya zk = ((guu)((arix)((aeoe)this.g.a()).a()).aR()).zk();
        zk.getClass();
        return zk;
    }
    
    public final alm aZ() {
        return new alm(this.c, this.bb, this.j, (short[])null);
    }
    
    public final Map aa() {
        final afct i = afcw.i(9);
        i.g((Object)FlagVideoEndpointOuterClass$FlagVideoEndpoint.class, (Object)this.aC);
        i.g((Object)NerdStatsEndpointOuterClass$NerdStatsEndpoint.class, (Object)this.aD);
        i.g((Object)ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.class, (Object)this.aE);
        i.g((Object)ReelWatchEndpointOuterClass$ReelWatchEndpoint.class, (Object)this.aF);
        i.g((Object)aial.class, (Object)this.aG);
        i.g((Object)MenuEndpointOuterClass$MenuEndpoint.class, (Object)this.aO);
        i.g((Object)ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.class, (Object)this.aP);
        i.g((Object)ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.class, (Object)this.aQ);
        i.g((Object)ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.class, (Object)this.aR);
        return (Map)i.c();
    }
    
    public final Map ab() {
        return (Map)afcw.n((Object)ShortsCreationActivity.class, (Object)this.aX, (Object)WatchWhileActivity.class, (Object)this.c);
    }
    
    public final Supplier ac() {
        return (Supplier)new gnu((Activity)this.c.a(), 20);
    }
    
    public final Supplier ad() {
        return (Supplier)new ziv((Activity)this.c.a(), 1);
    }
    
    public final Supplier ae() {
        return xkm.ah((Activity)this.c.a());
    }
    
    public final gxa af() {
        final gxa bb = ((gxc)((arix)((aeoe)this.g.a()).a()).aR()).bb();
        bb.getClass();
        return bb;
    }
    
    public final auh b() {
        return szp.h((aum)this.i.a());
    }
    
    public final alm ba() {
        return new alm(this.c, this.ba, this.j, (byte[])null, (short[])null);
    }
    
    public final alm bb() {
        return new alm((Activity)this.c.a(), (fml)this.b.jn.a(), (SettingsDataAccess)this.Z.a());
    }
    
    public final fzo bc() {
        return new fzo(this.c, this.S, (char[])null);
    }
    
    public final fzo be() {
        final fzo zl = ((gxb)((arix)((aeoe)this.g.a()).a()).aR()).zL();
        zl.getClass();
        return zl;
    }
    
    public final vup bg() {
        return trl.m((Activity)this.c.a(), (uyi)this.b.jV.a());
    }
    
    public final fzo bh() {
        final fzo ac = ((lhw)((arix)((aeoe)this.g.a()).a()).aR()).Ac();
        ac.getClass();
        return ac;
    }
    
    @Override
    public final tyh bi() {
        return new tyh(this.b, this.bg, this.bh, this.bi);
    }
    
    public final aeby bj() {
        final aeby al = ((abyz)((arix)((aeoe)this.g.a()).a()).aR()).Al();
        al.getClass();
        return al;
    }
    
    public final LoggingUrlsPingController c() {
        final LoggingUrlsPingController h = ((fiw)((arix)((aeoe)this.g.a()).a()).aR()).h();
        h.getClass();
        return h;
    }
    
    public final fjp d() {
        final fjp i = ((fqs)((arix)((aeoe)this.g.a()).a()).aR()).i();
        i.getClass();
        return i;
    }
    
    public final fzw e() {
        final fzw m = ((jyl)((arix)((aeoe)this.g.a()).a()).aR()).m();
        m.getClass();
        return m;
    }
    
    public final fzw f() {
        final fzw n = ((jyl)((arix)((aeoe)this.g.a()).a()).aR()).n();
        n.getClass();
        return n;
    }
    
    public final gbn g() {
        final gbn q = ((gbm)((arix)((aeoe)this.g.a()).a()).aR()).q();
        q.getClass();
        return q;
    }
    
    public final gdu h() {
        final gdu r = ((gdz)((arix)((aeoe)this.g.a()).a()).aR()).r();
        r.getClass();
        return r;
    }
    
    public final ggi i() {
        final ggi u = ((lhx)((arix)((aeoe)this.g.a()).a()).aR()).u();
        u.getClass();
        return u;
    }
    
    public final gug j() {
        final gug b = ((gua)((arix)((aeoe)this.g.a()).a()).aR()).B();
        b.getClass();
        return b;
    }
    
    public final SfvAudioItemPlaybackController k() {
        final SfvAudioItemPlaybackController c = ((gum)((arix)((aeoe)this.g.a()).a()).aR()).C();
        c.getClass();
        return c;
    }
    
    public final hax l() {
        final hax f = ((haq)((arix)((aeoe)this.g.a()).a()).aR()).F();
        f.getClass();
        return f;
    }
    
    public final hbr m() {
        final hbr h = ((hbs)((arix)((aeoe)this.g.a()).a()).aR()).H();
        h.getClass();
        return h;
    }
    
    public final hlh n() {
        final hlh j = ((hla)((arix)((aeoe)this.g.a()).a()).aR()).J();
        j.getClass();
        return j;
    }
    
    public final hnj o() {
        final hnj k = ((hlb)((arix)((aeoe)this.g.a()).a()).aR()).K();
        k.getClass();
        return k;
    }
    
    public final hqa p() {
        final hqa l = ((hpa)((arix)((aeoe)this.g.a()).a()).aR()).L();
        l.getClass();
        return l;
    }
    
    public final hru q() {
        final hru m = ((hka)((arix)((aeoe)this.g.a()).a()).aR()).M();
        m.getClass();
        return m;
    }
    
    public final jvu r() {
        final jvu q = ((kmf)((arix)((aeoe)this.g.a()).a()).aR()).Q();
        q.getClass();
        return q;
    }
    
    public final jww s() {
        final jww r = ((lhx)((arix)((aeoe)this.g.a()).a()).aR()).R();
        r.getClass();
        return r;
    }
    
    public final kmh t() {
        final kmh u = ((kmf)((arix)((aeoe)this.g.a()).a()).aR()).U();
        u.getClass();
        return u;
    }
    
    public final osz u() {
        return nzj.z((otm)this.aH.a(), (ort)this.d.a(), (otd)this.f.a());
    }
    
    public final osz v() {
        return nzj.t((otm)this.aH.a());
    }
    
    public final osz w() {
        return ohw.v((otm)this.aH.a(), (ort)this.d.a(), this.bk(), this.aJ, (otd)this.f.a(), (mck)this.aK.a(), okq.u(this.aL, (otd)this.f.a(), (Object)okq.s(this.aK), (ort)this.d.a(), aexq.k(this.b.bq)), (Set)afgq.a);
    }
    
    public final osz x() {
        final opi p = onk.p((Context)this.b.c.a(), aexq.k(this.b.cz.a()), aexq.k(this.b.cM.a()), aexq.k(this.b.cs.a()), this.aM, this.r, this.t);
        final osb osb = (osb)this.b.fO.a();
        final aexq k = aexq.k(this.b.bq);
        final otd otd = (otd)this.f.a();
        final oub c = ops.c(aexq.k(acbj.b((boolean)this.b.cs.a(), arjc.b(this.b.a.ac))));
        final arhr b = arjc.b(this.aM);
        final adbl adbl = (adbl)this.b.a.d.a();
        final atjj r = this.r;
        final osc osc = (osc)this.t.a();
        final aexq i = aexq.k(this.b.cs.a());
        final Context context = (Context)this.b.c.a();
        final aexq j = aexq.k(false);
        final int a = acbg.a;
        final Boolean value = true;
        final ojm p2 = ohw.p((oui)p, osb, k, otd, c, b, adbl, r, osc, i, j, aexq.k(value), aexq.k(value), aexq.k(this.b.cQ.a()), aexq.k(this.b.c()), aexq.k(this.b.a.ad.a()), aexq.k(this.b.a.gq()), (aexq)aewp.a, aexq.k(this.b.a.ae), aexq.k(this.b.a.gy()), aexq.k(this.b.a.gv()), aexq.k(this.b.a.gu()), aexq.k(this.b.a.gj()));
        final otm otm = (otm)this.aH.a();
        final ort ort = (ort)this.d.a();
        this.bm();
        final otd otd2 = (otd)this.f.a();
        return okq.c(p2, otm);
    }
    
    public final osz y() {
        return nzj.u((otm)this.aH.a());
    }
    
    public final osz z() {
        return okq.d((otm)this.aH.a(), (ort)this.d.a(), this.bm(), (otd)this.f.a(), this.bp(), aexq.k(this.b.a.k()), aexq.k(this.b.a.gk()), bq());
    }
}
