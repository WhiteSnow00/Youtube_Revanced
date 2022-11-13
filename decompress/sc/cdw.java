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

final class cdw
{
    private static final Comparator e;
    final int[] a;
    final int[] b;
    final List c;
    final ceq[] d;
    private final float[] f;
    
    static {
        e = (Comparator)new mm(5);
    }
    
    public cdw(int[] a, int i, final ceq[] d, final byte[] array) {
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
                ahz.h(f(k), this.f);
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
                this.c.add(new cea(f(n8), b[n8]));
            }
            return;
        }
        final PriorityQueue<cdv> priorityQueue = new PriorityQueue<cdv>(i, cdw.e);
        priorityQueue.offer(new cdv(this, 0, this.a.length - 1));
        while (priorityQueue.size() < i) {
            final cdv cdv = priorityQueue.poll();
            if (cdv == null || !cdv.c()) {
                break;
            }
            if (!cdv.c()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            final int n9 = cdv.e - cdv.d;
            final int n10 = cdv.g - cdv.f;
            final int n11 = cdv.i - cdv.h;
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
            final cdw m = cdv.j;
            final int[] a2 = m.a;
            final int[] b2 = m.b;
            e(a2, n12, cdv.a, cdv.b);
            Arrays.sort(a2, cdv.a, cdv.b + 1);
            e(a2, n12, cdv.a, cdv.b);
            final int n13 = cdv.c / 2;
            int a3 = cdv.a;
            int n14 = 0;
            int b4;
            while (true) {
                final int b3 = cdv.b;
                if (a3 > b3) {
                    b4 = cdv.a;
                    break;
                }
                n14 += b2[a2[a3]];
                if (n14 >= n13) {
                    b4 = Math.min(b3 - 1, a3);
                    break;
                }
                ++a3;
            }
            final cdv cdv2 = new cdv(cdv.j, b4 + 1, cdv.b);
            cdv.b = b4;
            cdv.b();
            priorityQueue.offer(cdv2);
            priorityQueue.offer(cdv);
        }
        final ArrayList c = new ArrayList<cea>(priorityQueue.size());
        for (final cdv cdv3 : priorityQueue) {
            final cdw j2 = cdv3.j;
            final int[] a4 = j2.a;
            final int[] b5 = j2.b;
            int a5 = cdv3.a;
            int n15 = 0;
            int n16 = 0;
            int n17 = 0;
            i = 0;
            while (a5 <= cdv3.b) {
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
            final cea cea = new cea(a(Math.round(n20 / n21), Math.round(n17 / n21), Math.round(i / n21)), n16);
            if (!this.h(cea.c())) {
                c.add(cea);
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
                    final int n3 = array[i];
                    final int b = b(n3);
                    n = c(n3);
                    array[i] = (d(n3) | (b << 10 | n << 5));
                    ++i;
                }
            }
        }
        else {
            while (j <= n2) {
                final int n4 = array[j];
                n = c(n4);
                i = d(n4);
                array[j] = (b(n4) | (n << 10 | i << 5));
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
        final ceq[] d = this.d;
        if (d != null) {
            final int length = d.length;
            if (length > 0) {
                int i = 0;
                while (i < length) {
                    final ceq ceq = this.d[i];
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
