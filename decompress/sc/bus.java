import androidx.media3.extractor.metadata.flac.PictureFrame;
import java.util.List;
import java.util.Arrays;
import androidx.media3.common.Metadata;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bus implements btj
{
    private final byte[] a;
    private final bas b;
    private btm c;
    private bud d;
    private int e;
    private Metadata f;
    private btp g;
    private int h;
    private int i;
    private int j;
    private long k;
    private egk l;
    private final paq m;
    
    public bus() {
        this(null);
    }
    
    public bus(final byte[] array) {
        this.a = new byte[42];
        this.b = new bas(new byte[32768], 0);
        this.m = new paq((char[])null, (byte[])null);
        this.e = 0;
    }
    
    private final long a(final bas bas, final boolean b) {
        dk.d((Object)this.g);
        int i;
        for (i = bas.b; i <= bas.c - 16; ++i) {
            bas.G(i);
            if (bma.j(bas, this.g, this.i, this.m)) {
                bas.G(i);
                return this.m.a;
            }
        }
        if (b) {
            while (true) {
                final int c = bas.c;
                if (i > c - this.h) {
                    bas.G(c);
                    break;
                }
                bas.G(i);
                boolean j;
                try {
                    j = bma.j(bas, this.g, this.i, this.m);
                }
                catch (final IndexOutOfBoundsException ex) {
                    j = false;
                }
                if (bas.b <= bas.c) {
                    if (j) {
                        bas.G(i);
                        return this.m.a;
                    }
                }
                ++i;
            }
        }
        else {
            bas.G(i);
        }
        return -1L;
    }
    
    private final void b() {
        final long k = this.k;
        final btp g = this.g;
        final int a = bax.a;
        this.d.e(k * 1000000L / g.e, 1, this.j, 0, (buc)null);
    }
    
    public final void d(final btm c) {
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
            final egk l = this.l;
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
    
    public final boolean g(final btk btk) {
        bsb.b(btk, false);
        final bas bas = new bas(4);
        btk.j(bas.a, 0, 4);
        return bas.q() == 1716281667L;
    }
    
    public final int h(final btk btk, final paq paq) {
        final int e = this.e;
        boolean b = true;
        final boolean b2 = true;
        final int n = 0;
        if (e == 0) {
            btk.l();
            final long e2 = btk.e();
            final Metadata b3 = bsb.b(btk, true);
            btk.m((int)(btk.e() - e2));
            this.f = b3;
            this.e = 1;
            return 0;
        }
        if (e == 1) {
            btk.j(this.a, 0, 42);
            btk.l();
            this.e = 2;
            return 0;
        }
        if (e != 2) {
            int n2 = 7;
            if (e != 3) {
                if (e != 4) {
                    dk.d((Object)this.d);
                    dk.d((Object)this.g);
                    final egk l = this.l;
                    int f;
                    if (l != null && l.b()) {
                        f = l.f(btk, paq);
                    }
                    else if (this.k == -1L) {
                        final btp g = this.g;
                        btk.l();
                        btk.g(1);
                        final byte[] array = { 0 };
                        btk.j(array, 0, 1);
                        final int n3 = array[0] & 0x1;
                        btk.g(2);
                        if (n3 == 0) {
                            n2 = 6;
                        }
                        final bas bas = new bas(n2);
                        bas.F(bly.b(btk, bas.a, 0, n2));
                        btk.l();
                        final paq paq2 = new paq((char[])null, (byte[])null);
                        boolean b4 = b2;
                        if (n3 == 0) {
                            b4 = false;
                        }
                        if (!bma.i(bas, g, b4, paq2)) {
                            throw aza.a((String)null, (Throwable)null);
                        }
                        this.k = paq2.a;
                        f = n;
                    }
                    else {
                        final bas b5 = this.b;
                        final int c = b5.c;
                        if (c < 32768) {
                            final int a = btk.a(b5.a, c, 32768 - c);
                            if (a != -1) {
                                b = false;
                            }
                            if (!b) {
                                this.b.F(c + a);
                            }
                            else if (this.b.a() == 0) {
                                this.b();
                                f = -1;
                                return f;
                            }
                        }
                        else {
                            b = false;
                        }
                        final bas b6 = this.b;
                        final int b7 = b6.b;
                        final int j = this.j;
                        final int h = this.h;
                        if (j < h) {
                            b6.H(Math.min(h - j, b6.a()));
                        }
                        final long a2 = this.a(this.b, b);
                        final bas b8 = this.b;
                        final int n4 = b8.b - b7;
                        b8.G(b7);
                        this.d.c(this.b, n4);
                        this.j += n4;
                        if (a2 != -1L) {
                            this.b();
                            this.j = 0;
                            this.k = a2;
                        }
                        final bas b9 = this.b;
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
                btk.l();
                final bas bas2 = new bas(2);
                btk.j(bas2.a, 0, 2);
                final int m = bas2.m();
                if (m >> 2 == 16382) {
                    btk.l();
                    this.i = m;
                    final btm c2 = this.c;
                    final int a5 = bax.a;
                    final btd btd = (btd)btk;
                    final long c3 = btd.c;
                    final long b10 = btd.b;
                    dk.d((Object)this.g);
                    final btp g2 = this.g;
                    Object b11;
                    if (g2.k != null) {
                        b11 = new bto(g2, c3);
                    }
                    else if (b10 != -1L && g2.j > 0L) {
                        final int i = this.i;
                        g2.getClass();
                        final buq buq = new buq(g2);
                        final bur bur = new bur(g2, i);
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
                        final egk l2 = new egk((bsy)buq, (bta)bur, a6, k, c3, b10, n5, Math.max(6, g2.c));
                        this.l = l2;
                        b11 = l2.b;
                    }
                    else {
                        b11 = new btz(g2.a());
                    }
                    c2.x((bua)b11);
                    this.e = 5;
                    return 0;
                }
                btk.l();
                throw aza.a("First frame does not start with sync code.", (Throwable)null);
            }
            else {
                btp g3 = this.g;
                while (true) {
                    btk.l();
                    final atim atim = new atim(new byte[4], (byte[])null);
                    btk.j((byte[])atim.d, 0, 4);
                    final boolean q = atim.q();
                    final int g4 = atim.g(7);
                    final int n7 = atim.g(24) + 4;
                    if (g4 == 0) {
                        final byte[] array2 = new byte[38];
                        btk.k(array2, 0, 38);
                        g3 = new btp(array2, 4);
                    }
                    else {
                        if (g3 == null) {
                            throw new IllegalArgumentException();
                        }
                        if (g4 == 3) {
                            final bas bas3 = new bas(n7);
                            btk.k(bas3.a, 0, n7);
                            g3 = g3.e(bsb.f(bas3));
                        }
                        else if (g4 == 4) {
                            final bas bas4 = new bas(n7);
                            btk.k(bas4.a, 0, n7);
                            bas4.H(4);
                            g3 = new btp(g3.a, g3.b, g3.c, g3.d, g3.e, g3.g, g3.h, g3.j, g3.k, g3.d(bhq.d(Arrays.asList((Object[])bhq.h(bas4, false, false).a))), (byte[])null, (byte[])null);
                        }
                        else if (g4 == 6) {
                            final bas bas5 = new bas(n7);
                            btk.k(bas5.a, 0, n7);
                            bas5.H(4);
                            g3 = new btp(g3.a, g3.b, g3.c, g3.d, g3.e, g3.g, g3.h, g3.j, g3.k, g3.d(new Metadata((List)afeq.r((Object)PictureFrame.d(bas5)))), (byte[])null, (byte[])null);
                        }
                        else {
                            btk.m(n7);
                        }
                    }
                    final int a8 = bax.a;
                    this.g = g3;
                    if (q) {
                        dk.d((Object)g3);
                        this.h = Math.max(this.g.c, 6);
                        this.d.b(this.g.c(this.a, this.f));
                        this.e = 4;
                        return 0;
                    }
                }
            }
        }
        else {
            final bas bas6 = new bas(4);
            btk.k(bas6.a, 0, 4);
            if (bas6.q() == 1716281667L) {
                this.e = 3;
                return 0;
            }
            throw aza.a("Failed to read FLAC stream marker.", (Throwable)null);
        }
    }
}
