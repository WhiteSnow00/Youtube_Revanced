import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import java.security.GeneralSecurityException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.SecretKey;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agat implements afyf
{
    private static final ThreadLocal a;
    private final SecretKey b;
    
    static {
        a = (ThreadLocal)new agas();
    }
    
    public agat(final byte[] array) {
        agii.a(array.length);
        this.b = new SecretKeySpec(array, "AES");
    }
    
    @Override
    public final byte[] a(final byte[] array, final byte[] array2) {
        final int length = array.length;
        if (length <= 2147483619) {
            final byte[] array3 = new byte[length + 28];
            final byte[] a = agic.a(12);
            System.arraycopy(a, 0, array3, 0, 12);
            final int length2 = a.length;
            AlgorithmParameterSpec algorithmParameterSpec;
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                algorithmParameterSpec = new GCMParameterSpec(128, a, 0, length2);
            }
            catch (final ClassNotFoundException ex) {
                if (!aexq.n()) {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
                algorithmParameterSpec = new IvParameterSpec(a, 0, length2);
            }
            final ThreadLocal a2 = agat.a;
            ((Cipher)a2.get()).init(1, this.b, algorithmParameterSpec);
            final Cipher cipher = a2.get();
            final int length3 = array.length;
            final int doFinal = cipher.doFinal(array, 0, length3, array3, 12);
            if (doFinal == length3 + 16) {
                return array3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, doFinal - length3));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
