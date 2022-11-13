// 
// Decompiled by Procyon v0.6.0
// 

public final class akjo implements ahbn
{
    static final ahbn a;
    static final ahbn b;
    static final ahbn c;
    public static final ahbn d;
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
    public static final ahbn t;
    static final ahbn u;
    private final int v;
    
    static {
        u = (ahbn)new akjo(20);
        t = (ahbn)new akjo(19);
        s = (ahbn)new akjo(18);
        r = (ahbn)new akjo(17);
        q = (ahbn)new akjo(16);
        p = (ahbn)new akjo(15);
        o = (ahbn)new akjo(14);
        n = (ahbn)new akjo(13);
        m = (ahbn)new akjo(12);
        l = (ahbn)new akjo(11);
        k = (ahbn)new akjo(10);
        j = (ahbn)new akjo(9);
        i = (ahbn)new akjo(8);
        h = (ahbn)new akjo(7);
        g = (ahbn)new akjo(6);
        f = (ahbn)new akjo(5);
        e = (ahbn)new akjo(4);
        d = (ahbn)new akjo(3);
        c = (ahbn)new akjo(2);
        b = (ahbn)new akjo(1);
        a = (ahbn)new akjo(0);
    }
    
    private akjo(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (adyf.bh(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return adyf.bi(n) != 0;
            }
            case 18: {
                return adyf.bj(n) != 0;
            }
            case 17: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 16: {
                return adyf.bk(n) != 0;
            }
            case 15: {
                return adyf.bl(n) != 0;
            }
            case 14: {
                return adyf.bm(n) != 0;
            }
            case 13: {
                return adyf.bn(n) != 0;
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
                    case 6: {
                        return true;
                    }
                }
                break;
            }
            case 11: {
                return n == 0 || n == 1;
            }
            case 10: {
                return n == 0 || n == 1 || n == 2;
            }
            case 9: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 8: {
                return adyf.bo(n) != 0;
            }
            case 7: {
                return aklc.b(n) != null;
            }
            case 6: {
                return aklb.b(n) != null;
            }
            case 5: {
                return akla.b(n) != null;
            }
            case 4: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 3: {
                return adyf.bp(n) != 0;
            }
            case 2: {
                return adyf.bq(n) != 0;
            }
            case 1: {
                return adyf.bs(n) != 0;
            }
            case 0: {
                if (adyf.br(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
