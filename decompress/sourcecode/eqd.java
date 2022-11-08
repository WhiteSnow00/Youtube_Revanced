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

final class eqd implements atjj
{
    public final eqv a;
    public final esm b;
    private final int c;
    private final esp d;
    
    public eqd(final eqv a, final esm b, final esp d, final int c) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    @Override
    public final Object a() {
        switch (this.c) {
            default: {
                return xlb.i((xpe)eqx.cN(eqv.q(this.a)).a(), (wwv)eqv.hR(this.a).a(), esp.n(this.d), (aftr)eqv.oO(this.a).a(), (zki)eqv.pL(this.a).a(), (wzw)eqv.qL(this.a).a(), (Context)eqv.pt(this.a).a(), (abno)eqv.ki(this.a).a(), (xlv)eqv.mi(this.a).a());
            }
            case 86: {
                return xlb.g(esp.n(this.d), (rgm)eqv.pL(this.a).a(), (aceo)eqv.ks(this.a).a(), (zki)eqv.pL(this.a).a(), (xpe)eqx.cN(eqv.q(this.a)).a(), (wwv)eqv.hR(this.a).a());
            }
            case 85: {
                return xab.i(esp.n(this.d), (wwv)eqv.hR(this.a).a(), (xll)eqv.hY(this.a).a());
            }
            case 84: {
                return new xgc(esm.op(this.b), eqx.bO(eqv.q(this.a)), (byte[])null, (byte[])null);
            }
            case 83: {
                return new wft((Context)esm.op(this.b).a());
            }
            case 82: {
                return new uyi((uyf)eqv.po(this.a).a(), (arud)eqv.qo(this.a).a(), (int[][])null, (byte[])null, (byte[])null);
            }
            case 81: {
                return sni.t((acup)esp.W(this.d).a(), (vax)esm.oN(this.b).a(), (fzo)esm.lP(this.b).a(), (uyf)eqv.po(this.a).a());
            }
            case 80: {
                return sni.r(esm.zR(this.b), (vax)esm.oN(this.b).a(), (wwu)esm.ol(this.b).a());
            }
            case 79: {
                return sni.q(esm.zR(this.b), (vax)esm.oN(this.b).a(), (wwu)esm.ol(this.b).a());
            }
            case 78: {
                return sni.s((acup)esp.V(this.d).a(), (vax)esm.oN(this.b).a(), (fzo)esm.lP(this.b).a(), (uyf)eqv.po(this.a).a());
            }
            case 77: {
                return rmc.b((Activity)esm.op(this.b).a(), epr.r(esm.ce(this.b)));
            }
            case 76: {
                return new tdg(esp.x(this.d), (Executor)eqv.oO(this.a).a());
            }
            case 75: {
                final esm b = this.b;
                final atjj op = esm.op(b);
                final atjj y = esp.Y(this.d);
                final eqv a = this.a;
                return new pht(op, y, eqv.pL(a), eqv.pL(a), eqv.ks(a), eqx.bL(eqv.q(a)), esm.op(b), esm.us(b), esm.oN(b), eqv.sL(a));
            }
            case 74: {
                final atjj o = epr.O(esm.ce(this.b));
                final eqv a2 = this.a;
                return new eg(o, eqx.fD(eqv.q(a2)), eqx.as(eqv.q(a2)), (byte[])null, (byte[])null, (char[])null);
            }
            case 73: {
                return new nmo(eqx.ei(eqv.q(this.a)));
            }
            case 72: {
                final atjj o2 = epr.O(esm.ce(this.b));
                final eqv a3 = this.a;
                return new eg(o2, eqx.fD(eqv.q(a3)), eqx.as(eqv.q(a3)), (byte[])null, (short[])null);
            }
            case 71: {
                return new cca((abno)esm.jR(this.b).a());
            }
            case 70: {
                return new iqp((fjp)esm.qT(this.b).a(), (absk)eqv.rL(this.a).a(), 0);
            }
            case 69: {
                final esm b2 = this.b;
                return new PlayerCollapsedStateMonitor(esm.jn(b2), (CreatorEndscreenOverlayPresenter)esm.oU(b2).a(), (aazx)esm.wt(this.b).a(), (abns)esm.qP(this.b).a());
            }
            case 68: {
                return imu.v((Activity)esm.op(this.b).a(), (aeby)eqv.mC(this.a).a(), (ScheduledExecutorService)eqv.oO(this.a).a(), (zki)eqv.pL(this.a).a(), (lzi)eqv.et(this.a).a());
            }
            case 67: {
                final PackageManager packageManager = (PackageManager)eqx.dI(eqv.q(this.a)).a();
                final fbj fbj = (fbj)eqv.fy(this.a).a();
                final fbg fbg = (fbg)esm.gv(this.b).a();
                final esm b3 = this.b;
                return new hmb(packageManager, fbj, fbg, esm.jR(b3), epr.v(esm.ce(b3)), eqv.pv(this.a));
            }
            case 66: {
                final esm b4 = this.b;
                final atjj st = esm.sT(b4);
                final atjj lh = esm.lH(b4);
                final eqv a4 = this.a;
                return new lfy(st, lh, eqv.iY(a4), eqv.jp(a4), eqv.qf(a4), esm.pa(b4), esm.pf(b4), eqv.qo(a4), eqx.eE(eqv.q(a4)), (char[])null);
            }
            case 65: {
                return iad.n((ice)esm.wf(this.b).a());
            }
            case 64: {
                return icd.b((Context)esm.op(this.b).a(), (abno)esm.jR(this.b).a());
            }
            case 63: {
                return iad.j((abno)esm.jR(this.b).a(), esp.P(this.d), (tny)eqv.qf(this.a).a());
            }
            case 62: {
                return iad.k(esp.G(this.d).a(), esp.H(this.d).a());
            }
            case 61: {
                return iad.o((vax)esm.oN(this.b).a(), (vas)esp.M(this.d).a(), (xlv)eqv.mi(this.a).a(), arjc.b(esp.J(this.d)));
            }
            case 60: {
                return icd.s((Context)esm.op(this.b).a(), (fai)esm.wf(this.b).a(), (tdz)eqv.jp(this.a).a(), (aceo)eqv.ks(this.a).a(), (wog)esp.I(this.d).a(), (vut)eqv.vZ(this.a).a(), (tny)eqv.qf(this.a).a(), (aeby)esm.sT(this.b).a(), (aciy)esm.pa(this.b).a(), (uyi)eqv.vy(this.a).a());
            }
            case 59: {
                final abno abno = (abno)esm.jR(this.b).a();
                final abni abni = (abni)esm.jP(this.b).a();
                esp.ah(this.d);
                return iad.t(abno, abni, eqv.mm(this.a), esm.Ad(this.b), (xlv)eqv.mi(this.a).a(), (wwv)eqv.hR(this.a).a());
            }
            case 58: {
                return iad.l((abno)esm.jR(this.b).a(), (abni)esm.jP(this.b).a(), (abbe)esp.N(this.d).a(), (xlv)eqv.mi(this.a).a());
            }
            case 57: {
                final Context context = (Context)esm.op(this.b).a();
                final atjj mm = eqv.mm(this.a);
                final ich c = icd.c();
                final esp d = this.d;
                final atjj o3 = esp.O(d);
                final fzo ap = esp.aP(d);
                final hyr ac = esp.aC(d);
                final acnj acnj = (acnj)esm.pb(this.b).a();
                final ice ice = (ice)esm.wf(this.b).a();
                return iad.v(context, mm, (Object)c, o3, ap, ac, acnj, (lgj)esp.T(this.d).a(), (wzw)eqv.qL(this.a).a(), (abns)esm.qP(this.b).a(), esm.oN(this.b));
            }
            case 56: {
                final Context context2 = (Context)esm.op(this.b).a();
                final eqv a5 = this.a;
                final atjj mm2 = eqv.mm(a5);
                final xlv xlv = (xlv)eqv.mi(a5).a();
                return new ibe(context2, mm2);
            }
            case 55: {
                final Context context3 = (Context)esm.op(this.b).a();
                final tdz tdz = (tdz)eqv.jp(this.a).a();
                final xlv xlv2 = (xlv)eqv.mi(this.a).a();
                final esp d2 = this.d;
                return iad.q(context3, tdz, xlv2, esp.E(d2), (ibj)esp.F(d2).a(), (ice)esm.wf(this.b).a(), (kth)epr.aa(esm.ce(this.b)).a(), (fzd)esm.vU(this.b).a(), (icf)esm.ie(this.b).a(), (ibp)esm.ie(this.b).a(), (ggs)esm.ic(this.b).a(), (elw)esm.fY(this.b).a(), esp.an(this.d), (kzd)esm.jW(this.b).a(), esm.jn(this.b));
            }
            case 54: {
                return jxe.e((Context)esm.op(this.b).a(), (acir)esm.qX(this.b).a(), arjc.b(esm.tg(this.b)), (vbq)eqv.kF(this.a).a(), (asho)eqv.fY(this.a).a(), (ViewGroup)esm.oz(this.b).a());
            }
            case 53: {
                return jxe.q((aepj)esm.px(this.b).a());
            }
            case 52: {
                return hty.c(esp.n(this.d));
            }
            case 51: {
                final Activity activity = (Activity)esm.op(this.b).a();
                final hvp hvp = (hvp)esp.K(this.d).a();
                final LinearLayout linearLayout = (LinearLayout)esm.oy(this.b).a();
                final acno acno = (acno)esm.pc(this.b).a();
                final aeby aeby = (aeby)esm.sT(this.b).a();
                final vax vax = (vax)esm.oN(this.b).a();
                final feq feq = (feq)esm.fQ(this.b).a();
                return hvr.i(activity, hvp, linearLayout, acno, aeby, vax, esm.sG(this.b), (uyf)eqv.po(this.a).a(), arjc.b(esm.tg(this.b)), (abzk)esm.iH(this.b).a(), (aeby)eqv.jb(this.a).a(), (LayerableFilterEntityController)esm.kE(this.b).a());
            }
            case 50: {
                return hty.d();
            }
            case 49: {
                return gus.p((bu)esm.pz(this.b).a(), esp.al(this.d));
            }
            case 48: {
                return new jws((vax)esm.oN(this.b).a(), (arcq)eqx.ad(eqv.q(this.a)).a(), (wwu)esm.ol(this.b).a(), (byte[])null, (byte[])null);
            }
            case 47: {
                return hty.e(eqv.po(this.a), (SfvAudioItemPlaybackController)esm.tC(this.b).a());
            }
            case 46: {
                return new uyi((uyf)eqv.po(this.a).a(), (arud)eqv.qo(this.a).a(), (char[])null, (byte[])null, (byte[])null);
            }
            case 45: {
                return new alm(eqx.ad(eqv.q(this.a)), esm.op(this.b), esp.B(this.d), (char[])null, (byte[])null);
            }
            case 44: {
                return hlu.k((acng)eqv.kL(this.a).a(), (vax)esm.oN(this.b).a(), (wwu)esm.ol(this.b).a());
            }
            case 43: {
                return hlu.j(esm.sx(this.b));
            }
            case 42: {
                return hlu.u((vax)esm.oN(this.b).a(), (acng)eqv.kL(this.a).a(), (hqa)esm.sW(this.b).a(), (wwu)esm.ol(this.b).a());
            }
            case 41: {
                return new aejr((vax)esm.oN(this.b).a(), (hqa)esm.sW(this.b).a(), (aeby)esm.kL(this.b).a(), null, null, null);
            }
            case 40: {
                return hlu.h((abbh)esp.R(this.d).a(), (abqd)eqx.aw(eqv.q(this.a)).a(), (abrv)eqv.uT(this.a).a(), epr.p(esm.ce(this.b)), (Executor)eqv.oO(this.a).a(), (Executor)eqv.fX(this.a).a(), (uyf)eqv.po(this.a).a());
            }
            case 39: {
                return hlu.f(esp.n(this.d));
            }
            case 38: {
                return hlu.e(esp.n(this.d));
            }
            case 37: {
                final esm b5 = this.b;
                return new zhb(esm.iI(b5), esm.sA(b5), esm.th(b5), esm.ol(b5), eqx.bU(eqv.q(this.a)), (byte[])null, (char[])null);
            }
            case 36: {
                final esm b6 = this.b;
                final atjj uk = esm.uk(b6);
                final atjj op2 = esm.op(b6);
                final atjj kp = esm.kP(b6);
                final eqv a6 = this.a;
                return new wdt(uk, op2, kp, eqv.ks(a6), esm.qf(b6), eqv.kL(a6), esm.oN(b6), eqx.bQ(eqv.q(a6)), eqx.bP(eqv.q(a6)), esm.kW(b6), esm.qi(b6), eqx.bj(eqv.q(a6)), esm.iQ(b6), eqx.bR(eqv.q(a6)), esm.kQ(b6), esm.th(b6), esm.sx(b6), esm.no(b6), eqx.bS(eqv.q(a6)), esm.gU(b6), esm.iH(b6), esm.iI(b6), esm.kT(b6), eqv.hM(a6));
            }
            case 35: {
                return how.p();
            }
            case 34: {
                final esm b7 = this.b;
                return new eg(esm.ol(b7), esp.D(this.d), epr.Y(esm.ce(b7)), (byte[])null, (char[])null);
            }
            case 33: {
                return gfr.l((Activity)esm.op(this.b).a(), (zki)eqv.pL(this.a).a(), (zkw)eqv.kc(this.a).a(), eqv.zg(this.a), (tny)eqv.qf(this.a).a(), (tdz)eqv.jp(this.a).a(), (thh)eqv.id(this.a).a(), (toi)eqv.fl(this.a).a(), (vax)esm.oN(this.b).a(), (Executor)eqv.fX(this.a).a());
            }
            case 32: {
                return new gfi((hnc)esp.D(this.d).a(), (vax)esm.oN(this.b).a(), (wwu)esm.ol(this.b).a(), null, null);
            }
            case 31: {
                final esm b8 = this.b;
                final atjj z = epr.Z(esm.ce(b8));
                final atjj y2 = epr.Y(esm.ce(b8));
                final esp d3 = this.d;
                final atjj ac2 = esp.ac(d3);
                final eqv a7 = this.a;
                return new hpn(z, y2, ac2, eqv.ks(a7), esm.oN(b8), esp.C(d3), esm.ol(b8), esm.ub(b8), esp.af(d3), esp.ae(d3), eqv.kL(a7), esm.mx(b8), esm.iH(b8), esm.iI(b8), esp.L(d3), eqv.up(a7), eqv.qo(a7), esm.sW(b8), epr.X(esm.ce(b8)), eqv.vy(a7), esm.us(b8), eqx.af(eqv.q(a7)), eqv.lh(a7));
            }
            case 30: {
                return how.t((aceo)eqv.ks(this.a).a(), (aeyr)eqv.ko(this.a).a(), (mrm)esp.L(this.d).a(), (uyi)eqv.up(this.a).a(), (arud)eqv.qo(this.a).a());
            }
            case 29: {
                return how.n((Context)esm.op(this.b).a(), (Handler)eqv.sL(this.a).a(), (hqa)esm.sW(this.b).a(), (hpd)esp.Z(this.d).a(), (arud)eqv.qo(this.a).a());
            }
            case 28: {
                return new hqq((Context)esm.op(this.b).a(), (vax)esm.oN(this.b).a(), (wwu)esm.ol(this.b).a(), (auip)eqx.eY(eqv.q(this.a)).a(), (acng)eqv.kL(this.a).a(), null, null, null, null);
            }
            case 27: {
                return hlu.c(arjc.b(esp.ab(this.d)), (afts)eqv.qF(this.a).a());
            }
            case 26: {
                return hlu.g((hoa)esp.S(this.d).a());
            }
            case 25: {
                final esm b9 = this.b;
                return new fzo(esm.jS(b9), epr.x(esm.ce(b9)), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 24: {
                return new eg(eqx.ba(eqv.q(this.a)), esp.S(this.d), esm.sV(this.b), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 23: {
                final eqv a8 = this.a;
                return new eg(eqv.qo(a8), eqx.ba(eqv.q(a8)), eqv.up(a8), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 22: {
                return hlu.l(arjc.b(esp.ab(this.d)), (wwu)esm.ol(this.b).a());
            }
            case 21: {
                final esm b10 = this.b;
                return new hyc(esm.iH(b10), esm.iI(b10), esm.ol(b10), esp.ag(this.d), (byte[])null);
            }
            case 20: {
                return how.m((aagm)eqx.dO(eqv.q(this.a)).a(), (aum)esm.pz(this.b).a(), (Executor)eqv.oO(this.a).a(), (oas)eqv.gK(this.a).a());
            }
            case 19: {
                return hlu.i(esp.n(this.d));
            }
            case 18: {
                return hlu.s((Context)esm.op(this.b).a(), (Handler)eqv.sL(this.a).a(), (hqa)esm.sW(this.b).a(), (hpd)esp.Z(this.d).a(), (hqd)esp.S(this.d).a(), (arud)eqv.qo(this.a).a(), (uyi)esm.tE(this.b).a(), (mrm)esp.L(this.d).a());
            }
            case 17: {
                return how.s((Context)esm.op(this.b).a(), (wwu)esm.ol(this.b).a(), (uyi)esm.tE(this.b).a(), (mrm)esp.L(this.d).a());
            }
            case 16: {
                return new hmk((arud)eqv.qo(this.a).a(), (aeyr)eqv.ko(this.a).a(), (abno)esm.jS(this.b).a(), epr.n(esm.ce(this.b)), (hqa)esm.sW(this.b).a(), (hpd)esp.Z(this.d).a(), (hmq)esp.ad(this.d).a(), (hmm)eqv.tG(this.a).a(), (hqe)esp.ac(this.d).a(), esp.v(this.d), esp.w(this.d), (hok)esp.ag(this.d).a(), (hlx)esp.aa(this.d).a(), (hlf)eqx.ba(eqv.q(this.a)).a(), (wwu)esm.ol(this.b).a(), (Executor)eqv.fX(this.a).a(), (oas)eqv.gK(this.a).a(), (ReelSnackbarController)esm.sY(this.b).a(), (mrm)esp.L(this.d).a(), (uyi)eqv.up(this.a).a(), (uyi)esm.tH(this.b).a(), (fjz)eqv.gJ(this.a).a(), null, null, null, null);
            }
            case 15: {
                return hgf.i((Context)esm.op(this.b).a());
            }
            case 14: {
                return hgf.f((Context)esm.op(this.b).a(), (Handler)eqv.sL(this.a).a());
            }
            case 13: {
                return hgf.g((Context)esm.op(this.b).a(), esp.u(this.d));
            }
            case 12: {
                return hgf.h(esp.s(this.d));
            }
            case 11: {
                return hgf.e(esp.n(this.d));
            }
            case 10: {
                return hgf.d(esp.n(this.d));
            }
            case 9: {
                final esp d4 = this.d;
                return tzb.t(esp.n(d4), (umv)esp.U(d4).a(), esp.z(this.d), new tvq(), (ufj)esp.X(this.d).a(), (wwv)eqv.hR(this.a).a(), (arud)eqv.qo(this.a).a(), esp.y(this.d), (acup)esm.sx(this.b).a(), (aagm)eqx.em(eqv.q(this.a)).a(), epr.ap(esm.ce(this.b)));
            }
            case 8: {
                return new hil(esp.am(this.d), (avt)eqx.fy(eqv.q(this.a)).a(), esp.aG(this.d), (Handler)eqv.sL(this.a).a(), (asho)eqv.fY(this.a).a(), (asho)eqv.fN(this.a).a(), esp.t(this.d), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 7: {
                return new eqc(this, 0);
            }
            case 6: {
                return szp.p(esp.o(this.d));
            }
            case 5: {
                return gus.q((gcy)esm.rb(this.b).a(), (wwu)esm.ol(this.b).a());
            }
            case 4: {
                return gus.t((wwu)esm.ol(this.b).a(), (aeby)esm.sT(this.b).a(), (tdz)eqv.jp(this.a).a(), (vlq)eqv.go(this.a).a(), (tny)eqv.qf(this.a).a(), (arud)eqv.qo(this.a).a(), (asgt)eqx.eE(eqv.q(this.a)).a(), (acno)esm.pc(this.b).a(), (acpn)esm.pf(this.b).a(), (acoc)esm.lH(this.b).a(), esp.aw(this.d), (SfvAudioItemPlaybackController)esm.tC(this.b).a(), (ioe)esm.lO(this.b).a(), (aeby)esm.iB(this.b).a(), (osx)eqx.de(eqv.q(this.a)).a());
            }
            case 3: {
                final esm b11 = this.b;
                final atjj on = esm.oN(b11);
                final eqv a9 = this.a;
                return new sxv(on, eqv.kL(a9), eqv.kF(a9), eqx.bG(eqv.q(a9)), arjh.c(esm.rM(b11)), esm.hA(this.b));
            }
            case 2: {
                return gus.c(esp.n(this.d));
            }
            case 1: {
                return gus.d((gvb)esp.Q(this.d).a(), esp.r(this.d), esp.q(this.d), esp.p(this.d), (wwu)esm.ol(this.b).a());
            }
            case 0: {
                final esm b12 = this.b;
                return new alm(esm.op(b12), esm.ut(b12), eqv.vy(this.a));
            }
        }
    }
}
