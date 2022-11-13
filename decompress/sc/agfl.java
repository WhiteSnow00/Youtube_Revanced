import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import java.security.InvalidKeyException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfl implements afwr
{
    private static final Collection a;
    private static final byte[] b;
    private final aggf c;
    private final byte[] d;
    
    static {
        a = Arrays.asList(64);
        b = new byte[16];
    }
    
    public agfl(final byte[] array) {
        if (!aeuz.T(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        final Collection a = agfl.a;
        final int length = array.length;
        if (a.contains(length)) {
            final int n = length >> 1;
            final byte[] copyOfRange = Arrays.copyOfRange(array, 0, n);
            this.d = Arrays.copyOfRange(array, n, length);
            this.c = new aggf(copyOfRange);
            return;
        }
        final StringBuilder sb = new StringBuilder("invalid key size: ");
        sb.append(length);
        sb.append(" bytes; key must have 64 bytes");
        throw new InvalidKeyException(sb.toString());
    }
    
    public final byte[] a(final byte[] array, byte[] array2) {
        if (array.length <= 2147483631) {
            final Cipher cipher = (Cipher)agga.a.a("AES/CTR/NoPadding");
            final byte[][] array3 = { array2, array };
            array2 = this.c.a(agfl.b, 16);
            for (int i = 0; i <= 0; ++i) {
                byte[] array4;
                if ((array4 = array3[i]) == null) {
                    array4 = new byte[0];
                }
                array2 = aevy.U(aeuz.L(array2), this.c.a(array4, 16));
            }
            final byte[] array5 = array3[1];
            final int length = array5.length;
            byte[] u;
            if (length >= 16) {
                final int length2 = array2.length;
                if (length < length2) {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
                final byte[] copy = Arrays.copyOf(array5, length);
                int n = 0;
                while (true) {
                    u = copy;
                    if (n >= array2.length) {
                        break;
                    }
                    final int n2 = length - length2 + n;
                    copy[n2] ^= array2[n];
                    ++n;
                }
            }
            else {
                u = aevy.U(aeuz.K(array5), aeuz.L(array2));
            }
            array2 = this.c.a(u, 16);
            final byte[] array6 = array2.clone();
            array6[8] &= 0x7F;
            array6[12] &= 0x7F;
            cipher.init(1, new SecretKeySpec(this.d, "AES"), new IvParameterSpec(array6));
            return aevy.T(new byte[][] { array2, cipher.doFinal(array) });
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
