import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abtk implements asmi
{
    public final Object a;
    private final int b;
    
    public abtk(final abtl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abtk(final abtm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abtk(final abtn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abtk(final abvi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abtk(final abvo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abtk(final abvy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abtk(final abxa a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abtk(final abzz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abtk(final acjq a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final int b = this.b;
        final boolean b2 = true;
        final boolean b3 = true;
        boolean e = true;
        switch (b) {
            default: {
                final Object a = this.a;
                final aapv aapv = (aapv)o;
                ((abzz)a).f = false;
                return;
            }
            case 19: {
                final Object a2 = this.a;
                final acav a3 = ((aapv)o).a();
                if (a3.a() == 3) {
                    final abzz abzz = (abzz)a2;
                    abzz.y();
                    abzz.v();
                    abzz.x(a3.c(), a3.aa());
                }
                return;
            }
            case 18: {
                ((acjq)this.a).c((boolean)o);
                return;
            }
            case 17: {
                ((acat)this.a).e((aapq)o);
                return;
            }
            case 16: {
                ((acat)this.a).s((aapt)o);
                return;
            }
            case 15: {
                final Object a4 = this.a;
                final aaoc aaoc = (aaoc)o;
                ((abxa)a4).w();
                return;
            }
            case 14: {
                ((acat)this.a).P((aany)o);
                return;
            }
            case 13: {
                final Object a5 = this.a;
                final aapc aapc = (aapc)o;
                final ablh a6 = ablh.a;
                final abll a7 = abll.a;
                final int ordinal = aapc.c().ordinal();
                if (ordinal == 1) {
                    final PlayerResponseModel a8 = aapc.a();
                    if (a8 == null || !a8.T()) {
                        e = false;
                    }
                    final abxa abxa = (abxa)a5;
                    abxa.e = e;
                    if (e && abxa.c > 1.0f) {
                        abxa.v();
                    }
                    ((abwz)abxa.a.a()).L(abxa.c);
                    return;
                }
                if (ordinal != 7) {
                    return;
                }
                ((abxa)a5).w();
                return;
            }
            case 12: {
                ((abxa)this.a).d = (((aapv)o).a().a() != 0 && b2);
                return;
            }
            case 11: {
                final Object a9 = this.a;
                final aanm aanm = (aanm)o;
                final abvv c = ((abvy)a9).c;
                final lrr a10 = aanm.a();
                if (c.q != a10) {
                    c.q = a10;
                    c.b(2048);
                }
                return;
            }
            case 10: {
                final Object a11 = this.a;
                final tso tso = (tso)o;
                final abvo abvo = (abvo)a11;
                if (abvo.j.equals((Object)tso.a.a)) {
                    return;
                }
                abvo.j.set(tso.a.a);
                abvo.requestLayout();
                return;
            }
            case 9: {
                ((abvi)this.a).b((yre)o);
                return;
            }
            case 8: {
                final Object a12 = this.a;
                if (!((aaob)o).a()) {
                    ((abtn)a12).a.clear();
                }
                return;
            }
            case 7: {
                final Object a13 = this.a;
                final aapi aapi = (aapi)o;
                final SubtitleTrack a14 = aapi.a();
                if (aapi.c() && a14 != null) {
                    ((abtn)a13).a.add(a14.e());
                }
                return;
            }
            case 6: {
                final Object a15 = this.a;
                if (!((aaob)o).a()) {
                    final absc e2 = ((abtm)a15).n.e();
                    e2.b(null);
                    e2.b = "";
                    tfx.m(e2.a(), (tfv)zvv.q);
                }
                return;
            }
            case 5: {
                final Object a16 = this.a;
                final aanp aanp = (aanp)o;
                final PlayerResponseModel a17 = aanp.a();
                angk angk;
                if ((0x8 & aanp.b().b) != 0x0) {
                    aigi aigi;
                    if ((aigi = aanp.b().e) == null) {
                        aigi = aigi.a;
                    }
                    if ((angk = aigi.b) == null) {
                        angk = angk.a;
                    }
                }
                else {
                    angk = aanp.a().D();
                }
                final abtm abtm = (abtm)a16;
                abtm.f(abtm.k = a17, angk);
                return;
            }
            case 4: {
                ((abtm)this.a).l = ((aapv)o).a();
                return;
            }
            case 3: {
                final Object a18 = this.a;
                final acav a19 = ((aapv)o).a();
                final abtm abtm2 = (abtm)a18;
                abtm2.l = a19;
                abtm2.m = false;
                return;
            }
            case 2: {
                final Object a20 = this.a;
                final Integer n = (Integer)o;
                final zbx q = ((abtl)a20).q;
                if (q != null) {
                    q.i((int)n);
                }
                return;
            }
            case 1: {
                final Object a21 = this.a;
                final aaoe aaoe = (aaoe)o;
                final zbx q2 = ((abtl)a21).q;
                if (q2 != null) {
                    int i;
                    if (aaoe.d() == null) {
                        i = -1;
                    }
                    else {
                        i = aaoe.d().i;
                    }
                    q2.k(i, aaoe.d() != null && aaoe.d().b() && b3, aaoe.b(), aaoe.a());
                }
                return;
            }
            case 0: {
                final Object a22 = this.a;
                final aapp aapp = (aapp)o;
                final PlayerResponseModel b4 = aapp.b();
                final String e3 = aapp.e();
                final PlayerResponseModel a23 = aapp.a();
                final String k = aapp.k();
                final abll a24 = abll.a;
                final int ordinal2 = aapp.c().ordinal();
                if (ordinal2 != 3) {
                    if (ordinal2 != 4 && ordinal2 != 5) {
                        if (ordinal2 == 7 || ordinal2 == 8) {
                            if (b4 != null && e3 != null) {
                                final String j = b4.K();
                                final abtl abtl = (abtl)a22;
                                abtl.a(j, e3, abtl.b, b4.n(), b4.o().f, b4.m());
                            }
                        }
                    }
                    else if (a23 != null && b4 != null && k != null) {
                        final String l = a23.K();
                        final abtl abtl2 = (abtl)a22;
                        abtl2.a(l, k, abtl2.b, b4.n(), a23.o().f, a23.m());
                    }
                }
                else {
                    final abtl abtl3 = (abtl)a22;
                    final zbx q3 = abtl3.q;
                    if (q3 != null) {
                        if (abtl3.b()) {
                            q3.s("dedi", (zbq)new abti(abtl3, 2));
                        }
                        q3.x();
                    }
                }
            }
        }
    }
}
