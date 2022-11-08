// 
// Decompiled by Procyon v0.6.0
// 

public final class ahse implements agzo
{
    static final agzo a;
    static final agzo b;
    static final agzo c;
    static final agzo d;
    static final agzo e;
    static final agzo f;
    public static final agzo g;
    public static final agzo h;
    static final agzo i;
    public static final agzo j;
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
        u = (agzo)new ahse(20);
        t = (agzo)new ahse(19);
        s = (agzo)new ahse(18);
        r = (agzo)new ahse(17);
        q = (agzo)new ahse(16);
        p = (agzo)new ahse(15);
        o = (agzo)new ahse(14);
        n = (agzo)new ahse(13);
        m = (agzo)new ahse(12);
        l = (agzo)new ahse(11);
        k = (agzo)new ahse(10);
        j = (agzo)new ahse(9);
        i = (agzo)new ahse(8);
        h = (agzo)new ahse(7);
        g = (agzo)new ahse(6);
        f = (agzo)new ahse(5);
        e = (agzo)new ahse(4);
        d = (agzo)new ahse(3);
        c = (agzo)new ahse(2);
        b = (agzo)new ahse(1);
        a = (agzo)new ahse(0);
    }
    
    private ahse(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aesy.aR(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return ahxv.b(n) != null;
            }
            case 18: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 17: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 16: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 15: {
                return ahwk.b(n) != null;
            }
            case 14: {
                return ahwj.b(n) != null;
            }
            case 13: {
                return ahvx.b(n) != null;
            }
            case 12: {
                return aesy.aS(n) != 0;
            }
            case 11: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 10: {
                return aesy.aT(n) != 0;
            }
            case 9: {
                return aesy.aU(n) != 0;
            }
            case 8: {
                return aesy.aV(n) != 0;
            }
            case 7: {
                return aesy.aW(n) != 0;
            }
            case 6: {
                return aesy.aX(n) != 0;
            }
            case 5: {
                return aesy.aY(n) != 0;
            }
            case 4: {
                return ahtu.b(n) != null;
            }
            case 3: {
                return n == 0 || n == 1 || n == 2;
            }
            case 2: {
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
                    case 16: {
                        return true;
                    }
                }
                break;
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
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17: {
                        return true;
                    }
                }
                break;
            }
            case 0: {
                if (aesy.ba(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
