// 
// Decompiled by Procyon v0.6.0
// 

public final class areg implements ahdf
{
    static final ahdf a;
    public static final ahdf b;
    public static final ahdf c;
    public static final ahdf d;
    public static final ahdf e;
    public static final ahdf f;
    public static final ahdf g;
    public static final ahdf h;
    public static final ahdf i;
    public static final ahdf j;
    public static final ahdf k;
    public static final ahdf l;
    public static final ahdf m;
    public static final ahdf n;
    public static final ahdf o;
    public static final ahdf p;
    public static final ahdf q;
    public static final ahdf r;
    public static final ahdf s;
    public static final ahdf t;
    public static final ahdf u;
    private final int v;
    
    static {
        u = (ahdf)new areg(20);
        t = (ahdf)new areg(19);
        s = (ahdf)new areg(18);
        r = (ahdf)new areg(17);
        q = (ahdf)new areg(16);
        p = (ahdf)new areg(15);
        o = (ahdf)new areg(14);
        n = (ahdf)new areg(13);
        m = (ahdf)new areg(12);
        l = (ahdf)new areg(11);
        k = (ahdf)new areg(10);
        j = (ahdf)new areg(9);
        i = (ahdf)new areg(8);
        h = (ahdf)new areg(7);
        g = (ahdf)new areg(6);
        f = (ahdf)new areg(5);
        e = (ahdf)new areg(4);
        d = (ahdf)new areg(3);
        c = (ahdf)new areg(2);
        b = (ahdf)new areg(1);
        a = (ahdf)new areg(0);
    }
    
    private areg(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aucm.b(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return aubw.b(n) != null;
            }
            case 18: {
                return aubk.a(n) != 0;
            }
            case 17: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 16: {
                return aubk.b(n) != 0;
            }
            case 15: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 14: {
                return auay.b(n) != null;
            }
            case 13: {
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
            case 12: {
                return auax.a(n) != 0;
            }
            case 11: {
                return auaw.b(n) != null;
            }
            case 10: {
                return auat.b(n) != null;
            }
            case 9: {
                return auar.b(n) != null;
            }
            case 8: {
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
            case 7: {
                return n == 0 || n == 1 || n == 2;
            }
            case 6: {
                return atzx.b(n) != null;
            }
            case 5: {
                return auax.b(n) != 0;
            }
            case 4: {
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
                    case 9: {
                        return true;
                    }
                }
                break;
            }
            case 3: {
                return arhd.b(n) != null;
            }
            case 2: {
                return arhc.b(n) != null;
            }
            case 1: {
                return n == 1;
            }
            case 0: {
                if (areh.b(n) != null) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
