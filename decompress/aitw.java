// 
// Decompiled by Procyon v0.6.0
// 

public final class aitw implements ahdf
{
    static final ahdf a;
    static final ahdf b;
    static final ahdf c;
    static final ahdf d;
    static final ahdf e;
    public static final ahdf f;
    static final ahdf g;
    static final ahdf h;
    public static final ahdf i;
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
        u = (ahdf)new aitw(20);
        t = (ahdf)new aitw(19);
        s = (ahdf)new aitw(18);
        r = (ahdf)new aitw(17);
        q = (ahdf)new aitw(16);
        p = (ahdf)new aitw(15);
        o = (ahdf)new aitw(14);
        n = (ahdf)new aitw(13);
        m = (ahdf)new aitw(12);
        l = (ahdf)new aitw(11);
        k = (ahdf)new aitw(10);
        j = (ahdf)new aitw(9);
        i = (ahdf)new aitw(8);
        h = (ahdf)new aitw(7);
        g = (ahdf)new aitw(6);
        f = (ahdf)new aitw(5);
        e = (ahdf)new aitw(4);
        d = (ahdf)new aitw(3);
        c = (ahdf)new aitw(2);
        b = (ahdf)new aitw(1);
        a = (ahdf)new aitw(0);
    }
    
    private aitw(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aexq.av(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return ajfn.b(n) != null;
            }
            case 18: {
                return ajfm.b(n) != null;
            }
            case 17: {
                return ajfc.b(n) != null;
            }
            case 16: {
                return aexq.aw(n) != 0;
            }
            case 15: {
                return aexq.ax(n) != 0;
            }
            case 14: {
                return ajdx.b(n) != null;
            }
            case 13: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 12: {
                return aexq.ay(n) != 0;
            }
            case 11: {
                return aexq.az(n) != 0;
            }
            case 10: {
                return aexq.aA(n) != 0;
            }
            case 9: {
                return aexq.aB(n) != 0;
            }
            case 8: {
                return aewr.O(n) != 0;
            }
            case 7: {
                return aewr.P(n) != 0;
            }
            case 6: {
                return aewr.Q(n) != 0;
            }
            case 5: {
                return aewr.R(n) != 0;
            }
            case 4: {
                return aewr.S(n) != 0;
            }
            case 3: {
                return aewr.T(n) != 0;
            }
            case 2: {
                return aewr.U(n) != 0;
            }
            case 1: {
                return aewr.W(n) != 0;
            }
            case 0: {
                if (aewr.V(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
