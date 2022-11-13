import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelSnackbarController;
import android.os.Handler;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.libraries.youtube.commerce.red.entity.LayerableFilterEntityController;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.content.pm.PackageManager;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.PlayerCollapsedStateMonitor;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import java.util.concurrent.Executor;
import android.app.Activity;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class eqg implements atke
{
    public final eqy a;
    public final esp b;
    private final int c;
    private final ess d;
    
    public eqg(final eqy a, final esp b, final ess d, final int c) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public final Object a() {
        switch (this.c) {
            default: {
                return xqp.d((xrd)era.cK(eqy.r(this.a)).a(), (wyw)eqy.hP(this.a).a(), ess.p(this.d), (afvs)eqy.oN(this.a).a(), (zmf)eqy.pK(this.a).a(), (xbv)eqy.qK(this.a).a(), (Context)eqy.ps(this.a).a(), (abpq)eqy.kh(this.a).a(), (xnt)eqy.mi(this.a).a());
            }
            case 85: {
                return xqp.b(ess.p(this.d), (riq)eqy.pK(this.a).a(), (acgs)eqy.kr(this.a).a(), (zmf)eqy.pK(this.a).a(), (xrd)era.cK(eqy.r(this.a)).a(), (wyw)eqy.hP(this.a).a());
            }
            case 84: {
                return xeb.f(ess.p(this.d), (wyw)eqy.hP(this.a).a(), (xnj)eqy.hW(this.a).a());
            }
            case 83: {
                return new xib(esp.oz(this.b), era.bM(eqy.r(this.a)), (byte[])null, (byte[])null);
            }
            case 82: {
                return new whu((Context)esp.oz(this.b).a());
            }
            case 81: {
                return srz.u((acwt)ess.Y(this.d).a(), (vcy)esp.oW(this.b).a(), (fzw)esp.ma(this.b).a(), (vaf)eqy.pn(this.a).a());
            }
            case 80: {
                return srz.s(esp.zS(this.b), (vcy)esp.oW(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 79: {
                return srz.r(esp.zS(this.b), (vcy)esp.oW(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 78: {
                return srz.t((acwt)ess.X(this.d).a(), (vcy)esp.oW(this.b).a(), (fzw)esp.ma(this.b).a(), (vaf)eqy.pn(this.a).a());
            }
            case 77: {
                return rne.h((Activity)esp.oz(this.b).a(), epu.t(esp.cj(this.b)));
            }
            case 76: {
                return new sqq(ess.z(this.d), (Executor)eqy.oN(this.a).a());
            }
            case 75: {
                final esp b = this.b;
                final atke oz = esp.oz(b);
                final atke aa = ess.aa(this.d);
                final eqy a = this.a;
                return new pjd(oz, aa, eqy.pK(a), eqy.pK(a), eqy.kr(a), era.bJ(eqy.r(a)), esp.oz(b), esp.uA(b), esp.oW(b), eqy.sJ(a));
            }
            case 74: {
                final atke t = epu.T(esp.cj(this.b));
                final eqy a2 = this.a;
                return new eg(t, era.fA(eqy.r(a2)), era.ap(eqy.r(a2)), (byte[])null, (byte[])null, (byte[])null);
            }
            case 73: {
                return new piz(era.ef(eqy.r(this.a)));
            }
            case 72: {
                final atke t2 = epu.T(esp.cj(this.b));
                final eqy a3 = this.a;
                return new eg(t2, era.fA(eqy.r(a3)), era.ap(eqy.r(a3)), (byte[])null, (byte[])null);
            }
            case 71: {
                return new ccb((abpq)esp.ka(this.b).a());
            }
            case 70: {
                return new irp((fjv)esp.ra(this.b).a(), (abul)eqy.rJ(this.a).a(), 0);
            }
            case 69: {
                final esp b2 = this.b;
                return new PlayerCollapsedStateMonitor(esp.jx(b2), (CreatorEndscreenOverlayPresenter)esp.pc(b2).a(), (abbs)esp.wA(this.b).a(), (abpu)esp.qW(this.b).a());
            }
            case 68: {
                return ips.u((Activity)esp.oz(this.b).a(), (aeea)eqy.mB(this.a).a(), (ScheduledExecutorService)eqy.oN(this.a).a(), (zmf)eqy.pK(this.a).a(), (man)eqy.ep(this.a).a());
            }
            case 67: {
                final PackageManager packageManager = (PackageManager)era.dF(eqy.r(this.a)).a();
                final fbo fbo = (fbo)eqy.fu(this.a).a();
                final fbl fbl = (fbl)esp.gF(this.b).a();
                final esp b3 = this.b;
                return new hmw(packageManager, fbo, fbl, esp.ka(b3), epu.w(esp.cj(b3)), eqy.pu(this.a));
            }
            case 66: {
                final esp b4 = this.b;
                final atke sz = esp.sZ(b4);
                final atke ls = esp.lS(b4);
                final eqy a4 = this.a;
                return new ktn(sz, ls, eqy.iW(a4), eqy.jn(a4), eqy.qe(a4), esp.pi(b4), esp.pn(b4), eqy.qn(a4), era.eA(eqy.r(a4)), (short[])null);
            }
            case 65: {
                return iby.l((ida)esp.wn(this.b).a());
            }
            case 64: {
                return iby.g((Context)esp.oz(this.b).a(), (abpq)esp.ka(this.b).a());
            }
            case 63: {
                return iby.d((abpq)esp.ka(this.b).a(), ess.R(this.d), (tqd)eqy.qe(this.a).a());
            }
            case 62: {
                return iby.e(ess.I(this.d).a(), ess.J(this.d).a());
            }
            case 61: {
                return iby.m((vcy)esp.oW(this.b).a(), (vct)ess.O(this.d).a(), (xnt)eqy.mi(this.a).a(), arlr.b(ess.L(this.d)));
            }
            case 60: {
                return iby.u((Context)esp.oz(this.b).a(), (fam)esp.wn(this.b).a(), (tgd)eqy.jn(this.a).a(), (acgs)eqy.kr(this.a).a(), (wqi)ess.K(this.d).a(), (vwt)eqy.vY(this.a).a(), (tqd)eqy.qe(this.a).a(), (aeea)esp.sZ(this.b).a(), (aclb)esp.pi(this.b).a(), (vai)eqy.vx(this.a).a());
            }
            case 59: {
                final abpq abpq = (abpq)esp.ka(this.b).a();
                final abpl abpl = (abpl)esp.jY(this.b).a();
                ess.aj(this.d);
                return iby.s(abpq, abpl, eqy.mm(this.a), esp.Ai(this.b), (xnt)eqy.mi(this.a).a(), (wyw)eqy.hP(this.a).a());
            }
            case 58: {
                return iby.f((abpq)esp.ka(this.b).a(), (abpl)esp.jY(this.b).a(), (abcy)ess.P(this.d).a(), (xnt)eqy.mi(this.a).a());
            }
            case 57: {
                final Context context = (Context)esp.oz(this.b).a();
                final atke mm = eqy.mm(this.a);
                final idd h = iby.h();
                final ess d = this.d;
                final atke q = ess.Q(d);
                final fzw an = ess.aN(d);
                final hzn ac = ess.aC(d);
                final acpn acpn = (acpn)esp.pj(this.b).a();
                final ida ida = (ida)esp.wn(this.b).a();
                return iby.t(context, mm, (Object)h, q, an, ac, acpn, (lhk)ess.V(this.d).a(), (xbv)eqy.qK(this.a).a(), (abpu)esp.qW(this.b).a(), esp.oW(this.b));
            }
            case 56: {
                final Context context2 = (Context)esp.oz(this.b).a();
                final eqy a5 = this.a;
                final atke mm2 = eqy.mm(a5);
                final xnt xnt = (xnt)eqy.mi(a5).a();
                return new ica(context2, mm2);
            }
            case 55: {
                final Context context3 = (Context)esp.oz(this.b).a();
                final tgd tgd = (tgd)eqy.jn(this.a).a();
                final xnt xnt2 = (xnt)eqy.mi(this.a).a();
                final ess d2 = this.d;
                return iby.p(context3, tgd, xnt2, ess.G(d2), (icf)ess.H(d2).a(), (ida)esp.wn(this.b).a(), (kuj)epu.ah(esp.cj(this.b)).a(), (fzl)esp.wc(this.b).a(), (idb)esp.in(this.b).a(), (icl)esp.in(this.b).a(), (ghb)esp.il(this.b).a(), (elx)esp.gi(this.b).a(), ess.ap(this.d), (lag)esp.kf(this.b).a(), esp.jx(this.b));
            }
            case 54: {
                return jts.j((Context)esp.oz(this.b).a(), (acku)esp.re(this.b).a(), arlr.b(esp.tm(this.b)), (vdr)eqy.kE(this.a).a(), (asid)eqy.fU(this.a).a(), (ViewGroup)esp.oJ(this.b).a());
            }
            case 53: {
                return jts.n((afhd)esp.pG(this.b).a());
            }
            case 52: {
                return hup.m(ess.p(this.d));
            }
            case 51: {
                final Activity activity = (Activity)esp.oz(this.b).a();
                final hwl hwl = (hwl)ess.M(this.d).a();
                final LinearLayout linearLayout = (LinearLayout)esp.oI(this.b).a();
                final acps acps = (acps)esp.pk(this.b).a();
                final aeea aeea = (aeea)esp.sZ(this.b).a();
                final vcy vcy = (vcy)esp.oW(this.b).a();
                final fex fex = (fex)esp.ga(this.b).a();
                return hwo.f(activity, hwl, linearLayout, acps, aeea, vcy, esp.sM(this.b), (vaf)eqy.pn(this.a).a(), arlr.b(esp.tm(this.b)), (acbm)esp.iR(this.b).a(), (aeea)eqy.iZ(this.a).a(), (LayerableFilterEntityController)esp.kR(this.b).a());
            }
            case 50: {
                return hup.n();
            }
            case 49: {
                return gvs.s((bu)esp.pI(this.b).a(), ess.an(this.d));
            }
            case 48: {
                return new jxu((vcy)esp.oW(this.b).a(), (arfe)era.aa(eqy.r(this.a)).a(), (wyv)esp.ow(this.b).a(), (byte[])null, (byte[])null);
            }
            case 47: {
                return hup.o(eqy.pn(this.a), (SfvAudioItemPlaybackController)esp.tI(this.b).a());
            }
            case 46: {
                return new vai((vaf)eqy.pn(this.a).a(), (arwh)eqy.qn(this.a).a(), (byte[][])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 45: {
                return new heo(era.aa(eqy.r(this.a)), esp.oz(this.b), ess.D(this.d), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 44: {
                return hoy.f((acpk)eqy.kK(this.a).a(), (vcy)esp.oW(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 43: {
                return hoy.e(esp.sD(this.b));
            }
            case 42: {
                return hlk.t((vcy)esp.oW(this.b).a(), (acpk)eqy.kK(this.a).a(), (hqv)esp.tc(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 41: {
                return new aels((vcy)esp.oW(this.b).a(), (hqv)esp.tc(this.b).a(), (aeea)esp.kY(this.b).a(), null, null);
            }
            case 40: {
                return hoy.b((abdb)ess.T(this.d).a(), (abse)era.at(eqy.r(this.a)).a(), (abtw)eqy.uS(this.a).a(), epu.q(esp.cj(this.b)), (Executor)eqy.oN(this.a).a(), (Executor)eqy.fT(this.a).a(), (vaf)eqy.pn(this.a).a());
            }
            case 39: {
                return hlk.g(ess.p(this.d));
            }
            case 38: {
                return hlk.f(ess.p(this.d));
            }
            case 37: {
                final esp b5 = this.b;
                return new ziy(esp.iS(b5), esp.sG(b5), esp.tn(b5), esp.ow(b5), era.bS(eqy.r(this.a)), (byte[])null, (byte[])null);
            }
            case 36: {
                final esp b6 = this.b;
                final atke us = esp.us(b6);
                final atke oz2 = esp.oz(b6);
                final atke lc = esp.lc(b6);
                final eqy a6 = this.a;
                return new wft(us, oz2, lc, eqy.kr(a6), esp.qo(b6), eqy.kK(a6), esp.oW(b6), era.bO(eqy.r(a6)), era.bN(eqy.r(a6)), esp.lj(b6), esp.qr(b6), era.bh(eqy.r(a6)), esp.ja(b6), era.bP(eqy.r(a6)), esp.ld(b6), esp.tn(b6), esp.sD(b6), esp.nB(b6), era.bQ(eqy.r(a6)), esp.he(b6), esp.iR(b6), esp.iS(b6), esp.lg(b6), eqy.hK(a6));
            }
            case 35: {
                return hoy.p();
            }
            case 34: {
                final esp b7 = this.b;
                return new heo(esp.ow(b7), ess.F(this.d), epu.af(esp.cj(b7)), (byte[])null, (byte[])null, (byte[])null);
            }
            case 33: {
                return gcn.m((Activity)esp.oz(this.b).a(), (zmf)eqy.pK(this.a).a(), (zmt)eqy.kb(this.a).a(), eqy.ze(this.a), (tqd)eqy.qe(this.a).a(), (tgd)eqy.jn(this.a).a(), (tjm)eqy.ib(this.a).a(), (tqn)eqy.fh(this.a).a(), (vcy)esp.oW(this.b).a(), (Executor)eqy.fT(this.a).a());
            }
            case 32: {
                return new gfq((hnx)ess.F(this.d).a(), (vcy)esp.oW(this.b).a(), (wyv)esp.ow(this.b).a(), (byte[])null, (byte[])null);
            }
            case 31: {
                final esp b8 = this.b;
                final atke ag = epu.ag(esp.cj(b8));
                final atke af = epu.af(esp.cj(b8));
                final ess d3 = this.d;
                final atke ae = ess.ae(d3);
                final eqy a7 = this.a;
                return new hqi(ag, af, ae, eqy.kr(a7), esp.oW(b8), ess.E(d3), esp.ow(b8), esp.ui(b8), ess.ah(d3), ess.ag(d3), eqy.kK(a7), esp.mI(b8), esp.iR(b8), esp.iS(b8), ess.N(d3), eqy.uo(a7), eqy.qn(a7), esp.tc(b8), epu.ae(esp.cj(b8)), eqy.vx(a7), esp.uA(b8), era.ac(eqy.r(a7)), eqy.lg(a7));
            }
            case 30: {
                return hoy.v((acgs)eqy.kr(this.a).a(), (afaq)eqy.kn(this.a).a(), (msr)ess.N(this.d).a(), (vai)eqy.uo(this.a).a(), (arwh)eqy.qn(this.a).a());
            }
            case 29: {
                return hoy.o((Context)esp.oz(this.b).a(), (Handler)eqy.sJ(this.a).a(), (hqv)esp.tc(this.b).a(), (hpy)ess.ab(this.d).a(), (arwh)eqy.qn(this.a).a());
            }
            case 28: {
                return new hrk((Context)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a(), (wyv)esp.ow(this.b).a(), (aujg)era.eU(eqy.r(this.a)).a(), (acpk)eqy.kK(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 27: {
                return hlk.d(arlr.b(ess.ad(this.d)), (afvt)eqy.qE(this.a).a());
            }
            case 26: {
                return hoy.c((how)ess.U(this.d).a());
            }
            case 25: {
                final esp b9 = this.b;
                return new fzw(esp.kb(b9), epu.y(esp.cj(b9)), null, null, null, null);
            }
            case 24: {
                return new heo(era.aX(eqy.r(this.a)), ess.U(this.d), esp.tb(this.b));
            }
            case 23: {
                final eqy a8 = this.a;
                return new heo(eqy.qn(a8), era.aX(eqy.r(a8)), eqy.uo(a8), (byte[])null);
            }
            case 22: {
                return hoy.g(arlr.b(ess.ad(this.d)), (wyv)esp.ow(this.b).a());
            }
            case 21: {
                final esp b10 = this.b;
                return new hyx(esp.iR(b10), esp.iS(b10), esp.ow(b10), ess.ai(this.d), (byte[])null);
            }
            case 20: {
                return hoy.j((qqr)era.dL(eqy.r(this.a)).a(), (aun)esp.pI(this.b).a(), (Executor)eqy.oN(this.a).a(), (oby)eqy.gH(this.a).a());
            }
            case 19: {
                return hoy.d(ess.p(this.d));
            }
            case 18: {
                return hlk.r((Context)esp.oz(this.b).a(), (Handler)eqy.sJ(this.a).a(), (hqv)esp.tc(this.b).a(), (hpy)ess.ab(this.d).a(), (hqy)ess.U(this.d).a(), (arwh)eqy.qn(this.a).a(), (vai)esp.tK(this.b).a(), (msr)ess.N(this.d).a());
            }
            case 17: {
                return hoy.u((Context)esp.oz(this.b).a(), (wyv)esp.ow(this.b).a(), (vai)esp.tK(this.b).a(), (msr)ess.N(this.d).a());
            }
            case 16: {
                return new hne((arwh)eqy.qn(this.a).a(), (afaq)eqy.kn(this.a).a(), (abpq)esp.kb(this.b).a(), epu.o(esp.cj(this.b)), (hqv)esp.tc(this.b).a(), (hpy)ess.ab(this.d).a(), (hnk)ess.af(this.d).a(), (hng)eqy.tE(this.a).a(), (hqz)ess.ae(this.d).a(), ess.x(this.d), ess.y(this.d), (hph)ess.ai(this.d).a(), (hms)ess.ac(this.d).a(), (hmb)era.aX(eqy.r(this.a)).a(), (wyv)esp.ow(this.b).a(), (Executor)eqy.fT(this.a).a(), (oby)eqy.gH(this.a).a(), (ReelSnackbarController)esp.te(this.b).a(), (msr)ess.N(this.d).a(), (vai)eqy.uo(this.a).a(), (vai)esp.tN(this.b).a(), (fkf)eqy.gG(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 15: {
                return hdz.s((Context)esp.oz(this.b).a());
            }
            case 14: {
                return hdz.j((Context)esp.oz(this.b).a(), (Handler)eqy.sJ(this.a).a());
            }
            case 13: {
                return hdz.k((Context)esp.oz(this.b).a(), ess.w(this.d));
            }
            case 12: {
                return hdz.l(ess.u(this.d));
            }
            case 11: {
                return hdz.i(ess.p(this.d));
            }
            case 10: {
                return hdz.h(ess.p(this.d));
            }
            case 9: {
                final ess d4 = this.d;
                return ufa.s(ess.p(d4), (uos)ess.W(d4).a(), ess.B(this.d), new txw(), (uhn)ess.Z(this.d).a(), (wyw)eqy.hP(this.a).a(), (arwh)eqy.qn(this.a).a(), ess.A(this.d), (acwt)esp.sD(this.b).a(), (qqr)era.ej(eqy.r(this.a)).a(), epu.al(esp.cj(this.b)));
            }
            case 8: {
                return new hjh(ess.ao(this.d), (aeea)era.fv(eqy.r(this.a)).a(), ess.aG(this.d), (Handler)eqy.sJ(this.a).a(), (asid)eqy.fU(this.a).a(), (asid)eqy.fJ(this.a).a(), ess.v(this.d), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 7: {
                return new eqf(this, 0);
            }
            case 6: {
                return thm.q(ess.q(this.d));
            }
            case 5: {
                return guc.t((gdh)esp.ri(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 4: {
                return guc.v((wyv)esp.ow(this.b).a(), (aeea)esp.sZ(this.b).a(), (tgd)eqy.jn(this.a).a(), (vnu)eqy.gk(this.a).a(), (tqd)eqy.qe(this.a).a(), (arwh)eqy.qn(this.a).a(), (ashi)era.eA(eqy.r(this.a)).a(), (acps)esp.pk(this.b).a(), (acrr)esp.pn(this.b).a(), (acqg)esp.lS(this.b).a(), ess.aw(this.d), (SfvAudioItemPlaybackController)esp.tI(this.b).a(), (ipd)esp.lZ(this.b).a(), (aeea)esp.iL(this.b).a(), (oug)era.db(eqy.r(this.a)).a());
            }
            case 3: {
                final esp b11 = this.b;
                final atke ow = esp.oW(b11);
                final eqy a9 = this.a;
                return new aaad(ow, eqy.kK(a9), eqy.kE(a9), era.bE(eqy.r(a9)), arlw.c(esp.rS(b11)), esp.hJ(this.b), (byte[])null);
            }
            case 2: {
                return guc.g(ess.p(this.d));
            }
            case 1: {
                return guc.h((gvp)ess.S(this.d).a(), ess.t(this.d), ess.s(this.d), ess.r(this.d), (wyv)esp.ow(this.b).a());
            }
            case 0: {
                final esp b12 = this.b;
                return new aln(esp.oz(b12), esp.uB(b12), eqy.vx(this.a));
            }
        }
    }
}
