// 
// Decompiled by Procyon v0.6.0
// 

public final class akeh implements ahbn
{
    static final ahbn a;
    public static final ahbn b;
    static final ahbn c;
    static final ahbn d;
    static final ahbn e;
    public static final ahbn f;
    public static final ahbn g;
    static final ahbn h;
    public static final ahbn i;
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
        u = (ahbn)new akeh(20);
        t = (ahbn)new akeh(19);
        s = (ahbn)new akeh(18);
        r = (ahbn)new akeh(17);
        q = (ahbn)new akeh(16);
        p = (ahbn)new akeh(15);
        o = (ahbn)new akeh(14);
        n = (ahbn)new akeh(13);
        m = (ahbn)new akeh(12);
        l = (ahbn)new akeh(11);
        k = (ahbn)new akeh(10);
        j = (ahbn)new akeh(9);
        i = (ahbn)new akeh(8);
        h = (ahbn)new akeh(7);
        g = (ahbn)new akeh(6);
        f = (ahbn)new akeh(5);
        e = (ahbn)new akeh(4);
        d = (ahbn)new akeh(3);
        c = (ahbn)new akeh(2);
        b = (ahbn)new akeh(1);
        a = (ahbn)new akeh(0);
    }
    
    private akeh(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (adyf.bt(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return adyf.bu(n) != 0;
            }
            case 18: {
                return adyf.bv(n) != 0;
            }
            case 17: {
                return adyf.bw(n) != 0;
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
                    case 9: {
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
                    case 22: {
                        return true;
                    }
                }
                break;
            }
            case 14: {
                return adyf.bx(n) != 0;
            }
            case 13: {
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
                    case 10: {
                        return true;
                    }
                }
                break;
            }
            case 12: {
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
                    case 10: {
                        return true;
                    }
                }
                break;
            }
            case 11: {
                return akgf.b(n) != null;
            }
            case 10: {
                return akge.b(n) != null;
            }
            case 9: {
                return adyf.by(n) != 0;
            }
            case 8: {
                return adyf.bz(n) != 0;
            }
            case 7: {
                return akfu.b(n) != null;
            }
            case 6: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 5: {
                return adyf.bA(n) != 0;
            }
            case 4: {
                return adyf.bB(n) != 0;
            }
            case 3: {
                return akfr.b(n) != null;
            }
            case 2: {
                return akfg.b(n) != null;
            }
            case 1: {
                return adyf.bD(n) != 0;
            }
            case 0: {
                if (adyf.bC(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
