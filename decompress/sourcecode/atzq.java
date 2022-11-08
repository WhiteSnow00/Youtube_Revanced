// 
// Decompiled by Procyon v0.6.0
// 

final class atzq
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
    
    static int a(final atzw atzw) {
        int g = atzq.g;
        if (atzw.w != 0) {
            g = atzw.v + (atzq.f - 1) >> atzq.j;
        }
        return g - atzw.u;
    }
    
    static int b(final atzw atzw) {
        if (atzq.a == 64) {
            return (int)(atzw.p >>> atzw.t);
        }
        return atzw.s >>> atzw.t;
    }
    
    static int c(final atzw atzw, int d) {
        if (atzq.e >= 24) {
            return d(atzw, d);
        }
        if (d <= 16) {
            d = d(atzw, d);
        }
        else {
            final int d2 = d(atzw, 16);
            h(atzw);
            d = (d(atzw, d - 16) << 16 | d2);
        }
        return d;
    }
    
    static int d(final atzw atzw, final int n) {
        final int b = b(atzw);
        atzw.t += n;
        return (1 << n) - 1 & b;
    }
    
    static void e(final atzw atzw) {
        final int t = atzw.t;
        if (t <= atzq.a) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Accumulator underloaded: ");
        sb.append(t);
        throw new IllegalStateException(sb.toString());
    }
    
    static void f(final atzw atzw, final int n) {
        if (atzw.w == 0) {
            return;
        }
        final int n2 = (atzw.u << atzq.j) + (atzw.t + 7 >> 3) - atzq.d;
        final int v = atzw.v;
        if (n2 > v) {
            throw new atzs("Read after end");
        }
        if (n != 0 && n2 != v) {
            throw new atzs("Unused bytes after end");
        }
    }
    
    static void g(final atzw atzw, final byte[] array, int i, int u) {
        if ((atzw.t & 0x7) != 0x0) {
            throw new atzs("Unaligned copyBytes");
        }
        int n;
        int n2;
        for (n = u, n2 = i; atzw.t != atzq.a && n != 0; --n, ++n2) {
            array[n2] = (byte)b(atzw);
            atzw.t += 8;
        }
        if (n == 0) {
            return;
        }
        i = a(atzw);
        final int j = atzq.j;
        final int min = Math.min(i, n >> j);
        u = n2;
        i = n;
        if (min > 0) {
            u = atzw.u;
            i = min << j;
            System.arraycopy(atzw.g, u << j, array, n2, i);
            u = n2 + i;
            i = n - i;
            atzw.u += min;
        }
        if (i == 0) {
            return;
        }
        int n3 = u;
        int k = i;
        if (a(atzw) > 0) {
            i(atzw);
            while (i != 0) {
                array[u] = (byte)b(atzw);
                atzw.t += 8;
                --i;
                ++u;
            }
            f(atzw, 0);
            return;
        }
        while (k > 0) {
            i = atzy.a(atzw.ap, array, n3, k);
            if (i == -1) {
                throw new atzs("Unexpected end of input");
            }
            n3 += i;
            k -= i;
        }
    }
    
    static void h(final atzw atzw) {
        if (atzq.c != 0) {
            e(atzw);
        }
        if (atzq.a == 64) {
            final int n = atzw.i[atzw.u++];
            final int e = atzq.e;
            atzw.p = (atzw.p >>> e | (long)n << e);
        }
        else {
            final short n2 = atzw.h[atzw.u++];
            final int e2 = atzq.e;
            atzw.s = (n2 << e2 | atzw.s >>> e2);
        }
        atzw.t -= atzq.e;
    }
    
    static void i(final atzw atzw) {
        if (atzq.c != 0) {
            e(atzw);
        }
        final int t = atzw.t;
        final int e = atzq.e;
        if (t >= e) {
            if (atzq.a == 64) {
                atzw.p = ((long)atzw.i[atzw.u++] << e | atzw.p >>> e);
            }
            else {
                atzw.s = (atzw.h[atzw.u++] << e | atzw.s >>> e);
            }
            atzw.t = t - e;
        }
    }
    
    static void j(final atzw atzw) {
        atzw.g = new byte[4160];
        final int a = atzq.a;
        if (a == 64) {
            atzw.p = 0L;
            atzw.i = new int[atzq.h];
        }
        else {
            atzw.s = 0;
            atzw.h = new short[atzq.h];
        }
        atzw.t = a;
        atzw.u = atzq.g;
        atzw.w = 0;
        n(atzw);
    }
    
    static void k(final atzw atzw) {
        final int n = atzq.a - atzw.t & 0x7;
        if (n != 0 && d(atzw, n) != 0) {
            throw new atzs("Corrupted padding bits");
        }
    }
    
    static void l(final atzw atzw) {
        final int u = atzw.u;
        if (u > atzq.i) {
            if (atzw.w != 0) {
                if (a(atzw) < -2) {
                    throw new atzs("No more input");
                }
            }
            else {
                final int n = u << atzq.j;
                int v = 4096 - n;
                final byte[] g = atzw.g;
                final int n2 = 0;
                final int n3 = 0;
                atzy.b(g, 0, n, 4096);
                atzw.u = 0;
                int n4;
                while (true) {
                    n4 = v;
                    if (v >= 4096) {
                        break;
                    }
                    final int a = atzy.a(atzw.ap, atzw.g, v, 4096 - v);
                    if (a <= 0) {
                        atzw.w = 1;
                        atzw.v = v;
                        n4 = v + (atzq.f - 1);
                        break;
                    }
                    v += a;
                }
                final byte[] g2 = atzw.g;
                final int n5 = n4 >> atzq.j;
                if (atzq.a == 64) {
                    final int[] i = atzw.i;
                    for (int j = n3; j < n5; ++j) {
                        final int n6 = j * 4;
                        i[j] = ((g2[n6 + 3] & 0xFF) << 24 | ((g2[n6] & 0xFF) | (g2[n6 + 1] & 0xFF) << 8 | (g2[n6 + 2] & 0xFF) << 16));
                    }
                }
                else {
                    final short[] h = atzw.h;
                    for (int k = n2; k < n5; ++k) {
                        final int n7 = k + k;
                        h[k] = (short)((g2[n7 + 1] & 0xFF) << 8 | (g2[n7] & 0xFF));
                    }
                }
            }
        }
    }
    
    static void m(final atzw atzw) {
        if (atzw.t == atzq.a) {
            n(atzw);
        }
    }
    
    private static void n(final atzw atzw) {
        l(atzw);
        f(atzw, 0);
        h(atzw);
        h(atzw);
    }
}
