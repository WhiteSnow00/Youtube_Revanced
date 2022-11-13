import androidx.media3.common.Metadata$Entry;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import java.io.EOFException;
import androidx.media3.common.Metadata;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvv implements btj
{
    public boolean a;
    private final bas b;
    private final btu c;
    private final btr d;
    private final bud e;
    private btm f;
    private bud g;
    private bud h;
    private int i;
    private Metadata j;
    private long k;
    private long l;
    private long m;
    private int n;
    private bvw o;
    private final bhv p;
    
    public bvv() {
        this(null);
    }
    
    public bvv(final byte[] array) {
        this.b = new bas(10);
        this.c = new btu();
        this.d = new btr();
        this.k = -9223372036854775807L;
        this.p = new bhv();
        final bti bti = new bti();
        this.e = (bud)bti;
        this.h = (bud)bti;
    }
    
    private final int a(final btk btk) {
        final int i = this.i;
        final int n = 0;
        if (i == 0) {
            try {
                this.j(btk, false);
            }
            catch (final EOFException ex) {
                return -1;
            }
        }
        if (this.o == null) {
            final bas bas = new bas(this.c.c);
            btk.j(bas.a, 0, this.c.c);
            final btu c = this.c;
            final int a = c.a;
            int n2 = 21;
            if ((a & 0x1) != 0x0) {
                if (c.e != 1) {
                    n2 = 36;
                }
            }
            else if (c.e == 1) {
                n2 = 13;
            }
            int n3 = 0;
            Label_0200: {
                if (bas.c >= n2 + 4) {
                    bas.G(n2);
                    final int d = bas.d();
                    if ((n3 = d) == 1483304551) {
                        break Label_0200;
                    }
                    if (d == 1231971951) {
                        n3 = 1231971951;
                        break Label_0200;
                    }
                }
                if (bas.c >= 40) {
                    bas.G(36);
                    if (bas.d() == 1447187017) {
                        n3 = 1447187017;
                        break Label_0200;
                    }
                }
                n3 = 0;
            }
            final String s = ", ";
            Object k;
            if (n3 != 1483304551 && n3 != 1231971951) {
                if (n3 == 1447187017) {
                    final btd btd = (btd)btk;
                    final long b = btd.b;
                    final long c2 = btd.c;
                    final btu c3 = this.c;
                    bas.H(10);
                    final int d2 = bas.d();
                    Label_0574: {
                        if (d2 <= 0) {
                            k = null;
                        }
                        else {
                            final int d3 = c3.d;
                            int n4;
                            if (d3 >= 32000) {
                                n4 = 1152;
                            }
                            else {
                                n4 = 576;
                            }
                            final long y = bax.y((long)d2, n4 * 1000000L, (long)d3);
                            final int m = bas.m();
                            final int j = bas.m();
                            final int l = bas.m();
                            bas.H(2);
                            final long n5 = c3.c;
                            final long[] array = new long[m];
                            final long[] array2 = new long[m];
                            long n6 = c2;
                            for (int n7 = n; n7 < m; ++n7) {
                                array[n7] = n7 * y / m;
                                array2[n7] = Math.max(n6, n5 + c2);
                                int n8;
                                if (l != 1) {
                                    if (l != 2) {
                                        if (l != 3) {
                                            if (l != 4) {
                                                k = null;
                                                break Label_0574;
                                            }
                                            n8 = bas.l();
                                        }
                                        else {
                                            n8 = bas.k();
                                        }
                                    }
                                    else {
                                        n8 = bas.m();
                                    }
                                }
                                else {
                                    n8 = bas.i();
                                }
                                n6 += n8 * (long)j;
                            }
                            if (b != -1L && b != n6) {
                                final StringBuilder sb = new StringBuilder("VBRI data size mismatch: ");
                                sb.append(b);
                                sb.append(s);
                                sb.append(n6);
                                bap.c("VbriSeeker", sb.toString());
                            }
                            k = new bvx(array, array2, y, n6);
                        }
                    }
                    btk.m(this.c.c);
                }
                else {
                    btk.l();
                    k = null;
                }
            }
            else {
                final btd btd2 = (btd)btk;
                final long b2 = btd2.b;
                final long c4 = btd2.c;
                final btu c5 = this.c;
                final int g = c5.g;
                final int d4 = c5.d;
                final int d5 = bas.d();
                Object o = null;
                Label_0874: {
                    if ((d5 & 0x1) == 0x1) {
                        final int l2 = bas.l();
                        if (l2 != 0) {
                            final long y2 = bax.y((long)l2, g * 1000000L, (long)d4);
                            bvy bvy;
                            if ((d5 & 0x6) != 0x6) {
                                bvy = new bvy(c4, c5.c, y2, -1L, null);
                            }
                            else {
                                final long q = bas.q();
                                final long[] array3 = new long[100];
                                for (int n9 = 0; n9 < 100; ++n9) {
                                    array3[n9] = bas.i();
                                }
                                if (b2 != -1L) {
                                    final long n10 = c4 + q;
                                    if (b2 != n10) {
                                        final StringBuilder sb2 = new StringBuilder("XING data size mismatch: ");
                                        sb2.append(b2);
                                        sb2.append(", ");
                                        sb2.append(n10);
                                        bap.c("XingSeeker", sb2.toString());
                                    }
                                }
                                bvy = new bvy(c4, c5.c, y2, q, array3);
                            }
                            o = bvy;
                            break Label_0874;
                        }
                    }
                    o = null;
                }
                if (o != null && !this.d.a()) {
                    btk.l();
                    btk.g(n2 + 141);
                    btk.j(this.b.a, 0, 3);
                    this.b.G(0);
                    final btr d6 = this.d;
                    final int k2 = this.b.k();
                    final int a2 = k2 >> 12;
                    final int b3 = k2 & 0xFFF;
                    if (a2 > 0 || b3 > 0) {
                        d6.a = a2;
                        d6.b = b3;
                    }
                }
                btk.m(this.c.c);
                if ((k = o) != null) {
                    k = o;
                    if (!((bvw)o).c()) {
                        k = o;
                        if (n3 == 1231971951) {
                            k = this.k(btk);
                        }
                    }
                }
            }
            final Metadata j2 = this.j;
            final btd btd3 = (btd)btk;
            long c6 = btd3.c;
            Object k3 = null;
            Label_1309: {
                if (j2 != null) {
                    for (int a3 = j2.a(), n11 = 0; n11 < a3; ++n11) {
                        final Metadata$Entry b4 = j2.b(n11);
                        if (b4 instanceof MlltFrame) {
                            final MlltFrame mlltFrame = (MlltFrame)b4;
                            while (true) {
                                for (int a4 = j2.a(), n12 = 0; n12 < a4; ++n12) {
                                    final Metadata$Entry b5 = j2.b(n12);
                                    if (b5 instanceof TextInformationFrame) {
                                        final TextInformationFrame textInformationFrame = (TextInformationFrame)b5;
                                        if (textInformationFrame.f.equals("TLEN")) {
                                            final long w = bax.w(Long.parseLong(textInformationFrame.b));
                                            final int length = mlltFrame.d.length;
                                            final int n13 = length + 1;
                                            final long[] array4 = new long[n13];
                                            final long[] array5 = new long[n13];
                                            array4[0] = c6;
                                            array5[0] = 0L;
                                            int n14 = 1;
                                            long n15 = 0L;
                                            while (n14 <= length) {
                                                final int b6 = mlltFrame.b;
                                                final int[] d7 = mlltFrame.d;
                                                final int n16 = n14 - 1;
                                                c6 += b6 + d7[n16];
                                                n15 += mlltFrame.c + mlltFrame.e[n16];
                                                array4[n14] = c6;
                                                array5[n14] = n15;
                                                ++n14;
                                            }
                                            k3 = new bvu(array4, array5, w);
                                            break Label_1309;
                                        }
                                    }
                                }
                                final long w = -9223372036854775807L;
                                continue;
                            }
                        }
                    }
                }
                k3 = null;
            }
            if (this.a) {
                k3 = new btz(-9223372036854775807L);
            }
            else {
                if (k3 == null) {
                    if ((k3 = k) == null) {
                        k3 = null;
                    }
                }
                if (k3 != null) {
                    ((bvw)k3).c();
                }
                else {
                    k3 = this.k(btk);
                }
            }
            this.o = (bvw)k3;
            this.f.x((bua)k3);
            final bud h = this.h;
            final ayf ayf = new ayf();
            final btu c7 = this.c;
            ayf.k = c7.b;
            ayf.l = 4096;
            ayf.x = c7.e;
            ayf.y = c7.d;
            final btr d8 = this.d;
            ayf.A = d8.a;
            ayf.B = d8.b;
            ayf.i = this.j;
            h.b(ayf.a());
            this.m = btd3.c;
        }
        else {
            final long m2 = this.m;
            if (m2 != 0L) {
                final long c8 = ((btd)btk).c;
                if (c8 < m2) {
                    btk.m((int)(m2 - c8));
                }
            }
        }
        int n17;
        if ((n17 = this.n) == 0) {
            btk.l();
            if (this.i(btk)) {
                return -1;
            }
            this.b.G(0);
            final int d9 = this.b.d();
            if (!c(d9, this.i) || btv.a(d9) == -1) {
                btk.m(1);
                this.i = 0;
                return 0;
            }
            this.c.a(d9);
            if (this.k == -9223372036854775807L) {
                this.k = this.o.f(((btd)btk).c);
            }
            final btu c9 = this.c;
            n17 = c9.c;
            this.n = n17;
            final bvw o2 = this.o;
            if (o2 instanceof bvt) {
                final bvt bvt = (bvt)o2;
                this.b(this.l + c9.g);
                throw null;
            }
        }
        final int a5 = this.h.a((ayb)btk, n17, true);
        if (a5 != -1) {
            if ((this.n -= a5) > 0) {
                return 0;
            }
            this.h.e(this.b(this.l), 1, this.c.c, 0, (buc)null);
            this.l += this.c.g;
            return this.n = 0;
        }
        return -1;
        n18 = 0;
        return n18;
    }
    
    private final long b(final long n) {
        return this.k + n * 1000000L / this.c.d;
    }
    
    private static boolean c(final int n, final long n2) {
        return (n & 0xFFFE0C00) == (n2 & 0xFFFFFFFFFFFE0C00L);
    }
    
    private final boolean i(final btk btk) {
        final bvw o = this.o;
        if (o != null) {
            final long e = o.e();
            if (e != -1L) {
                if (btk.e() > e - 4L) {
                    return true;
                }
            }
        }
        try {
            return !btk.o(this.b.a, 0, 4, true);
        }
        catch (final EOFException ex) {
            return true;
        }
    }
    
    private final boolean j(final btk btk, final boolean b) {
        btk.l();
        int n;
        if (((btd)btk).c == 0L) {
            final Metadata d = this.p.d(btk, null);
            if ((this.j = d) != null) {
                this.d.b(d);
            }
            n = (int)btk.e();
            if (!b) {
                btk.m(n);
            }
        }
        else {
            n = 0;
        }
        int i = 0;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            while (!this.i(btk)) {
                this.b.G(0);
                final int d2 = this.b.d();
                if (i == 0 || c(d2, i)) {
                    final int a = btv.a(d2);
                    if (a != -1) {
                        final int n4 = n2 + 1;
                        int n5;
                        if (n4 == 1) {
                            this.c.a(d2);
                            n5 = d2;
                        }
                        else {
                            n5 = i;
                            if (n4 == 4) {
                                if (b) {
                                    btk.m(n + n3);
                                }
                                else {
                                    btk.l();
                                }
                                this.i = i;
                                return true;
                            }
                        }
                        btk.g(a - 4);
                        i = n5;
                        n2 = n4;
                        continue;
                    }
                }
                int n6;
                if (!b) {
                    n6 = 131072;
                }
                else {
                    n6 = 32768;
                }
                final int n7 = n3 + 1;
                if (n3 == n6) {
                    if (b) {
                        return false;
                    }
                    throw aza.a("Searched too many bytes.", (Throwable)null);
                }
                else {
                    if (b) {
                        btk.l();
                        btk.g(n + n7);
                    }
                    else {
                        btk.m(1);
                    }
                    n3 = n7;
                    i = 0;
                    n2 = 0;
                }
            }
            if (n2 > 0) {
                continue;
            }
            break;
        }
        throw new EOFException();
    }
    
    private final bvw k(final btk btk) {
        btk.j(this.b.a, 0, 4);
        this.b.G(0);
        this.c.a(this.b.d());
        final btd btd = (btd)btk;
        final long b = btd.b;
        final long c = btd.c;
        final btu c2 = this.c;
        return new btc(b, c, c2.f, c2.c);
    }
    
    public final void d(final btm f) {
        this.f = f;
        final bud q = f.q(0, 1);
        this.g = q;
        this.h = q;
        this.f.r();
    }
    
    public final void e() {
    }
    
    public final void f(final long n, final long n2) {
        this.i = 0;
        this.k = -9223372036854775807L;
        this.l = 0L;
        this.n = 0;
        final bvw o = this.o;
        if (!(o instanceof bvt)) {
            return;
        }
        final bvt bvt = (bvt)o;
        throw null;
    }
    
    public final boolean g(final btk btk) {
        return this.j(btk, true);
    }
    
    public final int h(final btk btk, final paq paq) {
        dk.e((Object)this.g);
        final int a = bax.a;
        final int a2 = this.a(btk);
        if (a2 == -1 && this.o instanceof bvt && this.o.a() != this.b(this.l)) {
            final bvt bvt = (bvt)this.o;
            throw null;
        }
        return a2;
    }
}
