// 
// Decompiled by Procyon v0.6.0
// 

public final class anqj implements ahbn
{
    static final ahbn a;
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
    public static final ahbn m;
    public static final ahbn n;
    static final ahbn o;
    static final ahbn p;
    static final ahbn q;
    static final ahbn r;
    static final ahbn s;
    static final ahbn t;
    public static final ahbn u;
    private final int v;
    
    static {
        u = (ahbn)new anqj(20);
        t = (ahbn)new anqj(19);
        s = (ahbn)new anqj(18);
        r = (ahbn)new anqj(17);
        q = (ahbn)new anqj(16);
        p = (ahbn)new anqj(15);
        o = (ahbn)new anqj(14);
        n = (ahbn)new anqj(13);
        m = (ahbn)new anqj(12);
        l = (ahbn)new anqj(11);
        k = (ahbn)new anqj(10);
        j = (ahbn)new anqj(9);
        i = (ahbn)new anqj(8);
        h = (ahbn)new anqj(7);
        g = (ahbn)new anqj(6);
        f = (ahbn)new anqj(5);
        e = (ahbn)new anqj(4);
        d = (ahbn)new anqj(3);
        c = (ahbn)new anqj(2);
        b = (ahbn)new anqj(1);
        a = (ahbn)new anqj(0);
    }
    
    private anqj(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aqsx.cc(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return aqsx.cd(n) != 0;
            }
            case 18: {
                return ansi.b(n) != null;
            }
            case 17: {
                return aqsx.ce(n) != 0;
            }
            case 16: {
                return aqsx.cf(n) != 0;
            }
            case 15: {
                return aqsx.cg(n) != 0;
            }
            case 14: {
                return aqsx.ch(n) != 0;
            }
            case 13: {
                return aqsx.ci(n) != 0;
            }
            case 12: {
                return aqsx.cj(n) != 0;
            }
            case 11: {
                return anrn.b(n) != null;
            }
            case 10: {
                return anrm.b(n) != null;
            }
            case 9: {
                return aqsx.ck(n) != 0;
            }
            case 8: {
                return aqsx.cl(n) != 0;
            }
            case 7: {
                return aqsx.cm(n) != 0;
            }
            case 6: {
                return anqy.b(n) != null;
            }
            case 5: {
                return aqsx.cn(n) != 0;
            }
            case 4: {
                return n == 0 || n == 1 || n == 2;
            }
            case 3: {
                return aqsx.co(n) != 0;
            }
            case 2: {
                return aqsx.cp(n) != 0;
            }
            case 1: {
                return aqsx.cr(n) != 0;
            }
            case 0: {
                if (aqsx.cq(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
