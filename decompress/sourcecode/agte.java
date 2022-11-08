// 
// Decompiled by Procyon v0.6.0
// 

public final class agte implements agzo
{
    static final agzo a;
    static final agzo b;
    static final agzo c;
    static final agzo d;
    static final agzo e;
    static final agzo f;
    static final agzo g;
    static final agzo h;
    static final agzo i;
    static final agzo j;
    static final agzo k;
    static final agzo l;
    static final agzo m;
    static final agzo n;
    public static final agzo o;
    public static final agzo p;
    public static final agzo q;
    public static final agzo r;
    public static final agzo s;
    public static final agzo t;
    public static final agzo u;
    private final /* synthetic */ int v;
    
    static {
        u = (agzo)new agte(20);
        t = (agzo)new agte(19);
        s = (agzo)new agte(18);
        r = (agzo)new agte(17);
        q = (agzo)new agte(16);
        p = (agzo)new agte(15);
        o = (agzo)new agte(14);
        n = (agzo)new agte(13);
        m = (agzo)new agte(12);
        l = (agzo)new agte(11);
        k = (agzo)new agte(10);
        j = (agzo)new agte(9);
        i = (agzo)new agte(8);
        h = (agzo)new agte(7);
        g = (agzo)new agte(6);
        f = (agzo)new agte(5);
        e = (agzo)new agte(4);
        d = (agzo)new agte(3);
        c = (agzo)new agte(2);
        b = (agzo)new agte(1);
        a = (agzo)new agte(0);
    }
    
    private agte(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        Label_0619: {
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
                            break Label_0619;
                        }
                    }
                    break;
                }
                case 19: {
                    return n == 0 || n == 1 || n == 2;
                }
                case 18: {
                    return agot.p(n) != 0;
                }
                case 17: {
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
                        case 11: {
                            return true;
                        }
                    }
                    break;
                }
                case 15: {
                    return agot.q(n) != 0;
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
                        case 8: {
                            return true;
                        }
                    }
                    break;
                }
                case 13: {
                    return agua.a(n) != null;
                }
                case 12: {
                    return agtz.a(n) != 0;
                }
                case 11: {
                    return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
                }
                case 10: {
                    return agtv.a(n) != null;
                }
                case 9: {
                    return agtr.a(n) != 0;
                }
                case 8: {
                    return n == 0 || n == 1 || n == 2;
                }
                case 7: {
                    return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
                }
                case 6: {
                    return n == 0 || n == 1 || n == 2;
                }
                case 5: {
                    return agtn.a(n) != null;
                }
                case 4: {
                    return agot.r(n) != 0;
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
                        case 6: {
                            return true;
                        }
                    }
                    break;
                }
                case 2: {
                    return agtj.a(n) != null;
                }
                case 1: {
                    return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
                }
                case 0: {
                    if (n != 0 && n != 1 && n != 2) {
                        return false;
                    }
                    break;
                }
            }
        }
        return true;
    }
}
