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

public final class agee implements afzu
{
    private final SecretKey a;
    private final byte[] b;
    private final byte[] c;
    
    public agee(byte[] ag) {
        agep.a(ag.length);
        final SecretKeySpec a = new SecretKeySpec(ag, "AES");
        this.a = a;
        final Cipher b = b();
        b.init(1, a);
        ag = aesy.ag(b.doFinal(new byte[16]));
        this.b = ag;
        this.c = aesy.ag(ag);
    }
    
    private static Cipher b() {
        if (aesy.ao(1)) {
            return (Cipher)agdz.a.a("AES/ECB/NoPadding");
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
                array2 = aety.U(array, (max - 1) * 16, this.b, 0, 16);
            }
            else {
                array2 = aety.T(aesy.af(Arrays.copyOfRange(array, (max - 1) * 16, length)), this.c);
            }
            byte[] doFinal = new byte[16];
            for (int i = 0; i < max - 1; ++i) {
                doFinal = b.doFinal(aety.U(doFinal, 0, array, i * 16, 16));
            }
            return Arrays.copyOf(b.doFinal(aety.T(array2, doFinal)), n);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
