// 
// Decompiled by Procyon v0.6.0
// 

public final class amcq implements agzo
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
    public static final agzo u;
    private final /* synthetic */ int v;
    
    static {
        u = new amcq(20);
        t = new amcq(19);
        s = new amcq(18);
        r = new amcq(17);
        q = new amcq(16);
        p = new amcq(15);
        o = new amcq(14);
        n = new amcq(13);
        m = new amcq(12);
        l = new amcq(11);
        k = new amcq(10);
        j = new amcq(9);
        i = new amcq(8);
        h = new amcq(7);
        g = new amcq(6);
        f = new amcq(5);
        e = new amcq(4);
        d = new amcq(3);
        c = new amcq(2);
        b = new amcq(1);
        a = new amcq(0);
    }
    
    private amcq(final int v) {
        this.v = v;
    }
    
    @Override
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                return aqql.dg(n) != 0;
            }
            case 19: {
                return aqql.dh(n) != 0;
            }
            case 18: {
                return aqql.di(n) != 0;
            }
            case 17: {
                return aqql.dj(n) != 0;
            }
            case 16: {
                return aqql.dk(n) != 0;
            }
            case 15: {
                return amhg.b(n) != null;
            }
            case 14: {
                return aqql.dl(n) != 0;
            }
            case 13: {
                return aqql.dm(n) != 0;
            }
            case 12: {
                return aqql.dn(n) != 0;
            }
            case 11: {
                return aqql.do(n) != 0;
            }
            case 10: {
                return aqql.dp(n) != 0;
            }
            case 9: {
                return amdq.b(n) != null;
            }
            case 8: {
                return aqql.dq(n) != 0;
            }
            case 7: {
                return aqql.dr(n) != 0;
            }
            case 6: {
                return aqql.ds(n) != 0;
            }
            case 5: {
                return aqql.dt(n) != 0;
            }
            case 4: {
                return aqql.du(n) != 0;
            }
            case 3: {
                return aqql.dv(n) != 0;
            }
            case 2: {
                return n == 0 || n == 1 || n == 2;
            }
            case 1: {
                return n == 0 || n == 1 || n == 2;
            }
            case 0: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
        }
    }
}
