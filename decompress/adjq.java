import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjq
{
    private final afci A;
    public final qsw a;
    public final qsv b;
    public final afci c;
    public final afci d;
    public final afci e;
    public final afci f;
    public final afci g;
    public final afci h;
    public final afci i;
    public final afci j;
    public final afci k;
    public final afci l;
    public final afci m;
    public final afci n;
    public final afci o;
    public final afci p;
    public final afci q;
    public final afci r;
    private final afci s;
    private final afci t;
    private final afci u;
    private final afci v;
    private final afci w;
    private final afci x;
    private final afci y;
    private final afci z;
    
    public adjq(final ScheduledExecutorService scheduledExecutorService, final qsx b) {
        adzw.M((afci)new yyl(this, 19));
        this.c = adzw.M((afci)new adjo(this, 1));
        this.d = adzw.M((afci)new adjo(this, 12));
        this.e = adzw.M((afci)new adjo(this, 19));
        this.f = adzw.M((afci)new adjp(this, 1));
        adzw.M((afci)new adjp(this, 0));
        adzw.M((afci)new adjp(this, 2));
        this.s = adzw.M((afci)new adjp(this, 3));
        this.t = adzw.M((afci)new adjp(this, 4));
        adzw.M((afci)new adjp(this, 5));
        this.g = adzw.M((afci)new adjo(this, 9));
        adzw.M((afci)new adjo(this, 20));
        adzw.M((afci)new adjp(this, 6));
        this.u = adzw.M((afci)new adjp(this, 7));
        this.h = adzw.M((afci)new adjp(this, 8));
        this.i = adzw.M((afci)new adjp(this, 9));
        this.j = adzw.M((afci)new adjp(this, 10));
        this.k = adzw.M((afci)new adjp(this, 11));
        this.l = adzw.M((afci)new adjp(this, 12));
        this.m = adzw.M((afci)new yyl(this, 20));
        this.n = adzw.M((afci)new adjo(this, 0));
        this.o = adzw.M((afci)new adjo(this, 2));
        this.p = adzw.M((afci)new adjo(this, 3));
        this.v = adzw.M((afci)new adjo(this, 4));
        this.w = adzw.M((afci)new adjo(this, 5));
        this.q = adzw.M((afci)new adjo(this, 6));
        this.r = adzw.M((afci)new adjo(this, 7));
        this.x = adzw.M((afci)new adjo(this, 8));
        adzw.M((afci)new adjo(this, 10));
        adzw.M((afci)new adjo(this, 11));
        adzw.M((afci)new adjo(this, 13));
        adzw.M((afci)new adjo(this, 14));
        adzw.M((afci)new adjo(this, 15));
        this.y = adzw.M((afci)new adjo(this, 16));
        this.z = adzw.M((afci)new adjo(this, 17));
        this.A = adzw.M((afci)new adjo(this, 18));
        final qsw d = qsw.d("youtube_android");
        this.a = d;
        final qsv a = d.a;
        if (a == null) {
            this.b = (qsv)qsz.a(b, scheduledExecutorService, d, (Application)null);
            return;
        }
        this.b = a;
        ((qsz)a).b = b;
    }
    
    public final void a(final boolean b, final String s) {
        ((qss)this.t.a()).b(new Object[] { b, s });
    }
    
    public final void b(final String s) {
        ((qss)this.x.a()).b(new Object[] { s });
    }
    
    public final void c(final String s) {
        ((qss)this.A.a()).b(new Object[] { s });
    }
    
    public final void d(final String s) {
        ((qss)this.y.a()).b(new Object[] { s });
    }
    
    public final void e(final String s, final String s2, final boolean b) {
        ((qss)this.s.a()).b(new Object[] { s, s2, b });
    }
    
    public final void f(final String s, final String s2) {
        ((qss)this.u.a()).b(new Object[] { s, s2 });
    }
    
    public final void g(final String s) {
        ((qss)this.v.a()).b(new Object[] { s });
    }
    
    public final void h(final String s) {
        ((qss)this.w.a()).b(new Object[] { s });
    }
    
    public final void i(final double n, final String s) {
        ((qsp)this.z.a()).b(n, new Object[] { s });
    }
    
    public final void j(final boolean e) {
        final qsz qsz = (qsz)this.b;
        if (!(qsz.e = e)) {
            qsz.b();
        }
    }
}
