import java.nio.ByteBuffer;
import org.brotli.dec.Dictionary;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class atzu
{
    static final int[] a;
    static final int[] b;
    static final int[] c;
    static final short[] d;
    static final short[] e;
    static final short[] f;
    private static final int[] g;
    private static final int[] h;
    private static final int[] i;
    private static final int[] j;
    
    static {
        a = new int[] { 256, 402, 436, 468, 500, 534, 566, 598, 630, 662, 694, 726, 758, 790, 822, 854, 886, 920, 952, 984, 1016, 1048, 1080 };
        g = new int[] { 1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        h = new int[] { 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3 };
        i = new int[] { 0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3 };
        j = new int[] { 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149 };
        b = new int[] { 1, 5, 9, 13, 17, 25, 33, 41, 49, 65, 81, 97, 113, 145, 177, 209, 241, 305, 369, 497, 753, 1265, 2289, 4337, 8433, 16625 };
        c = new int[] { 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 24 };
        d = new short[] { 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 12, 14, 24 };
        e = new short[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 24 };
        final short[] array = f = new short[2816];
        final short[] array2 = new short[24];
        final short[] array3 = new short[24];
        array3[0] = 2;
        int n;
        for (int k = 0; k < 23; k = n) {
            n = k + 1;
            array2[n] = (short)(array2[k] + (1 << atzu.d[k]));
            array3[n] = (short)(array3[k] + (1 << atzu.e[k]));
        }
        for (int l = 0; l < 704; ++l) {
            int n2 = l >>> 6;
            int n3;
            if (n2 >= 2) {
                n2 -= 2;
                n3 = 0;
            }
            else {
                n3 = -4;
            }
            final int n4 = n2 + n2;
            final int n5 = (170064 >>> n4 & 0x3) << 3 | (l >>> 3 & 0x7);
            final int n6 = (156228 >>> n4 & 0x3) << 3 | (l & 0x7);
            final short n7 = array3[n6];
            int n8;
            if (n7 > 4) {
                n8 = 3;
            }
            else {
                n8 = n7 - 2;
            }
            final int n9 = l * 4;
            array[n9] = (short)(atzu.e[n6] << 8 | atzu.d[n5]);
            array[n9 + 1] = array2[n5];
            array[n9 + 2] = n7;
            array[n9 + 3] = (short)(n3 + n8);
        }
    }
    
    static void a(final atzw atzw) {
        final int q = atzw.q;
        if (q == 0) {
            throw new IllegalStateException("State MUST be initialized");
        }
        if (q == 11) {
            return;
        }
        atzw.q = 11;
        final InputStream ap = atzw.ap;
        if (ap != null) {
            ap.close();
            atzw.ap = null;
        }
    }
    
    static void b(final atzw atzw) {
        final int q = atzw.q;
        if (q == 0) {
            throw new IllegalStateException("Can't decompress until initialized");
        }
        if (q == 11) {
            throw new IllegalStateException("Can't decompress after close");
        }
        if (q == 1) {
            final int ai = atzw.ai;
            atzw.ai = 0;
            atzq.i(atzw);
            int n = 0;
            Label_0139: {
                if (atzq.d(atzw, 1) == 0) {
                    n = 16;
                }
                else {
                    final int d = atzq.d(atzw, 3);
                    n = 17;
                    if (d != 0) {
                        n = 17 + d;
                    }
                    else {
                        final int d2 = atzq.d(atzw, 3);
                        if (d2 != 0) {
                            if (d2 == 1) {
                                if (ai != 0) {
                                    atzw.ai = 1;
                                    if (atzq.d(atzw, 1) != 1) {
                                        final int d3 = atzq.d(atzw, 6);
                                        if (d3 >= 10) {
                                            if ((n = d3) <= 30) {
                                                break Label_0139;
                                            }
                                        }
                                    }
                                }
                                n = -1;
                            }
                            else {
                                n = d2 + 8;
                            }
                        }
                    }
                }
            }
            if (n == -1) {
                throw new atzs("Invalid 'windowBits' code");
            }
            final int z = 1 << n;
            atzw.Z = z;
            atzw.Y = z - 16;
            atzw.q = 2;
        }
        int n2 = e(atzw);
        int n3 = atzw.aa - 1;
        byte[] array = atzw.a;
    Label_1618_Outer:
        while (true) {
            final int n4 = 8;
            final int q2 = atzw.q;
            if (q2 != 10) {
                Label_2481: {
                    while (true) {
                        Label_1782: {
                            Label_1606: {
                                switch (q2) {
                                    default: {
                                        final StringBuilder sb = new StringBuilder("Unexpected state ");
                                        sb.append(q2);
                                        throw new atzs(sb.toString());
                                    }
                                    case 14: {
                                        final int h = atzw.H;
                                        final int ak = atzw.ak;
                                        final int al = atzw.al;
                                        if (h >= n2) {
                                            atzw.r = 14;
                                            atzw.q = 12;
                                            return;
                                        }
                                        atzw.q = 4;
                                        continue Label_1618_Outer;
                                    }
                                    case 12: {
                                        atzw.ag = Math.min(atzw.H, atzw.aa);
                                        atzw.q = 13;
                                    }
                                    case 13: {
                                        final int min = Math.min(atzw.ad - atzw.ae, atzw.ag - atzw.af);
                                        if (min != 0) {
                                            System.arraycopy(atzw.a, atzw.af, atzw.f, atzw.ac + atzw.ae, min);
                                            atzw.ae += min;
                                            atzw.af += min;
                                        }
                                        if (atzw.ae < atzw.ad) {
                                            final int h2 = atzw.H;
                                            final int y = atzw.Y;
                                            if (h2 >= y) {
                                                atzw.I = y;
                                            }
                                            final int aa = atzw.aa;
                                            if (h2 >= aa) {
                                                if (h2 > aa) {
                                                    atzy.b(array, 0, aa, h2);
                                                }
                                                atzw.H &= n3;
                                                atzw.af = 0;
                                            }
                                            atzw.q = atzw.r;
                                            continue Label_1618_Outer;
                                        }
                                        return;
                                    }
                                    case 9: {
                                        final int w = atzw.W;
                                        if (w > 2147483644) {
                                            throw new atzs("Invalid backward reference");
                                        }
                                        final int n5 = w - atzw.I - 1;
                                        final int aj = atzw.aj;
                                        if (n5 < 0) {
                                            final int n6 = -n5;
                                            final int x = atzw.X;
                                            int an;
                                            if ((an = atzw.an) == -1) {
                                                atzw.ao = new byte[256];
                                                an = n4;
                                                while (true) {
                                                    final int aj2 = atzw.aj;
                                                    if (-1 >>> an == 0) {
                                                        break;
                                                    }
                                                    ++an;
                                                }
                                                an -= 8;
                                                atzw.an = an;
                                            }
                                            final byte b = atzw.ao[n6 - 1 >>> an];
                                            final int[] am = atzw.am;
                                            throw null;
                                        }
                                        ByteBuffer byteBuffer = Dictionary.a;
                                        if (byteBuffer == null) {
                                            if (!atzv.a) {
                                                throw new atzs("brotli dictionary is not set");
                                            }
                                            byteBuffer = Dictionary.a;
                                        }
                                        final int x2 = atzw.X;
                                        if (x2 > 31) {
                                            throw new atzs("Invalid backward reference");
                                        }
                                        final int n7 = Dictionary.c[x2];
                                        if (n7 == 0) {
                                            throw new atzs("Invalid backward reference");
                                        }
                                        final int n8 = n5 >>> n7;
                                        final int n9 = Dictionary.b[x2];
                                        final auhr a = atzx.a;
                                        if (n8 >= 121) {
                                            throw new atzs("Invalid backward reference");
                                        }
                                        final int a2 = atzx.a(atzw.a, atzw.H, byteBuffer, n9 + (n5 & (1 << n7) - 1) * x2, x2, a, n8);
                                        final int h3 = atzw.H + a2;
                                        atzw.H = h3;
                                        atzw.x -= a2;
                                        if (h3 >= n2) {
                                            atzw.r = 4;
                                            atzw.q = 12;
                                            continue Label_1618_Outer;
                                        }
                                        atzw.q = 4;
                                        continue Label_1618_Outer;
                                    }
                                    case 8: {
                                        break Label_2481;
                                    }
                                    case 7: {
                                        break Label_1782;
                                    }
                                    case 6: {
                                        final byte[] a3 = atzw.a;
                                        final int x3 = atzw.x;
                                        if (x3 <= 0) {
                                            atzq.m(atzw);
                                            atzw.q = 2;
                                            continue Label_1618_Outer;
                                        }
                                        final int min2 = Math.min(atzw.aa - atzw.H, x3);
                                        atzq.g(atzw, a3, atzw.H, min2);
                                        atzw.x -= min2;
                                        if ((atzw.H += min2) == atzw.aa) {
                                            atzw.r = 6;
                                            atzw.q = 12;
                                            continue Label_1618_Outer;
                                        }
                                        atzq.m(atzw);
                                        atzw.q = 2;
                                        continue Label_1618_Outer;
                                    }
                                    case 5: {
                                        while (atzw.x > 0) {
                                            atzq.l(atzw);
                                            atzq.i(atzw);
                                            atzq.d(atzw, 8);
                                            --atzw.x;
                                        }
                                        atzw.q = 2;
                                        continue Label_1618_Outer;
                                    }
                                    case 4: {
                                        break Label_1606;
                                    }
                                    case 3: {
                                        final int c = h(atzw) + 1;
                                        atzw.C = c;
                                        atzw.B = l(atzw, 0, c);
                                        final int e = h(atzw) + 1;
                                        atzw.E = e;
                                        atzw.D = l(atzw, 1, e);
                                        final int g = h(atzw) + 1;
                                        atzw.G = g;
                                        atzw.F = l(atzw, 2, g);
                                        atzq.l(atzw);
                                        atzq.i(atzw);
                                        atzw.V = atzq.d(atzw, 2);
                                        atzw.U = atzq.d(atzw, 4) << atzw.V;
                                        atzw.b = new byte[atzw.C];
                                        int i = 0;
                                        int c2;
                                        while (true) {
                                            c2 = atzw.C;
                                            if (i >= c2) {
                                                break;
                                            }
                                            while (i < Math.min(i + 96, c2)) {
                                                atzq.i(atzw);
                                                atzw.b[i] = (byte)atzq.d(atzw, 2);
                                                ++i;
                                            }
                                            atzq.l(atzw);
                                        }
                                        final int n10 = c2 << 6;
                                        atzw.c = new byte[n10];
                                        final int g2 = g(n10, atzw.c, atzw);
                                        atzw.K = 1;
                                        for (int j = 0; j < atzw.C << 6; ++j) {
                                            if (atzw.c[j] != j >> 6) {
                                                atzw.K = 0;
                                                break;
                                            }
                                        }
                                        final int n11 = atzw.G << 2;
                                        atzw.d = new byte[n11];
                                        final int g3 = g(n11, atzw.d, atzw);
                                        atzw.l = o(256, 256, g2, atzw);
                                        atzw.m = o(704, 704, atzw.E, atzw);
                                        final int v = atzw.V;
                                        final int u = atzw.U;
                                        int n12 = d(v, u, 24);
                                        int p;
                                        if (atzw.ai == 1) {
                                            n12 = d(v, u, 62);
                                            p = p(v, u);
                                        }
                                        else {
                                            p = n12;
                                        }
                                        atzw.n = o(n12, p, g3, atzw);
                                        final byte[] e2 = atzw.e;
                                        final int[] o = atzw.o;
                                        final int v2 = atzw.V;
                                        int u2;
                                        int k;
                                        int n13;
                                        for (u2 = atzw.U, k = 0, n13 = 16; k < u2; ++k, o[n13] = k, ++n13) {
                                            e2[n13] = 0;
                                        }
                                        int l = n13;
                                        int n14 = 0;
                                        int n15 = 1;
                                        while (l < p) {
                                            for (int n16 = 0; n16 < 1 << v2; ++n16) {
                                                e2[l] = (byte)n15;
                                                o[l] = u2 + ((n14 + 2 << n15) - 4 << v2) + 1 + n16;
                                                ++l;
                                            }
                                            n15 += n14;
                                            n14 ^= 0x1;
                                        }
                                        atzw.P = 0;
                                        atzw.Q = 0;
                                        final int r = atzw.b[0] * 512;
                                        atzw.R = r;
                                        atzw.S = r + 256;
                                        atzw.L = 0;
                                        atzw.M = 0;
                                        final int[] m = atzw.j;
                                        m[4] = 1;
                                        m[5] = 0;
                                        m[6] = 1;
                                        m[7] = 0;
                                        m[8] = 1;
                                        m[9] = 0;
                                        atzw.q = 4;
                                        break Label_1606;
                                    }
                                    case 2: {
                                        if (atzw.x >= 0) {
                                            if (atzw.y != 0) {
                                                atzw.r = 10;
                                                atzw.q = 12;
                                            }
                                            else {
                                                atzw.l = new int[0];
                                                atzw.m = new int[0];
                                                atzw.n = new int[0];
                                                atzq.l(atzw);
                                                atzq.i(atzw);
                                                final int d4 = atzq.d(atzw, 1);
                                                atzw.y = d4;
                                                atzw.x = 0;
                                                atzw.z = 0;
                                                atzw.A = 0;
                                                Label_2924: {
                                                    if (d4 == 0 || atzq.d(atzw, 1) == 0) {
                                                        final int n17 = atzq.d(atzw, 2) + 4;
                                                        if (n17 == 7) {
                                                            atzw.A = 1;
                                                            if (atzq.d(atzw, 1) != 0) {
                                                                throw new atzs("Corrupted reserved bit");
                                                            }
                                                            final int d5 = atzq.d(atzw, 2);
                                                            if (d5 == 0) {
                                                                break Label_2924;
                                                            }
                                                            for (int n18 = 0; n18 < d5; ++n18) {
                                                                atzq.i(atzw);
                                                                int d6;
                                                                if ((d6 = atzq.d(atzw, 8)) == 0) {
                                                                    if (n18 + 1 == d5 && d5 > 1) {
                                                                        throw new atzs("Exuberant nibble");
                                                                    }
                                                                    d6 = 0;
                                                                }
                                                                atzw.x |= d6 << n18 * 8;
                                                            }
                                                        }
                                                        else {
                                                            for (int n19 = 0; n19 < n17; ++n19) {
                                                                atzq.i(atzw);
                                                                int d7;
                                                                if ((d7 = atzq.d(atzw, 4)) == 0) {
                                                                    if (n19 + 1 == n17 && n17 > 4) {
                                                                        throw new atzs("Exuberant nibble");
                                                                    }
                                                                    d7 = 0;
                                                                }
                                                                atzw.x |= d7 << n19 * 4;
                                                            }
                                                        }
                                                        ++atzw.x;
                                                        if (atzw.y == 0) {
                                                            atzw.z = atzq.d(atzw, 1);
                                                        }
                                                    }
                                                }
                                                if (atzw.x != 0 || atzw.A != 0) {
                                                    int a4 = 0;
                                                    Label_3234: {
                                                        if (atzw.z == 0) {
                                                            a4 = atzw.A;
                                                            if (a4 == 0) {
                                                                atzw.q = 3;
                                                                break Label_3234;
                                                            }
                                                        }
                                                        atzq.k(atzw);
                                                        final int a5 = atzw.A;
                                                        int q3;
                                                        if (a5 == 0) {
                                                            q3 = 6;
                                                        }
                                                        else {
                                                            q3 = 5;
                                                        }
                                                        atzw.q = q3;
                                                        a4 = a5;
                                                    }
                                                    if (a4 == 0) {
                                                        final int ab = atzw.ab + atzw.x;
                                                        atzw.ab = ab;
                                                        int n20;
                                                        if ((n20 = ab) > 1073741824) {
                                                            atzw.ab = 1073741824;
                                                            n20 = 1073741824;
                                                        }
                                                        final int aa2 = atzw.aa;
                                                        int z2 = atzw.Z;
                                                        if (aa2 < z2) {
                                                            int aa3;
                                                            if ((aa3 = z2) > n20) {
                                                                while (true) {
                                                                    final int n21 = z2 >> 1;
                                                                    if (n21 <= n20) {
                                                                        break;
                                                                    }
                                                                    z2 = n21;
                                                                }
                                                                aa3 = z2;
                                                                if (atzw.y == 0 && (aa3 = z2) < 16384) {
                                                                    aa3 = z2;
                                                                    if (atzw.Z >= 16384) {
                                                                        aa3 = 16384;
                                                                    }
                                                                }
                                                            }
                                                            final int aa4 = atzw.aa;
                                                            if (aa3 > aa4) {
                                                                final byte[] a6 = new byte[aa3 + 37];
                                                                final byte[] a7 = atzw.a;
                                                                if (a7.length != 0) {
                                                                    System.arraycopy(a7, 0, a6, 0, aa4);
                                                                }
                                                                atzw.a = a6;
                                                                atzw.aa = aa3;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            n2 = e(atzw);
                                            final int aa5 = atzw.aa;
                                            array = atzw.a;
                                            n3 = aa5 - 1;
                                            continue Label_1618_Outer;
                                        }
                                        throw new atzs("Invalid metablock length");
                                    }
                                }
                                continue Label_1618_Outer;
                            }
                            if (atzw.x > 0) {
                                atzq.l(atzw);
                                int d8;
                                if ((d8 = atzw.D) == 0) {
                                    d8 = f(atzw, 1, atzw.E);
                                    atzw.D = d8;
                                    atzw.M = atzw.j[7];
                                }
                                atzw.D = d8 - 1;
                                atzq.i(atzw);
                                final int n22 = m(atzw.m, atzw.M, atzw) << 2;
                                final short[] f = atzu.f;
                                final short n23 = f[n22];
                                final short n24 = f[n22 + 1];
                                final short n25 = f[n22 + 2];
                                atzw.T = f[n22 + 3];
                                atzq.i(atzw);
                                atzw.O = n24 + atzq.c(atzw, n23 & 0xFF);
                                atzq.i(atzw);
                                atzw.X = n25 + atzq.c(atzw, n23 >> 8);
                                atzw.N = 0;
                                atzw.q = 7;
                                break Label_1782;
                            }
                            atzw.q = 2;
                            continue Label_1618_Outer;
                        }
                        if (atzw.K != 0) {
                            while (atzw.N < atzw.O) {
                                atzq.l(atzw);
                                if (atzw.B == 0) {
                                    n(atzw);
                                }
                                --atzw.B;
                                atzq.i(atzw);
                                array[atzw.H] = (byte)m(atzw.l, atzw.L, atzw);
                                final int h4 = atzw.H + 1;
                                atzw.H = h4;
                                ++atzw.N;
                                if (h4 >= n2) {
                                    atzw.r = 7;
                                    atzw.q = 12;
                                    break;
                                }
                            }
                        }
                        else {
                            final int h5 = atzw.H;
                            int n26 = array[h5 - 1 & n3] & 0xFF;
                            int n27 = array[h5 - 2 & n3] & 0xFF;
                            while (atzw.N < atzw.O) {
                                atzq.l(atzw);
                                if (atzw.B == 0) {
                                    n(atzw);
                                }
                                final byte b2 = atzw.c[atzw.P + (atzt.a[atzw.S + n27] | atzt.a[atzw.R + n26])];
                                --atzw.B;
                                atzq.i(atzw);
                                final int m2 = m(atzw.l, b2 & 0xFF, atzw);
                                int h6 = atzw.H;
                                array[h6] = (byte)m2;
                                ++h6;
                                atzw.H = h6;
                                ++atzw.N;
                                if (h6 >= n2) {
                                    atzw.r = 7;
                                    atzw.q = 12;
                                    break;
                                }
                                n27 = n26;
                                n26 = m2;
                            }
                        }
                        if (atzw.q != 7) {
                            continue;
                        }
                        if ((atzw.x -= atzw.O) <= 0) {
                            atzw.q = 4;
                            continue;
                        }
                        break;
                    }
                    int n28 = atzw.T;
                    int w2;
                    if (n28 < 0) {
                        w2 = atzw.j[atzw.J];
                        atzw.W = w2;
                    }
                    else {
                        atzq.l(atzw);
                        int f2;
                        if ((f2 = atzw.F) == 0) {
                            f2 = f(atzw, 2, atzw.G);
                            atzw.F = f2;
                            atzw.Q = atzw.j[9] << 2;
                        }
                        atzw.F = f2 - 1;
                        atzq.i(atzw);
                        n28 = m(atzw.n, atzw.d[atzw.Q + n28] & 0xFF, atzw);
                        if (n28 < 16) {
                            w2 = atzw.j[atzw.J + atzu.h[n28] & 0x3] + atzu.i[n28];
                            if ((atzw.W = w2) < 0) {
                                throw new atzs("Negative distance");
                            }
                        }
                        else {
                            final byte b3 = atzw.e[n28];
                            int n29;
                            if (atzw.t + b3 <= atzq.a) {
                                n29 = atzq.d(atzw, b3);
                            }
                            else {
                                atzq.i(atzw);
                                n29 = atzq.c(atzw, b3);
                            }
                            w2 = (n29 << atzw.V) + atzw.o[n28];
                            atzw.W = w2;
                        }
                    }
                    final int i2 = atzw.I;
                    int y2 = atzw.Y;
                    Label_2415: {
                        if (i2 != y2) {
                            final int h7 = atzw.H;
                            if (h7 < y2) {
                                atzw.I = h7;
                                y2 = h7;
                                break Label_2415;
                            }
                        }
                        atzw.I = y2;
                    }
                    if (w2 > y2) {
                        atzw.q = 9;
                        continue Label_1618_Outer;
                    }
                    if (n28 > 0) {
                        final int j2 = atzw.J + 1 & 0x3;
                        atzw.J = j2;
                        atzw.j[j2] = w2;
                    }
                    if (atzw.X > atzw.x) {
                        throw new atzs("Invalid backward reference");
                    }
                    atzw.N = 0;
                    atzw.q = 8;
                }
                int h8 = atzw.H;
                int n30 = h8 - atzw.W & n3;
                final int n31 = atzw.X - atzw.N;
                final int n32 = n30 + n31;
                final int n33 = h8 + n31;
                Label_2798: {
                    if (n32 < n3) {
                        if (n33 < n3) {
                            if (n31 >= 12 && (n32 <= h8 || n33 <= n30)) {
                                atzy.b(array, h8, n30, n32);
                            }
                            else {
                                for (int n34 = 0; n34 < n31; n34 += 4) {
                                    final int n35 = h8 + 1;
                                    final int n36 = n30 + 1;
                                    array[h8] = array[n30];
                                    final int n37 = n35 + 1;
                                    final int n38 = n36 + 1;
                                    array[n35] = array[n36];
                                    final int n39 = n37 + 1;
                                    final int n40 = n38 + 1;
                                    array[n37] = array[n38];
                                    h8 = n39 + 1;
                                    n30 = n40 + 1;
                                    array[n39] = array[n40];
                                }
                            }
                            atzw.N += n31;
                            atzw.x -= n31;
                            atzw.H += n31;
                            break Label_2798;
                        }
                    }
                    int h9;
                    do {
                        final int n41 = atzw.N;
                        if (n41 >= atzw.X) {
                            break Label_2798;
                        }
                        h9 = atzw.H;
                        array[h9] = array[h9 - atzw.W & n3];
                        --atzw.x;
                        ++h9;
                        atzw.H = h9;
                        atzw.N = n41 + 1;
                    } while (h9 < n2);
                    atzw.r = 8;
                    atzw.q = 12;
                }
                if (atzw.q != 8) {
                    continue;
                }
                atzw.q = 4;
            }
            else {
                if (atzw.x >= 0) {
                    atzq.k(atzw);
                    atzq.f(atzw, 1);
                    return;
                }
                throw new atzs("Invalid metablock length");
            }
        }
    }
    
    static void c(final atzw atzw, final InputStream ap) {
        if (atzw.q == 0) {
            (atzw.k = new int[3091])[0] = 7;
            atzw.J = 3;
            final int p2 = p(3, 120);
            atzw.e = new byte[p2];
            atzw.o = new int[p2];
            atzw.ap = ap;
            atzq.j(atzw);
            atzw.q = 1;
            return;
        }
        throw new IllegalStateException("State MUST be uninitialized");
    }
    
    private static int d(int n, final int n2, final int n3) {
        n = n3 << n;
        return n2 + 16 + (n + n);
    }
    
    private static int e(final atzw atzw) {
        final int aa = atzw.aa;
        final int ah = atzw.ah;
        return aa;
    }
    
    private static int f(final atzw atzw, int m, final int n) {
        final int[] j = atzw.j;
        final int n2 = m + m;
        final int n3 = n2 + 4;
        atzq.i(atzw);
        m = m(atzw.k, n2, atzw);
        final int i = j(atzw.k, n2 + 1, atzw);
        if (m == 1) {
            m = j[n3 + 1] + 1;
        }
        else if (m == 0) {
            m = j[n3];
        }
        else {
            m -= 2;
        }
        int n4 = m;
        if (m >= n) {
            n4 = m - n;
        }
        m = n3 + 1;
        j[n3] = j[m];
        j[m] = n4;
        return i;
    }
    
    private static int g(final int n, final byte[] array, final atzw atzw) {
        atzq.l(atzw);
        final int n2 = h(atzw) + 1;
        if (n2 == 1) {
            int n3;
            for (int i = 0; i < n; i += n3) {
                n3 = Math.min(i + 1024, n) - i;
                System.arraycopy(atzy.a, 0, array, i, n3);
            }
            return 1;
        }
        atzq.i(atzw);
        int n4;
        if (atzq.d(atzw, 1) != 0) {
            n4 = atzq.d(atzw, 4) + 1;
        }
        else {
            n4 = 0;
        }
        final int n5 = n2 + n4;
        final int n6 = atzu.a[n5 + 31 >> 5] + 1;
        final int[] array2 = new int[n6];
        final int n7 = n6 - 1;
        k(n5, n5, array2, n7, atzw);
        int j = 0;
    Label_0140:
        while (j < n) {
            atzq.l(atzw);
            atzq.i(atzw);
            final int m = m(array2, n7, atzw);
            if (m == 0) {
                array[j] = 0;
            }
            else {
                if (m <= n4) {
                    atzq.i(atzw);
                    int n8 = (1 << m) + atzq.d(atzw, m);
                    int n9 = j;
                    while (true) {
                        j = n9;
                        if (n8 == 0) {
                            continue Label_0140;
                        }
                        if (n9 >= n) {
                            break;
                        }
                        array[n9] = 0;
                        ++n9;
                        --n8;
                    }
                    throw new atzs("Corrupted context map");
                }
                array[j] = (byte)(m - n4);
            }
            ++j;
        }
        atzq.i(atzw);
        if (atzq.d(atzw, 1) == 1) {
            final int[] array3 = new int[256];
            for (int k = 0; k < 256; ++k) {
                array3[k] = k;
            }
            for (int l = 0; l < n; ++l) {
                int n10 = array[l] & 0xFF;
                final int n11 = array3[n10];
                array[l] = (byte)n11;
                if (n10 != 0) {
                    while (n10 > 0) {
                        final int n12 = n10 - 1;
                        array3[n10] = array3[n12];
                        n10 = n12;
                    }
                    array3[0] = n11;
                }
            }
        }
        return n2;
    }
    
    private static int h(final atzw atzw) {
        atzq.i(atzw);
        if (atzq.d(atzw, 1) == 0) {
            return 0;
        }
        final int d = atzq.d(atzw, 3);
        if (d == 0) {
            return 1;
        }
        return atzq.d(atzw, d) + (1 << d);
    }
    
    private static int i(int i) {
        int n = -1;
        final int n2 = 16;
        int n3 = i;
        int n4;
        int n5;
        for (i = n2; i > 0; i >>= 1, n = n5) {
            n4 = n3 >>> i;
            n5 = n;
            if (n4 != 0) {
                n5 = n + i;
                n3 = n4;
            }
        }
        return n + n3;
    }
    
    private static int j(final int[] array, int n, final atzw atzw) {
        atzq.i(atzw);
        final int m = m(array, n, atzw);
        n = atzu.c[m];
        atzq.i(atzw);
        return atzu.b[m] + atzq.c(atzw, n);
    }
    
    private static int k(int i, final int n, final int[] array, final int n2, final atzw atzw) {
        atzq.l(atzw);
        atzq.i(atzw);
        final int d = atzq.d(atzw, 2);
        if (d == 1) {
            final int[] array2 = new int[n];
            final int[] array3 = new int[4];
            final int j = i(i - 1);
            int n3;
            int d2;
            for (n3 = atzq.d(atzw, 2) + 1, i = 0; i < n3; ++i) {
                atzq.i(atzw);
                d2 = atzq.d(atzw, j + 1);
                if (d2 >= n) {
                    throw new atzs("Can't readHuffmanCode");
                }
                array3[i] = d2;
            }
            int k;
            int n4;
            for (i = 0; i < n3 - 1; i = n4) {
                for (n4 = (k = i + 1); k < n3; ++k) {
                    if (array3[i] == array3[k]) {
                        throw new atzs("Duplicate simple Huffman code symbol");
                    }
                }
            }
            if ((i = n3) == 4) {
                i = atzq.d(atzw, 1) + 4;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                array2[array3[0]] = 1;
                                array2[array3[1]] = 2;
                                array2[array3[2]] = 3;
                                array2[array3[3]] = 3;
                            }
                        }
                        else {
                            array2[array3[0]] = 2;
                            array2[array3[1]] = 2;
                            array2[array3[2]] = 2;
                            array2[array3[3]] = 2;
                        }
                    }
                    else {
                        array2[array3[0]] = 1;
                        array2[array3[1]] = 2;
                        array2[array3[2]] = 2;
                    }
                }
                else {
                    array2[array3[0]] = 1;
                    array2[array3[1]] = 1;
                }
            }
            else {
                array2[array3[0]] = 1;
            }
            return atzz.b(array, n2, 8, array2, n);
        }
        final int[] array4 = new int[n];
        final int[] array5 = new int[18];
        i = d;
        int n5 = 0;
        int n6;
        int n9;
        int n10;
        for (n6 = 32; i < 18 && n6 > 0; ++i, n5 = n9, n6 = n10) {
            final int n7 = atzu.g[i];
            atzq.i(atzw);
            final int b = atzq.b(atzw);
            final int t = atzw.t;
            final int n8 = atzu.j[b & 0xF];
            atzw.t = t + (n8 >> 16);
            final char c = (char)n8;
            array5[n7] = c;
            n9 = n5;
            n10 = n6;
            if (c != '\0') {
                n10 = n6 - (32 >> c);
                n9 = n5 + 1;
            }
        }
        if (n6 != 0 && n5 != 1) {
            throw new atzs("Corrupted Huffman code histogram");
        }
        final int[] array6 = new int[33];
        atzz.b(array6, 32, 5, array5, 18);
        i = 0;
        int n11 = 8;
        int n12 = 0;
        int n13 = 0;
        int n14 = 32768;
        while (i < n && n14 > 0) {
            atzq.l(atzw);
            atzq.i(atzw);
            final int b2 = atzq.b(atzw);
            final int t2 = atzw.t;
            final int n15 = array6[b2 & 0x1F];
            atzw.t = t2 + (n15 >> 16);
            final char c2 = (char)n15;
            if (c2 < '\u0010') {
                final int n16 = i + 1;
                if ((array4[i] = c2) != 0) {
                    n14 -= 32768 >> c2;
                    n11 = c2;
                }
                i = n16;
                n13 = 0;
            }
            else {
                final int n17 = c2 - '\u000e';
                int n18;
                if (c2 == '\u0010') {
                    n18 = n11;
                }
                else {
                    n18 = 0;
                }
                int n19;
                if (n12 != n18) {
                    n19 = n18;
                }
                else {
                    n19 = n12;
                }
                if (n12 != n18) {
                    n13 = 0;
                }
                int n20;
                if (n13 > 0) {
                    n20 = n13 - 2 << n17;
                }
                else {
                    n20 = n13;
                }
                atzq.i(atzw);
                final int n21 = n20 + (atzq.d(atzw, n17) + 3);
                final int n22 = n21 - n13;
                if (i + n22 > n) {
                    throw new atzs("symbol + repeatDelta > numSymbols");
                }
                for (int l = 0; l < n22; ++l, ++i) {
                    array4[i] = n19;
                }
                int n23 = n14;
                if (n19 != 0) {
                    n23 = n14 - (n22 << 15 - n19);
                }
                n13 = n21;
                n12 = n19;
                n14 = n23;
            }
        }
        if (n14 == 0) {
            while (i < n) {
                final int n24 = Math.min(i + 1024, n) - i;
                System.arraycopy(atzy.b, 0, array4, i, n24);
                i += n24;
            }
            return atzz.b(array, n2, 8, array4, n);
        }
        throw new atzs("Unused space");
    }
    
    private static int l(final atzw atzw, int n, int n2) {
        final int[] k = atzw.k;
        n += n;
        final int n3 = k[n];
        if (n2 <= 1) {
            k[n + 2] = (k[n + 1] = n3);
            return 268435456;
        }
        n2 += 2;
        final int n4 = n3 + k(n2, n2, k, n, atzw);
        final int[] i = atzw.k;
        n2 = n + 1;
        i[n2] = n4;
        final int j = k(26, 26, i, n2, atzw);
        final int[] l = atzw.k;
        l[n + 2] = n4 + j;
        return j(l, n2, atzw);
    }
    
    private static int m(final int[] array, int b, final atzw atzw) {
        final int n = array[b];
        b = atzq.b(atzw);
        final int n2 = n + (b & 0xFF);
        final int n3 = array[n2];
        final int n4 = n3 >> 16;
        final char c = (char)n3;
        if (n4 <= 8) {
            atzw.t += n4;
            return c;
        }
        final int t = atzw.t;
        b = array[n2 + c + ((b & (1 << n4) - 1) >>> 8)];
        atzw.t = t + ((b >> 16) + 8);
        return (char)b;
    }
    
    private static void n(final atzw atzw) {
        atzw.B = f(atzw, 0, atzw.C);
        final int n = atzw.j[5];
        final int p = n << 6;
        atzw.P = p;
        atzw.L = (atzw.c[p] & 0xFF);
        final int r = atzw.b[n] << 9;
        atzw.R = r;
        atzw.S = r + 256;
    }
    
    private static int[] o(final int n, final int n2, final int n3, final atzw atzw) {
        final int[] array = new int[atzu.a[n2 + 31 >> 5] * n3 + n3];
        int i = 0;
        int n4 = n3;
        while (i < n3) {
            array[i] = n4;
            n4 += k(n, n2, array, i, atzw);
            ++i;
        }
        return array;
    }
    
    private static int p(final int n, final int n2) {
        if ((2 << n) + n2 <= 2147483644) {
            final int n3 = (2147483644 - n2 >> n) + 4;
            final int n4 = i(n3) - 1;
            final int n5 = n4 - 1;
            return (((n3 >> n4 & 0x1) | n5 + n5) - 1 << n) + (1 << n) + n2 + 16;
        }
        throw new IllegalArgumentException("maxDistance is too small");
    }
}
