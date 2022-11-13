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

final class eqm implements atke
{
    private final eqy a;
    private final eqn b;
    private final int c;
    
    public eqm(final eqy a, final eqn b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a() {
        switch (this.c) {
            default: {
                return abph.F((abpq)eqn.aw(this.b).a(), (aboe)eqn.aJ(this.b).a());
            }
            case 95: {
                return abep.J((aglu)eqn.ae(this.b).a());
            }
            case 94: {
                return abep.H((aalh)eqn.aa(this.b).a());
            }
            case 93: {
                return abpb.u();
            }
            case 92: {
                final eqn b = this.b;
                return new abuj(eqn.aw(b), eqn.an(b), (trc)eqy.vM(this.a).a(), (abjj)eqn.ah(this.b).a(), (aanx)eqn.ap(this.b).a(), eqn.b(this.b), (aukf)eqy.vK(this.a).a(), (byte[])null, (byte[])null);
            }
            case 91: {
                return abph.d((ashi)eqn.aY(this.b).a(), (asid)eqy.fU(this.a).a());
            }
            case 90: {
                final abun q = vnb.q((abuj)eqy.ki(this.a).a(), eqy.yO(this.a), (abum)eqy.nY(this.a).a(), (tgd)eqy.jn(this.a).a());
                eqn.bt(q);
                return q;
            }
            case 89: {
                return Optional.of((Object)eqy.pF(this.a).a());
            }
            case 88: {
                return new erm(this.a, this.b, 0);
            }
            case 87: {
                return new aeea(eqn.d(this.b));
            }
            case 86: {
                final Context context = (Context)eqy.ps(this.a).a();
                final ativ ativ = (ativ)eqn.aT(this.b).a();
                abph.m(ativ);
                return ativ;
            }
            case 85: {
                final Context context2 = (Context)eqy.ps(this.a).a();
                final ativ ativ2 = (ativ)eqn.V(this.b).a();
                abph.j(ativ2);
                return ativ2;
            }
            case 84: {
                final Context context3 = (Context)eqy.ps(this.a).a();
                final atiw atiw = (atiw)eqn.aH(this.b).a();
                abph.l(atiw);
                return atiw;
            }
            case 83: {
                return abpb.o();
            }
            case 82: {
                final Context context4 = (Context)eqy.ps(this.a).a();
                final atiw atiw2 = (atiw)eqn.aF(this.b).a();
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
                return abyw.e((Executor)eqy.fT(this.a).a(), eqn.an(this.b), (abrj)eqy.jt(this.a).a(), (wxx)eqy.tf(this.a).a());
            }
            case 76: {
                return abep.I((aglu)eqn.ae(this.b).a());
            }
            case 75: {
                return ably.o((afaq)eqn.aC(this.b).a(), (abjj)eqn.ah(this.b).a(), (abqg)eqn.au(this.b).a());
            }
            case 74: {
                return zhw.E((vai)eqy.gD(this.a).a());
            }
            case 73: {
                return abph.I((xvz)eqy.oD(this.a).a(), (abjj)eqn.ah(this.b).a());
            }
            case 72: {
                final Context context5 = (Context)eqy.ps(this.a).a();
                final atiw atiw3 = (atiw)eqn.ay(this.b).a();
                abph.f(atiw3);
                return atiw3;
            }
            case 71: {
                return abpb.k();
            }
            case 70: {
                final Context context6 = (Context)eqy.ps(this.a).a();
                final atiw atiw4 = (atiw)eqn.bj(this.b).a();
                abph.i(atiw4);
                return atiw4;
            }
            case 69: {
                return ably.p((abrj)eqy.jt(this.a).a(), eqy.nR(this.a).a(), (ashi)eqn.aR(this.b).a());
            }
            case 68: {
                final eqn b2 = this.b;
                final acid b3 = pjg.B(eqy.rN(this.a), (ashi)eqn.T(b2).a(), (asid)eqy.fS(this.a).a(), (abrj)eqy.jt(this.a).a());
                eqn.br(b2, (Object)b3);
                return b3;
            }
            case 67: {
                return abxq.z(eqy.az(this.a), (ablw)eqn.ag(this.b).a());
            }
            case 66: {
                final eqn b4 = this.b;
                final arwh arwh = (arwh)eqy.qn(this.a).a();
                final abhu s = ably.s(eqn.bC(this.b));
                eqn.bu(b4, s);
                return s;
            }
            case 65: {
                final ziy k = absr.k((abvm)eqy.mC(this.a).a(), (aanx)eqn.at(this.b).a(), (abjj)eqn.ah(this.b).a(), (ynp)eqy.rc(this.a).a(), (abrj)eqy.jt(this.a).a());
                eqn.bz(k);
                return k;
            }
            case 64: {
                final abru h = abph.H(eqn.bE(this.b), (abqg)eqn.au(this.b).a());
                eqn.bo(h);
                return h;
            }
            case 63: {
                return abep.g((atiw)eqn.aZ(this.b).a());
            }
            case 62: {
                final abou abou = (abou)eqn.aM(this.b).a();
                final aalc aalc = (aalc)eqy.rL(this.a).a();
                final Handler handler = (Handler)eqy.sJ(this.a).a();
                final arkg b5 = arlr.b(eqn.an(this.b));
                final ashi ashi = (ashi)eqn.aX(this.b).a();
                final ashi ashi2 = (ashi)eqn.aY(this.b).a();
                final ashi ashi3 = (ashi)eqn.aV(this.b).a();
                final abqg abqg = (abqg)eqn.au(this.b).a();
                final eqy a = this.a;
                final abol e = wxw.e(abou, aalc, handler, b5, ashi, ashi2, ashi3, abqg, eqy.tc(a), eqy.tb(a));
                eqn.bw(e);
                return e;
            }
            case 61: {
                return new adlp((abkl)eqn.Y(this.b).a(), (abnl)eqn.bh(this.b).a(), (abzv)eqy.vP(this.a).a(), (tgd)eqy.jn(this.a).a(), eqn.y(this.b), (abqg)eqn.au(this.b).a(), (Set)afft.r());
            }
            case 60: {
                final eqn b6 = this.b;
                final aalh c = vnb.c((zbh)eqy.mo(this.a).a());
                eqn.bp(b6, c);
                return c;
            }
            case 59: {
                return abep.h(eqn.aL(this.b));
            }
            case 58: {
                return abph.b((abpq)eqn.aw(this.b).a(), (abqb)eqn.ao(this.b).a());
            }
            case 57: {
                final aakk q2 = rra.q((abou)eqn.aM(this.b).a(), (abqg)eqn.au(this.b).a(), arlr.b(eqn.an(this.b)), (Executor)eqy.fT(this.a).a(), eqy.tc(this.a), (ashi)eqn.T(this.b).a(), (ashi)eqn.aR(this.b).a(), (ashi)eqn.bf(this.b).a(), (ablw)eqn.ag(this.b).a());
                eqn.bm(q2);
                return q2;
            }
            case 56: {
                return abpb.p();
            }
            case 55: {
                final Context context7 = (Context)eqy.ps(this.a).a();
                final abjj abjj = (abjj)eqn.ah(this.b).a();
                final zmf zmf = (zmf)eqy.pK(this.a).a();
                final eqy a2 = this.a;
                final abnp t = abaq.t(context7, abjj, zmf, eqy.kb(a2), (aeea)eqy.nL(a2).a());
                eqn.bv(t);
                return t;
            }
            case 54: {
                return new abqp((vjm)eqy.sS(this.a).a(), (abou)eqn.aM(this.b).a(), (abnl)eqn.bh(this.b).a(), (aglu)eqn.ae(this.b).a(), (Executor)eqy.oN(this.a).a(), (Executor)eqy.fT(this.a).a(), (arwh)eqy.qn(this.a).a(), eqn.bB(this.b), (ablh)eqn.az(this.b).a(), (abrj)eqy.jt(this.a).a(), eqn.bA(this.b), null, null, null, null, null);
            }
            case 53: {
                return new abiy((msr)eqy.mM(this.a).a(), (abqp)eqn.aA(this.b).a(), (ashi)eqn.aR(this.b).a(), (ashi)eqn.aH(this.b).a(), (ablh)eqn.az(this.b).a(), (abou)eqn.aM(this.b).a(), arlr.b(eqn.ai(this.b)), (Executor)eqy.fT(this.a).a(), (Executor)eqy.oN(this.a).a(), (abrj)eqy.jt(this.a).a(), (byte[])null, (byte[])null);
            }
            case 52: {
                return abpb.h();
            }
            case 51: {
                final Context context8 = (Context)eqy.ps(this.a).a();
                final atiw atiw5 = (atiw)eqn.aq(this.b).a();
                abph.e(atiw5);
                return atiw5;
            }
            case 50: {
                return new aujg((agkz)eqn.ad(this.b).a(), (byte[])null, (byte[])null);
            }
            case 49: {
                return new aakp((aboe)eqn.aJ(this.b).a());
            }
            case 48: {
                return new aglu((aboe)eqn.aJ(this.b).a());
            }
            case 47: {
                final Context context9 = (Context)eqy.ps(this.a).a();
                final atiw atiw6 = (atiw)eqn.bc(this.b).a();
                abph.h(atiw6);
                return atiw6;
            }
            case 46: {
                return new addo((aukf)eqn.bb(this.b).a(), eqn.bB(this.b), (ablh)eqn.az(this.b).a(), (aglu)eqn.ae(this.b).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
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
                return wxw.f((atiw)eqn.aV(this.b).a(), (atiw)eqn.aQ(this.b).a(), (atiw)eqn.aW(this.b).a(), (atiw)eqn.aU(this.b).a(), (atiw)eqn.aX(this.b).a(), (atiw)eqn.bg(this.b).a(), (atiw)eqn.aZ(this.b).a(), (atiw)eqn.bf(this.b).a(), (atiw)eqn.ac(this.b).a(), (atiw)eqn.ab(this.b).a());
            }
            case 34: {
                return ablq.d((asid)eqy.fJ(this.a).a(), (Executor)eqy.oN(this.a).a(), (abrj)eqy.jt(this.a).a(), (arwh)eqy.qn(this.a).a());
            }
            case 33: {
                return zih.h((oby)eqy.gH(this.a).a(), (tgd)eqy.jn(this.a).a());
            }
            case 32: {
                return uzb.f((tgd)eqy.jn(this.a).a(), (vln)eqy.rS(this.a).a(), (aeea)eqy.pt(this.a).a(), (zmf)eqy.pK(this.a).a(), eqn.A(this.b), (abmg)eqy.od(this.a).a(), eqn.z(this.b), (vwu)eqy.vZ(this.a).a(), (arwh)eqy.qn(this.a).a(), eqy.aD(this.a), (abrj)eqy.jt(this.a).a());
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
                return new ablm((abjk)eqn.ah(this.b).a(), (abkl)eqn.Y(this.b).a());
            }
            case 27: {
                return new abkz((tgd)eqy.jn(this.a).a(), (abll)eqy.oc(this.a).a(), (abmg)eqy.od(this.a).a(), (Executor)eqy.oN(this.a).a(), (Executor)eqy.fT(this.a).a(), eqn.z(this.b), (oby)eqy.gH(this.a).a(), (arwh)eqy.qn(this.a).a(), (abrj)eqy.jt(this.a).a(), (msr)eqy.mM(this.a).a(), (ablj)eqy.ob(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 26: {
                return abep.f(eqn.c(this.b));
            }
            case 25: {
                return new ablh((tgd)eqy.jn(this.a).a(), arlr.b(eqn.ai(this.b)), (Handler)eqy.sJ(this.a).a(), (asid)eqy.fU(this.a).a(), (tqd)eqy.qe(this.a).a(), (ScheduledExecutorService)eqy.pz(this.a).a(), (Executor)eqy.fT(this.a).a(), (abou)eqn.aM(this.b).a(), eqn.bA(this.b), (ashi)eqn.T(this.b).a(), (arwh)eqy.qn(this.a).a(), (vaf)eqy.pn(this.a).a(), (abrj)eqy.jt(this.a).a(), (asid)eqy.fL(this.a).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 24: {
                final Context context10 = (Context)eqy.ps(this.a).a();
                return new aanx(null, (byte[])null);
            }
            case 23: {
                return abph.G((ablw)eqn.ag(this.b).a(), (aanx)eqn.at(this.b).a());
            }
            case 22: {
                final Context context11 = (Context)eqy.ps(this.a).a();
                final atke ok = eqy.oK(this.a);
                final abjj abjj2 = (abjj)eqn.ah(this.b).a();
                final eqn b7 = this.b;
                return new aakn(context11, ok, abjj2, eqn.az(b7), eqn.av(b7), (aboe)eqn.aJ(b7).a(), (aulc)eqy.mQ(this.a).a(), (aglu)eqn.ae(this.b).a(), (arwh)eqy.qn(this.a).a(), arlr.b(eqy.oL(this.a)), arlr.b(eqn.aI(this.b)), (abrj)eqy.jt(this.a).a(), null, null, null, null);
            }
            case 21: {
                return abpb.j();
            }
            case 20: {
                return new abqg((ashi)eqn.T(this.b).a(), (ashi)eqn.aR(this.b).a(), (ashi)eqn.bc(this.b).a());
            }
            case 19: {
                return abpb.i();
            }
            case 18: {
                return abpb.q();
            }
            case 17: {
                return abep.k((ativ)eqn.aT(this.b).a());
            }
            case 16: {
                return abep.c((ashi)eqn.aR(this.b).a());
            }
            case 15: {
                final eqn b8 = this.b;
                final absb f = vkp.f((tgd)eqy.jn(this.a).a(), (Context)eqy.ps(this.a).a(), (acid)eqy.oe(this.a).a(), (ScheduledExecutorService)eqy.oN(this.a).a(), (String)eqy.sN(this.a).a(), (ListenableFuture)eqy.pT(this.a).a(), arlr.b(eqn.ba(this.b)), (abrj)eqy.jt(this.a).a());
                eqn.bn(b8, f);
                return f;
            }
            case 14: {
                final eqn b9 = this.b;
                final Context context12 = (Context)eqy.ps(this.a).a();
                final tgd tgd = (tgd)eqy.jn(this.a).a();
                final ynp ynp = (ynp)eqy.rc(this.a).a();
                final absb absb = (absb)eqn.Z(this.b).a();
                final abvr abvr = (abvr)eqy.nO(this.a).a();
                final aakn aakn = (aakn)eqn.X(this.b).a();
                final abjj abjj3 = (abjj)eqn.ah(this.b).a();
                final abkl abkl = (abkl)eqn.Y(this.b).a();
                final aujg aujg = (aujg)eqn.am(this.b).a();
                final aakg a3 = eqn.a(this.b);
                final abux abux = (abux)eqy.ms(this.a).a();
                final zis zis = (zis)eqy.pU(this.a).a();
                final arwh arwh2 = (arwh)eqy.qn(this.a).a();
                final adet adet = (adet)eqy.tQ(this.a).a();
                final abiy abiy = (abiy)eqn.aj(this.b).a();
                eqn.bx(this.b);
                final ablh ablh = (ablh)eqn.az(this.b).a();
                final abqp abqp = (abqp)eqn.aA(this.b).a();
                final aglu aglu = (aglu)eqn.ae(this.b).a();
                final addo addo = (addo)eqn.av(this.b).a();
                final abou abou2 = (abou)eqn.aM(this.b).a();
                final abpq c2 = abqc.c(context12, tgd, ynp, absb, abvr, aakn, abjj3, abkl, aujg, a3, abux, zis, arwh2, abiy, ablh, abqp, aglu, addo, (aukf)eqn.bi(this.b).a(), (aukf)eqn.ax(this.b).a(), (abqb)eqn.ao(this.b).a(), (aujg)eqn.af(this.b).a(), (agmc)eqn.ar(this.b).a(), (acid)eqn.W(this.b).a(), (abrj)eqy.jt(this.a).a());
                eqn.bs(b9, c2);
                return c2;
            }
            case 13: {
                final addo yv = eqy.yV(this.a);
                final Executor executor = (Executor)eqy.fT(this.a).a();
                final eqn b10 = this.b;
                return abvc.j(yv, executor, eqn.aw(b10), eqn.an(b10), (wxx)eqy.tf(this.a).a(), (abrj)eqy.jt(this.a).a());
            }
            case 12: {
                return afft.w((Object)eqn.be(this.b).a(), (Object)eqn.aN(this.b).a(), (Object)eqn.aD(this.b).a(), (Object)eqn.aO(this.b).a(), (Object)eqn.aB(this.b).a());
            }
            case 11: {
                return abyw.f((vln)eqy.rS(this.a).a(), (aeea)eqy.pt(this.a).a(), (zmf)eqy.pK(this.a).a(), (tjb)eqy.pc(this.a).a());
            }
            case 10: {
                final eqn b11 = this.b;
                final abyp c3 = abyq.c(eqn.al(b11), (ScheduledExecutorService)eqy.oN(this.a).a(), eqn.bd(this.b), eqy.yV(this.a), (Handler)eqy.sJ(this.a).a(), (Executor)eqy.fT(this.a).a(), (arwh)eqy.qn(this.a).a(), (abrj)eqy.jt(this.a).a(), (SecureRandom)eqy.rV(this.a).a(), (vjm)eqy.sS(this.a).a(), (wxx)eqy.tf(this.a).a());
                eqn.bq(b11, c3);
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
                return abep.j((ativ)eqn.V(this.b).a());
            }
            case 6: {
                return new abry((zab)eqy.tt(this.a).a(), (ashi)eqn.T(this.b).a(), (ablw)eqn.ag(this.b).a(), (ashi)eqy.pq(this.a).a(), (oby)eqy.gH(this.a).a(), (abzv)eqy.vP(this.a).a(), (arwh)eqy.qn(this.a).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 5: {
                return abph.g((abry)eqn.aP(this.b).a(), (vaf)eqy.pn(this.a).a());
            }
            case 4: {
                final affr j = afft.j(3);
                j.h((Object)eqn.aK(this.b).a());
                j.h((Object)eqn.ak(this.b).a());
                j.j((Iterable)eqn.as(this.b).a());
                return j.g();
            }
            case 3: {
                return new agkz((tgd)eqy.jn(this.a).a(), (Set)eqn.bk(this.b).a(), (aukf)eqn.aE(this.b).a(), (aukf)eqn.aG(this.b).a(), (aukf)eqn.U(this.b).a(), (aukf)eqn.aS(this.b).a());
            }
            case 2: {
                return new abkj((Context)eqy.ps(this.a).a());
            }
            case 1: {
                return abep.e((abva)eqn.bl(this.b));
            }
            case 0: {
                return new abof(eqn.by(this.b), eqn.bD(this.b), 0, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
        }
    }
}
