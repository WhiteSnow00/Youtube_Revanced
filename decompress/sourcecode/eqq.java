import java.security.SecureRandom;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.Set;
import android.os.Handler;
import java.util.concurrent.Executor;
import android.content.Context;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

final class eqq implements atjj
{
    private final eqv a;
    private final eqr b;
    private final int c;
    
    public eqq(final eqv a, final eqr b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Object a() {
        switch (this.c) {
            default: {
                return abnt.D((abno)eqr.aw(this.b).a(), (abme)eqr.aJ(this.b).a());
            }
            case 95: {
                return aazj.J((agjt)eqr.ae(this.b).a());
            }
            case 94: {
                return aazj.G((aajn)eqr.aa(this.b).a());
            }
            case 93: {
                return aboa.o();
            }
            case 92: {
                final eqr b = this.b;
                return new absi(eqr.aw(b), eqr.an(b), (tox)eqv.vN(this.a).a(), (abhq)eqr.ah(this.b).a(), (aamd)eqr.ap(this.b).a(), eqr.b(this.b), (aujp)eqv.vL(this.a).a(), (byte[])null);
            }
            case 91: {
                return zja.j((asgt)eqr.aY(this.b).a(), (asho)eqv.fY(this.a).a());
            }
            case 90: {
                final absm d = vox.d((absi)eqv.kj(this.a).a(), eqv.bc(this.a), (absl)eqv.nZ(this.a).a(), (tdz)eqv.jp(this.a).a());
                eqr.bt(d);
                return d;
            }
            case 89: {
                return Optional.of((Object)eqv.pG(this.a).a());
            }
            case 88: {
                return new erj(this.a, this.b, 2);
            }
            case 87: {
                return new aeby(eqr.d(this.b));
            }
            case 86: {
                final Context context = (Context)eqv.pt(this.a).a();
                final atid atid = (atid)eqr.aT(this.b).a();
                abnt.l(atid);
                return atid;
            }
            case 85: {
                final Context context2 = (Context)eqv.pt(this.a).a();
                final atid atid2 = (atid)eqr.V(this.b).a();
                abnt.i(atid2);
                return atid2;
            }
            case 84: {
                final Context context3 = (Context)eqv.pt(this.a).a();
                final atie atie = (atie)eqr.aH(this.b).a();
                abnt.k(atie);
                return atie;
            }
            case 83: {
                return aboa.f();
            }
            case 82: {
                final Context context4 = (Context)eqv.pt(this.a).a();
                final atie atie2 = (atie)eqr.aF(this.b).a();
                abnt.j(atie2);
                return atie2;
            }
            case 81: {
                return afdu.u((Object)eqv.br(this.a), (Object)eqv.aW(this.a), (Object)eqv.nN(this.a).a());
            }
            case 80: {
                return abvu.s((mrm)eqv.qd(this.a).a());
            }
            case 79: {
                return abvs.b();
            }
            case 78: {
                return abjy.p((String)eqv.rY(this.a).a(), (abpj)eqv.jv(this.a).a(), (aajh)eqv.rN(this.a).a());
            }
            case 77: {
                return abwt.e((Executor)eqv.fX(this.a).a(), eqr.an(this.b), (abpj)eqv.jv(this.a).a(), (wvu)eqv.th(this.a).a());
            }
            case 76: {
                return aazj.I((agjt)eqr.ae(this.b).a());
            }
            case 75: {
                return abjy.q((aeyr)eqr.aC(this.b).a(), (abhq)eqr.ah(this.b).a(), (aboh)eqr.au(this.b).a());
            }
            case 74: {
                return yxn.E(eqv.xx(this.a));
            }
            case 73: {
                return zja.K((xuc)eqv.oE(this.a).a(), (abhq)eqr.ah(this.b).a());
            }
            case 72: {
                final Context context5 = (Context)eqv.pt(this.a).a();
                final atie atie3 = (atie)eqr.ay(this.b).a();
                abnt.e(atie3);
                return atie3;
            }
            case 71: {
                return aboa.c();
            }
            case 70: {
                final Context context6 = (Context)eqv.pt(this.a).a();
                final atie atie4 = (atie)eqr.bj(this.b).a();
                abnt.h(atie4);
                return atie4;
            }
            case 69: {
                return abjy.n((abpj)eqv.jv(this.a).a(), eqv.nS(this.a).a(), (asgt)eqr.aR(this.b).a());
            }
            case 68: {
                final eqr b2 = this.b;
                final acga b3 = phw.B(eqv.rP(this.a), (asgt)eqr.B(b2).a(), (asho)eqv.fW(this.a).a(), (abpj)eqv.jv(this.a).a());
                eqr.br(b2, (Object)b3);
                return b3;
            }
            case 67: {
                return abvq.v(eqv.aA(this.a), (abhr)eqr.ag(this.b).a());
            }
            case 66: {
                final eqr b4 = this.b;
                final arud arud = (arud)eqv.qo(this.a).a();
                final abga r = abjy.r(eqr.bB(this.b));
                eqr.bu(b4, r);
                return r;
            }
            case 65: {
                final zhb k = abqq.k((abtk)eqv.mD(this.a).a(), (aamd)eqr.at(this.b).a(), (abhq)eqr.ah(this.b).a(), (yls)eqv.rd(this.a).a(), (abpj)eqv.jv(this.a).a());
                eqr.bz(k);
                return k;
            }
            case 64: {
                final abpu g = abnt.G(eqr.bF(this.b), (aboh)eqr.au(this.b).a());
                eqr.bo(g);
                return g;
            }
            case 63: {
                return aazj.g((atie)eqr.aZ(this.b).a());
            }
            case 62: {
                final abmu abmu = (abmu)eqr.aM(this.b).a();
                final aajh aajh = (aajh)eqv.rN(this.a).a();
                final Handler handler = (Handler)eqv.sL(this.a).a();
                final arhr b5 = arjc.b(eqr.an(this.b));
                final asgt asgt = (asgt)eqr.aX(this.b).a();
                final asgt asgt2 = (asgt)eqr.aY(this.b).a();
                final asgt asgt3 = (asgt)eqr.aV(this.b).a();
                final aboh aboh = (aboh)eqr.au(this.b).a();
                final eqv a = this.a;
                final abml e = wvt.e(abmu, aajh, handler, b5, asgt, asgt2, asgt3, aboh, eqv.te(a), eqv.td(a));
                eqr.bw(e);
                return e;
            }
            case 61: {
                return new adjo((abit)eqr.Y(this.b).a(), (abll)eqr.bh(this.b).a(), (abxs)eqv.vQ(this.a).a(), (tdz)eqv.jp(this.a).a(), eqr.z(this.b), (aboh)eqr.au(this.b).a(), (Set)afdu.r());
            }
            case 60: {
                final eqr b6 = this.b;
                final aajn c = vox.c((yzo)eqv.mo(this.a).a());
                eqr.bp(b6, c);
                return c;
            }
            case 59: {
                return aazj.h(eqr.aL(this.b));
            }
            case 58: {
                return zja.k((abno)eqr.aw(this.b).a(), (abob)eqr.ao(this.b).a());
            }
            case 57: {
                final aaip f = roy.f((abmu)eqr.aM(this.b).a(), (aboh)eqr.au(this.b).a(), arjc.b(eqr.an(this.b)), (Executor)eqv.fX(this.a).a(), eqv.te(this.a), (asgt)eqr.B(this.b).a(), (asgt)eqr.aR(this.b).a(), (asgt)eqr.bf(this.b).a(), (abhr)eqr.ag(this.b).a());
                eqr.bm(f);
                return f;
            }
            case 56: {
                return aboa.g();
            }
            case 55: {
                final Context context7 = (Context)eqv.pt(this.a).a();
                final abhq abhq = (abhq)eqr.ah(this.b).a();
                final zki zki = (zki)eqv.pL(this.a).a();
                final eqv a2 = this.a;
                final ablp t = abgv.t(context7, abhq, zki, eqv.kc(a2), (aeby)eqv.nM(a2).a());
                eqr.bv(t);
                return t;
            }
            case 54: {
                return new aboq((vhm)eqv.sU(this.a).a(), (abmu)eqr.aM(this.b).a(), (abll)eqr.bh(this.b).a(), (agjt)eqr.ae(this.b).a(), (Executor)eqv.oO(this.a).a(), (Executor)eqv.fX(this.a).a(), (arud)eqv.qo(this.a).a(), eqr.bE(this.b), (abji)eqr.az(this.b).a(), (abpj)eqv.jv(this.a).a(), eqr.bD(this.b), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 53: {
                return new abhf((avt)eqv.mN(this.a).a(), (aboq)eqr.aA(this.b).a(), (asgt)eqr.aR(this.b).a(), (asgt)eqr.aH(this.b).a(), (abji)eqr.az(this.b).a(), (abmu)eqr.aM(this.b).a(), arjc.b(eqr.ai(this.b)), (Executor)eqv.fX(this.a).a(), (Executor)eqv.oO(this.a).a(), (abpj)eqv.jv(this.a).a(), null, null, null, null, null, null);
            }
            case 52: {
                return abgv.n();
            }
            case 51: {
                final Context context8 = (Context)eqv.pt(this.a).a();
                final atie atie5 = (atie)eqr.aq(this.b).a();
                abnt.d(atie5);
                return atie5;
            }
            case 50: {
                return new auip((agiy)eqr.ad(this.b).a(), (byte[])null, (byte[])null);
            }
            case 49: {
                return new aaiu((abme)eqr.aJ(this.b).a());
            }
            case 48: {
                return new agjt((abme)eqr.aJ(this.b).a());
            }
            case 47: {
                final Context context9 = (Context)eqv.pt(this.a).a();
                final atie atie6 = (atie)eqr.bc(this.b).a();
                abnt.g(atie6);
                return atie6;
            }
            case 46: {
                return new adbl((aujp)eqr.bb(this.b).a(), eqr.bE(this.b), (abji)eqr.az(this.b).a(), (agjt)eqr.ae(this.b).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 45: {
                return abgv.d();
            }
            case 44: {
                return abgv.e();
            }
            case 43: {
                return abgv.l();
            }
            case 42: {
                return abgv.k();
            }
            case 41: {
                return abgv.m();
            }
            case 40: {
                return abgv.j();
            }
            case 39: {
                return abgv.g();
            }
            case 38: {
                return abgv.i();
            }
            case 37: {
                return abgv.f();
            }
            case 36: {
                return abgv.h();
            }
            case 35: {
                return wvt.f((atie)eqr.aV(this.b).a(), (atie)eqr.aQ(this.b).a(), (atie)eqr.aW(this.b).a(), (atie)eqr.aU(this.b).a(), (atie)eqr.aX(this.b).a(), (atie)eqr.bg(this.b).a(), (atie)eqr.aZ(this.b).a(), (atie)eqr.bf(this.b).a(), (atie)eqr.ac(this.b).a(), (atie)eqr.ab(this.b).a());
            }
            case 34: {
                return abjs.d((oas)eqv.gK(this.a).a(), eqr.bA(this.b), eqr.bG(this.b), (asho)eqv.fN(this.a).a(), (Executor)eqv.oO(this.a).a(), (yyh)eqv.tv(this.a).a(), (abpj)eqv.jv(this.a).a(), (arud)eqv.qo(this.a).a());
            }
            case 33: {
                return zja.h((oas)eqv.gK(this.a).a(), (tdz)eqv.jp(this.a).a());
            }
            case 32: {
                return wvt.u((tdz)eqv.jp(this.a).a(), (vjh)eqv.rU(this.a).a(), (adcr)eqv.pu(this.a).a(), (zki)eqv.pL(this.a).a(), (abke)eqv.oe(this.a).a(), eqr.A(this.b), (vuu)eqv.wa(this.a).a(), (arud)eqv.qo(this.a).a(), eqv.aE(this.a), (abpj)eqv.jv(this.a).a());
            }
            case 31: {
                return abjy.s((tdz)eqv.jp(this.a).a(), (vut)eqv.vZ(this.a).a(), (vuu)eqv.wa(this.a).a());
            }
            case 30: {
                return zja.h((oas)eqv.gK(this.a).a(), (tdz)eqv.jp(this.a).a());
            }
            case 29: {
                return new abit((tdz)eqv.jp(this.a).a());
            }
            case 28: {
                return new abjn((abhs)eqr.ah(this.b).a(), (abit)eqr.Y(this.b).a());
            }
            case 27: {
                return new abjf((tdz)eqv.jp(this.a).a(), (abjm)eqv.od(this.a).a(), (abke)eqv.oe(this.a).a(), (Executor)eqv.oO(this.a).a(), (Executor)eqv.fX(this.a).a(), eqr.A(this.b), (oas)eqv.gK(this.a).a(), (arud)eqv.qo(this.a).a(), (abpj)eqv.jv(this.a).a(), (avt)eqv.mN(this.a).a(), (abjk)eqv.oc(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 26: {
                return aazj.f(eqr.c(this.b));
            }
            case 25: {
                return new abji((tdz)eqv.jp(this.a).a(), arjc.b(eqr.ai(this.b)), (Handler)eqv.sL(this.a).a(), (tny)eqv.qf(this.a).a(), (ScheduledExecutorService)eqv.pA(this.a).a(), (Executor)eqv.fX(this.a).a(), (abmu)eqr.aM(this.b).a(), eqr.bD(this.b), (arud)eqv.qo(this.a).a(), (uyf)eqv.po(this.a).a(), (abpj)eqv.jv(this.a).a(), (asho)eqv.fP(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 24: {
                final Context context10 = (Context)eqv.pt(this.a).a();
                return new aamd(null, (byte[])null);
            }
            case 23: {
                return abnt.E((abhr)eqr.ag(this.b).a(), (aamd)eqr.at(this.b).a());
            }
            case 22: {
                final Context context11 = (Context)eqv.pt(this.a).a();
                final atjj ol = eqv.oL(this.a);
                final abhq abhq2 = (abhq)eqr.ah(this.b).a();
                final eqr b7 = this.b;
                return new aait(context11, ol, abhq2, eqr.az(b7), eqr.av(b7), (abme)eqr.aJ(b7).a(), (aukm)eqv.mR(this.a).a(), (agjt)eqr.ae(this.b).a(), (arud)eqv.qo(this.a).a(), arjc.b(eqv.oM(this.a)), arjc.b(eqr.aI(this.b)), (abpj)eqv.jv(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 21: {
                return abgv.p();
            }
            case 20: {
                return new aboh((asgt)eqr.B(this.b).a(), (asgt)eqr.aR(this.b).a(), (asgt)eqr.bc(this.b).a());
            }
            case 19: {
                return abgv.o();
            }
            case 18: {
                return aboa.h();
            }
            case 17: {
                return aazj.k((atid)eqr.aT(this.b).a());
            }
            case 16: {
                return aazj.c((asgt)eqr.aR(this.b).a());
            }
            case 15: {
                final eqr b8 = this.b;
                final abqa e2 = vim.e((tdz)eqv.jp(this.a).a(), (Context)eqv.pt(this.a).a(), (acga)eqv.of(this.a).a(), (ScheduledExecutorService)eqv.oO(this.a).a(), (String)eqv.sP(this.a).a(), (ListenableFuture)eqv.pU(this.a).a(), arjc.b(eqr.ba(this.b)), (abpj)eqv.jv(this.a).a());
                eqr.bn(b8, e2);
                return e2;
            }
            case 14: {
                final eqr b9 = this.b;
                final Context context12 = (Context)eqv.pt(this.a).a();
                final tdz tdz = (tdz)eqv.jp(this.a).a();
                final yls yls = (yls)eqv.rd(this.a).a();
                final abqa abqa = (abqa)eqr.Z(this.b).a();
                final abto abto = (abto)eqv.nP(this.a).a();
                final aait aait = (aait)eqr.X(this.b).a();
                final abhq abhq3 = (abhq)eqr.ah(this.b).a();
                final abit abit = (abit)eqr.Y(this.b).a();
                final auip auip = (auip)eqr.am(this.b).a();
                final aaim a3 = eqr.a(this.b);
                final absv absv = (absv)eqv.ms(this.a).a();
                final zgv zgv = (zgv)eqv.pV(this.a).a();
                final arud arud2 = (arud)eqv.qo(this.a).a();
                final aeby aeby = (aeby)eqv.tS(this.a).a();
                final abhf abhf = (abhf)eqr.aj(this.b).a();
                eqr.bx(this.b);
                final abji abji = (abji)eqr.az(this.b).a();
                final aboq aboq = (aboq)eqr.aA(this.b).a();
                final agjt agjt = (agjt)eqr.ae(this.b).a();
                final adbl adbl = (adbl)eqr.av(this.b).a();
                final abmu abmu2 = (abmu)eqr.aM(this.b).a();
                final abno c2 = aboc.c(context12, tdz, yls, abqa, abto, aait, abhq3, abit, auip, a3, absv, zgv, arud2, abhf, abji, aboq, agjt, adbl, (aujp)eqr.bi(this.b).a(), (aujp)eqr.ax(this.b).a(), (abob)eqr.ao(this.b).a(), (auip)eqr.af(this.b).a(), (agkb)eqr.ar(this.b).a(), (acga)eqr.W(this.b).a(), (abpj)eqv.jv(this.a).a());
                eqr.bs(b9, c2);
                return c2;
            }
            case 13: {
                final adbl yx = eqv.yX(this.a);
                final Executor executor = (Executor)eqv.fX(this.a).a();
                final eqr b10 = this.b;
                return acfi.g(yx, executor, eqr.aw(b10), eqr.an(b10), (wvu)eqv.th(this.a).a(), (abpj)eqv.jv(this.a).a());
            }
            case 12: {
                return afdu.w((Object)eqr.be(this.b).a(), (Object)eqr.aN(this.b).a(), (Object)eqr.aD(this.b).a(), (Object)eqr.aO(this.b).a(), (Object)eqr.aB(this.b).a());
            }
            case 11: {
                return abwt.f((vjh)eqv.rU(this.a).a(), (adcr)eqv.pu(this.a).a(), (zki)eqv.pL(this.a).a(), (tgw)eqv.pd(this.a).a());
            }
            case 10: {
                final eqr b11 = this.b;
                final abwm c3 = abwn.c(eqr.al(b11), (ScheduledExecutorService)eqv.oO(this.a).a(), eqr.bd(this.b), eqv.yX(this.a), (Handler)eqv.sL(this.a).a(), (Executor)eqv.fX(this.a).a(), (arud)eqv.qo(this.a).a(), (abpj)eqv.jv(this.a).a(), (SecureRandom)eqv.rX(this.a).a(), (vhm)eqv.sU(this.a).a(), (wvu)eqv.th(this.a).a());
                eqr.bq(b11, c3);
                return c3;
            }
            case 9: {
                final Context context13 = (Context)eqv.pt(this.a).a();
                return abnt.c((asho)eqv.fY(this.a).a());
            }
            case 8: {
                return aboa.e();
            }
            case 7: {
                return aazj.j((atid)eqr.V(this.b).a());
            }
            case 6: {
                return new abpx((yyh)eqv.tv(this.a).a(), (asgt)eqr.B(this.b).a(), (abhr)eqr.ag(this.b).a(), (asgt)eqv.pr(this.a).a(), (oas)eqv.gK(this.a).a(), (abxs)eqv.vQ(this.a).a(), (arud)eqv.qo(this.a).a(), (byte[])null, (byte[])null);
            }
            case 5: {
                return abnt.f((abpx)eqr.aP(this.b).a(), (uyf)eqv.po(this.a).a());
            }
            case 4: {
                final afds j = afdu.j(3);
                j.h((Object)eqr.aK(this.b).a());
                j.h((Object)eqr.ak(this.b).a());
                j.j((Iterable)eqr.as(this.b).a());
                return j.g();
            }
            case 3: {
                return new agiy((tdz)eqv.jp(this.a).a(), (Set)eqr.bk(this.b).a(), (aujp)eqr.aE(this.b).a(), (aujp)eqr.aG(this.b).a(), (aujp)eqr.U(this.b).a(), (aujp)eqr.aS(this.b).a());
            }
            case 2: {
                return new abir((Context)eqv.pt(this.a).a());
            }
            case 1: {
                return aazj.e((absz)eqr.bl(this.b));
            }
            case 0: {
                return new abmf(eqr.by(this.b), eqr.bC(this.b), 0, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
        }
    }
}
