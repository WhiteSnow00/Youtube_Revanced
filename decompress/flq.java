import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class flq implements asjr
{
    public static final flq a;
    public static final flq b;
    public static final flq c;
    public static final flq d;
    public static final flq e;
    public static final flq f;
    public static final flq g;
    public static final flq h;
    public static final flq i;
    public static final flq j;
    public static final flq k;
    public static final flq l;
    public static final flq m;
    public static final flq n;
    public static final flq o;
    public static final flq p;
    public static final flq q;
    public static final flq r;
    public static final flq s;
    private final int t;
    
    static {
        s = new flq(20);
        r = new flq(19);
        q = new flq(18);
        p = new flq(17);
        o = new flq(16);
        n = new flq(15);
        m = new flq(14);
        l = new flq(13);
        k = new flq(12);
        j = new flq(11);
        i = new flq(10);
        h = new flq(8);
        g = new flq(7);
        f = new flq(6);
        e = new flq(5);
        d = new flq(4);
        c = new flq(3);
        b = new flq(1);
        a = new flq(0);
    }
    
    public flq(final int t) {
        this.t = t;
    }
    
    public final Object a(final Object o) {
        switch (this.t) {
            default: {
                return afeq.o((Collection)o);
            }
            case 19: {
                return ((fly)o).a;
            }
            case 18: {
                return afft.p((Collection)o);
            }
            case 17: {
                return fly.a((vfn)o);
            }
            case 16: {
                return fly.a((vfn)o);
            }
            case 15: {
                return fly.a((vfn)o);
            }
            case 14: {
                return asht.U((Iterable)o);
            }
            case 13: {
                return ((flm)o).b;
            }
            case 12: {
                return ((aezp)o).c();
            }
            case 11: {
                return ((fls)o).a;
            }
            case 10: {
                return ((asie)o).k();
            }
            case 9: {
                final vfn c = ((vft)o).c;
                Object o2;
                if (c == null) {
                    o2 = afeq.q();
                }
                else {
                    o2 = ((alyt)c).getDownloads();
                }
                return o2;
            }
            case 8: {
                return ((aezq)o).a;
            }
            case 7: {
                return glb.X(vgl.i((String)o));
            }
            case 6: {
                return asht.U((Iterable)o);
            }
            case 5: {
                return ((apyx)o).g();
            }
            case 4: {
                return ((alzp)o).c();
            }
            case 3: {
                final String s = (String)o;
                return new fls(s, vgl.a(s), vgl.i(s));
            }
            case 2: {
                final alyu alyu = (alyu)o;
                final int b = alyu.b;
                String s2;
                if (b == 1) {
                    s2 = (String)alyu.c;
                }
                else if (b == 3) {
                    s2 = (String)alyu.c;
                }
                else if (b == 2) {
                    s2 = (String)alyu.c;
                }
                else if (b == 4) {
                    s2 = (String)alyu.c;
                }
                else {
                    s2 = "";
                }
                return s2;
            }
            case 1: {
                return afeq.o((Collection)o);
            }
            case 0: {
                return ((alyt)o).getDownloads();
            }
        }
    }
}
