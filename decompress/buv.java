import androidx.media3.extractor.metadata.flac.PictureFrame;
import java.util.List;
import java.util.Arrays;
import androidx.media3.common.Metadata;

// 
// Decompiled by Procyon v0.6.0
// 

public final class buv implements btm
{
    private final byte[] a;
    private final bat b;
    private btp c;
    private bug d;
    private int e;
    private Metadata f;
    private bts g;
    private int h;
    private int i;
    private int j;
    private long k;
    private egn l;
    private final pbg m;
    
    public buv() {
        this(null);
    }
    
    public buv(final byte[] array) {
        this.a = new byte[42];
        this.b = new bat(new byte[32768], 0);
        this.m = new pbg((char[])null, (byte[])null);
        this.e = 0;
    }
    
    private final long a(final bat bat, final boolean b) {
        bad.b(this.g);
        int i;
        for (i = bat.b; i <= bat.c - 16; ++i) {
            bat.G(i);
            if (bse.f(bat, this.g, this.i, this.m)) {
                bat.G(i);
                return this.m.a;
            }
        }
        if (b) {
            while (true) {
                final int c = bat.c;
                if (i > c - this.h) {
                    bat.G(c);
                    break;
                }
                bat.G(i);
                boolean f;
                try {
                    f = bse.f(bat, this.g, this.i, this.m);
                }
                catch (final IndexOutOfBoundsException ex) {
                    f = false;
                }
                if (bat.b <= bat.c) {
                    if (f) {
                        bat.G(i);
                        return this.m.a;
                    }
                }
                ++i;
            }
        }
        else {
            bat.G(i);
        }
        return -1L;
    }
    
    private final void b() {
        final long k = this.k;
        final bts g = this.g;
        final int a = baz.a;
        this.d.e(k * 1000000L / g.e, 1, this.j, 0, (buf)null);
    }
    
    public final void d(final btp c) {
        this.c = c;
        this.d = c.q(0, 1);
        c.r();
    }
    
    public final void e() {
    }
    
    public final void f(long k, final long n) {
        final long n2 = 0L;
        if (k == 0L) {
            this.e = 0;
        }
        else {
            final egn l = this.l;
            if (l != null) {
                l.a(n);
            }
        }
        if (n == 0L) {
            k = n2;
        }
        else {
            k = -1L;
        }
        this.k = k;
        this.j = 0;
        this.b.C(0);
    }
    
    public final boolean g(final btn btn) {
        bsj.b(btn, false);
        final bat bat = new bat(4);
        btn.j(bat.a, 0, 4);
        return bat.q() == 1716281667L;
    }
    
    public final int h(final btn btn, final pbg pbg) {
        final int e = this.e;
        final boolean b = true;
        boolean b2 = true;
        final int n = 0;
        if (e == 0) {
            btn.l();
            final long e2 = btn.e();
            final Metadata b3 = bsj.b(btn, true);
            btn.m((int)(btn.e() - e2));
            this.f = b3;
            this.e = 1;
            return 0;
        }
        if (e == 1) {
            btn.j(this.a, 0, 42);
            btn.l();
            this.e = 2;
            return 0;
        }
        if (e != 2) {
            int n2 = 7;
            if (e != 3) {
                if (e != 4) {
                    bad.b(this.d);
                    bad.b(this.g);
                    final egn l = this.l;
                    int f;
                    if (l != null && l.b()) {
                        f = l.f(btn, pbg);
                    }
                    else if (this.k == -1L) {
                        final bts g = this.g;
                        btn.l();
                        btn.g(1);
                        final byte[] array = { 0 };
                        btn.j(array, 0, 1);
                        final int n3 = array[0] & 0x1;
                        btn.g(2);
                        if (n3 == 0) {
                            n2 = 6;
                        }
                        final bat bat = new bat(n2);
                        bat.F(bmd.b(btn, bat.a, 0, n2));
                        btn.l();
                        final pbg pbg2 = new pbg((char[])null, (byte[])null);
                        if (n3 == 0) {
                            b2 = false;
                        }
                        if (!bse.e(bat, g, b2, pbg2)) {
                            throw azb.a(null, null);
                        }
                        this.k = pbg2.a;
                        f = n;
                    }
                    else {
                        final bat b4 = this.b;
                        final int c = b4.c;
                        boolean b5;
                        if (c < 32768) {
                            final int a = btn.a(b4.a, c, 32768 - c);
                            b5 = (a == -1 && b);
                            if (!b5) {
                                this.b.F(c + a);
                            }
                            else if (this.b.a() == 0) {
                                this.b();
                                f = -1;
                                return f;
                            }
                        }
                        else {
                            b5 = false;
                        }
                        final bat b6 = this.b;
                        final int b7 = b6.b;
                        final int j = this.j;
                        final int h = this.h;
                        if (j < h) {
                            b6.H(Math.min(h - j, b6.a()));
                        }
                        final long a2 = this.a(this.b, b5);
                        final bat b8 = this.b;
                        final int n4 = b8.b - b7;
                        b8.G(b7);
                        this.d.c(this.b, n4);
                        this.j += n4;
                        if (a2 != -1L) {
                            this.b();
                            this.j = 0;
                            this.k = a2;
                        }
                        final bat b9 = this.b;
                        if (b9.a() < 16) {
                            final int a3 = b9.a();
                            final byte[] a4 = b9.a;
                            System.arraycopy(a4, b9.b, a4, 0, a3);
                            this.b.G(0);
                            this.b.F(a3);
                            return 0;
                        }
                        f = n;
                    }
                    return f;
                }
                btn.l();
                final bat bat2 = new bat(2);
                btn.j(bat2.a, 0, 2);
                final int m = bat2.m();
                if (m >> 2 == 16382) {
                    btn.l();
                    this.i = m;
                    final btp c2 = this.c;
                    final int a5 = baz.a;
                    final btg btg = (btg)btn;
                    final long c3 = btg.c;
                    final long b10 = btg.b;
                    bad.b(this.g);
                    final bts g2 = this.g;
                    Object b11;
                    if (g2.k != null) {
                        b11 = new btr(g2, c3);
                    }
                    else if (b10 != -1L && g2.j > 0L) {
                        final int i = this.i;
                        g2.getClass();
                        final but but = new but(g2);
                        final buu buu = new buu(g2, i);
                        final long a6 = g2.a();
                        final long k = g2.j;
                        final int d = g2.d;
                        long n5;
                        if (d > 0) {
                            n5 = (d + (long)g2.c) / 2L + 1L;
                        }
                        else {
                            final int a7 = g2.a;
                            final int b12 = g2.b;
                            long n6 = 4096L;
                            if (a7 == b12) {
                                n6 = n6;
                                if (a7 > 0) {
                                    n6 = a7;
                                }
                            }
                            n5 = n6 * g2.g * g2.h / 8L + 64L;
                        }
                        final egn l2 = new egn((btb)but, (btd)buu, a6, k, c3, b10, n5, Math.max(6, g2.c));
                        this.l = l2;
                        b11 = l2.b;
                    }
                    else {
                        b11 = new buc(g2.a());
                    }
                    c2.x((bud)b11);
                    this.e = 5;
                    return 0;
                }
                btn.l();
                throw azb.a("First frame does not start with sync code.", null);
            }
            else {
                bts g3 = this.g;
                while (true) {
                    btn.l();
                    final atlj atlj = new atlj(new byte[4], null);
                    btn.j((byte[])atlj.d, 0, 4);
                    final boolean q = atlj.q();
                    final int g4 = atlj.g(7);
                    final int n7 = atlj.g(24) + 4;
                    if (g4 == 0) {
                        final byte[] array2 = new byte[38];
                        btn.k(array2, 0, 38);
                        g3 = new bts(array2, 4);
                    }
                    else {
                        if (g3 == null) {
                            throw new IllegalArgumentException();
                        }
                        if (g4 == 3) {
                            final bat bat3 = new bat(n7);
                            btn.k(bat3.a, 0, n7);
                            g3 = g3.e(bsj.f(bat3));
                        }
                        else if (g4 == 4) {
                            final bat bat4 = new bat(n7);
                            btn.k(bat4.a, 0, n7);
                            bat4.H(4);
                            g3 = new bts(g3.a, g3.b, g3.c, g3.d, g3.e, g3.g, g3.h, g3.j, g3.k, g3.d(bhw.i((List)Arrays.asList((Object[])bhw.k(bat4, false, false).a))), (byte[])null, (byte[])null);
                        }
                        else if (g4 == 6) {
                            final bat bat5 = new bat(n7);
                            btn.k(bat5.a, 0, n7);
                            bat5.H(4);
                            g3 = new bts(g3.a, g3.b, g3.c, g3.d, g3.e, g3.g, g3.h, g3.j, g3.k, g3.d(new Metadata((List)afgh.r(PictureFrame.d(bat5)))), (byte[])null, (byte[])null);
                        }
                        else {
                            btn.m(n7);
                        }
                    }
                    final int a8 = baz.a;
                    this.g = g3;
                    if (q) {
                        bad.b(g3);
                        this.h = Math.max(this.g.c, 6);
                        this.d.b(this.g.c(this.a, this.f));
                        this.e = 4;
                        return 0;
                    }
                }
            }
        }
        else {
            final bat bat6 = new bat(4);
            btn.k(bat6.a, 0, 4);
            if (bat6.q() == 1716281667L) {
                this.e = 3;
                return 0;
            }
            throw azb.a("Failed to read FLAC stream marker.", null);
        }
    }
}
