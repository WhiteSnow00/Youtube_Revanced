import java.util.concurrent.atomic.AtomicReference;
import java.io.Closeable;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atzz
{
    public static int a(final Context context, final String s, int checkPermission, final int n) {
        try {
            checkPermission = context.checkPermission(s, checkPermission, n);
            return checkPermission;
        }
        catch (final RuntimeException ex) {
            return -1;
        }
    }
    
    public static int b(final int[] array, int i, final int n, final int[] array2, int e) {
        final int n2 = array[i];
        final int[] array3 = new int[e];
        final int[] array4 = new int[16];
        final int[] array5 = new int[16];
        final int n3 = 0;
        int n4;
        for (i = 0; i < e; ++i) {
            n4 = array2[i];
            ++array4[n4];
        }
        array5[1] = 0;
        int n5;
        for (i = 1; i < 15; i = n5) {
            n5 = i + 1;
            array5[n5] = array5[i] + array4[i];
        }
        int n6;
        for (i = 0; i < e; ++i) {
            n6 = array2[i];
            if (n6 != 0) {
                array3[array5[n6]++] = i;
            }
        }
        final int n7 = 1 << n;
        if (array5[15] == 1) {
            for (i = 0; i < n7; ++i) {
                array[n2 + i] = array3[0];
            }
            return n7;
        }
        e = 0;
        int j = 1;
        int n8 = 2;
        i = n3;
        while (j <= n) {
            while (array4[j] > 0) {
                f(array, n2 + e, n8, n7, j << 16 | array3[i]);
                e = e(e, j);
                --array4[j];
                ++i;
            }
            ++j;
            n8 += n8;
        }
        int n9 = n2;
        int e2 = e;
        final int n10 = n + 1;
        int n11 = 2;
        e = -1;
        int n12 = i;
        int n13 = n7;
        i = n10;
        int n14 = n7;
        int n15;
        while (true) {
            n15 = n14;
            if (i > 15) {
                break;
            }
            int n16 = e;
            e = n15;
            while (array4[i] > 0) {
                final int n17 = e2 & n7 - 1;
                int n18 = e;
                int n19 = n13;
                int n20 = n16;
                int n21 = n9;
                if (n17 != n16) {
                    n21 = n9 + n13;
                    int n22 = 1 << i - n;
                    int k;
                    int n23;
                    for (k = i; k < 15; ++k, n22 = n23 + n23) {
                        n23 = n22 - array4[k];
                        if (n23 <= 0) {
                            break;
                        }
                    }
                    final int n24 = k - n;
                    n19 = 1 << n24;
                    n18 = e + n19;
                    array[n2 + n17] = (n24 + n << 16 | n21 - n2 - n17);
                    n20 = n17;
                }
                f(array, n21 + (e2 >> n), n11, n19, i - n << 16 | array3[n12]);
                e2 = e(e2, i);
                --array4[i];
                ++n12;
                e = n18;
                n13 = n19;
                n16 = n20;
                n9 = n21;
            }
            ++i;
            n11 += n11;
            final int n25 = n16;
            n14 = e;
            e = n25;
        }
        return n15;
    }
    
    public static final void c(final Closeable closeable, final Throwable t) {
        if (closeable != null) {
            if (t == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            }
            finally {
                final Throwable t2;
                aume.l(t, t2);
            }
        }
    }
    
    private static int e(final int n, int n2) {
        for (n2 = 1 << n2 - 1; (n & n2) != 0x0; n2 >>= 1) {}
        return (n & n2 - 1) + n2;
    }
    
    private static void f(final int[] array, final int n, final int n2, int n3, final int n4) {
        int n5;
        do {
            n5 = n3 - n2;
            array[n + n5] = n4;
        } while ((n3 = n5) > 0);
    }
}
