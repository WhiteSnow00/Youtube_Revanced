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

final class eqp implements atke
{
    private final eqy a;
    private final eqq b;
    private final int c;
    
    public eqp(final eqy a, final eqq b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a() {
        switch (this.c) {
            default: {
                return abph.F((abpq)eqq.at(this.b).a(), (aboe)eqq.aG(this.b).a());
            }
            case 90: {
                return abep.J((aglu)eqq.ac(this.b).a());
            }
            case 89: {
                return abep.H((aalh)eqq.Y(this.b).a());
            }
            case 88: {
                return abpb.u();
            }
            case 87: {
                final eqq b = this.b;
                return new abuj(eqq.at(b), eqq.ak(b), (trc)eqy.vM(this.a).a(), (abjj)eqq.af(this.b).a(), (aanx)eqq.am(this.b).a(), eqq.b(this.b), (aukf)eqy.vK(this.a).a(), null, null);
            }
            case 86: {
                return abph.d((ashi)eqq.aW(this.b).a(), (asid)eqy.fU(this.a).a());
            }
            case 85: {
                final abun q = vnb.q((abuj)eqy.ki(this.a).a(), eqy.yO(this.a), (abum)eqy.nY(this.a).a(), (tgd)eqy.jn(this.a).a());
                eqq.br(q);
                return q;
            }
            case 84: {
                return new ablm((abjk)eqq.af(this.b).a(), (abkl)eqq.W(this.b).a());
            }
            case 83: {
                return new abkz((tgd)eqy.jn(this.a).a(), (abll)eqy.oc(this.a).a(), (abmg)eqy.od(this.a).a(), (Executor)eqy.oN(this.a).a(), (Executor)eqy.fT(this.a).a(), eqq.y(this.b), (oby)eqy.gH(this.a).a(), (arwh)eqy.qn(this.a).a(), (abrj)eqy.jt(this.a).a(), (msr)eqy.mM(this.a).a(), (ablj)eqy.ob(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 82: {
                return new aakp((aboe)eqq.aG(this.b).a());
            }
            case 81: {
                return Optional.of((Object)eqy.pF(this.a).a());
            }
            case 80: {
                return new erm(this.a, this.b, 1);
            }
            case 79: {
                return new aeea(eqq.c(this.b));
            }
            case 78: {
                final Context context = (Context)eqy.ps(this.a).a();
                final ativ ativ = (ativ)eqq.aR(this.b).a();
                abph.m(ativ);
                return ativ;
            }
            case 77: {
                final Context context2 = (Context)eqy.ps(this.a).a();
                final ativ ativ2 = (ativ)eqq.T(this.b).a();
                abph.j(ativ2);
                return ativ2;
            }
            case 76: {
                final Context context3 = (Context)eqy.ps(this.a).a();
                final atiw atiw = (atiw)eqq.aE(this.b).a();
                abph.l(atiw);
                return atiw;
            }
            case 75: {
                return abpb.o();
            }
            case 74: {
                final Context context4 = (Context)eqy.ps(this.a).a();
                final atiw atiw2 = (atiw)eqq.aC(this.b).a();
                abph.k(atiw2);
                return atiw2;
            }
            case 73: {
                return afft.u((Object)eqy.bp(this.a), (Object)eqy.aV(this.a), (Object)eqy.nM(this.a).a());
            }
            case 72: {
                return abxy.s((mdp)eqy.qc(this.a).a());
            }
            case 71: {
                return abzn.b();
            }
            case 70: {
                return ably.r((String)eqy.rW(this.a).a(), (abrj)eqy.jt(this.a).a(), (aalc)eqy.rL(this.a).a());
            }
            case 69: {
                return abyw.e((Executor)eqy.fT(this.a).a(), eqq.ak(this.b), (abrj)eqy.jt(this.a).a(), (wxx)eqy.tf(this.a).a());
            }
            case 68: {
                return abep.I((aglu)eqq.ac(this.b).a());
            }
            case 67: {
                return ably.o((afaq)eqq.az(this.b).a(), (abjj)eqq.af(this.b).a(), (abqg)eqq.ar(this.b).a());
            }
            case 66: {
                return zhw.E((vai)eqy.gD(this.a).a());
            }
            case 65: {
                return abph.I((xvz)eqy.oD(this.a).a(), (abjj)eqq.af(this.b).a());
            }
            case 64: {
                final Context context5 = (Context)eqy.ps(this.a).a();
                final atiw atiw3 = (atiw)eqq.av(this.b).a();
                abph.f(atiw3);
                return atiw3;
            }
            case 63: {
                final Context context6 = (Context)eqy.ps(this.a).a();
                final atiw atiw4 = (atiw)eqq.bh(this.b).a();
                abph.i(atiw4);
                return atiw4;
            }
            case 62: {
                return ably.p((abrj)eqy.jt(this.a).a(), eqy.nR(this.a).a(), (ashi)eqq.aP(this.b).a());
            }
            case 61: {
                final eqq b2 = this.b;
                final acid b3 = pjg.B(eqy.rN(this.a), (ashi)eqq.z(b2).a(), (asid)eqy.fS(this.a).a(), (abrj)eqy.jt(this.a).a());
                eqq.bp(b2, (Object)b3);
                return b3;
            }
            case 60: {
                return abxq.z(eqy.az(this.a), (ablw)eqq.ae(this.b).a());
            }
            case 59: {
                final eqq b4 = this.b;
                final arwh arwh = (arwh)eqy.qn(this.a).a();
                final abhu s = ably.s(eqq.bB(this.b));
                eqq.bs(b4, s);
                return s;
            }
            case 58: {
                final ziy k = absr.k((abvm)eqy.mC(this.a).a(), (aanx)eqq.aq(this.b).a(), (abjj)eqq.af(this.b).a(), (ynp)eqy.rc(this.a).a(), (abrj)eqy.jt(this.a).a());
                eqq.by(k);
                return k;
            }
            case 57: {
                final abru h = abph.H(eqq.bD(this.b), (abqg)eqq.ar(this.b).a());
                eqq.bm(h);
                return h;
            }
            case 56: {
                return abep.g((atiw)eqq.aX(this.b).a());
            }
            case 55: {
                final abou abou = (abou)eqq.aK(this.b).a();
                final aalc aalc = (aalc)eqy.rL(this.a).a();
                final Handler handler = (Handler)eqy.sJ(this.a).a();
                final arkg b5 = arlr.b(eqq.ak(this.b));
                final ashi ashi = (ashi)eqq.aV(this.b).a();
                final ashi ashi2 = (ashi)eqq.aW(this.b).a();
                final ashi ashi3 = (ashi)eqq.aT(this.b).a();
                final abqg abqg = (abqg)eqq.ar(this.b).a();
                final eqy a = this.a;
                final abol e = wxw.e(abou, aalc, handler, b5, ashi, ashi2, ashi3, abqg, eqy.tc(a), eqy.tb(a));
                eqq.bu(e);
                return e;
            }
            case 54: {
                return new adlp((abkl)eqq.W(this.b).a(), (abnl)eqq.bf(this.b).a(), (abzv)eqy.vP(this.a).a(), (tgd)eqy.jn(this.a).a(), eqq.d(this.b), (abqg)eqq.ar(this.b).a(), (Set)afft.r());
            }
            case 53: {
                final eqq b6 = this.b;
                final aalh c = vnb.c((zbh)eqy.mo(this.a).a());
                eqq.bn(b6, c);
                return c;
            }
            case 52: {
                return abep.h(eqq.aJ(this.b));
            }
            case 51: {
                return abph.b((abpq)eqq.at(this.b).a(), (abqb)eqq.al(this.b).a());
            }
            case 50: {
                final aakk q2 = rra.q((abou)eqq.aK(this.b).a(), (abqg)eqq.ar(this.b).a(), arlr.b(eqq.ak(this.b)), (Executor)eqy.fT(this.a).a(), eqy.tc(this.a), (ashi)eqq.z(this.b).a(), (ashi)eqq.aP(this.b).a(), (ashi)eqq.bd(this.b).a(), (ablw)eqq.ae(this.b).a());
                eqq.bk(q2);
                return q2;
            }
            case 49: {
                return abpb.p();
            }
            case 48: {
                final Context context7 = (Context)eqy.ps(this.a).a();
                final abjj abjj = (abjj)eqq.af(this.b).a();
                final zmf zmf = (zmf)eqy.pK(this.a).a();
                final eqy a2 = this.a;
                final abnp t = abaq.t(context7, abjj, zmf, eqy.kb(a2), (aeea)eqy.nL(a2).a());
                eqq.bt(t);
                return t;
            }
            case 47: {
                return new abqp((vjm)eqy.sS(this.a).a(), (abou)eqq.aK(this.b).a(), (abnl)eqq.bf(this.b).a(), (aglu)eqq.ac(this.b).a(), (Executor)eqy.oN(this.a).a(), (Executor)eqy.fT(this.a).a(), (arwh)eqy.qn(this.a).a(), eqq.bA(this.b), (ablh)eqq.aw(this.b).a(), (abrj)eqy.jt(this.a).a(), eqq.bz(this.b), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 46: {
                return new abiy((msr)eqy.mM(this.a).a(), (abqp)eqq.ax(this.b).a(), (ashi)eqq.aP(this.b).a(), (ashi)eqq.aE(this.b).a(), (ablh)eqq.aw(this.b).a(), (abou)eqq.aK(this.b).a(), arlr.b(eqq.aI(this.b)), (Executor)eqy.fT(this.a).a(), (Executor)eqy.oN(this.a).a(), (abrj)eqy.jt(this.a).a(), (byte[])null, (byte[])null);
            }
            case 45: {
                return abpb.h();
            }
            case 44: {
                final Context context8 = (Context)eqy.ps(this.a).a();
                final atiw atiw5 = (atiw)eqq.an(this.b).a();
                abph.e(atiw5);
                return atiw5;
            }
            case 43: {
                return new aujg((agkz)eqq.ab(this.b).a(), (byte[])null, (byte[])null);
            }
            case 42: {
                return new abqg((ashi)eqq.z(this.b).a(), (ashi)eqq.aP(this.b).a(), (ashi)eqq.ba(this.b).a());
            }
            case 41: {
                return abpb.i();
            }
            case 40: {
                return abep.c((ashi)eqq.aP(this.b).a());
            }
            case 39: {
                final eqq b7 = this.b;
                final absb f = vkp.f((tgd)eqy.jn(this.a).a(), (Context)eqy.ps(this.a).a(), (acid)eqy.oe(this.a).a(), (ScheduledExecutorService)eqy.oN(this.a).a(), (String)eqy.sN(this.a).a(), (ListenableFuture)eqy.pT(this.a).a(), arlr.b(eqq.aY(this.b)), (abrj)eqy.jt(this.a).a());
                eqq.bl(b7, f);
                return f;
            }
            case 38: {
                final eqq b8 = this.b;
                final Context context9 = (Context)eqy.ps(this.a).a();
                final tgd tgd = (tgd)eqy.jn(this.a).a();
                final ynp ynp = (ynp)eqy.rc(this.a).a();
                final absb absb = (absb)eqq.X(this.b).a();
                final abvr abvr = (abvr)eqy.nO(this.a).a();
                final aakn aakn = (aakn)eqq.V(this.b).a();
                final abjj abjj2 = (abjj)eqq.af(this.b).a();
                final abkl abkl = (abkl)eqq.W(this.b).a();
                final aujg aujg = (aujg)eqq.aj(this.b).a();
                final aakg a3 = eqq.a(this.b);
                final abux abux = (abux)eqy.ms(this.a).a();
                final zis zis = (zis)eqy.pU(this.a).a();
                final arwh arwh2 = (arwh)eqy.qn(this.a).a();
                final adet adet = (adet)eqy.tQ(this.a).a();
                final abiy abiy = (abiy)eqq.ag(this.b).a();
                eqq.bv(this.b);
                final ablh ablh = (ablh)eqq.aw(this.b).a();
                final abqp abqp = (abqp)eqq.ax(this.b).a();
                final aglu aglu = (aglu)eqq.ac(this.b).a();
                final addo addo = (addo)eqq.as(this.b).a();
                final abou abou2 = (abou)eqq.aK(this.b).a();
                final abpq c2 = abqc.c(context9, tgd, ynp, absb, abvr, aakn, abjj2, abkl, aujg, a3, abux, zis, arwh2, abiy, ablh, abqp, aglu, addo, (aukf)eqq.bg(this.b).a(), (aukf)eqq.au(this.b).a(), (abqb)eqq.al(this.b).a(), (aujg)eqq.ad(this.b).a(), (agmc)eqq.ao(this.b).a(), (acid)eqq.U(this.b).a(), (abrj)eqy.jt(this.a).a());
                eqq.bq(b8, c2);
                return c2;
            }
            case 37: {
                final addo yv = eqy.yV(this.a);
                final Executor executor = (Executor)eqy.fT(this.a).a();
                final eqq b9 = this.b;
                return abvc.j(yv, executor, eqq.at(b9), eqq.ak(b9), (wxx)eqy.tf(this.a).a(), (abrj)eqy.jt(this.a).a());
            }
            case 36: {
                return afft.w((Object)eqq.bc(this.b).a(), (Object)eqq.aL(this.b).a(), (Object)eqq.aA(this.b).a(), (Object)eqq.aM(this.b).a(), (Object)eqq.ay(this.b).a());
            }
            case 35: {
                return abyw.f((vln)eqy.rS(this.a).a(), (aeea)eqy.pt(this.a).a(), (zmf)eqy.pK(this.a).a(), (tjb)eqy.pc(this.a).a());
            }
            case 34: {
                final eqq b10 = this.b;
                final abyp c3 = abyq.c(eqq.ai(b10), (ScheduledExecutorService)eqy.oN(this.a).a(), eqq.bb(this.b), eqy.yV(this.a), (Handler)eqy.sJ(this.a).a(), (Executor)eqy.fT(this.a).a(), (arwh)eqy.qn(this.a).a(), (abrj)eqy.jt(this.a).a(), (SecureRandom)eqy.rV(this.a).a(), (vjm)eqy.sS(this.a).a(), (wxx)eqy.tf(this.a).a());
                eqq.bo(b10, c3);
                return c3;
            }
            case 33: {
                return abpb.n();
            }
            case 32: {
                return abep.j((ativ)eqq.T(this.b).a());
            }
            case 31: {
                return new abry((zab)eqy.tt(this.a).a(), (ashi)eqq.z(this.b).a(), (ablw)eqq.ae(this.b).a(), (ashi)eqy.pq(this.a).a(), (oby)eqy.gH(this.a).a(), (abzv)eqy.vP(this.a).a(), (arwh)eqy.qn(this.a).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 30: {
                return abph.g((abry)eqq.aN(this.b).a(), (vaf)eqy.pn(this.a).a());
            }
            case 29: {
                final affr j = afft.j(3);
                j.h(eqq.aH(this.b).a());
                j.h(eqq.ah(this.b).a());
                j.j((Iterable)eqq.ap(this.b).a());
                return j.g();
            }
            case 28: {
                return new agkz((tgd)eqy.jn(this.a).a(), (Set)eqq.bi(this.b).a(), (aukf)eqq.aB(this.b).a(), (aukf)eqq.aD(this.b).a(), (aukf)eqq.A(this.b).a(), (aukf)eqq.aQ(this.b).a());
            }
            case 27: {
                return new abkj((Context)eqy.ps(this.a).a());
            }
            case 26: {
                return abep.e((abva)eqq.bj(this.b));
            }
            case 25: {
                return new aglu((aboe)eqq.aG(this.b).a());
            }
            case 24: {
                return abpb.j();
            }
            case 23: {
                final Context context10 = (Context)eqy.ps(this.a).a();
                final atiw atiw6 = (atiw)eqq.ba(this.b).a();
                abph.h(atiw6);
                return atiw6;
            }
            case 22: {
                return new addo((aukf)eqq.aZ(this.b).a(), eqq.bA(this.b), (ablh)eqq.aw(this.b).a(), (aglu)eqq.ac(this.b).a(), null, null, null, null, null);
            }
            case 21: {
                final Context context11 = (Context)eqy.ps(this.a).a();
                return new aanx((byte[])null, (byte[])null);
            }
            case 20: {
                final Context context12 = (Context)eqy.ps(this.a).a();
                return abph.D((asid)eqy.fU(this.a).a());
            }
            case 19: {
                return abph.G((ablw)eqq.ae(this.b).a(), (aanx)eqq.aq(this.b).a());
            }
            case 18: {
                final Context context13 = (Context)eqy.ps(this.a).a();
                final atke ok = eqy.oK(this.a);
                final abjj abjj3 = (abjj)eqq.af(this.b).a();
                final eqq b11 = this.b;
                return new aakn(context13, ok, abjj3, eqq.aw(b11), eqq.as(b11), (aboe)eqq.aG(b11).a(), (aulc)eqy.mQ(this.a).a(), (aglu)eqq.ac(this.b).a(), (arwh)eqy.qn(this.a).a(), arlr.b(eqy.oL(this.a)), arlr.b(eqq.aF(this.b)), (abrj)eqy.jt(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 17: {
                return jex.l(eqq.bw(this.b));
            }
            case 16: {
                return new ablh((tgd)eqy.jn(this.a).a(), arlr.b(eqq.aI(this.b)), (Handler)eqy.sJ(this.a).a(), (asid)eqy.fU(this.a).a(), (tqd)eqy.qe(this.a).a(), (ScheduledExecutorService)eqy.pz(this.a).a(), (Executor)eqy.fT(this.a).a(), (abou)eqq.aK(this.b).a(), eqq.bz(this.b), (ashi)eqq.z(this.b).a(), (arwh)eqy.qn(this.a).a(), (vaf)eqy.pn(this.a).a(), (abrj)eqy.jt(this.a).a(), (asid)eqy.fL(this.a).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 15: {
                return new abkl((tgd)eqy.jn(this.a).a());
            }
            case 14: {
                return abaq.i();
            }
            case 13: {
                return abaq.j();
            }
            case 12: {
                return abpb.f();
            }
            case 11: {
                return abpb.e();
            }
            case 10: {
                return abpb.g();
            }
            case 9: {
                return abpb.d();
            }
            case 8: {
                return abaq.l();
            }
            case 7: {
                return abpb.b();
            }
            case 6: {
                return abaq.k();
            }
            case 5: {
                return abpb.c();
            }
            case 4: {
                return wxw.f((atiw)eqq.aT(this.b).a(), (atiw)eqq.aO(this.b).a(), (atiw)eqq.aU(this.b).a(), (atiw)eqq.aS(this.b).a(), (atiw)eqq.aV(this.b).a(), (atiw)eqq.be(this.b).a(), (atiw)eqq.aX(this.b).a(), (atiw)eqq.bd(this.b).a(), (atiw)eqq.aa(this.b).a(), (atiw)eqq.Z(this.b).a());
            }
            case 3: {
                return abpb.q();
            }
            case 2: {
                return abep.k((ativ)eqq.aR(this.b).a());
            }
            case 1: {
                return abpb.k();
            }
            case 0: {
                return new abof(eqq.bx(this.b), eqq.bC(this.b), 1, null, null, null);
            }
        }
    }
}
