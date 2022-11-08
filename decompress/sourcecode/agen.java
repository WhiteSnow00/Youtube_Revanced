import java.math.BigInteger;
import java.util.Arrays;
import java.security.MessageDigest;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPublicKey;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agen implements afvk
{
    private final RSAPublicKey a;
    private final int b;
    private final int c;
    private final int d;
    
    public agen(final RSAPublicKey a, final int c, final int d, final int b) {
        if (aesy.ao(2)) {
            final int a2 = agep.a;
            agep.b(a.getModulus().bitLength());
            agep.c(a.getPublicExponent());
            this.a = a;
            this.c = c;
            this.d = d;
            this.b = b;
            return;
        }
        throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
    }
    
    public final void a(final byte[] array, byte[] digest) {
        final BigInteger publicExponent = this.a.getPublicExponent();
        final BigInteger modulus = this.a.getModulus();
        final int bitLength = modulus.bitLength();
        final int n = (modulus.bitLength() + 6) / 8;
        if ((bitLength + 7) / 8 != array.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        final BigInteger s = aety.s(array);
        if (s.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        final byte[] u = aety.u(s.modPow(publicExponent, modulus), n);
        final int bitLength2 = modulus.bitLength();
        final int a = agep.a;
        final MessageDigest messageDigest = (MessageDigest)agdz.d.a(aety.v(this.c));
        digest = messageDigest.digest(digest);
        int digestLength = messageDigest.getDigestLength();
        final int length = u.length;
        if (length < this.b + digestLength + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (u[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        final int n2 = length - digestLength;
        final int n3 = n2 - 1;
        final byte[] copy = Arrays.copyOf(u, n3);
        final int length2 = copy.length;
        final byte[] copyOfRange = Arrays.copyOfRange(u, length2, length2 + digestLength);
        int n4 = 0;
        while (true) {
            final long n5 = length * 8L - (bitLength2 - 1);
            if (n4 < n5) {
                if ((copy[n4 / 8] >> 7 - n4 % 8 & 0x1) != 0x0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                ++n4;
            }
            else {
                final byte[] x = aety.x(copyOfRange, n3, this.d);
                final int length3 = x.length;
                final byte[] array2 = new byte[length3];
                for (int i = 0; i < length3; ++i) {
                    array2[i] = (byte)(x[i] ^ copy[i]);
                }
                for (int n6 = 0; n6 <= n5; ++n6) {
                    final int n7 = n6 / 8;
                    array2[n7] &= (byte)~(1 << 7 - n6 % 8);
                }
                int n8 = 0;
                while (true) {
                    final int b = this.b;
                    final int n9 = n2 - b - 2;
                    if (n8 < n9) {
                        if (array2[n8] != 0) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        ++n8;
                    }
                    else {
                        if (array2[n9] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        final byte[] copyOfRange2 = Arrays.copyOfRange(array2, length3 - b, length3);
                        digestLength += 8;
                        final byte[] array3 = new byte[this.b + digestLength];
                        System.arraycopy(digest, 0, array3, 8, digest.length);
                        System.arraycopy(copyOfRange2, 0, array3, digestLength, copyOfRange2.length);
                        if (MessageDigest.isEqual(messageDigest.digest(array3), copyOfRange)) {
                            return;
                        }
                        throw new GeneralSecurityException("inconsistent");
                    }
                }
            }
        }
    }
}
