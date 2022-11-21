// 
// Decompiled by Procyon v0.6.0
// 

final class audd
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
    
    static int a(final audk audk) {
        int g = audd.g;
        if (audk.w != 0) {
            g = audk.v + (audd.f - 1) >> audd.j;
        }
        return g - audk.u;
    }
    
    static int b(final audk audk) {
        if (audd.a == 64) {
            return (int)(audk.p >>> audk.t);
        }
        return audk.s >>> audk.t;
    }
    
    static int c(final audk audk, int d) {
        if (audd.e >= 24) {
            return d(audk, d);
        }
        if (d <= 16) {
            d = d(audk, d);
        }
        else {
            final int d2 = d(audk, 16);
            h(audk);
            d = (d(audk, d - 16) << 16 | d2);
        }
        return d;
    }
    
    static int d(final audk audk, final int n) {
        final int b = b(audk);
        audk.t += n;
        return (1 << n) - 1 & b;
    }
    
    static void e(final audk audk) {
        final int t = audk.t;
        if (t <= audd.a) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Accumulator underloaded: ");
        sb.append(t);
        throw new IllegalStateException(sb.toString());
    }
    
    static void f(final audk audk, final int n) {
        if (audk.w == 0) {
            return;
        }
        final int n2 = (audk.u << audd.j) + (audk.t + 7 >> 3) - audd.d;
        final int v = audk.v;
        if (n2 > v) {
            throw new audf("Read after end");
        }
        if (n != 0 && n2 != v) {
            throw new audf("Unused bytes after end");
        }
    }
    
    static void g(final audk audk, final byte[] array, int n, int i) {
        if ((audk.t & 0x7) != 0x0) {
            throw new audf("Unaligned copyBytes");
        }
        int n2;
        int n3;
        for (n2 = i, n3 = n; audk.t != audd.a && n2 != 0; --n2, ++n3) {
            array[n3] = (byte)b(audk);
            audk.t += 8;
        }
        if (n2 == 0) {
            return;
        }
        n = a(audk);
        final int j = audd.j;
        final int min = Math.min(n, n2 >> j);
        n = n3;
        i = n2;
        if (min > 0) {
            n = audk.u;
            i = min << j;
            System.arraycopy(audk.g, n << j, array, n3, i);
            n = n3 + i;
            i = n2 - i;
            audk.u += min;
        }
        if (i == 0) {
            return;
        }
        int n4 = n;
        int k = i;
        if (a(audk) > 0) {
            i(audk);
            while (i != 0) {
                array[n] = (byte)b(audk);
                audk.t += 8;
                --i;
                ++n;
            }
            f(audk, 0);
            return;
        }
        while (k > 0) {
            n = audm.a(audk.ap, array, n4, k);
            if (n == -1) {
                throw new audf("Unexpected end of input");
            }
            n4 += n;
            k -= n;
        }
    }
    
    static void h(final audk audk) {
        if (audd.c != 0) {
            e(audk);
        }
        if (audd.a == 64) {
            final long n = audk.i[audk.u++];
            final int e = audd.e;
            audk.p = (n << e | audk.p >>> e);
        }
        else {
            final short n2 = audk.h[audk.u++];
            final int e2 = audd.e;
            audk.s = (n2 << e2 | audk.s >>> e2);
        }
        audk.t -= audd.e;
    }
    
    static void i(final audk audk) {
        if (audd.c != 0) {
            e(audk);
        }
        final int t = audk.t;
        final int e = audd.e;
        if (t >= e) {
            if (audd.a == 64) {
                audk.p = ((long)audk.i[audk.u++] << e | audk.p >>> e);
            }
            else {
                audk.s = (audk.h[audk.u++] << e | audk.s >>> e);
            }
            audk.t = t - e;
        }
    }
    
    static void j(final audk audk) {
        audk.g = new byte[4160];
        final int a = audd.a;
        if (a == 64) {
            audk.p = 0L;
            audk.i = new int[audd.h];
        }
        else {
            audk.s = 0;
            audk.h = new short[audd.h];
        }
        audk.t = a;
        audk.u = audd.g;
        audk.w = 0;
        n(audk);
    }
    
    static void k(final audk audk) {
        final int n = audd.a - audk.t & 0x7;
        if (n != 0 && d(audk, n) != 0) {
            throw new audf("Corrupted padding bits");
        }
    }
    
    static void l(final audk audk) {
        final int u = audk.u;
        if (u > audd.i) {
            if (audk.w != 0) {
                if (a(audk) < -2) {
                    throw new audf("No more input");
                }
            }
            else {
                final int n = u << audd.j;
                final byte[] g = audk.g;
                final int n2 = 0;
                final int n3 = 0;
                audm.b(g, 0, n, 4096);
                audk.u = 0;
                int v = 4096 - n;
                int n4;
                while (true) {
                    n4 = v;
                    if (v >= 4096) {
                        break;
                    }
                    final int a = audm.a(audk.ap, audk.g, v, 4096 - v);
                    if (a <= 0) {
                        audk.w = 1;
                        audk.v = v;
                        n4 = v + (audd.f - 1);
                        break;
                    }
                    v += a;
                }
                final byte[] g2 = audk.g;
                final int n5 = n4 >> audd.j;
                if (audd.a == 64) {
                    final int[] i = audk.i;
                    for (int j = n3; j < n5; ++j) {
                        final int n6 = j * 4;
                        i[j] = ((g2[n6 + 3] & 0xFF) << 24 | ((g2[n6] & 0xFF) | (g2[n6 + 1] & 0xFF) << 8 | (g2[n6 + 2] & 0xFF) << 16));
                    }
                }
                else {
                    final short[] h = audk.h;
                    for (int k = n2; k < n5; ++k) {
                        final int n7 = k + k;
                        h[k] = (short)((g2[n7 + 1] & 0xFF) << 8 | (g2[n7] & 0xFF));
                    }
                }
            }
        }
    }
    
    static void m(final audk audk) {
        if (audk.t == audd.a) {
            n(audk);
        }
    }
    
    private static void n(final audk audk) {
        l(audk);
        f(audk, 0);
        h(audk);
        h(audk);
    }
}
