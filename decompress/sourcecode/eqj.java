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

final class eqj implements atjj
{
    private final eqv a;
    private final eqk b;
    private final int c;
    
    public eqj(final eqv a, final eqk b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Object a() {
        switch (this.c) {
            default: {
                return abnt.D((abno)eqk.aw(this.b).a(), (abme)eqk.aJ(this.b).a());
            }
            case 95: {
                return aazj.J((agjt)eqk.ae(this.b).a());
            }
            case 94: {
                return aazj.G((aajn)eqk.aa(this.b).a());
            }
            case 93: {
                return aboa.o();
            }
            case 92: {
                final eqk b = this.b;
                return new absi(eqk.aw(b), eqk.an(b), (tox)eqv.vN(this.a).a(), (abhq)eqk.ah(this.b).a(), (aamd)eqk.ap(this.b).a(), eqk.b(this.b), (aujp)eqv.vL(this.a).a(), (byte[])null);
            }
            case 91: {
                return zja.j((asgt)eqk.aY(this.b).a(), (asho)eqv.fY(this.a).a());
            }
            case 90: {
                final absm d = vox.d((absi)eqv.kj(this.a).a(), eqv.bc(this.a), (absl)eqv.nZ(this.a).a(), (tdz)eqv.jp(this.a).a());
                eqk.bt(d);
                return d;
            }
            case 89: {
                return Optional.of((Object)eqv.pG(this.a).a());
            }
            case 88: {
                return new erj(this.a, this.b, 0);
            }
            case 87: {
                return new aeby(eqk.d(this.b));
            }
            case 86: {
                final Context context = (Context)eqv.pt(this.a).a();
                final atid atid = (atid)eqk.aT(this.b).a();
                abnt.l(atid);
                return atid;
            }
            case 85: {
                final Context context2 = (Context)eqv.pt(this.a).a();
                final atid atid2 = (atid)eqk.V(this.b).a();
                abnt.i(atid2);
                return atid2;
            }
            case 84: {
                final Context context3 = (Context)eqv.pt(this.a).a();
                final atie atie = (atie)eqk.aH(this.b).a();
                abnt.k(atie);
                return atie;
            }
            case 83: {
                return aboa.f();
            }
            case 82: {
                final Context context4 = (Context)eqv.pt(this.a).a();
                final atie atie2 = (atie)eqk.aF(this.b).a();
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
                return abwt.e((Executor)eqv.fX(this.a).a(), eqk.an(this.b), (abpj)eqv.jv(this.a).a(), (wvu)eqv.th(this.a).a());
            }
            case 76: {
                return aazj.I((agjt)eqk.ae(this.b).a());
            }
            case 75: {
                return abjy.q((aeyr)eqk.aC(this.b).a(), (abhq)eqk.ah(this.b).a(), (aboh)eqk.au(this.b).a());
            }
            case 74: {
                return yxn.E(eqv.xx(this.a));
            }
            case 73: {
                return zja.K((xuc)eqv.oE(this.a).a(), (abhq)eqk.ah(this.b).a());
            }
            case 72: {
                final Context context5 = (Context)eqv.pt(this.a).a();
                final atie atie3 = (atie)eqk.ay(this.b).a();
                abnt.e(atie3);
                return atie3;
            }
            case 71: {
                return aboa.c();
            }
            case 70: {
                final Context context6 = (Context)eqv.pt(this.a).a();
                final atie atie4 = (atie)eqk.bj(this.b).a();
                abnt.h(atie4);
                return atie4;
            }
            case 69: {
                return abjy.n((abpj)eqv.jv(this.a).a(), eqv.nS(this.a).a(), (asgt)eqk.aR(this.b).a());
            }
            case 68: {
                final eqk b2 = this.b;
                final acga b3 = phw.B(eqv.rP(this.a), (asgt)eqk.B(b2).a(), (asho)eqv.fW(this.a).a(), (abpj)eqv.jv(this.a).a());
                eqk.br(b2, (Object)b3);
                return b3;
            }
            case 67: {
                return abvq.v(eqv.aA(this.a), (abhr)eqk.ag(this.b).a());
            }
            case 66: {
                final eqk b4 = this.b;
                final arud arud = (arud)eqv.qo(this.a).a();
                final abga r = abjy.r(eqk.bB(this.b));
                eqk.bu(b4, r);
                return r;
            }
            case 65: {
                final zhb k = abqq.k((abtk)eqv.mD(this.a).a(), (aamd)eqk.at(this.b).a(), (abhq)eqk.ah(this.b).a(), (yls)eqv.rd(this.a).a(), (abpj)eqv.jv(this.a).a());
                eqk.bz(k);
                return k;
            }
            case 64: {
                final abpu g = abnt.G(eqk.bF(this.b), (aboh)eqk.au(this.b).a());
                eqk.bo(g);
                return g;
            }
            case 63: {
                return aazj.g((atie)eqk.aZ(this.b).a());
            }
            case 62: {
                final abmu abmu = (abmu)eqk.aM(this.b).a();
                final aajh aajh = (aajh)eqv.rN(this.a).a();
                final Handler handler = (Handler)eqv.sL(this.a).a();
                final arhr b5 = arjc.b(eqk.an(this.b));
                final asgt asgt = (asgt)eqk.aX(this.b).a();
                final asgt asgt2 = (asgt)eqk.aY(this.b).a();
                final asgt asgt3 = (asgt)eqk.aV(this.b).a();
                final aboh aboh = (aboh)eqk.au(this.b).a();
                final eqv a = this.a;
                final abml e = wvt.e(abmu, aajh, handler, b5, asgt, asgt2, asgt3, aboh, eqv.te(a), eqv.td(a));
                eqk.bw(e);
                return e;
            }
            case 61: {
                return new adjo((abit)eqk.Y(this.b).a(), (abll)eqk.bh(this.b).a(), (abxs)eqv.vQ(this.a).a(), (tdz)eqv.jp(this.a).a(), eqk.z(this.b), (aboh)eqk.au(this.b).a(), (Set)afdu.r());
            }
            case 60: {
                final eqk b6 = this.b;
                final aajn c = vox.c((yzo)eqv.mo(this.a).a());
                eqk.bp(b6, c);
                return c;
            }
            case 59: {
                return aazj.h(eqk.aL(this.b));
            }
            case 58: {
                return zja.k((abno)eqk.aw(this.b).a(), (abob)eqk.ao(this.b).a());
            }
            case 57: {
                final aaip f = roy.f((abmu)eqk.aM(this.b).a(), (aboh)eqk.au(this.b).a(), arjc.b(eqk.an(this.b)), (Executor)eqv.fX(this.a).a(), eqv.te(this.a), (asgt)eqk.B(this.b).a(), (asgt)eqk.aR(this.b).a(), (asgt)eqk.bf(this.b).a(), (abhr)eqk.ag(this.b).a());
                eqk.bm(f);
                return f;
            }
            case 56: {
                return aboa.g();
            }
            case 55: {
                final Context context7 = (Context)eqv.pt(this.a).a();
                final abhq abhq = (abhq)eqk.ah(this.b).a();
                final zki zki = (zki)eqv.pL(this.a).a();
                final eqv a2 = this.a;
                final ablp t = abgv.t(context7, abhq, zki, eqv.kc(a2), (aeby)eqv.nM(a2).a());
                eqk.bv(t);
                return t;
            }
            case 54: {
                return new aboq((vhm)eqv.sU(this.a).a(), (abmu)eqk.aM(this.b).a(), (abll)eqk.bh(this.b).a(), (agjt)eqk.ae(this.b).a(), (Executor)eqv.oO(this.a).a(), (Executor)eqv.fX(this.a).a(), (arud)eqv.qo(this.a).a(), eqk.bE(this.b), (abji)eqk.az(this.b).a(), (abpj)eqv.jv(this.a).a(), eqk.bD(this.b), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 53: {
                return new abhf((avt)eqv.mN(this.a).a(), (aboq)eqk.aA(this.b).a(), (asgt)eqk.aR(this.b).a(), (asgt)eqk.aH(this.b).a(), (abji)eqk.az(this.b).a(), (abmu)eqk.aM(this.b).a(), arjc.b(eqk.ai(this.b)), (Executor)eqv.fX(this.a).a(), (Executor)eqv.oO(this.a).a(), (abpj)eqv.jv(this.a).a(), null, null, null, null, null, null);
            }
            case 52: {
                return abgv.n();
            }
            case 51: {
                final Context context8 = (Context)eqv.pt(this.a).a();
                final atie atie5 = (atie)eqk.aq(this.b).a();
                abnt.d(atie5);
                return atie5;
            }
            case 50: {
                return new auip((agiy)eqk.ad(this.b).a(), (byte[])null, (byte[])null);
            }
            case 49: {
                return new aaiu((abme)eqk.aJ(this.b).a());
            }
            case 48: {
                return new agjt((abme)eqk.aJ(this.b).a());
            }
            case 47: {
                final Context context9 = (Context)eqv.pt(this.a).a();
                final atie atie6 = (atie)eqk.bc(this.b).a();
                abnt.g(atie6);
                return atie6;
            }
            case 46: {
                return new adbl((aujp)eqk.bb(this.b).a(), eqk.bE(this.b), (abji)eqk.az(this.b).a(), (agjt)eqk.ae(this.b).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
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
                return wvt.f((atie)eqk.aV(this.b).a(), (atie)eqk.aQ(this.b).a(), (atie)eqk.aW(this.b).a(), (atie)eqk.aU(this.b).a(), (atie)eqk.aX(this.b).a(), (atie)eqk.bg(this.b).a(), (atie)eqk.aZ(this.b).a(), (atie)eqk.bf(this.b).a(), (atie)eqk.ac(this.b).a(), (atie)eqk.ab(this.b).a());
            }
            case 34: {
                return abjs.d((oas)eqv.gK(this.a).a(), eqk.bA(this.b), eqk.bG(this.b), (asho)eqv.fN(this.a).a(), (Executor)eqv.oO(this.a).a(), (yyh)eqv.tv(this.a).a(), (abpj)eqv.jv(this.a).a(), (arud)eqv.qo(this.a).a());
            }
            case 33: {
                return zja.h((oas)eqv.gK(this.a).a(), (tdz)eqv.jp(this.a).a());
            }
            case 32: {
                return wvt.u((tdz)eqv.jp(this.a).a(), (vjh)eqv.rU(this.a).a(), (adcr)eqv.pu(this.a).a(), (zki)eqv.pL(this.a).a(), (abke)eqv.oe(this.a).a(), eqk.A(this.b), (vuu)eqv.wa(this.a).a(), (arud)eqv.qo(this.a).a(), eqv.aE(this.a), (abpj)eqv.jv(this.a).a());
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
                return new abjn((abhs)eqk.ah(this.b).a(), (abit)eqk.Y(this.b).a());
            }
            case 27: {
                return new abjf((tdz)eqv.jp(this.a).a(), (abjm)eqv.od(this.a).a(), (abke)eqv.oe(this.a).a(), (Executor)eqv.oO(this.a).a(), (Executor)eqv.fX(this.a).a(), eqk.A(this.b), (oas)eqv.gK(this.a).a(), (arud)eqv.qo(this.a).a(), (abpj)eqv.jv(this.a).a(), (avt)eqv.mN(this.a).a(), (abjk)eqv.oc(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 26: {
                return aazj.f(eqk.c(this.b));
            }
            case 25: {
                return new abji((tdz)eqv.jp(this.a).a(), arjc.b(eqk.ai(this.b)), (Handler)eqv.sL(this.a).a(), (tny)eqv.qf(this.a).a(), (ScheduledExecutorService)eqv.pA(this.a).a(), (Executor)eqv.fX(this.a).a(), (abmu)eqk.aM(this.b).a(), eqk.bD(this.b), (arud)eqv.qo(this.a).a(), (uyf)eqv.po(this.a).a(), (abpj)eqv.jv(this.a).a(), (asho)eqv.fP(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 24: {
                final Context context10 = (Context)eqv.pt(this.a).a();
                return new aamd(null, (byte[])null);
            }
            case 23: {
                return abnt.E((abhr)eqk.ag(this.b).a(), (aamd)eqk.at(this.b).a());
            }
            case 22: {
                final Context context11 = (Context)eqv.pt(this.a).a();
                final atjj ol = eqv.oL(this.a);
                final abhq abhq2 = (abhq)eqk.ah(this.b).a();
                final eqk b7 = this.b;
                return new aait(context11, ol, abhq2, eqk.az(b7), eqk.av(b7), (abme)eqk.aJ(b7).a(), (aukm)eqv.mR(this.a).a(), (agjt)eqk.ae(this.b).a(), (arud)eqv.qo(this.a).a(), arjc.b(eqv.oM(this.a)), arjc.b(eqk.aI(this.b)), (abpj)eqv.jv(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 21: {
                return abgv.p();
            }
            case 20: {
                return new aboh((asgt)eqk.B(this.b).a(), (asgt)eqk.aR(this.b).a(), (asgt)eqk.bc(this.b).a());
            }
            case 19: {
                return abgv.o();
            }
            case 18: {
                return aboa.h();
            }
            case 17: {
                return aazj.k((atid)eqk.aT(this.b).a());
            }
            case 16: {
                return aazj.c((asgt)eqk.aR(this.b).a());
            }
            case 15: {
                final eqk b8 = this.b;
                final abqa e2 = vim.e((tdz)eqv.jp(this.a).a(), (Context)eqv.pt(this.a).a(), (acga)eqv.of(this.a).a(), (ScheduledExecutorService)eqv.oO(this.a).a(), (String)eqv.sP(this.a).a(), (ListenableFuture)eqv.pU(this.a).a(), arjc.b(eqk.ba(this.b)), (abpj)eqv.jv(this.a).a());
                eqk.bn(b8, e2);
                return e2;
            }
            case 14: {
                final eqk b9 = this.b;
                final Context context12 = (Context)eqv.pt(this.a).a();
                final tdz tdz = (tdz)eqv.jp(this.a).a();
                final yls yls = (yls)eqv.rd(this.a).a();
                final abqa abqa = (abqa)eqk.Z(this.b).a();
                final abto abto = (abto)eqv.nP(this.a).a();
                final aait aait = (aait)eqk.X(this.b).a();
                final abhq abhq3 = (abhq)eqk.ah(this.b).a();
                final abit abit = (abit)eqk.Y(this.b).a();
                final auip auip = (auip)eqk.am(this.b).a();
                final aaim a3 = eqk.a(this.b);
                final absv absv = (absv)eqv.ms(this.a).a();
                final zgv zgv = (zgv)eqv.pV(this.a).a();
                final arud arud2 = (arud)eqv.qo(this.a).a();
                final aeby aeby = (aeby)eqv.tS(this.a).a();
                final abhf abhf = (abhf)eqk.aj(this.b).a();
                eqk.bx(this.b);
                final abji abji = (abji)eqk.az(this.b).a();
                final aboq aboq = (aboq)eqk.aA(this.b).a();
                final agjt agjt = (agjt)eqk.ae(this.b).a();
                final adbl adbl = (adbl)eqk.av(this.b).a();
                final abmu abmu2 = (abmu)eqk.aM(this.b).a();
                final abno c2 = aboc.c(context12, tdz, yls, abqa, abto, aait, abhq3, abit, auip, a3, absv, zgv, arud2, abhf, abji, aboq, agjt, adbl, (aujp)eqk.bi(this.b).a(), (aujp)eqk.ax(this.b).a(), (abob)eqk.ao(this.b).a(), (auip)eqk.af(this.b).a(), (agkb)eqk.ar(this.b).a(), (acga)eqk.W(this.b).a(), (abpj)eqv.jv(this.a).a());
                eqk.bs(b9, c2);
                return c2;
            }
            case 13: {
                final adbl yx = eqv.yX(this.a);
                final Executor executor = (Executor)eqv.fX(this.a).a();
                final eqk b10 = this.b;
                return acfi.g(yx, executor, eqk.aw(b10), eqk.an(b10), (wvu)eqv.th(this.a).a(), (abpj)eqv.jv(this.a).a());
            }
            case 12: {
                return afdu.w((Object)eqk.be(this.b).a(), (Object)eqk.aN(this.b).a(), (Object)eqk.aD(this.b).a(), (Object)eqk.aO(this.b).a(), (Object)eqk.aB(this.b).a());
            }
            case 11: {
                return abwt.f((vjh)eqv.rU(this.a).a(), (adcr)eqv.pu(this.a).a(), (zki)eqv.pL(this.a).a(), (tgw)eqv.pd(this.a).a());
            }
            case 10: {
                final eqk b11 = this.b;
                final abwm c3 = abwn.c(eqk.al(b11), (ScheduledExecutorService)eqv.oO(this.a).a(), eqk.bd(this.b), eqv.yX(this.a), (Handler)eqv.sL(this.a).a(), (Executor)eqv.fX(this.a).a(), (arud)eqv.qo(this.a).a(), (abpj)eqv.jv(this.a).a(), (SecureRandom)eqv.rX(this.a).a(), (vhm)eqv.sU(this.a).a(), (wvu)eqv.th(this.a).a());
                eqk.bq(b11, c3);
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
                return aazj.j((atid)eqk.V(this.b).a());
            }
            case 6: {
                return new abpx((yyh)eqv.tv(this.a).a(), (asgt)eqk.B(this.b).a(), (abhr)eqk.ag(this.b).a(), (asgt)eqv.pr(this.a).a(), (oas)eqv.gK(this.a).a(), (abxs)eqv.vQ(this.a).a(), (arud)eqv.qo(this.a).a(), (byte[])null, (byte[])null);
            }
            case 5: {
                return abnt.f((abpx)eqk.aP(this.b).a(), (uyf)eqv.po(this.a).a());
            }
            case 4: {
                final afds j = afdu.j(3);
                j.h((Object)eqk.aK(this.b).a());
                j.h((Object)eqk.ak(this.b).a());
                j.j((Iterable)eqk.as(this.b).a());
                return j.g();
            }
            case 3: {
                return new agiy((tdz)eqv.jp(this.a).a(), (Set)eqk.bk(this.b).a(), (aujp)eqk.aE(this.b).a(), (aujp)eqk.aG(this.b).a(), (aujp)eqk.U(this.b).a(), (aujp)eqk.aS(this.b).a());
            }
            case 2: {
                return new abir((Context)eqv.pt(this.a).a());
            }
            case 1: {
                return aazj.e((absz)eqk.bl(this.b));
            }
            case 0: {
                return new abmf(eqk.by(this.b), eqk.bC(this.b), 0, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
        }
    }
}
