// 
// Decompiled by Procyon v0.6.0
// 

public final class aocr implements agzo
{
    static final agzo a;
    public static final agzo b;
    public static final agzo c;
    public static final agzo d;
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
        u = (agzo)new aocr(20);
        t = (agzo)new aocr(19);
        s = (agzo)new aocr(18);
        r = (agzo)new aocr(17);
        q = (agzo)new aocr(16);
        p = (agzo)new aocr(15);
        o = (agzo)new aocr(14);
        n = (agzo)new aocr(13);
        m = (agzo)new aocr(12);
        l = (agzo)new aocr(11);
        k = (agzo)new aocr(10);
        j = (agzo)new aocr(9);
        i = (agzo)new aocr(8);
        h = (agzo)new aocr(7);
        g = (agzo)new aocr(6);
        f = (agzo)new aocr(5);
        e = (agzo)new aocr(4);
        d = (agzo)new aocr(3);
        c = (agzo)new aocr(2);
        b = (agzo)new aocr(1);
        a = (agzo)new aocr(0);
    }
    
    private aocr(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aqql.bf(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return aqql.bg(n) != 0;
            }
            case 18: {
                return aqql.bh(n) != 0;
            }
            case 17: {
                return aoil.b(n) != null;
            }
            case 16: {
                return aqql.bi(n) != 0;
            }
            case 15: {
                return n == 0 || n == 1 || n == 2;
            }
            case 14: {
                return aqql.bj(n) != 0;
            }
            case 13: {
                return aqql.bk(n) != 0;
            }
            case 12: {
                return aqql.bl(n) != 0;
            }
            case 11: {
                return aqql.bm(n) != 0;
            }
            case 10: {
                return aqql.bn(n) != 0;
            }
            case 9: {
                return aqql.bo(n) != 0;
            }
            case 8: {
                return aqql.bp(n) != 0;
            }
            case 7: {
                return aodh.b(n) != null;
            }
            case 6: {
                return n == 0 || n == 1 || n == 2;
            }
            case 5: {
                return n == 0 || n == 1;
            }
            case 4: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 3: {
                return aqql.bq(n) != 0;
            }
            case 2: {
                return aqql.br(n) != 0;
            }
            case 1: {
                return aqql.bs(n) != 0;
            }
            case 0: {
                if (aocs.b(n) != null) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
