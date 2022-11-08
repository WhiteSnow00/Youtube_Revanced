import android.util.Log;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lwe
{
    public static final byte[] a;
    public static final float[] b;
    private static final Object c;
    private static int[] d;
    
    static {
        a = new byte[] { 0, 0, 0, 1 };
        b = new float[] { 1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f };
        c = new Object();
        lwe.d = new int[10];
    }
    
    public static int a(final byte[] array, int i, final int n, final boolean[] array2) {
        final int n2 = n - i;
        final boolean b = false;
        jfi.U(n2 >= 0);
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
        final Object c = lwe.c;
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
                    final int[] d = lwe.d;
                    final int length = d.length;
                    if (length <= n2) {
                        lwe.d = Arrays.copyOf(d, length + length);
                    }
                    lwe.d[n2] = n3;
                    i = n3 + 3;
                    ++n2;
                    continue Label_0129_Outer;
                    int n6 = 0;
                    int n9;
                    while (true) {
                        int n4 = 0;
                        iftrue(Label_0198:)(n4 >= n2);
                        Block_9: {
                            break Block_9;
                            monitorexit(c);
                            throw;
                        }
                        final int n5 = lwe.d[n4] - n;
                        System.arraycopy(array, n, array, n6, n5);
                        final int n7 = n6 + n5;
                        final int n8 = n7 + 1;
                        array[n7] = 0;
                        n6 = n8 + 1;
                        array[n8] = 0;
                        n += n5 + 3;
                        ++n4;
                        continue;
                        n9 = n - n2;
                        n4 = 0;
                        n = 0;
                        n6 = 0;
                        continue;
                    }
                    Label_0198: {
                        System.arraycopy(array, n, array, n6, n9 - n6);
                    }
                    monitorexit(c);
                    return n9;
                }
            }
        }
    }
    
    public static lwd c(final lwf lwf) {
        final int a = lwf.a(8);
        lwf.e(16);
        final int b = lwf.b();
        final int n = 0;
        final int n2 = 1;
        final int n3 = 1;
        int n4;
        if (a != 100 && a != 110 && a != 122 && a != 244 && a != 44 && a != 83 && a != 86 && a != 118 && a != 128 && a != 138) {
            n4 = 1;
        }
        else {
            final int b2 = lwf.b();
            int n5;
            if (b2 == 3) {
                lwf.f();
                n5 = 3;
            }
            else {
                n5 = b2;
            }
            lwf.b();
            lwf.b();
            lwf.e(1);
            n4 = b2;
            if (lwf.f()) {
                int n6;
                if (n5 != 3) {
                    n6 = 8;
                }
                else {
                    n6 = 12;
                }
                int n7 = 0;
                while (true) {
                    n4 = b2;
                    if (n7 >= n6) {
                        break;
                    }
                    if (lwf.f()) {
                        int n8;
                        if (n7 < 6) {
                            n8 = 16;
                        }
                        else {
                            n8 = 64;
                        }
                        int i = 0;
                        int n9 = 8;
                        int n10 = 8;
                        while (i < n8) {
                            int n11;
                            if ((n11 = n9) != 0) {
                                n11 = (lwf.c() + n10 + 256) % 256;
                            }
                            if (n11 != 0) {
                                n10 = n11;
                            }
                            ++i;
                            n9 = n11;
                        }
                    }
                    ++n7;
                }
            }
        }
        lwf.b();
        final int b3 = lwf.b();
        if (b3 == 0) {
            lwf.b();
        }
        else if (b3 == 1) {
            lwf.f();
            lwf.c();
            lwf.c();
            final long n12 = lwf.b();
            for (int n13 = n; n13 < n12; ++n13) {
                lwf.b();
            }
        }
        lwf.b();
        lwf.e(1);
        final int b4 = lwf.b();
        final int b5 = lwf.b();
        final int f = lwf.f() ? 1 : 0;
        final int n14 = 2 - f;
        if (f == 0) {
            lwf.e(1);
        }
        lwf.e(1);
        final int n15 = (b4 + 1) * 16;
        final int n16 = (b5 + 1) * n14 * 16;
        int n17 = n15;
        int n18 = n16;
        if (lwf.f()) {
            final int b6 = lwf.b();
            final int b7 = lwf.b();
            final int b8 = lwf.b();
            final int b9 = lwf.b();
            int n19;
            int n20;
            if (n4 == 0) {
                n19 = n2;
                n20 = n14;
            }
            else {
                int n21;
                if (n4 == 3) {
                    n21 = 1;
                }
                else {
                    n21 = 2;
                }
                int n22 = n3;
                if (n4 == 1) {
                    n22 = 2;
                }
                final int n23 = n14 * n22;
                n19 = n21;
                n20 = n23;
            }
            n17 = n15 - (b6 + b7) * n19;
            n18 = n16 - (b8 + b9) * n20;
        }
        final boolean f2 = lwf.f();
        float n25;
        final float n24 = n25 = 1.0f;
        if (f2) {
            n25 = n24;
            if (lwf.f()) {
                final int a2 = lwf.a(8);
                if (a2 == 255) {
                    final int a3 = lwf.a(16);
                    final int a4 = lwf.a(16);
                    n25 = n24;
                    if (a3 != 0) {
                        n25 = n24;
                        if (a4 != 0) {
                            n25 = a3 / (float)a4;
                        }
                    }
                }
                else if (a2 < 17) {
                    n25 = lwe.b[a2];
                }
                else {
                    final StringBuilder sb = new StringBuilder("Unexpected aspect_ratio_idc value: ");
                    sb.append(a2);
                    Log.w("NalUnitUtil", sb.toString());
                    n25 = n24;
                }
            }
        }
        return new lwd(b, n17, n18, n25);
    }
    
    public static void d(final boolean[] array) {
        array[0] = false;
        array[2] = (array[1] = false);
    }
    
    public static byte[] e(final lwg lwg) {
        final int k = lwg.k();
        final int a = lwg.a;
        lwg.y(k);
        final Object c = lwg.c;
        final byte[] a2 = lvy.a;
        final byte[] array = new byte[k + 4];
        System.arraycopy(lvy.a, 0, array, 0, 4);
        System.arraycopy(c, a, array, 4, k);
        return array;
    }
    
    public static atvw f(final lwf lwf) {
        final int b = lwf.b();
        lwf.b();
        lwf.e(1);
        lwf.f();
        return new atvw(b, (byte[])null, (byte[])null);
    }
}
