import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class btw
{
    public static final byte[] a;
    public static final float[] b;
    private static final Object c;
    private static int[] d;
    
    static {
        a = new byte[] { 0, 0, 0, 1 };
        b = new float[] { 1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f };
        c = new Object();
        btw.d = new int[10];
    }
    
    public static int a(final byte[] array, int i, final int n, final boolean[] array2) {
        final int n2 = n - i;
        final boolean b = false;
        dk.h(n2 >= 0);
        if (n2 == 0) {
            return n;
        }
        if (array2[0]) {
            d(array2);
            return i - 3;
        }
        if (n2 > 1 && array2[1] && array[i] == 1) {
            d(array2);
            return i - 2;
        }
        if (n2 > 2 && array2[2] && array[i] == 0 && array[i + 1] == 1) {
            d(array2);
            return i - 1;
        }
        int n3;
        for (n3 = n - 1, i += 2; i < n3; i += 3) {
            final byte b2 = array[i];
            if ((b2 & 0xFE) == 0x0) {
                final int n4 = i - 2;
                if (array[n4] == 0 && array[i - 1] == 0 && b2 == 1) {
                    d(array2);
                    return n4;
                }
                i = n4;
            }
        }
        array2[0] = ((n2 <= 2) ? ((n2 != 2) ? (array2[1] && array[n3] == 1) : (array2[2] && array[n - 2] == 0 && array[n3] == 1)) : (array[n - 3] == 0 && array[n - 2] == 0 && array[n3] == 1));
        array2[1] = ((n2 > 1) ? (array[n - 2] == 0 && array[n3] == 0) : (array2[2] && array[n3] == 0));
        boolean b3 = b;
        if (array[n3] == 0) {
            b3 = true;
        }
        array2[2] = b3;
        return n;
    }
    
    public static int b(final byte[] array, int n) {
        final Object c = btw.c;
        monitorenter(c);
        int i = 0;
        int n2 = 0;
    Label_0129_Outer:
        while (true) {
            Label_0116: {
                int n3 = 0;
                Block_5: {
                    if (i < n) {
                        while (true) {
                            while (i < n - 2) {
                                if (array[i] == 0 && array[i + 1] == 0) {
                                    n3 = i;
                                    if (array[i + 2] == 3) {
                                        if ((i = n3) < n) {
                                            break Block_5;
                                        }
                                        continue Label_0129_Outer;
                                    }
                                }
                                ++i;
                            }
                            n3 = n;
                            continue;
                        }
                    }
                    break Label_0116;
                }
                try {}
                finally {
                    final int[] d = btw.d;
                    final int length = d.length;
                    if (length <= n2) {
                        btw.d = Arrays.copyOf(d, length + length);
                    }
                    btw.d[n2] = n3;
                    i = n3 + 3;
                    ++n2;
                    continue Label_0129_Outer;
                    while (true) {
                        int n4 = 0;
                        iftrue(Label_0198:)(n4 >= n2);
                        int n6 = 0;
                        Block_9: {
                            break Block_9;
                            monitorexit(c);
                            throw;
                            final int n5 = n - n2;
                            n4 = 0;
                            n = 0;
                            n6 = 0;
                            continue;
                            Label_0198: {
                                System.arraycopy(array, n, array, n6, n5 - n6);
                            }
                            monitorexit(c);
                            return n5;
                        }
                        final int n7 = btw.d[n4] - n;
                        System.arraycopy(array, n, array, n6, n7);
                        final int n8 = n6 + n7;
                        final int n9 = n8 + 1;
                        array[n8] = 0;
                        n6 = n9 + 1;
                        array[n9] = 0;
                        n += n7 + 3;
                        ++n4;
                        continue;
                    }
                }
            }
        }
    }
    
    public static btv c(final byte[] array, int n, int f) {
        final int n2 = 1;
        final int n3 = 1;
        final chr chr = new chr(array, n + 1, f);
        f = chr.f(8);
        final int f2 = chr.f(8);
        final int f3 = chr.f(8);
        final int g = chr.g();
        final int n4 = 0;
        n = f;
        int n5 = 0;
        Label_0320: {
            if (f != 100 && (n = f) != 110 && (n = f) != 122 && (n = f) != 244 && (n = f) != 44 && (n = f) != 83 && (n = f) != 86 && (n = f) != 118 && (n = f) != 128) {
                if (f != 138) {
                    n5 = 1;
                    break Label_0320;
                }
                n = 138;
            }
            final int g2 = chr.g();
            int n6;
            if (g2 == 3) {
                chr.k();
                n6 = 3;
            }
            else {
                n6 = g2;
            }
            chr.g();
            chr.g();
            chr.i();
            f = n;
            n5 = g2;
            if (chr.k()) {
                int n7;
                if (n6 != 3) {
                    n7 = 8;
                }
                else {
                    n7 = 12;
                }
                int n8 = 0;
                while (true) {
                    f = n;
                    n5 = g2;
                    if (n8 >= n7) {
                        break;
                    }
                    if (chr.k()) {
                        int n9;
                        if (n8 < 6) {
                            n9 = 16;
                        }
                        else {
                            n9 = 64;
                        }
                        int i = 0;
                        int n10 = 8;
                        int n11 = 8;
                        while (i < n9) {
                            if ((f = n10) != 0) {
                                f = (n11 + chr.h() + 256) % 256;
                            }
                            if (f != 0) {
                                n11 = f;
                            }
                            ++i;
                            n10 = f;
                        }
                    }
                    ++n8;
                }
            }
        }
        chr.g();
        n = chr.g();
        if (n == 0) {
            chr.g();
        }
        else if (n == 1) {
            chr.k();
            chr.h();
            chr.h();
            long n12;
            for (n12 = chr.g(), n = n4; n < n12; ++n) {
                chr.g();
            }
        }
        chr.g();
        chr.i();
        final int g3 = chr.g();
        n = chr.g();
        final int k = chr.k() ? 1 : 0;
        final int n13 = 2 - k;
        if (k == 0) {
            chr.i();
        }
        chr.i();
        final int n14 = (g3 + 1) * 16;
        final int n15 = (n + 1) * n13 * 16;
        int n16 = n14;
        n = n15;
        if (chr.k()) {
            final int g4 = chr.g();
            final int g5 = chr.g();
            final int g6 = chr.g();
            final int g7 = chr.g();
            int n17;
            if (n5 == 0) {
                n17 = n2;
                n = n13;
            }
            else {
                if (n5 == 3) {
                    n = 1;
                }
                else {
                    n = 2;
                }
                int n18 = n3;
                if (n5 == 1) {
                    n18 = 2;
                }
                final int n19 = n13 * n18;
                n17 = n;
                n = n19;
            }
            n16 = n14 - (g4 + g5) * n17;
            n = n15 - (g6 + g7) * n;
        }
        if (chr.k() && chr.k()) {
            final int f4 = chr.f(8);
            if (f4 == 255) {
                final int f5 = chr.f(16);
                final int f6 = chr.f(16);
                if (f5 != 0 && f6 != 0) {
                    final float n20 = f5 / (float)f6;
                    return new btv(f, f2, f3, g, n16, n, n20);
                }
            }
            else {
                if (f4 < 17) {
                    final float n20 = btw.b[f4];
                    return new btv(f, f2, f3, g, n16, n, n20);
                }
                final StringBuilder sb = new StringBuilder("Unexpected aspect_ratio_idc value: ");
                sb.append(f4);
                bao.c("NalUnitUtil", sb.toString());
            }
        }
        final float n20 = 1.0f;
        return new btv(f, f2, f3, g, n16, n, n20);
    }
    
    public static void d(final boolean[] array) {
        array[0] = false;
        array[2] = (array[1] = false);
    }
    
    public static boolean e(final String s, final byte b) {
        final boolean equals = "video/avc".equals(s);
        final boolean b2 = true;
        if (equals) {
            final boolean b3 = b2;
            if ((b & 0x1F) == 0x6) {
                return b3;
            }
        }
        boolean b3;
        if ("video/hevc".equals(s)) {
            if ((b & 0x7E) >> 1 != 39) {
                return false;
            }
            b3 = b2;
        }
        else {
            b3 = false;
        }
        return b3;
    }
    
    public static atvw f(final byte[] array, int g) {
        final chr chr = new chr(array, 4, g);
        g = chr.g();
        chr.g();
        chr.i();
        chr.k();
        return new atvw(g, (char[])null);
    }
}
