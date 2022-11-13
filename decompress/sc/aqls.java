// 
// Decompiled by Procyon v0.6.0
// 

public final class aqls implements ahbn
{
    static final ahbn a;
    public static final ahbn b;
    public static final ahbn c;
    public static final ahbn d;
    public static final ahbn e;
    public static final ahbn f;
    public static final ahbn g;
    public static final ahbn h;
    public static final ahbn i;
    public static final ahbn j;
    public static final ahbn k;
    public static final ahbn l;
    public static final ahbn m;
    public static final ahbn n;
    public static final ahbn o;
    public static final ahbn p;
    public static final ahbn q;
    public static final ahbn r;
    public static final ahbn s;
    public static final ahbn t;
    public static final ahbn u;
    private final int v;
    
    static {
        u = (ahbn)new aqls(20);
        t = (ahbn)new aqls(19);
        s = (ahbn)new aqls(18);
        r = (ahbn)new aqls(17);
        q = (ahbn)new aqls(16);
        p = (ahbn)new aqls(15);
        o = (ahbn)new aqls(14);
        n = (ahbn)new aqls(13);
        m = (ahbn)new aqls(12);
        l = (ahbn)new aqls(11);
        k = (ahbn)new aqls(10);
        j = (ahbn)new aqls(9);
        i = (ahbn)new aqls(8);
        h = (ahbn)new aqls(7);
        g = (ahbn)new aqls(6);
        f = (ahbn)new aqls(5);
        e = (ahbn)new aqls(4);
        d = (ahbn)new aqls(3);
        c = (ahbn)new aqls(2);
        b = (ahbn)new aqls(1);
        a = (ahbn)new aqls(0);
    }
    
    private aqls(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        Label_0640: {
            switch (this.v) {
                default: {
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
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35: {
                            break Label_0640;
                        }
                    }
                    break;
                }
                case 19: {
                    return n == 0 || n == 1 || n == 2 || n == 3;
                }
                case 18: {
                    return aqsy.f(n) != 0;
                }
                case 17: {
                    return n == 0 || n == 1 || n == 2;
                }
                case 16: {
                    return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5;
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
                        case 11: {
                            return true;
                        }
                    }
                    break;
                }
                case 14: {
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
                case 13: {
                    return aqsx.a(n) != 0;
                }
                case 12: {
                    return aqra.b(n) != null;
                }
                case 11: {
                    return aqsx.e(n) != 0;
                }
                case 10: {
                    return aqsx.f(n) != 0;
                }
                case 9: {
                    return aqsx.g(n) != 0;
                }
                case 8: {
                    return aqsx.h(n) != 0;
                }
                case 7: {
                    return aqsx.z(n) != 0;
                }
                case 6: {
                    return aqsx.A(n) != 0;
                }
                case 5: {
                    return aqsx.B(n) != 0;
                }
                case 4: {
                    return aqsx.C(n) != 0;
                }
                case 3: {
                    return aqsx.D(n) != 0;
                }
                case 2: {
                    return aqsx.E(n) != 0;
                }
                case 1: {
                    return aqky.b(n) != null;
                }
                case 0: {
                    if (n != 0 && n != 1 && n != 2 && n != 3) {
                        return false;
                    }
                    break;
                }
            }
        }
        return true;
    }
}
