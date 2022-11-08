// 
// Decompiled by Procyon v0.6.0
// 

public final class agvo implements agzo
{
    static final agzo a;
    static final agzo b;
    public static final agzo c;
    public static final agzo d;
    public static final agzo e;
    public static final agzo f;
    public static final agzo g;
    public static final agzo h;
    public static final agzo i;
    public static final agzo j;
    public static final agzo k;
    public static final agzo l;
    public static final agzo m;
    public static final agzo n;
    public static final agzo o;
    public static final agzo p;
    public static final agzo q;
    public static final agzo r;
    public static final agzo s;
    public static final agzo t;
    public static final agzo u;
    private final /* synthetic */ int v;
    
    static {
        u = (agzo)new agvo(20);
        t = (agzo)new agvo(19);
        s = (agzo)new agvo(18);
        r = (agzo)new agvo(17);
        q = (agzo)new agvo(16);
        p = (agzo)new agvo(15);
        o = (agzo)new agvo(14);
        n = (agzo)new agvo(13);
        m = (agzo)new agvo(12);
        l = (agzo)new agvo(11);
        k = (agzo)new agvo(10);
        j = (agzo)new agvo(9);
        i = (agzo)new agvo(8);
        h = (agzo)new agvo(7);
        g = (agzo)new agvo(6);
        f = (agzo)new agvo(5);
        e = (agzo)new agvo(4);
        d = (agzo)new agvo(3);
        c = (agzo)new agvo(2);
        b = (agzo)new agvo(1);
        a = (agzo)new agvo(0);
    }
    
    private agvo(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                return aheb.b(n) != null;
            }
            case 19: {
                return ahdz.b(n) != null;
            }
            case 18: {
                return aeda.ag(n) != 0;
            }
            case 17: {
                return aeda.ai(n) != 0;
            }
            case 16: {
                return ahdk.a(n) != 0;
            }
            case 15: {
                return ahdg.a(n) != 0;
            }
            case 14: {
                return ahbz.S(n) != 0;
            }
            case 13: {
                return ahbz.V(n) != 0;
            }
            case 12: {
                return ahbz.W(n) != 0;
            }
            case 11: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 10: {
                return agwm.a(n) != null;
            }
            case 9: {
                return ahbz.X(n) != 0;
            }
            case 8: {
                return agwe.a(n) != null;
            }
            case 7: {
                return ahbz.aa(n) != 0;
            }
            case 6: {
                return ahbz.ad(n) != 0;
            }
            case 5: {
                return agot.l(n) != 0;
            }
            case 4: {
                return agot.m(n) != 0;
            }
            case 3: {
                return agot.n(n) != 0;
            }
            case 2: {
                return agot.o(n) != 0;
            }
            case 1: {
                return n == 0 || n == 1 || n == 2;
            }
            case 0: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5;
            }
        }
    }
}
