// 
// Decompiled by Procyon v0.6.0
// 

public final class aove implements ahbn
{
    static final ahbn a;
    static final ahbn b;
    static final ahbn c;
    static final ahbn d;
    static final ahbn e;
    public static final ahbn f;
    static final ahbn g;
    static final ahbn h;
    static final ahbn i;
    static final ahbn j;
    static final ahbn k;
    static final ahbn l;
    static final ahbn m;
    static final ahbn n;
    public static final ahbn o;
    static final ahbn p;
    static final ahbn q;
    static final ahbn r;
    static final ahbn s;
    static final ahbn t;
    static final ahbn u;
    private final int v;
    
    static {
        u = (ahbn)new aove(20);
        t = (ahbn)new aove(19);
        s = (ahbn)new aove(18);
        r = (ahbn)new aove(17);
        q = (ahbn)new aove(16);
        p = (ahbn)new aove(15);
        o = (ahbn)new aove(14);
        n = (ahbn)new aove(13);
        m = (ahbn)new aove(12);
        l = (ahbn)new aove(11);
        k = (ahbn)new aove(10);
        j = (ahbn)new aove(9);
        i = (ahbn)new aove(8);
        h = (ahbn)new aove(7);
        g = (ahbn)new aove(6);
        f = (ahbn)new aove(5);
        e = (ahbn)new aove(4);
        d = (ahbn)new aove(3);
        c = (ahbn)new aove(2);
        b = (ahbn)new aove(1);
        a = (ahbn)new aove(0);
    }
    
    private aove(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aphp.b(n) != null) {
                    return true;
                }
                break;
            }
            case 19: {
                return apho.b(n) != null;
            }
            case 18: {
                return aphn.b(n) != null;
            }
            case 17: {
                return n == 0 || n == 1 || n == 2;
            }
            case 16: {
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
                    case 26: {
                        return true;
                    }
                }
                break;
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
                    case 6:
                    case 7: {
                        return true;
                    }
                }
                break;
            }
            case 14: {
                return aqsx.aC(n) != 0;
            }
            case 13: {
                return apgw.b(n) != null;
            }
            case 12: {
                return apci.b(n) != null;
            }
            case 11: {
                return aqsx.aD(n) != 0;
            }
            case 10: {
                return aowz.b(n) != null;
            }
            case 9: {
                return aqsx.aE(n) != 0;
            }
            case 8: {
                return aowy.b(n) != null;
            }
            case 7: {
                return aowa.b(n) != null;
            }
            case 6: {
                return aovz.b(n) != null;
            }
            case 5: {
                return aqsx.aF(n) != 0;
            }
            case 4: {
                return aovv.b(n) != null;
            }
            case 3: {
                return aqsx.aG(n) != 0;
            }
            case 2: {
                return aqsx.aH(n) != 0;
            }
            case 1: {
                return n == 0 || n == 1;
            }
            case 0: {
                if (aqsx.aI(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
