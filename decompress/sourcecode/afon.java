// 
// Decompiled by Procyon v0.6.0
// 

public final class afon implements agzo
{
    static final agzo INSTANCE;
    public static final agzo a;
    public static final agzo b;
    public static final agzo c;
    public static final agzo d;
    public static final agzo e;
    public static final agzo f;
    public static final agzo g;
    public static final agzo h;
    public static final agzo i;
    public static final agzo j;
    public static final agzo k;
    public static final agzo l;
    public static final agzo m;
    public static final agzo n;
    public static final agzo o;
    public static final agzo p;
    public static final agzo q;
    public static final agzo r;
    public static final agzo s;
    public static final agzo t;
    private final /* synthetic */ int u;
    
    static {
        t = (agzo)new afon(20);
        s = (agzo)new afon(19);
        r = (agzo)new afon(18);
        q = (agzo)new afon(17);
        p = (agzo)new afon(16);
        o = (agzo)new afon(15);
        n = (agzo)new afon(14);
        m = (agzo)new afon(13);
        l = (agzo)new afon(12);
        k = (agzo)new afon(11);
        j = (agzo)new afon(10);
        i = (agzo)new afon(9);
        h = (agzo)new afon(8);
        g = (agzo)new afon(7);
        f = (agzo)new afon(6);
        e = (agzo)new afon(5);
        d = (agzo)new afon(4);
        c = (agzo)new afon(3);
        b = (agzo)new afon(2);
        a = (agzo)new afon(1);
        INSTANCE = (agzo)new afon(0);
    }
    
    private afon(final int u) {
        this.u = u;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.u) {
            default: {
                if (agot.s(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return n == 0 || n == 1 || n == 2;
            }
            case 18: {
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
            case 17: {
                return n == 0 || n == 1 || n == 2;
            }
            case 16: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5;
            }
            case 15: {
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
            case 14: {
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
                    case 11: {
                        return true;
                    }
                }
                break;
            }
            case 13: {
                return agsq.a(n) != null;
            }
            case 12: {
                return n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 11: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5;
            }
            case 10: {
                return agot.c(n) != 0;
            }
            case 9: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5;
            }
            case 8: {
                return agpe.a(n) != null;
            }
            case 7: {
                return agot.a(n) != 0;
            }
            case 6: {
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
            case 5: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 4: {
                return n == 0 || n == 1 || n == 2;
            }
            case 3: {
                return agfk.a(n) != null;
            }
            case 2: {
                return agfc.a(n) != null;
            }
            case 1: {
                return aety.o(n) != 0;
            }
            case 0: {
                if (afoo.a(n) != null) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
