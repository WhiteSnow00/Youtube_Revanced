// 
// Decompiled by Procyon v0.6.0
// 

final class ameu implements ahbn
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
        u = (ahbn)new ameu(20);
        t = (ahbn)new ameu(19);
        s = (ahbn)new ameu(18);
        r = (ahbn)new ameu(17);
        q = (ahbn)new ameu(16);
        p = (ahbn)new ameu(15);
        o = (ahbn)new ameu(14);
        n = (ahbn)new ameu(13);
        m = (ahbn)new ameu(12);
        l = (ahbn)new ameu(11);
        k = (ahbn)new ameu(10);
        j = (ahbn)new ameu(9);
        i = (ahbn)new ameu(8);
        h = (ahbn)new ameu(7);
        g = (ahbn)new ameu(6);
        f = (ahbn)new ameu(5);
        e = (ahbn)new ameu(4);
        d = (ahbn)new ameu(3);
        c = (ahbn)new ameu(2);
        b = (ahbn)new ameu(1);
        a = (ahbn)new ameu(0);
    }
    
    private ameu(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                return aqsx.di(n) != 0;
            }
            case 19: {
                return aqsx.dj(n) != 0;
            }
            case 18: {
                return aqsx.dk(n) != 0;
            }
            case 17: {
                return aqsx.dl(n) != 0;
            }
            case 16: {
                return amjk.b(n) != null;
            }
            case 15: {
                return aqsx.dm(n) != 0;
            }
            case 14: {
                return aqsx.dn(n) != 0;
            }
            case 13: {
                return aqsx.do(n) != 0;
            }
            case 12: {
                return aqsx.dp(n) != 0;
            }
            case 11: {
                return aqsx.dq(n) != 0;
            }
            case 10: {
                return amfu.b(n) != null;
            }
            case 9: {
                return aqsx.dr(n) != 0;
            }
            case 8: {
                return aqsx.ds(n) != 0;
            }
            case 7: {
                return aqsx.dt(n) != 0;
            }
            case 6: {
                return aqsx.du(n) != 0;
            }
            case 5: {
                return aqsx.dv(n) != 0;
            }
            case 4: {
                return aqsx.dw(n) != 0;
            }
            case 3: {
                return n == 0 || n == 1 || n == 2;
            }
            case 2: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 1: {
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
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12: {
                        return true;
                    }
                }
                break;
            }
            case 0: {
                return n == 0 || n == 1 || n == 2;
            }
        }
    }
}
