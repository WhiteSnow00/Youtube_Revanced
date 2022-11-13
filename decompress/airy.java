// 
// Decompiled by Procyon v0.6.0
// 

public final class airy implements ahbn
{
    static final ahbn a;
    static final ahbn b;
    static final ahbn c;
    static final ahbn d;
    static final ahbn e;
    public static final ahbn f;
    static final ahbn g;
    static final ahbn h;
    public static final ahbn i;
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
        u = (ahbn)new airy(20);
        t = (ahbn)new airy(19);
        s = (ahbn)new airy(18);
        r = (ahbn)new airy(17);
        q = (ahbn)new airy(16);
        p = (ahbn)new airy(15);
        o = (ahbn)new airy(14);
        n = (ahbn)new airy(13);
        m = (ahbn)new airy(12);
        l = (ahbn)new airy(11);
        k = (ahbn)new airy(10);
        j = (ahbn)new airy(9);
        i = (ahbn)new airy(8);
        h = (ahbn)new airy(7);
        g = (ahbn)new airy(6);
        f = (ahbn)new airy(5);
        e = (ahbn)new airy(4);
        d = (ahbn)new airy(3);
        c = (ahbn)new airy(2);
        b = (ahbn)new airy(1);
        a = (ahbn)new airy(0);
    }
    
    private airy(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aevy.aI(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return ajdp.b(n) != null;
            }
            case 18: {
                return ajdo.b(n) != null;
            }
            case 17: {
                return ajde.b(n) != null;
            }
            case 16: {
                return aevy.aJ(n) != 0;
            }
            case 15: {
                return aevy.aK(n) != 0;
            }
            case 14: {
                return ajbz.b(n) != null;
            }
            case 13: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 12: {
                return aevy.aL(n) != 0;
            }
            case 11: {
                return aeuz.aa(n) != 0;
            }
            case 10: {
                return aeuz.ab(n) != 0;
            }
            case 9: {
                return aeuz.ac(n) != 0;
            }
            case 8: {
                return aeuz.ae(n) != 0;
            }
            case 7: {
                return aeuz.af(n) != 0;
            }
            case 6: {
                return aeuz.ag(n) != 0;
            }
            case 5: {
                return aeuz.ah(n) != 0;
            }
            case 4: {
                return aeuz.ai(n) != 0;
            }
            case 3: {
                return aeuz.aj(n) != 0;
            }
            case 2: {
                return aeuz.ak(n) != 0;
            }
            case 1: {
                return aeuz.am(n) != 0;
            }
            case 0: {
                if (aeuz.al(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
