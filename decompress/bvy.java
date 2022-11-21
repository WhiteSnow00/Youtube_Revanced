import androidx.media3.common.Metadata$Entry;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import java.io.EOFException;
import androidx.media3.common.Metadata;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvy implements btm
{
    public boolean a;
    private final bat b;
    private final btx c;
    private final btu d;
    private final bug e;
    private btp f;
    private bug g;
    private bug h;
    private int i;
    private Metadata j;
    private long k;
    private long l;
    private long m;
    private int n;
    private bvz o;
    private final bhy p;
    
    public bvy() {
        this(null);
    }
    
    public bvy(final byte[] array) {
        this.b = new bat(10);
        this.c = new btx();
        this.d = new btu();
        this.k = -9223372036854775807L;
        this.p = new bhy();
        final btl btl = new btl();
        this.e = (bug)btl;
        this.h = (bug)btl;
    }
    
    private final int a(final btn btn) {
        final int i = this.i;
        final int n = 0;
        if (i == 0) {
            try {
                this.j(btn, false);
            }
            catch (final EOFException ex) {
                return -1;
            }
        }
        if (this.o == null) {
            final bat bat = new bat(this.c.c);
            btn.j(bat.a, 0, this.c.c);
            final btx c = this.c;
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
                if (bat.c >= n2 + 4) {
                    bat.G(n2);
                    final int d = bat.d();
                    if ((n3 = d) == 1483304551) {
                        break Label_0200;
                    }
                    if (d == 1231971951) {
                        n3 = 1231971951;
                        break Label_0200;
                    }
                }
                if (bat.c >= 40) {
                    bat.G(36);
                    if (bat.d() == 1447187017) {
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
                    final btg btg = (btg)btn;
                    final long b = btg.b;
                    final long c2 = btg.c;
                    final btx c3 = this.c;
                    bat.H(10);
                    final int d2 = bat.d();
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
                            final long y = baz.y(d2, n4 * 1000000L, d3);
                            final int m = bat.m();
                            final int j = bat.m();
                            final int l = bat.m();
                            bat.H(2);
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
                                            n8 = bat.l();
                                        }
                                        else {
                                            n8 = bat.k();
                                        }
                                    }
                                    else {
                                        n8 = bat.m();
                                    }
                                }
                                else {
                                    n8 = bat.i();
                                }
                                n6 += n8 * (long)j;
                            }
                            if (b != -1L && b != n6) {
                                final StringBuilder sb = new StringBuilder("VBRI data size mismatch: ");
                                sb.append(b);
                                sb.append(s);
                                sb.append(n6);
                                baq.c("VbriSeeker", sb.toString());
                            }
                            k = new bwa(array, array2, y, n6);
                        }
                    }
                    btn.m(this.c.c);
                }
                else {
                    btn.l();
                    k = null;
                }
            }
            else {
                final btg btg2 = (btg)btn;
                final long b2 = btg2.b;
                final long c4 = btg2.c;
                final btx c5 = this.c;
                final int g = c5.g;
                final int d4 = c5.d;
                final int d5 = bat.d();
                Object o = null;
                Label_0874: {
                    if ((d5 & 0x1) == 0x1) {
                        final int l2 = bat.l();
                        if (l2 != 0) {
                            final long y2 = baz.y(l2, g * 1000000L, d4);
                            bwb bwb;
                            if ((d5 & 0x6) != 0x6) {
                                bwb = new bwb(c4, c5.c, y2, -1L, (long[])null);
                            }
                            else {
                                final long q = bat.q();
                                final long[] array3 = new long[100];
                                for (int n9 = 0; n9 < 100; ++n9) {
                                    array3[n9] = bat.i();
                                }
                                if (b2 != -1L) {
                                    final long n10 = c4 + q;
                                    if (b2 != n10) {
                                        final StringBuilder sb2 = new StringBuilder("XING data size mismatch: ");
                                        sb2.append(b2);
                                        sb2.append(", ");
                                        sb2.append(n10);
                                        baq.c("XingSeeker", sb2.toString());
                                    }
                                }
                                bwb = new bwb(c4, c5.c, y2, q, array3);
                            }
                            o = bwb;
                            break Label_0874;
                        }
                    }
                    o = null;
                }
                if (o != null && !this.d.a()) {
                    btn.l();
                    btn.g(n2 + 141);
                    btn.j(this.b.a, 0, 3);
                    this.b.G(0);
                    final btu d6 = this.d;
                    final int k2 = this.b.k();
                    final int a2 = k2 >> 12;
                    final int b3 = k2 & 0xFFF;
                    if (a2 > 0 || b3 > 0) {
                        d6.a = a2;
                        d6.b = b3;
                    }
                }
                btn.m(this.c.c);
                if ((k = o) != null) {
                    k = o;
                    if (!((bvz)o).c()) {
                        k = o;
                        if (n3 == 1231971951) {
                            k = this.k(btn);
                        }
                    }
                }
            }
            final Metadata j2 = this.j;
            final btg btg3 = (btg)btn;
            long c6 = btg3.c;
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
                                            final long w = baz.w(Long.parseLong(textInformationFrame.b));
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
                                            k3 = new bvx(array4, array5, w);
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
                k3 = new buc(-9223372036854775807L);
            }
            else {
                if (k3 == null) {
                    if ((k3 = k) == null) {
                        k3 = null;
                    }
                }
                if (k3 != null) {
                    ((bvz)k3).c();
                }
                else {
                    k3 = this.k(btn);
                }
            }
            this.o = (bvz)k3;
            this.f.x((bud)k3);
            final bug h = this.h;
            final ayg ayg = new ayg();
            final btx c7 = this.c;
            ayg.k = c7.b;
            ayg.l = 4096;
            ayg.x = c7.e;
            ayg.y = c7.d;
            final btu d8 = this.d;
            ayg.A = d8.a;
            ayg.B = d8.b;
            ayg.i = this.j;
            h.b(ayg.a());
            this.m = btg3.c;
        }
        else {
            final long m2 = this.m;
            if (m2 != 0L) {
                final long c8 = ((btg)btn).c;
                if (c8 < m2) {
                    btn.m((int)(m2 - c8));
                }
            }
        }
        int n17;
        if ((n17 = this.n) == 0) {
            btn.l();
            if (this.i(btn)) {
                return -1;
            }
            this.b.G(0);
            final int d9 = this.b.d();
            if (!c(d9, this.i) || bty.a(d9) == -1) {
                btn.m(1);
                this.i = 0;
                return 0;
            }
            this.c.a(d9);
            if (this.k == -9223372036854775807L) {
                this.k = this.o.f(((btg)btn).c);
            }
            final btx c9 = this.c;
            n17 = c9.c;
            this.n = n17;
            final bvz o2 = this.o;
            if (o2 instanceof bvw) {
                final bvw bvw = (bvw)o2;
                this.b(this.l + c9.g);
                throw null;
            }
        }
        final int a5 = this.h.a((ayc)btn, n17, true);
        if (a5 != -1) {
            if ((this.n -= a5) > 0) {
                return 0;
            }
            this.h.e(this.b(this.l), 1, this.c.c, 0, (buf)null);
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
    
    private final boolean i(final btn btn) {
        final bvz o = this.o;
        if (o != null) {
            final long e = o.e();
            if (e != -1L) {
                if (btn.e() > e - 4L) {
                    return true;
                }
            }
        }
        try {
            return !btn.o(this.b.a, 0, 4, true);
        }
        catch (final EOFException ex) {
            return true;
        }
    }
    
    private final boolean j(final btn btn, final boolean b) {
        btn.l();
        int n;
        if (((btg)btn).c == 0L) {
            final Metadata d = this.p.d(btn, (bvn)null);
            if ((this.j = d) != null) {
                this.d.b(d);
            }
            n = (int)btn.e();
            if (!b) {
                btn.m(n);
            }
        }
        else {
            n = 0;
        }
        int i = 0;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            while (!this.i(btn)) {
                this.b.G(0);
                final int d2 = this.b.d();
                if (i == 0 || c(d2, i)) {
                    final int a = bty.a(d2);
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
                                    btn.m(n + n3);
                                }
                                else {
                                    btn.l();
                                }
                                this.i = i;
                                return true;
                            }
                        }
                        btn.g(a - 4);
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
                    throw azb.a("Searched too many bytes.", null);
                }
                else {
                    if (b) {
                        btn.l();
                        btn.g(n + n7);
                    }
                    else {
                        btn.m(1);
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
    
    private final bvz k(final btn btn) {
        btn.j(this.b.a, 0, 4);
        this.b.G(0);
        this.c.a(this.b.d());
        final btg btg = (btg)btn;
        final long b = btg.b;
        final long c = btg.c;
        final btx c2 = this.c;
        return (bvz)new btf(b, c, c2.f, c2.c);
    }
    
    public final void d(final btp f) {
        this.f = f;
        final bug q = f.q(0, 1);
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
        final bvz o = this.o;
        if (!(o instanceof bvw)) {
            return;
        }
        final bvw bvw = (bvw)o;
        throw null;
    }
    
    public final boolean g(final btn btn) {
        return this.j(btn, true);
    }
    
    public final int h(final btn btn, final pbg pbg) {
        bad.c(this.g);
        final int a = baz.a;
        final int a2 = this.a(btn);
        if (a2 == -1 && this.o instanceof bvw && this.o.a() != this.b(this.l)) {
            final bvw bvw = (bvw)this.o;
            throw null;
        }
        return a2;
    }
}
