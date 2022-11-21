// 
// Decompiled by Procyon v0.6.0
// 

public final class anus implements ahdf
{
    public static final ahdf a;
    public static final ahdf b;
    static final ahdf c;
    static final ahdf d;
    static final ahdf e;
    static final ahdf f;
    static final ahdf g;
    static final ahdf h;
    static final ahdf i;
    public static final ahdf j;
    public static final ahdf k;
    static final ahdf l;
    public static final ahdf m;
    static final ahdf n;
    static final ahdf o;
    static final ahdf p;
    public static final ahdf q;
    static final ahdf r;
    static final ahdf s;
    static final ahdf t;
    static final ahdf u;
    private final int v;
    
    static {
        u = (ahdf)new anus(20);
        t = (ahdf)new anus(19);
        s = (ahdf)new anus(18);
        r = (ahdf)new anus(17);
        q = (ahdf)new anus(16);
        p = (ahdf)new anus(15);
        o = (ahdf)new anus(14);
        n = (ahdf)new anus(13);
        m = (ahdf)new anus(12);
        l = (ahdf)new anus(11);
        k = (ahdf)new anus(10);
        j = (ahdf)new anus(9);
        i = (ahdf)new anus(8);
        h = (ahdf)new anus(7);
        g = (ahdf)new anus(6);
        f = (ahdf)new anus(5);
        e = (ahdf)new anus(4);
        d = (ahdf)new anus(3);
        c = (ahdf)new anus(2);
        b = (ahdf)new anus(1);
        a = (ahdf)new anus(0);
    }
    
    private anus(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (anyy.b(n) != null) {
                    return true;
                }
                break;
            }
            case 19: {
                return aqvq.bC(n) != 0;
            }
            case 18: {
                return aqvq.bD(n) != 0;
            }
            case 17: {
                return aqvq.bE(n) != 0;
            }
            case 16: {
                return aqvq.bF(n) != 0;
            }
            case 15: {
                return n == 0 || n == 1 || n == 2;
            }
            case 14: {
                return aqvq.bH(n) != 0;
            }
            case 13: {
                return aqvq.bI(n) != 0;
            }
            case 12: {
                return aqvq.bJ(n) != 0;
            }
            case 11: {
                return aqvq.bK(n) != 0;
            }
            case 10: {
                return aqvq.bL(n) != 0;
            }
            case 9: {
                return aqvq.bM(n) != 0;
            }
            case 8: {
                return aqvq.bN(n) != 0;
            }
            case 7: {
                return aqvq.bO(n) != 0;
            }
            case 6: {
                return aqvq.bP(n) != 0;
            }
            case 5: {
                return aqvq.bQ(n) != 0;
            }
            case 4: {
                return aqvq.bR(n) != 0;
            }
            case 3: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5;
            }
            case 2: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 1: {
                return aqvq.bT(n) != 0;
            }
            case 0: {
                if (aqvq.bS(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
