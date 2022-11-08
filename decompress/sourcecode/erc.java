import com.google.android.libraries.youtube.metadataeditor.thumbnail.FrameSelectorVideoViewModel;
import com.google.apps.tiktok.concurrent.futuresmixin.FuturesMixinViewModel;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.LocalMediaGreenScreenControllerViewModel;
import com.google.apps.tiktok.dataservice.SubscriptionMixinViewModel;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
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

final class erc implements atjj
{
    private final eqv a;
    private final int b;
    private final /* synthetic */ int c;
    private final Object d;
    
    public erc(final eqv a, final esm d, final int b, final int c) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public erc(final eqv a, final esw d, final int b, final int c) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    private final Object b() {
        final int b = this.b;
        switch (b) {
            default: {
                throw new AssertionError(b);
            }
            case 99: {
                final fpc g = fng.g((aays)esm.uD((esm)this.d).a());
                epr.ac((Object)g);
                return g;
            }
            case 98: {
                return hsz.o(esm.cp((esm)this.d));
            }
            case 97: {
                return how.i(esm.co((esm)this.d));
            }
            case 96: {
                return zet.b((Activity)esm.op((esm)this.d).a(), epr.q(esm.ce((esm)this.d)));
            }
            case 95: {
                return xre.o();
            }
            case 94: {
                return zet.d((Context)eqv.pt(this.a).a());
            }
            case 93: {
                return woh.c((Context)eqv.pt(this.a).a(), (SharedPreferences)eqv.sr(this.a).a());
            }
            case 92: {
                final xkm xkm = (xkm)eqx.eo(eqv.q(this.a)).a();
                final xkm xkm2 = (xkm)eqx.fL(eqv.q(this.a)).a();
                return woh.t(xkm, (Context)esm.op((esm)this.d).a(), (oas)eqv.gK(this.a).a(), (tgw)eqv.oR(this.a).a(), (adcr)esm.lE((esm)this.d).a(), (xgc)esm.lG((esm)this.d).a(), (wqt)epr.u(esm.ce((esm)this.d)).a(), esm.dL((esm)this.d), (acko)eqv.hM(this.a).a());
            }
            case 91: {
                return esm.dL((esm)this.d);
            }
            case 90: {
                return esm.dL((esm)this.d);
            }
            case 89: {
                return esm.dL((esm)this.d);
            }
            case 88: {
                return woh.d((Context)esm.op((esm)this.d).a());
            }
            case 87: {
                return new wsi((bu)esm.pz((esm)this.d).a(), (vax)esm.oN((esm)this.d).a(), (wok)eqx.bV(eqv.q(this.a)).a());
            }
            case 86: {
                return wgv.u((Activity)esm.op((esm)this.d).a(), (vax)esm.oN((esm)this.d).a(), (wsi)epr.F(esm.ce((esm)this.d)).a(), (aeby)esm.kL((esm)this.d).a(), (aeby)esm.sT((esm)this.d).a());
            }
            case 85: {
                return wgv.q((Activity)esm.op((esm)this.d).a(), (oas)eqv.gK(this.a).a());
            }
            case 84: {
                final esm esm = (esm)this.d;
                return vyw.j(esm.ls(esm), esm.lc(esm), esm.le(esm), esm.lu(esm), esm.iH(esm));
            }
            case 83: {
                final Context context = (Context)esm.op((esm)this.d).a();
                final esm esm2 = (esm)this.d;
                return new wbx(context, esm.qe(esm2), (vax)esm.oN(esm2).a(), (acng)eqv.kL(this.a).a(), (ttn)esm.qi((esm)this.d).a(), (vzt)eqx.bQ(eqv.q(this.a)).a());
            }
            case 82: {
                return new wbj((Context)esm.op((esm)this.d).a(), (vax)esm.oN((esm)this.d).a(), (vzv)esm.ly((esm)this.d).a());
            }
            case 81: {
                return new hzk((Context)esm.rJ((esm)this.d).a(), (vzv)esm.ly((esm)this.d).a(), (vax)esm.oN((esm)this.d).a(), (aceo)eqv.ks(this.a).a(), (acng)eqv.kL(this.a).a(), (vzq)esm.kW((esm)this.d).a(), (vzt)eqx.bQ(eqv.q(this.a)).a(), (adcr)eqx.bR(eqv.q(this.a)).a(), (vxh)esm.kP((esm)this.d).a(), (auip)eqx.bI(eqv.q(this.a)).a(), epr.at(esm.ce((esm)this.d)), (vxq)esm.qe((esm)this.d).a(), (xgc)esm.kO((esm)this.d).a(), (tny)eqv.qf(this.a).a(), (xgc)esm.gU((esm)this.d).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 80: {
                final esm esm3 = (esm)this.d;
                return hxw.e(epr.z(esm.ce(esm3)), epr.y(esm.ce(esm3)), epr.A(esm.ce(esm3)));
            }
            case 79: {
                return lik.c((vax)esm.oN((esm)this.d).a());
            }
            case 78: {
                return new sog((Context)eqv.pt(this.a).a());
            }
            case 77: {
                return sni.h((Context)eqv.pt(this.a).a(), (sog)epr.w(esm.ce((esm)this.d)).a());
            }
            case 76: {
                return lia.h((gkm)esm.oD((esm)this.d).a());
            }
            case 75: {
                return qwl.q((Context)esm.op((esm)this.d).a(), (rfv)eqv.oF(this.a).a(), (zki)eqv.pL(this.a).a(), sni.n());
            }
            case 74: {
                return eov.u((Activity)esm.op((esm)this.d).a(), (zki)eqv.pL(this.a).a(), (hyc)eqx.aS(eqv.q(this.a)).a(), (uyf)eqv.po(this.a).a(), (rjq)eqv.ix(this.a).a());
            }
            case 73: {
                return qex.u((qwk)esm.oo((esm)this.d).a(), qex.b(), (bu)esm.pz((esm)this.d).a());
            }
            case 72: {
                return qex.q((Context)eqv.pt(this.a).a());
            }
            case 71: {
                return qwl.b((bu)esm.pz((esm)this.d).a());
            }
            case 70: {
                return new acyo((SharedPreferences)eqv.sr(this.a).a(), (Handler)eqv.sL(this.a).a(), (Context)eqv.pt(this.a).a());
            }
            case 69: {
                return new acyl((Context)esm.op((esm)this.d).a(), (vax)esm.oN((esm)this.d).a());
            }
            case 68: {
                return imu.j((abno)esm.jR((esm)this.d).a(), (fjp)esm.qT((esm)this.d).a());
            }
            case 67: {
                return lig.i((fai)esm.wf((esm)this.d).a());
            }
            case 66: {
                return new iqh((Activity)esm.op((esm)this.d).a(), (ktd)esm.wf((esm)this.d).a(), (vax)esm.oN((esm)this.d).a(), (wwu)esm.ol((esm)this.d).a(), (aeby)esm.iv((esm)this.d).a(), (aeby)eqv.mC(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 65: {
                return ixa.s((ixp)esm.rH((esm)this.d).a(), (adof)eqv.iA(this.a).a(), epr.s(esm.ce((esm)this.d)));
            }
            case 64: {
                final izk t = izi.t((izu)esm.pl((esm)this.d).a(), (toa)esm.hR((esm)this.d).a(), (sjy)eqv.eG(this.a).a(), (rne)eqv.eO(this.a).a(), (zhb)eqv.uy(this.a).a(), (qbo)eqv.kZ(this.a).a(), (fjp)esm.qT((esm)this.d).a(), (wwv)esm.pX((esm)this.d).a());
                epr.ad(t);
                return t;
            }
            case 63: {
                return iwz.r((izv)esm.pq((esm)this.d).a(), (aceo)eqv.ks(this.a).a(), (vax)esm.ps((esm)this.d).a(), (toa)esm.hR((esm)this.d).a(), (sjy)eqv.eG(this.a).a(), (rne)eqv.eO(this.a).a(), (zhb)eqv.uy(this.a).a(), (qbo)eqv.kZ(this.a).a(), (vbq)eqv.kF(this.a).a(), (arud)eqv.qo(this.a).a(), (wwv)esm.pX((esm)this.d).a());
            }
            case 62: {
                return iwl.i((shc)esm.qt((esm)this.d).a(), (YouTubeInlineAdOverlay)esm.ww((esm)this.d).a(), (shb)esm.ql((esm)this.d).a(), (sky)epr.V(esm.ce((esm)this.d)).a(), (wwv)esm.pX((esm)this.d).a(), (vax)esm.ps((esm)this.d).a(), (sgv)esm.os((esm)this.d).a());
            }
            case 61: {
                return ixa.j((Context)esm.op((esm)this.d).a(), (wwv)esm.pX((esm)this.d).a(), (sbc)eqv.eS(this.a).a());
            }
            case 60: {
                return ixa.t(esm.Ad((esm)this.d), (YouTubeControlsOverlay)esm.wt((esm)this.d).a());
            }
            case 59: {
                return ixa.u(esm.Ad((esm)this.d), (aatl)esm.rY((esm)this.d).a());
            }
            case 58: {
                return new iqj((YouTubePlayerOverlaysLayout)esm.qS((esm)this.d).a(), (aapf)eqx.bz(eqv.q(this.a)).a(), (shw)eqv.ht(this.a).a(), (rvf)eqv.nN(this.a).a(), (irz)esm.mL((esm)this.d).a(), (qv)esm.nP((esm)this.d).a(), (foh)esm.nX((esm)this.d).a(), (YouTubeControlsOverlay)esm.wt((esm)this.d).a(), (iye)esm.wk((esm)this.d).a(), (aatl)esm.rY((esm)this.d).a(), (aatp)esm.rZ((esm)this.d).a(), (abad)epr.W(esm.ce((esm)this.d)).a(), (abad)epr.R(esm.ce((esm)this.d)).a(), (sky)epr.V(esm.ce((esm)this.d)).a(), (irn)esm.kN((esm)this.d).a(), (aatu)esm.rW((esm)this.d).a(), (aatv)esm.sa((esm)this.d).a(), (ktb)esm.gX((esm)this.d).a(), (ivb)esm.pG((esm)this.d).a(), (sgu)epr.H(esm.ce((esm)this.d)).a(), (abaa)esm.oR((esm)this.d).a(), (shs)esm.rF((esm)this.d).a(), (shg)esm.qv((esm)this.d).a(), (sha)epr.M(esm.ce((esm)this.d)).a(), (izk)epr.ab(esm.ce((esm)this.d)).a(), (CreatorEndscreenOverlayPresenter)esm.oU((esm)this.d).a(), (abav)esm.qy((esm)this.d).a(), (aatb)esm.pH((esm)this.d).a(), (aatk)esm.rX((esm)this.d).a(), (iro)esm.wr((esm)this.d).a(), (iss)esm.go((esm)this.d).a(), (uyf)eqv.po(this.a).a(), (abns)esm.qP((esm)this.d).a(), (aamx)eqv.fu(this.a).a(), (tpw)esm.sj((esm)this.d).a(), (MdxOverlaysPresenter)esm.mj((esm)this.d).a(), (SuggestedActionsMainController)esm.ui((esm)this.d).a(), (avt)eqv.ow(this.a).a(), epr.a(esm.ce((esm)this.d)), (iwy)esm.nR((esm)this.d).a(), (eg)epr.T(esm.ce((esm)this.d)).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 57: {
                final esm esm4 = (esm)this.d;
                return liw.o(esm.ie(esm4), esm.mR(esm4));
            }
            case 56: {
                return how.c((fjp)esm.qT((esm)this.d).a(), (hqa)esm.sW((esm)this.d).a());
            }
            case 55: {
                return hlu.v((Activity)esm.op((esm)this.d).a(), (vax)esm.oN((esm)this.d).a(), (tny)eqv.qf(this.a).a(), esm.qc((esm)this.d), (aeby)eqv.mC(this.a).a());
            }
            case 54: {
                return fqj.j((bu)esm.pz((esm)this.d).a(), (abno)esm.jS((esm)this.d).a(), (ish)esm.jV((esm)this.d).a(), (abbp)esm.rA((esm)this.d).a());
            }
            case 53: {
                return vyw.p((Context)esm.op((esm)this.d).a(), (wwu)esm.ol((esm)this.d).a(), (vax)esm.oN((esm)this.d).a(), (actc)esm.uv((esm)this.d).a(), (aceo)eqv.ks(this.a).a());
            }
            case 52: {
                return vyw.i((Context)esm.op((esm)this.d).a(), (wwu)esm.ol((esm)this.d).a(), (vax)esm.oN((esm)this.d).a(), (acng)eqv.kL(this.a).a(), (aceo)eqv.ks(this.a).a());
            }
            case 51: {
                return vyw.h((Context)esm.op((esm)this.d).a(), (wwu)esm.ol((esm)this.d).a(), (vax)esm.oN((esm)this.d).a(), (aceo)eqv.ks(this.a).a());
            }
            case 50: {
                return vyw.s((Context)esm.uk((esm)this.d).a(), (aceo)eqv.ks(this.a).a(), (vax)esm.oN((esm)this.d).a(), (acng)eqv.kL(this.a).a(), (auip)eqx.bI(eqv.q(this.a)).a(), (zvt)eqx.bP(eqv.q(this.a)).a(), (xgc)esm.lb((esm)this.d).a());
            }
            case 49: {
                final esm esm5 = (esm)this.d;
                final atjj b2 = epr.B(esm.ce(esm5));
                final atjj lc = esm.lc(esm5);
                final atjj lf = esm.lf(esm5);
                final atjj ls = esm.ls(esm5);
                final atjj c = epr.C(esm.ce(esm5));
                final atjj e = epr.E(esm.ce(esm5));
                final atjj d = epr.D(esm.ce(esm5));
                final atjj lh = esm.lh(esm5);
                final atjj lc2 = esm.lC(esm5);
                final auip ap = esm.Ap(esm5);
                final esm esm6 = (esm)this.d;
                return vyw.u(b2, lc, lf, ls, c, e, d, lh, lc2, ap, esm.lu(esm6), esm.le(esm6), esm.kV(esm6), esm.iH(esm6));
            }
            case 48: {
                return hkl.n();
            }
            case 47: {
                return new hyr((byte[])null, (byte[])null);
            }
            case 46: {
                return new ReelPlaybackErrorLogger((abno)esm.jS((esm)this.d).a(), (wvu)eqv.th(this.a).a(), (yls)eqv.rd(this.a).a(), (abns)eqv.sa(this.a).a());
            }
            case 45: {
                return new hyr((byte[])null, (byte[])null, (byte[])null);
            }
            case 44: {
                return hlu.r();
            }
            case 43: {
                return hjq.o((wyo)eqv.hU(this.a).a());
            }
            case 42: {
                final esm esm7 = (esm)this.d;
                final atjj op = esm.op(esm7);
                final atjj st = esm.sT(esm7);
                final atjj pc = esm.pc(esm7);
                final atjj on = esm.oN(esm7);
                final eqv a = this.a;
                return new zyj(op, st, pc, on, eqv.th(a), eqv.ty(a));
            }
            case 41: {
                return ugi.c((Context)eqv.pt(this.a).a());
            }
            case 40: {
                return ugi.k(epr.k(esm.ce((esm)this.d)), epr.m(esm.ce((esm)this.d)), (Executor)eqv.fX(this.a).a(), (Executor)eqv.oO(this.a).a());
            }
            case 39: {
                final zki zki = (zki)eqv.pL(this.a).a();
                final bu bu = (bu)esm.pz((esm)this.d).a();
                final vkv vkv = (vkv)eqv.ex(this.a).a();
                final rkw rkw = (rkw)eqv.wi(this.a).a();
                final rjq rjq = (rjq)eqv.ix(this.a).a();
                final tdz tdz = (tdz)eqv.jp(this.a).a();
                final addp addp = (addp)eqx.bx(eqv.q(this.a)).a();
                final gbg gbg = (gbg)esm.hS((esm)this.d).a();
                final Executor executor = (Executor)eqv.fX(this.a).a();
                final zed zed = (zed)esm.ib((esm)this.d).a();
                final thh thh = (thh)eqv.id(this.a).a();
                return eov.o(bu);
            }
            case 38: {
                return aele.m((Activity)esm.op((esm)this.d).a(), (Set)afdu.r());
            }
            case 37: {
                return zpn.r(eqv.mQ(this.a));
            }
            case 36: {
                return zpn.s(epr.G(esm.ce((esm)this.d)));
            }
            case 35: {
                return ugi.d((Context)eqv.pt(this.a).a(), (Executor)eqv.fx(this.a).a(), (aeke)eqv.qD(this.a).a());
            }
            case 34: {
                return tzb.d();
            }
            case 33: {
                return lia.f((gkm)esm.oD((esm)this.d).a());
            }
            case 32: {
                return gtq.i(esm.dK((esm)this.d));
            }
            case 31: {
                return hsz.r(esm.cp((esm)this.d));
            }
            case 30: {
                return riz.j((Activity)esm.op((esm)this.d).a());
            }
            case 29: {
                return wgv.g(esm.dK((esm)this.d));
            }
            case 28: {
                return rmc.b((Activity)esm.op((esm)this.d).a(), epr.r(esm.ce((esm)this.d)));
            }
            case 27: {
                return qtu.d();
            }
            case 26: {
                return qtu.c();
            }
            case 25: {
                return qtu.e();
            }
            case 24: {
                return qtu.g();
            }
            case 23: {
                return qtu.p();
            }
            case 22: {
                return qtu.n();
            }
            case 21: {
                return qtu.m();
            }
            case 20: {
                return qtu.l((alm)epr.U(esm.ce((esm)this.d)).a());
            }
            case 19: {
                return qex.p(eqx.ei(eqv.q(this.a)));
            }
            case 18: {
                final bu bu2 = (bu)esm.pz((esm)this.d).a();
                final tzs ag = epr.ag(esm.ce((esm)this.d));
                final phq phq = (phq)eqx.as(eqv.q(this.a)).a();
                final tdg ar = epr.ar(esm.ce((esm)this.d));
                final rfj rfj = (rfj)epr.I(esm.ce((esm)this.d)).a();
                final rgc rgc = (rgc)epr.J(esm.ce((esm)this.d)).a();
                final qea qea = (qea)epr.P(esm.ce((esm)this.d)).a();
                final esm esm8 = (esm)this.d;
                return qwl.t(bu2, ag, phq, ar, epr.S(esm.ce(esm8)), epr.Q(esm.ce(esm8)));
            }
            case 17: {
                return qtu.k((qss)esm.qz((esm)this.d).a(), (aeyn)eqx.ei(eqv.q(this.a)).a(), (aeyn)eqx.ei(eqv.q(this.a)).a());
            }
            case 16: {
                return qex.o((Activity)esm.op((esm)this.d).a(), esm.xW((esm)this.d));
            }
            case 15: {
                return qex.d((Activity)esm.op((esm)this.d).a(), (aexq)epr.N(esm.ce((esm)this.d)).a());
            }
            case 14: {
                return qex.j();
            }
            case 13: {
                return qtu.q(epr.ai(esm.ce((esm)this.d)));
            }
            case 12: {
                return qtu.f(epr.g(esm.ce((esm)this.d)));
            }
            case 11: {
                return qtu.s(epr.ao(esm.ce((esm)this.d)));
            }
            case 10: {
                return qtu.u(epr.as(esm.ce((esm)this.d)));
            }
            case 9: {
                return qtu.t(epr.ao(esm.ce((esm)this.d)), epr.f(esm.ce((esm)this.d)), epr.ai(esm.ce((esm)this.d)), (qwk)esm.oo((esm)this.d).a());
            }
            case 8: {
                return qtu.r(epr.ae(esm.ce((esm)this.d)), (aftr)eqv.oO(this.a).a(), epr.ak(esm.ce((esm)this.d)), (aeyn)eqx.ei(eqv.q(this.a)).a());
            }
            case 7: {
                return qex.n((qsh)epr.t(esm.ce((esm)this.d)).a(), (aftr)eqv.oO(this.a).a(), (agor)epr.K(esm.ce((esm)this.d)).a());
            }
            case 6: {
                return qex.f((agrc)esm.oP((esm)this.d).a());
            }
            case 5: {
                return qex.g((Context)eqv.pt(this.a).a(), (artt)esm.qk((esm)this.d).a(), (aftr)eqv.oO(this.a).a(), (Account)esm.of((esm)this.d).a());
            }
            case 4: {
                return qex.e((qsi)epr.L(esm.ce((esm)this.d)).a(), (aftr)eqv.oO(this.a).a());
            }
            case 3: {
                return qex.t((qsh)epr.t(esm.ce((esm)this.d)).a(), (aftr)eqv.oO(this.a).a(), (agor)epr.K(esm.ce((esm)this.d)).a());
            }
            case 2: {
                return qex.i((bu)esm.pz((esm)this.d).a(), epr.e(esm.ce((esm)this.d)));
            }
            case 1: {
                return qtu.b(epr.f(esm.ce((esm)this.d)));
            }
            case 0: {
                return qex.m((bu)esm.pz((esm)this.d).a(), epr.c(esm.ce((esm)this.d)));
            }
        }
    }
    
    @Override
    public final Object a() {
        if (this.c != 0) {
            final int b = this.b;
            Object b2 = null;
            if (b / 100 != 0) {
                switch (b) {
                    default: {
                        throw new AssertionError(b);
                    }
                    case 104: {
                        b2 = new laa((mrm)((esm)this.d).by.a(), (lfh)((esm)this.d).bW.a(), (a)((esm)this.d).a.ap.a(), (a)((esm)this.d).as.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                        break;
                    }
                    case 103: {
                        b2 = new a((jaz)((esm)this.d).bX.a());
                        break;
                    }
                    case 102: {
                        b2 = new kzy((mrm)((esm)this.d).by.a(), (a)((esm)this.d).a.ap.a(), (a)((esm)this.d).as.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                        break;
                    }
                    case 101: {
                        b2 = new blt((uyi)((esm)this.d).ab.a(), (cxz)((esm)this.d).cB.a(), (mrm)((esm)this.d).m.a(), (a)((esm)this.d).as.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                        break;
                    }
                    case 100: {
                        b2 = new lbz((iqi)((esm)this.d).v.a(), (fjp)((esm)this.d).z.a(), (aazh)this.a.a.cx.a(), (asho)this.a.dO.a(), (abns)((esm)this.d).j.a(), (arud)this.a.v.a(), (Context)((esm)this.d).d.a(), (byte[])null, (byte[])null);
                        break;
                    }
                }
            }
            else {
                b2 = this.b();
            }
            return b2;
        }
        final int b3 = this.b;
        Object o;
        if (b3 != 0) {
            if (b3 != 1) {
                if (b3 != 2) {
                    final oas oas = (oas)this.a.e.a();
                    final Object a = this.a.aH.a();
                    final afts afts = (afts)this.a.f.a();
                    final aelt aelt = (aelt)a;
                    o = new SubscriptionMixinViewModel((Executor)afts);
                }
                else {
                    o = new LocalMediaGreenScreenControllerViewModel();
                }
            }
            else {
                o = new FuturesMixinViewModel(((esw)this.d).a, (Context)this.a.c.a(), (Executor)this.a.f.a());
            }
        }
        else {
            o = new FrameSelectorVideoViewModel((asho)this.a.dO.a());
        }
        return o;
    }
}
