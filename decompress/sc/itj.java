import android.text.TextUtils;
import android.content.Context;
import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;

// 
// Decompiled by Procyon v0.6.0
// 

public final class itj implements abeg, iss, abps
{
    public final bu a;
    public final ith b;
    public aezp c;
    public apoc d;
    public VideoQuality[] e;
    private final iti f;
    private final Handler g;
    private final acwb h;
    private final ftk i;
    private boolean j;
    private ist k;
    private ist l;
    private int m;
    private String n;
    private int o;
    private final arwh p;
    
    public itj(final bu a, final ith b, final iti f, final Handler g, final arwh p9, final acwb h, final ftk i, final byte[] array, final byte[] array2) {
        this.a = a;
        this.i = i;
        this.b = b;
        this.f = f;
        this.g = g;
        this.p = p9;
        this.h = h;
        this.c = (aezp)aeyo.a;
        this.d = apoc.a;
        amfz amfz;
        if ((amfz = p9.f().i) == null) {
            amfz = amfz.a;
        }
        amga amga;
        if ((amga = amfz.j) == null) {
            amga = amga.a;
        }
        int o;
        if (amga.c) {
            o = 3;
            this.o = 3;
        }
        else {
            anfc anfc;
            if ((anfc = p9.f().j) == null) {
                anfc = anfc.a;
            }
            if (anfc.w) {
                o = 2;
            }
            else {
                o = 1;
            }
            this.o = o;
        }
        i.a("menu_item_video_quality", j(o, this.j));
    }
    
    private final ist h(final boolean b) {
        ist ist;
        if (this.o == 3) {
            if (this.l == null && b) {
                final ist l = new ist(this.a.getString(2132019314), new iso(this, 12, null));
                this.l = l;
                ((qkq)l).e = tpe.k((Context)this.a, 2131233742, 2130970924);
                this.l.g(true);
                this.l.f(this.n);
            }
            ist = this.l;
        }
        else {
            if (this.k == null && b) {
                final ist k = new ist(this.a.getString(2132019314), new iso(this, 11));
                this.k = k;
                ((qkq)k).e = tpe.k((Context)this.a, 2131233742, 2130970924);
                this.k.g(this.j);
                this.k.f(this.n);
            }
            ist = this.k;
        }
        return ist;
    }
    
    private final void i(final ist ist, String e) {
        if (adkp.ae(this.n, e)) {
            return;
        }
        this.n = e;
        this.i.d("menu_item_video_quality", e);
        if (ist == null) {
            return;
        }
        e = aezr.e(e);
        if (tbi.h()) {
            ist.f(e);
            return;
        }
        this.g.post((Runnable)new iep(ist, e, 17));
    }
    
    private static boolean j(final int n, final boolean b) {
        return n == 3 || b;
    }
    
    public final ist a() {
        final ist h = this.h(true);
        h.getClass();
        return h;
    }
    
    public final void c(final String s) {
        final acwb h = this.h;
        final gbv d = gbx.d();
        d.j();
        d.k((CharSequence)s);
        d.c(-1);
        h.n((acwd)d.a());
    }
    
    public final void d() {
        if (this.j) {
            this.f.c(this.a);
            return;
        }
        final acwb h = this.h;
        final gbv d = gbx.d();
        d.j();
        d.k((CharSequence)this.a.getString(2132020154));
        d.c(0);
        h.n((acwd)d.a());
    }
    
    public final VideoQuality[] f() {
        final VideoQuality[] e = this.e;
        e.getClass();
        return e;
    }
    
    public final asir[] lX(final abpu abpu) {
        return new asir[] { abpu.H((aezf)iny.i, (aezf)iny.j).R().P(asil.a()).an((asjm)new itf(this, 2), (asjm)ise.k) };
    }
    
    public final void m(final boolean j) {
        final ist k = this.k;
        if (k != null) {
            k.g(j);
        }
        if (!(this.j = j)) {
            this.i(this.l, this.a.getString(2132020155));
        }
        this.i.a("menu_item_video_quality", j(this.o, j));
    }
    
    public final void o(final VideoQuality[] e, int ordinal, final boolean b) {
        if (this.e != e) {
            amfz amfz;
            if ((amfz = this.p.f().i) == null) {
                amfz = amfz.a;
            }
            amga amga;
            if ((amga = amfz.j) == null) {
                amga = amga.a;
            }
            int n;
            if (amga.c) {
                this.o = 3;
                n = 3;
            }
            else {
                anfc anfc;
                if ((anfc = this.p.f().j) == null) {
                    anfc = anfc.a;
                }
                if (anfc.w) {
                    this.o = 2;
                    n = 2;
                }
                else {
                    this.o = 1;
                    n = 1;
                }
            }
            this.i.a("menu_item_video_quality", j(n, this.j));
        }
        this.e = e;
        this.b.a(e, ordinal, this.m, b, this.o);
        final int o = this.o;
        final int m = this.m;
        int i;
        if (o != 1 && ordinal == 0) {
            if (e != null && m > 0 && m < e.length) {
                ordinal = m;
            }
            else {
                ordinal = 0;
            }
            i = 0;
        }
        else {
            i = ordinal;
        }
        Object c;
        if (e != null && ordinal >= 0 && ordinal < e.length) {
            c = aezp.j((Object)e[ordinal].b);
        }
        else {
            c = aeyo.a;
        }
        this.c = (aezp)c;
        if (o != 1 && i != 0) {
            this.m = i;
        }
        final ist h = this.h(false);
        final bu a = this.a;
        final int o2 = this.o;
        final aezp c2 = this.c;
        final String s = "";
        final String string = c2.e((Object)"").toString();
        final apoc d = this.d;
        String s2 = null;
        Label_0517: {
            Label_0372: {
                if ((ordinal = o2) == 2) {
                    if (b) {
                        ordinal = 2;
                        break Label_0372;
                    }
                    ordinal = 2;
                }
                s2 = string;
                if (ordinal != 3) {
                    break Label_0517;
                }
                s2 = string;
                if (d == apoc.d) {
                    break Label_0517;
                }
            }
            String string2;
            if (TextUtils.isEmpty((CharSequence)string)) {
                string2 = s;
            }
            else {
                string2 = ((Context)a).getString(2132019312, new Object[] { string });
            }
            if (ordinal == 2) {
                s2 = ((Context)a).getString(2132019309, new Object[] { string2 });
            }
            else {
                final apoc a2 = apoc.a;
                ordinal = d.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            s2 = string;
                        }
                        else {
                            s2 = ((Context)a).getString(2132019310, new Object[] { string2 });
                        }
                    }
                    else {
                        s2 = ((Context)a).getString(2132019311, new Object[] { string2 });
                    }
                }
                else {
                    s2 = ((Context)a).getString(2132019309, new Object[] { string2 });
                }
            }
        }
        this.i(h, s2.toString());
    }
    
    public final void oO() {
        this.k = null;
        this.l = null;
    }
    
    public final boolean oP() {
        return false;
    }
    
    public final String oQ() {
        return "menu_item_video_quality";
    }
    
    public final void rk(final abef abef) {
        this.b.b(abef);
        this.f.b(abef);
    }
}
