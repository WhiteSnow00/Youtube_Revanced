// 
// Decompiled by Procyon v0.6.0
// 

public final class aine implements ahdf
{
    public static final ahdf a;
    static final ahdf b;
    public static final ahdf c;
    static final ahdf d;
    static final ahdf e;
    static final ahdf f;
    static final ahdf g;
    static final ahdf h;
    static final ahdf i;
    public static final ahdf j;
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
        u = (ahdf)new aine(20);
        t = (ahdf)new aine(19);
        s = (ahdf)new aine(18);
        r = (ahdf)new aine(17);
        q = (ahdf)new aine(16);
        p = (ahdf)new aine(15);
        o = (ahdf)new aine(14);
        n = (ahdf)new aine(13);
        m = (ahdf)new aine(12);
        l = (ahdf)new aine(11);
        k = (ahdf)new aine(10);
        j = (ahdf)new aine(9);
        i = (ahdf)new aine(8);
        h = (ahdf)new aine(7);
        g = (ahdf)new aine(6);
        f = (ahdf)new aine(5);
        e = (ahdf)new aine(4);
        d = (ahdf)new aine(3);
        c = (ahdf)new aine(2);
        b = (ahdf)new aine(1);
        a = (ahdf)new aine(0);
    }
    
    private aine(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aewr.X(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return aewr.Y(n) != 0;
            }
            case 18: {
                return aewr.Z(n) != 0;
            }
            case 17: {
                return aewr.aa(n) != 0;
            }
            case 16: {
                return aitm.b(n) != null;
            }
            case 15: {
                return aewr.ab(n) != 0;
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
                    case 9:
                    case 10:
                    case 11:
                    case 12: {
                        return true;
                    }
                }
                break;
            }
            case 13: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 12: {
                return airp.b(n) != null;
            }
            case 11: {
                return airo.b(n) != null;
            }
            case 10: {
                return n == 0 || n == 1 || n == 2;
            }
            case 9: {
                return aewr.ac(n) != 0;
            }
            case 8: {
                return aewr.ad(n) != 0;
            }
            case 7: {
                return aewr.ae(n) != 0;
            }
            case 6: {
                return aewr.af(n) != 0;
            }
            case 5: {
                return ainu.b(n) != null;
            }
            case 4: {
                return aewr.ag(n) != 0;
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
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 120: {
                        return true;
                    }
                }
                break;
            }
            case 2: {
                return aewr.ah(n) != 0;
            }
            case 1: {
                return aewr.aj(n) != 0;
            }
            case 0: {
                if (aewr.ai(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
