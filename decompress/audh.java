import java.nio.ByteBuffer;
import org.brotli.dec.Dictionary;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class audh
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
            array2[n] = (short)(array2[k] + (1 << audh.d[k]));
            array3[n] = (short)(array3[k] + (1 << audh.e[k]));
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
            final int n5 = (156228 >>> n4 & 0x3) << 3 | (l & 0x7);
            final short n6 = array3[n5];
            int n7;
            if (n6 > 4) {
                n7 = 3;
            }
            else {
                n7 = n6 - 2;
            }
            final int n8 = (170064 >>> n4 & 0x3) << 3 | (l >>> 3 & 0x7);
            final int n9 = l * 4;
            array[n9] = (short)(audh.e[n5] << 8 | audh.d[n8]);
            array[n9 + 1] = array2[n8];
            array[n9 + 2] = n6;
            array[n9 + 3] = (short)(n3 + n7);
        }
    }
    
    static void a(final audk audk) {
        final int q = audk.q;
        if (q == 0) {
            throw new IllegalStateException("State MUST be initialized");
        }
        if (q == 11) {
            return;
        }
        audk.q = 11;
        final InputStream ap = audk.ap;
        if (ap != null) {
            ap.close();
            audk.ap = null;
        }
    }
    
    static void b(final audk audk) {
        final int q = audk.q;
        if (q == 0) {
            throw new IllegalStateException("Can't decompress until initialized");
        }
        if (q == 11) {
            throw new IllegalStateException("Can't decompress after close");
        }
        if (q == 1) {
            final int ai = audk.ai;
            audk.ai = 0;
            audd.i(audk);
            int n = 0;
            Label_0139: {
                if (audd.d(audk, 1) == 0) {
                    n = 16;
                }
                else {
                    final int d = audd.d(audk, 3);
                    n = 17;
                    if (d != 0) {
                        n = 17 + d;
                    }
                    else {
                        final int d2 = audd.d(audk, 3);
                        if (d2 != 0) {
                            if (d2 == 1) {
                                if (ai != 0) {
                                    audk.ai = 1;
                                    if (audd.d(audk, 1) != 1) {
                                        final int d3 = audd.d(audk, 6);
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
                throw new audf("Invalid 'windowBits' code");
            }
            final int z = 1 << n;
            audk.Z = z;
            audk.Y = z - 16;
            audk.q = 2;
        }
        int n2 = e(audk);
        int n3 = audk.aa - 1;
        byte[] array = audk.a;
    Label_1619_Outer:
        while (true) {
            final int n4 = 8;
            final int q2 = audk.q;
            if (q2 != 10) {
                Label_2481: {
                    while (true) {
                        Label_1784: {
                            Label_1607: {
                                switch (q2) {
                                    default: {
                                        final StringBuilder sb = new StringBuilder("Unexpected state ");
                                        sb.append(q2);
                                        throw new audf(sb.toString());
                                    }
                                    case 14: {
                                        final int h = audk.H;
                                        final int ak = audk.ak;
                                        final int al = audk.al;
                                        if (h >= n2) {
                                            audk.r = 14;
                                            audk.q = 12;
                                            return;
                                        }
                                        audk.q = 4;
                                        continue Label_1619_Outer;
                                    }
                                    case 12: {
                                        audk.ag = Math.min(audk.H, audk.aa);
                                        audk.q = 13;
                                    }
                                    case 13: {
                                        final int min = Math.min(audk.ad - audk.ae, audk.ag - audk.af);
                                        if (min != 0) {
                                            System.arraycopy(audk.a, audk.af, audk.f, audk.ac + audk.ae, min);
                                            audk.ae += min;
                                            audk.af += min;
                                        }
                                        if (audk.ae < audk.ad) {
                                            final int h2 = audk.H;
                                            final int y = audk.Y;
                                            if (h2 >= y) {
                                                audk.I = y;
                                            }
                                            final int aa = audk.aa;
                                            if (h2 >= aa) {
                                                if (h2 > aa) {
                                                    audm.b(array, 0, aa, h2);
                                                }
                                                audk.H &= n3;
                                                audk.af = 0;
                                            }
                                            audk.q = audk.r;
                                            continue Label_1619_Outer;
                                        }
                                        return;
                                    }
                                    case 9: {
                                        final int w = audk.W;
                                        if (w > 2147483644) {
                                            throw new audf("Invalid backward reference");
                                        }
                                        final int i = audk.I;
                                        final int aj = audk.aj;
                                        final int n5 = w - i - 1;
                                        if (n5 < 0) {
                                            final int n6 = -n5;
                                            final int x = audk.X;
                                            int an;
                                            if ((an = audk.an) == -1) {
                                                audk.ao = new byte[256];
                                                an = n4;
                                                while (true) {
                                                    final int aj2 = audk.aj;
                                                    if (-1 >>> an == 0) {
                                                        break;
                                                    }
                                                    ++an;
                                                }
                                                an -= 8;
                                                audk.an = an;
                                            }
                                            final byte b = audk.ao[n6 - 1 >>> an];
                                            final int[] am = audk.am;
                                            throw null;
                                        }
                                        ByteBuffer byteBuffer = Dictionary.a;
                                        if (byteBuffer == null) {
                                            if (!audi.a) {
                                                throw new audf("brotli dictionary is not set");
                                            }
                                            byteBuffer = Dictionary.a;
                                        }
                                        final int x2 = audk.X;
                                        if (x2 > 31) {
                                            throw new audf("Invalid backward reference");
                                        }
                                        final int n7 = Dictionary.c[x2];
                                        if (n7 == 0) {
                                            throw new audf("Invalid backward reference");
                                        }
                                        final int n8 = Dictionary.b[x2];
                                        final int n9 = n5 >>> n7;
                                        final aule a = audl.a;
                                        if (n9 >= 121) {
                                            throw new audf("Invalid backward reference");
                                        }
                                        final int a2 = audl.a(audk.a, audk.H, byteBuffer, n8 + (n5 & (1 << n7) - 1) * x2, x2, a, n9);
                                        final int h3 = audk.H + a2;
                                        audk.H = h3;
                                        audk.x -= a2;
                                        if (h3 >= n2) {
                                            audk.r = 4;
                                            audk.q = 12;
                                            continue Label_1619_Outer;
                                        }
                                        audk.q = 4;
                                        continue Label_1619_Outer;
                                    }
                                    case 8: {
                                        break Label_2481;
                                    }
                                    case 7: {
                                        break Label_1784;
                                    }
                                    case 6: {
                                        final byte[] a3 = audk.a;
                                        final int x3 = audk.x;
                                        if (x3 <= 0) {
                                            audd.m(audk);
                                            audk.q = 2;
                                            continue Label_1619_Outer;
                                        }
                                        final int min2 = Math.min(audk.aa - audk.H, x3);
                                        audd.g(audk, a3, audk.H, min2);
                                        audk.x -= min2;
                                        if ((audk.H += min2) == audk.aa) {
                                            audk.r = 6;
                                            audk.q = 12;
                                            continue Label_1619_Outer;
                                        }
                                        audd.m(audk);
                                        audk.q = 2;
                                        continue Label_1619_Outer;
                                    }
                                    case 5: {
                                        while (audk.x > 0) {
                                            audd.l(audk);
                                            audd.i(audk);
                                            audd.d(audk, 8);
                                            --audk.x;
                                        }
                                        audk.q = 2;
                                        continue Label_1619_Outer;
                                    }
                                    case 4: {
                                        break Label_1607;
                                    }
                                    case 3: {
                                        final int c = h(audk) + 1;
                                        audk.C = c;
                                        audk.B = l(audk, 0, c);
                                        final int e = h(audk) + 1;
                                        audk.E = e;
                                        audk.D = l(audk, 1, e);
                                        final int g = h(audk) + 1;
                                        audk.G = g;
                                        audk.F = l(audk, 2, g);
                                        audd.l(audk);
                                        audd.i(audk);
                                        audk.V = audd.d(audk, 2);
                                        audk.U = audd.d(audk, 4) << audk.V;
                                        audk.b = new byte[audk.C];
                                        int j = 0;
                                        int c2;
                                        while (true) {
                                            c2 = audk.C;
                                            if (j >= c2) {
                                                break;
                                            }
                                            while (j < Math.min(j + 96, c2)) {
                                                audd.i(audk);
                                                audk.b[j] = (byte)audd.d(audk, 2);
                                                ++j;
                                            }
                                            audd.l(audk);
                                        }
                                        final int n10 = c2 << 6;
                                        audk.c = new byte[n10];
                                        final int g2 = g(n10, audk.c, audk);
                                        audk.K = 1;
                                        for (int k = 0; k < audk.C << 6; ++k) {
                                            if (audk.c[k] != k >> 6) {
                                                audk.K = 0;
                                                break;
                                            }
                                        }
                                        final int n11 = audk.G << 2;
                                        audk.d = new byte[n11];
                                        final int g3 = g(n11, audk.d, audk);
                                        audk.l = o(256, 256, g2, audk);
                                        audk.m = o(704, 704, audk.E, audk);
                                        final int v = audk.V;
                                        final int u = audk.U;
                                        int n12 = d(v, u, 24);
                                        int p;
                                        if (audk.ai == 1) {
                                            n12 = d(v, u, 62);
                                            p = p(v, u);
                                        }
                                        else {
                                            p = n12;
                                        }
                                        audk.n = o(n12, p, g3, audk);
                                        final byte[] e2 = audk.e;
                                        final int[] o = audk.o;
                                        final int v2 = audk.V;
                                        int u2;
                                        int l;
                                        int n13;
                                        for (u2 = audk.U, l = 0, n13 = 16; l < u2; ++l, o[n13] = l, ++n13) {
                                            e2[n13] = 0;
                                        }
                                        int n14 = n13;
                                        int n15 = 1;
                                        int n16 = 0;
                                        while (n14 < p) {
                                            for (int n17 = 0; n17 < 1 << v2; ++n17) {
                                                e2[n14] = (byte)n15;
                                                o[n14] = u2 + ((n16 + 2 << n15) - 4 << v2) + 1 + n17;
                                                ++n14;
                                            }
                                            n15 += n16;
                                            n16 ^= 0x1;
                                        }
                                        audk.P = 0;
                                        audk.Q = 0;
                                        final int r = audk.b[0] * 512;
                                        audk.R = r;
                                        audk.S = r + 256;
                                        audk.L = 0;
                                        audk.M = 0;
                                        final int[] m = audk.j;
                                        m[4] = 1;
                                        m[5] = 0;
                                        m[6] = 1;
                                        m[7] = 0;
                                        m[8] = 1;
                                        m[9] = 0;
                                        audk.q = 4;
                                        break Label_1607;
                                    }
                                    case 2: {
                                        if (audk.x >= 0) {
                                            if (audk.y != 0) {
                                                audk.r = 10;
                                                audk.q = 12;
                                            }
                                            else {
                                                audk.l = new int[0];
                                                audk.m = new int[0];
                                                audk.n = new int[0];
                                                audd.l(audk);
                                                audd.i(audk);
                                                final int d4 = audd.d(audk, 1);
                                                audk.y = d4;
                                                audk.x = 0;
                                                audk.z = 0;
                                                audk.A = 0;
                                                Label_2919: {
                                                    if (d4 == 0 || audd.d(audk, 1) == 0) {
                                                        final int n18 = audd.d(audk, 2) + 4;
                                                        if (n18 == 7) {
                                                            audk.A = 1;
                                                            if (audd.d(audk, 1) != 0) {
                                                                throw new audf("Corrupted reserved bit");
                                                            }
                                                            final int d5 = audd.d(audk, 2);
                                                            if (d5 == 0) {
                                                                break Label_2919;
                                                            }
                                                            for (int n19 = 0; n19 < d5; ++n19) {
                                                                audd.i(audk);
                                                                int d6;
                                                                if ((d6 = audd.d(audk, 8)) == 0) {
                                                                    if (n19 + 1 == d5 && d5 > 1) {
                                                                        throw new audf("Exuberant nibble");
                                                                    }
                                                                    d6 = 0;
                                                                }
                                                                audk.x |= d6 << n19 * 8;
                                                            }
                                                        }
                                                        else {
                                                            for (int n20 = 0; n20 < n18; ++n20) {
                                                                audd.i(audk);
                                                                int d7;
                                                                if ((d7 = audd.d(audk, 4)) == 0) {
                                                                    if (n20 + 1 == n18 && n18 > 4) {
                                                                        throw new audf("Exuberant nibble");
                                                                    }
                                                                    d7 = 0;
                                                                }
                                                                audk.x |= d7 << n20 * 4;
                                                            }
                                                        }
                                                        ++audk.x;
                                                        if (audk.y == 0) {
                                                            audk.z = audd.d(audk, 1);
                                                        }
                                                    }
                                                }
                                                if (audk.x != 0 || audk.A != 0) {
                                                    int a4 = 0;
                                                    Label_3229: {
                                                        if (audk.z == 0) {
                                                            a4 = audk.A;
                                                            if (a4 == 0) {
                                                                audk.q = 3;
                                                                break Label_3229;
                                                            }
                                                        }
                                                        audd.k(audk);
                                                        final int a5 = audk.A;
                                                        int q3;
                                                        if (a5 == 0) {
                                                            q3 = 6;
                                                        }
                                                        else {
                                                            q3 = 5;
                                                        }
                                                        audk.q = q3;
                                                        a4 = a5;
                                                    }
                                                    if (a4 == 0) {
                                                        final int ab = audk.ab + audk.x;
                                                        audk.ab = ab;
                                                        int n21;
                                                        if ((n21 = ab) > 1073741824) {
                                                            audk.ab = 1073741824;
                                                            n21 = 1073741824;
                                                        }
                                                        final int aa2 = audk.aa;
                                                        int z2 = audk.Z;
                                                        if (aa2 < z2) {
                                                            int aa3;
                                                            if ((aa3 = z2) > n21) {
                                                                while (true) {
                                                                    final int n22 = z2 >> 1;
                                                                    if (n22 <= n21) {
                                                                        break;
                                                                    }
                                                                    z2 = n22;
                                                                }
                                                                aa3 = z2;
                                                                if (audk.y == 0 && (aa3 = z2) < 16384) {
                                                                    aa3 = z2;
                                                                    if (audk.Z >= 16384) {
                                                                        aa3 = 16384;
                                                                    }
                                                                }
                                                            }
                                                            final int aa4 = audk.aa;
                                                            if (aa3 > aa4) {
                                                                final byte[] a6 = new byte[aa3 + 37];
                                                                final byte[] a7 = audk.a;
                                                                if (a7.length != 0) {
                                                                    System.arraycopy(a7, 0, a6, 0, aa4);
                                                                }
                                                                audk.a = a6;
                                                                audk.aa = aa3;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            n2 = e(audk);
                                            n3 = audk.aa - 1;
                                            array = audk.a;
                                            continue Label_1619_Outer;
                                        }
                                        throw new audf("Invalid metablock length");
                                    }
                                }
                                continue Label_1619_Outer;
                            }
                            if (audk.x > 0) {
                                audd.l(audk);
                                int d8;
                                if ((d8 = audk.D) == 0) {
                                    d8 = f(audk, 1, audk.E);
                                    audk.D = d8;
                                    audk.M = audk.j[7];
                                }
                                audk.D = d8 - 1;
                                audd.i(audk);
                                final int n23 = m(audk.m, audk.M, audk) << 2;
                                final short[] f = audh.f;
                                final short n24 = f[n23];
                                final short n25 = f[n23 + 1];
                                final short n26 = f[n23 + 2];
                                audk.T = f[n23 + 3];
                                audd.i(audk);
                                audk.O = n25 + audd.c(audk, n24 & 0xFF);
                                audd.i(audk);
                                audk.X = n26 + audd.c(audk, n24 >> 8);
                                audk.N = 0;
                                audk.q = 7;
                                break Label_1784;
                            }
                            audk.q = 2;
                            continue Label_1619_Outer;
                        }
                        if (audk.K != 0) {
                            while (audk.N < audk.O) {
                                audd.l(audk);
                                if (audk.B == 0) {
                                    n(audk);
                                }
                                --audk.B;
                                audd.i(audk);
                                array[audk.H] = (byte)m(audk.l, audk.L, audk);
                                final int h4 = audk.H + 1;
                                audk.H = h4;
                                ++audk.N;
                                if (h4 >= n2) {
                                    audk.r = 7;
                                    audk.q = 12;
                                    break;
                                }
                            }
                        }
                        else {
                            final int h5 = audk.H;
                            int n27 = array[h5 - 1 & n3] & 0xFF;
                            int n28 = array[h5 - 2 & n3] & 0xFF;
                            while (audk.N < audk.O) {
                                audd.l(audk);
                                if (audk.B == 0) {
                                    n(audk);
                                }
                                final byte b2 = audk.c[audk.P + (audg.a[audk.S + n28] | audg.a[audk.R + n27])];
                                --audk.B;
                                audd.i(audk);
                                final int m2 = m(audk.l, b2 & 0xFF, audk);
                                int h6 = audk.H;
                                array[h6] = (byte)m2;
                                ++h6;
                                audk.H = h6;
                                ++audk.N;
                                if (h6 >= n2) {
                                    audk.r = 7;
                                    audk.q = 12;
                                    break;
                                }
                                n28 = n27;
                                n27 = m2;
                            }
                        }
                        if (audk.q != 7) {
                            continue;
                        }
                        if ((audk.x -= audk.O) <= 0) {
                            audk.q = 4;
                            continue;
                        }
                        break;
                    }
                    int n29 = audk.T;
                    int w2;
                    if (n29 < 0) {
                        w2 = audk.j[audk.J];
                        audk.W = w2;
                    }
                    else {
                        audd.l(audk);
                        int f2;
                        if ((f2 = audk.F) == 0) {
                            f2 = f(audk, 2, audk.G);
                            audk.F = f2;
                            audk.Q = audk.j[9] << 2;
                        }
                        audk.F = f2 - 1;
                        audd.i(audk);
                        n29 = m(audk.n, audk.d[audk.Q + n29] & 0xFF, audk);
                        if (n29 < 16) {
                            w2 = audk.j[audk.J + audh.h[n29] & 0x3] + audh.i[n29];
                            if ((audk.W = w2) < 0) {
                                throw new audf("Negative distance");
                            }
                        }
                        else {
                            final byte b3 = audk.e[n29];
                            int n30;
                            if (audk.t + b3 <= audd.a) {
                                n30 = audd.d(audk, b3);
                            }
                            else {
                                audd.i(audk);
                                n30 = audd.c(audk, b3);
                            }
                            w2 = (n30 << audk.V) + audk.o[n29];
                            audk.W = w2;
                        }
                    }
                    final int i2 = audk.I;
                    int y2 = audk.Y;
                    Label_2415: {
                        if (i2 != y2) {
                            final int h7 = audk.H;
                            if (h7 < y2) {
                                audk.I = h7;
                                y2 = h7;
                                break Label_2415;
                            }
                        }
                        audk.I = y2;
                    }
                    if (w2 > y2) {
                        audk.q = 9;
                        continue Label_1619_Outer;
                    }
                    if (n29 > 0) {
                        final int j2 = audk.J + 1 & 0x3;
                        audk.J = j2;
                        audk.j[j2] = w2;
                    }
                    if (audk.X > audk.x) {
                        throw new audf("Invalid backward reference");
                    }
                    audk.N = 0;
                    audk.q = 8;
                }
                int h8 = audk.H;
                int n31 = h8 - audk.W & n3;
                final int n32 = audk.X - audk.N;
                final int n33 = h8 + n32;
                final int n34 = n31 + n32;
                Label_2793: {
                    if (n34 < n3) {
                        if (n33 < n3) {
                            if (n32 >= 12 && (n34 <= h8 || n33 <= n31)) {
                                audm.b(array, h8, n31, n34);
                            }
                            else {
                                for (int n35 = 0; n35 < n32; n35 += 4) {
                                    final int n36 = h8 + 1;
                                    final int n37 = n31 + 1;
                                    array[h8] = array[n31];
                                    final int n38 = n36 + 1;
                                    final int n39 = n37 + 1;
                                    array[n36] = array[n37];
                                    final int n40 = n38 + 1;
                                    final int n41 = n39 + 1;
                                    array[n38] = array[n39];
                                    h8 = n40 + 1;
                                    n31 = n41 + 1;
                                    array[n40] = array[n41];
                                }
                            }
                            audk.N += n32;
                            audk.x -= n32;
                            audk.H += n32;
                            break Label_2793;
                        }
                    }
                    int h9;
                    do {
                        final int n42 = audk.N;
                        if (n42 >= audk.X) {
                            break Label_2793;
                        }
                        h9 = audk.H;
                        array[h9] = array[h9 - audk.W & n3];
                        --audk.x;
                        ++h9;
                        audk.H = h9;
                        audk.N = n42 + 1;
                    } while (h9 < n2);
                    audk.r = 8;
                    audk.q = 12;
                }
                if (audk.q != 8) {
                    continue;
                }
                audk.q = 4;
            }
            else {
                if (audk.x >= 0) {
                    audd.k(audk);
                    audd.f(audk, 1);
                    return;
                }
                throw new audf("Invalid metablock length");
            }
        }
    }
    
    static void c(final audk audk, final InputStream ap) {
        if (audk.q == 0) {
            (audk.k = new int[3091])[0] = 7;
            audk.J = 3;
            final int p2 = p(3, 120);
            audk.e = new byte[p2];
            audk.o = new int[p2];
            audk.ap = ap;
            audd.j(audk);
            audk.q = 1;
            return;
        }
        throw new IllegalStateException("State MUST be uninitialized");
    }
    
    private static int d(int n, final int n2, final int n3) {
        n = n3 << n;
        return n2 + 16 + (n + n);
    }
    
    private static int e(final audk audk) {
        final int aa = audk.aa;
        final int ah = audk.ah;
        return aa;
    }
    
    private static int f(final audk audk, int m, final int n) {
        final int[] j = audk.j;
        audd.i(audk);
        final int[] k = audk.k;
        final int n2 = m + m;
        m = m(k, n2, audk);
        final int i = j(audk.k, n2 + 1, audk);
        final int n3 = n2 + 4;
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
    
    private static int g(final int n, final byte[] array, final audk audk) {
        audd.l(audk);
        final int n2 = h(audk) + 1;
        if (n2 == 1) {
            int n3;
            for (int i = 0; i < n; i += n3) {
                n3 = Math.min(i + 1024, n) - i;
                System.arraycopy(audm.a, 0, array, i, n3);
            }
            return 1;
        }
        audd.i(audk);
        int n4;
        if (audd.d(audk, 1) != 0) {
            n4 = audd.d(audk, 4) + 1;
        }
        else {
            n4 = 0;
        }
        final int n5 = n2 + n4;
        final int n6 = audh.a[n5 + 31 >> 5] + 1;
        final int[] array2 = new int[n6];
        final int n7 = n6 - 1;
        k(n5, n5, array2, n7, audk);
        int j = 0;
    Label_0131:
        while (j < n) {
            audd.l(audk);
            audd.i(audk);
            final int m = m(array2, n7, audk);
            if (m == 0) {
                array[j] = 0;
            }
            else {
                if (m <= n4) {
                    audd.i(audk);
                    int n8 = (1 << m) + audd.d(audk, m);
                    int n9 = j;
                    while (true) {
                        j = n9;
                        if (n8 == 0) {
                            continue Label_0131;
                        }
                        if (n9 >= n) {
                            break;
                        }
                        array[n9] = 0;
                        ++n9;
                        --n8;
                    }
                    throw new audf("Corrupted context map");
                }
                array[j] = (byte)(m - n4);
            }
            ++j;
        }
        audd.i(audk);
        if (audd.d(audk, 1) == 1) {
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
    
    private static int h(final audk audk) {
        audd.i(audk);
        if (audd.d(audk, 1) == 0) {
            return 0;
        }
        final int d = audd.d(audk, 3);
        if (d == 0) {
            return 1;
        }
        return audd.d(audk, d) + (1 << d);
    }
    
    private static int i(int i) {
        final int n = 16;
        int n2 = -1;
        int n3 = i;
        int n4;
        int n5;
        for (i = n; i > 0; i >>= 1, n2 = n5) {
            n4 = n3 >>> i;
            n5 = n2;
            if (n4 != 0) {
                n5 = n2 + i;
                n3 = n4;
            }
        }
        return n2 + n3;
    }
    
    private static int j(final int[] array, int n, final audk audk) {
        audd.i(audk);
        final int m = m(array, n, audk);
        n = audh.c[m];
        audd.i(audk);
        return audh.b[m] + audd.c(audk, n);
    }
    
    private static int k(int i, final int n, final int[] array, final int n2, final audk audk) {
        audd.l(audk);
        audd.i(audk);
        final int d = audd.d(audk, 2);
        if (d == 1) {
            final int[] array2 = new int[n];
            final int[] array3 = new int[4];
            final int n3 = audd.d(audk, 2) + 1;
            for (int j = 0; j < n3; ++j) {
                final int k = i(i - 1);
                audd.i(audk);
                final int d2 = audd.d(audk, k + 1);
                if (d2 >= n) {
                    throw new audf("Can't readHuffmanCode");
                }
                array3[j] = d2;
            }
            int l;
            int n4;
            for (i = 0; i < n3 - 1; i = n4) {
                for (n4 = (l = i + 1); l < n3; ++l) {
                    if (array3[i] == array3[l]) {
                        throw new audf("Duplicate simple Huffman code symbol");
                    }
                }
            }
            if ((i = n3) == 4) {
                i = audd.d(audk, 1) + 4;
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
            return audj.a(array, n2, 8, array2, n);
        }
        final int[] array4 = new int[n];
        final int[] array5 = new int[18];
        i = d;
        int n5 = 0;
        int n6;
        int n9;
        int n10;
        for (n6 = 32; i < 18 && n6 > 0; ++i, n5 = n9, n6 = n10) {
            final int n7 = audh.g[i];
            audd.i(audk);
            final int b = audd.b(audk);
            final int t = audk.t;
            final int n8 = audh.j[b & 0xF];
            audk.t = t + (n8 >> 16);
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
            throw new audf("Corrupted Huffman code histogram");
        }
        final int[] array6 = new int[33];
        audj.a(array6, 32, 5, array5, 18);
        i = 0;
        int n11 = 8;
        int n12 = 0;
        int n13 = 0;
        int n14 = 32768;
        while (i < n && n14 > 0) {
            audd.l(audk);
            audd.i(audk);
            final int b2 = audd.b(audk);
            final int t2 = audk.t;
            final int n15 = array6[b2 & 0x1F];
            audk.t = t2 + (n15 >> 16);
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
                audd.i(audk);
                final int n21 = n20 + (audd.d(audk, n17) + 3);
                final int n22 = n21 - n13;
                if (i + n22 > n) {
                    throw new audf("symbol + repeatDelta > numSymbols");
                }
                for (int n23 = 0; n23 < n22; ++n23, ++i) {
                    array4[i] = n19;
                }
                int n24 = n14;
                if (n19 != 0) {
                    n24 = n14 - (n22 << 15 - n19);
                }
                n13 = n21;
                n12 = n19;
                n14 = n24;
            }
        }
        if (n14 == 0) {
            while (i < n) {
                final int n25 = Math.min(i + 1024, n) - i;
                System.arraycopy(audm.b, 0, array4, i, n25);
                i += n25;
            }
            return audj.a(array, n2, 8, array4, n);
        }
        throw new audf("Unused space");
    }
    
    private static int l(final audk audk, int n, int n2) {
        final int[] k = audk.k;
        n += n;
        final int n3 = k[n];
        if (n2 <= 1) {
            k[n + 2] = (k[n + 1] = n3);
            return 268435456;
        }
        n2 += 2;
        n2 = n3 + k(n2, n2, k, n, audk);
        final int[] i = audk.k;
        final int n4 = n + 1;
        i[n4] = n2;
        final int j = k(26, 26, i, n4, audk);
        final int[] l = audk.k;
        l[n + 2] = n2 + j;
        return j(l, n4, audk);
    }
    
    private static int m(final int[] array, int b, final audk audk) {
        final int n = array[b];
        b = audd.b(audk);
        final int n2 = n + (b & 0xFF);
        final int n3 = array[n2];
        final int n4 = n3 >> 16;
        final char c = (char)n3;
        if (n4 <= 8) {
            audk.t += n4;
            return c;
        }
        final int t = audk.t;
        b = array[n2 + c + ((b & (1 << n4) - 1) >>> 8)];
        audk.t = t + ((b >> 16) + 8);
        return (char)b;
    }
    
    private static void n(final audk audk) {
        audk.B = f(audk, 0, audk.C);
        final int n = audk.j[5];
        final int p = n << 6;
        audk.P = p;
        audk.L = (audk.c[p] & 0xFF);
        final int r = audk.b[n] << 9;
        audk.R = r;
        audk.S = r + 256;
    }
    
    private static int[] o(final int n, final int n2, final int n3, final audk audk) {
        final int[] array = new int[audh.a[n2 + 31 >> 5] * n3 + n3];
        int i = 0;
        int n4 = n3;
        while (i < n3) {
            array[i] = n4;
            n4 += k(n, n2, array, i, audk);
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
