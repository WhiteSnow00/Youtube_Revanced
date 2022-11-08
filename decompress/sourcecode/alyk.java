// 
// Decompiled by Procyon v0.6.0
// 

final class alyk implements agzo
{
    static final agzo a;
    static final agzo b;
    static final agzo c;
    static final agzo d;
    static final agzo e;
    static final agzo f;
    static final agzo g;
    static final agzo h;
    static final agzo i;
    static final agzo j;
    static final agzo k;
    static final agzo l;
    static final agzo m;
    static final agzo n;
    static final agzo o;
    static final agzo p;
    static final agzo q;
    static final agzo r;
    static final agzo s;
    static final agzo t;
    static final agzo u;
    private final /* synthetic */ int v;
    
    static {
        u = new alyk(20);
        t = new alyk(19);
        s = new alyk(18);
        r = new alyk(17);
        q = new alyk(16);
        p = new alyk(15);
        o = new alyk(14);
        n = new alyk(13);
        m = new alyk(12);
        l = new alyk(11);
        k = new alyk(10);
        j = new alyk(9);
        i = new alyk(8);
        h = new alyk(7);
        g = new alyk(6);
        f = new alyk(5);
        e = new alyk(4);
        d = new alyk(3);
        c = new alyk(2);
        b = new alyk(1);
        a = new alyk(0);
    }
    
    private alyk(final int v) {
        this.v = v;
    }
    
    @Override
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
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
            case 19: {
                return aqql.dw(n) != 0;
            }
            case 18: {
                return amcp.b(n) != null;
            }
            case 17: {
                return amco.b(n) != null;
            }
            case 16: {
                return amcn.b(n) != null;
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
                    case 6: {
                        return true;
                    }
                }
                break;
            }
            case 14: {
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
            case 13: {
                return amcm.b(n) != null;
            }
            case 12: {
                return amcl.b(n) != null;
            }
            case 11: {
                return n == 0 || n == 1 || n == 2;
            }
            case 10: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 9: {
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
            case 8: {
                return n == 0 || n == 1 || n == 2;
            }
            case 7: {
                return aqql.dz(n) != 0;
            }
            case 6: {
                return n == 0 || n == 1 || n == 2;
            }
            case 5: {
                return aqql.dA(n) != 0;
            }
            case 4: {
                return amcd.b(n) != null;
            }
            case 3: {
                return amaq.b(n) != null;
            }
            case 2: {
                return alzr.b(n) != null;
            }
            case 1: {
                return alws.b(n) != null;
            }
            case 0: {
                return aqql.dB(n) != 0;
            }
        }
    }
}
