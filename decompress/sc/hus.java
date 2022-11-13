import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hus implements asjs
{
    public static final hus a;
    public static final hus b;
    public static final hus c;
    public static final hus d;
    public static final hus e;
    public static final hus f;
    public static final hus g;
    public static final hus h;
    public static final hus i;
    public static final hus j;
    public static final hus k;
    public static final hus l;
    public static final hus m;
    public static final hus n;
    public static final hus o;
    public static final hus p;
    public static final hus q;
    public static final hus r;
    public static final hus s;
    public static final hus t;
    public static final hus u;
    private final int v;
    
    static {
        u = new hus(20);
        t = new hus(19);
        s = new hus(18);
        r = new hus(17);
        q = new hus(16);
        p = new hus(15);
        o = new hus(14);
        n = new hus(13);
        m = new hus(12);
        l = new hus(11);
        k = new hus(10);
        j = new hus(9);
        i = new hus(8);
        h = new hus(7);
        g = new hus(6);
        f = new hus(5);
        e = new hus(4);
        d = new hus(3);
        c = new hus(2);
        b = new hus(1);
        a = new hus(0);
    }
    
    private hus(final int v) {
        this.v = v;
    }
    
    public final boolean a(final Object o) {
        final int v = this.v;
        boolean b = true;
        switch (v) {
            default: {
                if (!((String)o).isEmpty()) {
                    return true;
                }
                break;
            }
            case 19: {
                final ihn ihn = (ihn)o;
                return ihn.b.c(ihn.a).h();
            }
            case 18: {
                return ((aezp)o).h();
            }
            case 17: {
                return ((vft)o).c != null;
            }
            case 16: {
                return ((vft)o).c != null;
            }
            case 15: {
                return ieu.a.contains((Object)((iem)o).d);
            }
            case 14: {
                final vft vft = (vft)o;
                return vft != null && vft.c != null;
            }
            case 13: {
                return ((aani)o).c().b(abkb.e);
            }
            case 12: {
                return (boolean)((aezq)o).a;
            }
            case 11: {
                return ((vqu)o).a != null;
            }
            case 10: {
                return ((aezp)o).h();
            }
            case 9: {
                return ((Optional)o).isPresent();
            }
            case 8: {
                return ((frj)o).a();
            }
            case 7: {
                final Boolean b2 = (Boolean)o;
                final int cu = hwl.cU;
                return b2;
            }
            case 6: {
                final Throwable t = (Throwable)o;
                final int cu2 = hwl.cU;
                return t instanceof dbj;
            }
            case 5: {
                return (boolean)o;
            }
            case 4: {
                return (boolean)o;
            }
            case 3: {
                return ((vft)o).c != null;
            }
            case 2: {
                return (boolean)o;
            }
            case 1: {
                return ((vft)o).c != null;
            }
            case 0: {
                final huq huq = (huq)o;
                final apij a = huq.a;
                final apij b3 = huq.b;
                if (a == null) {
                    if (b3 != null) {
                        if (b3.getNumVideosFailed() <= 0) {
                            break;
                        }
                    }
                    else {
                        b = false;
                    }
                }
                else if (b3 == null || b3.getNumVideosFailed() <= a.getNumVideosFailed()) {
                    break;
                }
                return b;
            }
        }
        return false;
    }
}
