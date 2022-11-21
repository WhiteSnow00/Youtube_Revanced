// 
// Decompiled by Procyon v0.6.0
// 

public final class bzo implements btm
{
    private final bzp a;
    private final bat b;
    private final bat c;
    private btp d;
    private long e;
    private long f;
    private boolean g;
    private boolean h;
    private final atlj i;
    
    public bzo() {
        this(null);
    }
    
    public bzo(final byte[] array) {
        this.a = new bzp(true, null);
        this.b = new bat(2048);
        this.f = -1L;
        final bat c = new bat(10);
        this.c = c;
        this.i = new atlj(c.a, null);
    }
    
    public final void d(final btp d) {
        this.d = d;
        this.a.b(d, new car(0, 1));
        d.r();
    }
    
    public final void e() {
    }
    
    public final void f(final long n, final long e) {
        this.g = false;
        this.a.e();
        this.e = e;
    }
    
    public final boolean g(final btn btn) {
        int n = 0;
        while (true) {
            btn.j(this.c.a, 0, 10);
            this.c.G(0);
            if (this.c.k() != 4801587) {
                break;
            }
            this.c.H(3);
            final int h = this.c.h();
            n += h + 10;
            btn.g(h);
        }
        btn.l();
        btn.g(n);
        if (this.f == -1L) {
            this.f = n;
        }
        int n2 = n;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        do {
            btn.j(this.c.a, 0, 2);
            this.c.G(0);
            int n7 = 0;
            Label_0253: {
                int n6;
                if (!bzp.f(this.c.m())) {
                    n6 = n2 + 1;
                    btn.l();
                    btn.g(n6);
                }
                else {
                    if (++n3 >= 4 && n4 > 188) {
                        return true;
                    }
                    btn.j(this.c.a, 0, 4);
                    this.i.m(14);
                    final int g = this.i.g(13);
                    if (g > 6) {
                        btn.g(g - 6);
                        n4 += g;
                        n5 = n2;
                        n7 = n3;
                        break Label_0253;
                    }
                    n6 = n2 + 1;
                    btn.l();
                    btn.g(n6);
                }
                n7 = 0;
                final int n8 = 0;
                n5 = n6;
                n4 = n8;
            }
            n3 = n7;
            n2 = n5;
        } while (n5 - n < 8192);
        return false;
    }
    
    public final int h(final btn btn, final pbg pbg) {
        bad.c(this.d);
        final int a = btn.a(this.b.a, 0, 2048);
        if (!this.h) {
            this.d.x((bud)new buc(-9223372036854775807L));
            this.h = true;
        }
        if (a == -1) {
            return -1;
        }
        this.b.G(0);
        this.b.F(a);
        if (!this.g) {
            this.a.d(this.e, 4);
            this.g = true;
        }
        this.a.a(this.b);
        return 0;
    }
}
