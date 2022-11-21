// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhs implements ahdf
{
    public static final ahdf a;
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
        u = (ahdf)new ahhs(20);
        t = (ahdf)new ahhs(19);
        s = (ahdf)new ahhs(18);
        r = (ahdf)new ahhs(17);
        q = (ahdf)new ahhs(16);
        p = (ahdf)new ahhs(15);
        o = (ahdf)new ahhs(14);
        n = (ahdf)new ahhs(13);
        m = (ahdf)new ahhs(12);
        l = (ahdf)new ahhs(11);
        k = (ahdf)new ahhs(10);
        j = (ahdf)new ahhs(9);
        i = (ahdf)new ahhs(8);
        h = (ahdf)new ahhs(7);
        g = (ahdf)new ahhs(6);
        f = (ahdf)new ahhs(5);
        e = (ahdf)new ahhs(4);
        d = (ahdf)new ahhs(3);
        c = (ahdf)new ahhs(2);
        b = (ahdf)new ahhs(1);
        a = (ahdf)new ahhs(0);
    }
    
    private ahhs(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        Label_0550: {
            switch (this.v) {
                default: {
                    switch (n) {
                        default: {
                            return false;
                        }
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9: {
                            break Label_0550;
                        }
                    }
                    break;
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
                        case 35:
                        case 36: {
                            return true;
                        }
                    }
                    break;
                }
                case 18: {
                    return ahkx.b(n) != null;
                }
                case 17: {
                    return ahkw.b(n) != null;
                }
                case 16: {
                    return ahkv.b(n) != null;
                }
                case 15: {
                    return ahke.b(n) != null;
                }
                case 14: {
                    return adzw.am(n) != 0;
                }
                case 13: {
                    return adzw.an(n) != 0;
                }
                case 12: {
                    return ahjv.b(n) != null;
                }
                case 11: {
                    return ahjk.b(n) != null;
                }
                case 10: {
                    return ahjj.b(n) != null;
                }
                case 9: {
                    return ahji.b(n) != null;
                }
                case 8: {
                    return adzw.ao(n) != 0;
                }
                case 7: {
                    return ahjh.b(n) != null;
                }
                case 6: {
                    return ahjd.b(n) != null;
                }
                case 5: {
                    return ahjc.b(n) != null;
                }
                case 4: {
                    return ahjb.b(n) != null;
                }
                case 3: {
                    return ahja.b(n) != null;
                }
                case 2: {
                    return ahii.b(n) != null;
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
