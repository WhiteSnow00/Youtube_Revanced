import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agec
{
    private static final int[] a;
    private static final int[] b;
    private static final int[] c;
    private static final int[] d;
    
    static {
        a = new int[] { 0, 3, 6, 9, 12, 16, 19, 22, 25, 28 };
        b = new int[] { 0, 2, 3, 5, 6, 0, 1, 3, 4, 6 };
        c = new int[] { 67108863, 33554431 };
        d = new int[] { 26, 25 };
    }
    
    public static void a(final long[] array, final long[] array2) {
        final long[] array3 = new long[10];
        final long[] array4 = new long[10];
        final long[] array5 = new long[10];
        final long[] array6 = new long[10];
        final long[] array7 = new long[10];
        final long[] array8 = new long[10];
        final long[] array9 = new long[10];
        final long[] array10 = new long[10];
        final long[] array11 = new long[10];
        final long[] array12 = new long[10];
        h(array3, array2);
        h(array12, array3);
        h(array11, array12);
        b(array4, array11, array2);
        b(array5, array4, array3);
        h(array11, array5);
        b(array6, array11, array4);
        h(array11, array6);
        h(array12, array11);
        h(array11, array12);
        h(array12, array11);
        h(array11, array12);
        b(array7, array11, array6);
        h(array11, array7);
        h(array12, array11);
        final int n = 2;
        for (int i = 2; i < 10; i += 2) {
            h(array11, array12);
            h(array12, array11);
        }
        b(array8, array12, array7);
        h(array11, array8);
        h(array12, array11);
        for (int j = 2; j < 20; j += 2) {
            h(array11, array12);
            h(array12, array11);
        }
        b(array11, array12, array8);
        h(array12, array11);
        h(array11, array12);
        for (int k = 2; k < 10; k += 2) {
            h(array12, array11);
            h(array11, array12);
        }
        b(array9, array11, array7);
        h(array11, array9);
        h(array12, array11);
        for (int l = 2; l < 50; l += 2) {
            h(array11, array12);
            h(array12, array11);
        }
        b(array10, array12, array9);
        h(array12, array10);
        h(array11, array12);
        for (int n2 = 2; n2 < 100; n2 += 2) {
            h(array12, array11);
            h(array11, array12);
        }
        b(array12, array11, array10);
        h(array11, array12);
        h(array12, array11);
        for (int n3 = n; n3 < 50; n3 += 2) {
            h(array11, array12);
            h(array12, array11);
        }
        b(array11, array12, array9);
        h(array12, array11);
        h(array11, array12);
        h(array12, array11);
        h(array11, array12);
        h(array12, array11);
        b(array, array12, array5);
    }
    
    public static void b(final long[] array, final long[] array2, final long[] array3) {
        final long[] array4 = new long[19];
        c(array4, array2, array3);
        d(array4, array);
    }
    
    public static void c(final long[] array, final long[] array2, final long[] array3) {
        array[0] = array2[0] * array3[0];
        final long n = array2[0];
        final long n2 = array3[1];
        final long n3 = array2[1];
        final long n4 = array3[0];
        array[1] = n2 * n + n3 * n4;
        final long n5 = array2[1];
        final long n6 = array3[1];
        array[2] = (n5 + n5) * n6 + array3[2] * n + array2[2] * n4;
        final long n7 = array3[2];
        final long n8 = array2[2];
        array[3] = n5 * n7 + n8 * n6 + array3[3] * n + array2[3] * n4;
        final long n9 = array3[3];
        final long n10 = array2[3];
        final long n11 = n5 * n9 + n10 * n6;
        array[4] = n8 * n7 + (n11 + n11) + array3[4] * n + array2[4] * n4;
        final long n12 = array3[4];
        final long n13 = array2[4];
        array[5] = n8 * n9 + n10 * n7 + n5 * n12 + n13 * n6 + array3[5] * n + array2[5] * n4;
        final long n14 = array3[5];
        final long n15 = array2[5];
        final long n16 = n10 * n9 + n5 * n14 + n15 * n6;
        array[6] = n16 + n16 + n8 * n12 + n13 * n7 + array3[6] * n + array2[6] * n4;
        final long n17 = array3[6];
        final long n18 = array2[6];
        array[7] = n10 * n12 + n13 * n9 + n8 * n14 + n15 * n7 + n5 * n17 + n18 * n6 + array3[7] * n + array2[7] * n4;
        final long n19 = array3[7];
        final long n20 = array2[7];
        final long n21 = n10 * n14 + n15 * n9 + n5 * n19 + n20 * n6;
        array[8] = n13 * n12 + (n21 + n21) + n8 * n17 + n18 * n7 + array3[8] * n + array2[8] * n4;
        final long n22 = array3[8];
        final long n23 = array2[8];
        array[9] = n13 * n14 + n15 * n12 + n10 * n17 + n18 * n9 + n8 * n19 + n20 * n7 + n5 * n22 + n23 * n6 + n * array3[9] + array2[9] * n4;
        final long n24 = array3[9];
        final long n25 = array2[9];
        final long n26 = n15 * n14 + n10 * n19 + n20 * n9 + n5 * n24 + n6 * n25;
        array[10] = n26 + n26 + n13 * n17 + n18 * n12 + n8 * n22 + n23 * n7;
        array[11] = n15 * n17 + n18 * n14 + n13 * n19 + n20 * n12 + n10 * n22 + n23 * n9 + n8 * n24 + n7 * n25;
        final long n27 = n15 * n19 + n20 * n14 + n10 * n24 + n9 * n25;
        array[12] = n18 * n17 + (n27 + n27) + n13 * n22 + n23 * n12;
        array[13] = n18 * n19 + n20 * n17 + n15 * n22 + n23 * n14 + n13 * n24 + n12 * n25;
        final long n28 = n20 * n19 + n15 * n24 + n14 * n25;
        array[14] = n28 + n28 + n18 * n22 + n23 * n17;
        array[15] = n20 * n22 + n23 * n19 + n18 * n24 + n17 * n25;
        final long n29 = n20 * n24 + n19 * n25;
        array[16] = n23 * n22 + (n29 + n29);
        array[17] = n23 * n24 + n22 * n25;
        array[18] = (n25 + n25) * n24;
    }
    
    static void d(final long[] array, final long[] array2) {
        final int length = array.length;
        long[] array3 = array;
        if (length != 19) {
            array3 = new long[19];
            System.arraycopy(array, 0, array3, 0, length);
        }
        f(array3);
        e(array3);
        System.arraycopy(array3, 0, array2, 0, 10);
    }
    
    public static void e(final long[] array) {
        array[10] = 0L;
        long n5;
        for (int i = 0; i < 10; i += 2, array[i] += n5) {
            final long n = array[i];
            final long n2 = n / 67108864L;
            array[i] = n - (n2 << 26);
            final int n3 = i + 1;
            final long n4 = array[n3] + n2;
            array[n3] = n4;
            n5 = n4 / 33554432L;
            array[n3] = n4 - (n5 << 25);
        }
        final long n6 = array[0];
        final long n7 = array[10];
        final long n8 = n6 + (n7 << 4);
        array[0] = n8;
        final long n9 = n8 + (n7 + n7);
        array[0] = n9;
        final long n10 = n9 + n7;
        array[0] = n10;
        array[10] = 0L;
        final long n11 = n10 / 67108864L;
        array[0] = n10 - (n11 << 26);
        array[1] += n11;
    }
    
    public static void f(final long[] array) {
        final long n = array[8];
        final long n2 = array[18];
        final long n3 = n + (n2 << 4);
        array[8] = n3;
        array[8] = (array[8] = n3 + (n2 + n2)) + n2;
        final long n4 = array[7];
        final long n5 = array[17];
        final long n6 = n4 + (n5 << 4);
        array[7] = n6;
        array[7] = (array[7] = n6 + (n5 + n5)) + n5;
        final long n7 = array[6];
        final long n8 = array[16];
        final long n9 = n7 + (n8 << 4);
        array[6] = n9;
        array[6] = (array[6] = n9 + (n8 + n8)) + n8;
        final long n10 = array[5];
        final long n11 = array[15];
        final long n12 = n10 + (n11 << 4);
        array[5] = n12;
        array[5] = (array[5] = n12 + (n11 + n11)) + n11;
        final long n13 = array[4];
        final long n14 = array[14];
        final long n15 = n13 + (n14 << 4);
        array[4] = n15;
        array[4] = (array[4] = n15 + (n14 + n14)) + n14;
        final long n16 = array[3];
        final long n17 = array[13];
        final long n18 = n16 + (n17 << 4);
        array[3] = n18;
        array[3] = (array[3] = n18 + (n17 + n17)) + n17;
        final long n19 = array[2];
        final long n20 = array[12];
        final long n21 = n19 + (n20 << 4);
        array[2] = n21;
        array[2] = (array[2] = n21 + (n20 + n20)) + n20;
        final long n22 = array[1];
        final long n23 = array[11];
        final long n24 = n22 + (n23 << 4);
        array[1] = n24;
        array[1] = (array[1] = n24 + (n23 + n23)) + n23;
        final long n25 = array[0];
        final long n26 = array[10];
        final long n27 = n25 + (n26 << 4);
        array[0] = n27;
        array[0] = (array[0] = n27 + (n26 + n26)) + n26;
    }
    
    public static void g(final long[] array, final long[] array2, final long n) {
        for (int i = 0; i < 10; ++i) {
            array[i] = array2[i] * n;
        }
    }
    
    public static void h(final long[] array, final long[] array2) {
        final long n = array2[0];
        final long n2 = array2[0];
        final long n3 = array2[1];
        final long n4 = array2[1];
        final long n5 = n4 * n4 + array2[2] * n2;
        final long n6 = array2[2];
        final long n7 = n4 * n6 + array2[3] * n2;
        final long n8 = array2[3];
        final long n9 = array2[4];
        final long n10 = array2[4];
        final long n11 = n6 * n8 + n4 * n10 + array2[5] * n2;
        final long n12 = array2[6];
        final long n13 = array2[5];
        final long n14 = n8 * n8 + n6 * n10 + n12 * n2 + (n4 + n4) * n13;
        final long n15 = array2[6];
        final long n16 = n8 * n10 + n6 * n13 + n4 * n15 + array2[7] * n2;
        final long n17 = array2[8];
        final long n18 = array2[7];
        final long n19 = n4 * n18 + n8 * n13;
        final long n20 = n6 * n15 + n17 * n2 + (n19 + n19);
        final long n21 = array2[8];
        final long n22 = n10 * n13 + n8 * n15 + n6 * n18 + n4 * n21 + n2 * array2[9];
        final long n23 = array2[9];
        final long n24 = n8 * n18 + n4 * n23;
        final long n25 = n13 * n13 + n10 * n15 + n6 * n21 + (n24 + n24);
        final long n26 = n13 * n15 + n10 * n18 + n8 * n21 + n6 * n23;
        final long n27 = n13 * n18 + n8 * n23;
        final long n28 = n10 * n21 + (n27 + n27);
        final long n29 = n15 * n18 + n13 * n21 + n10 * n23;
        final long n30 = n18 * n18 + n15 * n21 + (n13 + n13) * n23;
        final long n31 = n18 * n21 + n15 * n23;
        d(new long[] { n * n, (n2 + n2) * n3, n5 + n5, n7 + n7, n6 * n6 + n4 * 4L * n8 + (n2 + n2) * n9, n11 + n11, n14 + n14, n16 + n16, n10 * n10 + (n20 + n20), n22 + n22, n25 + n25, n26 + n26, n15 * n15 + (n28 + n28), n29 + n29, n30 + n30, n31 + n31, n21 * n21 + n18 * 4L * n23, (n21 + n21) * n23, (n23 + n23) * n23 }, array);
    }
    
    public static void i(final long[] array, final long[] array2, final long[] array3) {
        for (int i = 0; i < 10; ++i) {
            array[i] = array2[i] - array3[i];
        }
    }
    
    public static void j(final long[] array, final long[] array2, final long[] array3) {
        for (int i = 0; i < 10; ++i) {
            array[i] = array2[i] + array3[i];
        }
    }
    
    public static byte[] k(final long[] array) {
        final long[] copy = Arrays.copyOf(array, 10);
        final int n = 0;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = 2;
            if (n2 >= 2) {
                break;
            }
            int n6;
            for (int i = 0; i < 9; ++i, copy[i] -= n6) {
                final long n4 = copy[i];
                final int n5 = agec.d[i & 0x1];
                n6 = -(int)((n4 >> 31 & n4) >> n5);
                copy[i] = n4 + (n6 << n5);
            }
            final long n7 = copy[9];
            final int n8 = -(int)((n7 >> 31 & n7) >> 25);
            copy[9] = n7 + (n8 << 25);
            copy[0] -= n8 * 19;
            ++n2;
        }
        final long n9 = copy[0];
        final int n10 = -(int)((n9 >> 31 & n9) >> 26);
        copy[0] = n9 + (n10 << 26);
        copy[1] -= n10;
        for (int j = 0; j < 2; ++j) {
            long n11;
            int n13;
            for (int k = 0; k < 9; ++k, copy[k] += (int)(n11 >> n13)) {
                n11 = copy[k];
                final int n12 = k & 0x1;
                n13 = agec.d[n12];
                copy[k] = ((long)agec.c[n12] & n11);
            }
        }
        final long n14 = copy[9];
        copy[9] = (0x1FFFFFFL & n14);
        final long n15 = copy[0] + (int)(n14 >> 25) * 19;
        copy[0] = n15;
        int n16 = ~((int)n15 - 67108845 >> 31);
        for (int l = 1; l < 10; ++l) {
            final int n17 = ~((int)copy[l] ^ agec.c[l & 0x1]);
            final int n18 = n17 & n17 << 16;
            final int n19 = n18 & n18 << 8;
            final int n20 = n19 & n19 << 4;
            final int n21 = n20 & n20 << 2;
            n16 &= (n21 & n21 + n21) >> 31;
        }
        copy[0] -= (0x3FFFFED & n16);
        final long n22 = 0x1FFFFFF & n16;
        copy[1] -= n22;
        for (int n23 = n3; n23 < 10; n23 += 2) {
            copy[n23] -= (0x3FFFFFF & n16);
            final int n24 = n23 + 1;
            copy[n24] -= n22;
        }
        for (int n25 = 0; n25 < 10; ++n25) {
            copy[n25] <<= agec.b[n25];
        }
        final byte[] array2 = new byte[32];
        for (int n26 = n; n26 < 10; ++n26) {
            int n27 = agec.a[n26];
            final byte b = array2[n27];
            final long n28 = copy[n26];
            array2[n27] = (byte)((long)b | (n28 & 0xFFL));
            final int n29 = n27 + 1;
            array2[n29] = (byte)((long)array2[n29] | (n28 >> 8 & 0xFFL));
            final int n30 = n27 + 2;
            array2[n30] = (byte)((long)array2[n30] | (n28 >> 16 & 0xFFL));
            n27 += 3;
            array2[n27] = (byte)((n28 >> 24 & 0xFFL) | (long)array2[n27]);
        }
        return array2;
    }
    
    public static long[] l(final byte[] array) {
        final long[] array2 = new long[10];
        for (int i = 0; i < 10; ++i) {
            final int n = agec.a[i];
            array2[i] = (((long)(array[n] & 0xFF) | (long)(array[n + 1] & 0xFF) << 8 | (long)(array[n + 2] & 0xFF) << 16 | (long)(array[n + 3] & 0xFF) << 24) >> agec.b[i] & (long)agec.c[i & 0x1]);
        }
        return array2;
    }
}
