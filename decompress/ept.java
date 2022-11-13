import android.util.DisplayMetrics;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import android.graphics.Paint;
import com.google.android.apps.youtube.app.webviewfallback.WebViewFallbackActivity;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import android.accounts.Account;
import java.util.Set;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelPlaybackErrorLogger;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;
import com.google.android.apps.youtube.app.mdx.MdxOverlaysPresenter;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.YouTubeInlineAdOverlay;
import android.os.Handler;
import android.content.SharedPreferences;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

final class ept implements atke
{
    private final eqy a;
    private final int b;
    private final esp c;
    
    public ept(final eqy a, final esp c, final int b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    private final Object b() {
        final int b = this.b;
        switch (b) {
            default: {
                throw new AssertionError(b);
            }
            case 99: {
                return wji.t((Activity)esp.oz(this.c).a(), (vcy)esp.oW(this.c).a(), (wui)epu.G(esp.cj(this.c)).a(), (aeea)esp.kY(this.c).a(), (aeea)esp.sZ(this.c).a());
            }
            case 98: {
                return wji.q((Activity)esp.oz(this.c).a(), (oby)eqy.gH(this.a).a());
            }
            case 97: {
                final esp c = this.c;
                return wdt.f(esp.lF(c), esp.lp(c), esp.lr(c), esp.lH(c), esp.iR(c));
            }
            case 96: {
                final Context context = (Context)esp.oz(this.c).a();
                final esp c2 = this.c;
                return new wdy(context, esp.qn(c2), (vcy)esp.oW(c2).a(), (acpk)eqy.kK(this.a).a(), (tvr)esp.qr(this.c).a(), (wbs)era.bO(eqy.r(this.a)).a());
            }
            case 95: {
                return new wdj((Context)esp.oz(this.c).a(), (vcy)esp.oW(this.c).a(), (wbu)esp.lL(this.c).a());
            }
            case 94: {
                return new iag((Context)esp.rP(this.c).a(), (wbu)esp.lL(this.c).a(), (vcy)esp.oW(this.c).a(), (acgs)eqy.kr(this.a).a(), (acpk)eqy.kK(this.a).a(), (wbp)esp.lj(this.c).a(), (wbs)era.bO(eqy.r(this.a)).a(), (aeea)era.bP(eqy.r(this.a)).a(), (vzf)esp.lc(this.c).a(), (aujg)era.bG(eqy.r(this.a)).a(), epu.aD(esp.cj(this.c)), (vzo)esp.qn(this.c).a(), (xib)esp.lb(this.c).a(), (tqd)eqy.qe(this.a).a(), (xib)esp.he(this.c).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 93: {
                final esp c3 = this.c;
                return hzk.d(epu.A(esp.cj(c3)), epu.z(esp.cj(c3)), epu.B(esp.cj(c3)));
            }
            case 92: {
                return ljk.g((vcy)esp.oW(this.c).a());
            }
            case 91: {
                return new sqk((Context)eqy.ps(this.a).a());
            }
            case 90: {
                return sao.h((Context)eqy.ps(this.a).a(), (sqk)epu.x(esp.cj(this.c)).a());
            }
            case 89: {
                return lio.k((gkv)esp.oN(this.c).a());
            }
            case 88: {
                return rid.r((Context)esp.oz(this.c).a(), (rhx)eqy.oE(this.a).a(), (zmf)eqy.pK(this.a).a(), srz.j());
            }
            case 87: {
                return eoy.t((Activity)esp.oz(this.c).a(), (zmf)eqy.pK(this.a).a(), (hyx)era.aP(eqy.r(this.a)).a(), (vaf)eqy.pn(this.a).a(), (rlt)eqy.iv(this.a).a());
            }
            case 86: {
                return qtx.u((qxw)epu.K(esp.cj(this.c)).a(), qfr.h(), (bu)esp.pI(this.c).a());
            }
            case 85: {
                return qtx.r((Context)eqy.ps(this.a).a());
            }
            case 84: {
                return qxd.h((bu)esp.pI(this.c).a());
            }
            case 83: {
                return new adar((SharedPreferences)eqy.sp(this.a).a(), (Handler)eqy.sJ(this.a).a(), (Context)eqy.ps(this.a).a());
            }
            case 82: {
                return new adan((Context)esp.oz(this.c).a(), (vcy)esp.oW(this.c).a());
            }
            case 81: {
                return ips.l((abpq)esp.ka(this.c).a(), (fjv)esp.ra(this.c).a());
            }
            case 80: {
                return ljh.n((fam)esp.wn(this.c).a());
            }
            case 79: {
                return new irh((Activity)esp.oz(this.c).a(), (kuf)esp.wn(this.c).a(), (vcy)esp.oW(this.c).a(), (wyv)esp.ow(this.c).a(), (aeea)esp.iE(this.c).a(), (aeea)eqy.mB(this.a).a(), null, null, null, null);
            }
            case 78: {
                return ixz.u((iyn)esp.rN(this.c).a(), (adqh)eqy.iy(this.a).a(), epu.u(esp.cj(this.c)));
            }
            case 77: {
                final jai p = iyu.p((jas)esp.pt(this.c).a(), (tqf)esp.ia(this.c).a(), (smd)eqy.eC(this.a).a(), (rpi)eqy.eK(this.a).a(), (ziy)eqy.ux(this.a).a(), (qcy)eqy.kY(this.a).a(), (fjv)esp.ra(this.c).a(), (wyw)esp.qg(this.c).a());
                epu.ak(p);
                return p;
            }
            case 76: {
                return ixx.u((jat)esp.py(this.c).a(), (acgs)eqy.kr(this.a).a(), (vcy)esp.pA(this.c).a(), (tqf)esp.ia(this.c).a(), (smd)eqy.eC(this.a).a(), (rpi)eqy.eK(this.a).a(), (ziy)eqy.ux(this.a).a(), (qcy)eqy.kY(this.a).a(), (vdr)eqy.kE(this.a).a(), (arwh)eqy.qn(this.a).a(), (wyw)esp.qg(this.c).a());
            }
            case 75: {
                return ivh.m((sji)esp.qB(this.c).a(), (YouTubeInlineAdOverlay)esp.wD(this.c).a(), (sjh)esp.qt(this.c).a(), (snd)epu.ac(esp.cj(this.c)).a(), (wyw)esp.qg(this.c).a(), (vcy)esp.pA(this.c).a(), (sja)esp.oC(this.c).a());
            }
            case 74: {
                return ixz.e((Context)esp.oz(this.c).a(), (wyw)esp.qg(this.c).a(), (sdh)eqy.eO(this.a).a());
            }
            case 73: {
                return ixy.u(esp.Ai(this.c), (YouTubeControlsOverlay)esp.wA(this.c).a());
            }
            case 72: {
                return ixz.v(esp.Ai(this.c), (aavi)esp.se(this.c).a());
            }
            case 71: {
                return new irj((YouTubePlayerOverlaysLayout)esp.qZ(this.c).a(), (aaqz)era.bx(eqy.r(this.a)).a(), (skc)eqy.hr(this.a).a(), (rxk)eqy.nM(this.a).a(), (isx)esp.mX(this.c).a(), (qv)esp.oc(this.c).a(), (fom)esp.oj(this.c).a(), (YouTubeControlsOverlay)esp.wA(this.c).a(), (izd)esp.ws(this.c).a(), (aavi)esp.se(this.c).a(), (aavm)esp.sf(this.c).a(), (abby)epu.ad(esp.cj(this.c)).a(), (abby)epu.Y(esp.cj(this.c)).a(), (snd)epu.ac(esp.cj(this.c)).a(), (isl)esp.la(this.c).a(), (aavq)esp.sc(this.c).a(), (aavr)esp.sg(this.c).a(), (kud)esp.hh(this.c).a(), (iwa)esp.pP(this.c).a(), (siz)epu.L(esp.cj(this.c)).a(), (abbv)esp.oZ(this.c).a(), (sjy)esp.rL(this.c).a(), (sjm)esp.qD(this.c).a(), (sjf)epu.R(esp.cj(this.c)).a(), (jai)epu.aj(esp.cj(this.c)).a(), (CreatorEndscreenOverlayPresenter)esp.pc(this.c).a(), (abcp)esp.qG(this.c).a(), (aauw)esp.pQ(this.c).a(), (aavh)esp.sd(this.c).a(), (ism)esp.wy(this.c).a(), (itr)esp.gy(this.c).a(), (vaf)eqy.pn(this.a).a(), (abpu)esp.qW(this.c).a(), (aaos)eqy.fq(this.a).a(), (tsb)esp.sp(this.c).a(), (MdxOverlaysPresenter)esp.mu(this.c).a(), (SuggestedActionsMainController)esp.uq(this.c).a(), (avu)eqy.ov(this.a).a(), epu.b(esp.cj(this.c)), (ixw)esp.oe(this.c).a(), (eg)epu.aa(esp.cj(this.c)).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 70: {
                final esp c4 = this.c;
                return lkh.b(esp.in(c4), esp.nd(c4));
            }
            case 69: {
                return hoy.l((fjv)esp.ra(this.c).a(), (hqv)esp.tc(this.c).a());
            }
            case 68: {
                return hlk.u((Activity)esp.oz(this.c).a(), (vcy)esp.oW(this.c).a(), (tqd)eqy.qe(this.a).a(), esp.ql(this.c), (aeea)eqy.mB(this.a).a());
            }
            case 67: {
                return fqs.f((bu)esp.pI(this.c).a(), (abpq)esp.kb(this.c).a(), (itg)esp.ke(this.c).a(), (abdk)esp.rG(this.c).a());
            }
            case 66: {
                return wdt.q((Context)esp.oz(this.c).a(), (wyv)esp.ow(this.c).a(), (vcy)esp.oW(this.c).a(), (aald)esp.uD(this.c).a(), (acgs)eqy.kr(this.a).a());
            }
            case 65: {
                return wdt.e((Context)esp.oz(this.c).a(), (wyv)esp.ow(this.c).a(), (vcy)esp.oW(this.c).a(), (acpk)eqy.kK(this.a).a(), (acgs)eqy.kr(this.a).a());
            }
            case 64: {
                return wdt.d((Context)esp.oz(this.c).a(), (wyv)esp.ow(this.c).a(), (vcy)esp.oW(this.c).a(), (acgs)eqy.kr(this.a).a());
            }
            case 63: {
                return wdt.t((Context)esp.us(this.c).a(), (acgs)eqy.kr(this.a).a(), (vcy)esp.oW(this.c).a(), (acpk)eqy.kK(this.a).a(), (aujg)era.bG(eqy.r(this.a)).a(), (zxn)era.bN(eqy.r(this.a)).a(), (xib)esp.lo(this.c).a());
            }
            case 62: {
                final esp c5 = this.c;
                final atke c6 = epu.C(esp.cj(c5));
                final atke lp = esp.lp(c5);
                final atke ls = esp.ls(c5);
                final atke lf = esp.lF(c5);
                final atke d = epu.D(esp.cj(c5));
                final atke f = epu.F(esp.cj(c5));
                final atke e = epu.E(esp.cj(c5));
                final atke lu = esp.lu(c5);
                final atke lp2 = esp.lP(c5);
                final aujg an = esp.An(c5);
                final esp c7 = this.c;
                return wdt.u(c6, lp, ls, lf, d, f, e, lu, lp2, an, esp.lH(c7), esp.lr(c7), esp.li(c7), esp.iR(c7));
            }
            case 61: {
                return hlk.o();
            }
            case 60: {
                return new hzn((byte[])null, null);
            }
            case 59: {
                return new ReelPlaybackErrorLogger((abpq)esp.kb(this.c).a(), (wxx)eqy.tf(this.a).a(), (ynp)eqy.rc(this.a).a(), (abpu)eqy.rY(this.a).a());
            }
            case 58: {
                return new hzn((byte[])null, null, null);
            }
            case 57: {
                return hoy.r();
            }
            case 56: {
                return hdz.q((xao)eqy.hS(this.a).a());
            }
            case 55: {
                final esp c8 = this.c;
                final atke oz = esp.oz(c8);
                final atke sz = esp.sZ(c8);
                final atke pk = esp.pk(c8);
                final atke ow = esp.oW(c8);
                final eqy a = this.a;
                return new aaad(oz, sz, pk, ow, eqy.tf(a), eqy.tw(a));
            }
            case 54: {
                return ufa.h((Context)eqy.ps(this.a).a());
            }
            case 53: {
                return ulu.d(epu.l(esp.cj(this.c)), epu.n(esp.cj(this.c)), (Executor)eqy.fT(this.a).a(), (Executor)eqy.oN(this.a).a());
            }
            case 52: {
                final zmf zmf = (zmf)eqy.pK(this.a).a();
                final bu bu = (bu)esp.pI(this.c).a();
                final vmz vmz = (vmz)eqy.et(this.a).a();
                final rna rna = (rna)eqy.wh(this.a).a();
                final rlt rlt = (rlt)eqy.iv(this.a).a();
                final tgd tgd = (tgd)eqy.jn(this.a).a();
                final adfq adfq = (adfq)era.bv(eqy.r(this.a)).a();
                final gbo gbo = (gbo)esp.ib(this.c).a();
                final Executor executor = (Executor)eqy.fT(this.a).a();
                final zfw zfw = (zfw)esp.ik(this.c).a();
                final tjm tjm = (tjm)eqy.ib(this.a).a();
                return eoy.l(bu);
            }
            case 51: {
                return adnu.k((Activity)esp.oz(this.c).a(), (Set)afft.r());
            }
            case 50: {
                return zpt.t(eqy.mP(this.a));
            }
            case 49: {
                return zpt.u(epu.H(esp.cj(this.c)));
            }
            case 48: {
                return ufa.i((Context)eqy.ps(this.a).a(), (Executor)eqy.ft(this.a).a(), (aemf)eqy.qC(this.a).a());
            }
            case 47: {
                return txm.g();
            }
            case 46: {
                return lio.i((gkv)esp.oN(this.c).a());
            }
            case 45: {
                return guc.c(esp.dU(this.c));
            }
            case 44: {
                return hup.k(esp.cu(this.c));
            }
            case 43: {
                return rne.e((Activity)esp.oz(this.c).a());
            }
            case 42: {
                return wji.g(esp.dU(this.c));
            }
            case 41: {
                return rne.h((Activity)esp.oz(this.c).a(), epu.t(esp.cj(this.c)));
            }
            case 40: {
                return qtx.g();
            }
            case 39: {
                return qtx.f();
            }
            case 38: {
                return qtx.h();
            }
            case 37: {
                return qxd.b();
            }
            case 36: {
                return qtx.n();
            }
            case 35: {
                return qtx.l();
            }
            case 34: {
                return qtx.m();
            }
            case 33: {
                return qtx.j((aln)epu.ab(esp.cj(this.c)).a());
            }
            case 32: {
                return qtx.q(era.ef(eqy.r(this.a)));
            }
            case 31: {
                final bu bu2 = (bu)esp.pI(this.c).a();
                final ubu an2 = epu.an(esp.cj(this.c));
                final pba pba = (pba)era.ap(eqy.r(this.a)).a();
                final sqq ab = epu.aB(esp.cj(this.c));
                final rig rig = (rig)epu.M(esp.cj(this.c)).a();
                final rig rig2 = (rig)epu.N(esp.cj(this.c)).a();
                final rky rky = (rky)epu.V(esp.cj(this.c)).a();
                final esp c9 = this.c;
                return qxd.r(bu2, an2, pba, ab, epu.Z(esp.cj(c9)), epu.X(esp.cj(c9)));
            }
            case 30: {
                return qtx.i((que)epu.W(esp.cj(this.c)).a(), (afam)era.ef(eqy.r(this.a)).a(), (afam)era.ef(eqy.r(this.a)).a());
            }
            case 29: {
                return qfr.s((Activity)esp.oz(this.c).a(), epu.ax(esp.cj(this.c)));
            }
            case 28: {
                return qfr.j((Activity)esp.oz(this.c).a(), (aezp)epu.S(esp.cj(this.c)).a());
            }
            case 27: {
                return qtx.d();
            }
            case 26: {
                return qxd.l(epu.ap(esp.cj(this.c)));
            }
            case 25: {
                return qxd.c(epu.h(esp.cj(this.c)));
            }
            case 24: {
                return qtx.o(epu.at(esp.cj(this.c)));
            }
            case 23: {
                return qtx.t(epu.aC(esp.cj(this.c)));
            }
            case 22: {
                return qtx.s(epu.at(esp.cj(this.c)), epu.g(esp.cj(this.c)), epu.ap(esp.cj(this.c)), (qxw)epu.K(esp.cj(this.c)).a());
            }
            case 21: {
                return qtx.p(epu.av(esp.cj(this.c)), (afvs)eqy.oN(this.a).a(), epu.ar(esp.cj(this.c)), (afam)era.ef(eqy.r(this.a)).a());
            }
            case 20: {
                return qtx.k((qts)epu.v(esp.cj(this.c)).a(), (afvs)eqy.oN(this.a).a(), (agqq)epu.P(esp.cj(this.c)).a());
            }
            case 19: {
                return qfr.l((agtb)epu.O(esp.cj(this.c)).a());
            }
            case 18: {
                return qxd.d((qxw)epu.K(esp.cj(this.c)).a());
            }
            case 17: {
                return qfr.u(epu.az(esp.cj(this.c)));
            }
            case 16: {
                return qfr.m((Context)eqy.ps(this.a).a(), (arvx)epu.U(esp.cj(this.c)).a(), (afvs)eqy.oN(this.a).a(), (Account)epu.J(esp.cj(this.c)).a());
            }
            case 15: {
                return qfr.k((qtt)epu.Q(esp.cj(this.c)).a(), (afvs)eqy.oN(this.a).a());
            }
            case 14: {
                return qtx.v((qts)epu.v(esp.cj(this.c)).a(), (afvs)eqy.oN(this.a).a(), (agqq)epu.P(esp.cj(this.c)).a());
            }
            case 13: {
                return qxd.f((qxw)epu.K(esp.cj(this.c)).a());
            }
            case 12: {
                return qxd.g((qxw)epu.K(esp.cj(this.c)).a());
            }
            case 11: {
                return qxd.m((bu)esp.pI(this.c).a(), epu.ax(esp.cj(this.c)));
            }
            case 10: {
                return qxd.e((qxw)epu.K(esp.cj(this.c)).a());
            }
            case 9: {
                return qtx.b((Context)eqy.ps(this.a).a(), (String)epu.I(esp.cj(this.c)).a(), epu.r(esp.cj(this.c)));
            }
            case 8: {
                return qfr.t(epu.au(esp.cj(this.c)));
            }
            case 7: {
                return new piz(era.ef(eqy.r(this.a)));
            }
            case 6: {
                return qtx.c((bu)esp.pI(this.c).a(), epu.f(esp.cj(this.c)));
            }
            case 5: {
                return qtx.e(epu.g(esp.cj(this.c)));
            }
            case 4: {
                return qfr.r((bu)esp.pI(this.c).a(), epu.d(esp.cj(this.c)));
            }
            case 3: {
                return lnc.n((c)eqy.wd(this.a).a());
            }
            case 2: {
                return lnc.k(esp.bT(this.c), epu.a(esp.cj(this.c)), epu.ai(esp.cj(this.c)).a());
            }
            case 1: {
                return lnc.f((WebViewFallbackActivity)esp.sv(this.c).a());
            }
            case 0: {
                return lnc.b(esp.sw(this.c).a(), (Object)lnc.c(), (Object)lnc.c(), epu.s(esp.cj(this.c)), (Executor)eqy.fT(this.a).a());
            }
        }
    }
    
    public final Object a() {
        final int b = this.b;
        if (b / 100 != 0) {
            Object o = null;
            switch (b) {
                default: {
                    throw new AssertionError(b);
                }
                case 119: {
                    o = new lbb((msr)this.c.bA.a(), (lgj)this.c.bY.a(), (jki)this.c.a.az.a(), (jki)this.c.au.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                    break;
                }
                case 118: {
                    o = new jki((jby)this.c.bZ.a());
                    break;
                }
                case 117: {
                    o = new laz((msr)this.c.bA.a(), (jki)this.c.a.az.a(), (jki)this.c.au.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                    break;
                }
                case 116: {
                    o = new blu((vai)this.c.ac.a(), (cya)this.c.cD.a(), (msr)this.c.m.a(), (jki)this.c.au.a(), null, null, null, null, null);
                    break;
                }
                case 115: {
                    o = new lnv((iri)this.c.v.a(), (fjv)this.c.z.a(), (abbd)this.a.a.cy.a(), (asid)this.a.dP.a(), (abpu)this.c.j.a(), (Context)this.c.d.a());
                    break;
                }
                case 114: {
                    final Context context = (Context)this.c.d.a();
                    final atke fr = this.a.fr;
                    o = new gto(context);
                    final gkv a = ((gkx)fr.a()).a();
                    final gkv b2 = gkv.b;
                    if (((gto)o).a == null) {
                        ((gto)o).a = new Paint();
                    }
                    ((gto)o).a.setColor(tpe.cr(context, 2130970922));
                    if (a == b2) {
                        ((gto)o).a.setColor(((gto)o).getResources().getColor(2131102382));
                    }
                    final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    ((gto)o).b = tpe.aZ(displayMetrics, 1);
                    ((gto)o).c = tpe.aZ(displayMetrics, 12);
                    ((gto)o).d = tpe.aZ(displayMetrics, 20);
                    ((gto)o).e = tpe.aZ(displayMetrics, 32);
                    break;
                }
                case 113: {
                    o = new gtn((abij)this.c.ee.a(), this.c.aP, (Executor)this.a.g.a(), (asid)this.a.dP.a());
                    break;
                }
                case 112: {
                    o = new gtt((Context)this.c.d.a(), (gtn)this.c.a.au.a(), this.c.a.av, this.a.dP);
                    break;
                }
                case 111: {
                    o = aezp.j((Object)this.c.O().getSupportActionBar());
                    break;
                }
                case 110: {
                    o = aezp.j((Object)this.c.N().getSupportActionBar());
                    break;
                }
                case 109: {
                    final Activity activity = (Activity)this.c.d.a();
                    final epu a2 = this.c.a;
                    final atke atke = afev.n(EditVideoActivity.class, a2.ar, UploadActivity.class, a2.as).get(activity.getClass());
                    activity.getClass().getName();
                    atke.getClass();
                    o = atke.a();
                    o.getClass();
                    break;
                }
                case 108: {
                    o = new yuv();
                    break;
                }
                case 107: {
                    o = new zgv((Context)this.a.c.a());
                    break;
                }
                case 106: {
                    o = wmm.h((Context)this.a.c.a(), (SharedPreferences)this.a.d.a());
                    o.getClass();
                    break;
                }
                case 105: {
                    final xmm xmm = (xmm)this.a.a.eA.a();
                    final xmm xmm2 = (xmm)this.a.a.dL.a();
                    final Context context2 = (Context)this.c.d.a();
                    final oby oby = (oby)this.a.e.a();
                    final tjb tjb = (tjb)this.a.dD.a();
                    final xib xib = (xib)this.c.eT.a();
                    final xib xib2 = (xib)this.c.eS.a();
                    final wst wst = (wst)this.c.a.ad.a();
                    final wsr ax = this.c.ax();
                    final acmr acmr = (acmr)this.a.ev.a();
                    oby.getClass();
                    final gpj i = gpj.i();
                    final boolean b3 = xib.B();
                    wst.getClass();
                    o = i.j(xmm, b3, context2, oby, tjb, xib, xib2, (whx)new wss(wst), ax.aN, acmr);
                    break;
                }
                case 103:
                case 104: {
                    final esp esp = this.c;
                    return esp.ax();
                }
                case 102: {
                    final esp esp = this.c;
                    return esp.ax();
                }
                case 101: {
                    o = new wii((Context)this.c.d.a());
                    break;
                }
                case 100: {
                    o = new wui((bu)this.c.l.a(), (vcy)this.c.F.a(), (wqk)this.a.a.ez.a());
                    break;
                }
            }
            return o;
            esp esp = null;
            o = esp.ax();
            return o;
        }
        return this.b();
    }
}
