// 
// Decompiled by Procyon v0.6.0
// 

public final class ajym implements ahbn
{
    static final ahbn a;
    public static final ahbn b;
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
    static final ahbn p;
    static final ahbn q;
    static final ahbn r;
    static final ahbn s;
    static final ahbn t;
    static final ahbn u;
    private final int v;
    
    static {
        u = (ahbn)new ajym(20);
        t = (ahbn)new ajym(19);
        s = (ahbn)new ajym(18);
        r = (ahbn)new ajym(17);
        q = (ahbn)new ajym(16);
        p = (ahbn)new ajym(15);
        o = (ahbn)new ajym(14);
        n = (ahbn)new ajym(13);
        m = (ahbn)new ajym(12);
        l = (ahbn)new ajym(11);
        k = (ahbn)new ajym(10);
        j = (ahbn)new ajym(9);
        i = (ahbn)new ajym(8);
        h = (ahbn)new ajym(7);
        g = (ahbn)new ajym(6);
        f = (ahbn)new ajym(5);
        e = (ahbn)new ajym(4);
        d = (ahbn)new ajym(3);
        c = (ahbn)new ajym(2);
        b = (ahbn)new ajym(1);
        a = (ahbn)new ajym(0);
    }
    
    private ajym(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (akdh.b(n) != null) {
                    return true;
                }
                break;
            }
            case 19: {
                return adyf.bE(n) != 0;
            }
            case 18: {
                return n == 0 || n == 1 || n == 2;
            }
            case 17: {
                return adyf.bF(n) != 0;
            }
            case 16: {
                return adyf.bG(n) != 0;
            }
            case 15: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
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
                    case 9: {
                        return true;
                    }
                }
                break;
            }
            case 13: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5;
            }
            case 12: {
                return adyf.bH(n) != 0;
            }
            case 11: {
                return adyf.bI(n) != 0;
            }
            case 10: {
                return adyf.bJ(n) != 0;
            }
            case 9: {
                return adyf.bK(n) != 0;
            }
            case 8: {
                return n == 0 || n == 1;
            }
            case 7: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5;
            }
            case 6: {
                return n == 0 || n == 1 || n == 3 || n == 4 || n == 5 || n == 6 || n == 7;
            }
            case 5: {
                return akan.b(n) != null;
            }
            case 4: {
                return n == 0 || n == 1 || n == 5 || n == 6 || n == 7;
            }
            case 3: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 2: {
                return adyf.bM(n) != 0;
            }
            case 1: {
                return adyf.bN(n) != 0;
            }
            case 0: {
                if (ajyn.b(n) != null) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
