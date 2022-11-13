// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcl implements ahbn
{
    static final ahbn a;
    static final ahbn b;
    public static final ahbn c;
    public static final ahbn d;
    public static final ahbn e;
    public static final ahbn f;
    public static final ahbn g;
    public static final ahbn h;
    public static final ahbn i;
    public static final ahbn j;
    public static final ahbn k;
    public static final ahbn l;
    public static final ahbn m;
    public static final ahbn n;
    public static final ahbn o;
    public static final ahbn p;
    public static final ahbn q;
    public static final ahbn r;
    public static final ahbn s;
    public static final ahbn t;
    public static final ahbn u;
    private final int v;
    
    static {
        u = (ahbn)new aqcl(20);
        t = (ahbn)new aqcl(19);
        s = (ahbn)new aqcl(18);
        r = (ahbn)new aqcl(17);
        q = (ahbn)new aqcl(16);
        p = (ahbn)new aqcl(15);
        o = (ahbn)new aqcl(14);
        n = (ahbn)new aqcl(13);
        m = (ahbn)new aqcl(12);
        l = (ahbn)new aqcl(11);
        k = (ahbn)new aqcl(10);
        j = (ahbn)new aqcl(9);
        i = (ahbn)new aqcl(8);
        h = (ahbn)new aqcl(7);
        g = (ahbn)new aqcl(6);
        f = (ahbn)new aqcl(5);
        e = (ahbn)new aqcl(4);
        d = (ahbn)new aqcl(3);
        c = (ahbn)new aqcl(2);
        b = (ahbn)new aqcl(1);
        a = (ahbn)new aqcl(0);
    }
    
    private aqcl(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                return aqsx.F(n) != 0;
            }
            case 19: {
                return aqsx.G(n) != 0;
            }
            case 18: {
                return aqsx.H(n) != 0;
            }
            case 17: {
                return aqsx.I(n) != 0;
            }
            case 16: {
                return aqsx.J(n) != 0;
            }
            case 15: {
                return aqsx.K(n) != 0;
            }
            case 14: {
                return n == 0 || n == 1;
            }
            case 13: {
                return n == 0 || n == 1;
            }
            case 12: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 11: {
                return n == 0;
            }
            case 10: {
                return aqsx.L(n) != 0;
            }
            case 9: {
                return aqsx.M(n) != 0;
            }
            case 8: {
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                return false;
                            }
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34: {
                                return true;
                            }
                        }
                        break;
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
            case 7: {
                return aqsx.O(n) != 0;
            }
            case 6: {
                return aqsx.P(n) != 0;
            }
            case 5: {
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
            case 4: {
                return aqsx.Q(n) != 0;
            }
            case 3: {
                return aqsx.R(n) != 0;
            }
            case 2: {
                return aqsx.S(n) != 0;
            }
            case 1: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 0: {
                return n == 0 || n == 1 || n == 2;
            }
        }
    }
}
