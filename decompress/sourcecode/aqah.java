// 
// Decompiled by Procyon v0.6.0
// 

public final class aqah implements agzo
{
    static final agzo a;
    public static final agzo b;
    public static final agzo c;
    public static final agzo d;
    public static final agzo e;
    public static final agzo f;
    public static final agzo g;
    public static final agzo h;
    public static final agzo i;
    public static final agzo j;
    public static final agzo k;
    public static final agzo l;
    public static final agzo m;
    public static final agzo n;
    public static final agzo o;
    public static final agzo p;
    public static final agzo q;
    public static final agzo r;
    public static final agzo s;
    public static final agzo t;
    public static final agzo u;
    private final /* synthetic */ int v;
    
    static {
        u = (agzo)new aqah(20);
        t = (agzo)new aqah(19);
        s = (agzo)new aqah(18);
        r = (agzo)new aqah(17);
        q = (agzo)new aqah(16);
        p = (agzo)new aqah(15);
        o = (agzo)new aqah(14);
        n = (agzo)new aqah(13);
        m = (agzo)new aqah(12);
        l = (agzo)new aqah(11);
        k = (agzo)new aqah(10);
        j = (agzo)new aqah(9);
        i = (agzo)new aqah(8);
        h = (agzo)new aqah(7);
        g = (agzo)new aqah(6);
        f = (agzo)new aqah(5);
        e = (agzo)new aqah(4);
        d = (agzo)new aqah(3);
        c = (agzo)new aqah(2);
        b = (agzo)new aqah(1);
        a = (agzo)new aqah(0);
    }
    
    private aqah(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aqim.b(n) != null) {
                    return true;
                }
                break;
            }
            case 19: {
                return aqql.E(n) != 0;
            }
            case 18: {
                return aqql.F(n) != 0;
            }
            case 17: {
                return aqql.G(n) != 0;
            }
            case 16: {
                return aqql.H(n) != 0;
            }
            case 15: {
                return aqql.I(n) != 0;
            }
            case 14: {
                return aqql.J(n) != 0;
            }
            case 13: {
                return n == 0 || n == 1;
            }
            case 12: {
                return n == 0 || n == 1;
            }
            case 11: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 10: {
                return n == 0;
            }
            case 9: {
                return aqql.K(n) != 0;
            }
            case 8: {
                return aqql.L(n) != 0;
            }
            case 7: {
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
            case 6: {
                return aqql.N(n) != 0;
            }
            case 5: {
                return aqql.O(n) != 0;
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
                    case 8:
                    case 9:
                    case 10:
                    case 11: {
                        return true;
                    }
                }
                break;
            }
            case 3: {
                return aqql.P(n) != 0;
            }
            case 2: {
                return aqql.Q(n) != 0;
            }
            case 1: {
                return n == 0 || n == 1 || n == 2;
            }
            case 0: {
                if (aqql.R(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
