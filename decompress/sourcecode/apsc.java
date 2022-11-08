// 
// Decompiled by Procyon v0.6.0
// 

public final class apsc implements agzo
{
    static final agzo a;
    public static final agzo b;
    public static final agzo c;
    static final agzo d;
    public static final agzo e;
    static final agzo f;
    static final agzo g;
    static final agzo h;
    public static final agzo i;
    static final agzo j;
    static final agzo k;
    static final agzo l;
    static final agzo m;
    static final agzo n;
    static final agzo o;
    static final agzo p;
    static final agzo q;
    public static final agzo r;
    public static final agzo s;
    public static final agzo t;
    public static final agzo u;
    private final /* synthetic */ int v;
    
    static {
        u = new apsc(20);
        t = new apsc(19);
        s = new apsc(18);
        r = new apsc(17);
        q = new apsc(16);
        p = new apsc(15);
        o = new apsc(14);
        n = new apsc(13);
        m = new apsc(12);
        l = new apsc(11);
        k = new apsc(10);
        j = new apsc(9);
        i = new apsc(8);
        h = new apsc(7);
        g = new apsc(6);
        f = new apsc(5);
        e = new apsc(4);
        d = new apsc(3);
        c = new apsc(2);
        b = new apsc(1);
        a = new apsc(0);
    }
    
    private apsc(final int v) {
        this.v = v;
    }
    
    @Override
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 19: {
                return apyq.b(n) != null;
            }
            case 18: {
                return apyh.b(n) != null;
            }
            case 17: {
                return aqql.S(n) != 0;
            }
            case 16: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 15: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 14: {
                return apwr.b(n) != null;
            }
            case 13: {
                return apwq.b(n) != null;
            }
            case 12: {
                return aqql.T(n) != 0;
            }
            case 11: {
                return aqql.U(n) != 0;
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
                    case 8:
                    case 9:
                    case 10: {
                        return true;
                    }
                }
                break;
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
                    case 8: {
                        return true;
                    }
                }
                break;
            }
            case 8: {
                return aqql.V(n) != 0;
            }
            case 7: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 6: {
                return apti.b(n) != null;
            }
            case 5: {
                return apth.b(n) != null;
            }
            case 4: {
                return aqql.W(n) != 0;
            }
            case 3: {
                return aqql.X(n) != 0;
            }
            case 2: {
                return aqql.Y(n) != 0;
            }
            case 1: {
                return aqql.aa(n) != 0;
            }
            case 0: {
                return aqql.Z(n) != 0;
            }
        }
    }
}
