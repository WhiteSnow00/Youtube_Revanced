import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adia
{
    private final afaq A;
    public final qse a;
    public final qsd b;
    public final afaq c;
    public final afaq d;
    public final afaq e;
    public final afaq f;
    public final afaq g;
    public final afaq h;
    public final afaq i;
    public final afaq j;
    public final afaq k;
    public final afaq l;
    public final afaq m;
    public final afaq n;
    public final afaq o;
    public final afaq p;
    public final afaq q;
    public final afaq r;
    private final afaq s;
    private final afaq t;
    private final afaq u;
    private final afaq v;
    private final afaq w;
    private final afaq x;
    private final afaq y;
    private final afaq z;
    
    public adia(final ScheduledExecutorService scheduledExecutorService, final qsf b) {
        adyf.A((afaq)new yuk(this, 20));
        this.c = adyf.A((afaq)new adhy(this, 0));
        this.d = adyf.A((afaq)new adhy(this, 13));
        this.e = adyf.A((afaq)new adhy(this, 20));
        this.f = adyf.A((afaq)new adhz(this, 0));
        adyf.A((afaq)new adhz(this, 2));
        adyf.A((afaq)new adhz(this, 3));
        this.s = adyf.A((afaq)new adhz(this, 4));
        this.t = adyf.A((afaq)new adhz(this, 5));
        adyf.A((afaq)new adhz(this, 6));
        this.g = adyf.A((afaq)new adhy(this, 10));
        adyf.A((afaq)new adhz(this, 1));
        adyf.A((afaq)new adhz(this, 7));
        this.u = adyf.A((afaq)new adhz(this, 8));
        this.h = adyf.A((afaq)new adhz(this, 9));
        this.i = adyf.A((afaq)new adhz(this, 10));
        this.j = adyf.A((afaq)new adhz(this, 11));
        this.k = adyf.A((afaq)new adhz(this, 12));
        this.l = adyf.A((afaq)new adhz(this, 13));
        this.m = adyf.A((afaq)new adhy(this, 1));
        this.n = adyf.A((afaq)new adhy(this, 2));
        this.o = adyf.A((afaq)new adhy(this, 3));
        this.p = adyf.A((afaq)new adhy(this, 4));
        this.v = adyf.A((afaq)new adhy(this, 5));
        this.w = adyf.A((afaq)new adhy(this, 6));
        this.q = adyf.A((afaq)new adhy(this, 7));
        this.r = adyf.A((afaq)new adhy(this, 8));
        this.x = adyf.A((afaq)new adhy(this, 9));
        adyf.A((afaq)new adhy(this, 11));
        adyf.A((afaq)new adhy(this, 12));
        adyf.A((afaq)new adhy(this, 14));
        adyf.A((afaq)new adhy(this, 15));
        adyf.A((afaq)new adhy(this, 16));
        this.y = adyf.A((afaq)new adhy(this, 17));
        this.z = adyf.A((afaq)new adhy(this, 18));
        this.A = adyf.A((afaq)new adhy(this, 19));
        final qse d = qse.d("youtube_android");
        this.a = d;
        final qsd a = d.a;
        if (a == null) {
            this.b = (qsd)qsh.a(b, scheduledExecutorService, d, (Application)null);
            return;
        }
        this.b = a;
        ((qsh)a).b = b;
    }
    
    public final void a(final boolean b, final String s) {
        ((qsa)this.t.a()).b(new Object[] { b, s });
    }
    
    public final void b(final String s) {
        ((qsa)this.x.a()).b(new Object[] { s });
    }
    
    public final void c(final String s) {
        ((qsa)this.A.a()).b(new Object[] { s });
    }
    
    public final void d(final String s) {
        ((qsa)this.y.a()).b(new Object[] { s });
    }
    
    public final void e(final String s, final String s2, final boolean b) {
        ((qsa)this.s.a()).b(new Object[] { s, s2, b });
    }
    
    public final void f(final String s, final String s2) {
        ((qsa)this.u.a()).b(new Object[] { s, s2 });
    }
    
    public final void g(final String s) {
        ((qsa)this.v.a()).b(new Object[] { s });
    }
    
    public final void h(final String s) {
        ((qsa)this.w.a()).b(new Object[] { s });
    }
    
    public final void i(final double n, final String s) {
        ((qrx)this.z.a()).b(n, new Object[] { s });
    }
    
    public final void j(final boolean e) {
        final qsh qsh = (qsh)this.b;
        if (!(qsh.e = e)) {
            qsh.b();
        }
    }
}
