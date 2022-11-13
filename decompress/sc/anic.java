// 
// Decompiled by Procyon v0.6.0
// 

public final class anic implements ahbn
{
    public static final ahbn a;
    static final ahbn b;
    static final ahbn c;
    static final ahbn d;
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
    static final ahbn t;
    static final ahbn u;
    private final int v;
    
    static {
        u = (ahbn)new anic(20);
        t = (ahbn)new anic(19);
        s = (ahbn)new anic(18);
        r = (ahbn)new anic(17);
        q = (ahbn)new anic(16);
        p = (ahbn)new anic(15);
        o = (ahbn)new anic(14);
        n = (ahbn)new anic(13);
        m = (ahbn)new anic(12);
        l = (ahbn)new anic(11);
        k = (ahbn)new anic(10);
        j = (ahbn)new anic(9);
        i = (ahbn)new anic(8);
        h = (ahbn)new anic(7);
        g = (ahbn)new anic(6);
        f = (ahbn)new anic(5);
        e = (ahbn)new anic(4);
        d = (ahbn)new anic(3);
        c = (ahbn)new anic(2);
        b = (ahbn)new anic(1);
        a = (ahbn)new anic(0);
    }
    
    private anic(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (anpg.b(n) != null) {
                    return true;
                }
                break;
            }
            case 19: {
                return anpf.b(n) != null;
            }
            case 18: {
                return anpe.b(n) != null;
            }
            case 17: {
                return anpd.b(n) != null;
            }
            case 16: {
                return anpc.b(n) != null;
            }
            case 15: {
                return aqsx.cs(n) != 0;
            }
            case 14: {
                return aqsx.ct(n) != 0;
            }
            case 13: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 12: {
                return aqsx.cu(n) != 0;
            }
            case 11: {
                return aqsx.cv(n) != 0;
            }
            case 10: {
                return anmz.b(n) != null;
            }
            case 9: {
                return aqsx.cw(n) != 0;
            }
            case 8: {
                return aqsx.cx(n) != 0;
            }
            case 7: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 6;
            }
            case 6: {
                return aqsx.cy(n) != 0;
            }
            case 5: {
                return aqsx.cz(n) != 0;
            }
            case 4: {
                return aqsx.cA(n) != 0;
            }
            case 3: {
                return anmc.b(n) != null;
            }
            case 2: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 1: {
                return anib.b(n) != null;
            }
            case 0: {
                if (aqsx.cB(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
