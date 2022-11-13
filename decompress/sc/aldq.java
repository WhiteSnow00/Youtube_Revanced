// 
// Decompiled by Procyon v0.6.0
// 

final class aldq implements ahbn
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
        u = (ahbn)new aldq(20);
        t = (ahbn)new aldq(19);
        s = (ahbn)new aldq(18);
        r = (ahbn)new aldq(17);
        q = (ahbn)new aldq(16);
        p = (ahbn)new aldq(15);
        o = (ahbn)new aldq(14);
        n = (ahbn)new aldq(13);
        m = (ahbn)new aldq(12);
        l = (ahbn)new aldq(11);
        k = (ahbn)new aldq(10);
        j = (ahbn)new aldq(9);
        i = (ahbn)new aldq(8);
        h = (ahbn)new aldq(7);
        g = (ahbn)new aldq(6);
        f = (ahbn)new aldq(5);
        e = (ahbn)new aldq(4);
        d = (ahbn)new aldq(3);
        c = (ahbn)new aldq(2);
        b = (ahbn)new aldq(1);
        a = (ahbn)new aldq(0);
    }
    
    private aldq(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        Label_0682: {
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
                        case 6: {
                            break Label_0682;
                        }
                    }
                    break;
                }
                case 19: {
                    return almy.b(n) != null;
                }
                case 18: {
                    return almx.b(n) != null;
                }
                case 17: {
                    return n == 0 || n == 1;
                }
                case 16: {
                    return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5;
                }
                case 15: {
                    return aqsx.dS(n) != 0;
                }
                case 14: {
                    return aqsx.dT(n) != 0;
                }
                case 13: {
                    return adyf.aV(n) != 0;
                }
                case 12: {
                    return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
                }
                case 11: {
                    return n == 0 || n == 1 || n == 2 || n == 3;
                }
                case 10: {
                    return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
                }
                case 9: {
                    return adyf.aW(n) != 0;
                }
                case 8: {
                    if (n != 0 && n != 1 && n != 2) {
                        switch (n) {
                            default: {
                                return false;
                            }
                            case 4:
                            case 8:
                            case 16:
                            case 32:
                            case 64:
                            case 128:
                            case 256:
                            case 512:
                            case 1024:
                            case 2048:
                            case 4096:
                            case 8192:
                            case 16384: {
                                break;
                            }
                        }
                    }
                    return true;
                }
                case 7: {
                    return n == 0 || n == 1 || n == 2;
                }
                case 6: {
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
                case 5: {
                    return adyf.aX(n) != 0;
                }
                case 4: {
                    return alek.b(n) != null;
                }
                case 3: {
                    return n == 0 || n == 1 || n == 2;
                }
                case 2: {
                    return adyf.aY(n) != 0;
                }
                case 1: {
                    return n == 0 || n == 1 || n == 2;
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
