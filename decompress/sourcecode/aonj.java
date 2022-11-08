// 
// Decompiled by Procyon v0.6.0
// 

public final class aonj implements agzo
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
    public static final agzo t;
    static final agzo u;
    private final /* synthetic */ int v;
    
    static {
        u = new aonj(20);
        t = new aonj(19);
        s = new aonj(18);
        r = new aonj(17);
        q = new aonj(16);
        p = new aonj(15);
        o = new aonj(14);
        n = new aonj(13);
        m = new aonj(12);
        l = new aonj(11);
        k = new aonj(10);
        j = new aonj(9);
        i = new aonj(8);
        h = new aonj(7);
        g = new aonj(6);
        f = new aonj(5);
        e = new aonj(4);
        d = new aonj(3);
        c = new aonj(2);
        b = new aonj(1);
        a = new aonj(0);
    }
    
    private aonj(final int v) {
        this.v = v;
    }
    
    @Override
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                return n == 0 || n == 1;
            }
            case 19: {
                return aqql.aI(n) != 0;
            }
            case 18: {
                return aorw.b(n) != null;
            }
            case 17: {
                return aqql.aJ(n) != 0;
            }
            case 16: {
                return aorg.b(n) != null;
            }
            case 15: {
                return aqql.aK(n) != 0;
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
                    case 6: {
                        return true;
                    }
                }
                break;
            }
            case 13: {
                return aqql.aL(n) != 0;
            }
            case 12: {
                return n == 0 || n == 1 || n == 2;
            }
            case 11: {
                return aoqb.b(n) != null;
            }
            case 10: {
                return aopr.b(n) != null;
            }
            case 9: {
                return aqql.aM(n) != 0;
            }
            case 8: {
                return n == 0 || n == 1 || n == 2;
            }
            case 7: {
                return n == 0 || n == 1 || n == 2;
            }
            case 6: {
                return aooi.b(n) != null;
            }
            case 5: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 4: {
                return aqql.aN(n) != 0;
            }
            case 3: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 2: {
                return aonu.b(n) != null;
            }
            case 1: {
                return aqql.aP(n) != 0;
            }
            case 0: {
                return aqql.aO(n) != 0;
            }
        }
    }
}
