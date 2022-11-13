// 
// Decompiled by Procyon v0.6.0
// 

public final class fua implements asjm
{
    public static final fua a;
    public static final fua b;
    public static final fua c;
    public static final fua d;
    public static final fua e;
    public static final fua f;
    public static final fua g;
    public static final fua h;
    public static final fua i;
    public static final fua j;
    public static final fua k;
    public static final fua l;
    public static final fua m;
    public static final fua n;
    public static final fua o;
    public static final fua p;
    public static final fua q;
    public static final fua r;
    public static final fua s;
    public static final fua t;
    public static final fua u;
    private final int v;
    
    static {
        u = new fua(20);
        t = new fua(19);
        s = new fua(18);
        r = new fua(17);
        q = new fua(16);
        p = new fua(15);
        o = new fua(14);
        n = new fua(13);
        m = new fua(12);
        l = new fua(11);
        k = new fua(10);
        j = new fua(9);
        i = new fua(8);
        h = new fua(7);
        g = new fua(6);
        f = new fua(5);
        e = new fua(4);
        d = new fua(3);
        c = new fua(2);
        b = new fua(1);
        a = new fua(0);
    }
    
    private fua(final int v) {
        this.v = v;
    }
    
    @Override
    public final void a(final Object o) {
        switch (this.v) {
            default: {
                ttr.d("Error parsing bytes for updated ReelWatchEndpoint.", (Throwable)o);
                return;
            }
            case 19: {
                vdh.aX((Throwable)o);
                return;
            }
            case 18: {
                vdh.aX((Throwable)o);
                return;
            }
            case 17: {
                vdh.aX((Throwable)o);
                return;
            }
            case 16: {
                vdh.aX((Throwable)o);
                return;
            }
            case 15: {
                vdh.aX((Throwable)o);
                return;
            }
            case 14: {
                vdh.aX((Throwable)o);
                return;
            }
            case 13: {
                vdh.aX((Throwable)o);
                return;
            }
            case 12: {
                zlm.c(zll.b, zlk.y, "PageMonitor failed unexpectedly while receiving an RX event.", (Throwable)o);
                return;
            }
            case 11: {
                vdh.aX((Throwable)o);
                return;
            }
            case 10: {
                vdh.aX((Throwable)o);
                return;
            }
            case 9: {
                throw (IllegalStateException)o;
            }
            case 8: {
                throw (IllegalStateException)o;
            }
            case 7: {
                throw (IllegalStateException)o;
            }
            case 6: {
                vdh.aX((Throwable)o);
                return;
            }
            case 5: {
                vdh.aX((Throwable)o);
                return;
            }
            case 4: {
                vdh.aX((Throwable)o);
                return;
            }
            case 3: {
                vdh.aX((Throwable)o);
                return;
            }
            case 2: {
                vdh.aX((Throwable)o);
                return;
            }
            case 1: {
                vdh.aX((Throwable)o);
                return;
            }
            case 0: {
                ttr.d("Error processing chip selection state changes.", (Throwable)o);
            }
        }
    }
}
