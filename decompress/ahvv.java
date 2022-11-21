// 
// Decompiled by Procyon v0.6.0
// 

public final class ahvv implements ahdf
{
    static final ahdf a;
    static final ahdf b;
    static final ahdf c;
    static final ahdf d;
    static final ahdf e;
    static final ahdf f;
    public static final ahdf g;
    public static final ahdf h;
    static final ahdf i;
    public static final ahdf j;
    static final ahdf k;
    static final ahdf l;
    static final ahdf m;
    static final ahdf n;
    static final ahdf o;
    static final ahdf p;
    static final ahdf q;
    static final ahdf r;
    static final ahdf s;
    static final ahdf t;
    static final ahdf u;
    private final int v;
    
    static {
        u = (ahdf)new ahvv(20);
        t = (ahdf)new ahvv(19);
        s = (ahdf)new ahvv(18);
        r = (ahdf)new ahvv(17);
        q = (ahdf)new ahvv(16);
        p = (ahdf)new ahvv(15);
        o = (ahdf)new ahvv(14);
        n = (ahdf)new ahvv(13);
        m = (ahdf)new ahvv(12);
        l = (ahdf)new ahvv(11);
        k = (ahdf)new ahvv(10);
        j = (ahdf)new ahvv(9);
        i = (ahdf)new ahvv(8);
        h = (ahdf)new ahvv(7);
        g = (ahdf)new ahvv(6);
        f = (ahdf)new ahvv(5);
        e = (ahdf)new ahvv(4);
        d = (ahdf)new ahvv(3);
        c = (ahdf)new ahvv(2);
        b = (ahdf)new ahvv(1);
        a = (ahdf)new ahvv(0);
    }
    
    private ahvv(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aegu.ah(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return aibm.b(n) != null;
            }
            case 18: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 17: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 16: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 15: {
                return aiab.b(n) != null;
            }
            case 14: {
                return aiaa.b(n) != null;
            }
            case 13: {
                return ahzo.b(n) != null;
            }
            case 12: {
                return aegu.ai(n) != 0;
            }
            case 11: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 10: {
                return aegu.aj(n) != 0;
            }
            case 9: {
                return aegu.ak(n) != 0;
            }
            case 8: {
                return aegu.al(n) != 0;
            }
            case 7: {
                return aegu.am(n) != 0;
            }
            case 6: {
                return aegu.an(n) != 0;
            }
            case 5: {
                return aegu.ao(n) != 0;
            }
            case 4: {
                return ahxl.b(n) != null;
            }
            case 3: {
                return n == 0 || n == 1 || n == 2;
            }
            case 2: {
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
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16: {
                        return true;
                    }
                }
                break;
            }
            case 1: {
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
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17: {
                        return true;
                    }
                }
                break;
            }
            case 0: {
                if (aegu.aq(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
