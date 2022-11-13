import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abrx implements asjm
{
    public final Object a;
    private final int b;
    
    public abrx(final abry a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abrx(final abrz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abrx(final absb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final int b = this.b;
        final boolean b2 = false;
        switch (b) {
            default: {
                ((absb)this.a).l = ((aany)o).a();
                return;
            }
            case 19: {
                final Object a = this.a;
                final abzl a2 = ((aany)o).a();
                final absb absb = (absb)a;
                absb.l = a2;
                absb.m = false;
                return;
            }
            case 18: {
                final Object a3 = this.a;
                final Integer n = (Integer)o;
                final zaa q = ((abrz)a3).q;
                if (q != null) {
                    q.i((int)n);
                }
                return;
            }
            case 17: {
                final Object a4 = this.a;
                final aans aans = (aans)o;
                final PlayerResponseModel b3 = aans.b();
                final String e = aans.e();
                final PlayerResponseModel a5 = aans.a();
                final String k = aans.k();
                final abke a6 = abke.a;
                final int ordinal = aans.c().ordinal();
                if (ordinal != 3) {
                    if (ordinal != 4 && ordinal != 5) {
                        if (ordinal == 7 || ordinal == 8) {
                            if (b3 != null && e != null) {
                                final String i = b3.K();
                                final abrz abrz = (abrz)a4;
                                abrz.a(i, e, abrz.b, b3.n(), b3.o().f, b3.m());
                            }
                        }
                    }
                    else if (a5 != null && b3 != null && k != null) {
                        final String j = a5.K();
                        final abrz abrz2 = (abrz)a4;
                        abrz2.a(j, k, abrz2.b, b3.n(), a5.o().f, a5.m());
                    }
                }
                else {
                    final abrz abrz3 = (abrz)a4;
                    final zaa q2 = abrz3.q;
                    if (q2 != null) {
                        if (abrz3.b()) {
                            q2.s("dedi", (yzr)new abrw(abrz3, 2));
                        }
                        q2.x();
                    }
                }
                return;
            }
            case 16: {
                final Object a7 = this.a;
                final aamh aamh = (aamh)o;
                final zaa q3 = ((abrz)a7).q;
                if (q3 != null) {
                    int l;
                    if (aamh.d() == null) {
                        l = -1;
                    }
                    else {
                        l = aamh.d().i;
                    }
                    boolean b4 = b2;
                    if (aamh.d() != null) {
                        b4 = b2;
                        if (aamh.d().b()) {
                            b4 = true;
                        }
                    }
                    q3.k(l, b4, aamh.b(), aamh.a());
                }
                return;
            }
            case 15: {
                final Object a8 = this.a;
                final abkh abkh = (abkh)o;
                final abrz abrz4 = (abrz)a8;
                final anqz c = abrz.c(abrz4.t);
                final zaa q4 = abrz4.q;
                if (abkh.i == 4 && abrz4.a != null && q4 != null && c.e) {
                    q4.y(abkh.g, abkh.f);
                }
                return;
            }
            case 14: {
                final Object a9 = this.a;
                final aanw aanw = (aanw)o;
                final zaa q5 = ((abrz)a9).q;
                if (q5 != null) {
                    final int a10 = aanw.a();
                    if (a10 != 2) {
                        if (a10 == 3) {
                            q5.v();
                            return;
                        }
                        if (a10 == 5) {
                            q5.o();
                            return;
                        }
                        if (a10 == 6) {
                            q5.w();
                            return;
                        }
                        if (a10 == 7) {
                            q5.q();
                            return;
                        }
                        if (a10 == 9 || a10 == 10) {
                            q5.A();
                        }
                    }
                    else {
                        q5.z();
                    }
                }
                return;
            }
            case 13: {
                final Object a11 = this.a;
                final ypj ypj = (ypj)o;
                final zaa q6 = ((abrz)a11).q;
                if (q6 != null) {
                    q6.r(ypj);
                }
                return;
            }
            case 12: {
                final Object a12 = this.a;
                final aaly aaly = (aaly)o;
                final zaa q7 = ((abrz)a12).q;
                if (aaly.c() && q7 != null) {
                    q7.C(aaly.b());
                    return;
                }
                if (q7 != null) {
                    q7.t(aaly.b());
                }
                return;
            }
            case 11: {
                final Object a13 = this.a;
                final aank aank = (aank)o;
                final zaa q8 = ((abrz)a13).q;
                if (q8 != null) {
                    q8.p(aank.b(), aank.i(), aank.j(), aank.e(), aank.f(), aank.g(), aank.h());
                }
                return;
            }
            case 10: {
                final Object a14 = this.a;
                final Throwable t = (Throwable)o;
                final zaa q9 = ((abrz)a14).q;
                if (q9 != null) {
                    q9.u(new zbq(zbp.a, "rx", 0L, t));
                    return;
                }
                zlm.c(zll.b, zlk.j, "QoeStatsMonitor failed unexpectedly.", t);
                return;
            }
            case 9: {
                final Object a15 = this.a;
                final aamb aamb = (aamb)o;
                final zaa q10 = ((abrz)a15).q;
                if (q10 != null) {
                    q10.j(aamb.a());
                }
                return;
            }
            case 8: {
                final Object a16 = this.a;
                final aant aant = (aant)o;
                final zaa q11 = ((abrz)a16).q;
                if (q11 != null) {
                    q11.D(aant.j(), aant.g(), aant.a());
                }
                return;
            }
            case 7: {
                final Object a17 = this.a;
                final abkh abkh2 = (abkh)o;
                final abrz abrz5 = (abrz)a17;
                final anqz c2 = abrz.c(abrz5.t);
                final zaa q12 = abrz5.q;
                if (abkh2.i == 4 && abrz5.a != null && q12 != null && c2.e) {
                    q12.y(abkh2.g, abkh2.f);
                }
                return;
            }
            case 6: {
                final Object a18 = this.a;
                final aamf aamf = (aamf)o;
                final abrz abrz6 = (abrz)a18;
                final zaa q13 = abrz6.q;
                if (q13 != null) {
                    if (abrz6.b()) {
                        q13.s("dedi", (yzr)new abrw(abrz6, 3));
                    }
                    q13.x();
                }
                return;
            }
            case 5: {
                final Object a19 = this.a;
                final zbq zbq = (zbq)o;
                final zaa q14 = ((abrz)a19).q;
                if (q14 != null) {
                    q14.u(zbq);
                }
                return;
            }
            case 4: {
                final Object a20 = this.a;
                final ancj ancj = (ancj)o;
                final zaa q15 = ((abrz)a20).q;
                if (q15 != null) {
                    q15.F(ancj.n);
                }
                return;
            }
            case 3: {
                final Object a21 = this.a;
                final aank aank2 = (aank)o;
                final String d = aank2.d();
                if (d != null) {
                    final abry abry = (abry)a21;
                    if (abry.b.containsKey(d)) {
                        ((zaa)abry.b.get(d)).p(aank2.b(), aank2.i(), aank2.j(), aank2.e(), aank2.f(), aank2.g(), aank2.h());
                    }
                }
                return;
            }
            case 2: {
                final Object a22 = this.a;
                final int intValue = (int)o;
                final Iterator iterator = ((abry)a22).b.values().iterator();
                while (iterator.hasNext()) {
                    ((zaa)iterator.next()).i(intValue);
                }
                return;
            }
            case 1: {
                final Object a23 = this.a;
                final aamh c3 = (aamh)o;
                final abry abry2 = (abry)a23;
                abry2.c = c3;
                final Iterator iterator2 = abry2.b.values().iterator();
                while (iterator2.hasNext()) {
                    abry.t((zaa)iterator2.next(), c3);
                }
                return;
            }
            case 0: {
                final Object a24 = this.a;
                final ancj ancj2 = (ancj)o;
                final Iterator iterator3 = ((abry)a24).b.values().iterator();
                while (iterator3.hasNext()) {
                    ((zaa)iterator3.next()).F(ancj2.n);
                }
            }
        }
    }
}
