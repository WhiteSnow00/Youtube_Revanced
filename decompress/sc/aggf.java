import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.SecretKey;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aggf implements agbv
{
    private final SecretKey a;
    private final byte[] b;
    private final byte[] c;
    
    public aggf(byte[] l) {
        aggq.a(l.length);
        final SecretKeySpec a = new SecretKeySpec(l, "AES");
        this.a = a;
        final Cipher b = b();
        b.init(1, a);
        l = aeuz.L(b.doFinal(new byte[16]));
        this.b = l;
        this.c = aeuz.L(l);
    }
    
    private static Cipher b() {
        if (aeuz.T(1)) {
            return (Cipher)agga.a.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
    
    public final byte[] a(final byte[] array, final int n) {
        if (n <= 16) {
            final Cipher b = b();
            b.init(1, this.a);
            final int length = array.length;
            final double n2 = length;
            Double.isNaN(n2);
            final int max = Math.max(1, (int)Math.ceil(n2 / 16.0));
            byte[] array2;
            if (max * 16 == length) {
                array2 = aevy.V(array, (max - 1) * 16, this.b, 0, 16);
            }
            else {
                array2 = aevy.U(aeuz.K(Arrays.copyOfRange(array, (max - 1) * 16, length)), this.c);
            }
            byte[] doFinal = new byte[16];
            for (int i = 0; i < max - 1; ++i) {
                doFinal = b.doFinal(aevy.V(doFinal, 0, array, i * 16, 16));
            }
            return Arrays.copyOf(b.doFinal(aevy.U(array2, doFinal)), n);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
