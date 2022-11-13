// 
// Decompiled by Procyon v0.6.0
// 

public final class apow implements ahbn
{
    static final ahbn a;
    static final ahbn b;
    static final ahbn c;
    static final ahbn d;
    static final ahbn e;
    static final ahbn f;
    public static final ahbn g;
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
        u = (ahbn)new apow(20);
        t = (ahbn)new apow(19);
        s = (ahbn)new apow(18);
        r = (ahbn)new apow(17);
        q = (ahbn)new apow(16);
        p = (ahbn)new apow(15);
        o = (ahbn)new apow(14);
        n = (ahbn)new apow(13);
        m = (ahbn)new apow(12);
        l = (ahbn)new apow(11);
        k = (ahbn)new apow(10);
        j = (ahbn)new apow(9);
        i = (ahbn)new apow(8);
        h = (ahbn)new apow(7);
        g = (ahbn)new apow(6);
        f = (ahbn)new apow(5);
        e = (ahbn)new apow(4);
        d = (ahbn)new apow(3);
        c = (ahbn)new apow(2);
        b = (ahbn)new apow(1);
        a = (ahbn)new apow(0);
    }
    
    private apow(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (n != 31) {
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
                        case 8: {
                            break;
                        }
                    }
                }
                return true;
            }
            case 19: {
                return aqsx.ac(n) != 0;
            }
            case 18: {
                return aqsx.ad(n) != 0;
            }
            case 17: {
                return aqsx.ae(n) != 0;
            }
            case 16: {
                return aqsx.af(n) != 0;
            }
            case 15: {
                return aqsx.ag(n) != 0;
            }
            case 14: {
                return aqsx.ah(n) != 0;
            }
            case 13: {
                return aqsx.ai(n) != 0;
            }
            case 12: {
                return apps.b(n) != null;
            }
            case 11: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 10: {
                return aqsx.aj(n) != 0;
            }
            case 9: {
                return aqsx.ak(n) != 0;
            }
            case 8: {
                return apoy.b(n) != null;
            }
            case 7: {
                return aqsx.al(n) != 0;
            }
            case 6: {
                return aqsx.am(n) != 0;
            }
            case 5: {
                return apox.b(n) != null;
            }
            case 4: {
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
                    case 8: {
                        return true;
                    }
                }
                break;
            }
            case 3: {
                return n == 0 || n == 1 || n == 2;
            }
            case 2: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5;
            }
            case 1: {
                return apov.b(n) != null;
            }
            case 0: {
                return n == 0 || n == 1;
            }
        }
    }
}
