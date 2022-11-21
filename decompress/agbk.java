import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbk implements agbm
{
    private final int a;
    
    public agbk(final int a) {
        if (a != 16 && a != 32) {
            final StringBuilder sb = new StringBuilder("Unsupported key length: ");
            sb.append(a);
            throw new InvalidAlgorithmParameterException(sb.toString());
        }
        this.a = a;
    }
    
    public final int a() {
        return this.a;
    }
    
    public final byte[] b() {
        final int a = this.a;
        if (a == 16) {
            return agbw.i;
        }
        if (a == 32) {
            return agbw.j;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }
    
    public final byte[] c(final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        final int length = array.length;
        if (length == this.a) {
            return new agal(array, false).a(array2, array3);
        }
        final StringBuilder sb = new StringBuilder("Unexpected key length: ");
        sb.append(length);
        throw new InvalidAlgorithmParameterException(sb.toString());
    }
}
