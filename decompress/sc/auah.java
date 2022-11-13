// 
// Decompiled by Procyon v0.6.0
// 

final class auah
{
    static final int a;
    private static final int b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;
    
    static {
        int b2;
        if (!Boolean.parseBoolean(System.getProperty("BROTLI_32_BIT_CPU"))) {
            b2 = 6;
        }
        else {
            b2 = 5;
        }
        b = b2;
        c = (Boolean.parseBoolean(System.getProperty("BROTLI_ENABLE_ASSERTS")) ? 1 : 0);
        final int n = a = 1 << b2;
        final int n2 = d = n >> 3;
        e = n >> 1;
        final int n3 = f = n2 >> 1;
        g = 4096 / n3;
        h = 4160 / n3;
        i = 4060 / n3;
        j = b2 - 4;
    }
    
    static int a(final auan auan) {
        int g = auah.g;
        if (auan.w != 0) {
            g = auan.v + (auah.f - 1) >> auah.j;
        }
        return g - auan.u;
    }
    
    static int b(final auan auan) {
        if (auah.a == 64) {
            return (int)(auan.p >>> auan.t);
        }
        return auan.s >>> auan.t;
    }
    
    static int c(final auan auan, int d) {
        if (auah.e >= 24) {
            return d(auan, d);
        }
        if (d <= 16) {
            d = d(auan, d);
        }
        else {
            final int d2 = d(auan, 16);
            h(auan);
            d = (d(auan, d - 16) << 16 | d2);
        }
        return d;
    }
    
    static int d(final auan auan, final int n) {
        final int b = b(auan);
        auan.t += n;
        return (1 << n) - 1 & b;
    }
    
    static void e(final auan auan) {
        final int t = auan.t;
        if (t <= auah.a) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Accumulator underloaded: ");
        sb.append(t);
        throw new IllegalStateException(sb.toString());
    }
    
    static void f(final auan auan, final int n) {
        if (auan.w == 0) {
            return;
        }
        final int n2 = (auan.u << auah.j) + (auan.t + 7 >> 3) - auah.d;
        final int v = auan.v;
        if (n2 > v) {
            throw new auaj("Read after end");
        }
        if (n != 0 && n2 != v) {
            throw new auaj("Unused bytes after end");
        }
    }
    
    static void g(final auan auan, final byte[] array, int n, int i) {
        if ((auan.t & 0x7) != 0x0) {
            throw new auaj("Unaligned copyBytes");
        }
        int n2;
        int n3;
        for (n2 = i, n3 = n; auan.t != auah.a && n2 != 0; --n2, ++n3) {
            array[n3] = (byte)b(auan);
            auan.t += 8;
        }
        if (n2 == 0) {
            return;
        }
        n = a(auan);
        final int j = auah.j;
        final int min = Math.min(n, n2 >> j);
        n = n3;
        i = n2;
        if (min > 0) {
            n = auan.u;
            i = min << j;
            System.arraycopy(auan.g, n << j, array, n3, i);
            n = n3 + i;
            i = n2 - i;
            auan.u += min;
        }
        if (i == 0) {
            return;
        }
        int n4 = n;
        int k = i;
        if (a(auan) > 0) {
            i(auan);
            while (i != 0) {
                array[n] = (byte)b(auan);
                auan.t += 8;
                --i;
                ++n;
            }
            f(auan, 0);
            return;
        }
        while (k > 0) {
            n = auap.a(auan.ap, array, n4, k);
            if (n == -1) {
                throw new auaj("Unexpected end of input");
            }
            n4 += n;
            k -= n;
        }
    }
    
    static void h(final auan auan) {
        if (auah.c != 0) {
            e(auan);
        }
        if (auah.a == 64) {
            final long n = auan.i[auan.u++];
            final int e = auah.e;
            auan.p = (n << e | auan.p >>> e);
        }
        else {
            final short n2 = auan.h[auan.u++];
            final int e2 = auah.e;
            auan.s = (n2 << e2 | auan.s >>> e2);
        }
        auan.t -= auah.e;
    }
    
    static void i(final auan auan) {
        if (auah.c != 0) {
            e(auan);
        }
        final int t = auan.t;
        final int e = auah.e;
        if (t >= e) {
            if (auah.a == 64) {
                auan.p = ((long)auan.i[auan.u++] << e | auan.p >>> e);
            }
            else {
                auan.s = (auan.h[auan.u++] << e | auan.s >>> e);
            }
            auan.t = t - e;
        }
    }
    
    static void j(final auan auan) {
        auan.g = new byte[4160];
        final int a = auah.a;
        if (a == 64) {
            auan.p = 0L;
            auan.i = new int[auah.h];
        }
        else {
            auan.s = 0;
            auan.h = new short[auah.h];
        }
        auan.t = a;
        auan.u = auah.g;
        auan.w = 0;
        n(auan);
    }
    
    static void k(final auan auan) {
        final int n = auah.a - auan.t & 0x7;
        if (n != 0 && d(auan, n) != 0) {
            throw new auaj("Corrupted padding bits");
        }
    }
    
    static void l(final auan auan) {
        final int u = auan.u;
        if (u > auah.i) {
            if (auan.w != 0) {
                if (a(auan) < -2) {
                    throw new auaj("No more input");
                }
            }
            else {
                final int n = u << auah.j;
                final byte[] g = auan.g;
                final int n2 = 0;
                final int n3 = 0;
                auap.b(g, 0, n, 4096);
                auan.u = 0;
                int v = 4096 - n;
                int n4;
                while (true) {
                    n4 = v;
                    if (v >= 4096) {
                        break;
                    }
                    final int a = auap.a(auan.ap, auan.g, v, 4096 - v);
                    if (a <= 0) {
                        auan.w = 1;
                        auan.v = v;
                        n4 = v + (auah.f - 1);
                        break;
                    }
                    v += a;
                }
                final byte[] g2 = auan.g;
                final int n5 = n4 >> auah.j;
                if (auah.a == 64) {
                    final int[] i = auan.i;
                    for (int j = n3; j < n5; ++j) {
                        final int n6 = j * 4;
                        i[j] = ((g2[n6 + 3] & 0xFF) << 24 | ((g2[n6] & 0xFF) | (g2[n6 + 1] & 0xFF) << 8 | (g2[n6 + 2] & 0xFF) << 16));
                    }
                }
                else {
                    final short[] h = auan.h;
                    for (int k = n2; k < n5; ++k) {
                        final int n7 = k + k;
                        h[k] = (short)((g2[n7 + 1] & 0xFF) << 8 | (g2[n7] & 0xFF));
                    }
                }
            }
        }
    }
    
    static void m(final auan auan) {
        if (auan.t == auah.a) {
            n(auan);
        }
    }
    
    private static void n(final auan auan) {
        l(auan);
        f(auan, 0);
        h(auan);
        h(auan);
    }
}
