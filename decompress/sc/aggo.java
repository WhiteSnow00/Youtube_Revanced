import java.math.BigInteger;
import java.util.Arrays;
import java.security.MessageDigest;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPublicKey;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aggo implements afxl
{
    private final RSAPublicKey a;
    private final int b;
    private final int c;
    private final int d;
    
    public aggo(final RSAPublicKey a, final int c, final int d, final int b) {
        if (aeuz.T(2)) {
            final int a2 = aggq.a;
            aggq.b(a.getModulus().bitLength());
            aggq.c(a.getPublicExponent());
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
        final int bitLength2 = modulus.bitLength();
        if ((bitLength + 7) / 8 != array.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        final BigInteger t = aevy.t(array);
        if (t.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        final byte[] v = aevy.v(t.modPow(publicExponent, modulus), (bitLength2 + 6) / 8);
        final int n = modulus.bitLength() - 1;
        final int a = aggq.a;
        final MessageDigest messageDigest = (MessageDigest)agga.d.a(aevy.w(this.c));
        digest = messageDigest.digest(digest);
        int digestLength = messageDigest.getDigestLength();
        final int length = v.length;
        if (length < this.b + digestLength + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (v[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        final int n2 = length - digestLength;
        final int n3 = n2 - 1;
        final byte[] copy = Arrays.copyOf(v, n3);
        final int length2 = copy.length;
        final byte[] copyOfRange = Arrays.copyOfRange(v, length2, length2 + digestLength);
        int n4 = 0;
        while (true) {
            final long n5 = length;
            final long n6 = n;
            final long n7 = n4;
            final long n8 = n5 * 8L - n6;
            if (n7 < n8) {
                if ((copy[n4 / 8] >> 7 - n4 % 8 & 0x1) != 0x0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                ++n4;
            }
            else {
                final byte[] y = aevy.y(copyOfRange, n3, this.d);
                final int length3 = y.length;
                final byte[] array2 = new byte[length3];
                for (int i = 0; i < length3; ++i) {
                    array2[i] = (byte)(y[i] ^ copy[i]);
                }
                for (int n9 = 0; n9 <= n8; ++n9) {
                    final int n10 = n9 / 8;
                    array2[n10] &= (byte)~(1 << 7 - n9 % 8);
                }
                int n11 = 0;
                while (true) {
                    final int b = this.b;
                    final int n12 = n2 - b - 2;
                    if (n11 < n12) {
                        if (array2[n11] != 0) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        ++n11;
                    }
                    else {
                        if (array2[n12] != 1) {
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
