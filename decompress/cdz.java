import java.util.Iterator;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.ArrayList;
import android.graphics.Color;
import java.util.List;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

final class cdz
{
    private static final Comparator e;
    final int[] a;
    final int[] b;
    final List c;
    final cdn[] d;
    private final float[] f;
    
    static {
        e = (Comparator)new mn(5);
    }
    
    public cdz(int[] a, int i, final cdn[] d, final byte[] array) {
        this.f = new float[3];
        this.d = d;
        final int[] b = new int[32768];
        this.b = b;
        final int n = 0;
        for (int j = 0; j < a.length; ++j) {
            final int n2 = a[j];
            final int n3 = g(Color.blue(n2), 8, 5) | (g(Color.red(n2), 8, 5) << 10 | g(Color.green(n2), 8, 5) << 5);
            b[a[j] = n3] = b[n3] + 1;
        }
        int k = 0;
        int n4 = 0;
        while (k < 32768) {
            if (b[k] > 0) {
                aia.h(f(k), this.f);
                if (this.h(this.f)) {
                    b[k] = 0;
                }
            }
            int n5 = n4;
            if (b[k] > 0) {
                n5 = n4 + 1;
            }
            ++k;
            n4 = n5;
        }
        a = new int[n4];
        this.a = a;
        int l = 0;
        int n6 = 0;
        while (l < 32768) {
            int n7 = n6;
            if (b[l] > 0) {
                a[n6] = l;
                n7 = n6 + 1;
            }
            ++l;
            n6 = n7;
        }
        if (n4 <= i) {
            this.c = new ArrayList();
            int n8;
            for (i = n; i < n4; ++i) {
                n8 = a[i];
                this.c.add(new ced(f(n8), b[n8]));
            }
            return;
        }
        final PriorityQueue<cdy> priorityQueue = new PriorityQueue<cdy>(i, cdz.e);
        priorityQueue.offer(new cdy(this, 0, this.a.length - 1));
        while (priorityQueue.size() < i) {
            final cdy cdy = priorityQueue.poll();
            if (cdy == null || !cdy.c()) {
                break;
            }
            if (!cdy.c()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            final int n9 = cdy.e - cdy.d;
            final int n10 = cdy.g - cdy.f;
            final int n11 = cdy.i - cdy.h;
            int n12;
            if (n9 >= n10 && n9 >= n11) {
                n12 = -3;
            }
            else if (n10 >= n9 && n10 >= n11) {
                n12 = -2;
            }
            else {
                n12 = -1;
            }
            final cdz m = cdy.j;
            final int[] a2 = m.a;
            final int[] b2 = m.b;
            e(a2, n12, cdy.a, cdy.b);
            Arrays.sort(a2, cdy.a, cdy.b + 1);
            e(a2, n12, cdy.a, cdy.b);
            final int n13 = cdy.c / 2;
            int a3 = cdy.a;
            int n14 = 0;
            int b4;
            while (true) {
                final int b3 = cdy.b;
                if (a3 > b3) {
                    b4 = cdy.a;
                    break;
                }
                n14 += b2[a2[a3]];
                if (n14 >= n13) {
                    b4 = Math.min(b3 - 1, a3);
                    break;
                }
                ++a3;
            }
            final cdy cdy2 = new cdy(cdy.j, b4 + 1, cdy.b);
            cdy.b = b4;
            cdy.b();
            priorityQueue.offer(cdy2);
            priorityQueue.offer(cdy);
        }
        final ArrayList c = new ArrayList<ced>(priorityQueue.size());
        for (final cdy cdy3 : priorityQueue) {
            final cdz j2 = cdy3.j;
            final int[] a4 = j2.a;
            final int[] b5 = j2.b;
            int a5 = cdy3.a;
            int n15 = 0;
            int n16 = 0;
            int n17 = 0;
            i = 0;
            while (a5 <= cdy3.b) {
                final int n18 = a4[a5];
                final int n19 = b5[n18];
                n16 += n19;
                n15 += d(n18) * n19;
                n17 += c(n18) * n19;
                i += n19 * b(n18);
                ++a5;
            }
            final float n20 = (float)n15;
            final float n21 = (float)n16;
            final ced ced = new ced(a(Math.round(n20 / n21), Math.round(n17 / n21), Math.round(i / n21)), n16);
            if (!this.h(ced.c())) {
                c.add(ced);
            }
        }
        this.c = c;
    }
    
    static int a(final int n, final int n2, final int n3) {
        return Color.rgb(g(n, 5, 8), g(n2, 5, 8), g(n3, 5, 8));
    }
    
    static int b(final int n) {
        return n & 0x1F;
    }
    
    static int c(final int n) {
        return n >> 5 & 0x1F;
    }
    
    static int d(final int n) {
        return n >> 10 & 0x1F;
    }
    
    static void e(final int[] array, int n, int i, final int n2) {
        int j = i;
        if (n != -2) {
            if (n == -1) {
                while (i <= n2) {
                    n = array[i];
                    array[i] = (d(n) | (b(n) << 10 | c(n) << 5));
                    ++i;
                }
            }
        }
        else {
            while (j <= n2) {
                n = array[j];
                final int c = c(n);
                i = d(n);
                array[j] = (b(n) | (c << 10 | i << 5));
                ++j;
            }
        }
    }
    
    private static int f(final int n) {
        return a(d(n), c(n), b(n));
    }
    
    private static int g(int n, final int n2, final int n3) {
        if (n3 > n2) {
            n <<= n3 - n2;
        }
        else {
            n >>= n2 - n3;
        }
        return n & (1 << n3) - 1;
    }
    
    private final boolean h(final float[] array) {
        final cdn[] d = this.d;
        if (d != null) {
            final int length = d.length;
            if (length > 0) {
                int i = 0;
                while (i < length) {
                    final cdn cdn = this.d[i];
                    final float n = array[2];
                    if (n < 0.95f) {
                        if (n > 0.05f) {
                            final float n2 = array[0];
                            if (n2 < 10.0f || n2 > 37.0f || array[1] > 0.82f) {
                                ++i;
                                continue;
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
