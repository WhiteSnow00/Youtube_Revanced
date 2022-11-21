// 
// Decompiled by Procyon v0.6.0
// 

public final class agam extends agan
{
    public agam(final byte[] array, final int n) {
        super(array, n);
    }
    
    @Override
    public final int a() {
        return 12;
    }
    
    @Override
    public final int[] b(final int[] array, final int n) {
        final int length = array.length;
        if (length == 3) {
            final int[] array2 = new int[16];
            agaj.b(array2, this.a);
            array2[12] = n;
            System.arraycopy(array, 0, array2, 13, 3);
            return array2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", length * 32));
    }
}
