// 
// Decompiled by Procyon v0.6.0
// 

public final class aprh implements ahdf
{
    static final ahdf a;
    static final ahdf b;
    static final ahdf c;
    static final ahdf d;
    static final ahdf e;
    static final ahdf f;
    static final ahdf g;
    public static final ahdf h;
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
        u = (ahdf)new aprh(20);
        t = (ahdf)new aprh(19);
        s = (ahdf)new aprh(18);
        r = (ahdf)new aprh(17);
        q = (ahdf)new aprh(16);
        p = (ahdf)new aprh(15);
        o = (ahdf)new aprh(14);
        n = (ahdf)new aprh(13);
        m = (ahdf)new aprh(12);
        l = (ahdf)new aprh(11);
        k = (ahdf)new aprh(10);
        j = (ahdf)new aprh(9);
        i = (ahdf)new aprh(8);
        h = (ahdf)new aprh(7);
        g = (ahdf)new aprh(6);
        f = (ahdf)new aprh(5);
        e = (ahdf)new aprh(4);
        d = (ahdf)new aprh(3);
        c = (ahdf)new aprh(2);
        b = (ahdf)new aprh(1);
        a = (ahdf)new aprh(0);
    }
    
    private aprh(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aqvq.U(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return aqvq.V(n) != 0;
            }
            case 18: {
                return aqvq.W(n) != 0;
            }
            case 17: {
                return aqvq.X(n) != 0;
            }
            case 16: {
                return aqvq.Y(n) != 0;
            }
            case 15: {
                return aqvq.Z(n) != 0;
            }
            case 14: {
                return aqvq.aa(n) != 0;
            }
            case 13: {
                return apse.b(n) != null;
            }
            case 12: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5;
            }
            case 11: {
                return aqvq.ab(n) != 0;
            }
            case 10: {
                return aqvq.ac(n) != 0;
            }
            case 9: {
                return aprk.b(n) != null;
            }
            case 8: {
                return aqvq.ad(n) != 0;
            }
            case 7: {
                return aqvq.ae(n) != 0;
            }
            case 6: {
                return aprj.b(n) != null;
            }
            case 5: {
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
            case 4: {
                return n == 0 || n == 1 || n == 2;
            }
            case 3: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5;
            }
            case 2: {
                return n == 0 || n == 1;
            }
            case 1: {
                return n == 0 || n == 1;
            }
            case 0: {
                if (apri.b(n) != null) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
