import android.text.TextUtils;
import android.text.Spanned;
import com.google.android.apps.youtube.app.settings.datasaving.DataSavingEntityController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyl implements aezf
{
    public static final iyl a;
    public static final iyl b;
    public static final iyl c;
    public static final iyl d;
    public static final iyl e;
    public static final iyl f;
    public static final iyl g;
    public static final iyl h;
    public static final iyl i;
    public static final iyl j;
    public static final iyl k;
    public static final iyl l;
    public static final iyl m;
    public static final iyl n;
    public static final iyl o;
    public static final iyl p;
    public static final iyl q;
    public static final iyl r;
    public static final iyl s;
    public static final iyl t;
    private final int u;
    
    static {
        t = new iyl(20);
        s = new iyl(19);
        r = new iyl(18);
        q = new iyl(17);
        p = new iyl(16);
        o = new iyl(15);
        n = new iyl(14);
        m = new iyl(13);
        l = new iyl(11);
        k = new iyl(10);
        j = new iyl(9);
        i = new iyl(8);
        h = new iyl(7);
        g = new iyl(6);
        f = new iyl(5);
        e = new iyl(4);
        d = new iyl(3);
        c = new iyl(2);
        b = new iyl(1);
        a = new iyl(0);
    }
    
    public iyl(final int u) {
        this.u = u;
    }
    
    public final Object apply(final Object o) {
        final int u = this.u;
        boolean b = false;
        switch (u) {
            default: {
                final aqql aqql = (aqql)o;
                final apoc c = apoc.c;
                apoc apoc;
                if ((apoc = apoc.b(aqql.i)) == null) {
                    apoc = apoc.a;
                }
                return c.equals((Object)apoc);
            }
            case 19: {
                apoc apoc2;
                if ((apoc2 = apoc.b(((aqql)o).j)) == null) {
                    apoc2 = apoc.a;
                }
                return apoc2;
            }
            case 18: {
                apoc apoc3;
                if ((apoc3 = apoc.b(((aqql)o).i)) == null) {
                    apoc3 = apoc.a;
                }
                return apoc3;
            }
            case 17: {
                final ahaz builder = ((ahbh)o).toBuilder();
                builder.copyOnWrite();
                final fqx fqx = (fqx)builder.instance;
                fqx.b |= 0x4;
                fqx.e = 1;
                return builder.build();
            }
            case 16: {
                final ahaz builder2 = ((ahbh)o).toBuilder();
                builder2.copyOnWrite();
                final fqx fqx2 = (fqx)builder2.instance;
                fqx2.b &= 0xFFFFFFFB;
                fqx2.e = 0;
                return builder2.build();
            }
            case 15: {
                return ((jqf)o).f;
            }
            case 14: {
                final jqf jqf = (jqf)o;
                final int f = DataSavingEntityController.f;
                final ahaz builder3 = ((ahbh)jqf).toBuilder();
                builder3.copyOnWrite();
                final jqf jqf2 = (jqf)builder3.instance;
                jqf2.b &= 0xFFFFF7FF;
                jqf2.m = 0;
                return builder3.build();
            }
            case 13: {
                final ahaz builder4 = ((ahbh)o).toBuilder();
                builder4.copyOnWrite();
                final jqf jqf3 = (jqf)builder4.instance;
                jqf3.b |= 0x100000;
                jqf3.v = false;
                return builder4.build();
            }
            case 12: {
                return String.valueOf(bx.Z((jae)o));
            }
            case 11: {
                return ((fqx)o).c;
            }
            case 10: {
                return TextUtils.isEmpty((CharSequence)o) ^ true;
            }
            case 9: {
                return acak.b((ajut)o);
            }
            case 8: {
                ajut ajut;
                if ((ajut = ((amrl)o).c) == null) {
                    ajut = ajut.a;
                }
                return ajut;
            }
            case 7: {
                if (0x1 == (((amsn)o).b & 0x1)) {
                    b = true;
                }
                return b;
            }
            case 6: {
                jsb jsb;
                if ((jsb = ((jsa)o).c) == null) {
                    jsb = jsb.a;
                }
                return jsb.c;
            }
            case 5: {
                final ahaz builder5 = ((ahbh)o).toBuilder();
                builder5.copyOnWrite();
                final fqx fqx3 = (fqx)builder5.instance;
                fqx3.b |= 0x2;
                fqx3.d = true;
                return builder5.build();
            }
            case 4: {
                final fqx fqx4 = (fqx)o;
                final ahaz builder6 = ((ahbh)fqx4).toBuilder();
                final int j = ((fqx)((ahbh)fqx4).toBuilder().instance).j;
                builder6.copyOnWrite();
                final fqx fqx5 = (fqx)builder6.instance;
                fqx5.b |= 0x40;
                fqx5.j = j + 1;
                return builder6.build();
            }
            case 3: {
                final fqx fqx6 = (fqx)o;
                final int i = ((fqx)((ahbh)fqx6).toBuilder().instance).j;
                final ahaz builder7 = ((ahbh)fqx6).toBuilder();
                builder7.copyOnWrite();
                final fqx fqx7 = (fqx)builder7.instance;
                fqx7.b |= 0x40;
                fqx7.j = i + 1;
                return builder7.build();
            }
            case 2: {
                return ((abxa)o).R();
            }
            case 1: {
                return ((abqh)o).v();
            }
            case 0: {
                return ((abxa)o).S();
            }
        }
    }
}
