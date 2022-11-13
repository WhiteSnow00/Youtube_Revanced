import java.util.Set;
import com.google.android.apps.youtube.app.extensions.livecreation.MainLiveCreationActivity;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
import com.google.android.libraries.youtube.account.verification.ui.PhoneVerificationActivity;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import android.webkit.CookieManager;
import java.net.URI;
import java.util.Map;
import android.content.Context;
import android.app.Activity;
import com.google.android.apps.youtube.app.webviewfallback.WebViewFallbackActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class epu
{
    public final atke A;
    public final atke B;
    public final atke C;
    public final atke D;
    public final atke E;
    public final atke F;
    public final atke G;
    public final atke H;
    public final atke I;
    public final atke J;
    public final atke K;
    public final atke L;
    public final atke M;
    public final atke N;
    public final atke O;
    public final atke P;
    public final atke Q;
    public final atke R;
    public final atke S;
    public final atke T;
    public final atke U;
    public final atke V;
    public final atke W;
    public final atke X;
    public final atke Y;
    public final atke Z;
    public final eqy a;
    public final atke aA;
    public final atke aB;
    public final esp aC;
    private final atke aD;
    private final atke aE;
    private final atke aF;
    private final atke aG;
    private final atke aH;
    private final atke aI;
    private final atke aJ;
    private final atke aK;
    private final atke aL;
    private final atke aM;
    private final atke aN;
    private final atke aO;
    private final atke aP;
    private final atke aQ;
    private final atke aR;
    private final atke aS;
    private final atke aT;
    private final atke aU;
    private final atke aV;
    private final atke aW;
    private final atke aX;
    private final atke aY;
    private final atke aZ;
    public final atke aa;
    public final atke ab;
    public final atke ac;
    public final atke ad;
    public final atke ae;
    public final atke af;
    public final atke ag;
    public final atke ah;
    public final atke ai;
    public final atke aj;
    public final atke ak;
    public final atke al;
    public final atke am;
    public final atke an;
    public final atke ao;
    public final atke ap;
    public final atke aq;
    public final atke ar;
    public final atke as;
    public final atke at;
    public final atke au;
    public final atke av;
    public final atke aw;
    public final atke ax;
    public final atke ay;
    public final atke az;
    public final atke b;
    private final atke bA;
    private final atke bB;
    private final atke bC;
    private final atke bD;
    private final atke bE;
    private final atke bF;
    private final atke bG;
    private final atke bH;
    private final esq bI;
    private final atke ba;
    private final atke bb;
    private final atke bc;
    private final atke bd;
    private final atke be;
    private final atke bf;
    private final atke bg;
    private final atke bh;
    private final atke bi;
    private final atke bj;
    private final atke bk;
    private final atke bl;
    private final atke bm;
    private final atke bn;
    private final atke bo;
    private final atke bp;
    private final atke bq;
    private final atke br;
    private final atke bs;
    private final atke bt;
    private final atke bu;
    private final atke bv;
    private final atke bw;
    private final atke bx;
    private final atke by;
    private final atke bz;
    public final atke c;
    public final atke d;
    public final atke e;
    public final atke f;
    public final atke g;
    public final atke h;
    public final atke i;
    public final atke j;
    public final atke k;
    public final atke l;
    public final atke m;
    public final atke n;
    public final atke o;
    public final atke p;
    public final atke q;
    public final atke r;
    public final atke s;
    public final atke t;
    public final atke u;
    public final atke v;
    public final atke w;
    public final atke x;
    public final atke y;
    public final atke z;
    
    public epu(final eqy a, final esq bi, final esp ac) {
        this.a = a;
        this.bI = bi;
        this.aC = ac;
        this.aD = (atke)new ept(a, ac, 1);
        this.b = arlr.c((atke)new ept(a, ac, 0));
        this.c = arlr.c((atke)new ept(a, ac, 2));
        this.d = (atke)new ept(a, ac, 3);
        this.aE = (atke)new ept(a, ac, 7);
        this.aF = (atke)new ept(a, ac, 8);
        this.e = arlr.c((atke)new ept(a, ac, 11));
        this.f = arlr.c((atke)new ept(a, ac, 10));
        this.aG = arlr.c((atke)new ept(a, ac, 12));
        this.aH = arlr.c((atke)new ept(a, ac, 13));
        this.g = arlr.c((atke)new ept(a, ac, 9));
        this.aI = arlr.c((atke)new ept(a, ac, 17));
        this.aJ = arlr.c((atke)new ept(a, ac, 18));
        this.aK = arlr.c((atke)new ept(a, ac, 16));
        this.aL = (atke)new ept(a, ac, 15);
        this.aM = arlr.c((atke)new ept(a, ac, 19));
        this.aN = (atke)new ept(a, ac, 14);
        this.aO = (atke)new ept(a, ac, 20);
        this.h = arlr.c((atke)new ept(a, ac, 6));
        this.aP = (atke)new ept(a, ac, 5);
        this.aQ = (atke)new ept(a, ac, 21);
        this.aR = (atke)new ept(a, ac, 22);
        this.aS = (atke)new ept(a, ac, 23);
        this.aT = (atke)new ept(a, ac, 24);
        this.aU = (atke)new ept(a, ac, 25);
        this.aV = (atke)new ept(a, ac, 26);
        this.aW = (atke)new ept(a, ac, 27);
        this.i = (atke)new ept(a, ac, 4);
        this.aX = arlr.c((atke)new ept(a, ac, 29));
        this.j = arlr.c((atke)new ept(a, ac, 28));
        this.k = arlr.c((atke)new ept(a, ac, 30));
        this.l = (atke)new ept(a, ac, 32);
        this.m = (atke)new ept(a, ac, 33);
        this.aY = arlr.c((atke)new ept(a, ac, 34));
        this.aZ = arlr.c((atke)new ept(a, ac, 35));
        this.ba = arlr.c((atke)new ept(a, ac, 36));
        this.bb = (atke)new ept(a, ac, 37);
        this.bc = (atke)new ept(a, ac, 38);
        final ept bd = new ept(a, ac, 31);
        this.bd = (atke)bd;
        this.n = arlr.c((atke)bd);
        this.be = (atke)new ept(a, ac, 39);
        this.bf = (atke)new ept(a, ac, 40);
        this.bg = (atke)new ept(a, ac, 42);
        this.bh = (atke)new ept(a, ac, 43);
        this.bi = (atke)new ept(a, ac, 44);
        this.bj = (atke)new ept(a, ac, 45);
        this.o = (atke)new ept(a, ac, 41);
        this.p = arlr.c((atke)new ept(a, ac, 46));
        this.q = arlr.c((atke)new ept(a, ac, 47));
        this.r = arlr.c((atke)new ept(a, ac, 48));
        this.bk = (atke)new ept(a, ac, 50);
        this.s = (atke)new ept(a, ac, 49);
        this.t = arlr.c((atke)new ept(a, ac, 51));
        this.u = arlr.c((atke)new ept(a, ac, 52));
        this.v = arlr.c((atke)new ept(a, ac, 53));
        this.w = (atke)new ept(a, ac, 54);
        this.x = (atke)new ept(a, ac, 55);
        final ept bl = new ept(a, ac, 56);
        this.bl = (atke)bl;
        this.y = arlr.c((atke)bl);
        this.bm = arlr.c((atke)new ept(a, ac, 57));
        this.z = arlr.c((atke)new ept(a, ac, 58));
        this.A = arlr.c((atke)new ept(a, ac, 59));
        this.bn = arlr.c((atke)new ept(a, ac, 60));
        this.B = arlr.c((atke)new ept(a, ac, 61));
        this.bo = (atke)new ept(a, ac, 63);
        this.bp = (atke)new ept(a, ac, 64);
        this.bq = (atke)new ept(a, ac, 65);
        this.br = (atke)new ept(a, ac, 66);
        this.C = (atke)new ept(a, ac, 62);
        this.D = arlr.c((atke)new ept(a, ac, 67));
        final ept bs = new ept(a, ac, 68);
        this.bs = (atke)bs;
        this.E = arlr.c((atke)bs);
        this.F = arlr.c((atke)new ept(a, ac, 69));
        this.bt = arlr.c((atke)new ept(a, ac, 70));
        this.bu = arlr.c((atke)new ept(a, ac, 72));
        this.bv = arlr.c((atke)new ept(a, ac, 73));
        this.bw = arlr.c((atke)new ept(a, ac, 74));
        this.bx = arlr.c((atke)new ept(a, ac, 75));
        this.by = arlr.c((atke)new ept(a, ac, 76));
        this.bz = arlr.c((atke)new ept(a, ac, 77));
        this.bA = arlr.c((atke)new ept(a, ac, 78));
        this.G = arlr.c((atke)new ept(a, ac, 71));
        this.H = arlr.c((atke)new ept(a, ac, 79));
        this.I = arlr.c((atke)new ept(a, ac, 80));
        this.J = arlr.c((atke)new ept(a, ac, 81));
        this.K = arlr.c((atke)new ept(a, ac, 82));
        this.L = arlr.c((atke)new ept(a, ac, 83));
        this.M = arlr.c((atke)new ept(a, ac, 84));
        this.N = (atke)new ept(a, ac, 85);
        this.O = arlr.c((atke)new ept(a, ac, 86));
        this.P = arlr.c((atke)new ept(a, ac, 87));
        this.Q = arlr.c((atke)new ept(a, ac, 88));
        this.R = arlr.c((atke)new ept(a, ac, 89));
        this.bB = arlr.c((atke)new ept(a, ac, 91));
        this.S = arlr.c((atke)new ept(a, ac, 90));
        this.T = arlr.c((atke)new ept(a, ac, 92));
        this.bC = (atke)new ept(a, ac, 94);
        this.bD = (atke)new ept(a, ac, 95);
        this.bE = (atke)new ept(a, ac, 96);
        final ept bf = new ept(a, ac, 93);
        this.bF = (atke)bf;
        this.U = arlr.c((atke)bf);
        this.V = arlr.c((atke)new ept(a, ac, 97));
        this.W = arlr.c((atke)new ept(a, ac, 98));
        this.X = arlr.c(ac.dU);
        this.Y = arlr.c(ac.dU);
        this.Z = arlr.c(ac.dU);
        this.bG = arlr.c((atke)new ept(a, ac, 100));
        this.aa = arlr.c((atke)new ept(a, ac, 99));
        this.ab = arlr.c(ac.dU);
        this.ac = arlr.c(ac.dU);
        this.ad = arlr.c(ac.dU);
        this.ae = (atke)new ept(a, ac, 101);
        this.af = (atke)new ept(a, ac, 102);
        this.ag = (atke)new ept(a, ac, 103);
        this.ah = arlr.c((atke)new ept(a, ac, 104));
        this.ai = arlr.c((atke)new ept(a, ac, 105));
        this.aj = (atke)new ept(a, ac, 106);
        this.ak = arlr.c(ac.dU);
        this.al = arlr.c(ac.dU);
        this.am = arlr.c(ac.dU);
        this.an = arlr.c(ac.dU);
        this.ao = arlr.c(ac.dU);
        final ept bh = new ept(a, ac, 107);
        this.bH = (atke)bh;
        this.ap = arlr.c((atke)bh);
        this.aq = arlr.c((atke)new ept(a, ac, 108));
        this.ar = (atke)new ept(a, ac, 110);
        this.as = (atke)new ept(a, ac, 111);
        this.at = arlr.c((atke)new ept(a, ac, 109));
        this.au = arlr.c((atke)new ept(a, ac, 113));
        this.av = (atke)new ept(a, ac, 114);
        this.aw = (atke)new ept(a, ac, 112);
        this.ax = arlr.c((atke)new ept(a, ac, 115));
        this.ay = arlr.c((atke)new ept(a, ac, 116));
        this.az = arlr.c((atke)new ept(a, ac, 118));
        this.aA = arlr.c((atke)new ept(a, ac, 117));
        this.aB = arlr.c((atke)new ept(a, ac, 119));
    }
    
    static /* bridge */ atke A(final epu epu) {
        return epu.bC;
    }
    
    static /* bridge */ atke B(final epu epu) {
        return epu.bE;
    }
    
    static /* bridge */ atke C(final epu epu) {
        return epu.bo;
    }
    
    static /* bridge */ atke D(final epu epu) {
        return epu.bp;
    }
    
    static /* bridge */ atke E(final epu epu) {
        return epu.br;
    }
    
    static /* bridge */ atke F(final epu epu) {
        return epu.bq;
    }
    
    static /* bridge */ atke G(final epu epu) {
        return epu.bG;
    }
    
    static /* bridge */ atke H(final epu epu) {
        return epu.bk;
    }
    
    static /* bridge */ atke I(final epu epu) {
        return epu.f;
    }
    
    static /* bridge */ atke J(final epu epu) {
        return epu.aJ;
    }
    
    static /* bridge */ atke K(final epu epu) {
        return epu.e;
    }
    
    static /* bridge */ atke L(final epu epu) {
        return epu.bx;
    }
    
    static /* bridge */ atke M(final epu epu) {
        return epu.aY;
    }
    
    static /* bridge */ atke N(final epu epu) {
        return epu.aZ;
    }
    
    static /* bridge */ atke O(final epu epu) {
        return epu.aG;
    }
    
    static /* bridge */ atke P(final epu epu) {
        return epu.aM;
    }
    
    static /* bridge */ atke Q(final epu epu) {
        return epu.aK;
    }
    
    static /* bridge */ atke R(final epu epu) {
        return epu.by;
    }
    
    static /* bridge */ atke S(final epu epu) {
        return epu.aX;
    }
    
    static /* bridge */ atke T(final epu epu) {
        return epu.j;
    }
    
    static /* bridge */ atke U(final epu epu) {
        return epu.aI;
    }
    
    static /* bridge */ atke V(final epu epu) {
        return epu.ba;
    }
    
    static /* bridge */ atke W(final epu epu) {
        return epu.g;
    }
    
    static /* bridge */ atke X(final epu epu) {
        return epu.bc;
    }
    
    static /* bridge */ atke Y(final epu epu) {
        return epu.bv;
    }
    
    static /* bridge */ atke Z(final epu epu) {
        return epu.bb;
    }
    
    static /* bridge */ SwipeRefreshLayout a(final epu epu) {
        final SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout)((WebViewFallbackActivity)epu.aC.gn.a()).findViewById(2131432470);
        swipeRefreshLayout.getClass();
        return swipeRefreshLayout;
    }
    
    static /* bridge */ sqq aB(final epu epu) {
        return new sqq((Activity)epu.aC.d.a(), new piz((Activity)epu.aC.d.a()), (byte[])null);
    }
    
    static sqq aC(final epu epu) {
        return ((quj)epu.h.a()).f;
    }
    
    static /* bridge */ aujg aD(final epu epu) {
        final atke f = epu.aC.F;
        final eqy a = epu.a;
        return new aujg(f, a.jl, a.bp, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    private final agsf aE() {
        final agtb d = (agtb)this.aG.a();
        final agsn e = (agsn)this.aH.a();
        final ahaz builder = ((ahbh)agsf.a).createBuilder();
        builder.copyOnWrite();
        final agsf agsf = (agsf)builder.instance;
        agsf.c = 5;
        agsf.b |= 0x1;
        builder.copyOnWrite();
        final agsf agsf2 = (agsf)builder.instance;
        d.getClass();
        agsf2.d = d;
        agsf2.b |= 0x2;
        builder.copyOnWrite();
        final agsf agsf3 = (agsf)builder.instance;
        e.getClass();
        agsf3.e = e;
        agsf3.b |= 0x4;
        final agsf agsf4 = (agsf)builder.build();
        agsf4.getClass();
        return agsf4;
    }
    
    static /* bridge */ atke aa(final epu epu) {
        return epu.bA;
    }
    
    static /* bridge */ atke ab(final epu epu) {
        return epu.i;
    }
    
    static /* bridge */ atke ac(final epu epu) {
        return epu.bw;
    }
    
    static /* bridge */ atke ad(final epu epu) {
        return epu.bu;
    }
    
    static /* bridge */ atke ae(final epu epu) {
        return epu.B;
    }
    
    static /* bridge */ atke af(final epu epu) {
        return epu.z;
    }
    
    static /* bridge */ atke ag(final epu epu) {
        return epu.bn;
    }
    
    static /* bridge */ atke ah(final epu epu) {
        return epu.bt;
    }
    
    static /* bridge */ atke ai(final epu epu) {
        return epu.b;
    }
    
    static /* bridge */ atke aj(final epu epu) {
        return epu.bz;
    }
    
    static void ak(final jai d) {
        d.a.d = (jar)d;
    }
    
    static /* bridge */ heo al(final epu epu) {
        return epu.am();
    }
    
    static /* bridge */ ubu an(final epu epu) {
        return epu.ao();
    }
    
    static /* bridge */ rkc ap(final epu epu) {
        return epu.aq();
    }
    
    static /* bridge */ nns ar(final epu epu) {
        return epu.as();
    }
    
    static piz at(final epu epu) {
        return ((quj)epu.h.a()).e;
    }
    
    static /* bridge */ nns au(final epu epu) {
        return new nns((Context)epu.a.c.a(), (byte[])null, (byte[])null);
    }
    
    static /* bridge */ nns av(final epu epu) {
        return epu.aw();
    }
    
    static /* bridge */ nns ax(final epu epu) {
        return new nns(epu.a.a.gQ(), (byte[])null);
    }
    
    public static final auch ay() {
        final afev b = afim.b;
        return new auch(b, b);
    }
    
    static /* bridge */ tan az(final epu epu) {
        return new tan((Context)epu.a.c.a());
    }
    
    static /* bridge */ euq b(final epu epu) {
        final wyw wyw = (wyw)epu.aC.ag.a();
        final esp ac = epu.aC;
        return new euq(wyw, ac.aE, arlw.c(ac.bb));
    }
    
    static /* bridge */ qst d(final epu epu) {
        return epu.e();
    }
    
    static /* bridge */ quk f(final epu epu) {
        final aeyo a = aeyo.a;
        final blu blu = new blu(epu.a.r, epu.aE, epu.aF, epu.g, epu.aN, (int[])null);
        final blu blu2 = new blu(epu.aO, epu.a.r, epu.aE, epu.aF, epu.g, (char[])null, (char[])null);
        final eqy a2 = epu.a;
        return new quk((aezp)a, blu, blu2, new sqq(a2.c, a2.r, (char[])null), new blu(epu.a.r, epu.aL, epu.aM, epu.aF, epu.aE, (byte[])null, (char[])null), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    static quq g(final epu epu) {
        return ((quj)epu.h.a()).a;
    }
    
    static qus h(final epu epu) {
        return ((quj)epu.h.a()).b;
    }
    
    static /* bridge */ ula l(final epu epu) {
        return epu.m();
    }
    
    static /* bridge */ usi n(final epu epu) {
        return new usi((Context)epu.aC.d.a());
    }
    
    static /* bridge */ abpl o(final epu epu) {
        return epu.p();
    }
    
    static /* bridge */ absb q(final epu epu) {
        final absb r = ((abpu)epu.a.my.a()).r();
        r.getClass();
        return r;
    }
    
    static /* bridge */ agsf r(final epu epu) {
        return epu.aE();
    }
    
    static /* bridge */ Object s(final epu epu) {
        final CookieManager e = lnc.e();
        final URI create = URI.create(((lnf)epu.aC.gq.a()).d());
        create.getClass();
        return new mam(e, create, epu.aD);
    }
    
    static /* bridge */ Map t(final epu epu) {
        return afev.p(LiveCreationActivity.class, epu.bg, PhoneVerificationActivity.class, epu.bh, UploadActivity.class, epu.bi, MainLiveCreationActivity.class, epu.bj);
    }
    
    static /* bridge */ Set u(final epu epu) {
        return (Set)afft.s((Object)epu.aC.cv.a());
    }
    
    static /* bridge */ atke v(final epu epu) {
        return epu.aL;
    }
    
    static /* bridge */ atke w(final epu epu) {
        return epu.G;
    }
    
    static /* bridge */ atke x(final epu epu) {
        return epu.bB;
    }
    
    static /* bridge */ atke y(final epu epu) {
        return epu.bm;
    }
    
    static /* bridge */ atke z(final epu epu) {
        return epu.bD;
    }
    
    public final arzp aA() {
        return new arzp((Set)afft.v((Object)"com.google.android.libraries.youtube.metadataeditor.thumbnail.FrameSelectorVideoViewModel", (Object)"com.google.apps.tiktok.concurrent.futuresmixin.FuturesMixinViewModel", (Object)"com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.LocalMediaGreenScreenControllerViewModel", (Object)"com.google.apps.tiktok.dataservice.SubscriptionMixinViewModel"), new ere(this.a));
    }
    
    public final heo am() {
        final esp ac = this.aC;
        return new heo(ac.d, ac.ep, this.x, (char[])null);
    }
    
    public final ubu ao() {
        return new ubu((que)this.g.a(), (piz)this.l.a(), (qvb)this.m.a(), (byte[])null, (byte[])null);
    }
    
    public final rkc aq() {
        return ((quj)this.h.a()).d;
    }
    
    public final nns as() {
        return new nns((Context)this.a.c.a(), (char[])null);
    }
    
    public final nns aw() {
        return new nns(new nns((Context)this.a.c.a(), (char[])null), (byte[])null, (char[])null);
    }
    
    public final pax c() {
        final agsf ae = this.aE();
        final ahbf a = quh.a;
        final ahaz builder = ((ahbh)agsj.a).createBuilder();
        builder.copyOnWrite();
        final agsj agsj = (agsj)builder.instance;
        agsj.d = ae;
        agsj.c |= 0x1;
        return pax.a((ahaq)a, (Object)builder.build());
    }
    
    public final qst e() {
        final afes i = afev.i(8);
        i.g(qvx.class, this.aP);
        i.g(qvq.class, this.aQ);
        i.g(qwo.class, this.aR);
        i.g(qvu.class, this.aS);
        i.g(qwy.class, this.aT);
        i.g(qxb.class, this.aU);
        i.g(qxg.class, this.aV);
        i.g(qvb.class, this.aW);
        return new qst((Map)i.c());
    }
    
    public final qxp i() {
        final qxl c = qxl.c;
        final arkg b = arlr.b(this.be);
        final qxj a = qxm.a();
        a.e(qxl.c);
        a.c(qxh.b);
        b.getClass();
        a.b((arkg)new grx(b, 9));
        a.f(2132019015);
        a.g(110516);
        a.d((qxk)qxq.b);
        a.b = aezp.k((Object)new qrd(b, 4));
        final qxm a2 = a.a();
        final qxl b2 = qxl.b;
        final arkg b3 = arlr.b(this.bf);
        final qsw qsw = (qsw)this.j.a();
        final qxj a3 = qxm.a();
        a3.e(qxl.b);
        a3.c(qxh.a);
        a3.b(b3);
        a3.f(2132019017);
        a3.g(110515);
        a3.d((qxk)qxq.a);
        return new qxp((Map)afev.n(c, a2, b2, a3.a()), aezp.k((Object)agpi.R((Object[])new qxl[] { qxl.c, qxl.b })));
    }
    
    public final tvr j() {
        return mft.H((gkv)this.aC.bf.a(), 2132084262, 2132084263);
    }
    
    public final tvr k() {
        return mft.H((gkv)this.aC.bf.a(), 2132084322, 2132084323);
    }
    
    public final ula m() {
        return ufa.j((Context)this.a.qg.a);
    }
    
    public final abpl p() {
        final abpl m = ((abpu)this.a.my.a()).m();
        m.getClass();
        return m;
    }
}
