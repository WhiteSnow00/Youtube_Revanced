import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bwx implements btj
{
    private btm a;
    private bxe b;
    private boolean c;
    
    private final boolean a(final btk btk) {
        final bwz bwz = new bwz();
        if (bwz.b(btk, true)) {
            if ((bwz.a & 0x2) == 0x2) {
                final int min = Math.min(bwz.e, 8);
                final bas bas = new bas(min);
                btk.j(bas.a, 0, min);
                b(bas);
                if (bas.a() >= 5 && bas.i() == 127 && bas.q() == 1179402563L) {
                    this.b = new bww();
                }
                else {
                    b(bas);
                    try {
                        if (bhq.e(1, bas, true)) {
                            this.b = new bxf();
                            return true;
                        }
                    }
                    catch (final aza aza) {}
                    b(bas);
                    if (!bxb.d(bas, bxb.a)) {
                        return false;
                    }
                    this.b = new bxb();
                }
                return true;
            }
        }
        return false;
    }
    
    private static void b(final bas bas) {
        bas.G(0);
    }
    
    public final void d(final btm a) {
        this.a = a;
    }
    
    public final void e() {
    }
    
    public final void f(final long n, final long n2) {
        final bxe b = this.b;
        if (b != null) {
            final bwy b2 = b.b;
            b2.a.a();
            b2.b.C(0);
            b2.c = -1;
            b2.d = false;
            if (n == 0L) {
                b.b(b.m ^ true);
                return;
            }
            if (b.i != 0) {
                b.f = b.f(n2);
                final bxa e = b.e;
                final int a = bax.a;
                e.c(b.f);
                b.i = 2;
            }
        }
    }
    
    public final boolean g(final btk btk) {
        try {
            return this.a(btk);
        }
        catch (final aza aza) {
            return false;
        }
    }
    
    public final int h(final btk btk, final paq paq) {
        dk.e((Object)this.a);
        if (this.b == null) {
            if (!this.a(btk)) {
                throw aza.a("Failed to determine bitstream type", (Throwable)null);
            }
            btk.l();
        }
        final boolean c = this.c;
        int n = 0;
        if (!c) {
            final bud q = this.a.q(0, 1);
            this.a.r();
            final bxe b = this.b;
            b.d = this.a;
            b.c = q;
            b.b(true);
            this.c = true;
        }
        final bxe b2 = this.b;
        dk.e((Object)b2.c);
        final int a = bax.a;
        final int i = b2.i;
        if (i != 0) {
            if (i == 1) {
                btk.m((int)b2.g);
                b2.i = 2;
                return 0;
            }
            if (i == 2) {
                final long a2 = b2.e.a(btk);
                if (a2 >= 0L) {
                    paq.a = a2;
                    n = 1;
                    return n;
                }
                if (a2 < -1L) {
                    b2.g(-(a2 + 2L));
                }
                if (!b2.m) {
                    final bua b3 = b2.e.b();
                    dk.e((Object)b3);
                    b2.d.x(b3);
                    b2.m = true;
                }
                if (b2.l > 0L || b2.b.a(btk)) {
                    b2.l = 0L;
                    final bas b4 = b2.b.b;
                    final long a3 = b2.a(b4);
                    if (a3 >= 0L) {
                        final long h = b2.h;
                        if (h + a3 >= b2.f) {
                            final long e = b2.e(h);
                            b2.c.c(b4, b4.c);
                            b2.c.e(e, 1, b4.c, 0, (buc)null);
                            b2.f = -1L;
                        }
                    }
                    b2.h += a3;
                    return n;
                }
                b2.i = 3;
            }
        }
        else {
            while (b2.b.a(btk)) {
                final btd btd = (btd)btk;
                final long c2 = btd.c;
                final long g = b2.g;
                b2.l = c2 - g;
                if (b2.c(b2.b.b, g, b2.k)) {
                    b2.g = btd.c;
                }
                else {
                    final ayg a4 = b2.k.a;
                    b2.j = a4.B;
                    if (!b2.n) {
                        b2.c.b(a4);
                        b2.n = true;
                    }
                    final Object b5 = b2.k.b;
                    if (b5 != null) {
                        b2.e = (bxa)b5;
                    }
                    else {
                        final long b6 = btd.b;
                        if (b6 == -1L) {
                            b2.e = (bxa)new bxd();
                        }
                        else {
                            final bwz a5 = b2.b.a;
                            b2.e = (bxa)new bwu(b2, b2.g, b6, a5.d + a5.e, a5.b, (a5.a & 0x4) != 0x0);
                        }
                    }
                    b2.i = 2;
                    final bwy b7 = b2.b;
                    final bas b8 = b7.b;
                    final byte[] a6 = b8.a;
                    if (a6.length == 65025) {
                        return n;
                    }
                    b8.E(Arrays.copyOf(a6, Math.max(65025, b8.c)), b7.b.c);
                    return n;
                }
            }
            b2.i = 3;
        }
        n = -1;
        return n;
    }
}
