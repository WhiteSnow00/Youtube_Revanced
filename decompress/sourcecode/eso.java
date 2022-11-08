import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import android.content.SharedPreferences;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.Map;
import android.app.Activity;
import android.content.Context;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eso implements aehr, aenh, aeob, ariw
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
    public final eqv a;
    public atjj aA;
    public atjj aB;
    public atjj aC;
    public atjj aD;
    public atjj aE;
    public atjj aF;
    public atjj aG;
    public atjj aH;
    public atjj aI;
    public atjj aJ;
    public atjj aK;
    public atjj aL;
    public final esr aM;
    public final esl aN;
    public final esk aO;
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
    public atjj az;
    public atjj b;
    private atjj bA;
    private atjj bB;
    private atjj bC;
    private atjj bD;
    private final eso bE;
    private atjj ba;
    private atjj bb;
    private atjj bc;
    private atjj bd;
    private atjj be;
    private atjj bf;
    private atjj bg;
    private atjj bh;
    private atjj bi;
    private atjj bj;
    private atjj bk;
    private atjj bl;
    private atjj bm;
    private atjj bn;
    private atjj bo;
    private atjj bp;
    private atjj bq;
    private atjj br;
    private atjj bs;
    private atjj bt;
    private atjj bu;
    private atjj bv;
    private atjj bw;
    private atjj bx;
    private atjj by;
    private atjj bz;
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
    
    public eso() {
    }
    
    public eso(final eqv a, final esr am, final esl an, final esk ao, final br br) {
        this.bE = this;
        this.a = a;
        this.aM = am;
        this.aN = an;
        this.aO = ao;
        this.b = (atjj)arje.b((Object)br);
        final eqa ap = new eqa(a, am, ao, this, 2);
        this.aP = ap;
        this.aQ = arjj.b((atjj)ap);
        this.aR = new eqa(a, am, ao, this, 1);
        this.c = new eqa(a, am, ao, this, 0);
        this.d = new eqa(a, am, ao, this, 3);
        this.aS = new eqa(a, am, ao, this, 5);
        this.e = new eqa(a, am, ao, this, 4);
        this.f = new eqa(a, am, ao, this, 7);
        this.g = new eqa(a, am, ao, this, 8);
        this.h = arjc.c(a.iG);
        this.i = arjc.c((atjj)new eqa(a, am, ao, this, 9));
        this.aT = new eqa(a, am, ao, this, 11);
        this.aU = new eqa(a, am, ao, this, 12);
        this.j = new eqa(a, am, ao, this, 10);
        this.aV = new eqa(a, am, ao, this, 14);
        this.k = new eqa(a, am, ao, this, 15);
        this.l = arjc.c((atjj)new eqa(a, am, ao, this, 16));
        this.m = arjc.c((atjj)new eqa(a, am, ao, this, 17));
        this.aW = arjc.c((atjj)new eqa(a, am, ao, this, 18));
        this.n = arjc.c((atjj)new eqa(a, am, ao, this, 13));
        this.o = arjc.c((atjj)new eqa(a, am, ao, this, 19));
        this.p = arjc.c((atjj)new eqa(a, am, ao, this, 20));
        this.q = arjc.c((atjj)new eqa(a, am, ao, this, 21));
        this.r = arjj.b((atjj)new eqa(a, am, ao, this, 22));
        this.s = new eqa(a, am, ao, this, 23);
        this.t = arjj.b((atjj)new eqa(a, am, ao, this, 24));
        this.u = arjj.b((atjj)new eqa(a, am, ao, this, 25));
        this.v = arjj.b((atjj)new eqa(a, am, ao, this, 26));
        this.w = arjc.c((atjj)new eqa(a, am, ao, this, 27));
        this.aX = new eqa(a, am, ao, this, 29);
        this.aY = new eqa(a, am, ao, this, 30);
        this.x = arjc.c((atjj)new eqa(a, am, ao, this, 32));
        this.aZ = arjc.c((atjj)new eqa(a, am, ao, this, 31));
        final eqa ba = new eqa(a, am, ao, this, 33);
        this.ba = ba;
        this.y = arjc.c((atjj)ba);
        this.z = new eqa(a, am, ao, this, 35);
        this.A = arjc.c((atjj)new eqa(a, am, ao, this, 34));
        this.B = arjj.b((atjj)new eqa(a, am, ao, this, 36));
        this.C = arjc.c((atjj)new eqa(a, am, ao, this, 28));
        this.bb = arjj.b((atjj)new eqa(a, am, ao, this, 39));
        this.bc = arjj.b((atjj)new eqa(a, am, ao, this, 40));
        this.bd = arjc.c((atjj)new eqa(a, am, ao, this, 42));
        this.be = arjc.c((atjj)new eqa(a, am, ao, this, 43));
        this.E = arjc.c((atjj)new eqa(a, am, ao, this, 41));
        this.bg = arjc.c((atjj)new eqa(a, am, ao, this, 46));
        this.bh = new eqa(a, am, ao, this, 45);
        this.bf = arjc.c((atjj)new eqa(a, am, ao, this, 44));
        this.bi = new eqa(a, am, ao, this, 47);
        this.bj = new eqa(a, am, ao, this, 38);
        this.D = arjc.c((atjj)new eqa(a, am, ao, this, 37));
        this.F = arjc.c((atjj)new eqa(a, am, ao, this, 48));
        this.G = new eqa(a, am, ao, this, 49);
        this.bk = new eqa(a, am, ao, this, 51);
        this.bl = new eqa(a, am, ao, this, 52);
        this.bm = new eqa(a, am, ao, this, 54);
        this.bn = new eqa(a, am, ao, this, 53);
        this.bo = new eqa(a, am, ao, this, 55);
        this.H = new eqa(a, am, ao, this, 50);
        this.bp = new eqa(a, am, ao, this, 57);
        this.bq = new eqa(a, am, ao, this, 59);
        this.br = new eqa(a, am, ao, this, 60);
        this.I = new eqa(a, am, ao, this, 58);
        this.bs = new eqa(a, am, ao, this, 61);
        this.bt = new eqa(a, am, ao, this, 63);
        this.bu = new eqa(a, am, ao, this, 64);
        this.J = arjc.c((atjj)new eqa(a, am, ao, this, 62));
        this.K = arjc.c((atjj)new eqa(a, am, ao, this, 56));
        this.L = arjc.c((atjj)new eqa(a, am, ao, this, 65));
        this.M = arjc.c((atjj)new eqa(a, am, ao, this, 66));
        this.N = arjj.b((atjj)new eqa(a, am, ao, this, 68));
        this.O = arjj.b((atjj)new eqa(a, am, ao, this, 67));
        this.P = arjc.c((atjj)new eqa(a, am, ao, this, 69));
        this.Q = arjj.b((atjj)new eqa(a, am, ao, this, 70));
        this.R = arjj.b((atjj)new eqa(a, am, ao, this, 71));
        this.S = arjj.b((atjj)new eqa(a, am, ao, this, 72));
        this.T = arjc.c((atjj)new eqa(a, am, ao, this, 73));
        this.U = new eqa(a, am, ao, this, 74);
        this.V = arjc.c((atjj)new eqa(a, am, ao, this, 75));
        this.W = arjc.c((atjj)new eqa(a, am, ao, this, 76));
        this.X = new eqa(a, am, ao, this, 77);
        this.Y = new eqa(a, am, ao, this, 78);
        this.Z = new eqa(a, am, ao, this, 79);
        this.bv = new eqa(a, am, ao, this, 81);
        this.aa = new eqa(a, am, ao, this, 80);
        this.ab = new eqa(a, am, ao, this, 82);
        this.ac = new eqa(a, am, ao, this, 83);
        this.ad = new eqa(a, am, ao, this, 84);
        this.bw = new eqa(a, am, ao, this, 86);
        this.bx = new eqa(a, am, ao, this, 87);
        this.by = new eqa(a, am, ao, this, 88);
        this.bz = new eqa(a, am, ao, this, 90);
        this.bA = new eqa(a, am, ao, this, 89);
        this.bB = new eqa(a, am, ao, this, 91);
        this.ae = new eqa(a, am, ao, this, 85);
        this.af = new eqa(a, am, ao, this, 92);
        this.ag = new eqa(a, am, ao, this, 93);
        this.bC = new eqa(a, am, ao, this, 95);
        this.ah = new eqa(a, am, ao, this, 94);
        this.ai = new eqa(a, am, ao, this, 96);
        this.bD = new eqa(a, am, ao, this, 98);
        this.aj = new eqa(a, am, ao, this, 97);
        this.ak = new eqa(a, am, ao, this, 99);
        this.al = new eqa(a, am, ao, this, 101);
        this.am = new eqa(a, am, ao, this, 100);
        this.an = new eqa(a, am, ao, this, 102);
        this.ao = new eqa(a, am, ao, this, 103);
        this.ap = new eqa(a, am, ao, this, 104);
        this.aq = new eqa(a, am, ao, this, 105);
        this.ar = new eqa(a, am, ao, this, 106);
        this.as = new eqa(a, am, ao, this, 107);
        this.at = new eqa(a, am, ao, this, 109);
        this.au = new eqa(a, am, ao, this, 110);
        this.av = new eqa(a, am, ao, this, 108);
        this.aw = new eqa(a, am, ao, this, 112);
        this.ax = new eqa(a, am, ao, this, 111);
        this.ay = new eqa(a, am, ao, this, 113);
        this.az = new eqa(a, am, ao, this, 114);
        this.aA = arjc.c((atjj)new eqa(a, am, ao, this, 116));
        this.aB = arjc.c((atjj)new eqa(a, am, ao, this, 115));
        this.aC = arjc.c((atjj)new eqa(a, am, ao, this, 117));
        this.aD = arjc.c((atjj)new eqa(a, am, ao, this, 118));
        this.aE = arjj.b((atjj)new eqa(a, am, ao, this, 119));
        this.aF = arjc.c((atjj)new eqa(a, am, ao, this, 120));
        this.aG = arjc.c((atjj)new eqa(a, am, ao, this, 122));
        this.aH = arjc.c((atjj)new eqa(a, am, ao, this, 121));
        this.aI = arjc.c((atjj)new eqa(a, am, ao, this, 123));
        this.aJ = new eqa(a, am, ao, this, 124);
        this.aK = arjc.c((atjj)new eqa(a, am, ao, this, 125));
        this.aL = arjc.c((atjj)new eqa(a, am, ao, this, 126));
    }
    
    public final hfc a() {
        return new hfc((bu)this.aO.i.a(), this.aO.K(), (ScheduledExecutorService)this.a.r.a(), this.aO.af(), (br)((arje)this.b).a, (Executor)this.a.g.a(), (agmd)this.P.a(), null, null);
    }
    
    public final pgf aA() {
        final eqv a = this.a;
        final atjj cb = a.cB;
        final atjj w = a.w;
        final atjj v = a.v;
        final eqx a2 = a.a;
        final atjj bj = a2.bj;
        final atjj r = a2.r;
        final atjj bi = a2.bi;
        final atjj p = a2.p;
        final esk ao = this.aO;
        return new pgf(cb, w, v, bj, r, bi, p, ao.ac, a2.bl, a2.bm, a2.q, ao.ad, a2.bn, (byte[])null);
    }
    
    public final ahbd aB() {
        return new ahbd((Set)afgq.a, new hgm((byte[])null, (byte[])null), null, null);
    }
    
    public final blt aC() {
        final eqv a = this.a;
        return new blt(a.h, a.gk, a.cB, a.v, this.aO.k, (char[])null, (byte[])null);
    }
    
    public final maw aD() {
        return new maw(this.a, this.bE);
    }
    
    public final fzo aE() {
        return new fzo(this.aO.i, this.a.a.aq, (short[])null);
    }
    
    public final avt aF() {
        return new avt((ujg)this.v.a());
    }
    
    public final avt aH() {
        return ugi.r((aagm)this.a.a.ci.a());
    }
    
    public final auip aJ() {
        return new auip((wwu)this.aO.j.a(), (zhb)this.s.a(), (uyi)this.a.jV.a(), (byte[])null);
    }
    
    public final avt aK() {
        return new avt((afts)this.a.r.a());
    }
    
    public final avt aM() {
        return ((gzb)this.D.a()).k();
    }
    
    public final bx aO() {
        return ixb.t((Object)ixb.s((Context)this.a.c.a()));
    }
    
    public final uyi aw() {
        return new uyi((uyf)this.a.w.a(), (arud)this.a.v.a(), (byte[])null, (byte[])null);
    }
    
    public final hnc ax() {
        final atjj h = this.h;
        final atjj i = this.i;
        final esk ao = this.aO;
        final atjj j = ao.i;
        final atjj l = ao.L;
        final atjj k = ao.J;
        final eqv a = this.a;
        return new hnc(h, i, j, l, k, a.jh, this.aV, a.a.aq, ao.N, ao.k, null);
    }
    
    public final van ay() {
        return new van(this.b, this.p, this.x, this.a.jV, (int[])null);
    }
    
    public final jpp b() {
        final fml fml = (fml)this.a.jn.a();
        final alm alm = (alm)this.a.ep.a();
        final zki zki = (zki)this.a.aC.a();
        final aacf aacf = (aacf)this.a.es.a();
        final alm bb = this.aO.bb();
        final tlk tlk = (tlk)this.a.ei.a();
        final tmy tmy = (tmy)this.a.dS.a();
        return new jpp(fml, alm, zki, aacf, bb, tlk, (SharedPreferences)this.a.d.a(), (asho)this.a.dO.a(), (thh)this.a.P.a(), this.a.zv(), (bhu)this.a.a.bX.a(), this.a.xM(), (uyi)this.a.jf.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final tvy c() {
        final esk ao = this.aO;
        final atjj l = ao.L;
        final eqv a = this.a;
        final atjj g = a.g;
        final atjj r = a.r;
        final atjj b = this.b;
        final atjj j = ao.J;
        final eqx a2 = a.a;
        return new tvy(l, g, r, b, j, a2.aq, ao.O, a2.as, this.aX, this.aY, this.p, a2.at, a2.au, this.aZ, this.x, this.y, this.A, this.B);
    }
    
    public final txz d() {
        return new txz(this.E, (two)this.x.a(), (tvt)this.p.a());
    }
    
    public final ucv e() {
        return tzb.h((br)((arje)this.b).a);
    }
    
    public final uje f() {
        return ugi.e((Context)this.a.qg.a);
    }
    
    public final vvq g() {
        return new vvq((vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (zki)this.a.aC.a(), (uyi)this.aM.h.a(), (zkz)this.a.cB.a(), (tgw)this.a.fI.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final Map h() {
        final afct i = afcw.i(44);
        i.g((Object)"EnableInteractionLoggingCrashes", (Object)new tqf((tku)this.a.a.a.cA.a(), (tad)vvi.k, (aexg)wnu.g, 0));
        i.g((Object)"DebugCsi204Logging", (Object)new tqf((tku)this.a.a.a.cA.a(), (tad)vvi.l, (aexg)wnu.h, 0));
        i.g((Object)"DebugCsiTickTimeSinceStart", (Object)new tqf((tku)this.a.a.a.cA.a(), (tad)vvi.j, (aexg)wnu.f, 0));
        i.g((Object)"accessibility_player_setting_key", (Object)new tqf((aagm)this.a.a.bR.a(), (tad)fnb.q, (aexg)new ift(this.aO(), 14, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null), 1, (byte[])null));
        final aagm aagm = (aagm)this.a.a.bR.a();
        this.aO();
        i.g((Object)"accessibility_hide_player_controls_setting_key", (Object)new tqf(aagm, (tad)fnb.r, (aexg)new ixn(11), 1, (byte[])null));
        i.g((Object)"data_saving_mode_key", (Object)new tqf((tku)this.a.eA.a(), (tad)fnb.s, (aexg)ixn.n, 0));
        i.g((Object)"data_saving_pref_video_quality_key", (Object)new jov((tku)this.a.eA.a(), (tku)this.a.dL.a(), 0));
        final eqv a = this.a;
        i.g((Object)"data_saving_pref_download_quality_key", (Object)new jow((tku)a.eA.a(), a.es, (SharedPreferences)this.a.d.a(), 1));
        i.g((Object)"data_saving_pref_download_wifi_only_key", (Object)new jov((SharedPreferences)this.a.d.a(), (tku)this.a.eA.a(), 2));
        i.g((Object)"data_saving_pref_upload_wifi_only_key", (Object)new jow((SharedPreferences)this.a.d.a(), (Context)this.a.c.a(), (tku)this.a.eA.a(), 0));
        i.g((Object)"data_saving_imp_wifi_only_key", (Object)new jov((tku)this.a.eA.a(), (tku)this.a.fT.a(), 3));
        i.g((Object)"data_saving_pref_select_quality_every_video_key", (Object)new tqf((tku)this.a.eA.a(), (tad)fnb.t, (aexg)new etw(this.a.xK(), (uyi)this.a.dQ.a(), 16), 0));
        i.g((Object)"double_tap_skip_duration", (Object)new tqf((tku)this.a.ge.a(), (tad)abgh.d, (aexg)abbn.i, 0));
        i.g((Object)"nerd_stats_enabled", (Object)new tqf((tku)this.a.ge.a(), (tad)abgh.c, (aexg)abbn.h, 0));
        final tku tku = (tku)this.a.ge.a();
        final WillAutonavInformer willAutonavInformer = (WillAutonavInformer)this.a.gf.a();
        final abgh a2 = abgh.a;
        willAutonavInformer.getClass();
        i.g((Object)"autonav", (Object)new tqf(tku, (tad)a2, (aexg)new zqp(willAutonavInformer, 16), 0));
        i.g((Object)"BypassFrequencyCap", (Object)new tqf((tku)this.a.a.bS.a(), (tad)abgh.h, (aexg)acrp.a, 0));
        i.g((Object)"SetCustomInterval", (Object)new tqf((tku)this.a.a.bS.a(), (tad)abgh.i, (aexg)acrp.c, 0));
        i.g((Object)"voice_language", (Object)new tqf((aagm)this.a.a.aO.a(), (tad)fnb.n, (aexg)ixn.f, 1, (byte[])null));
        i.g((Object)"background_pip_policy_v2", (Object)new jmy(this.a.a.bU, 0));
        final tku tku2 = (tku)this.a.pB.a();
        final avt avt = (avt)this.a.cG();
        i.g((Object)"background_audio_policy", (Object)new tqf(tku2, (tad)new jre(avt, 1, (byte[])null, (byte[])null, (byte[])null), (aexg)new bwj(avt, 5, (byte[])null, (byte[])null, (byte[])null), 0));
        i.g((Object)"inline_global_play_pause", (Object)new tqf((tku)this.a.fT.a(), (tad)fnb.o, (aexg)new ift((arud)this.a.v.a(), 13, (byte[])null, (byte[])null), 0));
        i.g((Object)"innertube_safety_mode_enabled", (Object)new jmy((vvt)this.a.ao.a(), 2));
        i.g((Object)"offline_recs_enabled", (Object)new jmy(this.a.ep, 1));
        final eqv a3 = this.a;
        i.g((Object)"smart_downloads_opted_in", (Object)new jov(a3.ep, a3.aC, 1));
        final eqv a4 = this.a;
        i.g((Object)"smart_downloads_auto_storage", (Object)fms.a(a4.eo, a4.aC, false));
        final eqv a5 = this.a;
        i.g((Object)"smart_downloads_custom_storage", (Object)fms.a(a5.eo, a5.aC, true));
        i.g((Object)"premium_filters_hd", (Object)new tqf((tku)this.a.a.bV.a(), (tad)jye.h, (aexg)rxn.h, 0));
        i.g((Object)"premium_filters_live", (Object)new tqf((tku)this.a.a.bV.a(), (tad)jye.j, (aexg)rxn.j, 0));
        i.g((Object)"premium_filters_360", (Object)new tqf((tku)this.a.a.bV.a(), (tad)jye.l, (aexg)rxn.m, 0));
        i.g((Object)"premium_filters_4k", (Object)new tqf((tku)this.a.a.bV.a(), (tad)jye.i, (aexg)rxn.i, 0));
        i.g((Object)"premium_filters_recent_upload_one_day", (Object)new tqf((tku)this.a.a.bV.a(), (tad)jye.m, (aexg)rxn.n, 0));
        i.g((Object)"premium_filters_recent_upload_one_week", (Object)new tqf((tku)this.a.a.bV.a(), (tad)jye.k, (aexg)rxn.l, 0));
        i.g((Object)"premium_filters_short_video", (Object)new tqf((tku)this.a.a.bV.a(), (tad)jye.n, (aexg)rxn.o, 0));
        i.g((Object)"premium_filters_long_video", (Object)new tqf((tku)this.a.a.bV.a(), (tad)jye.g, (aexg)rxn.k, 0));
        i.g((Object)"snap_zoom_initially_zoomed", (Object)new tqf((tku)this.a.fT.a(), (tad)fnb.p, (aexg)ixn.k, 0));
        i.g((Object)"app_theme_dark", (Object)new tqf((tku)this.a.fn.a(), (tad)fnb.i, (aexg)gku.a, 0));
        i.g((Object)"app_theme_appearance", (Object)new tqf((tku)this.a.fn.a(), (tad)fnb.h, (aexg)gku.b, 0));
        i.g((Object)"limit_mobile_data_usage", (Object)new tqf((tku)this.a.dL.a(), (tad)fnb.u, (aexg)ixn.s, 0));
        i.g((Object)"mobile_video_quality_auto_key", (Object)jyg.l((tku)this.a.dL.a(), aply.a));
        i.g((Object)"mobile_video_quality_high_key", (Object)jyg.l((tku)this.a.dL.a(), aply.b));
        i.g((Object)"mobile_video_quality_low_key", (Object)jyg.l((tku)this.a.dL.a(), aply.c));
        i.g((Object)"wifi_video_quality_auto_key", (Object)jyg.m((tku)this.a.dL.a(), aply.a));
        i.g((Object)"wifi_video_quality_high_key", (Object)jyg.m((tku)this.a.dL.a(), aply.b));
        i.g((Object)"wifi_video_quality_low_key", (Object)jyg.m((tku)this.a.dL.a(), aply.c));
        return (Map)i.c();
    }
    
    public final aeoe i() {
        return (aeoe)this.aO.g.a();
    }
}
