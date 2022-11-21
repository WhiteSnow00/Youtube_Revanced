// 
// Decompiled by Procyon v0.6.0
// 

public final class apvm implements ahdf
{
    static final ahdf a;
    static final ahdf b;
    public static final ahdf c;
    static final ahdf d;
    public static final ahdf e;
    static final ahdf f;
    public static final ahdf g;
    static final ahdf h;
    static final ahdf i;
    static final ahdf j;
    public static final ahdf k;
    static final ahdf l;
    static final ahdf m;
    static final ahdf n;
    static final ahdf o;
    static final ahdf p;
    static final ahdf q;
    static final ahdf r;
    static final ahdf s;
    public static final ahdf t;
    public static final ahdf u;
    private final int v;
    
    static {
        u = (ahdf)new apvm(20);
        t = (ahdf)new apvm(19);
        s = (ahdf)new apvm(18);
        r = (ahdf)new apvm(17);
        q = (ahdf)new apvm(16);
        p = (ahdf)new apvm(15);
        o = (ahdf)new apvm(14);
        n = (ahdf)new apvm(13);
        m = (ahdf)new apvm(12);
        l = (ahdf)new apvm(11);
        k = (ahdf)new apvm(10);
        j = (ahdf)new apvm(9);
        i = (ahdf)new apvm(8);
        h = (ahdf)new apvm(7);
        g = (ahdf)new apvm(6);
        f = (ahdf)new apvm(5);
        e = (ahdf)new apvm(4);
        d = (ahdf)new apvm(3);
        c = (ahdf)new apvm(2);
        b = (ahdf)new apvm(1);
        a = (ahdf)new apvm(0);
    }
    
    private apvm(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aqdc.b(n) != null) {
                    return true;
                }
                break;
            }
            case 19: {
                return aqvq.L(n) != 0;
            }
            case 18: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 17: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 16: {
                return aqbp.b(n) != null;
            }
            case 15: {
                return aqbo.b(n) != null;
            }
            case 14: {
                return aqvq.M(n) != 0;
            }
            case 13: {
                return aqvq.N(n) != 0;
            }
            case 12: {
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
            case 11: {
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
            case 10: {
                return aqvq.O(n) != 0;
            }
            case 9: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 8: {
                return apyg.b(n) != null;
            }
            case 7: {
                return apyf.b(n) != null;
            }
            case 6: {
                return aqvq.P(n) != 0;
            }
            case 5: {
                return aqvq.Q(n) != 0;
            }
            case 4: {
                return aqvq.R(n) != 0;
            }
            case 3: {
                return aqvq.S(n) != 0;
            }
            case 2: {
                return aqvq.T(n) != 0;
            }
            case 1: {
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
            case 0: {
                if (apvn.b(n) != null) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
