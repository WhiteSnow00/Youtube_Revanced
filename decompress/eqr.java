import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import java.util.concurrent.Executor;
import java.util.Set;
import j$.util.Optional;
import java.util.Map;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import android.content.SharedPreferences;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eqr implements atke
{
    public final eqy a;
    public final est b;
    private final int c;
    
    public eqr(final eqy a, final est b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a() {
        final int c = this.c;
        final Boolean value = true;
        switch (c) {
            default: {
                final eqy a = this.a;
                return new aegs((Context)a.qg.a, (llp)a.a.eg.a(), (c)this.b.W.a(), (Handler)this.a.G.a(), this.b.p(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 58: {
                return new c();
            }
            case 57: {
                return ufa.l();
            }
            case 56: {
                return ufa.k();
            }
            case 55: {
                return ufa.m(arlr.b(this.b.T), arlr.b(this.b.U), (Context)this.a.c.a());
            }
            case 54: {
                final wmm h = wmm.h((Context)this.a.c.a(), (SharedPreferences)this.a.d.a());
                h.getClass();
                return h;
            }
            case 53: {
                return vkh.f((Context)this.a.c.a(), (zlv)this.a.gy.a());
            }
            case 52: {
                final Context context = (Context)this.a.c.a();
                final wyw wyw = (wyw)this.a.iK.a();
                final est b = this.b;
                final eqy b2 = b.b;
                final atke ac = b2.aC;
                final era a2 = b2.a;
                return new wmf(ac, a2.do, a2.dp, a2.dq, b.Q, a2.dr, a2.ds, a2.dt, a2.du, a2.dv, a2.Q, a2.dw, a2.dx, a2.dy, a2.M, b2.G, b2.g, b2.r, b2.e).a(context, wyw);
            }
            case 51: {
                return new xib("LiveRenderThread");
            }
            case 50: {
                final xmm xmm = (xmm)this.a.a.eA.a();
                final Context context2 = (Context)this.a.c.a();
                final tjb tjb = (tjb)this.a.dD.a();
                final xib xib = (xib)this.a.a.dK.a();
                final xib xib2 = (xib)this.b.O.a();
                final ScreencastHostService c2 = wji.c(this.b.a);
                final xmm xmm2 = (xmm)this.a.a.dL.a();
                final oby oby = (oby)this.a.e.a();
                final acmr acmr = (acmr)this.a.ev.a();
                oby.getClass();
                acmr.getClass();
                gpj.i().h();
                return gpj.i().j(xmm, xib.B(), context2, oby, tjb, xib, xib2, (whx)c2, false, acmr);
            }
            case 49: {
                final eqy a3 = this.a;
                return new xib(a3.c, a3.a.dy, (byte[])null, (byte[])null);
            }
            case 48: {
                return new whu((Context)this.a.c.a());
            }
            case 47: {
                return wji.c(this.b.a);
            }
            case 46: {
                return new wii((Context)this.a.c.a());
            }
            case 45: {
                return new wua((Context)this.a.c.a(), (acgs)this.a.jl.a());
            }
            case 44: {
                return new wue((Context)this.a.c.a(), (acgs)this.a.jl.a(), (acpk)this.a.jL.a(), (vcy)this.b.m.a(), (zmf)this.a.aC.a(), (aujg)this.a.a.cI.a(), (zxn)this.a.a.cG.a(), (xib)this.b.G.a(), tvr.a(2132084547), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 43: {
                final Context context3 = (Context)this.a.c.a();
                return new xib((arwh)this.a.v.a(), (vaf)this.a.w.a(), (byte[])null, (byte[])null);
            }
            case 42: {
                return oqc.j(aezp.k((Object)this.a.cJ.a()), aezp.k((Object)arlr.b(this.a.cK)), aezp.k((Object)this.a.cs.a()), aezp.k((Object)this.a.cM.a()), this.b.j(), this.b.r, aezp.k((Object)this.a.cQ.a()), aezp.k((Object)this.a.c()));
            }
            case 41: {
                return ojw.j();
            }
            case 40: {
                return ojw.r(this.a.qh, (oum)this.b.q.a(), aezp.k((Object)this.a.a.gq()), (Context)this.a.c.a());
            }
            case 39: {
                return ojw.s(this.a.qh, this.b.z);
            }
            case 38: {
                return ooi.v(this.a.qh, (Map)afev.m(IntersectionObserver.class, this.b.A));
            }
            case 37: {
                return otn.a;
            }
            case 36: {
                return new mdp((oum)this.b.q.a());
            }
            case 35: {
                return ooi.d((oum)this.b.q.a());
            }
            case 34: {
                final Optional of = Optional.of((Object)this.a.a.gi());
                final atke bq = this.a.bq;
                final oqh oqh = (oqh)this.b.u.a();
                final Optional empty = Optional.empty();
                final est b3 = this.b;
                return ooi.c(of, bq, oqh, empty, b3.t, b3.r);
            }
            case 33: {
                return oqc.h(aezp.k((Object)this.a.cM.a()), this.b.s);
            }
            case 32: {
                return oqc.f(aezp.k((Object)this.a.cM.a()), (Context)this.a.c.a(), this.b.r, (aezp)this.a.cO.a());
            }
            case 31: {
                return oqc.g(aezp.k((Object)this.a.cM.a()), this.b.j(), this.b.s, (Context)this.a.c.a());
            }
            case 30: {
                return oqc.p((aezp)aeyo.a, aezp.k((Object)this.a.cM.a()), arlr.b(this.a.a.h));
            }
            case 29: {
                return new vyo(this.b.c(), this.a.cO, arlr.b(this.b.o), 1);
            }
            case 28: {
                final est b4 = this.b;
                final afes i = afev.i(13);
                i.g(aqhd.class, new ojb((otk)b4.b.fR.a(), 19));
                i.g(aqgr.class, new ftg(arlr.b(b4.o), b4.i(), 7));
                i.g(aqgs.class, ooi.o(arlr.b(b4.o), aezp.k((Object)b4.b.a.go()), b4.i()));
                i.g(aqhc.class, oqc.u(arlr.b(b4.o)));
                i.g(aqfm.class, ooi.q(arlr.b(b4.o), b4.i()));
                i.g(aqhm.class, new oqe((otk)b4.b.fR.a(), aezp.k((Object)b4.b.cQ.a()), 0));
                i.g(aqft.class, new opz((otk)b4.b.fR.a(), arlr.b(b4.o), aezp.k((Object)b4.b.cQ.a()), 1));
                i.g(aqhi.class, new oqe((otk)b4.b.fR.a(), aezp.k((Object)b4.b.cQ.a()), 1, (byte[])null));
                i.g(aqhb.class, oqc.b());
                i.g(aqeo.class, b4.a());
                i.g(aqfz.class, b4.p.a());
                i.g(aqgt.class, oqc.t(oqc.q(), arlr.b(b4.o)));
                i.g(amuh.class, b4.b.a.gO());
                final afev c3 = i.c();
                final afiq a4 = afiq.a;
                final oum oum = (oum)this.b.q.a();
                Optional.of((Object)this.a.a.ah.a());
                final Optional of2 = Optional.of((Object)this.a.a.gf());
                final Optional of3 = Optional.of((Object)this.a.a.ai.a());
                final asid j = this.b.i();
                final atke p = this.b.p;
                final Optional of4 = Optional.of((Object)this.a.a.c());
                final pja q = this.b.q();
                final est b5 = this.b;
                return ohg.P((Map)c3, (Set)a4, oum, of2, of3, j, p, of4, q, b5.t, b5.r);
            }
            case 27: {
                return ooi.t((oqh)this.b.u.a(), (Optional)this.b.v.a(), Optional.of((Object)this.a.a.ah.a()), this.b.w.a(), this.b.q());
            }
            case 26: {
                return ooi.j(opm.b(this.b.m()), opm.a(this.b.m()), this.b.k(), (oum)this.b.q.a(), aezp.k((Object)this.a.a.am.a()), aezp.k((Object)this.a.a.ah.a()));
            }
            case 25: {
                final est b6 = this.b;
                final afes k = afev.i(9);
                k.g(arke.class, ojw.i((ouv)b6.y.a(), (otc)b6.o.a(), b6.d(), (oum)b6.q.a(), est.o(), b6.b(), b6.n(), aezp.k((Object)b6.b.a.k()), aezp.k((Object)b6.b.a.gj()), aezp.k((Object)b6.b.a.gk()), aezp.k((Object)b6.b.a.gl())));
                k.g(arjl.class, ohg.o((ouv)b6.y.a()));
                k.g(arjr.class, ohg.p((ouv)b6.y.a()));
                k.g(arkb.class, ohg.q((ouv)b6.y.a(), (otc)b6.o.a(), (oum)b6.q.a()));
                k.g(arjt.class, ojw.h((ouv)b6.y.a(), (otc)b6.o.a(), b6.d(), (oum)b6.q.a(), est.o(), b6.b()));
                k.g(arjn.class, ojw.t((ouv)b6.y.a(), (otc)b6.o.a(), b6.a(), b6.B, (oum)b6.q.a(), (mdp)b6.x.a(), ojw.u(b6.C, (oum)b6.q.a(), (Object)ojw.q(b6.x), (otc)b6.o.a(), aezp.k((Object)b6.b.bq)), (Set)afiq.a));
                k.g(arjs.class, ojw.g((ouv)b6.y.a(), (otc)b6.o.a(), b6.d(), (oum)b6.q.a(), b6.n(), aezp.k((Object)b6.b.a.k()), aezp.k((Object)b6.b.a.gh()), est.o()));
                final oqp d = oqc.d((Context)b6.b.c.a(), aezp.k((Object)b6.b.cz.a()), aezp.k((Object)b6.b.cM.a()), aezp.k((Object)b6.b.cs.a()), b6.D, b6.r, b6.t);
                final otk otk = (otk)b6.b.fR.a();
                final aezp l = aezp.k((Object)b6.b.bq);
                final oum oum2 = (oum)b6.q.a();
                final ovk e = oqc.e((aezp)aeyo.a);
                final arkg b7 = arlr.b(b6.D);
                final addo addo = (addo)b6.b.a.d.a();
                final atke r = b6.r;
                final otl otl = (otl)b6.t.a();
                final aezp m = aezp.k((Object)b6.b.cs.a());
                final aeyo a5 = aeyo.a;
                final int a6 = acdh.a;
                final okt p2 = ojw.p((ovr)d, otk, l, oum2, e, b7, addo, r, otl, m, (aezp)a5, aezp.k((Object)value), aezp.k((Object)value), aezp.k((Object)b6.b.cQ.a()), aezp.k((Object)b6.b.c()), aezp.k((Object)b6.b.a.ad.a()), aezp.k((Object)b6.b.a.gn()), (aezp)aeyo.a, aezp.k((Object)b6.b.a.ae), aezp.k((Object)b6.b.a.gv()), aezp.k((Object)b6.b.a.gs()), aezp.k((Object)b6.b.a.gr()), aezp.k((Object)b6.b.a.gg()));
                final ouv ouv = (ouv)b6.y.a();
                final otc otc = (otc)b6.o.a();
                b6.d();
                final oum oum3 = (oum)b6.q.a();
                k.g(arjq.class, ojw.e(p2, ouv));
                k.g(arjw.class, oqc.l((ouv)b6.y.a(), aezp.k((Object)b6.b.if.a()), (oum)b6.q.a(), (otc)b6.o.a(), (ouu)ojw.l((Map)afev.m(arjk.class, ojw.k((Context)b6.b.c.a(), (oum)b6.q.a())), (Map)afim.b, (oum)b6.q.a()), aezp.k((Object)b6.b.a.gm()), aezp.k((Object)b6.b.a.a()), aezp.k((Object)b6.b.a.gl())));
                return ohv.b((Map)k.c(), (Map)afim.b, (Set)afiq.a, (oum)this.b.q.a(), aezp.k((Object)this.a.cM.a()), aezp.k((Object)value), aezp.k((Object)this.a.a.gp()), aezp.k((Object)this.a.a.gw()));
            }
            case 24: {
                return new omw((oud)this.b.E.a());
            }
            case 23: {
                return new xib((vcy)this.b.m.a(), this.b.h());
            }
            case 22: {
                return new wad();
            }
            case 21: {
                return new waf();
            }
            case 20: {
                return vvq.d((vcy)this.b.m.a());
            }
            case 19: {
                return vvq.c();
            }
            case 18: {
                return new fec(10);
            }
            case 17: {
                final wbl a7 = wbm.a;
                return wap.d();
            }
            case 16: {
                final Map l2 = this.b.l();
                final vcy vcy = (vcy)this.a.iw.a();
                final vgy g = vct.g();
                g.h(l2);
                g.j(vcy);
                return g.g();
            }
            case 15: {
                return vvq.e((vcy)this.b.m.a(), (vyx)this.b.n.a());
            }
            case 14: {
                return new aeea((arwh)this.a.v.a(), (byte[])null, (byte[])null);
            }
            case 13: {
                return new vai((vaf)this.a.w.a(), (arwh)this.a.v.a(), (byte[])null, (byte[])null);
            }
            case 12: {
                final Context context4 = (Context)this.a.c.a();
                final Executor executor = (Executor)this.a.E.a();
                final zlo zlo = (zlo)this.a.nv.a();
                final otk otk2 = (otk)this.a.fR.a();
                return abzn.n(executor, Optional.of((Object)this.a.cz.a()), (aeea)this.a.jm.a());
            }
            case 11: {
                final Context context5 = (Context)this.a.c.a();
                return new vzr((Handler)this.a.G.a());
            }
            case 10: {
                return new vzg((Handler)this.a.G.a(), (vdr)this.a.bp.a());
            }
            case 9: {
                final est b8 = this.b;
                final Context context6 = (Context)this.a.c.a();
                final tqd tqd = (tqd)this.a.ix.a();
                final wyw wyw2 = (wyw)this.a.iK.a();
                final acpk acpk = (acpk)this.a.jL.a();
                final acgs acgs = (acgs)this.a.jl.a();
                final vzo g2 = this.b.g();
                final aujg aujg = (aujg)this.a.a.cI.a();
                final omw omw = (omw)this.b.F.a();
                final oum oum4 = (oum)this.b.q.a();
                final acdp acdp = (acdp)this.a.cv.a();
                final vai vai = (vai)this.a.cF.a();
                final oug oug = (oug)this.a.a.aE.a();
                final est b9 = this.b;
                final wpn wpn = new wpn(context6, tqd, wyw2, acpk, acgs, g2, aujg, omw, acdp, vai, oug, b9.B, (xib)b9.G.a(), (aeea)this.b.l.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                wpn.a = b8.H;
                wpn.b = b8.I;
                return wpn;
            }
            case 8: {
                return hdz.d((adkb)this.a.lo.a(), (Executor)this.a.r.a());
            }
            case 7: {
                return new eqb(this, 2);
            }
            case 6: {
                return new eqc(this, 2);
            }
            case 5: {
                return new pvh(this);
            }
            case 4: {
                return gvs.h((xao)this.a.cB.a(), (tjm)this.a.P.a());
            }
            case 3: {
                final est b10 = this.b;
                final Context context7 = (Context)b10.b.c.a();
                final tjb tjb2 = (tjb)b10.b.dD.a();
                final aujg aujg2 = (aujg)b10.b.a.ar.a();
                return new ubg(ulu.u(context7, tjb2, b10.r(), b10.b.a.gS()), this.b.f(), (aujg)this.a.a.ar.a(), this.b.e(), (uau)null, (uas)null, (uaz)null, (aujg)null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 2: {
                return new pvh(this);
            }
            case 1: {
                return new aacf((vwa)this.a.lr.a(), this.a.xC(), (tcq)this.a.bV.a(), (aeea)this.a.cM(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 0: {
                final zmf zmf = (zmf)this.a.aC.a();
                final zsq zsq = (zsq)this.a.jO.a();
                final zrg zrg = (zrg)this.a.eE.a();
                final zmt zmt = (zmt)this.a.pz.a();
                final aacf aacf = (aacf)this.b.c.a();
                final acpk acpk2 = (acpk)this.a.jL.a();
                final eqy a8 = this.a;
                final atke ey = a8.ey;
                final arwh arwh = (arwh)a8.v.a();
                final zqy zqy = (zqy)this.a.jP.a();
                final flc flc = (flc)this.a.eF.a();
                return new ktn(zmf, zsq, zrg, zmt, aacf, acpk2, ey, arwh, zqy, (byte[])null, (byte[])null, (byte[])null);
            }
        }
    }
}
