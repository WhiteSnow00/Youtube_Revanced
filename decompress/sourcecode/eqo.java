import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import java.util.concurrent.Executor;
import com.google.protos.youtube.api.innertube.LiveChatAction$ClearChatWindowAction;
import com.google.protos.youtube.api.innertube.UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand;
import com.google.android.apps.youtube.embeddedplayer.service.permissions.b;
import java.util.Set;
import j$.util.Optional;
import java.util.Map;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import android.content.SharedPreferences;
import android.content.Context;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eqo implements atjj
{
    public final eqv a;
    public final esq b;
    private final int c;
    
    public eqo(final eqv a, final esq b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Object a() {
        final int c = this.c;
        final Boolean value = true;
        switch (c) {
            default: {
                final aeru aeru = (aeru)this.a.gU.a();
                final afcm d = afcr.d();
                d.h((Object)new arwh(1));
                final afcr g = d.g();
                g.getClass();
                return g;
            }
            case 59: {
                final eqv a = this.a;
                final Object a2 = a.qg.a;
                final lkn lkn = (lkn)a.a.eg.a();
                final c c2 = (c)this.b.ah.a();
                final Handler handler = (Handler)this.a.G.a();
                final esq b = this.b;
                return new aeer((Context)a2, lkn, c2, handler, new uyi((uyf)b.b.w.a(), (arud)b.b.v.a(), (byte[])null, (byte[])null), null, null, null);
            }
            case 58: {
                return new c();
            }
            case 57: {
                return ugi.g();
            }
            case 56: {
                return ugi.f();
            }
            case 55: {
                return ugi.h(arjc.b(this.b.ae), arjc.b(this.b.af), (Context)this.a.c.a());
            }
            case 54: {
                final wkk h = wkk.h((Context)this.a.c.a(), (SharedPreferences)this.a.d.a());
                h.getClass();
                return h;
            }
            case 53: {
                return vny.f((Context)this.a.c.a(), (zjy)this.a.gv.a());
            }
            case 52: {
                final Context context = (Context)this.a.c.a();
                final wwv wwv = (wwv)this.a.iG.a();
                final esq b2 = this.b;
                final eqv b3 = b2.b;
                final atjj ac = b3.aC;
                final eqx a3 = b3.a;
                final atjj dn = a3.dn;
                final atjj do1 = a3.do;
                final atjj dp = a3.dp;
                final atjj ab = b2.ab;
                final atjj dq = a3.dq;
                final atjj dr = a3.dr;
                final atjj ds = a3.ds;
                final atjj dt = a3.dt;
                final atjj du = a3.du;
                final atjj q = a3.Q;
                final atjj dv = a3.dv;
                final atjj dw = a3.dw;
                final atjj dx = a3.dx;
                final atjj m = a3.M;
                final atjj g2 = b3.G;
                final atjj g3 = b3.g;
                final atjj r = b3.r;
                final atjj e = b3.e;
                ac.getClass();
                ab.getClass();
                q.getClass();
                m.getClass();
                g2.getClass();
                g3.getClass();
                r.getClass();
                e.getClass();
                return xkm.aX(context, wwv, ac, dn, do1, dp, ab, dq, dr, ds, dt, du, q, dv, dw, dx, m, g2, g3, r, e);
            }
            case 51: {
                return new xgc("LiveRenderThread");
            }
            case 50: {
                final xkm xkm = (xkm)this.a.a.eA.a();
                final Context context2 = (Context)this.a.c.a();
                final tgw tgw = (tgw)this.a.dC.a();
                final adcr adcr = (adcr)this.a.a.dK.a();
                final xgc xgc = (xgc)this.b.Z.a();
                final ScreencastHostService c3 = wgv.c(this.b.a);
                final xkm xkm2 = (xkm)this.a.a.dL.a();
                final oas oas = (oas)this.a.e.a();
                final acko acko = (acko)this.a.et.a();
                oas.getClass();
                acko.getClass();
                gpd.i().h();
                return gpd.i().j(xkm, adcr.bh(), context2, oas, tgw, adcr, xgc, (wfw)c3, false, acko);
            }
            case 49: {
                final eqv a4 = this.a;
                return new xgc(a4.c, a4.a.dx, (byte[])null, (byte[])null);
            }
            case 48: {
                return new wft((Context)this.a.c.a());
            }
            case 47: {
                return wgv.c(this.b.a);
            }
            case 46: {
                return new wgi((Context)this.a.c.a());
            }
            case 45: {
                return new wsa((Context)this.a.c.a(), (aceo)this.a.jh.a());
            }
            case 44: {
                return new wse((Context)this.a.c.a(), (aceo)this.a.jh.a(), (acng)this.a.jH.a(), (vax)this.b.s.a(), (zki)this.a.aC.a(), (auip)this.a.a.cH.a(), (zvt)this.a.a.cF.a(), (xgc)this.b.R.a(), ttn.a(2132084546), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 43: {
                final Context context3 = (Context)this.a.c.a();
                return new xgc((arud)this.a.v.a(), (uyf)this.a.w.a(), (byte[])null, (byte[])null);
            }
            case 42: {
                return ops.g(aexq.k(this.a.cJ.a()), aexq.k(arjc.b(this.a.cK)), aexq.k(this.a.cs.a()), aexq.k(this.a.cM.a()), this.b.f(), this.b.C, aexq.k(this.a.cQ.a()), aexq.k(this.a.c()));
            }
            case 41: {
                return okq.g();
            }
            case 40: {
                return okq.m(this.a.qf, (otd)this.b.B.a(), aexq.k(this.a.a.gt()), (Context)this.a.c.a());
            }
            case 39: {
                return okq.n(this.a.qf, this.b.K);
            }
            case 38: {
                return okq.o(this.a.qf, (Map)afcw.m((Object)IntersectionObserver.class, (Object)this.b.L));
            }
            case 37: {
                return ose.a;
            }
            case 36: {
                return new mck((otd)this.b.B.a());
            }
            case 35: {
                return onk.b((otd)this.b.B.a());
            }
            case 34: {
                return okq.k(Optional.of((Object)this.a.a.gl()), this.a.bq, (opa)this.b.F.a(), Optional.empty());
            }
            case 33: {
                return ops.e(aexq.k(this.a.cM.a()), this.b.D);
            }
            case 32: {
                return ops.b(aexq.k(this.a.cM.a()), (Context)this.a.c.a(), this.b.C, (aexq)this.a.cO.a());
            }
            case 31: {
                return ops.d(aexq.k(this.a.cM.a()), this.b.f(), this.b.D, (Context)this.a.c.a());
            }
            case 30: {
                return ops.m((aexq)aewp.a, aexq.k(this.a.cM.a()), arjc.b(this.a.a.h));
            }
            case 29: {
                return new vwq(ops.k(aexq.k(this.b.b.cL.a())), this.a.cO, arjc.b(this.b.z), 1);
            }
            case 28: {
                final Map h2 = this.b.h();
                final afgq a5 = afgq.a;
                final otd otd = (otd)this.b.B.a();
                Optional.of((Object)this.a.a.ah.a());
                final Optional of = Optional.of((Object)this.a.a.gi());
                final Optional of2 = Optional.of((Object)this.a.a.ai.a());
                final asho e2 = this.b.e();
                final atjj a6 = this.b.A;
                final Optional of3 = Optional.of((Object)this.a.a.c());
                final phq l = this.b.l();
                final esq b4 = this.b;
                return oaw.Z(h2, (Set)a5, otd, of, of2, e2, a6, of3, l, b4.E, b4.C);
            }
            case 27: {
                return okq.t((opa)this.b.F.a(), (Optional)this.b.G.a(), Optional.of((Object)this.a.a.ah.a()), this.b.H.a(), this.b.l());
            }
            case 26: {
                return onk.h(oog.b(this.b.i()), oog.a(this.b.i()), this.b.g(), (otd)this.b.B.a(), aexq.k(this.a.a.am.a()), aexq.k(this.a.a.ah.a()));
            }
            case 25: {
                final esq b5 = this.b;
                final afct i = afcw.i(9);
                i.g((Object)arhp.class, (Object)okq.f((otm)b5.J.a(), (ort)b5.z.a(), b5.c(), (otd)b5.B.a(), esq.k(), b5.b(), b5.j(), aexq.k(b5.b.a.k()), aexq.k(b5.b.a.gm()), aexq.k(b5.b.a.gn()), aexq.k(b5.b.a.go())));
                i.g((Object)argw.class, (Object)nzj.t((otm)b5.J.a()));
                i.g((Object)arhc.class, (Object)nzj.u((otm)b5.J.a()));
                i.g((Object)arhm.class, (Object)nzj.v((otm)b5.J.a(), (ort)b5.z.a(), (otd)b5.B.a()));
                i.g((Object)arhe.class, (Object)okq.e((otm)b5.J.a(), (ort)b5.z.a(), b5.c(), (otd)b5.B.a(), esq.k(), b5.b()));
                i.g((Object)argy.class, (Object)ohw.v((otm)b5.J.a(), (ort)b5.z.a(), b5.a(), b5.M, (otd)b5.B.a(), (mck)b5.I.a(), okq.u(b5.N, (otd)b5.B.a(), (Object)okq.s(b5.I), (ort)b5.z.a(), aexq.k(b5.b.bq)), (Set)afgq.a));
                i.g((Object)arhd.class, (Object)okq.d((otm)b5.J.a(), (ort)b5.z.a(), b5.c(), (otd)b5.B.a(), b5.j(), aexq.k(b5.b.a.k()), aexq.k(b5.b.a.gk()), esq.k()));
                final opi p = onk.p((Context)b5.b.c.a(), aexq.k(b5.b.cz.a()), aexq.k(b5.b.cM.a()), aexq.k(b5.b.cs.a()), b5.O, b5.C, b5.E);
                final osb osb = (osb)b5.b.fO.a();
                final aexq k = aexq.k(b5.b.bq);
                final otd otd2 = (otd)b5.B.a();
                final oub c4 = ops.c((aexq)aewp.a);
                final arhr b6 = arjc.b(b5.O);
                final adbl adbl = (adbl)b5.b.a.d.a();
                final atjj c5 = b5.C;
                final osc osc = (osc)b5.E.a();
                final aexq j = aexq.k(b5.b.cs.a());
                final aewp a7 = aewp.a;
                final int a8 = acbg.a;
                final ojm p2 = ohw.p((oui)p, osb, k, otd2, c4, b6, adbl, c5, osc, j, (aexq)a7, aexq.k(value), aexq.k(value), aexq.k(b5.b.cQ.a()), aexq.k(b5.b.c()), aexq.k(b5.b.a.ad.a()), aexq.k(b5.b.a.gq()), (aexq)aewp.a, aexq.k(b5.b.a.ae), aexq.k(b5.b.a.gy()), aexq.k(b5.b.a.gv()), aexq.k(b5.b.a.gu()), aexq.k(b5.b.a.gj()));
                final otm otm = (otm)b5.J.a();
                final ort ort = (ort)b5.z.a();
                b5.c();
                final otd otd3 = (otd)b5.B.a();
                i.g((Object)arhb.class, (Object)okq.c(p2, otm));
                i.g((Object)arhh.class, (Object)ops.i((otm)b5.J.a(), aexq.k(b5.b.ic.a()), (otd)b5.B.a(), (ort)b5.z.a(), (otl)okq.i((Map)afcw.m((Object)argv.class, (Object)okq.h((Context)b5.b.c.a(), (otd)b5.B.a())), (Map)afgm.b, (otd)b5.B.a()), aexq.k(b5.b.a.gp()), aexq.k(b5.b.a.a()), aexq.k(b5.b.a.go())));
                return com.google.android.apps.youtube.embeddedplayer.service.permissions.b.l((Map)i.c(), (Map)afgm.b, (Set)afgq.a, (otd)this.b.B.a(), aexq.k(this.a.cM.a()), aexq.k(value), aexq.k(this.a.a.gs()), aexq.k(this.a.a.gz()));
            }
            case 24: {
                return new olq((osu)this.b.P.a());
            }
            case 23: {
                return new xgc((vax)this.b.s.a(), this.b.d());
            }
            case 22: {
                return new vyf();
            }
            case 21: {
                return new vyh();
            }
            case 20: {
                return vwo.c((vax)this.b.s.a());
            }
            case 19: {
                return vwo.b();
            }
            case 18: {
                return new fdw(9);
            }
            case 17: {
                final vzm a9 = vzn.a;
                return vyw.c();
            }
            case 16: {
                final esq b7 = this.b;
                final atjj q2 = b7.q;
                final atjj r2 = b7.r;
                final afcw o = afcw.o((Object)UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand.class, (Object)q2, (Object)LiveChatAction$ClearChatWindowAction.class, (Object)r2, (Object)ansj.class, (Object)r2);
                final vax vax = (vax)this.a.is.a();
                final vwb g4 = vas.g();
                g4.h((Map)o);
                g4.j(vax);
                return g4.g();
            }
            case 15: {
                return vwo.d((vax)this.b.s.a(), (vwz)this.b.t.a());
            }
            case 14: {
                return new adcr((arud)this.a.v.a(), null, null);
            }
            case 13: {
                return new uyi((uyf)this.a.w.a(), (arud)this.a.v.a(), (byte[])null, (byte[])null);
            }
            case 12: {
                final Context context4 = (Context)this.a.c.a();
                final Executor executor = (Executor)this.a.E.a();
                final zjr zjr = (zjr)this.a.nt.a();
                final osb osb2 = (osb)this.a.fO.a();
                return abvs.h(executor, Optional.of((Object)this.a.cz.a()), (aeby)this.a.ji.a());
            }
            case 11: {
                final Context context5 = (Context)this.a.c.a();
                return new vxt((Handler)this.a.G.a());
            }
            case 10: {
                return new vxi((Handler)this.a.G.a(), (vbq)this.a.bp.a());
            }
            case 9: {
                final esq b8 = this.b;
                final Context context6 = (Context)this.a.c.a();
                final tny tny = (tny)this.a.it.a();
                final wwv wwv2 = (wwv)this.a.iG.a();
                final acng acng = (acng)this.a.jH.a();
                final aceo aceo = (aceo)this.a.jh.a();
                final esq b9 = this.b;
                final eqv b10 = b9.b;
                final atjj c6 = b10.c;
                final eqx a10 = b10.a;
                final vxq a11 = new vxr(c6, a10.cC, a10.cD, b10.jJ, b10.h, b10.ev, b10.it, b10.G, a10.cE, a10.cF, b9.l, b9.m, b9.n, b10.bp, b9.o, b9.p, b9.u, b9.v, b9.w, b9.x, b10.dO).a((xgc)b9.y.a(), (wwv)b9.b.iG.a(), b9.d());
                final auip auip = (auip)this.a.a.cH.a();
                final olq olq = (olq)this.b.Q.a();
                final otd otd4 = (otd)this.b.B.a();
                final acbo acbo = (acbo)this.a.cv.a();
                final uyi uyi = (uyi)this.a.cF.a();
                final osx osx = (osx)this.a.a.aE.a();
                final esq b11 = this.b;
                final wnl wnl = new wnl(context6, tny, wwv2, acng, aceo, a11, auip, olq, acbo, uyi, osx, b11.M, (xgc)b11.R.a(), (adcr)this.b.p.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                wnl.a = b8.S;
                wnl.b = b8.T;
                return wnl;
            }
            case 8: {
                return hbm.k((adia)this.a.lk.a(), (Executor)this.a.r.a());
            }
            case 7: {
                return new epy(this, 2);
            }
            case 6: {
                return new epz(this, 2);
            }
            case 5: {
                return new qpt(this);
            }
            case 4: {
                return gwi.c((wyo)this.a.cB.a(), (thh)this.a.P.a());
            }
            case 3: {
                final esq b12 = this.b;
                final Context context7 = (Context)b12.b.c.a();
                final tgw tgw2 = (tgw)b12.b.dC.a();
                final auip auip2 = (auip)b12.b.a.aq.a();
                final uos t = ugi.t(context7, tgw2, b12.m(), b12.b.a.r());
                final esq b13 = this.b;
                final uoe s = ugi.s((Context)b13.b.c.a(), (tgw)b13.b.dC.a(), b13.m(), (ujx)b13.b.Q.a());
                final auip auip3 = (auip)this.a.a.aq.a();
                final esq b14 = this.b;
                return new tze(t, s, auip3, trl.k(vny.d((Context)b14.b.c.a(), (zjy)b14.b.gv.a()), (zki)b14.b.aC.a(), (Executor)b14.b.r.a()), (tyr)null, (typ)null, (tyw)null, (auip)null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 2: {
                return new qpt(this);
            }
            case 1: {
                return new aaal((tdg)this.a.ln.a(), this.a.xF(), (tal)this.a.bV.a(), (adcr)this.a.cP(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 0: {
                final zki zki = (zki)this.a.aC.a();
                final zqx zqx = (zqx)this.a.jK.a();
                final zpm zpm = (zpm)this.a.eB.a();
                final zkw zkw = (zkw)this.a.py.a();
                final aaal aaal = (aaal)this.b.c.a();
                final acng acng2 = (acng)this.a.jH.a();
                final eqv a12 = this.a;
                final atjj ew = a12.ew;
                final arud arud = (arud)a12.v.a();
                final zpf zpf = (zpf)this.a.jL.a();
                final fkv fkv = (fkv)this.a.eC.a();
                return new lfy(zki, zqx, zpm, zkw, aaal, acng2, ew, arud, zpf, (byte[])null, (byte[])null, (byte[])null);
            }
        }
    }
}
