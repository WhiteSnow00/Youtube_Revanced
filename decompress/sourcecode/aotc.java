// 
// Decompiled by Procyon v0.6.0
// 

public final class aotc implements agzo
{
    static final agzo a;
    static final agzo b;
    static final agzo c;
    static final agzo d;
    public static final agzo e;
    static final agzo f;
    static final agzo g;
    static final agzo h;
    static final agzo i;
    static final agzo j;
    static final agzo k;
    static final agzo l;
    static final agzo m;
    public static final agzo n;
    static final agzo o;
    static final agzo p;
    static final agzo q;
    static final agzo r;
    static final agzo s;
    static final agzo t;
    static final agzo u;
    private final /* synthetic */ int v;
    
    static {
        u = (agzo)new aotc(20);
        t = (agzo)new aotc(19);
        s = (agzo)new aotc(18);
        r = (agzo)new aotc(17);
        q = (agzo)new aotc(16);
        p = (agzo)new aotc(15);
        o = (agzo)new aotc(14);
        n = (agzo)new aotc(13);
        m = (agzo)new aotc(12);
        l = (agzo)new aotc(11);
        k = (agzo)new aotc(10);
        j = (agzo)new aotc(9);
        i = (agzo)new aotc(8);
        h = (agzo)new aotc(7);
        g = (agzo)new aotc(6);
        f = (agzo)new aotc(5);
        e = (agzo)new aotc(4);
        d = (agzo)new aotc(3);
        c = (agzo)new aotc(2);
        b = (agzo)new aotc(1);
        a = (agzo)new aotc(0);
    }
    
    private aotc(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (apfm.b(n) != null) {
                    return true;
                }
                break;
            }
            case 19: {
                return apfl.b(n) != null;
            }
            case 18: {
                return apfk.b(n) != null;
            }
            case 17: {
                return apfj.b(n) != null;
            }
            case 16: {
                return n == 0 || n == 1 || n == 2;
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
                    case 7: {
                        return true;
                    }
                }
                break;
            }
            case 13: {
                return aqql.aB(n) != 0;
            }
            case 12: {
                return apes.b(n) != null;
            }
            case 11: {
                return apae.b(n) != null;
            }
            case 10: {
                return aqql.aC(n) != 0;
            }
            case 9: {
                return aouw.b(n) != null;
            }
            case 8: {
                return aqql.aD(n) != 0;
            }
            case 7: {
                return aouv.b(n) != null;
            }
            case 6: {
                return aotx.b(n) != null;
            }
            case 5: {
                return aotw.b(n) != null;
            }
            case 4: {
                return aqql.aE(n) != 0;
            }
            case 3: {
                return aots.b(n) != null;
            }
            case 2: {
                return aqql.aF(n) != 0;
            }
            case 1: {
                return aqql.aH(n) != 0;
            }
            case 0: {
                if (aqql.aG(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
