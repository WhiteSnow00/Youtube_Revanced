// 
// Decompiled by Procyon v0.6.0
// 

public final class alua implements ahbn
{
    static final ahbn a;
    static final ahbn b;
    static final ahbn c;
    static final ahbn d;
    static final ahbn e;
    static final ahbn f;
    public static final ahbn g;
    public static final ahbn h;
    static final ahbn i;
    public static final ahbn j;
    static final ahbn k;
    static final ahbn l;
    static final ahbn m;
    static final ahbn n;
    static final ahbn o;
    static final ahbn p;
    static final ahbn q;
    static final ahbn r;
    static final ahbn s;
    static final ahbn t;
    static final ahbn u;
    private final int v;
    
    static {
        u = (ahbn)new alua(20);
        t = (ahbn)new alua(19);
        s = (ahbn)new alua(18);
        r = (ahbn)new alua(17);
        q = (ahbn)new alua(16);
        p = (ahbn)new alua(15);
        o = (ahbn)new alua(14);
        n = (ahbn)new alua(13);
        m = (ahbn)new alua(12);
        l = (ahbn)new alua(11);
        k = (ahbn)new alua(10);
        j = (ahbn)new alua(9);
        i = (ahbn)new alua(8);
        h = (ahbn)new alua(7);
        g = (ahbn)new alua(6);
        f = (ahbn)new alua(5);
        e = (ahbn)new alua(4);
        d = (ahbn)new alua(3);
        c = (ahbn)new alua(2);
        b = (ahbn)new alua(1);
        a = (ahbn)new alua(0);
    }
    
    private alua(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aqsx.dD(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return aqsx.dE(n) != 0;
            }
            case 18: {
                return aqsx.dF(n) != 0;
            }
            case 17: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5 || n == 7;
            }
            case 16: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 15: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5;
            }
            case 14: {
                return alxn.b(n) != null;
            }
            case 13: {
                return aqsx.dG(n) != 0;
            }
            case 12: {
                return aqsx.dH(n) != 0;
            }
            case 11: {
                return alwf.b(n) != null;
            }
            case 10: {
                return alwb.b(n) != null;
            }
            case 9: {
                return aqsx.dI(n) != 0;
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
                    case 8: {
                        return true;
                    }
                }
                break;
            }
            case 7: {
                return aqsx.dJ(n) != 0;
            }
            case 6: {
                return aqsx.dK(n) != 0;
            }
            case 5: {
                return aluv.b(n) != null;
            }
            case 4: {
                return aqsx.dL(n) != 0;
            }
            case 3: {
                return aqsx.dM(n) != 0;
            }
            case 2: {
                return aluf.b(n) != null;
            }
            case 1: {
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
                    case 7: {
                        return true;
                    }
                }
                break;
            }
            case 0: {
                if (aqsx.dN(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
