import j$.util.Optional;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ijp implements asjr
{
    public static final ijp a;
    public static final ijp b;
    public static final ijp c;
    public static final ijp d;
    public static final ijp e;
    public static final ijp f;
    public static final ijp g;
    public static final ijp h;
    public static final ijp i;
    public static final ijp j;
    public static final ijp k;
    public static final ijp l;
    public static final ijp m;
    public static final ijp n;
    public static final ijp o;
    public static final ijp p;
    public static final ijp q;
    public static final ijp r;
    public static final ijp s;
    public static final ijp t;
    public static final ijp u;
    private final int v;
    
    static {
        u = new ijp(20);
        t = new ijp(19);
        s = new ijp(18);
        r = new ijp(17);
        q = new ijp(16);
        p = new ijp(15);
        o = new ijp(14);
        n = new ijp(13);
        m = new ijp(12);
        l = new ijp(11);
        k = new ijp(10);
        j = new ijp(9);
        i = new ijp(8);
        h = new ijp(7);
        g = new ijp(6);
        f = new ijp(5);
        e = new ijp(4);
        d = new ijp(3);
        c = new ijp(2);
        b = new ijp(1);
        a = new ijp(0);
    }
    
    private ijp(final int v) {
        this.v = v;
    }
    
    public final Object a(final Object o) {
        final int v = this.v;
        String s = "";
        int n = 0;
        boolean b = false;
        switch (v) {
            default: {
                return ((aezp)o).c();
            }
            case 19: {
                return asht.U((Iterable)o);
            }
            case 18: {
                if (((flm)o).a == 0) {
                    b = true;
                }
                return b;
            }
            case 17: {
                return ((flm)o).b;
            }
            case 16: {
                final ajht ajht = (ajht)o;
                ashn ashn;
                if (((ahbc)ajht).ry((ahaq)ajiw.b)) {
                    ashn = ashn.B(((ahbc)ajht).rx((ahaq)ajiw.b));
                }
                else {
                    ashn = ashn.t();
                }
                return ashn;
            }
            case 15: {
                if (((aace)o).a() != aacd.d) {
                    n = 2;
                }
                return n;
            }
            case 14: {
                return afeq.o((Collection)o);
            }
            case 13: {
                return asht.U((Iterable)o);
            }
            case 12: {
                final ahaz ahaz = (ahaz)o;
                if (((anyv)ahaz.instance).d.size() == 1) {
                    alke alke;
                    if ((alke = ((anyy)((anyv)ahaz.instance).d.get(0)).j) == null) {
                        alke = alke.a;
                    }
                    if ("offline_homepage_error_view_id".equals(alke.i)) {
                        return asie.C(new Exception("No offline content available"));
                    }
                }
                return asie.I(ahaz);
            }
            case 11: {
                final ahbb ahbb = (ahbb)o;
                ashn ashn2;
                if (((alke)ahbb.instance).e.size() == 0) {
                    ashn2 = ashn.t();
                }
                else {
                    final ahaz builder = ((ahbh)anyy.a).createBuilder();
                    builder.copyOnWrite();
                    final anyy anyy = (anyy)builder.instance;
                    final alke j = (alke)((ahaz)ahbb).build();
                    j.getClass();
                    anyy.j = j;
                    anyy.b |= 0x10;
                    ashn2 = ashn.B(builder.build());
                }
                return ashn2;
            }
            case 10: {
                return asht.U((Iterable)o);
            }
            case 9: {
                return Optional.of((Object)o);
            }
            case 8: {
                final alyu alyu = (alyu)o;
                if (alyu.b == 3) {
                    s = (String)alyu.c;
                }
                return s;
            }
            case 7: {
                return ((alyt)o).getDownloads();
            }
            case 6: {
                final alyu alyu2 = (alyu)o;
                if (alyu2.b == 1) {
                    s = (String)alyu2.c;
                }
                return s;
            }
            case 5: {
                return ((alyt)o).getDownloads();
            }
            case 4: {
                aqra aqra;
                if ((aqra = aqra.b(((aqrd)o).c)) == null) {
                    aqra = aqra.a;
                }
                return aqra;
            }
            case 3: {
                return afeq.o((Collection)o);
            }
            case 2: {
                return asht.U((Iterable)o);
            }
            case 1: {
                return afeq.o((Collection)o);
            }
            case 0: {
                return ((apyx)o).g();
            }
        }
    }
}
