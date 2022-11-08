import java.security.SecureRandom;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.Set;
import android.os.Handler;
import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class eqm implements atjj
{
    private final eqv a;
    private final eqn b;
    private final int c;
    
    public eqm(final eqv a, final eqn b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Object a() {
        switch (this.c) {
            default: {
                return abnt.D((abno)eqn.au(this.b).a(), (abme)eqn.aH(this.b).a());
            }
            case 90: {
                return aazj.J((agjt)eqn.ad(this.b).a());
            }
            case 89: {
                return aazj.G((aajn)eqn.Z(this.b).a());
            }
            case 88: {
                return aboa.o();
            }
            case 87: {
                final eqn b = this.b;
                return new absi(eqn.au(b), eqn.al(b), (tox)eqv.vN(this.a).a(), (abhq)eqn.ag(this.b).a(), (aamd)eqn.an(this.b).a(), eqn.b(this.b), (aujp)eqv.vL(this.a).a(), (byte[])null);
            }
            case 86: {
                return zja.j((asgt)eqn.aX(this.b).a(), (asho)eqv.fY(this.a).a());
            }
            case 85: {
                final absm d = vox.d((absi)eqv.kj(this.a).a(), eqv.bc(this.a), (absl)eqv.nZ(this.a).a(), (tdz)eqv.jp(this.a).a());
                eqn.bs(d);
                return d;
            }
            case 84: {
                return new abjn((abhs)eqn.ag(this.b).a(), (abit)eqn.X(this.b).a());
            }
            case 83: {
                return new abjf((tdz)eqv.jp(this.a).a(), (abjm)eqv.od(this.a).a(), (abke)eqv.oe(this.a).a(), (Executor)eqv.oO(this.a).a(), (Executor)eqv.fX(this.a).a(), eqn.z(this.b), (oas)eqv.gK(this.a).a(), (arud)eqv.qo(this.a).a(), (abpj)eqv.jv(this.a).a(), (avt)eqv.mN(this.a).a(), (abjk)eqv.oc(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 82: {
                return new aaiu((abme)eqn.aH(this.b).a());
            }
            case 81: {
                return Optional.of((Object)eqv.pG(this.a).a());
            }
            case 80: {
                return new erj(this.a, this.b, 1);
            }
            case 79: {
                return new aeby(eqn.c(this.b));
            }
            case 78: {
                final Context context = (Context)eqv.pt(this.a).a();
                final atid atid = (atid)eqn.aS(this.b).a();
                abnt.l(atid);
                return atid;
            }
            case 77: {
                final Context context2 = (Context)eqv.pt(this.a).a();
                final atid atid2 = (atid)eqn.U(this.b).a();
                abnt.i(atid2);
                return atid2;
            }
            case 76: {
                final Context context3 = (Context)eqv.pt(this.a).a();
                final atie atie = (atie)eqn.aF(this.b).a();
                abnt.k(atie);
                return atie;
            }
            case 75: {
                return aboa.f();
            }
            case 74: {
                final Context context4 = (Context)eqv.pt(this.a).a();
                final atie atie2 = (atie)eqn.aD(this.b).a();
                abnt.j(atie2);
                return atie2;
            }
            case 73: {
                return afdu.u((Object)eqv.br(this.a), (Object)eqv.aW(this.a), (Object)eqv.nN(this.a).a());
            }
            case 72: {
                return abvu.s((mrm)eqv.qd(this.a).a());
            }
            case 71: {
                return abvs.b();
            }
            case 70: {
                return abjy.p((String)eqv.rY(this.a).a(), (abpj)eqv.jv(this.a).a(), (aajh)eqv.rN(this.a).a());
            }
            case 69: {
                return abwt.e((Executor)eqv.fX(this.a).a(), eqn.al(this.b), (abpj)eqv.jv(this.a).a(), (wvu)eqv.th(this.a).a());
            }
            case 68: {
                return aazj.I((agjt)eqn.ad(this.b).a());
            }
            case 67: {
                return abjy.q((aeyr)eqn.aA(this.b).a(), (abhq)eqn.ag(this.b).a(), (aboh)eqn.as(this.b).a());
            }
            case 66: {
                return yxn.E(eqv.xx(this.a));
            }
            case 65: {
                return zja.K((xuc)eqv.oE(this.a).a(), (abhq)eqn.ag(this.b).a());
            }
            case 64: {
                final Context context5 = (Context)eqv.pt(this.a).a();
                final atie atie3 = (atie)eqn.aw(this.b).a();
                abnt.e(atie3);
                return atie3;
            }
            case 63: {
                final Context context6 = (Context)eqv.pt(this.a).a();
                final atie atie4 = (atie)eqn.bi(this.b).a();
                abnt.h(atie4);
                return atie4;
            }
            case 62: {
                return abjy.n((abpj)eqv.jv(this.a).a(), eqv.nS(this.a).a(), (asgt)eqn.aQ(this.b).a());
            }
            case 61: {
                final eqn b2 = this.b;
                final acga b3 = phw.B(eqv.rP(this.a), (asgt)eqn.A(b2).a(), (asho)eqv.fW(this.a).a(), (abpj)eqv.jv(this.a).a());
                eqn.bq(b2, (Object)b3);
                return b3;
            }
            case 60: {
                return abvq.v(eqv.aA(this.a), (abhr)eqn.af(this.b).a());
            }
            case 59: {
                final eqn b4 = this.b;
                final arud arud = (arud)eqv.qo(this.a).a();
                final abga r = abjy.r(eqn.bA(this.b));
                eqn.bt(b4, r);
                return r;
            }
            case 58: {
                final zhb k = abqq.k((abtk)eqv.mD(this.a).a(), (aamd)eqn.ar(this.b).a(), (abhq)eqn.ag(this.b).a(), (yls)eqv.rd(this.a).a(), (abpj)eqv.jv(this.a).a());
                eqn.bz(k);
                return k;
            }
            case 57: {
                final abpu g = abnt.G(eqn.bE(this.b), (aboh)eqn.as(this.b).a());
                eqn.bn(g);
                return g;
            }
            case 56: {
                return aazj.g((atie)eqn.aY(this.b).a());
            }
            case 55: {
                final abmu abmu = (abmu)eqn.aL(this.b).a();
                final aajh aajh = (aajh)eqv.rN(this.a).a();
                final Handler handler = (Handler)eqv.sL(this.a).a();
                final arhr b5 = arjc.b(eqn.al(this.b));
                final asgt asgt = (asgt)eqn.aW(this.b).a();
                final asgt asgt2 = (asgt)eqn.aX(this.b).a();
                final asgt asgt3 = (asgt)eqn.aU(this.b).a();
                final aboh aboh = (aboh)eqn.as(this.b).a();
                final eqv a = this.a;
                final abml e = wvt.e(abmu, aajh, handler, b5, asgt, asgt2, asgt3, aboh, eqv.te(a), eqv.td(a));
                eqn.bv(e);
                return e;
            }
            case 54: {
                return new adjo((abit)eqn.X(this.b).a(), (abll)eqn.bg(this.b).a(), (abxs)eqv.vQ(this.a).a(), (tdz)eqv.jp(this.a).a(), eqn.d(this.b), (aboh)eqn.as(this.b).a(), (Set)afdu.r());
            }
            case 53: {
                final eqn b6 = this.b;
                final aajn c = vox.c((yzo)eqv.mo(this.a).a());
                eqn.bo(b6, c);
                return c;
            }
            case 52: {
                return aazj.h(eqn.aK(this.b));
            }
            case 51: {
                return zja.k((abno)eqn.au(this.b).a(), (abob)eqn.am(this.b).a());
            }
            case 50: {
                final aaip f = roy.f((abmu)eqn.aL(this.b).a(), (aboh)eqn.as(this.b).a(), arjc.b(eqn.al(this.b)), (Executor)eqv.fX(this.a).a(), eqv.te(this.a), (asgt)eqn.A(this.b).a(), (asgt)eqn.aQ(this.b).a(), (asgt)eqn.be(this.b).a(), (abhr)eqn.af(this.b).a());
                eqn.bl(f);
                return f;
            }
            case 49: {
                return aboa.g();
            }
            case 48: {
                final Context context7 = (Context)eqv.pt(this.a).a();
                final abhq abhq = (abhq)eqn.ag(this.b).a();
                final zki zki = (zki)eqv.pL(this.a).a();
                final eqv a2 = this.a;
                final ablp t = abgv.t(context7, abhq, zki, eqv.kc(a2), (aeby)eqv.nM(a2).a());
                eqn.bu(t);
                return t;
            }
            case 47: {
                return new aboq((vhm)eqv.sU(this.a).a(), (abmu)eqn.aL(this.b).a(), (abll)eqn.bg(this.b).a(), (agjt)eqn.ad(this.b).a(), (Executor)eqv.oO(this.a).a(), (Executor)eqv.fX(this.a).a(), (arud)eqv.qo(this.a).a(), eqn.bD(this.b), (abji)eqn.ax(this.b).a(), (abpj)eqv.jv(this.a).a(), eqn.bC(this.b), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 46: {
                return new abhf((avt)eqv.mN(this.a).a(), (aboq)eqn.ay(this.b).a(), (asgt)eqn.aQ(this.b).a(), (asgt)eqn.aF(this.b).a(), (abji)eqn.ax(this.b).a(), (abmu)eqn.aL(this.b).a(), arjc.b(eqn.aJ(this.b)), (Executor)eqv.fX(this.a).a(), (Executor)eqv.oO(this.a).a(), (abpj)eqv.jv(this.a).a(), null, null, null, null, null, null);
            }
            case 45: {
                return abgv.n();
            }
            case 44: {
                final Context context8 = (Context)eqv.pt(this.a).a();
                final atie atie5 = (atie)eqn.ao(this.b).a();
                abnt.d(atie5);
                return atie5;
            }
            case 43: {
                return new auip((agiy)eqn.ac(this.b).a(), (byte[])null, (byte[])null);
            }
            case 42: {
                return new aboh((asgt)eqn.A(this.b).a(), (asgt)eqn.aQ(this.b).a(), (asgt)eqn.bb(this.b).a());
            }
            case 41: {
                return abgv.o();
            }
            case 40: {
                return aazj.c((asgt)eqn.aQ(this.b).a());
            }
            case 39: {
                final eqn b7 = this.b;
                final abqa e2 = vim.e((tdz)eqv.jp(this.a).a(), (Context)eqv.pt(this.a).a(), (acga)eqv.of(this.a).a(), (ScheduledExecutorService)eqv.oO(this.a).a(), (String)eqv.sP(this.a).a(), (ListenableFuture)eqv.pU(this.a).a(), arjc.b(eqn.aZ(this.b)), (abpj)eqv.jv(this.a).a());
                eqn.bm(b7, e2);
                return e2;
            }
            case 38: {
                final eqn b8 = this.b;
                final Context context9 = (Context)eqv.pt(this.a).a();
                final tdz tdz = (tdz)eqv.jp(this.a).a();
                final yls yls = (yls)eqv.rd(this.a).a();
                final abqa abqa = (abqa)eqn.Y(this.b).a();
                final abto abto = (abto)eqv.nP(this.a).a();
                final aait aait = (aait)eqn.W(this.b).a();
                final abhq abhq2 = (abhq)eqn.ag(this.b).a();
                final abit abit = (abit)eqn.X(this.b).a();
                final auip auip = (auip)eqn.ak(this.b).a();
                final aaim a3 = eqn.a(this.b);
                final absv absv = (absv)eqv.ms(this.a).a();
                final zgv zgv = (zgv)eqv.pV(this.a).a();
                final arud arud2 = (arud)eqv.qo(this.a).a();
                final aeby aeby = (aeby)eqv.tS(this.a).a();
                final abhf abhf = (abhf)eqn.ah(this.b).a();
                eqn.bw(this.b);
                final abji abji = (abji)eqn.ax(this.b).a();
                final aboq aboq = (aboq)eqn.ay(this.b).a();
                final agjt agjt = (agjt)eqn.ad(this.b).a();
                final adbl adbl = (adbl)eqn.at(this.b).a();
                final abmu abmu2 = (abmu)eqn.aL(this.b).a();
                final abno c2 = aboc.c(context9, tdz, yls, abqa, abto, aait, abhq2, abit, auip, a3, absv, zgv, arud2, abhf, abji, aboq, agjt, adbl, (aujp)eqn.bh(this.b).a(), (aujp)eqn.av(this.b).a(), (abob)eqn.am(this.b).a(), (auip)eqn.ae(this.b).a(), (agkb)eqn.ap(this.b).a(), (acga)eqn.V(this.b).a(), (abpj)eqv.jv(this.a).a());
                eqn.br(b8, c2);
                return c2;
            }
            case 37: {
                final adbl yx = eqv.yX(this.a);
                final Executor executor = (Executor)eqv.fX(this.a).a();
                final eqn b9 = this.b;
                return acfi.g(yx, executor, eqn.au(b9), eqn.al(b9), (wvu)eqv.th(this.a).a(), (abpj)eqv.jv(this.a).a());
            }
            case 36: {
                return afdu.w((Object)eqn.bd(this.b).a(), (Object)eqn.aM(this.b).a(), (Object)eqn.aB(this.b).a(), (Object)eqn.aN(this.b).a(), (Object)eqn.az(this.b).a());
            }
            case 35: {
                return abwt.f((vjh)eqv.rU(this.a).a(), (adcr)eqv.pu(this.a).a(), (zki)eqv.pL(this.a).a(), (tgw)eqv.pd(this.a).a());
            }
            case 34: {
                final eqn b10 = this.b;
                final abwm c3 = abwn.c(eqn.aj(b10), (ScheduledExecutorService)eqv.oO(this.a).a(), eqn.bc(this.b), eqv.yX(this.a), (Handler)eqv.sL(this.a).a(), (Executor)eqv.fX(this.a).a(), (arud)eqv.qo(this.a).a(), (abpj)eqv.jv(this.a).a(), (SecureRandom)eqv.rX(this.a).a(), (vhm)eqv.sU(this.a).a(), (wvu)eqv.th(this.a).a());
                eqn.bp(b10, c3);
                return c3;
            }
            case 33: {
                return aboa.e();
            }
            case 32: {
                return aazj.j((atid)eqn.U(this.b).a());
            }
            case 31: {
                return new abpx((yyh)eqv.tv(this.a).a(), (asgt)eqn.A(this.b).a(), (abhr)eqn.af(this.b).a(), (asgt)eqv.pr(this.a).a(), (oas)eqv.gK(this.a).a(), (abxs)eqv.vQ(this.a).a(), (arud)eqv.qo(this.a).a(), (byte[])null, (byte[])null);
            }
            case 30: {
                return abnt.f((abpx)eqn.aO(this.b).a(), (uyf)eqv.po(this.a).a());
            }
            case 29: {
                final afds j = afdu.j(3);
                j.h((Object)eqn.aI(this.b).a());
                j.h((Object)eqn.ai(this.b).a());
                j.j((Iterable)eqn.aq(this.b).a());
                return j.g();
            }
            case 28: {
                return new agiy((tdz)eqv.jp(this.a).a(), (Set)eqn.bj(this.b).a(), (aujp)eqn.aC(this.b).a(), (aujp)eqn.aE(this.b).a(), (aujp)eqn.B(this.b).a(), (aujp)eqn.aR(this.b).a());
            }
            case 27: {
                return new abir((Context)eqv.pt(this.a).a());
            }
            case 26: {
                return aazj.e((absz)eqn.bk(this.b));
            }
            case 25: {
                return new agjt((abme)eqn.aH(this.b).a());
            }
            case 24: {
                return abgv.p();
            }
            case 23: {
                final Context context10 = (Context)eqv.pt(this.a).a();
                final atie atie6 = (atie)eqn.bb(this.b).a();
                abnt.g(atie6);
                return atie6;
            }
            case 22: {
                return new adbl((aujp)eqn.ba(this.b).a(), eqn.bD(this.b), (abji)eqn.ax(this.b).a(), (agjt)eqn.ad(this.b).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 21: {
                final Context context11 = (Context)eqv.pt(this.a).a();
                return new aamd(null, (byte[])null);
            }
            case 20: {
                final Context context12 = (Context)eqv.pt(this.a).a();
                return abnt.c((asho)eqv.fY(this.a).a());
            }
            case 19: {
                return abnt.E((abhr)eqn.af(this.b).a(), (aamd)eqn.ar(this.b).a());
            }
            case 18: {
                final Context context13 = (Context)eqv.pt(this.a).a();
                final atjj ol = eqv.oL(this.a);
                final abhq abhq3 = (abhq)eqn.ag(this.b).a();
                final eqn b11 = this.b;
                return new aait(context13, ol, abhq3, eqn.ax(b11), eqn.at(b11), (abme)eqn.aH(b11).a(), (aukm)eqv.mR(this.a).a(), (agjt)eqn.ad(this.b).a(), (arud)eqv.qo(this.a).a(), arjc.b(eqv.oM(this.a)), arjc.b(eqn.aG(this.b)), (abpj)eqv.jv(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 17: {
                return jcs.l(eqn.bx(this.b));
            }
            case 16: {
                return new abji((tdz)eqv.jp(this.a).a(), arjc.b(eqn.aJ(this.b)), (Handler)eqv.sL(this.a).a(), (tny)eqv.qf(this.a).a(), (ScheduledExecutorService)eqv.pA(this.a).a(), (Executor)eqv.fX(this.a).a(), (abmu)eqn.aL(this.b).a(), eqn.bC(this.b), (arud)eqv.qo(this.a).a(), (uyf)eqv.po(this.a).a(), (abpj)eqv.jv(this.a).a(), (asho)eqv.fP(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 15: {
                return new abit((tdz)eqv.jp(this.a).a());
            }
            case 14: {
                return abgv.d();
            }
            case 13: {
                return abgv.e();
            }
            case 12: {
                return abgv.l();
            }
            case 11: {
                return abgv.k();
            }
            case 10: {
                return abgv.m();
            }
            case 9: {
                return abgv.j();
            }
            case 8: {
                return abgv.g();
            }
            case 7: {
                return abgv.i();
            }
            case 6: {
                return abgv.f();
            }
            case 5: {
                return abgv.h();
            }
            case 4: {
                return wvt.f((atie)eqn.aU(this.b).a(), (atie)eqn.aP(this.b).a(), (atie)eqn.aV(this.b).a(), (atie)eqn.aT(this.b).a(), (atie)eqn.aW(this.b).a(), (atie)eqn.bf(this.b).a(), (atie)eqn.aY(this.b).a(), (atie)eqn.be(this.b).a(), (atie)eqn.ab(this.b).a(), (atie)eqn.aa(this.b).a());
            }
            case 3: {
                return aboa.h();
            }
            case 2: {
                return aazj.k((atid)eqn.aS(this.b).a());
            }
            case 1: {
                return aboa.c();
            }
            case 0: {
                return new abmf(eqn.by(this.b), eqn.bB(this.b), 1, (byte[])null, (byte[])null, (byte[])null);
            }
        }
    }
}
