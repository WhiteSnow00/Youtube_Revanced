// 
// Decompiled by Procyon v0.6.0
// 

public final class aoha implements ahdf
{
    public static final ahdf a;
    static final ahdf b;
    static final ahdf c;
    public static final ahdf d;
    public static final ahdf e;
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
        u = (ahdf)new aoha(20);
        t = (ahdf)new aoha(19);
        s = (ahdf)new aoha(18);
        r = (ahdf)new aoha(17);
        q = (ahdf)new aoha(16);
        p = (ahdf)new aoha(15);
        o = (ahdf)new aoha(14);
        n = (ahdf)new aoha(13);
        m = (ahdf)new aoha(12);
        l = (ahdf)new aoha(11);
        k = (ahdf)new aoha(10);
        j = (ahdf)new aoha(9);
        i = (ahdf)new aoha(8);
        h = (ahdf)new aoha(7);
        g = (ahdf)new aoha(6);
        f = (ahdf)new aoha(5);
        e = (ahdf)new aoha(4);
        d = (ahdf)new aoha(3);
        c = (ahdf)new aoha(2);
        b = (ahdf)new aoha(1);
        a = (ahdf)new aoha(0);
    }
    
    private aoha(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aqvq.ba(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return aomy.b(n) != null;
            }
            case 18: {
                return aqvq.bb(n) != 0;
            }
            case 17: {
                return n == 0 || n == 1 || n == 2;
            }
            case 16: {
                return aqvq.bc(n) != 0;
            }
            case 15: {
                return aqvq.bd(n) != 0;
            }
            case 14: {
                return aqvq.be(n) != 0;
            }
            case 13: {
                return aqvq.bf(n) != 0;
            }
            case 12: {
                return aqvq.bg(n) != 0;
            }
            case 11: {
                return aqvq.bh(n) != 0;
            }
            case 10: {
                return aqvq.bi(n) != 0;
            }
            case 9: {
                return aohr.b(n) != null;
            }
            case 8: {
                return aohq.b(n) != null;
            }
            case 7: {
                return n == 0 || n == 1 || n == 2;
            }
            case 6: {
                return n == 0 || n == 1;
            }
            case 5: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 4: {
                return aqvq.bj(n) != 0;
            }
            case 3: {
                return aqvq.bk(n) != 0;
            }
            case 2: {
                return aohb.b(n) != null;
            }
            case 1: {
                return aqvq.bm(n) != 0;
            }
            case 0: {
                if (aqvq.bl(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
