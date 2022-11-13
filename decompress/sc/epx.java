import java.security.Key;
import java.util.HashSet;
import java.util.Set;
import android.content.Context;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class epx implements atke
{
    private final eqy a;
    private final epy b;
    private final int c;
    
    public epx(final eqy a, final epy b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a() {
        switch (this.c) {
            default: {
                return new zwz((vee)this.b.O.a(), (aacf)this.a.fD.a(), (aait)this.a.es.a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 41: {
                final Executor executor = (Executor)this.a.r.a();
                final zud zud = (zud)((arlt)this.b.z).a;
                return new zvf();
            }
            case 40: {
                return new zts(this.b.i);
            }
            case 39: {
                final vee a = ((vef)this.a.fH.a()).a(this.b.b);
                a.getClass();
                return a;
            }
            case 38: {
                final vee vee = (vee)this.b.O.a();
                final oby oby = (oby)this.a.e.a();
                return new zut(vee, (Executor)this.a.r.a());
            }
            case 37: {
                return new zuu((Executor)this.a.r.a(), (zui)this.b.C.a(), (zut)this.b.P.a(), (aait)this.a.es.a());
            }
            case 36: {
                final eqy a2 = this.a;
                final atke eu = a2.eu;
                final epy b = this.b;
                final zud zud2 = (zud)((arlt)b.z).a;
                final atke g = b.G;
                final atke a3 = b.A;
                final atke b2 = b.B;
                final atke d = b.D;
                final atke n = b.n;
                final atke w = b.w;
                final arwh arwh = (arwh)a2.v.a();
                final String a4 = this.b.a;
                final aagi aagi = (aagi)this.a.ky.a();
                final aanx aanx = (aanx)this.a.el.a();
                final acid acid = (acid)this.a.eo.a();
                final oby oby2 = (oby)this.a.e.a();
                final epy b3 = this.b;
                return new zul(eu, zud2, g, a3, b2, d, n, w, arwh, a4, aagi, aanx, acid, oby2, b3.F, b3.x, (Executor)this.a.r.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 35: {
                final Context context = (Context)this.a.c.a();
                final oby oby3 = (oby)this.a.e.a();
                final String a5 = this.b.a;
                final eqy a6 = this.a;
                final atke eu2 = a6.eu;
                final aagi aagi2 = (aagi)a6.ky.a();
                final eqy a7 = this.a;
                final atke kx = a7.kX;
                final atke kw = a7.kw;
                final zud zud3 = (zud)((arlt)this.b.z).a;
                final Executor executor2 = (Executor)a7.r.a();
                final Executor executor3 = (Executor)this.a.kG.a();
                final adlp adlp = (adlp)this.b.m.a();
                final epy b4 = this.b;
                final atke x = b4.x;
                final atke e = b4.e;
                final atke d2 = b4.d;
                final atke a8 = b4.A;
                final atke b5 = b4.B;
                final atke d3 = b4.D;
                final atke w2 = b4.w;
                final aanx aanx2 = (aanx)this.a.el.a();
                final epy b6 = this.b;
                return new ztx(oby3, a5, eu2, aagi2, kx, kw, zud3, executor2, executor3, adlp, x, e, d2, a8, b5, d3, w2, aanx2, b6.H, b6.F, b6.I, (vaf)this.a.w.a(), (arwh)this.a.v.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 34: {
                final oby oby4 = (oby)this.a.e.a();
                final eqy a9 = this.a;
                return new aacf(a9.a.V, a9.gm, (zvo)this.b.x.a(), oby4);
            }
            case 33: {
                final atke k = this.b.K;
                final Executor executor4 = (Executor)this.a.kG.a();
                final epy b7 = this.b;
                return new ztr(k, executor4, b7.x, (zud)((arlt)b7.z).a);
            }
            case 32: {
                final oby oby5 = (oby)this.a.e.a();
                final epy b8 = this.b;
                final String a10 = b8.a;
                final eqy a11 = this.a;
                final atke ej = a11.ej;
                final atke eu3 = a11.eu;
                final atke ky = a11.kY;
                final ztn ztn = (ztn)b8.e.a();
                final epy b9 = this.b;
                final atke x2 = b9.x;
                final zud zud4 = (zud)((arlt)b9.z).a;
                final atke a12 = b9.A;
                final atke d4 = b9.D;
                final atke c = b9.C;
                final eqy a13 = this.a;
                final atke gm = a13.gm;
                final atke ki = a13.kI;
                final afiq a14 = afiq.a;
                final vlq vlq = (vlq)this.a.gn.a();
                final era a15 = this.b.c.a;
                return new zun(oby5, a10, ej, eu3, ky, ztn, x2, zud4, a12, d4, c, gm, ki, (Set)a14, vlq, (Set)afft.s((Object)new inh((Context)a15.a.c.a(), (zmf)a15.a.aC.a(), (vef)a15.a.fH.a())), (aait)this.a.es.a());
            }
            case 31: {
                return new aanx((byte[])null);
            }
            case 30: {
                return new aanx(this.b.x, this.a.kI);
            }
            case 29: {
                return new aanx((aanx)this.b.G.a(), (aaec)this.a.eu.a(), (byte[])null, (byte[])null);
            }
            case 28: {
                final atib atib = new atib((byte[])null, (byte[])null);
                atib.c = new aaeo(atib, (HashSet)atib.b, (byte[])null, (byte[])null);
                return atib;
            }
            case 27: {
                return new agoe((zus)this.b.D.a());
            }
            case 26: {
                final oby oby6 = (oby)this.a.e.a();
                final epy b10 = this.b;
                final eqy a16 = this.a;
                return new zui(a16.ej, b10.x, b10.z, (Executor)a16.r.a());
            }
            case 25: {
                return new aeea(this.b.x, (short[])null);
            }
            case 24: {
                final msr msr = (msr)this.a.eV.a();
                final epy b11 = this.b;
                return new abrn(msr, b11.a, this.a.ew, new ziy((oby)b11.c.e.a(), (zvo)b11.x.a(), (abrj)b11.c.kI.a(), (zvd)b11.c.em.a(), (arwh)b11.c.v.a(), (byte[])null, (byte[])null, (byte[])null), (aafq)this.a.kC.a(), (aagi)this.a.ky.a(), (aait)this.a.es.a(), (aanx)this.a.kV.a(), null, null, null, null, null);
            }
            case 23: {
                final oby oby7 = (oby)this.a.e.a();
                final String a17 = this.b.a;
                final eqy a18 = this.a;
                final atke ew = a18.ew;
                final atke eu4 = a18.eu;
                final atke kb = a18.kB;
                final aagi aagi3 = (aagi)a18.ky.a();
                final eqy a19 = this.a;
                final atke kw2 = a19.kw;
                final zud zud5 = (zud)((arlt)this.b.z).a;
                final Executor executor5 = (Executor)a19.kG.a();
                final Executor executor6 = (Executor)this.a.r.a();
                final epy b12 = this.b;
                final atke e2 = b12.e;
                final ziy ziy = (ziy)b12.l.a();
                final epy b13 = this.b;
                final atke x3 = b13.x;
                final atke a20 = b13.A;
                final atke b14 = b13.B;
                final atke c2 = b13.C;
                final aanx aanx3 = (aanx)this.a.el.a();
                final epy b15 = this.b;
                final zus zus = new zus(oby7, a17, ew, eu4, kb, aagi3, kw2, zud5, executor5, executor6, e2, ziy, x3, a20, b14, c2, aanx3, b15.E, b15.F, (asht)b15.v.a(), (byte[])null, (byte[])null, (byte[])null);
                zus.p.aH((asjm)new zim(zus, 6));
                return zus;
            }
            case 22: {
                final ztn ztn2 = (ztn)this.b.e.a();
                final aeea aeea = (aeea)this.a.iF.a();
                return new zvf();
            }
            case 21: {
                return new adlp((zzu)this.b.d.a(), (aujg)this.b.k.a(), (ziy)this.b.l.a(), (adlp)this.b.m.a(), (aaad)this.b.n.a(), (zvo)this.b.x.a(), (aacg)this.a.kA.a(), (atjz)this.b.v.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 20: {
                return atjs.e();
            }
            case 19: {
                final oby oby8 = (oby)this.a.e.a();
                final vaf vaf = (vaf)this.a.w.a();
                return new zww(oby8);
            }
            case 18: {
                final Executor executor7 = (Executor)this.a.kG.a();
                final ztp ztp = (ztp)this.b.e.a();
                final zvn zvn = (zvn)this.b.h.a();
                final ziy ziy2 = (ziy)this.b.l.a();
                final zwh zwh = (zwh)this.b.j.a();
                final adlp adlp2 = (adlp)this.b.m.a();
                final aaad aaad = (aaad)this.b.n.a();
                final zww zww = (zww)this.b.u.a();
                final epy b16 = this.b;
                final atke d5 = b16.d;
                final atke i = b16.k;
                final eqy c3 = b16.c;
                final zwp zwp = new zwp(executor7, ztp, zvn, ziy2, zwh, adlp2, aaad, zww, new aacf(d5, i, c3.gm, c3.es), (Set)afiq.a, (asht)this.b.v.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                zwp.e.aH((asjm)new zim(zwp, 7));
                return zwp;
            }
            case 17: {
                final zvn zvn2 = (zvn)this.b.h.a();
                return new zxf();
            }
            case 16: {
                return new zvf((zvn)this.b.h.a());
            }
            case 15: {
                return new zvh((zvn)this.b.h.a());
            }
            case 14: {
                return new zvj((zvn)this.b.h.a());
            }
            case 13: {
                return new aeea((zvn)this.b.h.a());
            }
            case 12: {
                return new zwi((zvn)this.b.h.a());
            }
            case 11: {
                final zvn zvn3 = (zvn)this.b.h.a();
                final epy b17 = this.b;
                return new aaad(zvn3, b17.d, (aujg)b17.k.a(), (ziy)this.b.l.a(), (oby)this.a.e.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 10: {
                return new adlp((zvn)this.b.h.a(), this.b.d, (oby)this.a.e.a(), (aujg)this.b.k.a(), (ziy)this.b.l.a(), (aait)this.a.es.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 9: {
                return new ziy((zvn)this.b.h.a(), this.b.d, (oby)this.a.e.a(), (aujg)this.b.k.a(), (byte[])null, (byte[])null);
            }
            case 8: {
                return new aujg((zvn)this.b.h.a(), this.b.d);
            }
            case 7: {
                return new zvv((zvn)this.b.h.a());
            }
            case 6: {
                final String p = zua.p(this.b.a);
                p.getClass();
                return p;
            }
            case 5: {
                final epy b18 = this.b;
                final eqy c4 = b18.c;
                final aacf aacf = new aacf(c4.e, c4.c, c4.w, b18.d, (byte[])null);
                final zvd zvd = (zvd)this.a.em.a();
                return new zvn(aacf, (String)this.b.g.a(), (byte[])null);
            }
            case 4: {
                return new zwh((Key)this.a.dY.a(), (zvn)this.b.h.a(), (zvv)this.b.i.a());
            }
            case 3: {
                final zzu zzu = (zzu)this.b.d.a();
                final zwh zwh2 = (zwh)this.b.j.a();
                final aujg aujg = (aujg)this.b.k.a();
                final ziy ziy3 = (ziy)this.b.l.a();
                final adlp adlp3 = (adlp)this.b.m.a();
                final aaad aaad2 = (aaad)this.b.n.a();
                final zwi zwi = (zwi)this.b.o.a();
                final aeea aeea2 = (aeea)this.b.p.a();
                final zvj zvj = (zvj)this.b.q.a();
                final zvh zvh = (zvh)this.b.r.a();
                final zvf zvf = (zvf)this.b.s.a();
                final zxf zxf = (zxf)this.b.t.a();
                return new zvo(zzu, zwh2, aujg, ziy3, adlp3, aaad2, zwi, aeea2, zvj, zvh, (zwp)this.b.w.a(), (oby)this.a.e.a(), (vjm)this.a.gm.a(), (aait)this.a.es.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 2: {
                final Context context2 = (Context)this.a.c.a();
                final String a21 = this.b.a;
                final msr msr2 = (msr)this.a.eV.a();
                final acgs acgs = (acgs)this.a.jl.a();
                final abse abse = (abse)this.a.a.U.a();
                final tnn tnn = (tnn)this.a.ek.a();
                final tpe tpe = (tpe)this.a.dU.a();
                final vaf vaf2 = (vaf)this.a.w.a();
                final aaec aaec = (aaec)this.a.eu.a();
                final eqy a22 = this.a;
                return new zzu(context2, a21, msr2, acgs, abse, tnn, vaf2, aaec, a22.kH, (adia)a22.ey.a(), (aait)this.a.es.a(), (byte[])null, (byte[])null);
            }
            case 1: {
                return new ztn((aujg)this.a.a.T.a(), (zzu)this.b.d.a(), (aaec)this.a.eu.a(), (tnn)this.a.ek.a(), arlr.b((atke)arlx.a), (xyx)this.a.dZ.a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 0: {
                return new aeea((ztn)this.b.e.a());
            }
        }
    }
}
