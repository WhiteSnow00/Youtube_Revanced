import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import android.text.Spanned;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.text.TextUtils;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abvy implements thj
{
    public final abvt a;
    final abvw b;
    public abvv c;
    public boolean d;
    public aape e;
    private final thg f;
    private abwc g;
    private abwb h;
    private final abnd i;
    
    public abvy(final abvt a, final abnd i, final abvw b, final thg f, final byte[] array) {
        this.a = a;
        this.i = i;
        this.b = b;
        this.f = f;
    }
    
    public final void a() {
        this.f.g((Object)this);
        ((aske)this.i.i).am(new abtk(this, 11));
    }
    
    public final void b(final abwb abwb) {
        this.h = abwb;
        this.a.d = abwb;
        this.d();
    }
    
    public final void c(final abwc abwc) {
        this.g = abwc;
        this.a.c = abwc;
        this.d();
    }
    
    public final void d() {
        final aape e = this.e;
        final boolean b = true;
        final boolean b2 = e != null && e.c();
        final abvv c = this.c;
        final abwc g = this.g;
        boolean d = b2;
        if (g != null) {
            d = g.d();
        }
        final abwb h = this.h;
        boolean c2;
        if (h != null) {
            c2 = h.c();
        }
        else {
            final aape e2 = this.e;
            c2 = (e2 != null && e2.b() && b);
        }
        c.h(d, c2);
    }
    
    public final Class[] mr(final Class clazz, final Object o, int i) {
        boolean b = false;
        final Class[] array = null;
        Class[] array2 = null;
        switch (i) {
            default: {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            case 7: {
                final ablo ablo = (ablo)o;
                this.c.i(8);
                array2 = array;
                break;
            }
            case 6: {
                final aapt aapt = (aapt)o;
                if (!this.d) {
                    array2 = array;
                    break;
                }
                this.c.i(aapt.a());
                return null;
            }
            case 5: {
                this.c.j(((aapq)o).e());
                array2 = array;
                break;
            }
            case 4: {
                final aapp aapp = (aapp)o;
                this.d = aapp.c().c(abll.c);
                final PlayerResponseModel b2 = aapp.b();
                if (aapp.c() == abll.a) {
                    this.c.d();
                    final abvt a = this.a;
                    a.c = null;
                    a.d = null;
                    array2 = array;
                    break;
                }
                array2 = array;
                if (aapp.c() != abll.c) {
                    break;
                }
                array2 = array;
                if (b2 != null) {
                    this.c.n();
                    final vxu aa = vxu.aa(b2.y(), 0L, (vku)null);
                    if (aa != null) {
                        this.c.g(Duration.ofSeconds((long)((PlayerResponseModel)aa.b).h()).toMillis());
                    }
                    else {
                        this.c.g(Duration.ofSeconds((long)b2.h()).toMillis());
                    }
                    final abvv c = this.c;
                    if (!aapp.l() || b2.U()) {
                        b = true;
                    }
                    c.f(b);
                    this.c.m(b2.J(), null);
                    this.c.l(b2.l());
                    this.b.d(b2.l(), afbh.k(aamr.m(b2.y())));
                    this.c.a();
                    array2 = array;
                    break;
                }
                break;
            }
            case 3: {
                final aapf aapf = (aapf)o;
                array2 = array;
                if (aapf.c() != abli.e) {
                    break;
                }
                final WatchNextResponseModel a2 = aapf.a();
                array2 = array;
                if (a2 == null) {
                    break;
                }
                if (TextUtils.isEmpty((CharSequence)a2.b)) {
                    array2 = array;
                    break;
                }
                final algm a3 = a2.a;
                alxm alxm;
                if ((0x4000 & a3.b) != 0x0) {
                    algi algi;
                    if ((algi = a3.q) == null) {
                        algi = algi.a;
                    }
                    if (algi.b == 61479009) {
                        alxm = (alxm)algi.c;
                    }
                    else {
                        alxm = alxm.a;
                    }
                }
                else {
                    algn algn;
                    if ((algn = a3.e) == null) {
                        algn = algn.a;
                    }
                    algd a4;
                    if (algn.b == 51779735) {
                        a4 = (algd)algn.c;
                    }
                    else {
                        a4 = algd.a;
                    }
                    if ((a4.b & 0x8) != 0x0) {
                        algn algn2;
                        if ((algn2 = a3.e) == null) {
                            algn2 = algn.a;
                        }
                        algd a5;
                        if (algn2.b == 51779735) {
                            a5 = (algd)algn2.c;
                        }
                        else {
                            a5 = algd.a;
                        }
                        alga alga;
                        if ((alga = a5.f) == null) {
                            alga = alga.a;
                        }
                        if (alga.b == 61479009) {
                            alxm = (alxm)alga.c;
                        }
                        else {
                            alxm = alxm.a;
                        }
                    }
                    else {
                        alxm = null;
                    }
                }
                Spanned b3;
                if (alxm == null) {
                    b3 = null;
                }
                else {
                    ajws ajws;
                    if ((alxm.b & 0x1) != 0x0) {
                        if ((ajws = alxm.c) == null) {
                            ajws = ajws.a;
                        }
                    }
                    else {
                        ajws = null;
                    }
                    b3 = acbu.b(ajws);
                }
                Object b4;
                if (alxm == null) {
                    b4 = null;
                }
                else {
                    ajws ajws2;
                    if ((alxm.b & 0x8) != 0x0) {
                        if ((ajws2 = alxm.d) == null) {
                            ajws2 = ajws.a;
                        }
                    }
                    else {
                        ajws2 = null;
                    }
                    b4 = acbu.b(ajws2);
                }
                CharSequence charSequence = (CharSequence)b4;
                CharSequence j = (CharSequence)b3;
                if (TextUtils.isEmpty((CharSequence)b3)) {
                    final PlayerResponseModel b5 = aapf.b();
                    charSequence = (CharSequence)b4;
                    j = (CharSequence)b3;
                    if (b5 != null) {
                        j = b5.J();
                        charSequence = null;
                    }
                }
                this.c.m(j, charSequence);
                array2 = array;
                break;
            }
            case 2: {
                this.e = (aape)o;
                this.d();
                array2 = array;
                break;
            }
            case 1: {
                final aany aany = (aany)o;
                final abvv c2 = this.c;
                final float a6 = aany.a();
                if (c2.k == a6) {
                    array2 = array;
                    break;
                }
                c2.k = a6;
                c2.b(16384);
                return null;
            }
            case 0: {
                final FormatStreamModel f = ((yre)o).f();
                if (f == null) {
                    array2 = array;
                    break;
                }
                final abvv c3 = this.c;
                final int d = f.d();
                i = f.i();
                c3.i = d;
                c3.j = i;
                c3.b(65536);
                return null;
            }
            case -1: {
                array2 = new Class[] { yre.class, aany.class, aape.class, aapf.class, aapp.class, aapq.class, aapt.class, ablo.class };
                break;
            }
        }
        return array2;
    }
}
