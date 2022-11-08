// 
// Decompiled by Procyon v0.6.0
// 

public final class aeih implements agzo
{
    public static final agzo a;
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
        u = new aeih(20);
        t = new aeih(19);
        s = new aeih(18);
        r = new aeih(17);
        q = new aeih(16);
        p = new aeih(15);
        o = new aeih(14);
        n = new aeih(13);
        m = new aeih(12);
        l = new aeih(11);
        k = new aeih(10);
        j = new aeih(9);
        i = new aeih(8);
        h = new aeih(7);
        g = new aeih(6);
        f = new aeih(5);
        e = new aeih(4);
        d = new aeih(3);
        c = new aeih(2);
        b = new aeih(1);
        a = new aeih(0);
    }
    
    private aeih(final int v) {
        this.v = v;
    }
    
    @Override
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (afqg.d(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return afqg.e(n) != 0;
            }
            case 18: {
                return afqg.f(n) != 0;
            }
            case 17: {
                return n == 0 || n == 1 || n == 2 || n == 3;
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
                    case 6:
                    case 7: {
                        return true;
                    }
                }
                break;
            }
            case 15: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 14: {
                return afqg.h(n) != 0;
            }
            case 13: {
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
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26: {
                        return true;
                    }
                }
                break;
            }
            case 12: {
                return afou.a(n) != null;
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
                return aety.e(n) != 0;
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
            case 8: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5;
            }
            case 7: {
                return aevx.a(n) != null;
            }
            case 6: {
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
                    case 9: {
                        return true;
                    }
                }
                break;
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
                    case 6: {
                        return true;
                    }
                }
                break;
            }
            case 4: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5;
            }
            case 3: {
                return n == 0 || n == 1 || n == 2;
            }
            case 2: {
                return n == 0 || n == 1 || n == 2;
            }
            case 1: {
                return aeda.F(n) != 0;
            }
            case 0: {
                if (afqg.n(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
