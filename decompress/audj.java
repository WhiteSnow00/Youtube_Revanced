import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class audj
{
    static int a(final int[] array, int i, final int n, final int[] array2, int n2) {
        final int n3 = array[i];
        final int[] array3 = new int[n2];
        final int[] array4 = new int[16];
        final int[] array5 = new int[16];
        final int n4 = 0;
        int n5;
        for (i = 0; i < n2; ++i) {
            n5 = array2[i];
            ++array4[n5];
        }
        array5[1] = 0;
        int n6;
        for (i = 1; i < 15; i = n6) {
            n6 = i + 1;
            array5[n6] = array5[i] + array4[i];
        }
        int n7;
        for (i = 0; i < n2; ++i) {
            n7 = array2[i];
            if (n7 != 0) {
                array3[array5[n7]++] = i;
            }
        }
        final int n8 = 1 << n;
        if (array5[15] == 1) {
            for (i = 0; i < n8; ++i) {
                array[n3 + i] = array3[0];
            }
            return n8;
        }
        n2 = 0;
        int j = 1;
        int n9 = 2;
        i = n4;
        while (j <= n) {
            while (array4[j] > 0) {
                g(array, n3 + i, n9, n8, array3[n2] | j << 16);
                i = f(i, j);
                --array4[j];
                ++n2;
            }
            ++j;
            n9 += n9;
        }
        int n10 = n8;
        int n11 = n3;
        final int n12 = n + 1;
        final int n13 = -1;
        int n14 = n2;
        int f = i;
        int n15 = 2;
        n2 = n13;
        i = n12;
        int n16 = n8;
        int n17;
        while (true) {
            n17 = n16;
            if (i > 15) {
                break;
            }
            int n18 = n2;
            n2 = n17;
            while (array4[i] > 0) {
                final int n19 = f & n8 - 1;
                if (n19 != n18) {
                    final int n20 = n11 + n10;
                    int n21 = 1 << i - n;
                    int k;
                    int n22;
                    for (k = i; k < 15; ++k, n21 = n22 + n22) {
                        n22 = n21 - array4[k];
                        if (n22 <= 0) {
                            break;
                        }
                    }
                    final int n23 = k - n;
                    n10 = 1 << n23;
                    n2 += n10;
                    array[n3 + n19] = (n23 + n << 16 | n20 - n3 - n19);
                    n18 = n19;
                    n11 = n20;
                }
                g(array, n11 + (f >> n), n15, n10, i - n << 16 | array3[n14]);
                f = f(f, i);
                --array4[i];
                ++n14;
            }
            ++i;
            n15 += n15;
            final int n24 = n18;
            n16 = n2;
            n2 = n24;
        }
        return n17;
    }
    
    public static long b(final String s) {
        final long n = -1L;
        if (s == null) {
            return -1L;
        }
        try {
            return Long.parseLong(s);
        }
        catch (final NumberFormatException ex) {
            return n;
        }
    }
    
    public static final atov c(final atqh atqh, final Object o, final atov atov) {
        Object create;
        if (atqh instanceof atpf) {
            create = ((atpf)atqh).create(o, atov);
        }
        else {
            final atpa context = atov.getContext();
            if (context == atpb.a) {
                create = new atpd(atov, atqh, o);
            }
            else {
                create = new atpe(atov, context, atqh, o);
            }
        }
        return (atov)create;
    }
    
    public static final atov d(atov intercepted) {
        intercepted.getClass();
        atph atph;
        if (intercepted instanceof atph) {
            atph = (atph)intercepted;
        }
        else {
            atph = null;
        }
        if (atph != null) {
            intercepted = atph.intercepted();
        }
        return intercepted;
    }
    
    public static boolean e(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
    
    private static int f(final int n, int n2) {
        for (n2 = 1 << n2 - 1; (n & n2) != 0x0; n2 >>= 1) {}
        return (n & n2 - 1) + n2;
    }
    
    private static void g(final int[] array, final int n, final int n2, int n3, final int n4) {
        int n5;
        do {
            n5 = n3 - n2;
            array[n + n5] = n4;
        } while ((n3 = n5) > 0);
    }
}
