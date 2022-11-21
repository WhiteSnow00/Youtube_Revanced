// 
// Decompiled by Procyon v0.6.0
// 

public final class aiga implements ahdf
{
    public static final ahdf a;
    static final ahdf b;
    static final ahdf c;
    static final ahdf d;
    static final ahdf e;
    static final ahdf f;
    public static final ahdf g;
    static final ahdf h;
    static final ahdf i;
    static final ahdf j;
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
        u = (ahdf)new aiga(20);
        t = (ahdf)new aiga(19);
        s = (ahdf)new aiga(18);
        r = (ahdf)new aiga(17);
        q = (ahdf)new aiga(16);
        p = (ahdf)new aiga(15);
        o = (ahdf)new aiga(14);
        n = (ahdf)new aiga(13);
        m = (ahdf)new aiga(12);
        l = (ahdf)new aiga(11);
        k = (ahdf)new aiga(10);
        j = (ahdf)new aiga(9);
        i = (ahdf)new aiga(8);
        h = (ahdf)new aiga(7);
        g = (ahdf)new aiga(6);
        f = (ahdf)new aiga(5);
        e = (ahdf)new aiga(4);
        d = (ahdf)new aiga(3);
        c = (ahdf)new aiga(2);
        b = (ahdf)new aiga(1);
        a = (ahdf)new aiga(0);
    }
    
    private aiga(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (ainb.b(n) != null) {
                    return true;
                }
                break;
            }
            case 19: {
                return aewr.ak(n) != 0;
            }
            case 18: {
                return aims.b(n) != null;
            }
            case 17: {
                return aiml.b(n) != null;
            }
            case 16: {
                return aewr.al(n) != 0;
            }
            case 15: {
                return aewr.am(n) != 0;
            }
            case 14: {
                return aewr.an(n) != 0;
            }
            case 13: {
                return aijx.b(n) != null;
            }
            case 12: {
                return aewr.ao(n) != 0;
            }
            case 11: {
                return aewr.ap(n) != 0;
            }
            case 10: {
                return aewr.aq(n) != 0;
            }
            case 9: {
                return aewr.ar(n) != 0;
            }
            case 8: {
                return aewr.as(n) != 0;
            }
            case 7: {
                return aiiu.b(n) != null;
            }
            case 6: {
                return aegu.O(n) != 0;
            }
            case 5: {
                return aegu.P(n) != 0;
            }
            case 4: {
                return aegu.Q(n) != 0;
            }
            case 3: {
                return aegu.R(n) != 0;
            }
            case 2: {
                return aigg.b(n) != null;
            }
            case 1: {
                return aegu.T(n) != 0;
            }
            case 0: {
                if (aegu.S(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
