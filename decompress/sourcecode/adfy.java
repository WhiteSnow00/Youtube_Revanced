import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adfy
{
    private final aeyr A;
    public final qqu a;
    public final qqt b;
    public final aeyr c;
    public final aeyr d;
    public final aeyr e;
    public final aeyr f;
    public final aeyr g;
    public final aeyr h;
    public final aeyr i;
    public final aeyr j;
    public final aeyr k;
    public final aeyr l;
    public final aeyr m;
    public final aeyr n;
    public final aeyr o;
    public final aeyr p;
    public final aeyr q;
    public final aeyr r;
    private final aeyr s;
    private final aeyr t;
    private final aeyr u;
    private final aeyr v;
    private final aeyr w;
    private final aeyr x;
    private final aeyr y;
    private final aeyr z;
    
    public adfy(final ScheduledExecutorService scheduledExecutorService, final qqv b) {
        agnj.E((aeyr)new ysm(this, 20));
        this.c = agnj.E((aeyr)new adfw(this, 0));
        this.d = agnj.E((aeyr)new adfw(this, 13));
        this.e = agnj.E((aeyr)new adfw(this, 20));
        this.f = agnj.E((aeyr)new adfx(this, 0));
        agnj.E((aeyr)new adfx(this, 2));
        agnj.E((aeyr)new adfx(this, 3));
        this.s = agnj.E((aeyr)new adfx(this, 4));
        this.t = agnj.E((aeyr)new adfx(this, 5));
        agnj.E((aeyr)new adfx(this, 6));
        this.g = agnj.E((aeyr)new adfw(this, 10));
        agnj.E((aeyr)new adfx(this, 1));
        agnj.E((aeyr)new adfx(this, 7));
        this.u = agnj.E((aeyr)new adfx(this, 8));
        this.h = agnj.E((aeyr)new adfx(this, 9));
        this.i = agnj.E((aeyr)new adfx(this, 10));
        this.j = agnj.E((aeyr)new adfx(this, 11));
        this.k = agnj.E((aeyr)new adfx(this, 12));
        this.l = agnj.E((aeyr)new adfx(this, 13));
        this.m = agnj.E((aeyr)new adfw(this, 1));
        this.n = agnj.E((aeyr)new adfw(this, 2));
        this.o = agnj.E((aeyr)new adfw(this, 3));
        this.p = agnj.E((aeyr)new adfw(this, 4));
        this.v = agnj.E((aeyr)new adfw(this, 5));
        this.w = agnj.E((aeyr)new adfw(this, 6));
        this.q = agnj.E((aeyr)new adfw(this, 7));
        this.r = agnj.E((aeyr)new adfw(this, 8));
        this.x = agnj.E((aeyr)new adfw(this, 9));
        agnj.E((aeyr)new adfw(this, 11));
        agnj.E((aeyr)new adfw(this, 12));
        agnj.E((aeyr)new adfw(this, 14));
        agnj.E((aeyr)new adfw(this, 15));
        agnj.E((aeyr)new adfw(this, 16));
        this.y = agnj.E((aeyr)new adfw(this, 17));
        this.z = agnj.E((aeyr)new adfw(this, 18));
        this.A = agnj.E((aeyr)new adfw(this, 19));
        final qqu d = qqu.d("youtube_android");
        this.a = d;
        final qqt a = d.a;
        if (a == null) {
            this.b = (qqt)qqx.a(b, scheduledExecutorService, d, (Application)null);
            return;
        }
        this.b = a;
        ((qqx)a).b = b;
    }
    
    public final void a(final boolean b, final String s) {
        ((qqq)this.t.a()).b(new Object[] { b, s });
    }
    
    public final void b(final String s) {
        ((qqq)this.x.a()).b(new Object[] { s });
    }
    
    public final void c(final String s) {
        ((qqq)this.A.a()).b(new Object[] { s });
    }
    
    public final void d(final String s) {
        ((qqq)this.y.a()).b(new Object[] { s });
    }
    
    public final void e(final String s, final String s2, final boolean b) {
        ((qqq)this.s.a()).b(new Object[] { s, s2, b });
    }
    
    public final void f(final String s, final String s2) {
        ((qqq)this.u.a()).b(new Object[] { s, s2 });
    }
    
    public final void g(final String s) {
        ((qqq)this.v.a()).b(new Object[] { s });
    }
    
    public final void h(final String s) {
        ((qqq)this.w.a()).b(new Object[] { s });
    }
    
    public final void i(final double n, final String s) {
        ((qqn)this.z.a()).b(n, new Object[] { s });
    }
    
    public final void j(final boolean e) {
        final qqx qqx = (qqx)this.b;
        if (!(qqx.e = e)) {
            qqx.b();
        }
    }
}
