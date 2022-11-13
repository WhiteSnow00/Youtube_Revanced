import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aakj implements asjm
{
    public final Object a;
    private final int b;
    
    public aakj(final aakk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aakj(final aalh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aakj(final aalm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aakj(final AtomicBoolean a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final int b = this.b;
        boolean b2 = false;
        boolean h = false;
        switch (b) {
            default: {
                ((aalm)this.a).b((aamg)o);
                return;
            }
            case 19: {
                ((aalm)this.a).e((aami)o);
                return;
            }
            case 18: {
                final Object a = this.a;
                final aamf aamf = (aamf)o;
                ((aalm)a).c();
                return;
            }
            case 17: {
                final Object a2 = this.a;
                final aamc aamc = (aamc)o;
                ((aalm)a2).c();
                return;
            }
            case 16: {
                final Object a3 = this.a;
                final aamv aamv = (aamv)o;
                final aalh aalh = (aalh)a3;
                if (aalh.b.a() != null) {
                    aalh.d(aamv);
                    aalh.d(aams.c(aamv));
                }
                return;
            }
            case 15: {
                final Object a4 = this.a;
                final aamf aamf2 = (aamf)o;
                ((aalh)a4).c();
                return;
            }
            case 14: {
                final Object a5 = this.a;
                final tfh tfh = (tfh)o;
                final aalh aalh2 = (aalh)a5;
                final xan xan = (xan)aalh2.b.a();
                if (xan != null && (tfh instanceof aamm || tfh instanceof aamr)) {
                    xan.c(tfh.f());
                    aalh2.e();
                }
                return;
            }
            case 13: {
                final Object a6 = this.a;
                final aamq aamq = (aamq)o;
                final aalh aalh3 = (aalh)a6;
                final xan xan2 = (xan)aalh3.b.a();
                final int g = (int)aalh3.a.f();
                if (xan2 != null && !aalh3.d) {
                    aalh3.d(aamq);
                    aalh3.d = true;
                    if (g > 0) {
                        final ahaz builder = ((ahbh)almj.a).createBuilder();
                        final ahaz builder2 = ((ahbh)alml.a).createBuilder();
                        builder2.copyOnWrite();
                        final alml alml = (alml)builder2.instance;
                        alml.b |= 0x40;
                        alml.g = g;
                        builder.copyOnWrite();
                        final almj almj = (almj)builder.instance;
                        final alml l = (alml)builder2.build();
                        l.getClass();
                        almj.L = l;
                        almj.c |= 0x800000;
                        xan2.a((almj)builder.build());
                    }
                }
                return;
            }
            case 12: {
                final Object a7 = this.a;
                final aany aany = (aany)o;
                final aalh aalh4 = (aalh)a7;
                aalh4.c();
                aalh4.a.g();
                final abzl a8 = aany.a();
                if (a8 != null) {
                    aalh4.b = a8.b();
                    return;
                }
                aalh4.b = (tvn)aala.c;
                return;
            }
            case 11: {
                final Object a9 = this.a;
                final aaml aaml = (aaml)o;
                final aalh aalh5 = (aalh)a9;
                if (aalh5.b.a() != null) {
                    aalh5.d(aaml);
                }
                return;
            }
            case 10: {
                final Object a10 = this.a;
                final aans aans = (aans)o;
                final xan xan3 = (xan)((aalh)a10).b.a();
                final String e = aans.e();
                final PlayerResponseModel b3 = aans.b();
                if (aans.c() == abke.c && xan3 != null && e != null && b3 != null) {
                    xan3.c("gv");
                    final ahaz builder3 = ((ahbh)almj.a).createBuilder();
                    builder3.copyOnWrite();
                    final almj almj2 = (almj)builder3.instance;
                    almj2.b |= 0x1000;
                    almj2.n = e;
                    if (!b3.K().isEmpty()) {
                        final String k = b3.K();
                        builder3.copyOnWrite();
                        final almj almj3 = (almj)builder3.instance;
                        k.getClass();
                        almj3.b |= 0x4000000;
                        almj3.w = k;
                    }
                    xan3.a((almj)builder3.build());
                }
                return;
            }
            case 9: {
                final Object a11 = this.a;
                final aama aama = (aama)o;
                ((aalh)a11).e();
                return;
            }
            case 8: {
                final Object a12 = this.a;
                final ypj ypj = (ypj)o;
                FormatStreamModel formatStreamModel;
                if ((formatStreamModel = ypj.f()) == null) {
                    formatStreamModel = ypj.e();
                }
                final xan xan4 = (xan)((aalh)a12).b.a();
                if (formatStreamModel != null && xan4 != null) {
                    final ahaz builder4 = ((ahbh)almj.a).createBuilder();
                    final ahaz builder5 = ((ahbh)alml.a).createBuilder();
                    final int e2 = formatStreamModel.e();
                    builder5.copyOnWrite();
                    final alml alml2 = (alml)builder5.instance;
                    alml2.b |= 0x1;
                    alml2.c = e2;
                    builder4.copyOnWrite();
                    final almj almj4 = (almj)builder4.instance;
                    final alml i = (alml)builder5.build();
                    i.getClass();
                    almj4.L = i;
                    almj4.c |= 0x800000;
                    xan4.a((almj)builder4.build());
                }
                return;
            }
            case 7: {
                final Object a13 = this.a;
                final aany aany2 = (aany)o;
                final aalh aalh6 = (aalh)a13;
                final xan a14 = aalh6.a();
                if (a14 != null && !aalh6.e) {
                    final ahaz builder6 = ((ahbh)almj.a).createBuilder();
                    final String aa = aany2.a().aa();
                    builder6.copyOnWrite();
                    final almj almj5 = (almj)builder6.instance;
                    aa.getClass();
                    almj5.b |= 0x8000;
                    almj5.p = aa;
                    final PlayerResponseModel c = aany2.a().c();
                    if (c != null) {
                        final String j = c.K();
                        builder6.copyOnWrite();
                        final almj almj6 = (almj)builder6.instance;
                        j.getClass();
                        almj6.b |= 0x10000000;
                        almj6.y = j;
                    }
                    a14.a((almj)builder6.build());
                    aalh6.e = true;
                }
                final abzl a15 = aany2.a();
                final aand c2 = aalh6.c;
                if (c2 != null && TextUtils.equals((CharSequence)a15.aa(), (CharSequence)c2.b())) {
                    final xan xan5 = (xan)a15.b().a();
                    if (xan5 != null) {
                        xan5.f(c2.a());
                    }
                }
                aalh6.c = null;
                return;
            }
            case 6: {
                ((aalh)this.a).c = (aand)o;
                return;
            }
            case 5: {
                final Object a16 = this.a;
                if (((aamh)o).d() == abjv.h) {
                    h = true;
                }
                ((aakk)a16).h = h;
                return;
            }
            case 4: {
                final Object a17 = this.a;
                final aano aano = (aano)o;
                ((aakk)a17).i = true;
                return;
            }
            case 3: {
                final Object a18 = this.a;
                final aany aany3 = (aany)o;
                final aakk aakk = (aakk)a18;
                final boolean m = aakk.i;
                if (aany3.a().a() == 3) {
                    b2 = true;
                }
                aakk.i = (m | b2);
                return;
            }
            case 2: {
                final Object a19 = this.a;
                final aany aany4 = (aany)o;
                ((aakk)a19).i = false;
                return;
            }
            case 1: {
                ((AtomicBoolean)this.a).set((boolean)o);
                return;
            }
            case 0: {
                final Object a20 = this.a;
                if (((aans)o).c() == abke.j) {
                    final aakk aakk2 = (aakk)a20;
                    if (!aakk2.i && !((aakl)aakk2.f.a()).b() && !aakk2.h) {
                        if (aald.c(((aakl)aakk2.f.a()).c(abop.c))) {
                            final xan g2 = (xan)aakk2.b.a();
                            final aboo c3 = aboo.c;
                            final abjs a21 = abjt.a();
                            a21.g = g2;
                            aakk2.a.execute((Runnable)new aagj(aakk2, new abop(c3, null, a21.a()), 7));
                            return;
                        }
                        ((aukf)aakk2.j.a).tu((Object)new aang(true));
                    }
                }
            }
        }
    }
}
