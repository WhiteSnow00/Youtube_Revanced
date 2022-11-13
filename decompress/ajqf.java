// 
// Decompiled by Procyon v0.6.0
// 

public final class ajqf implements ahbn
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
    public static final ahbn s;
    static final ahbn t;
    static final ahbn u;
    private final int v;
    
    static {
        u = (ahbn)new ajqf(20);
        t = (ahbn)new ajqf(19);
        s = (ahbn)new ajqf(18);
        r = (ahbn)new ajqf(17);
        q = (ahbn)new ajqf(16);
        p = (ahbn)new ajqf(15);
        o = (ahbn)new ajqf(14);
        n = (ahbn)new ajqf(13);
        m = (ahbn)new ajqf(12);
        l = (ahbn)new ajqf(11);
        k = (ahbn)new ajqf(10);
        j = (ahbn)new ajqf(9);
        i = (ahbn)new ajqf(8);
        h = (ahbn)new ajqf(7);
        g = (ahbn)new ajqf(6);
        f = (ahbn)new ajqf(5);
        e = (ahbn)new ajqf(4);
        d = (ahbn)new ajqf(3);
        c = (ahbn)new ajqf(2);
        b = (ahbn)new ajqf(1);
        a = (ahbn)new ajqf(0);
    }
    
    private ajqf(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
            }
            case 19: {
                return n == 0 || n == 1 || n == 2;
            }
            case 18: {
                return adyf.cd(n) != 0;
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
                    case 7: {
                        return true;
                    }
                }
                break;
            }
            case 16: {
                return adyf.ce(n) != 0;
            }
            case 15: {
                return adyf.cf(n) != 0;
            }
            case 14: {
                return adyf.cg(n) != 0;
            }
            case 13: {
                return aevy.ag(n) != 0;
            }
            case 12: {
                return ajrb.b(n) != null;
            }
            case 11: {
                return ajqz.b(n) != null;
            }
            case 10: {
                return ajqy.b(n) != null;
            }
            case 9: {
                return aevy.ah(n) != 0;
            }
            case 8: {
                return aevy.ai(n) != 0;
            }
            case 7: {
                return aevy.aj(n) != 0;
            }
            case 6: {
                return n == 0 || n == 1 || n == 2;
            }
            case 5: {
                return n == 0 || n == 1 || n == 2;
            }
            case 4: {
                return ajqi.b(n) != null;
            }
            case 3: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 2: {
                return aevy.ak(n) != 0;
            }
            case 1: {
                return aevy.am(n) != 0;
            }
            case 0: {
                return aevy.al(n) != 0;
            }
        }
    }
}
