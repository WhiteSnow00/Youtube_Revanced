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

final class eqt implements atke
{
    private final eqy a;
    private final equ b;
    private final int c;
    
    public eqt(final eqy a, final equ b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a() {
        switch (this.c) {
            default: {
                return abph.F((abpq)equ.aw(this.b).a(), (aboe)equ.aJ(this.b).a());
            }
            case 95: {
                return abep.J((aglu)equ.ae(this.b).a());
            }
            case 94: {
                return abep.H((aalh)equ.aa(this.b).a());
            }
            case 93: {
                return abpb.u();
            }
            case 92: {
                final equ b = this.b;
                return new abuj(equ.aw(b), equ.an(b), (trc)eqy.vM(this.a).a(), (abjj)equ.ah(this.b).a(), (aanx)equ.ap(this.b).a(), equ.b(this.b), (aukf)eqy.vK(this.a).a(), (byte[])null, (byte[])null);
            }
            case 91: {
                return abph.d((ashi)equ.aY(this.b).a(), (asid)eqy.fU(this.a).a());
            }
            case 90: {
                final abun q = vnb.q((abuj)eqy.ki(this.a).a(), eqy.yO(this.a), (abum)eqy.nY(this.a).a(), (tgd)eqy.jn(this.a).a());
                equ.bt(q);
                return q;
            }
            case 89: {
                return Optional.of((Object)eqy.pF(this.a).a());
            }
            case 88: {
                return new erm(this.a, this.b, 2);
            }
            case 87: {
                return new aeea(equ.d(this.b));
            }
            case 86: {
                final Context context = (Context)eqy.ps(this.a).a();
                final ativ ativ = (ativ)equ.aT(this.b).a();
                abph.m(ativ);
                return ativ;
            }
            case 85: {
                final Context context2 = (Context)eqy.ps(this.a).a();
                final ativ ativ2 = (ativ)equ.V(this.b).a();
                abph.j(ativ2);
                return ativ2;
            }
            case 84: {
                final Context context3 = (Context)eqy.ps(this.a).a();
                final atiw atiw = (atiw)equ.aH(this.b).a();
                abph.l(atiw);
                return atiw;
            }
            case 83: {
                return abpb.o();
            }
            case 82: {
                final Context context4 = (Context)eqy.ps(this.a).a();
                final atiw atiw2 = (atiw)equ.aF(this.b).a();
                abph.k(atiw2);
                return atiw2;
            }
            case 81: {
                return afft.u((Object)eqy.bp(this.a), (Object)eqy.aV(this.a), (Object)eqy.nM(this.a).a());
            }
            case 80: {
                return abxy.s((mdp)eqy.qc(this.a).a());
            }
            case 79: {
                return abzn.b();
            }
            case 78: {
                return ably.r((String)eqy.rW(this.a).a(), (abrj)eqy.jt(this.a).a(), (aalc)eqy.rL(this.a).a());
            }
            case 77: {
                return abyw.e((Executor)eqy.fT(this.a).a(), equ.an(this.b), (abrj)eqy.jt(this.a).a(), (wxx)eqy.tf(this.a).a());
            }
            case 76: {
                return abep.I((aglu)equ.ae(this.b).a());
            }
            case 75: {
                return ably.o((afaq)equ.aC(this.b).a(), (abjj)equ.ah(this.b).a(), (abqg)equ.au(this.b).a());
            }
            case 74: {
                return zhw.E((vai)eqy.gD(this.a).a());
            }
            case 73: {
                return abph.I((xvz)eqy.oD(this.a).a(), (abjj)equ.ah(this.b).a());
            }
            case 72: {
                final Context context5 = (Context)eqy.ps(this.a).a();
                final atiw atiw3 = (atiw)equ.ay(this.b).a();
                abph.f(atiw3);
                return atiw3;
            }
            case 71: {
                return abpb.k();
            }
            case 70: {
                final Context context6 = (Context)eqy.ps(this.a).a();
                final atiw atiw4 = (atiw)equ.bj(this.b).a();
                abph.i(atiw4);
                return atiw4;
            }
            case 69: {
                return ably.p((abrj)eqy.jt(this.a).a(), eqy.nR(this.a).a(), (ashi)equ.aR(this.b).a());
            }
            case 68: {
                final equ b2 = this.b;
                final acid b3 = pjg.B(eqy.rN(this.a), (ashi)equ.T(b2).a(), (asid)eqy.fS(this.a).a(), (abrj)eqy.jt(this.a).a());
                equ.br(b2, (Object)b3);
                return b3;
            }
            case 67: {
                return abxq.z(eqy.az(this.a), (ablw)equ.ag(this.b).a());
            }
            case 66: {
                final equ b4 = this.b;
                final arwh arwh = (arwh)eqy.qn(this.a).a();
                final abhu s = ably.s(equ.bC(this.b));
                equ.bu(b4, s);
                return s;
            }
            case 65: {
                final ziy k = absr.k((abvm)eqy.mC(this.a).a(), (aanx)equ.at(this.b).a(), (abjj)equ.ah(this.b).a(), (ynp)eqy.rc(this.a).a(), (abrj)eqy.jt(this.a).a());
                equ.bz(k);
                return k;
            }
            case 64: {
                final abru h = abph.H(equ.bE(this.b), (abqg)equ.au(this.b).a());
                equ.bo(h);
                return h;
            }
            case 63: {
                return abep.g((atiw)equ.aZ(this.b).a());
            }
            case 62: {
                final abou abou = (abou)equ.aM(this.b).a();
                final aalc aalc = (aalc)eqy.rL(this.a).a();
                final Handler handler = (Handler)eqy.sJ(this.a).a();
                final arkg b5 = arlr.b(equ.an(this.b));
                final ashi ashi = (ashi)equ.aX(this.b).a();
                final ashi ashi2 = (ashi)equ.aY(this.b).a();
                final ashi ashi3 = (ashi)equ.aV(this.b).a();
                final abqg abqg = (abqg)equ.au(this.b).a();
                final eqy a = this.a;
                final abol e = wxw.e(abou, aalc, handler, b5, ashi, ashi2, ashi3, abqg, eqy.tc(a), eqy.tb(a));
                equ.bw(e);
                return e;
            }
            case 61: {
                return new adlp((abkl)equ.Y(this.b).a(), (abnl)equ.bh(this.b).a(), (abzv)eqy.vP(this.a).a(), (tgd)eqy.jn(this.a).a(), equ.y(this.b), (abqg)equ.au(this.b).a(), (Set)afft.r());
            }
            case 60: {
                final equ b6 = this.b;
                final aalh c = vnb.c((zbh)eqy.mo(this.a).a());
                equ.bp(b6, c);
                return c;
            }
            case 59: {
                return abep.h(equ.aL(this.b));
            }
            case 58: {
                return abph.b((abpq)equ.aw(this.b).a(), (abqb)equ.ao(this.b).a());
            }
            case 57: {
                final aakk q2 = rra.q((abou)equ.aM(this.b).a(), (abqg)equ.au(this.b).a(), arlr.b(equ.an(this.b)), (Executor)eqy.fT(this.a).a(), eqy.tc(this.a), (ashi)equ.T(this.b).a(), (ashi)equ.aR(this.b).a(), (ashi)equ.bf(this.b).a(), (ablw)equ.ag(this.b).a());
                equ.bm(q2);
                return q2;
            }
            case 56: {
                return abpb.p();
            }
            case 55: {
                final Context context7 = (Context)eqy.ps(this.a).a();
                final abjj abjj = (abjj)equ.ah(this.b).a();
                final zmf zmf = (zmf)eqy.pK(this.a).a();
                final eqy a2 = this.a;
                final abnp t = abaq.t(context7, abjj, zmf, eqy.kb(a2), (aeea)eqy.nL(a2).a());
                equ.bv(t);
                return t;
            }
            case 54: {
                return new abqp((vjm)eqy.sS(this.a).a(), (abou)equ.aM(this.b).a(), (abnl)equ.bh(this.b).a(), (aglu)equ.ae(this.b).a(), (Executor)eqy.oN(this.a).a(), (Executor)eqy.fT(this.a).a(), (arwh)eqy.qn(this.a).a(), equ.bB(this.b), (ablh)equ.az(this.b).a(), (abrj)eqy.jt(this.a).a(), equ.bA(this.b), null, null, null, null, null);
            }
            case 53: {
                return new abiy((msr)eqy.mM(this.a).a(), (abqp)equ.aA(this.b).a(), (ashi)equ.aR(this.b).a(), (ashi)equ.aH(this.b).a(), (ablh)equ.az(this.b).a(), (abou)equ.aM(this.b).a(), arlr.b(equ.ai(this.b)), (Executor)eqy.fT(this.a).a(), (Executor)eqy.oN(this.a).a(), (abrj)eqy.jt(this.a).a(), (byte[])null, (byte[])null);
            }
            case 52: {
                return abpb.h();
            }
            case 51: {
                final Context context8 = (Context)eqy.ps(this.a).a();
                final atiw atiw5 = (atiw)equ.aq(this.b).a();
                abph.e(atiw5);
                return atiw5;
            }
            case 50: {
                return new aujg((agkz)equ.ad(this.b).a(), (byte[])null, (byte[])null);
            }
            case 49: {
                return new aakp((aboe)equ.aJ(this.b).a());
            }
            case 48: {
                return new aglu((aboe)equ.aJ(this.b).a());
            }
            case 47: {
                final Context context9 = (Context)eqy.ps(this.a).a();
                final atiw atiw6 = (atiw)equ.bc(this.b).a();
                abph.h(atiw6);
                return atiw6;
            }
            case 46: {
                return new addo((aukf)equ.bb(this.b).a(), equ.bB(this.b), (ablh)equ.az(this.b).a(), (aglu)equ.ae(this.b).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 45: {
                return abaq.i();
            }
            case 44: {
                return abaq.j();
            }
            case 43: {
                return abpb.f();
            }
            case 42: {
                return abpb.e();
            }
            case 41: {
                return abpb.g();
            }
            case 40: {
                return abpb.d();
            }
            case 39: {
                return abaq.l();
            }
            case 38: {
                return abpb.b();
            }
            case 37: {
                return abaq.k();
            }
            case 36: {
                return abpb.c();
            }
            case 35: {
                return wxw.f((atiw)equ.aV(this.b).a(), (atiw)equ.aQ(this.b).a(), (atiw)equ.aW(this.b).a(), (atiw)equ.aU(this.b).a(), (atiw)equ.aX(this.b).a(), (atiw)equ.bg(this.b).a(), (atiw)equ.aZ(this.b).a(), (atiw)equ.bf(this.b).a(), (atiw)equ.ac(this.b).a(), (atiw)equ.ab(this.b).a());
            }
            case 34: {
                return ablq.d((asid)eqy.fJ(this.a).a(), (Executor)eqy.oN(this.a).a(), (abrj)eqy.jt(this.a).a(), (arwh)eqy.qn(this.a).a());
            }
            case 33: {
                return zih.h((oby)eqy.gH(this.a).a(), (tgd)eqy.jn(this.a).a());
            }
            case 32: {
                return uzb.f((tgd)eqy.jn(this.a).a(), (vln)eqy.rS(this.a).a(), (aeea)eqy.pt(this.a).a(), (zmf)eqy.pK(this.a).a(), equ.A(this.b), (abmg)eqy.od(this.a).a(), equ.z(this.b), (vwu)eqy.vZ(this.a).a(), (arwh)eqy.qn(this.a).a(), eqy.aD(this.a), (abrj)eqy.jt(this.a).a());
            }
            case 31: {
                return ably.t((tgd)eqy.jn(this.a).a(), (vwt)eqy.vY(this.a).a(), (vwu)eqy.vZ(this.a).a());
            }
            case 30: {
                return zih.h((oby)eqy.gH(this.a).a(), (tgd)eqy.jn(this.a).a());
            }
            case 29: {
                return new abkl((tgd)eqy.jn(this.a).a());
            }
            case 28: {
                return new ablm((abjk)equ.ah(this.b).a(), (abkl)equ.Y(this.b).a());
            }
            case 27: {
                return new abkz((tgd)eqy.jn(this.a).a(), (abll)eqy.oc(this.a).a(), (abmg)eqy.od(this.a).a(), (Executor)eqy.oN(this.a).a(), (Executor)eqy.fT(this.a).a(), equ.z(this.b), (oby)eqy.gH(this.a).a(), (arwh)eqy.qn(this.a).a(), (abrj)eqy.jt(this.a).a(), (msr)eqy.mM(this.a).a(), (ablj)eqy.ob(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 26: {
                return abep.f(equ.c(this.b));
            }
            case 25: {
                return new ablh((tgd)eqy.jn(this.a).a(), arlr.b(equ.ai(this.b)), (Handler)eqy.sJ(this.a).a(), (asid)eqy.fU(this.a).a(), (tqd)eqy.qe(this.a).a(), (ScheduledExecutorService)eqy.pz(this.a).a(), (Executor)eqy.fT(this.a).a(), (abou)equ.aM(this.b).a(), equ.bA(this.b), (ashi)equ.T(this.b).a(), (arwh)eqy.qn(this.a).a(), (vaf)eqy.pn(this.a).a(), (abrj)eqy.jt(this.a).a(), (asid)eqy.fL(this.a).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 24: {
                final Context context10 = (Context)eqy.ps(this.a).a();
                return new aanx(null, (byte[])null);
            }
            case 23: {
                return abph.G((ablw)equ.ag(this.b).a(), (aanx)equ.at(this.b).a());
            }
            case 22: {
                final Context context11 = (Context)eqy.ps(this.a).a();
                final atke ok = eqy.oK(this.a);
                final abjj abjj2 = (abjj)equ.ah(this.b).a();
                final equ b7 = this.b;
                return new aakn(context11, ok, abjj2, equ.az(b7), equ.av(b7), (aboe)equ.aJ(b7).a(), (aulc)eqy.mQ(this.a).a(), (aglu)equ.ae(this.b).a(), (arwh)eqy.qn(this.a).a(), arlr.b(eqy.oL(this.a)), arlr.b(equ.aI(this.b)), (abrj)eqy.jt(this.a).a(), null, null, null, null);
            }
            case 21: {
                return abpb.j();
            }
            case 20: {
                return new abqg((ashi)equ.T(this.b).a(), (ashi)equ.aR(this.b).a(), (ashi)equ.bc(this.b).a());
            }
            case 19: {
                return abpb.i();
            }
            case 18: {
                return abpb.q();
            }
            case 17: {
                return abep.k((ativ)equ.aT(this.b).a());
            }
            case 16: {
                return abep.c((ashi)equ.aR(this.b).a());
            }
            case 15: {
                final equ b8 = this.b;
                final absb f = vkp.f((tgd)eqy.jn(this.a).a(), (Context)eqy.ps(this.a).a(), (acid)eqy.oe(this.a).a(), (ScheduledExecutorService)eqy.oN(this.a).a(), (String)eqy.sN(this.a).a(), (ListenableFuture)eqy.pT(this.a).a(), arlr.b(equ.ba(this.b)), (abrj)eqy.jt(this.a).a());
                equ.bn(b8, f);
                return f;
            }
            case 14: {
                final equ b9 = this.b;
                final Context context12 = (Context)eqy.ps(this.a).a();
                final tgd tgd = (tgd)eqy.jn(this.a).a();
                final ynp ynp = (ynp)eqy.rc(this.a).a();
                final absb absb = (absb)equ.Z(this.b).a();
                final abvr abvr = (abvr)eqy.nO(this.a).a();
                final aakn aakn = (aakn)equ.X(this.b).a();
                final abjj abjj3 = (abjj)equ.ah(this.b).a();
                final abkl abkl = (abkl)equ.Y(this.b).a();
                final aujg aujg = (aujg)equ.am(this.b).a();
                final aakg a3 = equ.a(this.b);
                final abux abux = (abux)eqy.ms(this.a).a();
                final zis zis = (zis)eqy.pU(this.a).a();
                final arwh arwh2 = (arwh)eqy.qn(this.a).a();
                final adet adet = (adet)eqy.tQ(this.a).a();
                final abiy abiy = (abiy)equ.aj(this.b).a();
                equ.bx(this.b);
                final ablh ablh = (ablh)equ.az(this.b).a();
                final abqp abqp = (abqp)equ.aA(this.b).a();
                final aglu aglu = (aglu)equ.ae(this.b).a();
                final addo addo = (addo)equ.av(this.b).a();
                final abou abou2 = (abou)equ.aM(this.b).a();
                final abpq c2 = abqc.c(context12, tgd, ynp, absb, abvr, aakn, abjj3, abkl, aujg, a3, abux, zis, arwh2, abiy, ablh, abqp, aglu, addo, (aukf)equ.bi(this.b).a(), (aukf)equ.ax(this.b).a(), (abqb)equ.ao(this.b).a(), (aujg)equ.af(this.b).a(), (agmc)equ.ar(this.b).a(), (acid)equ.W(this.b).a(), (abrj)eqy.jt(this.a).a());
                equ.bs(b9, c2);
                return c2;
            }
            case 13: {
                final addo yv = eqy.yV(this.a);
                final Executor executor = (Executor)eqy.fT(this.a).a();
                final equ b10 = this.b;
                return abvc.j(yv, executor, equ.aw(b10), equ.an(b10), (wxx)eqy.tf(this.a).a(), (abrj)eqy.jt(this.a).a());
            }
            case 12: {
                return afft.w((Object)equ.be(this.b).a(), (Object)equ.aN(this.b).a(), (Object)equ.aD(this.b).a(), (Object)equ.aO(this.b).a(), (Object)equ.aB(this.b).a());
            }
            case 11: {
                return abyw.f((vln)eqy.rS(this.a).a(), (aeea)eqy.pt(this.a).a(), (zmf)eqy.pK(this.a).a(), (tjb)eqy.pc(this.a).a());
            }
            case 10: {
                final equ b11 = this.b;
                final abyp c3 = abyq.c(equ.al(b11), (ScheduledExecutorService)eqy.oN(this.a).a(), equ.bd(this.b), eqy.yV(this.a), (Handler)eqy.sJ(this.a).a(), (Executor)eqy.fT(this.a).a(), (arwh)eqy.qn(this.a).a(), (abrj)eqy.jt(this.a).a(), (SecureRandom)eqy.rV(this.a).a(), (vjm)eqy.sS(this.a).a(), (wxx)eqy.tf(this.a).a());
                equ.bq(b11, c3);
                return c3;
            }
            case 9: {
                final Context context13 = (Context)eqy.ps(this.a).a();
                return abph.D((asid)eqy.fU(this.a).a());
            }
            case 8: {
                return abpb.n();
            }
            case 7: {
                return abep.j((ativ)equ.V(this.b).a());
            }
            case 6: {
                return new abry((zab)eqy.tt(this.a).a(), (ashi)equ.T(this.b).a(), (ablw)equ.ag(this.b).a(), (ashi)eqy.pq(this.a).a(), (oby)eqy.gH(this.a).a(), (abzv)eqy.vP(this.a).a(), (arwh)eqy.qn(this.a).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 5: {
                return abph.g((abry)equ.aP(this.b).a(), (vaf)eqy.pn(this.a).a());
            }
            case 4: {
                final affr j = afft.j(3);
                j.h((Object)equ.aK(this.b).a());
                j.h((Object)equ.ak(this.b).a());
                j.j((Iterable)equ.as(this.b).a());
                return j.g();
            }
            case 3: {
                return new agkz((tgd)eqy.jn(this.a).a(), (Set)equ.bk(this.b).a(), (aukf)equ.aE(this.b).a(), (aukf)equ.aG(this.b).a(), (aukf)equ.U(this.b).a(), (aukf)equ.aS(this.b).a());
            }
            case 2: {
                return new abkj((Context)eqy.ps(this.a).a());
            }
            case 1: {
                return abep.e((abva)equ.bl(this.b));
            }
            case 0: {
                return new abof(equ.by(this.b), equ.bD(this.b), 0, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
        }
    }
}
