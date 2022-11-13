// 
// Decompiled by Procyon v0.6.0
// 

public final class aola implements ahbn
{
    static final ahbn a;
    static final ahbn b;
    static final ahbn c;
    static final ahbn d;
    public static final ahbn e;
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
        u = (ahbn)new aola(20);
        t = (ahbn)new aola(19);
        s = (ahbn)new aola(18);
        r = (ahbn)new aola(17);
        q = (ahbn)new aola(16);
        p = (ahbn)new aola(15);
        o = (ahbn)new aola(14);
        n = (ahbn)new aola(13);
        m = (ahbn)new aola(12);
        l = (ahbn)new aola(11);
        k = (ahbn)new aola(10);
        j = (ahbn)new aola(9);
        i = (ahbn)new aola(8);
        h = (ahbn)new aola(7);
        g = (ahbn)new aola(6);
        f = (ahbn)new aola(5);
        e = (ahbn)new aola(4);
        d = (ahbn)new aola(3);
        c = (ahbn)new aola(2);
        b = (ahbn)new aola(1);
        a = (ahbn)new aola(0);
    }
    
    private aola(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aqsx.aS(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return aoov.b(n) != null;
            }
            case 18: {
                return aoou.b(n) != null;
            }
            case 17: {
                return aqsx.aT(n) != 0;
            }
            case 16: {
                return aqsx.aU(n) != 0;
            }
            case 15: {
                return aqsx.aV(n) != 0;
            }
            case 14: {
                return aqsx.aW(n) != 0;
            }
            case 13: {
                return aool.b(n) != null;
            }
            case 12: {
                return aqsx.aX(n) != 0;
            }
            case 11: {
                return aqsx.aY(n) != 0;
            }
            case 10: {
                return aonr.b(n) != null;
            }
            case 9: {
                return aomv.b(n) != null;
            }
            case 8: {
                return aqsx.aZ(n) != 0;
            }
            case 7: {
                return aqsx.ba(n) != 0;
            }
            case 6: {
                return aqsx.bb(n) != 0;
            }
            case 5: {
                return aqsx.bc(n) != 0;
            }
            case 4: {
                return aqsx.bd(n) != 0;
            }
            case 3: {
                return aqsx.be(n) != 0;
            }
            case 2: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 1: {
                return aqsx.bg(n) != 0;
            }
            case 0: {
                if (aqsx.bf(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
