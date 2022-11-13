// 
// Decompiled by Procyon v0.6.0
// 

public final class ajty implements ahbn
{
    public static final ahbn a;
    static final ahbn b;
    static final ahbn c;
    static final ahbn d;
    static final ahbn e;
    static final ahbn f;
    static final ahbn g;
    static final ahbn h;
    static final ahbn i;
    static final ahbn j;
    static final ahbn k;
    static final ahbn l;
    static final ahbn m;
    static final ahbn n;
    static final ahbn o;
    public static final ahbn p;
    static final ahbn q;
    static final ahbn r;
    static final ahbn s;
    static final ahbn t;
    static final ahbn u;
    private final int v;
    
    static {
        u = (ahbn)new ajty(20);
        t = (ahbn)new ajty(19);
        s = (ahbn)new ajty(18);
        r = (ahbn)new ajty(17);
        q = (ahbn)new ajty(16);
        p = (ahbn)new ajty(15);
        o = (ahbn)new ajty(14);
        n = (ahbn)new ajty(13);
        m = (ahbn)new ajty(12);
        l = (ahbn)new ajty(11);
        k = (ahbn)new ajty(10);
        j = (ahbn)new ajty(9);
        i = (ahbn)new ajty(8);
        h = (ahbn)new ajty(7);
        g = (ahbn)new ajty(6);
        f = (ahbn)new ajty(5);
        e = (ahbn)new ajty(4);
        d = (ahbn)new ajty(3);
        c = (ahbn)new ajty(2);
        b = (ahbn)new ajty(1);
        a = (ahbn)new ajty(0);
    }
    
    private ajty(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                return n == 0 || n == 1 || n == 2;
            }
            case 19: {
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
            case 18: {
                if (n != 0 && n != 1 && n != 4) {
                    switch (n) {
                        default: {
                            return false;
                        }
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12: {
                            break;
                        }
                    }
                }
                return true;
            }
            case 17: {
                return adyf.bO(n) != 0;
            }
            case 16: {
                return adyf.bP(n) != 0;
            }
            case 15: {
                return adyf.bQ(n) != 0;
            }
            case 14: {
                return adyf.bR(n) != 0;
            }
            case 13: {
                return adyf.bS(n) != 0;
            }
            case 12: {
                return adyf.bT(n) != 0;
            }
            case 11: {
                return adyf.bU(n) != 0;
            }
            case 10: {
                return adyf.bV(n) != 0;
            }
            case 9: {
                return adyf.bW(n) != 0;
            }
            case 8: {
                return adyf.bX(n) != 0;
            }
            case 7: {
                return adyf.bY(n) != 0;
            }
            case 6: {
                return adyf.bZ(n) != 0;
            }
            case 5: {
                return adyf.ca(n) != 0;
            }
            case 4: {
                return adyf.cb(n) != 0;
            }
            case 3: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 2: {
                return ajtz.b(n) != null;
            }
            case 1: {
                return ajtv.b(n) != null;
            }
            case 0: {
                return adyf.cc(n) != 0;
            }
        }
    }
}
