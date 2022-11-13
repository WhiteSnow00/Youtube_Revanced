// 
// Decompiled by Procyon v0.6.0
// 

final class alnf implements ahbn
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
    static final ahbn q;
    static final ahbn r;
    static final ahbn s;
    static final ahbn t;
    static final ahbn u;
    private final int v;
    
    static {
        u = (ahbn)new alnf(20);
        t = (ahbn)new alnf(19);
        s = (ahbn)new alnf(18);
        r = (ahbn)new alnf(17);
        q = (ahbn)new alnf(16);
        p = (ahbn)new alnf(15);
        o = (ahbn)new alnf(14);
        n = (ahbn)new alnf(13);
        m = (ahbn)new alnf(12);
        l = (ahbn)new alnf(11);
        k = (ahbn)new alnf(10);
        j = (ahbn)new alnf(9);
        i = (ahbn)new alnf(8);
        h = (ahbn)new alnf(7);
        g = (ahbn)new alnf(6);
        f = (ahbn)new alnf(5);
        e = (ahbn)new alnf(4);
        d = (ahbn)new alnf(3);
        c = (ahbn)new alnf(2);
        b = (ahbn)new alnf(1);
        a = (ahbn)new alnf(0);
    }
    
    private alnf(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                return n == 0 || n == 1 || n == 2;
            }
            case 19: {
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
                    case 15: {
                        return true;
                    }
                }
                break;
            }
            case 18: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 17: {
                return n == 0 || n == 1 || n == 2;
            }
            case 16: {
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
                    case 20: {
                        return true;
                    }
                }
                break;
            }
            case 15: {
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
                    case 20: {
                        return true;
                    }
                }
                break;
            }
            case 14: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 13: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
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
                    case 7: {
                        return true;
                    }
                }
                break;
            }
            case 11: {
                return aqsx.dO(n) != 0;
            }
            case 10: {
                return n == 0 || n == 1 || n == 2;
            }
            case 9: {
                return n == 0 || n == 1 || n == 2;
            }
            case 8: {
                return aqsx.dP(n) != 0;
            }
            case 7: {
                return aqsx.dQ(n) != 0;
            }
            case 6: {
                return alpc.b(n) != null;
            }
            case 5: {
                return alpb.b(n) != null;
            }
            case 4: {
                return alog.b(n) != null;
            }
            case 3: {
                return alnu.b(n) != null;
            }
            case 2: {
                return alnp.b(n) != null;
            }
            case 1: {
                return n == 0 || n == 1 || n == 2;
            }
            case 0: {
                return n == 0 || n == 1 || n == 2;
            }
        }
    }
}
