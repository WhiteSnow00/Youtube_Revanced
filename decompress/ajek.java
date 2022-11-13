// 
// Decompiled by Procyon v0.6.0
// 

public final class ajek implements ahbn
{
    static final ahbn a;
    static final ahbn b;
    static final ahbn c;
    static final ahbn d;
    static final ahbn e;
    static final ahbn f;
    static final ahbn g;
    static final ahbn h;
    static final ahbn i;
    static final ahbn j;
    static final ahbn k;
    static final ahbn l;
    static final ahbn m;
    static final ahbn n;
    static final ahbn o;
    static final ahbn p;
    public static final ahbn q;
    static final ahbn r;
    static final ahbn s;
    static final ahbn t;
    static final ahbn u;
    private final int v;
    
    static {
        u = (ahbn)new ajek(20);
        t = (ahbn)new ajek(19);
        s = (ahbn)new ajek(18);
        r = (ahbn)new ajek(17);
        q = (ahbn)new ajek(16);
        p = (ahbn)new ajek(15);
        o = (ahbn)new ajek(14);
        n = (ahbn)new ajek(13);
        m = (ahbn)new ajek(12);
        l = (ahbn)new ajek(11);
        k = (ahbn)new ajek(10);
        j = (ahbn)new ajek(9);
        i = (ahbn)new ajek(8);
        h = (ahbn)new ajek(7);
        g = (ahbn)new ajek(6);
        f = (ahbn)new ajek(5);
        e = (ahbn)new ajek(4);
        d = (ahbn)new ajek(3);
        c = (ahbn)new ajek(2);
        b = (ahbn)new ajek(1);
        a = (ahbn)new ajek(0);
    }
    
    private ajek(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aevy.ay(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 18: {
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
                    case 19: {
                        return true;
                    }
                }
                break;
            }
            case 17: {
                return aevy.az(n) != 0;
            }
            case 16: {
                return aevy.aA(n) != 0;
            }
            case 15: {
                return aevy.aB(n) != 0;
            }
            case 14: {
                return ajhp.b(n) != null;
            }
            case 13: {
                return aevy.aC(n) != 0;
            }
            case 12: {
                return n == 0 || n == 1;
            }
            case 11: {
                return aevy.aD(n) != 0;
            }
            case 10: {
                return ajhj.b(n) != null;
            }
            case 9: {
                return aevy.aE(n) != 0;
            }
            case 8: {
                return aevy.aF(n) != 0;
            }
            case 7: {
                return ajgj.b(n) != null;
            }
            case 6: {
                return n == 0 || n == 1 || n == 2;
            }
            case 5: {
                return n == 0 || n == 1 || n == 2;
            }
            case 4: {
                return ajfj.b(n) != null;
            }
            case 3: {
                return aevy.aG(n) != 0;
            }
            case 2: {
                return aevy.aH(n) != 0;
            }
            case 1: {
                return ajdz.b(n) != null;
            }
            case 0: {
                if (ajel.b(n) != null) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
