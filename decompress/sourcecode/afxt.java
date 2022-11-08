import java.security.GeneralSecurityException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afxt implements afxu
{
    @Override
    public final int a() {
        return 32;
    }
    
    @Override
    public final byte[] b() {
        return afye.k;
    }
    
    @Override
    public final byte[] c(final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        if (array.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        final afww afww = new afww(array);
        final int length = array3.length;
        if (length <= 2147483631) {
            final ByteBuffer allocate = ByteBuffer.allocate(length + 16);
            afww.b(allocate, array2, array3, array4);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
