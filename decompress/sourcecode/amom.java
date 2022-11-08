// 
// Decompiled by Procyon v0.6.0
// 

public final class amom implements agzo
{
    public static final agzo a;
    public static final agzo b;
    static final agzo c;
    static final agzo d;
    static final agzo e;
    static final agzo f;
    public static final agzo g;
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
        u = new amom(20);
        t = new amom(19);
        s = new amom(18);
        r = new amom(17);
        q = new amom(16);
        p = new amom(15);
        o = new amom(14);
        n = new amom(13);
        m = new amom(12);
        l = new amom(11);
        k = new amom(10);
        j = new amom(9);
        i = new amom(8);
        h = new amom(7);
        g = new amom(6);
        f = new amom(5);
        e = new amom(4);
        d = new amom(3);
        c = new amom(2);
        b = new amom(1);
        a = new amom(0);
    }
    
    private amom(final int v) {
        this.v = v;
    }
    
    @Override
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                return n == 0 || n == 1 || n == 2;
            }
            case 19: {
                return aqql.cX(n) != 0;
            }
            case 18: {
                return aqql.cY(n) != 0;
            }
            case 17: {
                return aqql.cZ(n) != 0;
            }
            case 16: {
                return amqw.b(n) != null;
            }
            case 15: {
                return ampx.b(n) != null;
            }
            case 14: {
                return aqql.da(n) != 0;
            }
            case 13: {
                return aqql.db(n) != 0;
            }
            case 12: {
                return ampo.b(n) != null;
            }
            case 11: {
                return ampn.b(n) != null;
            }
            case 10: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5;
            }
            case 9: {
                return aqql.dc(n) != 0;
            }
            case 8: {
                return ampm.b(n) != null;
            }
            case 7: {
                return aqql.dd(n) != 0;
            }
            case 6: {
                return aqql.de(n) != 0;
            }
            case 5: {
                return ampl.b(n) != null;
            }
            case 4: {
                return ampf.b(n) != null;
            }
            case 3: {
                return amop.b(n) != null;
            }
            case 2: {
                return amoo.b(n) != null;
            }
            case 1: {
                return aqql.df(n) != 0;
            }
            case 0: {
                return n == 0 || n == 1 || n == 2;
            }
        }
    }
}
