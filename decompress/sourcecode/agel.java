import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPublicKey;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agel implements afvk
{
    private final RSAPublicKey a;
    private final int b;
    
    public agel(final RSAPublicKey a, final int b) {
        if (aesy.ao(2)) {
            final int a2 = agep.a;
            agep.b(a.getModulus().bitLength());
            agep.c(a.getPublicExponent());
            this.a = a;
            this.b = b;
            return;
        }
        throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
    }
    
    public final void a(byte[] array, byte[] digest) {
        final BigInteger publicExponent = this.a.getPublicExponent();
        final BigInteger modulus = this.a.getModulus();
        final int n = (modulus.bitLength() + 7) / 8;
        if (n != array.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        final BigInteger s = aety.s(array);
        if (s.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        final byte[] u = aety.u(s.modPow(publicExponent, modulus), n);
        final int b = this.b;
        final int a = agep.a;
        final MessageDigest messageDigest = (MessageDigest)agdz.d.a(aety.v(this.b));
        messageDigest.update(digest);
        digest = messageDigest.digest();
        final int n2 = b - 1;
        int n3 = 2;
        if (n2 != 2) {
            if (n2 != 3) {
                array = aety.z("3051300d060960864801650304020305000440");
            }
            else {
                array = aety.z("3041300d060960864801650304020205000430");
            }
        }
        else {
            array = aety.z("3031300d060960864801650304020105000420");
        }
        final int n4 = array.length + digest.length;
        if (n < n4 + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        final byte[] array2 = new byte[n];
        array2[0] = 0;
        array2[1] = 1;
        for (int i = 0; i < n - n4 - 3; ++i, ++n3) {
            array2[n3] = -1;
        }
        final int n5 = n3 + 1;
        array2[n3] = 0;
        final int length = array.length;
        System.arraycopy(array, 0, array2, n5, length);
        System.arraycopy(digest, 0, array2, n5 + length, digest.length);
        if (MessageDigest.isEqual(u, array2)) {
            return;
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
