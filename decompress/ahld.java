// 
// Decompiled by Procyon v0.6.0
// 

public final class ahld implements ahdf
{
    static final ahdf a;
    static final ahdf b;
    static final ahdf c;
    static final ahdf d;
    static final ahdf e;
    static final ahdf f;
    static final ahdf g;
    static final ahdf h;
    static final ahdf i;
    static final ahdf j;
    static final ahdf k;
    static final ahdf l;
    public static final ahdf m;
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
        u = (ahdf)new ahld(20);
        t = (ahdf)new ahld(19);
        s = (ahdf)new ahld(18);
        r = (ahdf)new ahld(17);
        q = (ahdf)new ahld(16);
        p = (ahdf)new ahld(15);
        o = (ahdf)new ahld(14);
        n = (ahdf)new ahld(13);
        m = (ahdf)new ahld(12);
        l = (ahdf)new ahld(11);
        k = (ahdf)new ahld(10);
        j = (ahdf)new ahld(9);
        i = (ahdf)new ahld(8);
        h = (ahdf)new ahld(7);
        g = (ahdf)new ahld(6);
        f = (ahdf)new ahld(5);
        e = (ahdf)new ahld(4);
        d = (ahdf)new ahld(3);
        c = (ahdf)new ahld(2);
        b = (ahdf)new ahld(1);
        a = (ahdf)new ahld(0);
    }
    
    private ahld(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                return ahqt.b(n) != null;
            }
            case 19: {
                return ahqs.b(n) != null;
            }
            case 18: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 17: {
                return ahqr.b(n) != null;
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
                    case 14: {
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
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 97:
                    case 98:
                    case 99:
                    case 100: {
                        return true;
                    }
                }
                break;
            }
            case 14: {
                return adzw.aa(n) != 0;
            }
            case 13: {
                return ahps.b(n) != null;
            }
            case 12: {
                return adzw.ab(n) != 0;
            }
            case 11: {
                return adzw.ac(n) != 0;
            }
            case 10: {
                return adzw.ad(n) != 0;
            }
            case 9: {
                return adzw.ae(n) != 0;
            }
            case 8: {
                return adzw.af(n) != 0;
            }
            case 7: {
                return adzw.ag(n) != 0;
            }
            case 6: {
                return adzw.ah(n) != 0;
            }
            case 5: {
                return adzw.aj(n) != 0;
            }
            case 4: {
                return adzw.ak(n) != 0;
            }
            case 3: {
                return ahlw.b(n) != null;
            }
            case 2: {
                return n == 0 || n == 1 || n == 2;
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
                    case 30: {
                        return true;
                    }
                }
                break;
            }
            case 0: {
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
                    case 29: {
                        return true;
                    }
                }
                break;
            }
        }
    }
}
