import java.util.Iterator;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawc extends aass implements aauv, aauw, aaup, aaur, aauq, aatk
{
    public final Handler a;
    public aark b;
    public aawb c;
    public aawo e;
    public aauj f;
    public abcx g;
    public abfl h;
    public abed i;
    public boolean j;
    public boolean k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    private final aasy r;
    private final aasy s;
    private final aasy t;
    private final aarf u;
    private final aaux v;
    private final aaut w;
    private long x;
    private boolean y;
    
    public aawc(final aaux v, final aaut w) {
        this.w = w;
        this.v = v;
        final aarf u = new aarf();
        this.u = u;
        u.a = 500;
        this.a = new Handler(Looper.getMainLooper());
        this.r = new aasy(v.c.a(), 40.0f, 30.0f);
        this.s = new aasy(v.c.a(), v.h, v.i);
        this.t = new aasy(v.c.a(), v.h, v.i);
    }
    
    public final void a() {
        this.k = true;
        this.e.b(2);
        this.o = false;
        this.y = false;
        this.i();
    }
    
    public final void b(final float n, final float n2) {
        this.t.a(n, n2);
        this.s.a(n, n2);
    }
    
    public final void c() {
        this.a.post((Runnable)new aara(this, 15));
        this.i();
        this.a();
        this.k = true;
    }
    
    public final boolean f(final foq foq) {
        return !((aatr)this).v() && this.r.b(foq).c();
    }
    
    public final boolean g(final foq foq) {
        final boolean v = ((aatr)this).v();
        boolean b2;
        final boolean b = b2 = false;
        if (v) {
            b2 = b;
            if (this.k) {
                if (this.q == 1) {
                    if (this.t.b(foq).c()) {
                        return true;
                    }
                    b2 = b;
                }
                else {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public final boolean h(final foq foq) {
        final boolean s = this.s();
        boolean b = false;
        if (!s) {
            if (this.q != 3 && this.k) {
                if (!this.s.b(foq).c()) {
                    return true;
                }
                b = b;
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    public final void i() {
        final aaut w = this.w;
        final boolean x = w.x();
        final boolean b = true;
        this.n = (x || (this.k && !this.y && !this.j && !this.o && !w.y()));
        final Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            ((aatp)iterator.next()).rS(this.n);
        }
        ((aatr)this.b).rS(this.j ^ true);
        this.w.j();
        this.c.a(this.w.g);
        final aauj f = this.f;
        final boolean n = this.n;
        boolean l = b;
        if (!n) {
            l = (this.p && b);
        }
        ((aatr)f).l = l;
        this.w.h(n);
    }
    
    public final void o(final foq foq) {
        final Iterator iterator = this.w.b.iterator();
        while (true) {
            while (iterator.hasNext()) {
                if (((aatp)iterator.next()).q(foq)) {
                    super.o(foq);
                    return;
                }
            }
            if (!this.r.b(foq).c()) {
                this.m = true;
            }
            final boolean y = this.y ^ true;
            this.y = y;
            if (y) {
                this.x = foq.a + 2500L;
            }
            this.i();
            continue;
        }
    }
    
    public final void p(final foq foq) {
        final boolean m = this.m;
        final boolean b = false;
        if (m) {
            this.v.t(foq);
            this.m = false;
        }
        if (!((aatr)this).v() && (this.q(foq) || this.w.y())) {
            this.x = foq.a + 2500L;
        }
        else if (!((aatr)this).v()) {
            this.y = (this.y && this.x > foq.a);
            this.i();
        }
        final boolean c = this.r.b(foq).c();
        final aarf u = this.u;
        boolean b2 = b;
        if (!((aatr)this).v()) {
            b2 = b;
            if (c) {
                b2 = true;
            }
        }
        u.b(b2, foq.a);
        this.v.i(this.u.a() * 0.66f);
        super.p(foq);
    }
    
    public final void rQ() {
        super.rQ();
        this.v.g(this);
        this.v.h(this);
    }
    
    public final void rR(final boolean b, final foq foq) {
        final boolean q = this.q(foq);
        if (b && !q) {
            return;
        }
        super.rR(b, foq);
    }
    
    public final boolean v() {
        return super.v() || this.n;
    }
    
    public final void z(final int q) {
        this.q = q;
        final aaue c = this.c.c;
        boolean l = true;
        if (q == 1) {
            l = false;
        }
        ((aatr)c).l = l;
    }
}
