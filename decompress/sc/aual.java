import java.nio.ByteBuffer;
import org.brotli.dec.Dictionary;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class aual
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
            array2[n] = (short)(array2[k] + (1 << aual.d[k]));
            array3[n] = (short)(array3[k] + (1 << aual.e[k]));
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
            array[n9] = (short)(aual.e[n5] << 8 | aual.d[n8]);
            array[n9 + 1] = array2[n8];
            array[n9 + 2] = n6;
            array[n9 + 3] = (short)(n3 + n7);
        }
    }
    
    static void a(final auan auan) {
        final int q = auan.q;
        if (q == 0) {
            throw new IllegalStateException("State MUST be initialized");
        }
        if (q == 11) {
            return;
        }
        auan.q = 11;
        final InputStream ap = auan.ap;
        if (ap != null) {
            ap.close();
            auan.ap = null;
        }
    }
    
    static void b(final auan auan) {
        final int q = auan.q;
        if (q == 0) {
            throw new IllegalStateException("Can't decompress until initialized");
        }
        if (q == 11) {
            throw new IllegalStateException("Can't decompress after close");
        }
        if (q == 1) {
            final int ai = auan.ai;
            auan.ai = 0;
            auah.i(auan);
            int n = 0;
            Label_0139: {
                if (auah.d(auan, 1) == 0) {
                    n = 16;
                }
                else {
                    final int d = auah.d(auan, 3);
                    n = 17;
                    if (d != 0) {
                        n = 17 + d;
                    }
                    else {
                        final int d2 = auah.d(auan, 3);
                        if (d2 != 0) {
                            if (d2 == 1) {
                                if (ai != 0) {
                                    auan.ai = 1;
                                    if (auah.d(auan, 1) != 1) {
                                        final int d3 = auah.d(auan, 6);
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
                throw new auaj("Invalid 'windowBits' code");
            }
            final int z = 1 << n;
            auan.Z = z;
            auan.Y = z - 16;
            auan.q = 2;
        }
        int n2 = e(auan);
        int n3 = auan.aa - 1;
        byte[] array = auan.a;
    Label_1619_Outer:
        while (true) {
            final int n4 = 8;
            final int q2 = auan.q;
            if (q2 != 10) {
                Label_2481: {
                    while (true) {
                        Label_1784: {
                            Label_1607: {
                                switch (q2) {
                                    default: {
                                        final StringBuilder sb = new StringBuilder("Unexpected state ");
                                        sb.append(q2);
                                        throw new auaj(sb.toString());
                                    }
                                    case 14: {
                                        final int h = auan.H;
                                        final int ak = auan.ak;
                                        final int al = auan.al;
                                        if (h >= n2) {
                                            auan.r = 14;
                                            auan.q = 12;
                                            return;
                                        }
                                        auan.q = 4;
                                        continue Label_1619_Outer;
                                    }
                                    case 12: {
                                        auan.ag = Math.min(auan.H, auan.aa);
                                        auan.q = 13;
                                    }
                                    case 13: {
                                        final int min = Math.min(auan.ad - auan.ae, auan.ag - auan.af);
                                        if (min != 0) {
                                            System.arraycopy(auan.a, auan.af, auan.f, auan.ac + auan.ae, min);
                                            auan.ae += min;
                                            auan.af += min;
                                        }
                                        if (auan.ae < auan.ad) {
                                            final int h2 = auan.H;
                                            final int y = auan.Y;
                                            if (h2 >= y) {
                                                auan.I = y;
                                            }
                                            final int aa = auan.aa;
                                            if (h2 >= aa) {
                                                if (h2 > aa) {
                                                    auap.b(array, 0, aa, h2);
                                                }
                                                auan.H &= n3;
                                                auan.af = 0;
                                            }
                                            auan.q = auan.r;
                                            continue Label_1619_Outer;
                                        }
                                        return;
                                    }
                                    case 9: {
                                        final int w = auan.W;
                                        if (w > 2147483644) {
                                            throw new auaj("Invalid backward reference");
                                        }
                                        final int i = auan.I;
                                        final int aj = auan.aj;
                                        final int n5 = w - i - 1;
                                        if (n5 < 0) {
                                            final int n6 = -n5;
                                            final int x = auan.X;
                                            int an;
                                            if ((an = auan.an) == -1) {
                                                auan.ao = new byte[256];
                                                an = n4;
                                                while (true) {
                                                    final int aj2 = auan.aj;
                                                    if (-1 >>> an == 0) {
                                                        break;
                                                    }
                                                    ++an;
                                                }
                                                an -= 8;
                                                auan.an = an;
                                            }
                                            final byte b = auan.ao[n6 - 1 >>> an];
                                            final int[] am = auan.am;
                                            throw null;
                                        }
                                        ByteBuffer byteBuffer = Dictionary.a;
                                        if (byteBuffer == null) {
                                            if (!auam.a) {
                                                throw new auaj("brotli dictionary is not set");
                                            }
                                            byteBuffer = Dictionary.a;
                                        }
                                        final int x2 = auan.X;
                                        if (x2 > 31) {
                                            throw new auaj("Invalid backward reference");
                                        }
                                        final int n7 = Dictionary.c[x2];
                                        if (n7 == 0) {
                                            throw new auaj("Invalid backward reference");
                                        }
                                        final int n8 = Dictionary.b[x2];
                                        final int n9 = n5 >>> n7;
                                        final auii a = auao.a;
                                        if (n9 >= 121) {
                                            throw new auaj("Invalid backward reference");
                                        }
                                        final int a2 = auao.a(auan.a, auan.H, byteBuffer, n8 + (n5 & (1 << n7) - 1) * x2, x2, a, n9);
                                        final int h3 = auan.H + a2;
                                        auan.H = h3;
                                        auan.x -= a2;
                                        if (h3 >= n2) {
                                            auan.r = 4;
                                            auan.q = 12;
                                            continue Label_1619_Outer;
                                        }
                                        auan.q = 4;
                                        continue Label_1619_Outer;
                                    }
                                    case 8: {
                                        break Label_2481;
                                    }
                                    case 7: {
                                        break Label_1784;
                                    }
                                    case 6: {
                                        final byte[] a3 = auan.a;
                                        final int x3 = auan.x;
                                        if (x3 <= 0) {
                                            auah.m(auan);
                                            auan.q = 2;
                                            continue Label_1619_Outer;
                                        }
                                        final int min2 = Math.min(auan.aa - auan.H, x3);
                                        auah.g(auan, a3, auan.H, min2);
                                        auan.x -= min2;
                                        if ((auan.H += min2) == auan.aa) {
                                            auan.r = 6;
                                            auan.q = 12;
                                            continue Label_1619_Outer;
                                        }
                                        auah.m(auan);
                                        auan.q = 2;
                                        continue Label_1619_Outer;
                                    }
                                    case 5: {
                                        while (auan.x > 0) {
                                            auah.l(auan);
                                            auah.i(auan);
                                            auah.d(auan, 8);
                                            --auan.x;
                                        }
                                        auan.q = 2;
                                        continue Label_1619_Outer;
                                    }
                                    case 4: {
                                        break Label_1607;
                                    }
                                    case 3: {
                                        final int c = h(auan) + 1;
                                        auan.C = c;
                                        auan.B = l(auan, 0, c);
                                        final int e = h(auan) + 1;
                                        auan.E = e;
                                        auan.D = l(auan, 1, e);
                                        final int g = h(auan) + 1;
                                        auan.G = g;
                                        auan.F = l(auan, 2, g);
                                        auah.l(auan);
                                        auah.i(auan);
                                        auan.V = auah.d(auan, 2);
                                        auan.U = auah.d(auan, 4) << auan.V;
                                        auan.b = new byte[auan.C];
                                        int j = 0;
                                        int c2;
                                        while (true) {
                                            c2 = auan.C;
                                            if (j >= c2) {
                                                break;
                                            }
                                            while (j < Math.min(j + 96, c2)) {
                                                auah.i(auan);
                                                auan.b[j] = (byte)auah.d(auan, 2);
                                                ++j;
                                            }
                                            auah.l(auan);
                                        }
                                        final int n10 = c2 << 6;
                                        auan.c = new byte[n10];
                                        final int g2 = g(n10, auan.c, auan);
                                        auan.K = 1;
                                        for (int k = 0; k < auan.C << 6; ++k) {
                                            if (auan.c[k] != k >> 6) {
                                                auan.K = 0;
                                                break;
                                            }
                                        }
                                        final int n11 = auan.G << 2;
                                        auan.d = new byte[n11];
                                        final int g3 = g(n11, auan.d, auan);
                                        auan.l = o(256, 256, g2, auan);
                                        auan.m = o(704, 704, auan.E, auan);
                                        final int v = auan.V;
                                        final int u = auan.U;
                                        int n12 = d(v, u, 24);
                                        int p;
                                        if (auan.ai == 1) {
                                            n12 = d(v, u, 62);
                                            p = p(v, u);
                                        }
                                        else {
                                            p = n12;
                                        }
                                        auan.n = o(n12, p, g3, auan);
                                        final byte[] e2 = auan.e;
                                        final int[] o = auan.o;
                                        final int v2 = auan.V;
                                        int u2;
                                        int l;
                                        int n13;
                                        for (u2 = auan.U, l = 0, n13 = 16; l < u2; ++l, o[n13] = l, ++n13) {
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
                                        auan.P = 0;
                                        auan.Q = 0;
                                        final int r = auan.b[0] * 512;
                                        auan.R = r;
                                        auan.S = r + 256;
                                        auan.L = 0;
                                        auan.M = 0;
                                        final int[] m = auan.j;
                                        m[4] = 1;
                                        m[5] = 0;
                                        m[6] = 1;
                                        m[7] = 0;
                                        m[8] = 1;
                                        m[9] = 0;
                                        auan.q = 4;
                                        break Label_1607;
                                    }
                                    case 2: {
                                        if (auan.x >= 0) {
                                            if (auan.y != 0) {
                                                auan.r = 10;
                                                auan.q = 12;
                                            }
                                            else {
                                                auan.l = new int[0];
                                                auan.m = new int[0];
                                                auan.n = new int[0];
                                                auah.l(auan);
                                                auah.i(auan);
                                                final int d4 = auah.d(auan, 1);
                                                auan.y = d4;
                                                auan.x = 0;
                                                auan.z = 0;
                                                auan.A = 0;
                                                Label_2920: {
                                                    if (d4 == 0 || auah.d(auan, 1) == 0) {
                                                        final int n18 = auah.d(auan, 2) + 4;
                                                        if (n18 == 7) {
                                                            auan.A = 1;
                                                            if (auah.d(auan, 1) != 0) {
                                                                throw new auaj("Corrupted reserved bit");
                                                            }
                                                            final int d5 = auah.d(auan, 2);
                                                            if (d5 == 0) {
                                                                break Label_2920;
                                                            }
                                                            for (int n19 = 0; n19 < d5; ++n19) {
                                                                auah.i(auan);
                                                                int d6;
                                                                if ((d6 = auah.d(auan, 8)) == 0) {
                                                                    if (n19 + 1 == d5 && d5 > 1) {
                                                                        throw new auaj("Exuberant nibble");
                                                                    }
                                                                    d6 = 0;
                                                                }
                                                                auan.x |= d6 << n19 * 8;
                                                            }
                                                        }
                                                        else {
                                                            for (int n20 = 0; n20 < n18; ++n20) {
                                                                auah.i(auan);
                                                                int d7;
                                                                if ((d7 = auah.d(auan, 4)) == 0) {
                                                                    if (n20 + 1 == n18 && n18 > 4) {
                                                                        throw new auaj("Exuberant nibble");
                                                                    }
                                                                    d7 = 0;
                                                                }
                                                                auan.x |= d7 << n20 * 4;
                                                            }
                                                        }
                                                        ++auan.x;
                                                        if (auan.y == 0) {
                                                            auan.z = auah.d(auan, 1);
                                                        }
                                                    }
                                                }
                                                if (auan.x != 0 || auan.A != 0) {
                                                    int a4 = 0;
                                                    Label_3230: {
                                                        if (auan.z == 0) {
                                                            a4 = auan.A;
                                                            if (a4 == 0) {
                                                                auan.q = 3;
                                                                break Label_3230;
                                                            }
                                                        }
                                                        auah.k(auan);
                                                        final int a5 = auan.A;
                                                        int q3;
                                                        if (a5 == 0) {
                                                            q3 = 6;
                                                        }
                                                        else {
                                                            q3 = 5;
                                                        }
                                                        auan.q = q3;
                                                        a4 = a5;
                                                    }
                                                    if (a4 == 0) {
                                                        final int ab = auan.ab + auan.x;
                                                        auan.ab = ab;
                                                        int n21;
                                                        if ((n21 = ab) > 1073741824) {
                                                            auan.ab = 1073741824;
                                                            n21 = 1073741824;
                                                        }
                                                        final int aa2 = auan.aa;
                                                        int z2 = auan.Z;
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
                                                                if (auan.y == 0 && (aa3 = z2) < 16384) {
                                                                    aa3 = z2;
                                                                    if (auan.Z >= 16384) {
                                                                        aa3 = 16384;
                                                                    }
                                                                }
                                                            }
                                                            final int aa4 = auan.aa;
                                                            if (aa3 > aa4) {
                                                                final byte[] a6 = new byte[aa3 + 37];
                                                                final byte[] a7 = auan.a;
                                                                if (a7.length != 0) {
                                                                    System.arraycopy(a7, 0, a6, 0, aa4);
                                                                }
                                                                auan.a = a6;
                                                                auan.aa = aa3;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            n2 = e(auan);
                                            n3 = auan.aa - 1;
                                            array = auan.a;
                                            continue Label_1619_Outer;
                                        }
                                        throw new auaj("Invalid metablock length");
                                    }
                                }
                                continue Label_1619_Outer;
                            }
                            if (auan.x > 0) {
                                auah.l(auan);
                                int d8;
                                if ((d8 = auan.D) == 0) {
                                    d8 = f(auan, 1, auan.E);
                                    auan.D = d8;
                                    auan.M = auan.j[7];
                                }
                                auan.D = d8 - 1;
                                auah.i(auan);
                                final int n23 = m(auan.m, auan.M, auan) << 2;
                                final short[] f = aual.f;
                                final short n24 = f[n23];
                                final short n25 = f[n23 + 1];
                                final short n26 = f[n23 + 2];
                                auan.T = f[n23 + 3];
                                auah.i(auan);
                                auan.O = n25 + auah.c(auan, n24 & 0xFF);
                                auah.i(auan);
                                auan.X = n26 + auah.c(auan, n24 >> 8);
                                auan.N = 0;
                                auan.q = 7;
                                break Label_1784;
                            }
                            auan.q = 2;
                            continue Label_1619_Outer;
                        }
                        if (auan.K != 0) {
                            while (auan.N < auan.O) {
                                auah.l(auan);
                                if (auan.B == 0) {
                                    n(auan);
                                }
                                --auan.B;
                                auah.i(auan);
                                array[auan.H] = (byte)m(auan.l, auan.L, auan);
                                final int h4 = auan.H + 1;
                                auan.H = h4;
                                ++auan.N;
                                if (h4 >= n2) {
                                    auan.r = 7;
                                    auan.q = 12;
                                    break;
                                }
                            }
                        }
                        else {
                            final int h5 = auan.H;
                            int n27 = array[h5 - 1 & n3] & 0xFF;
                            int n28 = array[h5 - 2 & n3] & 0xFF;
                            while (auan.N < auan.O) {
                                auah.l(auan);
                                if (auan.B == 0) {
                                    n(auan);
                                }
                                final byte b2 = auan.c[auan.P + (auak.a[auan.S + n28] | auak.a[auan.R + n27])];
                                --auan.B;
                                auah.i(auan);
                                final int m2 = m(auan.l, b2 & 0xFF, auan);
                                int h6 = auan.H;
                                array[h6] = (byte)m2;
                                ++h6;
                                auan.H = h6;
                                ++auan.N;
                                if (h6 >= n2) {
                                    auan.r = 7;
                                    auan.q = 12;
                                    break;
                                }
                                n28 = n27;
                                n27 = m2;
                            }
                        }
                        if (auan.q != 7) {
                            continue;
                        }
                        if ((auan.x -= auan.O) <= 0) {
                            auan.q = 4;
                            continue;
                        }
                        break;
                    }
                    int n29 = auan.T;
                    int w2;
                    if (n29 < 0) {
                        w2 = auan.j[auan.J];
                        auan.W = w2;
                    }
                    else {
                        auah.l(auan);
                        int f2;
                        if ((f2 = auan.F) == 0) {
                            f2 = f(auan, 2, auan.G);
                            auan.F = f2;
                            auan.Q = auan.j[9] << 2;
                        }
                        auan.F = f2 - 1;
                        auah.i(auan);
                        n29 = m(auan.n, auan.d[auan.Q + n29] & 0xFF, auan);
                        if (n29 < 16) {
                            w2 = auan.j[auan.J + aual.h[n29] & 0x3] + aual.i[n29];
                            if ((auan.W = w2) < 0) {
                                throw new auaj("Negative distance");
                            }
                        }
                        else {
                            final byte b3 = auan.e[n29];
                            int n30;
                            if (auan.t + b3 <= auah.a) {
                                n30 = auah.d(auan, b3);
                            }
                            else {
                                auah.i(auan);
                                n30 = auah.c(auan, b3);
                            }
                            w2 = (n30 << auan.V) + auan.o[n29];
                            auan.W = w2;
                        }
                    }
                    final int i2 = auan.I;
                    int y2 = auan.Y;
                    Label_2415: {
                        if (i2 != y2) {
                            final int h7 = auan.H;
                            if (h7 < y2) {
                                auan.I = h7;
                                y2 = h7;
                                break Label_2415;
                            }
                        }
                        auan.I = y2;
                    }
                    if (w2 > y2) {
                        auan.q = 9;
                        continue Label_1619_Outer;
                    }
                    if (n29 > 0) {
                        final int j2 = auan.J + 1 & 0x3;
                        auan.J = j2;
                        auan.j[j2] = w2;
                    }
                    if (auan.X > auan.x) {
                        throw new auaj("Invalid backward reference");
                    }
                    auan.N = 0;
                    auan.q = 8;
                }
                int h8 = auan.H;
                int n31 = h8 - auan.W & n3;
                final int n32 = auan.X - auan.N;
                final int n33 = h8 + n32;
                final int n34 = n31 + n32;
                Label_2794: {
                    if (n34 < n3) {
                        if (n33 < n3) {
                            if (n32 >= 12 && (n34 <= h8 || n33 <= n31)) {
                                auap.b(array, h8, n31, n34);
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
                            auan.N += n32;
                            auan.x -= n32;
                            auan.H += n32;
                            break Label_2794;
                        }
                    }
                    int h9;
                    do {
                        final int n42 = auan.N;
                        if (n42 >= auan.X) {
                            break Label_2794;
                        }
                        h9 = auan.H;
                        array[h9] = array[h9 - auan.W & n3];
                        --auan.x;
                        ++h9;
                        auan.H = h9;
                        auan.N = n42 + 1;
                    } while (h9 < n2);
                    auan.r = 8;
                    auan.q = 12;
                }
                if (auan.q != 8) {
                    continue;
                }
                auan.q = 4;
            }
            else {
                if (auan.x >= 0) {
                    auah.k(auan);
                    auah.f(auan, 1);
                    return;
                }
                throw new auaj("Invalid metablock length");
            }
        }
    }
    
    static void c(final auan auan, final InputStream ap) {
        if (auan.q == 0) {
            (auan.k = new int[3091])[0] = 7;
            auan.J = 3;
            final int p2 = p(3, 120);
            auan.e = new byte[p2];
            auan.o = new int[p2];
            auan.ap = ap;
            auah.j(auan);
            auan.q = 1;
            return;
        }
        throw new IllegalStateException("State MUST be uninitialized");
    }
    
    private static int d(int n, final int n2, final int n3) {
        n = n3 << n;
        return n2 + 16 + (n + n);
    }
    
    private static int e(final auan auan) {
        final int aa = auan.aa;
        final int ah = auan.ah;
        return aa;
    }
    
    private static int f(final auan auan, int m, final int n) {
        final int[] j = auan.j;
        auah.i(auan);
        final int[] k = auan.k;
        final int n2 = m + m;
        m = m(k, n2, auan);
        final int i = j(auan.k, n2 + 1, auan);
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
    
    private static int g(final int n, final byte[] array, final auan auan) {
        auah.l(auan);
        final int n2 = h(auan) + 1;
        if (n2 == 1) {
            int n3;
            for (int i = 0; i < n; i += n3) {
                n3 = Math.min(i + 1024, n) - i;
                System.arraycopy(auap.a, 0, array, i, n3);
            }
            return 1;
        }
        auah.i(auan);
        int n4;
        if (auah.d(auan, 1) != 0) {
            n4 = auah.d(auan, 4) + 1;
        }
        else {
            n4 = 0;
        }
        final int n5 = n2 + n4;
        final int n6 = aual.a[n5 + 31 >> 5] + 1;
        final int[] array2 = new int[n6];
        final int n7 = n6 - 1;
        k(n5, n5, array2, n7, auan);
        int j = 0;
    Label_0131:
        while (j < n) {
            auah.l(auan);
            auah.i(auan);
            final int m = m(array2, n7, auan);
            if (m == 0) {
                array[j] = 0;
            }
            else {
                if (m <= n4) {
                    auah.i(auan);
                    int n8 = (1 << m) + auah.d(auan, m);
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
                    throw new auaj("Corrupted context map");
                }
                array[j] = (byte)(m - n4);
            }
            ++j;
        }
        auah.i(auan);
        if (auah.d(auan, 1) == 1) {
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
    
    private static int h(final auan auan) {
        auah.i(auan);
        if (auah.d(auan, 1) == 0) {
            return 0;
        }
        final int d = auah.d(auan, 3);
        if (d == 0) {
            return 1;
        }
        return auah.d(auan, d) + (1 << d);
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
    
    private static int j(final int[] array, int n, final auan auan) {
        auah.i(auan);
        final int m = m(array, n, auan);
        n = aual.c[m];
        auah.i(auan);
        return aual.b[m] + auah.c(auan, n);
    }
    
    private static int k(int i, final int n, final int[] array, final int n2, final auan auan) {
        auah.l(auan);
        auah.i(auan);
        final int d = auah.d(auan, 2);
        if (d == 1) {
            final int[] array2 = new int[n];
            final int[] array3 = new int[4];
            final int n3 = auah.d(auan, 2) + 1;
            for (int j = 0; j < n3; ++j) {
                final int k = i(i - 1);
                auah.i(auan);
                final int d2 = auah.d(auan, k + 1);
                if (d2 >= n) {
                    throw new auaj("Can't readHuffmanCode");
                }
                array3[j] = d2;
            }
            for (int l = 0; l < n3 - 1; l = i) {
                int n4;
                for (i = (n4 = l + 1); n4 < n3; ++n4) {
                    if (array3[l] == array3[n4]) {
                        throw new auaj("Duplicate simple Huffman code symbol");
                    }
                }
            }
            if ((i = n3) == 4) {
                i = auah.d(auan, 1) + 4;
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
            return auaq.b(array, n2, 8, array2, n);
        }
        final int[] array4 = new int[n];
        final int[] array5 = new int[18];
        i = d;
        int n5 = 0;
        int n6;
        int n9;
        int n10;
        for (n6 = 32; i < 18 && n6 > 0; ++i, n5 = n9, n6 = n10) {
            final int n7 = aual.g[i];
            auah.i(auan);
            final int b = auah.b(auan);
            final int t = auan.t;
            final int n8 = aual.j[b & 0xF];
            auan.t = t + (n8 >> 16);
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
            throw new auaj("Corrupted Huffman code histogram");
        }
        final int[] array6 = new int[33];
        auaq.b(array6, 32, 5, array5, 18);
        i = 0;
        int n11 = 8;
        int n12 = 0;
        int n13 = 0;
        int n14 = 32768;
        while (i < n && n14 > 0) {
            auah.l(auan);
            auah.i(auan);
            final int b2 = auah.b(auan);
            final int t2 = auan.t;
            final int n15 = array6[b2 & 0x1F];
            auan.t = t2 + (n15 >> 16);
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
                auah.i(auan);
                final int n21 = n20 + (auah.d(auan, n17) + 3);
                final int n22 = n21 - n13;
                if (i + n22 > n) {
                    throw new auaj("symbol + repeatDelta > numSymbols");
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
                System.arraycopy(auap.b, 0, array4, i, n25);
                i += n25;
            }
            return auaq.b(array, n2, 8, array4, n);
        }
        throw new auaj("Unused space");
    }
    
    private static int l(final auan auan, int n, int n2) {
        final int[] k = auan.k;
        n += n;
        final int n3 = k[n];
        if (n2 <= 1) {
            k[n + 2] = (k[n + 1] = n3);
            return 268435456;
        }
        n2 += 2;
        final int n4 = n3 + k(n2, n2, k, n, auan);
        final int[] i = auan.k;
        n2 = n + 1;
        i[n2] = n4;
        final int j = k(26, 26, i, n2, auan);
        final int[] l = auan.k;
        l[n + 2] = n4 + j;
        return j(l, n2, auan);
    }
    
    private static int m(final int[] array, int b, final auan auan) {
        final int n = array[b];
        b = auah.b(auan);
        final int n2 = n + (b & 0xFF);
        final int n3 = array[n2];
        final int n4 = n3 >> 16;
        final char c = (char)n3;
        if (n4 <= 8) {
            auan.t += n4;
            return c;
        }
        final int t = auan.t;
        b = array[n2 + c + ((b & (1 << n4) - 1) >>> 8)];
        auan.t = t + ((b >> 16) + 8);
        return (char)b;
    }
    
    private static void n(final auan auan) {
        auan.B = f(auan, 0, auan.C);
        final int n = auan.j[5];
        final int p = n << 6;
        auan.P = p;
        auan.L = (auan.c[p] & 0xFF);
        final int r = auan.b[n] << 9;
        auan.R = r;
        auan.S = r + 256;
    }
    
    private static int[] o(final int n, final int n2, final int n3, final auan auan) {
        final int[] array = new int[aual.a[n2 + 31 >> 5] * n3 + n3];
        int i = 0;
        int n4 = n3;
        while (i < n3) {
            array[i] = n4;
            n4 += k(n, n2, array, i, auan);
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
