// 
// Decompiled by Procyon v0.6.0
// 

public final class amsc implements agzo
{
    static final agzo a;
    static final agzo b;
    static final agzo c;
    static final agzo d;
    static final agzo e;
    static final agzo f;
    static final agzo g;
    static final agzo h;
    static final agzo i;
    static final agzo j;
    static final agzo k;
    public static final agzo l;
    public static final agzo m;
    static final agzo n;
    static final agzo o;
    static final agzo p;
    static final agzo q;
    static final agzo r;
    static final agzo s;
    static final agzo t;
    static final agzo u;
    private final /* synthetic */ int v;
    
    static {
        u = new amsc(20);
        t = new amsc(19);
        s = new amsc(18);
        r = new amsc(17);
        q = new amsc(16);
        p = new amsc(15);
        o = new amsc(14);
        n = new amsc(13);
        m = new amsc(12);
        l = new amsc(11);
        k = new amsc(10);
        j = new amsc(9);
        i = new amsc(8);
        h = new amsc(7);
        g = new amsc(6);
        f = new amsc(5);
        e = new amsc(4);
        d = new amsc(3);
        c = new amsc(2);
        b = new amsc(1);
        a = new amsc(0);
    }
    
    private amsc(final int v) {
        this.v = v;
    }
    
    @Override
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                return aqql.cK(n) != 0;
            }
            case 19: {
                return aqql.cL(n) != 0;
            }
            case 18: {
                return amtj.b(n) != null;
            }
            case 17: {
                return aqql.cM(n) != 0;
            }
            case 16: {
                return aqql.cN(n) != 0;
            }
            case 15: {
                return aqql.cO(n) != 0;
            }
            case 14: {
                return aqql.cP(n) != 0;
            }
            case 13: {
                return amsx.b(n) != null;
            }
            case 12: {
                return aqql.cQ(n) != 0;
            }
            case 11: {
                return aqql.cR(n) != 0;
            }
            case 10: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 9: {
                return amso.b(n) != null;
            }
            case 8: {
                switch (n) {
                    default: {
                        return false;
                    }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43: {
                        return true;
                    }
                }
                break;
            }
            case 7: {
                return aqql.cT(n) != 0;
            }
            case 6: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 5: {
                return amse.b(n) != null;
            }
            case 4: {
                return n == 0 || n == 1 || n == 2;
            }
            case 3: {
                return aqql.cU(n) != 0;
            }
            case 2: {
                return aqql.cV(n) != 0;
            }
            case 1: {
                return aqql.cW(n) != 0;
            }
            case 0: {
                switch (n) {
                    default: {
                        return false;
                    }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6: {
                        return true;
                    }
                }
                break;
            }
        }
    }
}
