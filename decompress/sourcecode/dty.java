import android.view.ViewOutlineProvider;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dty implements dui
{
    public CharSequence a;
    public Object b;
    public SparseArray c;
    public ViewOutlineProvider d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public float i;
    public dum j;
    public dum k;
    public dum l;
    public dum m;
    public dum n;
    public String o;
    public dum p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    
    public dty() {
        this.f = true;
        this.g = 1.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
    }
    
    public final boolean A() {
        return (this.v & 0x4000000) != 0x0;
    }
    
    public final boolean B() {
        return (this.v & 0x80000) != 0x0;
    }
    
    public final boolean C() {
        return this.p != null || this.o != null;
    }
    
    public final void D(final dty dty) {
        if ((this.v & 0x8) != 0x0) {
            dty.e(this.j);
        }
        if ((this.v & 0x10) != 0x0) {
            dty.n(this.l);
        }
        if ((this.v & 0x20000) != 0x0) {
            dty.l(this.k);
        }
        if ((this.v & 0x20) != 0x0) {
            dty.s(this.m);
        }
        if ((this.v & 0x8000000) != 0x0) {
            dty.j(this.n);
        }
        if ((this.v & 0x40000) != 0x0) {
            dty.v |= 0x40000;
        }
        if ((this.v & 0x400000) != 0x0) {
            dty.c(this.o);
        }
        if ((this.v & 0x1000000) != 0x0) {
            dty.v |= 0x1000000;
        }
        if ((this.v & 0x40) != 0x0) {
            dty.v |= 0x40;
        }
        if ((this.v & 0x80) != 0x0) {
            dty.v |= 0x80;
        }
        if ((this.v & 0x100) != 0x0) {
            dty.o(this.p);
        }
        if ((this.v & 0x200) != 0x0) {
            dty.v |= 0x200;
        }
        if ((this.v & 0x400) != 0x0) {
            dty.v |= 0x400;
        }
        if ((this.v & 0x800) != 0x0) {
            dty.v |= 0x800;
        }
        if ((this.v & 0x1000) != 0x0) {
            dty.v |= 0x1000;
        }
        if ((this.v & 0x2000) != 0x0) {
            dty.v |= 0x2000;
        }
        final int v = this.v;
        final boolean b = true;
        if ((v & 0x1) != 0x0) {
            dty.i(this.a);
        }
        if ((this.v & 0x4000) != 0x0) {
            dty.v |= 0x4000;
        }
        if ((this.v & 0x8000) != 0x0) {
            dty.p(this.d);
        }
        if ((this.v & 0x10000) != 0x0) {
            dty.h(this.e);
        }
        if ((this.v & 0x800000) != 0x0) {
            dty.g(this.f);
        }
        final Object b2 = this.b;
        if (b2 != null) {
            dty.t(b2);
        }
        final SparseArray c = this.c;
        if (c != null) {
            dty.u(c);
        }
        final int q = this.q;
        if (q != 0) {
            dty.m(q == 1);
        }
        final int r = this.r;
        if (r != 0) {
            dty.f(r == 1);
        }
        final int s = this.s;
        if (s != 0) {
            dty.k(s == 1);
        }
        final int t = this.t;
        if (t != 0) {
            if (t == 1) {
                dty.t = 1;
            }
            else {
                dty.t = 2;
            }
        }
        final int u = this.u;
        if (u != 0) {
            dty.b(u == 1 && b);
        }
        if ((this.v & 0x80000) != 0x0) {
            dty.r(this.g);
        }
        if ((this.v & 0x100000) != 0x0) {
            dty.d(this.h);
        }
        if ((this.v & 0x200000) != 0x0) {
            dty.q(this.i);
        }
        if ((this.v & 0x2000000) != 0x0) {
            dty.v |= 0x2000000;
        }
        if ((this.v & 0x4000000) != 0x0) {
            dty.v |= 0x4000000;
        }
    }
    
    public final void b(final boolean b) {
        int u;
        if (b) {
            u = 1;
        }
        else {
            u = 2;
        }
        this.u = u;
    }
    
    public final void c(final String o) {
        this.v |= 0x400000;
        this.o = o;
    }
    
    public final void d(final float h) {
        this.h = h;
        int v;
        if (h == 1.0f) {
            v = (this.v & 0xFFEFFFFF);
        }
        else {
            v = (this.v | 0x100000);
        }
        this.v = v;
    }
    
    public final void e(final dum j) {
        this.v |= 0x8;
        this.j = j;
    }
    
    public final void f(final boolean b) {
        int r;
        if (b) {
            r = 1;
        }
        else {
            r = 2;
        }
        this.r = r;
    }
    
    public final void g(final boolean f) {
        this.v |= 0x800000;
        this.f = f;
    }
    
    public final void h(final boolean e) {
        this.v |= 0x10000;
        this.e = e;
    }
    
    public final void i(final CharSequence a) {
        this.v |= 0x1;
        this.a = a;
    }
    
    public final void j(final dum n) {
        this.v |= 0x8000000;
        this.n = n;
    }
    
    public final void k(final boolean b) {
        int s;
        if (b) {
            s = 1;
        }
        else {
            s = 2;
        }
        this.s = s;
    }
    
    public final void l(final dum k) {
        this.v |= 0x20000;
        this.k = k;
    }
    
    public final void m(final boolean b) {
        int q;
        if (b) {
            q = 1;
        }
        else {
            q = 2;
        }
        this.q = q;
    }
    
    public final void n(final dum l) {
        this.v |= 0x10;
        this.l = l;
    }
    
    public final void o(final dum p) {
        this.v |= 0x100;
        this.p = p;
    }
    
    public final void p(final ViewOutlineProvider d) {
        this.v |= 0x8000;
        this.d = d;
    }
    
    public final void q(final float i) {
        this.i = i;
        int v;
        if (i == 0.0f) {
            v = (this.v & 0xFFDFFFFF);
        }
        else {
            v = (this.v | 0x200000);
        }
        this.v = v;
    }
    
    public final void r(final float g) {
        this.g = g;
        int v;
        if (g == 1.0f) {
            v = (this.v & 0xFFF7FFFF);
        }
        else {
            v = (this.v | 0x80000);
        }
        this.v = v;
    }
    
    public final void s(final dum m) {
        this.v |= 0x20;
        this.m = m;
    }
    
    public final void t(final Object b) {
        this.v |= 0x2;
        this.b = b;
    }
    
    public final void u(final SparseArray c) {
        this.v |= 0x4;
        this.c = c;
    }
    
    public final boolean v() {
        return this.j != null || this.l != null || this.m != null || this.n != null;
    }
    
    public final boolean w() {
        return (this.v & 0x100000) != 0x0;
    }
    
    public final boolean x() {
        return (this.v & 0x800000) != 0x0;
    }
    
    public final boolean y() {
        return (this.v & 0x200000) != 0x0;
    }
    
    public final boolean z() {
        return (this.v & 0x2000000) != 0x0;
    }
}
