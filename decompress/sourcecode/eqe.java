import java.util.Set;
import java.security.SecureRandom;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import android.os.Handler;
import java.util.concurrent.Executor;
import j$.util.Optional;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class eqe implements atjj
{
    private final eqv a;
    private final eqf b;
    private final int c;
    
    public eqe(final eqv a, final eqf b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final Object b() {
        final int c = this.c;
        switch (c) {
            default: {
                throw new AssertionError(c);
            }
            case 99: {
                final eqv a = this.a;
                final atjj mn = eqv.mN(a);
                final eqf b = this.b;
                return new adeh(mn, eqf.ay(b), eqf.ao(b), eqf.bF(b), eqf.bE(b), eqf.ap(b), eqf.aP(b), eqf.af(b), eqv.qo(a), eqv.jv(a));
            }
            case 98: {
                return new jdq((adeh)eqf.aC(this.b).a(), eqf.cm(this.b), (aabh)eqf.az(this.b).a(), (aabm)eqf.a(this.b), (arud)eqv.qo(this.a).a(), (afts)eqv.oO(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 97: {
                return new abmf(eqf.cf(this.b), eqf.co(this.b), 1, (byte[])null, (byte[])null, (byte[])null);
            }
            case 96: {
                final eqv a2 = this.a;
                return jcs.q(eqv.ki(a2), eqv.kf(a2), (aawb)eqv.iH(a2).a(), (alm)eqv.wb(this.a).a(), (agls)eqv.tw(this.a).a());
            }
            case 95: {
                return xfb.u((aeby)eqv.nQ(this.a).a());
            }
            case 94: {
                final absm d = vox.d((absi)eqv.kj(this.a).a(), eqv.bc(this.a), (absl)eqv.nZ(this.a).a(), (tdz)eqv.jp(this.a).a());
                eqf.bZ(d);
                return d;
            }
            case 93: {
                final Context context = (Context)eqv.pt(this.a).a();
                final oas oas = (oas)eqv.gK(this.a).a();
                final Executor en = eqv.en(this.a);
                final tdz tdz = (tdz)eqv.jp(this.a).a();
                final eqv a3 = this.a;
                final atjj eo = eqv.eO(a3);
                final atjj uy = eqv.uy(a3);
                final atjj kz = eqv.kZ(a3);
                final asgt asgt = (asgt)eqf.aa(this.b).a();
                final atjj mi = eqv.mi(this.a);
                final abit abit = (abit)eqf.af(this.b).a();
                final eqv a4 = this.a;
                return new xjf(context, oas, en, tdz, eo, uy, kz, asgt, mi, abit, eqv.sU(a4), eqv.wu(a4), eqv.wv(this.a), eqv.ws(this.a), eqv.wt(this.a), (absm)eqf.aM(this.b).a(), (lzi)eqv.ie(this.a).a(), (avt)eqv.mN(this.a).a(), (abxi)eqf.bA(this.b).a(), (uyf)eqv.po(this.a).a(), (ruo)eqv.hK(this.a).a(), (abns)eqf.aS(this.b).a(), (abpj)eqv.jv(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 92: {
                return Optional.of((Object)eqv.pG(this.a).a());
            }
            case 91: {
                return new erj(this.a, this.b, 3);
            }
            case 90: {
                return new aeby(eqf.W(this.b));
            }
            case 89: {
                final Context context2 = (Context)eqv.pt(this.a).a();
                final atid atid = (atid)eqf.bp(this.b).a();
                abnt.l(atid);
                return atid;
            }
            case 88: {
                final Context context3 = (Context)eqv.pt(this.a).a();
                final atid atid2 = (atid)eqf.ac(this.b).a();
                abnt.i(atid2);
                return atid2;
            }
            case 87: {
                final Context context4 = (Context)eqv.pt(this.a).a();
                final atie atie = (atie)eqf.aZ(this.b).a();
                abnt.k(atie);
                return atie;
            }
            case 86: {
                return aboa.f();
            }
            case 85: {
                final Context context5 = (Context)eqv.pt(this.a).a();
                final atie atie2 = (atie)eqf.aX(this.b).a();
                abnt.j(atie2);
                return atie2;
            }
            case 84: {
                return afdu.u((Object)eqv.br(this.a), (Object)eqv.aW(this.a), (Object)eqv.nN(this.a).a());
            }
            case 83: {
                return aboa.k(eqv.aj(this.a));
            }
            case 82: {
                return aboa.l((adbl)eqf.aI(this.b).a());
            }
            case 81: {
                return aboa.p((absg)eqf.aJ(this.b).a(), eqf.U(this.b));
            }
            case 80: {
                return aboa.q((aeim)eqf.ak(this.b).a());
            }
            case 79: {
                return abvu.s((mrm)eqv.qd(this.a).a());
            }
            case 78: {
                return abvs.b();
            }
            case 77: {
                return abjy.p((String)eqv.rY(this.a).a(), (abpj)eqv.jv(this.a).a(), (aajh)eqv.rN(this.a).a());
            }
            case 76: {
                return abwt.e((Executor)eqv.fX(this.a).a(), eqf.aA(this.b), (abpj)eqv.jv(this.a).a(), (wvu)eqv.th(this.a).a());
            }
            case 75: {
                return aazj.I((agjt)eqf.an(this.b).a());
            }
            case 74: {
                return abjy.q((aeyr)eqf.aR(this.b).a(), (abhq)eqf.as(this.b).a(), (aboh)eqf.aH(this.b).a());
            }
            case 73: {
                return yxn.E(eqv.xx(this.a));
            }
            case 72: {
                return zja.K((xuc)eqv.oE(this.a).a(), (abhq)eqf.as(this.b).a());
            }
            case 71: {
                final Context context6 = (Context)eqv.pt(this.a).a();
                final atie atie3 = (atie)eqf.aL(this.b).a();
                abnt.e(atie3);
                return atie3;
            }
            case 70: {
                return aboa.c();
            }
            case 69: {
                final Context context7 = (Context)eqv.pt(this.a).a();
                final atie atie4 = (atie)eqf.bH(this.b).a();
                abnt.h(atie4);
                return atie4;
            }
            case 68: {
                return new itp((abns)eqv.kh(this.a).a());
            }
            case 67: {
                return new itk((abns)eqv.kh(this.a).a());
            }
            case 66: {
                return new itc((abns)eqv.kh(this.a).a(), (asgt)eqv.ub(this.a).a(), (asgt)eqv.vi(this.a).a(), (asgt)eqv.vL(this.a).a());
            }
            case 65: {
                final itj d2 = isw.d((Context)eqv.pt(this.a).a(), (wvu)eqv.th(this.a).a(), (thh)eqv.id(this.a).a(), (abhq)eqv.kg(this.a).a(), (fbj)eqv.fy(this.a).a(), (abns)eqv.kh(this.a).a(), eqv.xW(this.a), eqf.V(this.b));
                eqf.bV(d2);
                return d2;
            }
            case 64: {
                return abjy.n((abpj)eqv.jv(this.a).a(), eqv.nS(this.a).a(), (asgt)eqf.bn(this.b).a());
            }
            case 63: {
                final eqf b2 = this.b;
                final acga b3 = phw.B(eqv.rP(this.a), (asgt)eqf.aa(b2).a(), (asho)eqv.fW(this.a).a(), (abpj)eqv.jv(this.a).a());
                eqf.bX(b2, (Object)b3);
                return b3;
            }
            case 62: {
                return abvq.v(eqv.aA(this.a), (abhr)eqf.ar(this.b).a());
            }
            case 61: {
                final eqf b4 = this.b;
                final arud arud = (arud)eqv.qo(this.a).a();
                final abga r = abjy.r(eqf.cn(this.b));
                eqf.ca(b4, r);
                return r;
            }
            case 60: {
                final zhb k = abqq.k((abtk)eqv.mD(this.a).a(), (aamd)eqf.aG(this.b).a(), (abhq)eqf.as(this.b).a(), (yls)eqv.rd(this.a).a(), (abpj)eqv.jv(this.a).a());
                eqf.ci(k);
                return k;
            }
            case 59: {
                final abpu g = abnt.G(eqf.cs(this.b), (aboh)eqf.aH(this.b).a());
                eqf.bS(g);
                return g;
            }
            case 58: {
                return aazj.g((atie)eqf.bv(this.b).a());
            }
            case 57: {
                final abmu abmu = (abmu)eqf.bg(this.b).a();
                final aajh aajh = (aajh)eqv.rN(this.a).a();
                final Handler handler = (Handler)eqv.sL(this.a).a();
                final arhr b5 = arjc.b(eqf.aA(this.b));
                final asgt asgt2 = (asgt)eqf.bt(this.b).a();
                final asgt asgt3 = (asgt)eqf.bu(this.b).a();
                final asgt asgt4 = (asgt)eqf.br(this.b).a();
                final aboh aboh = (aboh)eqf.aH(this.b).a();
                final eqv a5 = this.a;
                final abml e = wvt.e(abmu, aajh, handler, b5, asgt2, asgt3, asgt4, aboh, eqv.te(a5), eqv.td(a5));
                eqf.cb(e);
                return e;
            }
            case 56: {
                final aawl r2 = aais.r((avt)eqv.mN(this.a).a(), (vhm)eqv.sU(this.a).a(), (Executor)eqv.oO(this.a).a(), (vjl)eqv.kM(this.a).a(), (aboh)eqf.aH(this.b).a());
                eqf.bU(r2);
                return r2;
            }
            case 55: {
                return new adjo((abit)eqf.af(this.b).a(), (abll)eqf.aU(this.b).a(), (abxs)eqv.vQ(this.a).a(), (tdz)eqv.jp(this.a).a(), eqf.X(this.b), (aboh)eqf.aH(this.b).a(), eqf.Y(this.b));
            }
            case 54: {
                final eqf b6 = this.b;
                final aajn c2 = vox.c((yzo)eqv.mo(this.a).a());
                eqf.bT(b6, c2);
                return c2;
            }
            case 53: {
                return aazj.h(eqf.ah(this.b));
            }
            case 52: {
                return zja.k((abno)eqf.aJ(this.b).a(), (abob)eqf.aB(this.b).a());
            }
            case 51: {
                final aaip f = roy.f((abmu)eqf.bg(this.b).a(), (aboh)eqf.aH(this.b).a(), arjc.b(eqf.aA(this.b)), (Executor)eqv.fX(this.a).a(), eqv.te(this.a), (asgt)eqf.aa(this.b).a(), (asgt)eqf.bn(this.b).a(), (asgt)eqf.bC(this.b).a(), (abhr)eqf.ar(this.b).a());
                eqf.bQ(f);
                return f;
            }
            case 50: {
                return aboa.g();
            }
            case 49: {
                final Context context8 = (Context)eqv.pt(this.a).a();
                final abhq abhq = (abhq)eqv.kg(this.a).a();
                final zki zki = (zki)eqv.pL(this.a).a();
                final eqv a6 = this.a;
                return jcs.u(context8, abhq, zki, eqv.kc(a6), (aeby)eqv.nM(a6).a(), (oas)eqv.gK(this.a).a(), (uyf)eqv.po(this.a).a(), (arud)eqv.qo(this.a).a());
            }
            case 48: {
                return new aboq((vhm)eqv.sU(this.a).a(), (abmu)eqf.bg(this.b).a(), (abll)eqf.aU(this.b).a(), (agjt)eqf.an(this.b).a(), (Executor)eqv.oO(this.a).a(), (Executor)eqv.fX(this.a).a(), (arud)eqv.qo(this.a).a(), eqf.cq(this.b), (abji)eqf.aN(this.b).a(), (abpj)eqv.jv(this.a).a(), eqf.cp(this.b), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 47: {
                return new abhf((avt)eqv.mN(this.a).a(), (aboq)eqf.aO(this.b).a(), (asgt)eqf.bn(this.b).a(), (asgt)eqf.aZ(this.b).a(), (abji)eqf.aN(this.b).a(), (abmu)eqf.bg(this.b).a(), arjc.b(eqf.ah(this.b)), (Executor)eqv.fX(this.a).a(), (Executor)eqv.oO(this.a).a(), (abpj)eqv.jv(this.a).a(), null, null, null, null, null, null);
            }
            case 46: {
                return abgv.n();
            }
            case 45: {
                final Context context9 = (Context)eqv.pt(this.a).a();
                final atie atie5 = (atie)eqf.aD(this.b).a();
                abnt.d(atie5);
                return atie5;
            }
            case 44: {
                return new auip((agiy)eqf.am(this.b).a(), (byte[])null, (byte[])null);
            }
            case 43: {
                return new abit((tdz)eqv.jp(this.a).a());
            }
            case 42: {
                return new aaiu((abme)eqf.aV(this.b).a());
            }
            case 41: {
                return xhw.d((wzw)eqv.qL(this.a).a(), arjc.b(eqf.al(this.b)));
            }
            case 40: {
                return new agjt((abme)eqf.aV(this.b).a());
            }
            case 39: {
                final Context context10 = (Context)eqv.pt(this.a).a();
                final atie atie6 = (atie)eqf.by(this.b).a();
                abnt.g(atie6);
                return atie6;
            }
            case 38: {
                return new adbl((aujp)eqf.bx(this.b).a(), eqf.cq(this.b), (abji)eqf.aN(this.b).a(), (agjt)eqf.an(this.b).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 37: {
                return abgv.d();
            }
            case 36: {
                return abgv.e();
            }
            case 35: {
                return abgv.l();
            }
            case 34: {
                return abgv.k();
            }
            case 33: {
                return abgv.m();
            }
            case 32: {
                return abgv.j();
            }
            case 31: {
                return abgv.g();
            }
            case 30: {
                return abgv.i();
            }
            case 29: {
                return abgv.f();
            }
            case 28: {
                return abgv.h();
            }
            case 27: {
                return wvt.f((atie)eqf.br(this.b).a(), (atie)eqf.bm(this.b).a(), (atie)eqf.bs(this.b).a(), (atie)eqf.bq(this.b).a(), (atie)eqf.bt(this.b).a(), (atie)eqf.bD(this.b).a(), (atie)eqf.bv(this.b).a(), (atie)eqf.bC(this.b).a(), (atie)eqf.aj(this.b).a(), (atie)eqf.ai(this.b).a());
            }
            case 26: {
                return new abji((tdz)eqv.jp(this.a).a(), arjc.b(eqf.ah(this.b)), (Handler)eqv.sL(this.a).a(), (tny)eqv.qf(this.a).a(), (ScheduledExecutorService)eqv.pA(this.a).a(), (Executor)eqv.fX(this.a).a(), (abmu)eqf.bg(this.b).a(), eqf.cp(this.b), (arud)eqv.qo(this.a).a(), (uyf)eqv.po(this.a).a(), (abpj)eqv.jv(this.a).a(), (asho)eqv.fP(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 25: {
                final Context context11 = (Context)eqv.pt(this.a).a();
                return new aamd(null, (byte[])null);
            }
            case 24: {
                return abnt.E((abhr)eqf.ar(this.b).a(), (aamd)eqf.aG(this.b).a());
            }
            case 23: {
                final Context context12 = (Context)eqv.pt(this.a).a();
                final atjj ol = eqv.oL(this.a);
                final abhq abhq2 = (abhq)eqf.as(this.b).a();
                final eqf b7 = this.b;
                return new aait(context12, ol, abhq2, eqf.aN(b7), eqf.aI(b7), (abme)eqf.aV(b7).a(), (aukm)eqv.mR(this.a).a(), (agjt)eqf.an(this.b).a(), (arud)eqv.qo(this.a).a(), arjc.b(eqv.oM(this.a)), arjc.b(eqf.ba(this.b)), (abpj)eqv.jv(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 22: {
                return abgv.p();
            }
            case 21: {
                return new aboh((asgt)eqf.aa(this.b).a(), (asgt)eqf.bn(this.b).a(), (asgt)eqf.by(this.b).a());
            }
            case 20: {
                return abgv.o();
            }
            case 19: {
                return aboa.h();
            }
            case 18: {
                return aazj.k((atid)eqf.bp(this.b).a());
            }
            case 17: {
                return aazj.c((asgt)eqf.bn(this.b).a());
            }
            case 16: {
                final eqf b8 = this.b;
                final abqa e2 = vim.e((tdz)eqv.jp(this.a).a(), (Context)eqv.pt(this.a).a(), (acga)eqv.of(this.a).a(), (ScheduledExecutorService)eqv.oO(this.a).a(), (String)eqv.sP(this.a).a(), (ListenableFuture)eqv.pU(this.a).a(), arjc.b(eqf.bw(this.b)), (abpj)eqv.jv(this.a).a());
                eqf.bR(b8, e2);
                return e2;
            }
            case 15: {
                final eqf b9 = this.b;
                final Context context13 = (Context)eqv.pt(this.a).a();
                final tdz tdz2 = (tdz)eqv.jp(this.a).a();
                final yls yls = (yls)eqv.rd(this.a).a();
                final abqa abqa = (abqa)eqf.ag(this.b).a();
                final abto abto = (abto)eqv.nP(this.a).a();
                final aait aait = (aait)eqf.ae(this.b).a();
                final abhq abhq3 = (abhq)eqf.as(this.b).a();
                final abit abit2 = (abit)eqf.af(this.b).a();
                final auip auip = (auip)eqf.ax(this.b).a();
                final aaim b10 = eqf.b(this.b);
                final absv absv = (absv)eqv.ms(this.a).a();
                final zgv zgv = (zgv)eqv.pV(this.a).a();
                final arud arud2 = (arud)eqv.qo(this.a).a();
                final aeby aeby = (aeby)eqv.tS(this.a).a();
                final abhf abhf = (abhf)eqf.at(this.b).a();
                eqf.cc(this.b);
                final abji abji = (abji)eqf.aN(this.b).a();
                final aboq aboq = (aboq)eqf.aO(this.b).a();
                final agjt agjt = (agjt)eqf.an(this.b).a();
                final adbl adbl = (adbl)eqf.aI(this.b).a();
                final abmu abmu2 = (abmu)eqf.bg(this.b).a();
                final abno c3 = aboc.c(context13, tdz2, yls, abqa, abto, aait, abhq3, abit2, auip, b10, absv, zgv, arud2, abhf, abji, aboq, agjt, adbl, (aujp)eqf.bG(this.b).a(), (aujp)eqf.aK(this.b).a(), (abob)eqf.aB(this.b).a(), (auip)eqf.aq(this.b).a(), (agkb)eqf.aE(this.b).a(), (acga)eqf.ad(this.b).a(), (abpj)eqv.jv(this.a).a());
                eqf.bY(b9, c3);
                return c3;
            }
            case 14: {
                final adbl yx = eqv.yX(this.a);
                final Executor executor = (Executor)eqv.fX(this.a).a();
                final eqf b11 = this.b;
                return acfi.g(yx, executor, eqf.aJ(b11), eqf.aA(b11), (wvu)eqv.th(this.a).a(), (abpj)eqv.jv(this.a).a());
            }
            case 13: {
                return afdu.x((Object)eqf.bB(this.b).a(), (Object)eqf.bj(this.b).a(), (Object)eqf.aT(this.b).a(), (Object)eqf.bk(this.b).a(), (Object)eqf.aQ(this.b).a(), (Object)eqf.bc(this.b).a(), (Object[])new abwq[0]);
            }
            case 12: {
                return abwt.f((vjh)eqv.rU(this.a).a(), (adcr)eqv.pu(this.a).a(), (zki)eqv.pL(this.a).a(), (tgw)eqv.pd(this.a).a());
            }
            case 11: {
                final eqf b12 = this.b;
                final abwm c4 = abwn.c(eqf.aw(b12), (ScheduledExecutorService)eqv.oO(this.a).a(), eqf.bz(this.b), eqv.yX(this.a), (Handler)eqv.sL(this.a).a(), (Executor)eqv.fX(this.a).a(), (arud)eqv.qo(this.a).a(), (abpj)eqv.jv(this.a).a(), (SecureRandom)eqv.rX(this.a).a(), (vhm)eqv.sU(this.a).a(), (wvu)eqv.th(this.a).a());
                eqf.bW(b12, c4);
                return c4;
            }
            case 10: {
                final Context context14 = (Context)eqv.pt(this.a).a();
                return abnt.c((asho)eqv.fY(this.a).a());
            }
            case 9: {
                return aboa.e();
            }
            case 8: {
                return aazj.j((atid)eqf.ac(this.b).a());
            }
            case 7: {
                return new abpx((yyh)eqv.tv(this.a).a(), (asgt)eqf.aa(this.b).a(), (abhr)eqf.ar(this.b).a(), (asgt)eqv.pr(this.a).a(), (oas)eqv.gK(this.a).a(), (abxs)eqv.vQ(this.a).a(), (arud)eqv.qo(this.a).a(), (byte[])null, (byte[])null);
            }
            case 6: {
                return abnt.f((abpx)eqf.bl(this.b).a(), (uyf)eqv.po(this.a).a());
            }
            case 5: {
                final afds j = afdu.j(3);
                j.h((Object)eqf.bd(this.b).a());
                j.h((Object)eqf.av(this.b).a());
                j.j((Iterable)eqf.aF(this.b).a());
                return j.g();
            }
            case 4: {
                return new agiy((tdz)eqv.jp(this.a).a(), (Set)eqf.bI(this.b).a(), (aujp)eqf.aW(this.b).a(), (aujp)eqf.aY(this.b).a(), (aujp)eqf.ab(this.b).a(), (aujp)eqf.bo(this.b).a());
            }
            case 3: {
                return new abir((Context)eqv.pt(this.a).a());
            }
            case 2: {
                return xfb.l((absz)eqf.bP(this.b), (xjf)eqf.au(this.b).a(), eqv.mi(this.a), (abhq)eqf.as(this.b).a());
            }
            case 1: {
                return new jds((abme)eqf.aV(this.b).a(), eqf.co(this.b), (abeg)eqf.bb(this.b).a(), arjc.b(eqv.re(this.a)), (uyi)eqv.lv(this.a).a(), (asho)eqv.fY(this.a).a(), (elw)eqv.vA(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 0: {
                final arhr b13 = arjc.b(eqv.ki(this.a));
                final eqf b14 = this.b;
                return fng.c(b13, eqf.bi(b14), eqf.bf(b14), arjc.b(eqf.bh(b14)), arjc.b(eqf.be(this.b)), (uyf)eqv.po(this.a).a());
            }
        }
    }
    
    @Override
    public final Object a() {
        final int c = this.c;
        if (c / 100 != 0) {
            Object o = null;
            switch (c) {
                default: {
                    throw new AssertionError(c);
                }
                case 121: {
                    o = new uyi((uyf)this.a.w.a(), (arud)this.a.v.a(), (byte[])null, (byte[])null);
                    break;
                }
                case 120: {
                    o = atig.aD();
                    break;
                }
                case 119: {
                    o = atig.aD();
                    break;
                }
                case 118: {
                    o = atig.aD();
                    break;
                }
                case 117: {
                    o = new aaxx((asgt)this.b.d.a(), (asgt)this.b.b.a(), this.b.o, (Executor)this.a.g.a(), (aujp)this.b.q.a(), (aujp)this.b.r.a(), (aujp)this.b.s.a(), (absg)this.b.j.a(), this.b.t);
                    break;
                }
                case 116: {
                    o = aajj.v((abno)this.b.j.a(), (abme)this.b.g.a());
                    break;
                }
                case 115: {
                    o = aajj.z((agjt)this.b.h.a());
                    break;
                }
                case 114: {
                    o = aajj.w((aajn)this.b.l.a());
                    break;
                }
                case 113: {
                    o = aboa.o();
                    break;
                }
                case 112: {
                    final eqf b = this.b;
                    final atjj j = b.j;
                    final atjj k = b.k;
                    final tox tox = (tox)this.a.dj.a();
                    final abhq abhq = (abhq)this.b.f.a();
                    final aamd aamd = (aamd)this.b.p.a();
                    final eqf b2 = this.b;
                    final aajs d = aajt.d((oas)b2.a.e.a(), (wyo)b2.a.cB.a(), (avt)b2.a.bx.a());
                    d.a((asgt)b2.d.a(), (asgt)b2.b.a());
                    o = new absi(j, k, tox, abhq, aamd, d, (aujp)this.a.pp.a(), (byte[])null);
                    break;
                }
                case 111: {
                    o = zja.j((asgt)this.b.m.a(), (asho)this.a.dO.a());
                    break;
                }
                case 110: {
                    final eqv a = this.b.a;
                    o = new jdv(new hyc(a.pY, a.pW, a.v, a.pV), 1, (byte[])null);
                    break;
                }
                case 109: {
                    o = new aaau(zyg.v((avt)this.b.a.bx.a()), (avt)this.a.bx.a(), this.a.xp(), null, null, null, null, null, null);
                    break;
                }
                case 108: {
                    o = new aaiw();
                    break;
                }
                case 107: {
                    final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)this.a.r.a();
                    final atjj el = this.a.el;
                    final eqf b3 = this.b;
                    final oas oas = (oas)b3.a.e.a();
                    final aaha aaha = (aaha)b3.a.eq.a();
                    final eqv a2 = b3.a;
                    final atjj eh = a2.eh;
                    final vcf vcf = (vcf)a2.fE.a();
                    final zki zki = (zki)b3.a.aC.a();
                    final eqv a3 = b3.a;
                    o = new aabh(scheduledExecutorService, el, new adjo(oas, aaha, eh, vcf, zki, a3.gj, (aahb)a3.pQ.a()), (tny)this.a.it.a(), (fzo)this.a.pR.a(), (arud)this.a.v.a(), this.a.xp(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                    break;
                }
                case 106: {
                    final oas oas2 = (oas)this.a.e.a();
                    final eqv a4 = this.b.a;
                    o = abjs.d(oas2, new aamd(a4.gj, a4.iu, (byte[])null, null), new aeby(this.b.a.gp, (char[])null), (asho)this.a.bf.a(), (Executor)this.a.r.a(), (yyh)this.a.eY.a(), (abpj)this.a.eb.a(), (arud)this.a.v.a());
                    break;
                }
                case 105: {
                    o = zja.h((oas)this.a.e.a(), (tdz)this.a.h.a());
                    break;
                }
                case 104: {
                    o = wvt.u((tdz)this.a.h.a(), (vjh)this.a.fH.a(), (adcr)this.a.eQ.a(), (zki)this.a.aC.a(), (abke)this.a.fX.a(), this.b.Z(), (vuu)this.a.kM.a(), (arud)this.a.v.a(), this.a.aF(), (abpj)this.a.eb.a());
                    break;
                }
                case 103: {
                    o = abjy.s((tdz)this.a.h.a(), (vut)this.a.kN.a(), (vuu)this.a.kM.a());
                    break;
                }
                case 102: {
                    o = zja.h((oas)this.a.e.a(), (tdz)this.a.h.a());
                    break;
                }
                case 101: {
                    o = new abjn((abhs)this.b.f.a(), (abit)this.b.i.a());
                    break;
                }
                case 100: {
                    final tdz tdz = (tdz)this.a.h.a();
                    final abjm abjm = (abjm)this.a.iA.a();
                    final abke abke = (abke)this.a.fX.a();
                    final eqv a5 = this.a;
                    o = new aaax(tdz, abjm, abke, a5.el, a5.gj, a5.eh, (Executor)a5.r.a(), (Executor)this.a.g.a(), this.b.Z(), (arud)this.a.v.a(), (oas)this.a.e.a(), (aeby)this.a.iB.a(), (avt)this.a.eS.a(), (aamd)this.a.ej.a(), (aaha)this.a.eq.a(), (abpj)this.a.eb.a(), (abjk)this.a.pP.a(), null, null, null, null, null, null, null);
                    break;
                }
            }
            return o;
        }
        return this.b();
    }
}
