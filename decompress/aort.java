// 
// Decompiled by Procyon v0.6.0
// 

final class aort implements ahdf
{
    static final ahdf a;
    static final ahdf b;
    static final ahdf c;
    static final ahdf d;
    static final ahdf e;
    static final ahdf f;
    static final ahdf g;
    static final ahdf h;
    static final ahdf i;
    static final ahdf j;
    static final ahdf k;
    static final ahdf l;
    static final ahdf m;
    static final ahdf n;
    static final ahdf o;
    static final ahdf p;
    static final ahdf q;
    static final ahdf r;
    static final ahdf s;
    static final ahdf t;
    static final ahdf u;
    private final int v;
    
    static {
        u = (ahdf)new aort(20);
        t = (ahdf)new aort(19);
        s = (ahdf)new aort(18);
        r = (ahdf)new aort(17);
        q = (ahdf)new aort(16);
        p = (ahdf)new aort(15);
        o = (ahdf)new aort(14);
        n = (ahdf)new aort(13);
        m = (ahdf)new aort(12);
        l = (ahdf)new aort(11);
        k = (ahdf)new aort(10);
        j = (ahdf)new aort(9);
        i = (ahdf)new aort(8);
        h = (ahdf)new aort(7);
        g = (ahdf)new aort(6);
        f = (ahdf)new aort(5);
        e = (ahdf)new aort(4);
        d = (ahdf)new aort(3);
        c = (ahdf)new aort(2);
        b = (ahdf)new aort(1);
        a = (ahdf)new aort(0);
    }
    
    private aort(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aowl.b(n) != null) {
                    return true;
                }
                break;
            }
            case 19: {
                return aqvq.aC(n) != 0;
            }
            case 18: {
                return aovv.b(n) != null;
            }
            case 17: {
                return aqvq.aD(n) != 0;
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
                    case 6: {
                        return true;
                    }
                }
                break;
            }
            case 15: {
                return aqvq.aE(n) != 0;
            }
            case 14: {
                return n == 0 || n == 1 || n == 2;
            }
            case 13: {
                return aouq.b(n) != null;
            }
            case 12: {
                return aoug.b(n) != null;
            }
            case 11: {
                return aqvq.aF(n) != 0;
            }
            case 10: {
                return n == 0 || n == 1 || n == 2;
            }
            case 9: {
                return n == 0 || n == 1 || n == 2;
            }
            case 8: {
                return aosw.b(n) != null;
            }
            case 7: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 6: {
                return aqvq.aG(n) != 0;
            }
            case 5: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 4: {
                return aosh.b(n) != null;
            }
            case 3: {
                return aqvq.aH(n) != 0;
            }
            case 2: {
                return aqvq.aI(n) != 0;
            }
            case 1: {
                return aqvq.aK(n) != 0;
            }
            case 0: {
                if (aqvq.aJ(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
