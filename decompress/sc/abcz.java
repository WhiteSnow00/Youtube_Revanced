// 
// Decompiled by Procyon v0.6.0
// 

public class abcz implements abcx, abps, tgg
{
    private final abpq a;
    private final abpl b;
    private final abcy c;
    private final aapa d;
    private boolean e;
    private boolean f;
    private abuq g;
    private abup h;
    
    public abcz(final abpq abpq, final abpl abpl, final abcy abcy) {
        this(abpq, abpl, abcy, null);
    }
    
    public abcz(final abpq a, final abpl b, final abcy c, final aapa d) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        this.d = d;
        c.re((abcx)this);
    }
    
    private final void g() {
        final abup h = this.h;
        boolean f;
        if (h != null) {
            f = h.c();
        }
        else {
            f = this.b.l(abop.a);
        }
        if (this.f != f) {
            this.f = f;
            this.c.oD(f);
        }
    }
    
    private final void h() {
        final abuq g = this.g;
        boolean e;
        if (g != null) {
            e = g.d();
        }
        else {
            e = this.b.l(abop.b);
        }
        if (this.e != e) {
            this.e = e;
            this.c.b(e);
        }
    }
    
    public void a() {
        final aapa d = this.d;
        if (d != null) {
            d.c();
        }
        final abup h = this.h;
        if (h != null) {
            h.a();
            return;
        }
        this.b.a(abop.a);
    }
    
    public void b() {
        final aapa d = this.d;
        if (d != null) {
            d.d();
        }
        final abuq g = this.g;
        if (g != null) {
            g.b();
            return;
        }
        if (!this.b.l(abop.b)) {
            this.a.Z(0L);
            return;
        }
        this.b.a(abop.b);
    }
    
    public final void c(final abup h) {
        this.h = h;
        this.g();
    }
    
    public final void d(final abuq g) {
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
    
    public final asir[] lX(final abpu abpu) {
        return new asir[] { abpu.N().j(aale.s(abpu.bM(), 262144L)).j(aale.q(1)).an((asjm)new abci(this, 14), abba.l) };
    }
    
    public Class[] ms(final Class clazz, final Object o, final int n) {
        return aakt.j(this, o, n);
    }
}
