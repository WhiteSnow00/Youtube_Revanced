// 
// Decompiled by Procyon v0.6.0
// 

final class ajmw implements ahbn
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
        u = (ahbn)new ajmw(20);
        t = (ahbn)new ajmw(19);
        s = (ahbn)new ajmw(18);
        r = (ahbn)new ajmw(17);
        q = (ahbn)new ajmw(16);
        p = (ahbn)new ajmw(15);
        o = (ahbn)new ajmw(14);
        n = (ahbn)new ajmw(13);
        m = (ahbn)new ajmw(12);
        l = (ahbn)new ajmw(11);
        k = (ahbn)new ajmw(10);
        j = (ahbn)new ajmw(9);
        i = (ahbn)new ajmw(8);
        h = (ahbn)new ajmw(7);
        g = (ahbn)new ajmw(6);
        f = (ahbn)new ajmw(5);
        e = (ahbn)new ajmw(4);
        d = (ahbn)new ajmw(3);
        c = (ahbn)new ajmw(2);
        b = (ahbn)new ajmw(1);
        a = (ahbn)new ajmw(0);
    }
    
    private ajmw(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                return aevy.an(n) != 0;
            }
            case 19: {
                return n == 0 || n == 1 || n == 2;
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
                    case 10: {
                        return true;
                    }
                }
                break;
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
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10: {
                        return true;
                    }
                }
                break;
            }
            case 16: {
                return ajpk.b(n) != null;
            }
            case 15: {
                return aevy.ao(n) != 0;
            }
            case 14: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 13: {
                return aevy.ap(n) != 0;
            }
            case 12: {
                return ajpj.b(n) != null;
            }
            case 11: {
                return aevy.aq(n) != 0;
            }
            case 10: {
                return aevy.ar(n) != 0;
            }
            case 9: {
                return ajpi.b(n) != null;
            }
            case 8: {
                return aevy.as(n) != 0;
            }
            case 7: {
                return aevy.at(n) != 0;
            }
            case 6: {
                return aevy.au(n) != 0;
            }
            case 5: {
                return aevy.av(n) != 0;
            }
            case 4: {
                return ajnn.b(n) != null;
            }
            case 3: {
                return ajnm.b(n) != null;
            }
            case 2: {
                return aevy.aw(n) != 0;
            }
            case 1: {
                return aevy.ax(n) != 0;
            }
            case 0: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
        }
    }
}
