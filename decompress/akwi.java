// 
// Decompiled by Procyon v0.6.0
// 

public final class akwi implements ahbn
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
    public static final ahbn k;
    public static final ahbn l;
    public static final ahbn m;
    public static final ahbn n;
    static final ahbn o;
    static final ahbn p;
    static final ahbn q;
    static final ahbn r;
    static final ahbn s;
    static final ahbn t;
    static final ahbn u;
    private final int v;
    
    static {
        u = (ahbn)new akwi(20);
        t = (ahbn)new akwi(19);
        s = (ahbn)new akwi(18);
        r = (ahbn)new akwi(17);
        q = (ahbn)new akwi(16);
        p = (ahbn)new akwi(15);
        o = (ahbn)new akwi(14);
        n = (ahbn)new akwi(13);
        m = (ahbn)new akwi(12);
        l = (ahbn)new akwi(11);
        k = (ahbn)new akwi(10);
        j = (ahbn)new akwi(9);
        i = (ahbn)new akwi(8);
        h = (ahbn)new akwi(7);
        g = (ahbn)new akwi(6);
        f = (ahbn)new akwi(5);
        e = (ahbn)new akwi(4);
        d = (ahbn)new akwi(3);
        c = (ahbn)new akwi(2);
        b = (ahbn)new akwi(1);
        a = (ahbn)new akwi(0);
    }
    
    private akwi(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                return n == 0 || n == 1;
            }
            case 19: {
                return n == 0 || n == 1;
            }
            case 18: {
                return n == 0 || n == 1 || n == 2;
            }
            case 17: {
                return adyf.aZ(n) != 0;
            }
            case 16: {
                return adyf.ba(n) != 0;
            }
            case 15: {
                return adyf.bb(n) != 0;
            }
            case 14: {
                return adyf.bc(n) != 0;
            }
            case 13: {
                return adyf.bd(n) != 0;
            }
            case 12: {
                return adyf.be(n) != 0;
            }
            case 11: {
                return adyf.bf(n) != 0;
            }
            case 10: {
                return adyf.bg(n) != 0;
            }
            case 9: {
                return alai.b(n) != null;
            }
            case 8: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 7: {
                if (n != 18 && n != 22) {
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
            case 6: {
                if (n != 27 && n != 28) {
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
                            break;
                        }
                    }
                }
                return true;
            }
            case 5: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 4: {
                return akzh.b(n) != null;
            }
            case 3: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 2: {
                return akyj.b(n) != null;
            }
            case 1: {
                return n == 0 || n == 1 || n == 2;
            }
            case 0: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
        }
    }
}
