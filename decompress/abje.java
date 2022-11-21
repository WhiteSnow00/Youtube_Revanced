import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.util.Pair;
import android.view.View$OnClickListener;
import java.util.concurrent.TimeUnit;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abje implements asmi
{
    public final Object a;
    private final int b;
    
    public abje(final abjf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abje(final abjq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abje(final abjv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abje(final abjx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abje(final abkf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abje(final aefs a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(Object o) {
        final int b = this.b;
        boolean j = true;
        final boolean b2 = true;
        switch (b) {
            default: {
                final Object a = this.a;
                final aapw aapw = (aapw)o;
                final aslm aslm = new aslm();
                final aske v = aapw.a().V();
                final aefs aefs = (aefs)a;
                aslm.c(v.an(new abkg(aefs, 7, null, null, null, null), (asmi)abgj.h));
                aslm.c(aapw.a().u().an(new abkg(aefs, 19, null, null, null, null), (asmi)abgj.h));
                aslm.c(aapw.a().U().an(new abkh(aefs, 2, null, null, null, null), (asmi)abgj.h));
                aslm.c(aapw.a().t().an(new abkh(aefs, 3, null, null, null, null), (asmi)abgj.h));
                aslm.c(aapw.a().r().an(new abkh(aefs, 7, null, null, null, null), (asmi)abgj.h));
                aslm.c(aapw.a().x().an(new abkg(aefs, 8, null, null, null, null), (asmi)abgj.h));
                aslm.c(aapw.a().z().an(new abkg(aefs, 9, null, null, null, null), (asmi)abgj.h));
                aslm.c(aapw.a().C().an(new abkg(aefs, 11, null, null, null, null), (asmi)abgj.h));
                aslm.c(aapw.a().A().an(new abkg(aefs, 12, null, null, null, null), (asmi)abgj.h));
                aslm.c(aapw.a().H().an(new abkg(aefs, 13, null, null, null, null), (asmi)abgj.h));
                aslm.c(aapw.a().B().an(new abkg(aefs, 14, null, null, null, null), (asmi)abgj.h));
                aslm.c(aapw.a().K().an(new abkg(aefs, 15, null, null, null, null), (asmi)abgj.h));
                aslm.c(aapw.a().N().an(new abkg(aefs, 16, null, null, null, null), (asmi)abgj.h));
                aslm.c(aapw.a().Q().an(new abkg(aefs, 17, null, null, null, null), (asmi)abgj.h));
                aslm.c(aapw.a().T().an(new abkg(aefs, 18, null, null, null, null), (asmi)abgj.h));
                aslm.c(aapw.a().X().an(new abkg(aefs, 20, null, null, null, null), (asmi)abgj.h));
                aslm.c(aapw.a().G().an(new abkg(aefs, 2, null, null, null, null), (asmi)abgj.h));
                aslm.c(aapw.a().R().an(new abkh(aefs, 1, null, null, null, null), (asmi)abgj.h));
                aslm.c(aapw.a().S().an(new abkh(aefs, 0, null, null, null, null), (asmi)abgj.h));
                return;
            }
            case 19: {
                final Object a2 = this.a;
                final aapx aapx = (aapx)o;
                final abkf abkf = (abkf)a2;
                final String e = abkf.e;
                if (e != null && TextUtils.equals((CharSequence)e, (CharSequence)aapx.b())) {
                    abkf.e = null;
                }
                return;
            }
            case 18: {
                final Object a3 = this.a;
                final aapv aapv = (aapv)o;
                final acav a4 = aapv.a();
                final abkf abkf2 = (abkf)a3;
                abkf2.f = a4;
                final String e2 = abkf2.e;
                if (e2 != null) {
                    if (e2.equals(aapv.a().aa())) {
                        final PlaybackStartDescriptor g = aapv.a().g();
                        final abmo a5 = abkf2.a;
                        final PlayerResponseModel c = aapv.a().c();
                        a5.n(abli.b);
                        a5.n = g;
                        a5.m = null;
                        a5.p = null;
                        a5.o = c;
                        a5.n(abli.d);
                        abkf2.a.s(aapv.a().aa(), (abna)new abke(abkf2));
                        abkf2.e = null;
                    }
                }
                return;
            }
            case 17: {
                ((abjx)this.a).h = (((aaoe)o).d() == ablc.h && b2);
                return;
            }
            case 16: {
                final Object a6 = this.a;
                final aapq aapq = (aapq)o;
                final abjx abjx = (abjx)a6;
                if (abjx.i) {
                    final apyi f = abjx.f;
                    if (f != null) {
                        apyj apyj;
                        if ((apyj = f.b) == null) {
                            apyj = apyj.a;
                        }
                        if (apyj.b == 126827209) {
                            if (!abjx.h) {
                                apyj apyj2;
                                if ((apyj2 = abjx.f.b) == null) {
                                    apyj2 = apyj.a;
                                }
                                apyh a7;
                                if (apyj2.b == 126827209) {
                                    a7 = (apyh)apyj2.c;
                                }
                                else {
                                    a7 = apyh.a;
                                }
                                if (aapq.e() > TimeUnit.SECONDS.toMillis(a7.d)) {
                                    abjx.k = (int)TimeUnit.MILLISECONDS.toSeconds(aapq.e());
                                    if (abjx.d.a() <= a7.c) {
                                        abjx.b(apyf.b, a7);
                                    }
                                    else if (a7.f == 0) {
                                        abjx.i(a7);
                                        abjx.h(a7);
                                    }
                                    else if ((a7.b & 0x80) != 0x0 && a7.i) {
                                        final ojx l = abjx.l;
                                        final hli a8 = new hli(abjx, a7, 5);
                                        final zig zig = new zig(abjx, a7, 5);
                                        final gcb d = gcd.d();
                                        d.j();
                                        d.c(a7.f);
                                        ajws ajws;
                                        if ((a7.b & 0x400) != 0x0) {
                                            if ((ajws = a7.j) == null) {
                                                ajws = ajws.a;
                                            }
                                        }
                                        else {
                                            ajws = null;
                                        }
                                        d.k((CharSequence)acbu.b(ajws));
                                        aiet aiet;
                                        if ((aiet = a7.k) == null) {
                                            aiet = aiet.a;
                                        }
                                        aies aies;
                                        if ((aies = aiet.c) == null) {
                                            aies = aies.a;
                                        }
                                        ajws ajws2;
                                        if ((aies.b & 0x200) != 0x0) {
                                            aiet aiet2;
                                            if ((aiet2 = a7.k) == null) {
                                                aiet2 = aiet.a;
                                            }
                                            aies aies2;
                                            if ((aies2 = aiet2.c) == null) {
                                                aies2 = aies.a;
                                            }
                                            if ((ajws2 = aies2.i) == null) {
                                                ajws2 = ajws.a;
                                            }
                                        }
                                        else {
                                            ajws2 = null;
                                        }
                                        ((acxp)d).m((CharSequence)acbu.b(ajws2), (View$OnClickListener)zig);
                                        d.a = (acxb)a8;
                                        l.b = d.a();
                                        ((acxo)l.a).n((acxq)l.b);
                                    }
                                    else {
                                        abjx.c(a7, false);
                                    }
                                    abjx.f = null;
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 15: {
                final Object a9 = this.a;
                final aapp aapp = (aapp)o;
                final abll c2 = aapp.c();
                if (c2.a(abll.c)) {
                    final abjx abjx2 = (abjx)a9;
                    abjx2.f = null;
                    for (final akze akze : aapp.b().ac()) {
                        if (akze != null && (akze.b & 0x2) != 0x0) {
                            apyi f2;
                            if ((f2 = akze.d) == null) {
                                f2 = apyi.a;
                            }
                            abjx2.f = f2;
                            abjx2.j = aapp.e();
                        }
                    }
                }
                else if (c2.a(abll.a, abll.j)) {
                    final abjx abjx3 = (abjx)a9;
                    abjx3.a();
                    abjx3.j = "";
                    abjx3.k = -1;
                }
                ((abjx)a9).i = c2.a(abll.i);
                return;
            }
            case 14: {
                ((abjv)this.a).a = afbh.k(o);
                return;
            }
            case 13: {
                final Object a10 = this.a;
                final aapv aapv2 = (aapv)o;
                ((abjq)a10).h();
                return;
            }
            case 12: {
                final Object a11 = this.a;
                final aapt aapt = (aapt)o;
                final abjq abjq = (abjq)a11;
                if (!abjq.i()) {
                    return;
                }
                final boolean c3 = aapt.c();
                abjq.k = c3;
                if (c3 || !abjq.j) {
                    j = false;
                }
                abjq.j = j;
                return;
            }
            case 11: {
                final Object a12 = this.a;
                final aapv aapv3 = (aapv)o;
                final PlayerResponseModel c4 = aapv3.a().c();
                if (aapv3.a().a() == 3 && c4 != null) {
                    ((abjq)a12).f(c4);
                }
                return;
            }
            case 10: {
                final Object a13 = this.a;
                final aapq aapq2 = (aapq)o;
                final abjq abjq2 = (abjq)a13;
                if (!abjq2.i()) {
                    return;
                }
                abjq2.j = abjq.k(aapq2);
                return;
            }
            case 9: {
                ((abjq)this.a).f(((aaoz)o).a());
                return;
            }
            case 8: {
                final Object a14 = this.a;
                final aaoa aaoa = (aaoa)o;
                final abjf abjf = (abjf)a14;
                final acbb n = abjf.r.n(aaoa.a());
                if (n != null && n.e.equals(abjf.u) && !abjf.b(abjf.u)) {
                    long a15 = aaoa.a();
                    if (abjf.q.containsKey(abjf.u)) {
                        a15 = aaoa.a() - (long)abjf.q.get(abjf.u).first;
                    }
                    final absp t = abjf.t;
                    if (t != null) {
                        t.l(a15);
                    }
                }
                return;
            }
            case 7: {
                final Object a16 = this.a;
                final yre yre = (yre)o;
                if (yed.m(yre.b())) {
                    final absp t2 = ((abjf)a16).t;
                    if (t2 != null) {
                        t2.g(yre);
                    }
                }
                return;
            }
            case 6: {
                final Object a17 = this.a;
                final aaoc aaoc = (aaoc)o;
                final absp t3 = ((abjf)a17).t;
                if (t3 != null) {
                    t3.o();
                }
                return;
            }
            case 5: {
                final Object a18 = this.a;
                final aapq aapq3 = (aapq)o;
                final abjf abjf2 = (abjf)a18;
                if (!abjf2.b(abjf2.u)) {
                    long e3 = aapq3.e();
                    if (abjf2.q.containsKey(abjf2.u)) {
                        e3 -= (long)abjf2.q.get(abjf2.u).first;
                    }
                    long n2 = aapq3.f();
                    final acbb d2 = abjf2.r.d(abjf2.u);
                    if (d2 != null) {
                        n2 = TimeUnit.SECONDS.toMillis(d2.f.h());
                    }
                    o = new aapq(e3, aapq3.b(), 0L, n2, aapq3.a(), aapq3.d(), aapq3.c(), aapq3.j(), abjf2.u);
                    final absp t4 = abjf2.t;
                    if (t4 != null) {
                        t4.q((aapq)o);
                    }
                }
                return;
            }
            case 4: {
                final Object a19 = this.a;
                final aapt aapt2 = (aapt)o;
                final abjf abjf3 = (abjf)a19;
                if (!abjf3.b(abjf3.u)) {
                    final int a20 = aapt2.a();
                    if (a20 != 3) {
                        if (a20 != 4) {
                            if (a20 == 7) {
                                final absp t5 = abjf3.t;
                                if (t5 != null) {
                                    t5.i();
                                }
                            }
                        }
                        else {
                            final absp t6 = abjf3.t;
                            if (t6 != null) {
                                t6.n();
                            }
                        }
                    }
                    else {
                        final absp t7 = abjf3.t;
                        if (t7 != null) {
                            t7.k();
                        }
                    }
                }
                return;
            }
            case 3: {
                final Object a21 = this.a;
                final Boolean b3 = (Boolean)o;
                final absp t8 = ((abjf)a21).t;
                if (t8 != null) {
                    t8.b();
                }
                return;
            }
            case 2: {
                final Object a22 = this.a;
                final aapi aapi = (aapi)o;
                final absp t9 = ((abjf)a22).t;
                if (t9 != null) {
                    t9.e(aapi);
                }
                return;
            }
            case 1: {
                final Object a23 = this.a;
                final aapn aapn = (aapn)o;
                final absp t10 = ((abjf)a23).t;
                if (t10 != null) {
                    t10.f(aapn);
                }
                return;
            }
            case 0: {
                final Object a24 = this.a;
                final aaoe aaoe = (aaoe)o;
                final absp t11 = ((abjf)a24).t;
                if (t11 != null) {
                    t11.d(aaoe);
                }
            }
        }
    }
}
