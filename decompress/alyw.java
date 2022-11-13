// 
// Decompiled by Procyon v0.6.0
// 

final class alyw implements ahbn
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
        u = (ahbn)new alyw(20);
        t = (ahbn)new alyw(19);
        s = (ahbn)new alyw(18);
        r = (ahbn)new alyw(17);
        q = (ahbn)new alyw(16);
        p = (ahbn)new alyw(15);
        o = (ahbn)new alyw(14);
        n = (ahbn)new alyw(13);
        m = (ahbn)new alyw(12);
        l = (ahbn)new alyw(11);
        k = (ahbn)new alyw(10);
        j = (ahbn)new alyw(9);
        i = (ahbn)new alyw(8);
        h = (ahbn)new alyw(7);
        g = (ahbn)new alyw(6);
        f = (ahbn)new alyw(5);
        e = (ahbn)new alyw(4);
        d = (ahbn)new alyw(3);
        c = (ahbn)new alyw(2);
        b = (ahbn)new alyw(1);
        a = (ahbn)new alyw(0);
    }
    
    private alyw(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aqsx.dx(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return amet.b(n) != null;
            }
            case 18: {
                return ames.b(n) != null;
            }
            case 17: {
                return amer.b(n) != null;
            }
            case 16: {
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
            case 15: {
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
                    case 11: {
                        return true;
                    }
                }
                break;
            }
            case 14: {
                return ameq.b(n) != null;
            }
            case 13: {
                return amep.b(n) != null;
            }
            case 12: {
                return n == 0 || n == 1 || n == 2;
            }
            case 11: {
                return n == 0 || n == 1 || n == 2 || n == 3;
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
                    case 6: {
                        return true;
                    }
                }
                break;
            }
            case 9: {
                return n == 0 || n == 1 || n == 2;
            }
            case 8: {
                return aqsx.dA(n) != 0;
            }
            case 7: {
                return n == 0 || n == 1 || n == 2;
            }
            case 6: {
                return aqsx.dB(n) != 0;
            }
            case 5: {
                return ameh.b(n) != null;
            }
            case 4: {
                return amcu.b(n) != null;
            }
            case 3: {
                return ambv.b(n) != null;
            }
            case 2: {
                return aqsx.dC(n) != 0;
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
                    case 8: {
                        return true;
                    }
                }
                break;
            }
            case 0: {
                if (alyx.b(n) != null) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
