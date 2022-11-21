// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgj implements ahdf
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
    static final ahdf m;
    static final ahdf n;
    static final ahdf o;
    static final ahdf p;
    public static final ahdf q;
    static final ahdf r;
    static final ahdf s;
    static final ahdf t;
    static final ahdf u;
    private final int v;
    
    static {
        u = (ahdf)new ajgj(20);
        t = (ahdf)new ajgj(19);
        s = (ahdf)new ajgj(18);
        r = (ahdf)new ajgj(17);
        q = (ahdf)new ajgj(16);
        p = (ahdf)new ajgj(15);
        o = (ahdf)new ajgj(14);
        n = (ahdf)new ajgj(13);
        m = (ahdf)new ajgj(12);
        l = (ahdf)new ajgj(11);
        k = (ahdf)new ajgj(10);
        j = (ahdf)new ajgj(9);
        i = (ahdf)new ajgj(8);
        h = (ahdf)new ajgj(7);
        g = (ahdf)new ajgj(6);
        f = (ahdf)new ajgj(5);
        e = (ahdf)new ajgj(4);
        d = (ahdf)new ajgj(3);
        c = (ahdf)new ajgj(2);
        b = (ahdf)new ajgj(1);
        a = (ahdf)new ajgj(0);
    }
    
    private ajgj(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aexq.al(n) != 0) {
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
                return aexq.am(n) != 0;
            }
            case 16: {
                return aexq.an(n) != 0;
            }
            case 15: {
                return aexq.ao(n) != 0;
            }
            case 14: {
                return ajjo.b(n) != null;
            }
            case 13: {
                return aexq.ap(n) != 0;
            }
            case 12: {
                return n == 0 || n == 1;
            }
            case 11: {
                return aexq.aq(n) != 0;
            }
            case 10: {
                return ajji.b(n) != null;
            }
            case 9: {
                return aexq.ar(n) != 0;
            }
            case 8: {
                return aexq.as(n) != 0;
            }
            case 7: {
                return ajii.b(n) != null;
            }
            case 6: {
                return n == 0 || n == 1 || n == 2;
            }
            case 5: {
                return n == 0 || n == 1 || n == 2;
            }
            case 4: {
                return ajhi.b(n) != null;
            }
            case 3: {
                return aexq.at(n) != 0;
            }
            case 2: {
                return aexq.au(n) != 0;
            }
            case 1: {
                return ajfx.b(n) != null;
            }
            case 0: {
                if (ajgk.b(n) != null) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
