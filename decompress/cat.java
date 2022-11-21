// 
// Decompiled by Procyon v0.6.0
// 

final class cat implements cau
{
    private static final int[] a;
    private static final int[] b;
    private final btp c;
    private final bug d;
    private final cax e;
    private final int f;
    private final byte[] g;
    private final bat h;
    private final int i;
    private final ayh j;
    private int k;
    private long l;
    private int m;
    private long n;
    
    static {
        a = new int[] { -1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8 };
        b = new int[] { 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767 };
    }
    
    public cat(final btp c, final bug d, final cax e) {
        this.c = c;
        this.d = d;
        this.e = e;
        final int max = Math.max(1, e.c / 10);
        this.i = max;
        final bat bat = new bat(e.f);
        bat.g();
        final int g = bat.g();
        this.f = g;
        final int b = e.b;
        final int n = (e.d - b * 4) * 8 / (e.e * b) + 1;
        if (g == n) {
            final int c2 = baz.c(max, g);
            this.g = new byte[e.d * c2];
            this.h = new bat(c2 * ((g + g) * b));
            final int c3 = e.c;
            final int n2 = e.d * c3 * 8 / g;
            final ayg ayg = new ayg();
            ayg.k = "audio/raw";
            ayg.f = n2;
            ayg.g = n2;
            ayg.l = (max + max) * b;
            ayg.x = e.b;
            ayg.y = c3;
            ayg.z = 2;
            this.j = ayg.a();
            return;
        }
        final StringBuilder sb = new StringBuilder("Expected frames per block: ");
        sb.append(n);
        sb.append("; got: ");
        sb.append(g);
        throw azb.a(sb.toString(), null);
    }
    
    private final int d(final int n) {
        final int b = this.e.b;
        return n / (b + b);
    }
    
    private final int e(final int n) {
        return (n + n) * this.e.b;
    }
    
    private final void f(final int n) {
        final long l = this.l;
        final long y = baz.y(this.n, 1000000L, this.e.c);
        final int e = this.e(n);
        this.d.e(l + y, 1, e, this.m - e, (buf)null);
        this.n += n;
        this.m -= e;
    }
    
    @Override
    public final void a(final int n, final long n2) {
        this.c.x((bud)new cay(this.e, this.f, n, n2));
        this.d.b(this.j);
    }
    
    @Override
    public final void b(final long l) {
        this.k = 0;
        this.l = l;
        this.m = 0;
        this.n = 0L;
    }
    
    @Override
    public final boolean c(final btn btn, final long n) {
        final int n2 = baz.c(this.i - this.d(this.m), this.f) * this.e.d;
        while (true) {
            Label_0036: {
                if (n == 0L) {
                    break Label_0036;
                }
                final boolean b = false;
                while (!b) {
                    final int k = this.k;
                    if (k >= n2) {
                        break;
                    }
                    final int a = btn.a(this.g, this.k, (int)Math.min(n2 - k, n));
                    if (a == -1) {
                        break Label_0036;
                    }
                    this.k += a;
                }
                final int n3 = this.k / this.e.d;
                if (n3 > 0) {
                    final byte[] g = this.g;
                    final bat h = this.h;
                    for (int i = 0; i < n3; ++i) {
                        int n4 = 0;
                        while (true) {
                            final cax e = this.e;
                            final int b2 = e.b;
                            if (n4 >= b2) {
                                break;
                            }
                            final byte[] a2 = h.a;
                            final int d = e.d;
                            final int n5 = d / b2 - 4;
                            final int n6 = i * d + n4 * 4;
                            final byte b3 = g[n6 + 1];
                            final byte b4 = g[n6];
                            int n7 = Math.min(g[n6 + 2] & 0xFF, 88);
                            int n8 = cat.b[n7];
                            final int n9 = this.f * i * b2 + n4;
                            int e2 = (short)((b3 & 0xFF) << 8 | (b4 & 0xFF));
                            int n10 = n9 + n9;
                            a2[n10] = (byte)(e2 & 0xFF);
                            a2[n10 + 1] = (byte)(e2 >> 8);
                            for (int j = 0; j < n5 + n5; ++j) {
                                final int n11 = g[b2 * 4 + n6 + j / 8 * b2 * 4 + j / 2 % 4] & 0xFF;
                                int n12;
                                if (j % 2 == 0) {
                                    n12 = (n11 & 0xF);
                                }
                                else {
                                    n12 = n11 >> 4;
                                }
                                final int n13 = n12 & 0x7;
                                int n14 = (n13 + n13 + 1) * n8 >> 3;
                                if ((n12 & 0x8) != 0x0) {
                                    n14 = -n14;
                                }
                                n10 += b2 + b2;
                                e2 = baz.e(e2 + n14, -32768, 32767);
                                a2[n10] = (byte)(e2 & 0xFF);
                                a2[n10 + 1] = (byte)(e2 >> 8);
                                n7 = baz.e(n7 + cat.a[n12], 0, 88);
                                n8 = cat.b[n7];
                            }
                            ++n4;
                        }
                    }
                    final int e3 = this.e(this.f * n3);
                    h.G(0);
                    h.F(e3);
                    this.k -= n3 * this.e.d;
                    final bat h2 = this.h;
                    final int c = h2.c;
                    this.d.c(h2, c);
                    final int m = this.m + c;
                    this.m = m;
                    final int d2 = this.d(m);
                    final int l = this.i;
                    if (d2 >= l) {
                        this.f(l);
                    }
                }
                if (b) {
                    final int d3 = this.d(this.m);
                    if (d3 > 0) {
                        this.f(d3);
                    }
                }
                return b;
            }
            final boolean b = true;
            continue;
        }
    }
}
