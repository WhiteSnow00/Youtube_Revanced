// 
// Decompiled by Procyon v0.6.0
// 

public final class buu implements btj
{
    private final bas a;
    private final bas b;
    private final bas c;
    private final bas d;
    private final buv e;
    private btm f;
    private int g;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private but o;
    private buy p;
    
    public buu() {
        this.a = new bas(4);
        this.b = new bas(9);
        this.c = new bas(11);
        this.d = new bas();
        this.e = new buv();
        this.g = 1;
    }
    
    private final bas a(final btk btk) {
        if (this.l > this.d.b()) {
            final bas d = this.d;
            final int b = d.b();
            d.E(new byte[Math.max(b + b, this.l)], 0);
        }
        else {
            this.d.G(0);
        }
        this.d.F(this.l);
        btk.k(this.d.a, 0, this.l);
        return this.d;
    }
    
    private final void b() {
        if (!this.n) {
            this.f.x((bua)new btz(-9223372036854775807L));
            this.n = true;
        }
    }
    
    public final void d(final btm f) {
        this.f = f;
    }
    
    public final void e() {
    }
    
    public final void f(final long n, final long n2) {
        if (n == 0L) {
            this.g = 1;
            this.h = false;
        }
        else {
            this.g = 3;
        }
        this.j = 0;
    }
    
    public final boolean g(final btk btk) {
        btk.j(this.a.a, 0, 3);
        this.a.G(0);
        if (this.a.k() != 4607062) {
            return false;
        }
        btk.j(this.a.a, 0, 2);
        this.a.G(0);
        if ((this.a.m() & 0xFA) != 0x0) {
            return false;
        }
        btk.j(this.a.a, 0, 4);
        this.a.G(0);
        final int d = this.a.d();
        btk.l();
        btk.g(d);
        btk.j(this.a.a, 0, 4);
        this.a.G(0);
        return this.a.d() == 0;
    }
    
    public final int h(final btk btk, final paq paq) {
        dk.e((Object)this.f);
    Label_0128_Outer:
        while (true) {
            final int g = this.g;
            int n = 8;
            if (g != 1) {
                if (g != 2) {
                    if (g != 3) {
                        if (g != 4) {
                            throw new IllegalStateException();
                        }
                        long m;
                        if (this.h) {
                            m = this.i + this.m;
                        }
                        else if (this.e.a == -9223372036854775807L) {
                            m = 0L;
                        }
                        else {
                            m = this.m;
                        }
                        final int k = this.k;
                        int n2 = 0;
                        boolean b = false;
                        Label_0278: {
                            while (true) {
                                Label_0136: {
                                    if (k != 8) {
                                        n = k;
                                        break Label_0136;
                                    }
                                    if (this.o == null) {
                                        break Label_0136;
                                    }
                                    this.b();
                                    n2 = (this.o.c(this.a(btk), m) ? 1 : 0);
                                    b = true;
                                    break Label_0278;
                                }
                                if (n == 9) {
                                    if (this.p != null) {
                                        this.b();
                                        n2 = (this.p.c(this.a(btk), m) ? 1 : 0);
                                        continue;
                                    }
                                }
                                else if (n == 18 && !this.n) {
                                    final boolean c = this.e.c(this.a(btk), m);
                                    final buv e = this.e;
                                    final long a = e.a;
                                    n2 = (c ? 1 : 0);
                                    if (a != -9223372036854775807L) {
                                        this.f.x((bua)new btt(e.c, e.b, a));
                                        this.n = true;
                                        n2 = (c ? 1 : 0);
                                    }
                                    continue;
                                }
                                break;
                            }
                            btk.m(this.l);
                            n2 = 0;
                            b = false;
                        }
                        if (!this.h && n2 != 0) {
                            this.h = true;
                            long i;
                            if (this.e.a == -9223372036854775807L) {
                                i = -this.m;
                            }
                            else {
                                i = 0L;
                            }
                            this.i = i;
                        }
                        this.j = 4;
                        this.g = 2;
                        if (b) {
                            return 0;
                        }
                        continue Label_0128_Outer;
                    }
                    else {
                        if (!btk.p(this.c.a, 0, 11, true)) {
                            return -1;
                        }
                        this.c.G(0);
                        this.k = this.c.i();
                        this.l = this.c.k();
                        this.m = this.c.k();
                        this.m = (this.m | (long)(this.c.i() << 24)) * 1000L;
                        this.c.H(3);
                        this.g = 4;
                    }
                }
                else {
                    btk.m(this.j);
                    this.j = 0;
                    this.g = 3;
                }
            }
            else {
                if (!btk.p(this.b.a, 0, 9, true)) {
                    return -1;
                }
                this.b.G(0);
                this.b.H(4);
                final int j = this.b.i();
                if ((j & 0x4) != 0x0 && this.o == null) {
                    this.o = new but(this.f.q(8, 1));
                }
                if ((j & 0x1) != 0x0 && this.p == null) {
                    this.p = new buy(this.f.q(9, 2));
                }
                this.f.r();
                this.j = this.b.d() - 5;
                this.g = 2;
            }
        }
    }
}
