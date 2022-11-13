// 
// Decompiled by Procyon v0.6.0
// 

public final class apuh implements ahbn
{
    public static final ahbn a;
    static final ahbn b;
    static final ahbn c;
    public static final ahbn d;
    static final ahbn e;
    public static final ahbn f;
    static final ahbn g;
    static final ahbn h;
    static final ahbn i;
    public static final ahbn j;
    static final ahbn k;
    static final ahbn l;
    static final ahbn m;
    static final ahbn n;
    static final ahbn o;
    static final ahbn p;
    static final ahbn q;
    static final ahbn r;
    public static final ahbn s;
    public static final ahbn t;
    public static final ahbn u;
    private final int v;
    
    static {
        u = (ahbn)new apuh(20);
        t = (ahbn)new apuh(19);
        s = (ahbn)new apuh(18);
        r = (ahbn)new apuh(17);
        q = (ahbn)new apuh(16);
        p = (ahbn)new apuh(15);
        o = (ahbn)new apuh(14);
        n = (ahbn)new apuh(13);
        m = (ahbn)new apuh(12);
        l = (ahbn)new apuh(11);
        k = (ahbn)new apuh(10);
        j = (ahbn)new apuh(9);
        i = (ahbn)new apuh(8);
        h = (ahbn)new apuh(7);
        g = (ahbn)new apuh(6);
        f = (ahbn)new apuh(5);
        e = (ahbn)new apuh(4);
        d = (ahbn)new apuh(3);
        c = (ahbn)new apuh(2);
        b = (ahbn)new apuh(1);
        a = (ahbn)new apuh(0);
    }
    
    private apuh(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aqax.b(n) != null) {
                    return true;
                }
                break;
            }
            case 19: {
                return aqao.b(n) != null;
            }
            case 18: {
                return aqsx.T(n) != 0;
            }
            case 17: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 16: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 15: {
                return apzb.b(n) != null;
            }
            case 14: {
                return apza.b(n) != null;
            }
            case 13: {
                return aqsx.U(n) != 0;
            }
            case 12: {
                return aqsx.V(n) != 0;
            }
            case 11: {
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
                    case 10: {
                        return true;
                    }
                }
                break;
            }
            case 10: {
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
            case 9: {
                return aqsx.W(n) != 0;
            }
            case 8: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 7: {
                return apvs.b(n) != null;
            }
            case 6: {
                return apvr.b(n) != null;
            }
            case 5: {
                return aqsx.X(n) != 0;
            }
            case 4: {
                return aqsx.Y(n) != 0;
            }
            case 3: {
                return aqsx.Z(n) != 0;
            }
            case 2: {
                return aqsx.aa(n) != 0;
            }
            case 1: {
                return apta.b(n) != null;
            }
            case 0: {
                if (aqsx.ab(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
