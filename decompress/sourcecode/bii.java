import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class bii
{
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public short[] f;
    public int g;
    public short[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    private final int r;
    private final int s;
    private final int t;
    private final short[] u;
    private short[] v;
    
    public bii(int e, final int a, final float b, final float c, final int n) {
        this.r = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = e / (float)n;
        this.s = e / 400;
        e /= 65;
        this.t = e;
        e += e;
        this.e = e;
        this.u = new short[e];
        e *= a;
        this.f = new short[e];
        this.h = new short[e];
        this.v = new short[e];
    }
    
    private final int d(final short[] array, int n, int i, final int n2) {
        final int n3 = n * this.a;
        int n4 = 255;
        int n5 = 1;
        int n6 = 0;
        int n7 = 0;
        while (i <= n2) {
            int j = 0;
            n = 0;
            while (j < i) {
                n += Math.abs(array[n3 + j] - array[n3 + i + j]);
                ++j;
            }
            final int n8 = n * n6;
            final int n9 = n5 * i;
            if (n8 < n9) {
                n5 = n;
            }
            if (n8 < n9) {
                n6 = i;
            }
            final int n10 = n * n4;
            final int n11 = n7 * i;
            if (n10 > n11) {
                n7 = n;
            }
            if (n10 > n11) {
                n4 = i;
            }
            ++i;
        }
        this.p = n5 / n6;
        this.q = n7 / n4;
        return n6;
    }
    
    private final void e(final short[] array, final int n, final int n2) {
        final short[] c = this.c(this.h, this.i, n2);
        this.h = c;
        final int a = this.a;
        System.arraycopy(array, n * a, c, this.i * a, a * n2);
        this.i += n2;
    }
    
    private final void f(final short[] array, final int n, int i) {
        final int n2 = this.e / i;
        final int a = this.a;
        final int n3 = i * a;
        short n4;
        int n5;
        for (i = 0; i < n2; ++i) {
            n4 = 0;
            n5 = 0;
            while (n4 < n3) {
                n5 += array[i * n3 + n * a + n4];
                ++n4;
            }
            this.u[i] = (short)(n5 / n3);
        }
    }
    
    private static void g(final int n, final int n2, final short[] array, final int n3, final short[] array2, final int n4, final short[] array3, final int n5) {
        for (int i = 0; i < n2; ++i) {
            int n6 = n3 * n2 + i;
            int n7 = n5 * n2 + i;
            int n8 = n4 * n2 + i;
            for (short n9 = 0; n9 < n; ++n9) {
                array[n6] = (short)((array2[n8] * (n - n9) + array3[n7] * n9) / n);
                n6 += n2;
                n8 += n2;
                n7 += n2;
            }
        }
    }
    
    public final int a() {
        final int n = this.i * this.a;
        return n + n;
    }
    
    public final void b() {
        final int i = this.i;
        final float b = this.b;
        final float c = this.c;
        final float n = b / c;
        final float n2 = this.d * c;
        final double n3 = n;
        if (n3 <= 1.00001 && n3 >= 0.99999) {
            this.e(this.f, 0, this.g);
            this.g = 0;
        }
        else {
            final int g = this.g;
            if (g >= this.e) {
                int n4 = 0;
                int n5;
                while (true) {
                    final int m = this.m;
                    if (m > 0) {
                        final int min = Math.min(this.e, m);
                        this.e(this.f, n4, min);
                        this.m -= min;
                        n5 = n4 + min;
                    }
                    else {
                        final short[] f = this.f;
                        final int r = this.r;
                        int n6;
                        if (r > 4000) {
                            n6 = r / 4000;
                        }
                        else {
                            n6 = 1;
                        }
                        int n7;
                        if (this.a == 1 && n6 == 1) {
                            n7 = this.d(f, n4, this.s, this.t);
                        }
                        else {
                            this.f(f, n4, n6);
                            final int d = this.d(this.u, 0, this.s / n6, this.t / n6);
                            if (n6 != 1) {
                                final int n8 = d * n6;
                                final int n9 = n6 * 4;
                                int n10 = n8 - n9;
                                final int n11 = n8 + n9;
                                final int s = this.s;
                                if (n10 < s) {
                                    n10 = s;
                                }
                                final int t = this.t;
                                int n12 = n11;
                                if (n11 > t) {
                                    n12 = t;
                                }
                                if (this.a == 1) {
                                    n7 = this.d(f, n4, n10, n12);
                                }
                                else {
                                    this.f(f, n4, 1);
                                    n7 = this.d(this.u, 0, n10, n12);
                                }
                            }
                            else {
                                n7 = d;
                            }
                        }
                        final int p = this.p;
                        final int q = this.q;
                        int n13 = 0;
                        Label_0449: {
                            if (p != 0) {
                                n13 = this.n;
                                if (n13 != 0) {
                                    if (q <= p * 3) {
                                        if (p + p > this.o * 3) {
                                            break Label_0449;
                                        }
                                    }
                                }
                            }
                            n13 = n7;
                        }
                        this.o = p;
                        this.n = n7;
                        if (n3 > 1.0) {
                            final short[] f2 = this.f;
                            int n14;
                            if (n >= 2.0f) {
                                n14 = (int)(n13 / (-1.0f + n));
                            }
                            else {
                                this.m = (int)(n13 * (2.0f - n) / (-1.0f + n));
                                n14 = n13;
                            }
                            final short[] c2 = this.c(this.h, this.i, n14);
                            this.h = c2;
                            g(n14, this.a, c2, this.i, f2, n4, f2, n4 + n13);
                            this.i += n14;
                            n5 = n4 + (n13 + n14);
                        }
                        else {
                            final short[] f3 = this.f;
                            int n15;
                            if (n < 0.5f) {
                                n15 = (int)(n13 * n / (1.0f - n));
                            }
                            else {
                                this.m = (int)(n13 * (n + n - 1.0f) / (1.0f - n));
                                n15 = n13;
                            }
                            final int n16 = n13 + n15;
                            final short[] c3 = this.c(this.h, this.i, n16);
                            this.h = c3;
                            final int a = this.a;
                            System.arraycopy(f3, n4 * a, c3, this.i * a, a * n13);
                            g(n15, this.a, this.h, this.i + n13, f3, n4 + n13, f3, n4);
                            this.i += n16;
                            n5 = n4 + n15;
                        }
                    }
                    if (this.e + n5 > g) {
                        break;
                    }
                    n4 = n5;
                }
                final int g2 = this.g - n5;
                final short[] f4 = this.f;
                final int a2 = this.a;
                System.arraycopy(f4, n5 * a2, f4, 0, a2 * g2);
                this.g = g2;
            }
        }
        if (n2 != 1.0f) {
            if (this.i != i) {
                int r2;
                int n17;
                for (r2 = this.r, n17 = (int)(r2 / n2); n17 > 16384 || r2 > 16384; n17 /= 2, r2 /= 2) {}
                final int n18 = this.i - i;
                final short[] c4 = this.c(this.v, this.j, n18);
                this.v = c4;
                final short[] h = this.h;
                final int a3 = this.a;
                System.arraycopy(h, i * a3, c4, this.j * a3, a3 * n18);
                this.i = i;
                this.j += n18;
                int n19 = 0;
                int j;
                int n20;
                while (true) {
                    j = this.j;
                    n20 = j - 1;
                    if (n19 >= n20) {
                        break;
                    }
                    int k;
                    int l;
                    while (true) {
                        k = this.k + 1;
                        l = this.l;
                        if (k * n17 <= l * r2) {
                            break;
                        }
                        this.h = this.c(this.h, this.i, 1);
                        int n21 = 0;
                        while (true) {
                            final int a4 = this.a;
                            if (n21 >= a4) {
                                break;
                            }
                            final short[] h2 = this.h;
                            final int i2 = this.i;
                            final short[] v = this.v;
                            final int n22 = n19 * a4 + n21;
                            final short n23 = v[n22];
                            final short n24 = v[n22 + a4];
                            final int l2 = this.l;
                            final int k2 = this.k;
                            final int n25 = (k2 + 1) * n17;
                            final int n26 = n25 - l2 * r2;
                            final int n27 = n25 - k2 * n17;
                            h2[i2 * a4 + n21] = (short)((n23 * n26 + (n27 - n26) * n24) / n27);
                            ++n21;
                        }
                        ++this.l;
                        ++this.i;
                    }
                    if ((this.k = k) == r2) {
                        this.k = 0;
                        dk.h(l == n17);
                        this.l = 0;
                    }
                    ++n19;
                }
                if (n20 != 0) {
                    final short[] v2 = this.v;
                    final int a5 = this.a;
                    System.arraycopy(v2, n20 * a5, v2, 0, (j - n20) * a5);
                    this.j -= n20;
                }
            }
        }
    }
    
    public final short[] c(final short[] array, final int n, final int n2) {
        final int length = array.length;
        final int a = this.a;
        final int n3 = length / a;
        if (n + n2 <= n3) {
            return array;
        }
        return Arrays.copyOf(array, (n3 * 3 / 2 + n2) * a);
    }
}
