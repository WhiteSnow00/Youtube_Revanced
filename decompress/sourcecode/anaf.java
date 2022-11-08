// 
// Decompiled by Procyon v0.6.0
// 

final class anaf implements agzo
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
        u = new anaf(20);
        t = new anaf(19);
        s = new anaf(18);
        r = new anaf(17);
        q = new anaf(16);
        p = new anaf(15);
        o = new anaf(14);
        n = new anaf(13);
        m = new anaf(12);
        l = new anaf(11);
        k = new anaf(10);
        j = new anaf(9);
        i = new anaf(8);
        h = new anaf(7);
        g = new anaf(6);
        f = new anaf(5);
        e = new anaf(4);
        d = new anaf(3);
        c = new anaf(2);
        b = new anaf(1);
        a = new anaf(0);
    }
    
    private anaf(final int v) {
        this.v = v;
    }
    
    @Override
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                return anfx.b(n) != null;
            }
            case 19: {
                return aqql.cB(n) != 0;
            }
            case 18: {
                return aqql.cC(n) != 0;
            }
            case 17: {
                return aqql.cD(n) != 0;
            }
            case 16: {
                return anfo.b(n) != null;
            }
            case 15: {
                return anfg.b(n) != null;
            }
            case 14: {
                return anff.b(n) != null;
            }
            case 13: {
                return ande.b(n) != null;
            }
            case 12: {
                return ancw.b(n) != null;
            }
            case 11: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 10: {
                return anco.b(n) != null;
            }
            case 9: {
                return anbw.b(n) != null;
            }
            case 8: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 7: {
                return n == 0 || n == 1 || n == 2;
            }
            case 6: {
                return aqql.cE(n) != 0;
            }
            case 5: {
                return anbe.b(n) != null;
            }
            case 4: {
                return anbd.b(n) != null;
            }
            case 3: {
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
            case 2: {
                return anbc.b(n) != null;
            }
            case 1: {
                return anae.b(n) != null;
            }
            case 0: {
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
        }
    }
}
