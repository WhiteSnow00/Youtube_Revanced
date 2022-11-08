// 
// Decompiled by Procyon v0.6.0
// 

public final class apms implements agzo
{
    static final agzo a;
    static final agzo b;
    static final agzo c;
    static final agzo d;
    static final agzo e;
    public static final agzo f;
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
        u = new apms(20);
        t = new apms(19);
        s = new apms(18);
        r = new apms(17);
        q = new apms(16);
        p = new apms(15);
        o = new apms(14);
        n = new apms(13);
        m = new apms(12);
        l = new apms(11);
        k = new apms(10);
        j = new apms(9);
        i = new apms(8);
        h = new apms(7);
        g = new apms(6);
        f = new apms(5);
        e = new apms(4);
        d = new apms(3);
        c = new apms(2);
        b = new apms(1);
        a = new apms(0);
    }
    
    private apms(final int v) {
        this.v = v;
    }
    
    @Override
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                return apqr.b(n) != null;
            }
            case 19: {
                if (n != 31) {
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
                            break;
                        }
                    }
                }
                return true;
            }
            case 18: {
                return aqql.ab(n) != 0;
            }
            case 17: {
                return aqql.ac(n) != 0;
            }
            case 16: {
                return aqql.ad(n) != 0;
            }
            case 15: {
                return aqql.ae(n) != 0;
            }
            case 14: {
                return aqql.af(n) != 0;
            }
            case 13: {
                return aqql.ag(n) != 0;
            }
            case 12: {
                return aqql.ah(n) != 0;
            }
            case 11: {
                return apno.b(n) != null;
            }
            case 10: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 9: {
                return aqql.ai(n) != 0;
            }
            case 8: {
                return aqql.aj(n) != 0;
            }
            case 7: {
                return apmu.b(n) != null;
            }
            case 6: {
                return aqql.ak(n) != 0;
            }
            case 5: {
                return aqql.al(n) != 0;
            }
            case 4: {
                return apmt.b(n) != null;
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
                    case 8: {
                        return true;
                    }
                }
                break;
            }
            case 2: {
                return n == 0 || n == 1 || n == 2;
            }
            case 1: {
                return n == 0 || n == 1;
            }
            case 0: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5;
            }
        }
    }
}
