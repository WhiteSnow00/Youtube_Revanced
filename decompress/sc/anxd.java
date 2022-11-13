// 
// Decompiled by Procyon v0.6.0
// 

public final class anxd implements ahbn
{
    static final ahbn a;
    static final ahbn b;
    static final ahbn c;
    static final ahbn d;
    static final ahbn e;
    static final ahbn f;
    static final ahbn g;
    static final ahbn h;
    public static final ahbn i;
    public static final ahbn j;
    static final ahbn k;
    static final ahbn l;
    static final ahbn m;
    static final ahbn n;
    static final ahbn o;
    static final ahbn p;
    public static final ahbn q;
    public static final ahbn r;
    static final ahbn s;
    static final ahbn t;
    public static final ahbn u;
    private final int v;
    
    static {
        u = (ahbn)new anxd(20);
        t = (ahbn)new anxd(19);
        s = (ahbn)new anxd(18);
        r = (ahbn)new anxd(17);
        q = (ahbn)new anxd(16);
        p = (ahbn)new anxd(15);
        o = (ahbn)new anxd(14);
        n = (ahbn)new anxd(13);
        m = (ahbn)new anxd(12);
        l = (ahbn)new anxd(11);
        k = (ahbn)new anxd(10);
        j = (ahbn)new anxd(9);
        i = (ahbn)new anxd(8);
        h = (ahbn)new anxd(7);
        g = (ahbn)new anxd(6);
        f = (ahbn)new anxd(5);
        e = (ahbn)new anxd(4);
        d = (ahbn)new anxd(3);
        c = (ahbn)new anxd(2);
        b = (ahbn)new anxd(1);
        a = (ahbn)new anxd(0);
    }
    
    private anxd(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aqsx.bv(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return aqsx.bw(n) != 0;
            }
            case 18: {
                return aqsx.bx(n) != 0;
            }
            case 17: {
                return aqsx.by(n) != 0;
            }
            case 16: {
                return n == 0 || n == 1 || n == 2;
            }
            case 15: {
                return aqsx.bz(n) != 0;
            }
            case 14: {
                return aobh.b(n) != null;
            }
            case 13: {
                return aqsx.bA(n) != 0;
            }
            case 12: {
                return aqsx.bB(n) != 0;
            }
            case 11: {
                return aqsx.bC(n) != 0;
            }
            case 10: {
                return aoay.b(n) != null;
            }
            case 9: {
                return aqsx.bD(n) != 0;
            }
            case 8: {
                return aqsx.bE(n) != 0;
            }
            case 7: {
                return anza.b(n) != null;
            }
            case 6: {
                return aqsx.bF(n) != 0;
            }
            case 5: {
                return aqsx.bG(n) != 0;
            }
            case 4: {
                return aqsx.bH(n) != 0;
            }
            case 3: {
                return anyq.b(n) != null;
            }
            case 2: {
                return aqsx.bI(n) != 0;
            }
            case 1: {
                return anwt.b(n) != null;
            }
            case 0: {
                if (aqsx.bJ(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
