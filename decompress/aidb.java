// 
// Decompiled by Procyon v0.6.0
// 

public final class aidb implements ahdf
{
    static final ahdf a;
    static final ahdf b;
    static final ahdf c;
    static final ahdf d;
    static final ahdf e;
    static final ahdf f;
    static final ahdf g;
    public static final ahdf h;
    static final ahdf i;
    static final ahdf j;
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
        u = (ahdf)new aidb(20);
        t = (ahdf)new aidb(19);
        s = (ahdf)new aidb(18);
        r = (ahdf)new aidb(17);
        q = (ahdf)new aidb(16);
        p = (ahdf)new aidb(15);
        o = (ahdf)new aidb(14);
        n = (ahdf)new aidb(13);
        m = (ahdf)new aidb(12);
        l = (ahdf)new aidb(11);
        k = (ahdf)new aidb(10);
        j = (ahdf)new aidb(9);
        i = (ahdf)new aidb(8);
        h = (ahdf)new aidb(7);
        g = (ahdf)new aidb(6);
        f = (ahdf)new aidb(5);
        e = (ahdf)new aidb(4);
        d = (ahdf)new aidb(3);
        c = (ahdf)new aidb(2);
        b = (ahdf)new aidb(1);
        a = (ahdf)new aidb(0);
    }
    
    private aidb(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aegu.U(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5;
            }
            case 18: {
                return aegu.V(n) != 0;
            }
            case 17: {
                return aegu.W(n) != 0;
            }
            case 16: {
                return aegu.X(n) != 0;
            }
            case 15: {
                return aegu.Y(n) != 0;
            }
            case 14: {
                return aegu.Z(n) != 0;
            }
            case 13: {
                return aegu.aa(n) != 0;
            }
            case 12: {
                return aegu.ab(n) != 0;
            }
            case 11: {
                return aegu.ac(n) != 0;
            }
            case 10: {
                return n == 0 || n == 1;
            }
            case 9: {
                return n == 0 || n == 1 || n == 2;
            }
            case 8: {
                return n == 0 || n == 1 || n == 2;
            }
            case 7: {
                return aegu.ad(n) != 0;
            }
            case 6: {
                return aegu.ae(n) != 0;
            }
            case 5: {
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
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21: {
                        return true;
                    }
                }
                break;
            }
            case 4: {
                return aegu.af(n) != 0;
            }
            case 3: {
                return n == 0 || n == 1 || n == 2;
            }
            case 2: {
                return aidd.b(n) != null;
            }
            case 1: {
                return aegu.ag(n) != 0;
            }
            case 0: {
                if (aidc.b(n) != null) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
