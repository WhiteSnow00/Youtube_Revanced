// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqv implements ahdf
{
    public static final ahdf a;
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
    static final ahdf q;
    static final ahdf r;
    public static final ahdf s;
    static final ahdf t;
    static final ahdf u;
    private final int v;
    
    static {
        u = (ahdf)new ahqv(20);
        t = (ahdf)new ahqv(19);
        s = (ahdf)new ahqv(18);
        r = (ahdf)new ahqv(17);
        q = (ahdf)new ahqv(16);
        p = (ahdf)new ahqv(15);
        o = (ahdf)new ahqv(14);
        n = (ahdf)new ahqv(13);
        m = (ahdf)new ahqv(12);
        l = (ahdf)new ahqv(11);
        k = (ahdf)new ahqv(10);
        j = (ahdf)new ahqv(9);
        i = (ahdf)new ahqv(8);
        h = (ahdf)new ahqv(7);
        g = (ahdf)new ahqv(6);
        f = (ahdf)new ahqv(5);
        e = (ahdf)new ahqv(4);
        d = (ahdf)new ahqv(3);
        c = (ahdf)new ahqv(2);
        b = (ahdf)new ahqv(1);
        a = (ahdf)new ahqv(0);
    }
    
    private ahqv(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (ahvj.b(n) != null) {
                    return true;
                }
                break;
            }
            case 19: {
                return ahuy.b(n) != null;
            }
            case 18: {
                return aegu.ar(n) != 0;
            }
            case 17: {
                return ahux.b(n) != null;
            }
            case 16: {
                return n == 0 || n == 2;
            }
            case 15: {
                return aegu.as(n) != 0;
            }
            case 14: {
                return aegu.at(n) != 0;
            }
            case 13: {
                return adzw.S(n) != 0;
            }
            case 12: {
                return ahug.b(n) != null;
            }
            case 11: {
                return adzw.T(n) != 0;
            }
            case 10: {
                return adzw.U(n) != 0;
            }
            case 9: {
                return adzw.V(n) != 0;
            }
            case 8: {
                return ahtl.b(n) != null;
            }
            case 7: {
                return adzw.W(n) != 0;
            }
            case 6: {
                return adzw.X(n) != 0;
            }
            case 5: {
                return adzw.Y(n) != 0;
            }
            case 4: {
                return ahqy.b(n) != null;
            }
            case 3: {
                return ahqx.b(n) != null;
            }
            case 2: {
                return ahqw.b(n) != null;
            }
            case 1: {
                return ahqu.b(n) != null;
            }
            case 0: {
                if (adzw.Z(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
