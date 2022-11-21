import java.security.GeneralSecurityException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbl implements agbm
{
    public final int a() {
        return 32;
    }
    
    public final byte[] b() {
        return agbw.k;
    }
    
    public final byte[] c(final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        if (array.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        final agao agao = new agao(array);
        final int length = array3.length;
        if (length <= 2147483631) {
            final ByteBuffer allocate = ByteBuffer.allocate(length + 16);
            agao.b(allocate, array2, array3, array4);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
