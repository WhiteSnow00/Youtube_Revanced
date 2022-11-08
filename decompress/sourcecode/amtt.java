// 
// Decompiled by Procyon v0.6.0
// 

final class amtt implements agzo
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
        u = new amtt(20);
        t = new amtt(19);
        s = new amtt(18);
        r = new amtt(17);
        q = new amtt(16);
        p = new amtt(15);
        o = new amtt(14);
        n = new amtt(13);
        m = new amtt(12);
        l = new amtt(11);
        k = new amtt(10);
        j = new amtt(9);
        i = new amtt(8);
        h = new amtt(7);
        g = new amtt(6);
        f = new amtt(5);
        e = new amtt(4);
        d = new amtt(3);
        c = new amtt(2);
        b = new amtt(1);
        a = new amtt(0);
    }
    
    private amtt(final int v) {
        this.v = v;
    }
    
    @Override
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aqql.cF(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return amzy.b(n) != null;
            }
            case 18: {
                return n == 0 || n == 1 || n == 2;
            }
            case 17: {
                return amzm.b(n) != null;
            }
            case 16: {
                return aqql.cG(n) != 0;
            }
            case 15: {
                return amzb.b(n) != null;
            }
            case 14: {
                return aqql.cH(n) != 0;
            }
            case 13: {
                return amxm.b(n) != null;
            }
            case 12: {
                return aqql.cI(n) != 0;
            }
            case 11: {
                return n == 0 || n == 1 || n == 2 || n == 5 || n == 7 || n == 8 || n == 9;
            }
            case 10: {
                return n == 0 || n == 1 || n == 2;
            }
            case 9: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 8: {
                return n == 0 || n == 1;
            }
            case 7: {
                return amww.b(n) != null;
            }
            case 6: {
                return aqql.cJ(n) != 0;
            }
            case 5: {
                return n == 0 || n == 1 || n == 2;
            }
            case 4: {
                return amuv.b(n) != null;
            }
            case 3: {
                return amut.b(n) != null;
            }
            case 2: {
                return amum.b(n) != null;
            }
            case 1: {
                return amtq.b(n) != null;
            }
            case 0: {
                if (amtu.b(n) != null) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
