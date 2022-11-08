// 
// Decompiled by Procyon v0.6.0
// 

final class apjd implements agzo
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
        u = (agzo)new apjd(20);
        t = (agzo)new apjd(19);
        s = (agzo)new apjd(18);
        r = (agzo)new apjd(17);
        q = (agzo)new apjd(16);
        p = (agzo)new apjd(15);
        o = (agzo)new apjd(14);
        n = (agzo)new apjd(13);
        m = (agzo)new apjd(12);
        l = (agzo)new apjd(11);
        k = (agzo)new apjd(10);
        j = (agzo)new apjd(9);
        i = (agzo)new apjd(8);
        h = (agzo)new apjd(7);
        g = (agzo)new apjd(6);
        f = (agzo)new apjd(5);
        e = (agzo)new apjd(4);
        d = (agzo)new apjd(3);
        c = (agzo)new apjd(2);
        b = (agzo)new apjd(1);
        a = (agzo)new apjd(0);
    }
    
    private apjd(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (apmr.b(n) != null) {
                    return true;
                }
                break;
            }
            case 19: {
                return n == 0 || n == 1;
            }
            case 18: {
                return n == 0 || n == 1 || n == 2;
            }
            case 17: {
                return apmq.b(n) != null;
            }
            case 16: {
                return n == 0 || n == 1 || n == 2;
            }
            case 15: {
                return apmp.b(n) != null;
            }
            case 14: {
                return aqql.ao(n) != 0;
            }
            case 13: {
                return aply.b(n) != null;
            }
            case 12: {
                return aplw.b(n) != null;
            }
            case 11: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 10: {
                return aqql.ap(n) != 0;
            }
            case 9: {
                return apka.b(n) != null;
            }
            case 8: {
                return apjh.b(n) != null;
            }
            case 7: {
                return apjg.b(n) != null;
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
                    case 9:
                    case 10:
                    case 11: {
                        return true;
                    }
                }
                break;
            }
            case 5: {
                return n == 0 || n == 1 || n == 2;
            }
            case 4: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 3: {
                return aqql.aq(n) != 0;
            }
            case 2: {
                return apjf.b(n) != null;
            }
            case 1: {
                return apjc.b(n) != null;
            }
            case 0: {
                if (apje.b(n) != null) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
