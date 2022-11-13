import com.google.android.apps.youtube.app.datasaving.DefaultNetworkDataUsageMonitor;
import com.google.android.apps.youtube.app.extensions.reel.util.ReelPresetTracker;
import com.google.android.apps.youtube.app.mdx.tvsignin.MdxTvFoundForSignInListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnn implements tes
{
    public static final gnn a;
    public static final gnn b;
    public static final gnn c;
    public static final gnn d;
    public static final gnn e;
    public static final gnn f;
    public static final gnn g;
    public static final gnn h;
    public static final gnn i;
    public static final gnn j;
    public static final gnn k;
    public static final gnn l;
    public static final gnn m;
    public static final gnn n;
    public static final gnn o;
    public static final gnn p;
    public static final gnn q;
    public static final gnn r;
    public static final gnn s;
    public static final gnn t;
    public static final gnn u;
    private final int v;
    
    static {
        u = new gnn(20);
        t = new gnn(19);
        s = new gnn(18);
        r = new gnn(17);
        q = new gnn(16);
        p = new gnn(15);
        o = new gnn(14);
        n = new gnn(13);
        m = new gnn(12);
        l = new gnn(11);
        k = new gnn(10);
        j = new gnn(9);
        i = new gnn(8);
        h = new gnn(7);
        g = new gnn(6);
        f = new gnn(5);
        e = new gnn(4);
        d = new gnn(3);
        c = new gnn(2);
        b = new gnn(1);
        a = new gnn(0);
    }
    
    private gnn(final int v) {
        this.v = v;
    }
    
    public final void a(final Object o) {
        switch (this.v) {
            default: {
                ieu.d((Throwable)o);
                return;
            }
            case 19: {
                ieu.f((Throwable)o);
                return;
            }
            case 18: {
                ieu.g((Throwable)o);
                return;
            }
            case 17: {
                ieu.h((Throwable)o);
                return;
            }
            case 16: {
                idl.f((Throwable)o);
                return;
            }
            case 15: {
                idl.e((Throwable)o);
                return;
            }
            case 14: {
                MdxTvFoundForSignInListener.k((Throwable)o);
                return;
            }
            case 13: {
                MdxTvFoundForSignInListener.l((Throwable)o);
                return;
            }
            case 12: {
                uza.b((Throwable)o);
                return;
            }
            case 11: {
                hsu.g((Throwable)o);
                return;
            }
            case 10: {
                final Throwable t = (Throwable)o;
                ReelPresetTracker.h();
                return;
            }
            case 9: {
                final Throwable t2 = (Throwable)o;
                hge.b();
                return;
            }
            case 8: {
                final Throwable t3 = (Throwable)o;
                hga.d();
                return;
            }
            case 7: {
                final Throwable t4 = (Throwable)o;
                hga.e();
                return;
            }
            case 6: {
                hbx.a((Throwable)o);
                return;
            }
            case 5: {
                har.f((Throwable)o);
                return;
            }
            case 4: {
                gqs.b((Throwable)o);
                return;
            }
            case 3: {
                gqs.a((Throwable)o);
                return;
            }
            case 2: {
                fcl.b((Throwable)o);
                return;
            }
            case 1: {
                DefaultNetworkDataUsageMonitor.k((Throwable)o);
                return;
            }
            case 0: {
                gnp.b((Throwable)o);
            }
        }
    }
    
    public final void b(final Throwable t) {
        switch (this.v) {
            default: {
                ieu.d(t);
                return;
            }
            case 19: {
                ieu.f(t);
                return;
            }
            case 18: {
                ieu.g(t);
                return;
            }
            case 17: {
                ieu.h(t);
                return;
            }
            case 16: {
                idl.f(t);
                return;
            }
            case 15: {
                idl.e(t);
                return;
            }
            case 14: {
                MdxTvFoundForSignInListener.k(t);
                return;
            }
            case 13: {
                MdxTvFoundForSignInListener.l(t);
                return;
            }
            case 12: {
                uza.b(t);
                return;
            }
            case 11: {
                hsu.g(t);
                return;
            }
            case 10: {
                ReelPresetTracker.h();
                return;
            }
            case 9: {
                hge.b();
                return;
            }
            case 8: {
                hga.d();
                return;
            }
            case 7: {
                hga.e();
                return;
            }
            case 6: {
                hbx.a(t);
                return;
            }
            case 5: {
                har.f(t);
                return;
            }
            case 4: {
                gqs.b(t);
                return;
            }
            case 3: {
                gqs.a(t);
                return;
            }
            case 2: {
                fcl.b(t);
                return;
            }
            case 1: {
                DefaultNetworkDataUsageMonitor.k(t);
                return;
            }
            case 0: {
                gnp.b(t);
            }
        }
    }
}
