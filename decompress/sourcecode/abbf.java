// 
// Decompiled by Procyon v0.6.0
// 

public class abbf implements abbd, abnq, tec
{
    private final abno a;
    private final abni b;
    private final abbe c;
    private final aanf d;
    private boolean e;
    private boolean f;
    private absp g;
    private abso h;
    
    public abbf(final abno abno, final abni abni, final abbe abbe) {
        this(abno, abni, abbe, null);
    }
    
    public abbf(final abno a, final abni b, final abbe c, final aanf d) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        this.d = d;
        c.qY((abbd)this);
    }
    
    private final void g() {
        final abso h = this.h;
        boolean f;
        if (h != null) {
            f = h.c();
        }
        else {
            f = this.b.l(abmp.a);
        }
        if (this.f != f) {
            this.f = f;
            this.c.oD(f);
        }
    }
    
    private final void h() {
        final absp g = this.g;
        boolean e;
        if (g != null) {
            e = g.d();
        }
        else {
            e = this.b.l(abmp.b);
        }
        if (this.e != e) {
            this.e = e;
            this.c.b(e);
        }
    }
    
    public void a() {
        final aanf d = this.d;
        if (d != null) {
            d.c();
        }
        final abso h = this.h;
        if (h != null) {
            h.a();
            return;
        }
        this.b.a(abmp.a);
    }
    
    public void b() {
        final aanf d = this.d;
        if (d != null) {
            d.d();
        }
        final absp g = this.g;
        if (g != null) {
            g.b();
            return;
        }
        if (!this.b.l(abmp.b)) {
            this.a.aa(0L);
            return;
        }
        this.b.a(abmp.b);
    }
    
    public final void c(final abso h) {
        this.h = h;
        this.g();
    }
    
    public final void d(final absp g) {
        this.g = g;
        this.h();
    }
    
    public final void f() {
        if (this.g == null) {
            this.h();
        }
        if (this.h == null) {
            this.g();
        }
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { abns.O().j(aajj.t(abns.bN(), 262144L)).j(aajj.r(1)).am((asix)new abat(this, 9), (asix)aaze.l) };
    }
    
    public Class[] ms(final Class clazz, final Object o, final int n) {
        return aaiy.j(this, o, n);
    }
}
