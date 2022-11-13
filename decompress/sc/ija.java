import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ija implements asjs
{
    public static final ija a;
    public static final ija b;
    public static final ija c;
    public static final ija d;
    public static final ija e;
    public static final ija f;
    public static final ija g;
    public static final ija h;
    public static final ija i;
    public static final ija j;
    public static final ija k;
    public static final ija l;
    public static final ija m;
    public static final ija n;
    public static final ija o;
    public static final ija p;
    public static final ija q;
    public static final ija r;
    public static final ija s;
    public static final ija t;
    public static final ija u;
    private final int v;
    
    static {
        u = new ija(20);
        t = new ija(19);
        s = new ija(18);
        r = new ija(17);
        q = new ija(16);
        p = new ija(15);
        o = new ija(14);
        n = new ija(13);
        m = new ija(12);
        l = new ija(11);
        k = new ija(10);
        j = new ija(9);
        i = new ija(8);
        h = new ija(7);
        g = new ija(6);
        f = new ija(5);
        e = new ija(4);
        d = new ija(3);
        c = new ija(2);
        b = new ija(1);
        a = new ija(0);
    }
    
    private ija(final int v) {
        this.v = v;
    }
    
    public final boolean a(final Object o) {
        switch (this.v) {
            default: {
                return ((abkh)o).i != 3;
            }
            case 19: {
                return o.equals(iui.a);
            }
            case 18: {
                final abke c = ((aans)o).c();
                return c.equals((Object)abke.a) || c.equals((Object)abke.h) || c.equals((Object)abke.j);
            }
            case 17: {
                return jbh.k((jbg)o);
            }
            case 16: {
                return ((aezp)o).h();
            }
            case 15: {
                return ((aezp)o).h();
            }
            case 14: {
                return ((vfn)o) instanceof amar;
            }
            case 13: {
                return !(boolean)o;
            }
            case 12: {
                return ((vft)o).c != null;
            }
            case 11: {
                return ((aace)o).c();
            }
            case 10: {
                return ((vft)o).c != null;
            }
            case 9: {
                return !((String)o).isEmpty();
            }
            case 8: {
                return ((alyu)o).b == 3;
            }
            case 7: {
                return !((String)o).isEmpty();
            }
            case 6: {
                return ((alyu)o).b == 1;
            }
            case 5: {
                return o != null;
            }
            case 4: {
                return o != null;
            }
            case 3: {
                return !((String)o).isEmpty();
            }
            case 2: {
                final amar amar = (amar)o;
                return amar != null && (amar.b.c & 0x80) != 0x0;
            }
            case 1: {
                return !((String)o).isEmpty();
            }
            case 0: {
                return Objects.nonNull((Object)o);
            }
        }
    }
}
