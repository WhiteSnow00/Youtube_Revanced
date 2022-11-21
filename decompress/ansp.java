// 
// Decompiled by Procyon v0.6.0
// 

public final class ansp implements ahdf
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
    public static final ahdf m;
    public static final ahdf n;
    static final ahdf o;
    static final ahdf p;
    static final ahdf q;
    static final ahdf r;
    static final ahdf s;
    static final ahdf t;
    public static final ahdf u;
    private final int v;
    
    static {
        u = (ahdf)new ansp(20);
        t = (ahdf)new ansp(19);
        s = (ahdf)new ansp(18);
        r = (ahdf)new ansp(17);
        q = (ahdf)new ansp(16);
        p = (ahdf)new ansp(15);
        o = (ahdf)new ansp(14);
        n = (ahdf)new ansp(13);
        m = (ahdf)new ansp(12);
        l = (ahdf)new ansp(11);
        k = (ahdf)new ansp(10);
        j = (ahdf)new ansp(9);
        i = (ahdf)new ansp(8);
        h = (ahdf)new ansp(7);
        g = (ahdf)new ansp(6);
        f = (ahdf)new ansp(5);
        e = (ahdf)new ansp(4);
        d = (ahdf)new ansp(3);
        c = (ahdf)new ansp(2);
        b = (ahdf)new ansp(1);
        a = (ahdf)new ansp(0);
    }
    
    private ansp(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aqvq.bU(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return aqvq.bV(n) != 0;
            }
            case 18: {
                return anuo.b(n) != null;
            }
            case 17: {
                return aqvq.bW(n) != 0;
            }
            case 16: {
                return aqvq.bX(n) != 0;
            }
            case 15: {
                return aqvq.bY(n) != 0;
            }
            case 14: {
                return aqvq.bZ(n) != 0;
            }
            case 13: {
                return aqvq.ca(n) != 0;
            }
            case 12: {
                return aqvq.cb(n) != 0;
            }
            case 11: {
                return antt.b(n) != null;
            }
            case 10: {
                return ants.b(n) != null;
            }
            case 9: {
                return aqvq.cc(n) != 0;
            }
            case 8: {
                return aqvq.cd(n) != 0;
            }
            case 7: {
                return aqvq.ce(n) != 0;
            }
            case 6: {
                return ante.b(n) != null;
            }
            case 5: {
                return aqvq.cf(n) != 0;
            }
            case 4: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 3: {
                return aqvq.cg(n) != 0;
            }
            case 2: {
                return aqvq.ch(n) != 0;
            }
            case 1: {
                return aqvq.cj(n) != 0;
            }
            case 0: {
                if (aqvq.ci(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
