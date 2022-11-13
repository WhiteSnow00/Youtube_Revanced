import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import android.content.SharedPreferences;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;
import java.util.Set;
import android.os.Bundle;
import java.util.Map;
import android.app.Activity;
import android.content.Context;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esr implements aejs, aeph, aeqb, arll
{
    public atke A;
    public atke B;
    public atke C;
    public atke D;
    public atke E;
    public atke F;
    public atke G;
    public atke H;
    public atke I;
    public atke J;
    public atke K;
    public atke L;
    public atke M;
    public atke N;
    public atke O;
    public atke P;
    public atke Q;
    public atke R;
    public atke S;
    public atke T;
    public atke U;
    public atke V;
    public atke W;
    public atke X;
    public atke Y;
    public atke Z;
    public final eqy a;
    public atke aA;
    public atke aB;
    public atke aC;
    public atke aD;
    public atke aE;
    public atke aF;
    public atke aG;
    public atke aH;
    public atke aI;
    public atke aJ;
    public atke aK;
    public final esu aL;
    public final eso aM;
    public final esn aN;
    private atke aO;
    private atke aP;
    private atke aQ;
    private atke aR;
    private atke aS;
    private atke aT;
    private atke aU;
    private atke aV;
    private atke aW;
    private atke aX;
    private atke aY;
    private atke aZ;
    public atke aa;
    public atke ab;
    public atke ac;
    public atke ad;
    public atke ae;
    public atke af;
    public atke ag;
    public atke ah;
    public atke ai;
    public atke aj;
    public atke ak;
    public atke al;
    public atke am;
    public atke an;
    public atke ao;
    public atke ap;
    public atke aq;
    public atke ar;
    public atke as;
    public atke at;
    public atke au;
    public atke av;
    public atke aw;
    public atke ax;
    public atke ay;
    public atke az;
    public atke b;
    private atke bA;
    private atke bB;
    private atke bC;
    private atke bD;
    private atke bE;
    private atke bF;
    private final esr bG;
    private atke ba;
    private atke bb;
    private atke bc;
    private atke bd;
    private atke be;
    private atke bf;
    private atke bg;
    private atke bh;
    private atke bi;
    private atke bj;
    private atke bk;
    private atke bl;
    private atke bm;
    private atke bn;
    private atke bo;
    private atke bp;
    private atke bq;
    private atke br;
    private atke bs;
    private atke bt;
    private atke bu;
    private atke bv;
    private atke bw;
    private atke bx;
    private atke by;
    private atke bz;
    public atke c;
    public atke d;
    public atke e;
    public atke f;
    public atke g;
    public atke h;
    public atke i;
    public atke j;
    public atke k;
    public atke l;
    public atke m;
    public atke n;
    public atke o;
    public atke p;
    public atke q;
    public atke r;
    public atke s;
    public atke t;
    public atke u;
    public atke v;
    public atke w;
    public atke x;
    public atke y;
    public atke z;
    
    public esr() {
    }
    
    public esr(final eqy a, final esu al, final eso am, final esn an, final br br) {
        this.bG = this;
        this.a = a;
        this.aL = al;
        this.aM = am;
        this.aN = an;
        this.b = (atke)arlt.b((Object)br);
        final eqd ao = new eqd(a, al, an, this, 2);
        this.aO = (atke)ao;
        this.aP = arly.b((atke)ao);
        this.aQ = (atke)new eqd(a, al, an, this, 1);
        this.c = (atke)new eqd(a, al, an, this, 0);
        this.d = (atke)new eqd(a, al, an, this, 3);
        this.aR = (atke)new eqd(a, al, an, this, 5);
        this.e = (atke)new eqd(a, al, an, this, 4);
        this.f = (atke)new eqd(a, al, an, this, 7);
        this.g = (atke)new eqd(a, al, an, this, 8);
        this.h = arlr.c(a.iK);
        this.i = arlr.c((atke)new eqd(a, al, an, this, 9));
        this.aS = (atke)new eqd(a, al, an, this, 11);
        this.aT = (atke)new eqd(a, al, an, this, 12);
        this.j = (atke)new eqd(a, al, an, this, 10);
        this.aU = (atke)new eqd(a, al, an, this, 14);
        this.k = (atke)new eqd(a, al, an, this, 15);
        this.l = arlr.c((atke)new eqd(a, al, an, this, 16));
        this.m = arlr.c((atke)new eqd(a, al, an, this, 17));
        this.aV = arlr.c((atke)new eqd(a, al, an, this, 18));
        this.n = arlr.c((atke)new eqd(a, al, an, this, 13));
        this.o = arlr.c((atke)new eqd(a, al, an, this, 19));
        this.p = arlr.c((atke)new eqd(a, al, an, this, 20));
        this.q = arly.b((atke)new eqd(a, al, an, this, 21));
        this.r = (atke)new eqd(a, al, an, this, 22);
        this.s = arly.b((atke)new eqd(a, al, an, this, 23));
        this.t = arly.b((atke)new eqd(a, al, an, this, 24));
        this.u = arly.b((atke)new eqd(a, al, an, this, 25));
        this.v = arlr.c((atke)new eqd(a, al, an, this, 26));
        this.aW = (atke)new eqd(a, al, an, this, 28);
        this.aX = (atke)new eqd(a, al, an, this, 29);
        this.w = arlr.c((atke)new eqd(a, al, an, this, 31));
        this.aY = arlr.c((atke)new eqd(a, al, an, this, 30));
        final eqd az = new eqd(a, al, an, this, 32);
        this.aZ = (atke)az;
        this.x = arlr.c((atke)az);
        this.y = (atke)new eqd(a, al, an, this, 34);
        this.ba = arlr.c((atke)new eqd(a, al, an, this, 35));
        this.z = arlr.c((atke)new eqd(a, al, an, this, 33));
        this.A = arly.b((atke)new eqd(a, al, an, this, 36));
        this.B = arlr.c((atke)new eqd(a, al, an, this, 27));
        this.bb = arly.b((atke)new eqd(a, al, an, this, 39));
        this.bc = arly.b((atke)new eqd(a, al, an, this, 40));
        this.bd = arlr.c((atke)new eqd(a, al, an, this, 42));
        this.be = arlr.c((atke)new eqd(a, al, an, this, 43));
        this.D = arlr.c((atke)new eqd(a, al, an, this, 41));
        this.bg = arlr.c((atke)new eqd(a, al, an, this, 47));
        this.bh = (atke)new eqd(a, al, an, this, 46);
        this.bf = arlr.c((atke)new eqd(a, al, an, this, 45));
        this.bi = (atke)new eqd(a, al, an, this, 44);
        this.bj = (atke)new eqd(a, al, an, this, 48);
        this.bk = (atke)new eqd(a, al, an, this, 49);
        this.bl = (atke)new eqd(a, al, an, this, 38);
        this.C = arlr.c((atke)new eqd(a, al, an, this, 37));
        this.E = arlr.c((atke)new eqd(a, al, an, this, 50));
        this.F = (atke)new eqd(a, al, an, this, 51);
        this.bm = (atke)new eqd(a, al, an, this, 53);
        this.bn = (atke)new eqd(a, al, an, this, 54);
        this.bo = (atke)new eqd(a, al, an, this, 56);
        this.bp = (atke)new eqd(a, al, an, this, 55);
        this.bq = (atke)new eqd(a, al, an, this, 57);
        this.G = (atke)new eqd(a, al, an, this, 52);
        this.br = (atke)new eqd(a, al, an, this, 59);
        this.bs = (atke)new eqd(a, al, an, this, 61);
        this.bt = (atke)new eqd(a, al, an, this, 62);
        this.H = (atke)new eqd(a, al, an, this, 60);
        this.bu = (atke)new eqd(a, al, an, this, 63);
        this.bv = (atke)new eqd(a, al, an, this, 65);
        this.bw = (atke)new eqd(a, al, an, this, 66);
        this.I = arlr.c((atke)new eqd(a, al, an, this, 64));
        this.J = arlr.c((atke)new eqd(a, al, an, this, 58));
        this.K = arlr.c((atke)new eqd(a, al, an, this, 67));
        this.L = arlr.c((atke)new eqd(a, al, an, this, 68));
        this.M = arly.b((atke)new eqd(a, al, an, this, 70));
        this.N = arly.b((atke)new eqd(a, al, an, this, 69));
        this.O = arlr.c((atke)new eqd(a, al, an, this, 71));
        this.P = arly.b((atke)new eqd(a, al, an, this, 72));
        this.Q = arly.b((atke)new eqd(a, al, an, this, 73));
        this.R = arly.b((atke)new eqd(a, al, an, this, 74));
        this.S = arlr.c((atke)new eqd(a, al, an, this, 75));
        this.T = (atke)new eqd(a, al, an, this, 76);
        this.U = arlr.c((atke)new eqd(a, al, an, this, 77));
        this.V = arlr.c((atke)new eqd(a, al, an, this, 78));
        this.W = (atke)new eqd(a, al, an, this, 79);
        this.X = (atke)new eqd(a, al, an, this, 80);
        this.Y = (atke)new eqd(a, al, an, this, 81);
        this.bx = (atke)new eqd(a, al, an, this, 83);
        this.Z = (atke)new eqd(a, al, an, this, 82);
        this.aa = (atke)new eqd(a, al, an, this, 84);
        this.ab = (atke)new eqd(a, al, an, this, 85);
        this.ac = (atke)new eqd(a, al, an, this, 86);
        this.by = (atke)new eqd(a, al, an, this, 88);
        this.bz = (atke)new eqd(a, al, an, this, 89);
        this.bA = (atke)new eqd(a, al, an, this, 90);
        this.bB = (atke)new eqd(a, al, an, this, 92);
        this.bC = (atke)new eqd(a, al, an, this, 91);
        this.bD = (atke)new eqd(a, al, an, this, 93);
        this.ad = (atke)new eqd(a, al, an, this, 87);
        this.ae = (atke)new eqd(a, al, an, this, 94);
        this.af = (atke)new eqd(a, al, an, this, 95);
        this.bE = (atke)new eqd(a, al, an, this, 97);
        this.ag = (atke)new eqd(a, al, an, this, 96);
        this.ah = (atke)new eqd(a, al, an, this, 98);
        this.bF = (atke)new eqd(a, al, an, this, 100);
        this.ai = (atke)new eqd(a, al, an, this, 99);
        this.aj = (atke)new eqd(a, al, an, this, 101);
        this.ak = (atke)new eqd(a, al, an, this, 103);
        this.al = (atke)new eqd(a, al, an, this, 102);
        this.am = (atke)new eqd(a, al, an, this, 104);
        this.an = (atke)new eqd(a, al, an, this, 105);
        this.ao = (atke)new eqd(a, al, an, this, 106);
        this.ap = (atke)new eqd(a, al, an, this, 107);
        this.aq = (atke)new eqd(a, al, an, this, 108);
        this.ar = (atke)new eqd(a, al, an, this, 109);
        this.as = (atke)new eqd(a, al, an, this, 111);
        this.at = (atke)new eqd(a, al, an, this, 112);
        this.au = (atke)new eqd(a, al, an, this, 110);
        this.av = (atke)new eqd(a, al, an, this, 114);
        this.aw = (atke)new eqd(a, al, an, this, 113);
        this.ax = (atke)new eqd(a, al, an, this, 115);
        this.ay = (atke)new eqd(a, al, an, this, 116);
        this.az = arlr.c((atke)new eqd(a, al, an, this, 118));
        this.aA = arlr.c((atke)new eqd(a, al, an, this, 117));
        this.aB = arlr.c((atke)new eqd(a, al, an, this, 119));
        this.aC = arlr.c((atke)new eqd(a, al, an, this, 120));
        this.aD = arly.b((atke)new eqd(a, al, an, this, 121));
        this.aE = arlr.c((atke)new eqd(a, al, an, this, 122));
        this.aF = arlr.c((atke)new eqd(a, al, an, this, 124));
        this.aG = arlr.c((atke)new eqd(a, al, an, this, 123));
        this.aH = arlr.c((atke)new eqd(a, al, an, this, 125));
        this.aI = (atke)new eqd(a, al, an, this, 126);
        this.aJ = arlr.c((atke)new eqd(a, al, an, this, 127));
        this.aK = arlr.c((atke)new eqd(a, al, an, this, 128));
    }
    
    static /* bridge */ atke A(final esr esr) {
        return esr.bk;
    }
    
    static /* bridge */ atke B(final esr esr) {
        return esr.h;
    }
    
    static /* bridge */ atke C(final esr esr) {
        return esr.x;
    }
    
    static /* bridge */ atke D(final esr esr) {
        return esr.bF;
    }
    
    static /* bridge */ atke E(final esr esr) {
        return esr.bs;
    }
    
    static /* bridge */ atke F(final esr esr) {
        return esr.bB;
    }
    
    static /* bridge */ atke G(final esr esr) {
        return esr.bu;
    }
    
    static /* bridge */ atke H(final esr esr) {
        return esr.q;
    }
    
    static /* bridge */ atke I(final esr esr) {
        return esr.bp;
    }
    
    static /* bridge */ atke J(final esr esr) {
        return esr.aP;
    }
    
    static /* bridge */ atke K(final esr esr) {
        return esr.bt;
    }
    
    static /* bridge */ atke L(final esr esr) {
        return esr.bj;
    }
    
    static /* bridge */ atke M(final esr esr) {
        return esr.b;
    }
    
    static /* bridge */ atke N(final esr esr) {
        return esr.br;
    }
    
    static /* bridge */ atke O(final esr esr) {
        return esr.H;
    }
    
    static /* bridge */ atke P(final esr esr) {
        return esr.I;
    }
    
    static /* bridge */ atke Q(final esr esr) {
        return esr.bE;
    }
    
    static /* bridge */ atke R(final esr esr) {
        return esr.bz;
    }
    
    static /* bridge */ atke S(final esr esr) {
        return esr.by;
    }
    
    static /* bridge */ atke T(final esr esr) {
        return esr.bD;
    }
    
    static /* bridge */ atke U(final esr esr) {
        return esr.bC;
    }
    
    static /* bridge */ atke V(final esr esr) {
        return esr.bA;
    }
    
    static /* bridge */ atke W(final esr esr) {
        return esr.U;
    }
    
    static /* bridge */ atke X(final esr esr) {
        return esr.y;
    }
    
    static /* bridge */ atke Y(final esr esr) {
        return esr.i;
    }
    
    static /* bridge */ atke Z(final esr esr) {
        return esr.aS;
    }
    
    static /* bridge */ vbs aC(final esr esr) {
        return esr.aB();
    }
    
    static /* bridge */ aujg aI(final esr esr) {
        final atke bv = esr.bv;
        final eqy a = esr.a;
        return new aujg(bv, a.r, a.e);
    }
    
    static /* bridge */ fzw aK(final esr esr) {
        final eqy a = esr.a;
        return new fzw(a.d, a.e, (short[])null);
    }
    
    static /* bridge */ fzw aM(final esr esr) {
        return fuu.v((hzn)esr.aN.S(), esr.aN.aV());
    }
    
    static /* bridge */ aeea aO(final esr esr) {
        return esr.aN();
    }
    
    static /* bridge */ aeea aR(final esr esr) {
        return esr.aQ();
    }
    
    static /* bridge */ atke aa(final esr esr) {
        return esr.aT;
    }
    
    static /* bridge */ atke ab(final esr esr) {
        return esr.bd;
    }
    
    static /* bridge */ atke ac(final esr esr) {
        return esr.be;
    }
    
    static /* bridge */ atke ad(final esr esr) {
        return esr.d;
    }
    
    static /* bridge */ atke ae(final esr esr) {
        return esr.bh;
    }
    
    static /* bridge */ atke af(final esr esr) {
        return esr.aU;
    }
    
    static /* bridge */ atke ag(final esr esr) {
        return esr.bo;
    }
    
    static /* bridge */ atke ah(final esr esr) {
        return esr.bq;
    }
    
    static /* bridge */ atke ai(final esr esr) {
        return esr.w;
    }
    
    static /* bridge */ atke aj(final esr esr) {
        return esr.bx;
    }
    
    static /* bridge */ atke ak(final esr esr) {
        return esr.bw;
    }
    
    static /* bridge */ atke al(final esr esr) {
        return esr.bg;
    }
    
    static /* bridge */ atke am(final esr esr) {
        return esr.r;
    }
    
    static /* bridge */ atke an(final esr esr) {
        return esr.bm;
    }
    
    static /* bridge */ atke ao(final esr esr) {
        return esr.k;
    }
    
    static /* bridge */ atke ap(final esr esr) {
        return esr.bf;
    }
    
    static /* bridge */ atke aq(final esr esr) {
        return esr.bl;
    }
    
    static /* bridge */ atke ar(final esr esr) {
        return esr.bi;
    }
    
    static /* bridge */ atke as(final esr esr) {
        return esr.aR;
    }
    
    static /* bridge */ atke at(final esr esr) {
        return esr.bn;
    }
    
    static /* bridge */ atke au(final esr esr) {
        return esr.p;
    }
    
    static /* bridge */ atke av(final esr esr) {
        return esr.ba;
    }
    
    static /* bridge */ atke aw(final esr esr) {
        return esr.z;
    }
    
    static /* bridge */ atke ax(final esr esr) {
        return esr.aQ;
    }
    
    static /* bridge */ aui k(final esr esr) {
        return thm.h((aun)((arlt)esr.b).a);
    }
    
    static /* bridge */ gzu l(final esr esr) {
        return new gzu(esr.p, (msr)esr.y.a(), (asid)esr.a.dP.a(), esr.aH(), (wyw)esr.a.iK.a(), null, null, null, null);
    }
    
    static /* bridge */ hcx m(final esr esr) {
        final br br = (br)((arlt)esr.b).a;
        final atke l = esr.l;
        final aujg aujg = (aujg)esr.a.a.ar.a();
        final atke m = esr.m;
        final atke av = esr.aV;
        hcx hcx;
        if (br instanceof gyg) {
            hcx = (hcx)l.a();
        }
        else {
            if (!(br instanceof gwh)) {
                throw new IllegalStateException("ShortsScrubberPlayerController is only available for injection in ShortsCameraFragment and ShortsEditFragment");
            }
            if (aujg.br()) {
                hcx = (hcx)m.a();
            }
            else {
                hcx = (hcx)av.a();
            }
        }
        hcx.getClass();
        return hcx;
    }
    
    static /* bridge */ tyf n(final esr esr) {
        return esr.d();
    }
    
    static /* bridge */ uaj o(final esr esr) {
        return new uaj((afvt)esr.a.eA.a(), (ExecutorService)esr.a.r.a(), (txz)esr.p.a(), (uak)esr.ba.a());
    }
    
    static /* bridge */ uhy p(final esr esr) {
        return ufa.p((wyv)esr.aN.j.a(), ufa.d((Context)esr.aN.c.a()), ufa.q((Activity)esr.aN.c.a()));
    }
    
    static /* bridge */ uia q(final esr esr) {
        return ufa.e((Context)esr.aN.c.a());
    }
    
    static /* bridge */ actr r(final esr esr) {
        final arkg b = arlr.b(esr.aN.B);
        final acbm acbm = (acbm)esr.c.a();
        final afhd yu = ((adfo)((arlm)((aeqe)esr.aN.g.a()).a()).aR()).yu();
        yu.getClass();
        return new actr(b, acbm, yu, (byte[])null, (byte[])null);
    }
    
    static /* bridge */ adhj s(final esr esr) {
        return adgv.u((wxx)esr.a.aw.a(), (tdz)esr.a.cy.a(), (vaf)esr.a.w.a(), (ExecutorService)esr.a.r.a(), (aujg)esr.a.nM.a(), (oby)esr.a.e.a());
    }
    
    static /* bridge */ asht t(final esr esr) {
        return ((ubi)esr.aN.I.a()).b();
    }
    
    static /* bridge */ Object u(final esr esr) {
        final atke c = esr.C;
        final atke p = esr.p;
        final atke y = esr.y;
        final era a = esr.a.a;
        return new qcy(c, p, y, a.ax, a.ay, a.az, a.ar, (byte[])null, (byte[])null, (char[])null);
    }
    
    static /* bridge */ Object v(final esr esr) {
        final acks acks = (acks)esr.bb.a();
        final acks acks2 = (acks)esr.bc.a();
        final aujg aujg = (aujg)esr.a.a.ar.a();
        final uho uho = (uho)esr.D.a();
        final gzs gzs = (gzs)esr.C.a();
        final tyv tyv = (tyv)esr.w.a();
        final asid asid = (asid)esr.a.dP.a();
        final pbg pbg = (pbg)esr.a.a.ay.a();
        final pja pja = (pja)esr.a.a.ax.a();
        final pba pba = (pba)esr.a.a.az.a();
        return new hae(afev.o(gzw.class, acks, gza.class, acks2, gyx.class, new gyw(uho, gzs, tyv, asid, 0)));
    }
    
    static /* bridge */ Object w(final esr esr) {
        return new cyb(esr.a.r);
    }
    
    static /* bridge */ Map x(final esr esr) {
        final afes i = afev.i(10);
        i.g(arke.class, esr.aN.D());
        i.g(arjl.class, esr.aN.v());
        i.g(arjr.class, esr.aN.y());
        i.g(arkb.class, esr.aN.C());
        i.g(arjt.class, esr.aN.A());
        i.g(arjn.class, esr.aN.w());
        i.g(arjs.class, esr.aN.z());
        i.g(arjq.class, esr.aN.x());
        i.g(arjw.class, esr.aN.B());
        i.g(arjh.class, esr.aN.u());
        return i.c();
    }
    
    static /* bridge */ Map y(final esr esr) {
        return afev.n(1, new gzx(esr.C, (aeea)esr.i.a(), null, null, null, null, null, null), 0, esr.e());
    }
    
    static /* bridge */ atke z(final esr esr) {
        return esr.D;
    }
    
    public final Bundle a() {
        return agqs.aq((br)((arlt)this.b).a);
    }
    
    public final hnx aA() {
        final atke h = this.h;
        final atke i = this.i;
        final esn an = this.aN;
        final atke j = an.i;
        final atke k = an.K;
        final atke l = an.I;
        final eqy a = this.a;
        return new hnx(h, i, j, k, l, a.jl, this.aU, a.a.ar, an.M, an.k, null);
    }
    
    public final vbs aB() {
        return new vbs(this.b, this.p, this.w, this.a.ka, (short[])null);
    }
    
    public final php aD() {
        final eqy a = this.a;
        final atke cb = a.cB;
        final atke w = a.w;
        final atke v = a.v;
        final era a2 = a.a;
        final atke bj = a2.bj;
        final atke r = a2.r;
        final atke bi = a2.bi;
        final atke p = a2.p;
        final esn an = this.aN;
        return new php(cb, w, v, bj, r, bi, p, an.ac, a2.bl, a2.bm, a2.q, an.ad, a2.bn, (byte[])null, (byte[])null);
    }
    
    public final ahdc aE() {
        return new ahdc((Set)afiq.a, new hhg((byte[])null, (byte[])null), (byte[])null, (byte[])null);
    }
    
    public final blu aF() {
        final eqy a = this.a;
        return new blu(a.h, a.gn, a.cB, a.v, this.aN.k, (char[])null, (byte[])null);
    }
    
    public final mcb aG() {
        return new mcb(this.a, this.bG);
    }
    
    public final fzw aH() {
        return new fzw(this.aN.i, this.a.a.ar, (char[])null, (byte[])null);
    }
    
    public final aujg aJ() {
        return new aujg((wyv)this.aN.j.a(), (ziy)this.r.a(), (vai)this.a.ka.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final bx aL() {
        return iyu.t((Object)iyu.s((Context)this.a.c.a()));
    }
    
    public final aeea aN() {
        return new aeea((ulc)this.u.a());
    }
    
    public final aeea aP() {
        return ulu.s((qqr)this.a.a.cj.a());
    }
    
    public final aeea aQ() {
        return new aeea((afvt)this.a.r.a());
    }
    
    public final aeea aS() {
        return ((gzs)this.C.a()).k();
    }
    
    public final vai ay() {
        return new vai((vaf)this.a.w.a(), (arwh)this.a.v.a(), (byte[])null, (byte[])null);
    }
    
    public final vai az() {
        return new vai((vaf)this.a.w.a(), (arwh)this.a.v.a(), (byte[])null, (byte[])null);
    }
    
    public final hfx b() {
        final bu bu = (bu)this.aN.i.a();
        final ubu k = this.aN.K();
        final gxp ag = this.aN.ag();
        final br br = (br)((arlt)this.b).a;
        final Executor executor = (Executor)this.a.g.a();
        final agoe agoe = (agoe)this.O.a();
        final eqy a = this.a.a.a;
        return new hfx(bu, k, ag, br, executor, agoe, new vwa((Context)a.qg.a, (ScheduledExecutorService)a.r.a()), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final jqq c() {
        final fmr fmr = (fmr)this.a.jr.a();
        final aln aln = (aln)this.a.er.a();
        final zmf zmf = (zmf)this.a.aC.a();
        final aaec aaec = (aaec)this.a.eu.a();
        final aln az = this.aN.aZ();
        final tnn tnn = (tnn)this.a.ek.a();
        final tpe tpe = (tpe)this.a.dU.a();
        return new jqq(fmr, aln, zmf, aaec, az, tnn, (SharedPreferences)this.a.d.a(), (asid)this.a.dP.a(), (tjm)this.a.P.a(), this.a.zx(), (bhv)this.a.a.bY.a(), this.a.xJ(), (vai)this.a.jj.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final tyf d() {
        final esn an = this.aN;
        final atke k = an.K;
        final eqy a = this.a;
        final atke g = a.g;
        final atke r = a.r;
        final atke b = this.b;
        final atke i = an.I;
        final era a2 = a.a;
        return new tyf(k, g, r, b, i, a2.ar, an.N, a2.at, this.aW, this.aX, this.p, a2.au, a2.av, this.aY, this.w, this.x, this.z, this.A);
    }
    
    public final uad e() {
        return new uad(this.D, (tyv)this.w.a(), (txz)this.p.a());
    }
    
    public final uex f() {
        return txm.k((br)((arlt)this.b).a);
    }
    
    public final ula g() {
        return ufa.j((Context)this.a.qg.a);
    }
    
    public final vxr h() {
        return new vxr((vln)this.a.fK.a(), (aeea)this.a.eT.a(), (zmf)this.a.aC.a(), (vai)this.aL.h.a(), (zmw)this.a.cB.a(), (tjb)this.a.fL.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final Map i() {
        final afes i = afev.i(45);
        i.g("EnableInteractionLoggingCrashes", new tsk((tmx)this.a.a.a.cA.a(), (tci)vxj.k, (aezf)wpw.h, 0));
        i.g("DebugCsi204Logging", new tsk((tmx)this.a.a.a.cA.a(), (tci)vxj.l, (aezf)wpw.i, 0));
        i.g("DebugCsiTickTimeSinceStart", new tsk((tmx)this.a.a.a.cA.a(), (tci)vxj.j, (aezf)wpw.g, 0));
        i.g("accessibility_player_setting_key", new tsk((qqr)this.a.a.bS.a(), (tci)fnh.q, (aezf)new igr(this.aL(), 15, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null), 1));
        final qqr qqr = (qqr)this.a.a.bS.a();
        this.aL();
        i.g("accessibility_hide_player_controls_setting_key", new tsk(qqr, (tci)fnh.r, (aezf)new iyl(12), 1));
        i.g("data_saving_mode_key", new tsk((tmx)this.a.eC.a(), (tci)fnh.s, (aezf)iyl.o, 0));
        i.g("data_saving_pref_video_quality_key", new jpx((tmx)this.a.eC.a(), (tmx)this.a.dM.a(), 0));
        final eqy a = this.a;
        i.g("data_saving_pref_download_quality_key", new jpy((tmx)a.eC.a(), a.eu, (SharedPreferences)this.a.d.a(), 1));
        i.g("data_saving_pref_smart_downloads_quality_key", new jpy((tmx)this.a.eC.a(), (aln)this.a.er.a(), (zmf)this.a.aC.a(), 0, (byte[])null, (byte[])null, (byte[])null));
        i.g("data_saving_pref_download_wifi_only_key", new jpx((SharedPreferences)this.a.d.a(), (tmx)this.a.eC.a(), 2));
        i.g("data_saving_pref_upload_wifi_only_key", new jpy((SharedPreferences)this.a.d.a(), (Context)this.a.c.a(), (tmx)this.a.eC.a(), 2));
        i.g("data_saving_imp_wifi_only_key", new jpx((tmx)this.a.eC.a(), (tmx)this.a.fW.a(), 3));
        i.g("data_saving_pref_select_quality_every_video_key", new tsk((tmx)this.a.eC.a(), (tci)fnh.t, (aezf)new etz(this.a.xH(), (vai)this.a.dS.a(), 17), 0));
        i.g("double_tap_skip_duration", new tsk((tmx)this.a.gh.a(), (tci)abic.d, (aezf)abdc.m, 0));
        i.g("nerd_stats_enabled", new tsk((tmx)this.a.gh.a(), (tci)abic.c, (aezf)abdc.l, 0));
        final tmx tmx = (tmx)this.a.gh.a();
        final WillAutonavInformer willAutonavInformer = (WillAutonavInformer)this.a.gi.a();
        final abic a2 = abic.a;
        willAutonavInformer.getClass();
        i.g("autonav", new tsk(tmx, (tci)a2, (aezf)new zrh(willAutonavInformer, 19), 0));
        i.g("BypassFrequencyCap", new tsk((tmx)this.a.a.bT.a(), (tci)abic.h, (aezf)abvp.g, 0));
        i.g("SetCustomInterval", new tsk((tmx)this.a.a.bT.a(), (tci)abic.i, (aezf)abvp.h, 0));
        i.g("voice_language", new tsk((qqr)this.a.a.aO.a(), (tci)fnh.n, (aezf)iyl.g, 1));
        i.g("background_pip_policy_v2", new jnz(this.a.a.bV, 0));
        final tmx tmx2 = (tmx)this.a.pC.a();
        final avu avu = (avu)this.a.cD();
        i.g("background_audio_policy", new tsk(tmx2, (tci)new jsf(avu, 1, (byte[])null, (byte[])null, (byte[])null), (aezf)new bwk(avu, 5, (byte[])null, (byte[])null, (byte[])null), 0));
        i.g("inline_global_play_pause", new tsk((tmx)this.a.fW.a(), (tci)fnh.o, (aezf)new igr((arwh)this.a.v.a(), 14, (byte[])null, (byte[])null), 0));
        i.g("innertube_safety_mode_enabled", new jnz((vxu)this.a.ao.a(), 2));
        i.g("offline_recs_enabled", new jnz(this.a.er, 1));
        final eqy a3 = this.a;
        i.g("smart_downloads_opted_in", new jpx(a3.er, a3.aC, 1));
        final eqy a4 = this.a;
        i.g("smart_downloads_auto_storage", fmy.a(a4.eq, a4.aC, false));
        final eqy a5 = this.a;
        i.g("smart_downloads_custom_storage", fmy.a(a5.eq, a5.aC, true));
        i.g("premium_filters_hd", new tsk((tmx)this.a.a.bW.a(), (tci)jze.h, (aezf)rsv.i, 0));
        i.g("premium_filters_live", new tsk((tmx)this.a.a.bW.a(), (tci)jze.j, (aezf)rsv.k, 0));
        i.g("premium_filters_360", new tsk((tmx)this.a.a.bW.a(), (tci)jze.l, (aezf)rsv.n, 0));
        i.g("premium_filters_4k", new tsk((tmx)this.a.a.bW.a(), (tci)jze.i, (aezf)rsv.j, 0));
        i.g("premium_filters_recent_upload_one_day", new tsk((tmx)this.a.a.bW.a(), (tci)jze.m, (aezf)rsv.o, 0));
        i.g("premium_filters_recent_upload_one_week", new tsk((tmx)this.a.a.bW.a(), (tci)jze.k, (aezf)rsv.m, 0));
        i.g("premium_filters_short_video", new tsk((tmx)this.a.a.bW.a(), (tci)jze.n, (aezf)rsv.p, 0));
        i.g("premium_filters_long_video", new tsk((tmx)this.a.a.bW.a(), (tci)jze.g, (aezf)rsv.l, 0));
        i.g("snap_zoom_initially_zoomed", new tsk((tmx)this.a.fW.a(), (tci)fnh.p, (aezf)iyl.l, 0));
        i.g("app_theme_dark", new tsk((tmx)this.a.fq.a(), (tci)fnh.i, (aezf)glc.a, 0));
        i.g("app_theme_appearance", new tsk((tmx)this.a.fq.a(), (tci)fnh.h, (aezf)glc.b, 0));
        i.g("limit_mobile_data_usage", new tsk((tmx)this.a.dM.a(), (tci)fnh.u, (aezf)iyl.t, 0));
        i.g("mobile_video_quality_auto_key", jzg.k((tmx)this.a.dM.a(), apoc.a));
        i.g("mobile_video_quality_high_key", jzg.k((tmx)this.a.dM.a(), apoc.b));
        i.g("mobile_video_quality_low_key", jzg.k((tmx)this.a.dM.a(), apoc.c));
        i.g("wifi_video_quality_auto_key", jzg.l((tmx)this.a.dM.a(), apoc.a));
        i.g("wifi_video_quality_high_key", jzg.l((tmx)this.a.dM.a(), apoc.b));
        i.g("wifi_video_quality_low_key", jzg.l((tmx)this.a.dM.a(), apoc.c));
        return i.c();
    }
    
    public final aeqe j() {
        return (aeqe)this.aN.g.a();
    }
}
