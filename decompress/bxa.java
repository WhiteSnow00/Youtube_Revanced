import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bxa implements btm
{
    private btp a;
    private bxh b;
    private boolean c;
    
    private final boolean a(final btn btn) {
        final bxc bxc = new bxc();
        if (bxc.b(btn, true)) {
            if ((bxc.a & 0x2) == 0x2) {
                final int min = Math.min(bxc.e, 8);
                final bat bat = new bat(min);
                btn.j(bat.a, 0, min);
                b(bat);
                if (bat.a() >= 5 && bat.i() == 127 && bat.q() == 1179402563L) {
                    this.b = new bwz();
                }
                else {
                    b(bat);
                    try {
                        if (bhw.j(1, bat, true)) {
                            this.b = new bxi();
                            return true;
                        }
                    }
                    catch (final azb azb) {}
                    b(bat);
                    if (!bxe.d(bat, bxe.a)) {
                        return false;
                    }
                    this.b = new bxe();
                }
                return true;
            }
        }
        return false;
    }
    
    private static void b(final bat bat) {
        bat.G(0);
    }
    
    public final void d(final btp a) {
        this.a = a;
    }
    
    public final void e() {
    }
    
    public final void f(final long n, final long n2) {
        final bxh b = this.b;
        if (b != null) {
            final bxb b2 = b.b;
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
                final bxd e = b.e;
                final int a = baz.a;
                e.c(b.f);
                b.i = 2;
            }
        }
    }
    
    public final boolean g(final btn btn) {
        try {
            return this.a(btn);
        }
        catch (final azb azb) {
            return false;
        }
    }
    
    public final int h(final btn btn, final pbg pbg) {
        bad.c(this.a);
        if (this.b == null) {
            if (!this.a(btn)) {
                throw azb.a("Failed to determine bitstream type", null);
            }
            btn.l();
        }
        final boolean c = this.c;
        int n = 0;
        if (!c) {
            final bug q = this.a.q(0, 1);
            this.a.r();
            final bxh b = this.b;
            b.d = this.a;
            b.c = q;
            b.b(true);
            this.c = true;
        }
        final bxh b2 = this.b;
        bad.c(b2.c);
        final int a = baz.a;
        final int i = b2.i;
        if (i != 0) {
            if (i == 1) {
                btn.m((int)b2.g);
                b2.i = 2;
                return 0;
            }
            if (i == 2) {
                final long a2 = b2.e.a(btn);
                if (a2 >= 0L) {
                    pbg.a = a2;
                    n = 1;
                    return n;
                }
                if (a2 < -1L) {
                    b2.g(-(a2 + 2L));
                }
                if (!b2.m) {
                    final bud b3 = b2.e.b();
                    bad.c(b3);
                    b2.d.x(b3);
                    b2.m = true;
                }
                if (b2.l > 0L || b2.b.a(btn)) {
                    b2.l = 0L;
                    final bat b4 = b2.b.b;
                    final long a3 = b2.a(b4);
                    if (a3 >= 0L) {
                        final long h = b2.h;
                        if (h + a3 >= b2.f) {
                            final long e = b2.e(h);
                            b2.c.c(b4, b4.c);
                            b2.c.e(e, 1, b4.c, 0, (buf)null);
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
            while (b2.b.a(btn)) {
                final btg btg = (btg)btn;
                final long c2 = btg.c;
                final long g = b2.g;
                b2.l = c2 - g;
                if (b2.c(b2.b.b, g, b2.k)) {
                    b2.g = btg.c;
                }
                else {
                    final ayh a4 = b2.k.a;
                    b2.j = a4.B;
                    if (!b2.n) {
                        b2.c.b(a4);
                        b2.n = true;
                    }
                    final Object b5 = b2.k.b;
                    if (b5 != null) {
                        b2.e = (bxd)b5;
                    }
                    else {
                        final long b6 = btg.b;
                        if (b6 == -1L) {
                            b2.e = (bxd)new bxg();
                        }
                        else {
                            final bxc a5 = b2.b.a;
                            b2.e = (bxd)new bwx(b2, b2.g, b6, a5.d + a5.e, a5.b, (a5.a & 0x4) != 0x0);
                        }
                    }
                    b2.i = 2;
                    final bxb b7 = b2.b;
                    final bat b8 = b7.b;
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
