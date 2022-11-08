import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afwy extends afwv
{
    public afwy(final byte[] array, final int n) {
        super(array, n);
    }
    
    @Override
    public final int a() {
        return 24;
    }
    
    @Override
    public final int[] b(final int[] array, final int n) {
        final int length = array.length;
        if (length == 6) {
            final int[] array2 = new int[16];
            final int[] a = this.a;
            final int[] array3 = new int[16];
            afwr.b(array3, a);
            array3[12] = array[0];
            array3[13] = array[1];
            array3[14] = array[2];
            array3[15] = array[3];
            afwr.c(array3);
            array3[4] = array3[12];
            array3[5] = array3[13];
            array3[6] = array3[14];
            array3[7] = array3[15];
            afwr.b(array2, Arrays.copyOf(array3, 8));
            array2[12] = n;
            array2[13] = 0;
            array2[14] = array[4];
            array2[15] = array[5];
            return array2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", length * 32));
    }
}
