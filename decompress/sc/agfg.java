import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.Cipher;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfg implements agge
{
    private static final ThreadLocal a;
    private final SecretKeySpec b;
    private final int c;
    private final int d;
    
    static {
        a = (ThreadLocal)new agff();
    }
    
    public agfg(final byte[] array, final int c) {
        if (!aeuz.T(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        aggq.a(array.length);
        this.b = new SecretKeySpec(array, "AES");
        final int blockSize = agfg.a.get().getBlockSize();
        this.d = blockSize;
        if (c >= 12 && c <= blockSize) {
            this.c = c;
            return;
        }
        throw new GeneralSecurityException("invalid IV size");
    }
    
    public final byte[] a(final byte[] array) {
        final int length = array.length;
        final int c = this.c;
        if (length > Integer.MAX_VALUE - c) {
            final int c2 = this.c;
            final StringBuilder sb = new StringBuilder("plaintext length can not exceed ");
            sb.append(Integer.MAX_VALUE - c2);
            throw new GeneralSecurityException(sb.toString());
        }
        final byte[] array2 = new byte[c + length];
        final byte[] a = aggk.a(c);
        System.arraycopy(a, 0, array2, 0, this.c);
        final int c3 = this.c;
        final Cipher cipher = agfg.a.get();
        final byte[] array3 = new byte[this.d];
        System.arraycopy(a, 0, array3, 0, this.c);
        cipher.init(1, this.b, new IvParameterSpec(array3));
        if (cipher.doFinal(array, 0, length, array2, c3) == length) {
            return array2;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
