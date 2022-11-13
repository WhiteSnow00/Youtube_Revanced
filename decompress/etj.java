import com.google.android.apps.youtube.app.datasaving.DefaultNetworkDataUsageMonitor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etj implements tes
{
    public static final etj a;
    public static final etj b;
    public static final etj c;
    public static final etj d;
    public static final etj e;
    public static final etj f;
    public static final etj g;
    public static final etj h;
    public static final etj i;
    public static final etj j;
    public static final etj k;
    public static final etj l;
    public static final etj m;
    public static final etj n;
    public static final etj o;
    public static final etj p;
    public static final etj q;
    public static final etj r;
    public static final etj s;
    public static final etj t;
    private final int u;
    
    static {
        t = new etj(20);
        s = new etj(19);
        r = new etj(18);
        q = new etj(17);
        p = new etj(16);
        o = new etj(15);
        n = new etj(14);
        m = new etj(13);
        l = new etj(12);
        k = new etj(11);
        j = new etj(10);
        i = new etj(9);
        h = new etj(8);
        g = new etj(7);
        f = new etj(6);
        e = new etj(5);
        d = new etj(4);
        c = new etj(3);
        b = new etj(1);
        a = new etj(0);
    }
    
    public etj(final int u) {
        this.u = u;
    }
    
    public final void a(final Object o) {
        switch (this.u) {
            default: {
                DefaultNetworkDataUsageMonitor.l((Throwable)o);
                return;
            }
            case 19: {
                gkz.i((Throwable)o);
                return;
            }
            case 18: {
                gkz.h((Throwable)o);
                return;
            }
            case 17: {
                gkz.g((Throwable)o);
                return;
            }
            case 16: {
                gkz.j((Throwable)o);
                return;
            }
            case 15: {
                fvu.a((Throwable)o);
                return;
            }
            case 14: {
                final Throwable t = (Throwable)o;
                bhv.w();
                return;
            }
            case 13: {
                final Throwable t2 = (Throwable)o;
                bhv.y();
                return;
            }
            case 12: {
                final Throwable t3 = (Throwable)o;
                bhv.x();
                return;
            }
            case 11: {
                flb.b((Throwable)o);
                return;
            }
            case 10: {
                ezt.b((Throwable)o);
                return;
            }
            case 9: {
                fdz.b((Throwable)o);
                return;
            }
            case 8: {
                acbc.c((Throwable)o);
                return;
            }
            case 7: {
                acbc.b((Throwable)o);
                return;
            }
            case 6: {
                fdj.b((Throwable)o);
                return;
            }
            case 5: {
                final Throwable t4 = (Throwable)o;
                return;
            }
            case 4: {
                final Throwable t5 = (Throwable)o;
                fca.b();
                return;
            }
            case 3: {
                fbn.f((Throwable)o);
                return;
            }
            case 2: {
                this.b((Throwable)o);
                return;
            }
            case 1: {
                final Throwable t6 = (Throwable)o;
                esm.i();
                return;
            }
            case 0: {
                etk.b((Throwable)o);
            }
        }
    }
    
    public final void b(final Throwable t) {
        switch (this.u) {
            default: {
                DefaultNetworkDataUsageMonitor.l(t);
                return;
            }
            case 19: {
                gkz.i(t);
                return;
            }
            case 18: {
                gkz.h(t);
                return;
            }
            case 17: {
                gkz.g(t);
                return;
            }
            case 16: {
                gkz.j(t);
                return;
            }
            case 15: {
                fvu.a(t);
                return;
            }
            case 14: {
                bhv.w();
                return;
            }
            case 13: {
                bhv.y();
                return;
            }
            case 12: {
                bhv.x();
                return;
            }
            case 11: {
                flb.b(t);
                return;
            }
            case 10: {
                ezt.b(t);
                return;
            }
            case 9: {
                fdz.b(t);
                return;
            }
            case 8: {
                acbc.c(t);
                return;
            }
            case 7: {
                acbc.b(t);
                return;
            }
            case 6: {
                fdj.b(t);
            }
            case 5: {
                return;
            }
            case 4: {
                fca.b();
                return;
            }
            case 3: {
                fbn.f(t);
                return;
            }
            case 2: {
                ttr.d("Failed to update bedtime reminder data to store.", t);
                return;
            }
            case 1: {
                esm.i();
                return;
            }
            case 0: {
                etk.b(t);
            }
        }
    }
}
