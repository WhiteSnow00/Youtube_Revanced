import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import android.os.Build$VERSION;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.SecretKey;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afwt
{
    private static final ThreadLocal a;
    private final SecretKey b;
    private final boolean c;
    
    static {
        a = new afws();
    }
    
    public afwt(final byte[] array, final boolean c) {
        if (aesy.ao(2)) {
            agep.a(array.length);
            this.b = new SecretKeySpec(array, "AES");
            this.c = c;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
    
    public final byte[] a(final byte[] array, final byte[] array2) {
        if (array.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        final int length = array2.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        final boolean c = this.c;
        int n;
        if (c) {
            n = length + 28;
        }
        else {
            n = length + 16;
        }
        final byte[] array3 = new byte[n];
        if (c) {
            System.arraycopy(array, 0, array3, 0, 12);
        }
        AlgorithmParameterSpec algorithmParameterSpec;
        if (aety.t() && Build$VERSION.SDK_INT <= 19) {
            algorithmParameterSpec = new IvParameterSpec(array, 0, 12);
        }
        else {
            algorithmParameterSpec = new GCMParameterSpec(128, array, 0, 12);
        }
        final ThreadLocal a = afwt.a;
        ((Cipher)a.get()).init(1, this.b, algorithmParameterSpec);
        int n2;
        if (!this.c) {
            n2 = 0;
        }
        else {
            n2 = 12;
        }
        final int doFinal = a.get().doFinal(array2, 0, length, array3, n2);
        if (doFinal == length + 16) {
            return array3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, doFinal - length));
    }
}
