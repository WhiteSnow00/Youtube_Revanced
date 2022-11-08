// 
// Decompiled by Procyon v0.6.0
// 

public final class ahng implements agzo
{
    public static final agzo a;
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
    static final agzo o;
    static final agzo p;
    static final agzo q;
    static final agzo r;
    public static final agzo s;
    static final agzo t;
    static final agzo u;
    private final /* synthetic */ int v;
    
    static {
        u = (agzo)new ahng(20);
        t = (agzo)new ahng(19);
        s = (agzo)new ahng(18);
        r = (agzo)new ahng(17);
        q = (agzo)new ahng(16);
        p = (agzo)new ahng(15);
        o = (agzo)new ahng(14);
        n = (agzo)new ahng(13);
        m = (agzo)new ahng(12);
        l = (agzo)new ahng(11);
        k = (agzo)new ahng(10);
        j = (agzo)new ahng(9);
        i = (agzo)new ahng(8);
        h = (agzo)new ahng(7);
        g = (agzo)new ahng(6);
        f = (agzo)new ahng(5);
        e = (agzo)new ahng(4);
        d = (agzo)new ahng(3);
        c = (agzo)new ahng(2);
        b = (agzo)new ahng(1);
        a = (agzo)new ahng(0);
    }
    
    private ahng(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (ahrs.b(n) != null) {
                    return true;
                }
                break;
            }
            case 19: {
                return ahrh.b(n) != null;
            }
            case 18: {
                return aeda.G(n) != 0;
            }
            case 17: {
                return ahrg.b(n) != null;
            }
            case 16: {
                return n == 0 || n == 2;
            }
            case 15: {
                return aeda.H(n) != 0;
            }
            case 14: {
                return aeda.I(n) != 0;
            }
            case 13: {
                return aeda.J(n) != 0;
            }
            case 12: {
                return ahqp.b(n) != null;
            }
            case 11: {
                return aeda.K(n) != 0;
            }
            case 10: {
                return aeda.L(n) != 0;
            }
            case 9: {
                return aeda.M(n) != 0;
            }
            case 8: {
                return ahpu.b(n) != null;
            }
            case 7: {
                return aeda.N(n) != 0;
            }
            case 6: {
                return aeda.O(n) != 0;
            }
            case 5: {
                return aeda.P(n) != 0;
            }
            case 4: {
                return ahnj.b(n) != null;
            }
            case 3: {
                return ahni.b(n) != null;
            }
            case 2: {
                return ahnh.b(n) != null;
            }
            case 1: {
                return ahnf.b(n) != null;
            }
            case 0: {
                if (aeda.Q(n) != 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
