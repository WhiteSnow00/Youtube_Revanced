import java.nio.IntBuffer;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class afwr
{
    private static final int[] a;
    
    static {
        a = d(new byte[] { 101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107 });
    }
    
    static void a(final int[] array, int e, final int n, final int n2, final int n3) {
        final int n4 = array[e] + array[n];
        array[e] = n4;
        final int e2 = e(n4 ^ array[n3], 16);
        array[n3] = e2;
        final int n5 = array[n2] + e2;
        array[n2] = n5;
        final int e3 = e(array[n] ^ n5, 12);
        array[n] = e3;
        final int n6 = array[e] + e3;
        array[e] = n6;
        e = e(array[n3] ^ n6, 8);
        array[n3] = e;
        e += array[n2];
        array[n2] = e;
        array[n] = e(array[n] ^ e, 7);
    }
    
    static void b(final int[] array, final int[] array2) {
        final int[] a = afwr.a;
        System.arraycopy(a, 0, array, 0, a.length);
        System.arraycopy(array2, 0, array, a.length, 8);
    }
    
    static void c(final int[] array) {
        for (int i = 0; i < 10; ++i) {
            a(array, 0, 4, 8, 12);
            a(array, 1, 5, 9, 13);
            a(array, 2, 6, 10, 14);
            a(array, 3, 7, 11, 15);
            a(array, 0, 5, 10, 15);
            a(array, 1, 6, 11, 12);
            a(array, 2, 7, 8, 13);
            a(array, 3, 4, 9, 14);
        }
    }
    
    static int[] d(final byte[] array) {
        final IntBuffer intBuffer = ByteBuffer.wrap(array).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        final int[] array2 = new int[intBuffer.remaining()];
        intBuffer.get(array2);
        return array2;
    }
    
    private static int e(final int n, final int n2) {
        return n >>> -n2 | n << n2;
    }
}
