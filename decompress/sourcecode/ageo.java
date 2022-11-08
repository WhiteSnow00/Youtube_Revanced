import java.math.BigInteger;
import java.security.Key;
import javax.crypto.Cipher;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.ECPrivateKey;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ageo
{
    private static final agyc a;
    
    static {
        a = agyc.A("Tink and Wycheproof.");
    }
    
    public static final void a(final ECPrivateKey ecPrivateKey, final ECPublicKey ecPublicKey, int n, int n2) {
        final agdm agdm = new agdm(ecPrivateKey, n, n2);
        final agdn agdn = new agdn(ecPublicKey, n, n2);
        try {
            final agyc a = ageo.a;
            final byte[] i = a.I();
            final Signature signature = (Signature)agdz.c.a(agdm.b);
            signature.initSign(agdm.a);
            signature.update(i);
            final byte[] sign = signature.sign();
            n = agdm.c;
            n2 = 1;
            byte[] array = sign;
            if (n == 1) {
                n = aety.B(agdm.a.getParams().getCurve());
                final int n3 = n + n;
                if (!aety.H(sign)) {
                    throw new GeneralSecurityException("Invalid DER encoding");
                }
                array = new byte[n3];
                if ((sign[1] & 0xFF) >= 128) {
                    n = 3;
                }
                else {
                    n = 2;
                }
                final int n4 = ++n + 1;
                final byte b = sign[n];
                if (sign[n4] == 0) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                System.arraycopy(sign, n4 + n, array, n3 / 2 - b + n, b - n);
                n = n4 + (b + 1);
                final int n5 = n + 1;
                final byte b2 = sign[n];
                if (sign[n5] == 0) {
                    n = n2;
                }
                else {
                    n = 0;
                }
                System.arraycopy(sign, n5 + n, array, n3 - b2 + n, b2 - n);
            }
            agdn.a(array, a.I());
        }
        catch (final GeneralSecurityException ex) {
            throw new GeneralSecurityException("ECDSA signing with private key followed by verifying with public key failed. The key may be corrupted.", ex);
        }
    }
    
    public static final void b(final RSAPrivateCrtKey rsaPrivateCrtKey, final RSAPublicKey rsaPublicKey, final int n) {
        final agek agek = new agek(rsaPrivateCrtKey, n);
        final agel agel = new agel(rsaPublicKey, n);
        try {
            final agyc a = ageo.a;
            final byte[] i = a.I();
            final Signature signature = (Signature)agdz.c.a(agek.c);
            signature.initSign(agek.a);
            signature.update(i);
            final byte[] sign = signature.sign();
            final Signature signature2 = (Signature)agdz.c.a(agek.c);
            signature2.initVerify(agek.b);
            signature2.update(i);
            if (signature2.verify(sign)) {
                agel.a(sign, a.I());
                return;
            }
            throw new RuntimeException("Security bug: RSA signature computation error");
        }
        catch (final GeneralSecurityException ex) {
            throw new GeneralSecurityException("RSA PKCS1 signing with private key followed by verifying with public key failed. The key may be corrupted.", ex);
        }
    }
    
    public static final void c(final RSAPrivateCrtKey rsaPrivateCrtKey, final RSAPublicKey rsaPublicKey, int i, int n, int n2) {
        final agem agem = new agem(rsaPrivateCrtKey, i, n, n2);
        final agen agen = new agen(rsaPublicKey, i, n, n2);
        try {
            final byte[] j = ageo.a.I();
            n = agem.b.getModulus().bitLength() - 1;
            i = agep.a;
            final MessageDigest messageDigest = (MessageDigest)agdz.d.a(aety.v(agem.d));
            final byte[] digest = messageDigest.digest(j);
            final int digestLength = messageDigest.getDigestLength();
            n2 = (n - 1) / 8 + 1;
            i = agem.c;
            if (n2 < digestLength + i + 2) {
                throw new GeneralSecurityException("encoding error");
            }
            final byte[] a = agej.a(i);
            final int n3 = digestLength + 8;
            final byte[] array = new byte[agem.c + n3];
            System.arraycopy(digest, 0, array, 8, digestLength);
            i = a.length;
            System.arraycopy(a, 0, array, n3, i);
            final byte[] digest2 = messageDigest.digest(array);
            final int n4 = n2 - digestLength - 1;
            final byte[] array2 = new byte[n4];
            final int n5 = n2 - agem.c - digestLength;
            array2[n5 - 2] = 1;
            System.arraycopy(a, 0, array2, n5 - 1, i);
            final byte[] x = aety.x(digest2, n4, agem.e);
            final byte[] array3 = new byte[n4];
            for (i = 0; i < n4; ++i) {
                array3[i] = (byte)(array2[i] ^ x[i]);
            }
            int n6;
            for (i = 0; i < n2 * 8L - n; ++i) {
                n6 = i / 8;
                array3[n6] &= (byte)~(1 << 7 - i % 8);
            }
            i = digestLength + n4;
            final byte[] array4 = new byte[i + 1];
            System.arraycopy(array3, 0, array4, 0, n4);
            System.arraycopy(digest2, 0, array4, n4, digest2.length);
            array4[i] = -68;
            final Cipher cipher = (Cipher)agdz.a.a("RSA/ECB/NOPADDING");
            cipher.init(2, agem.a);
            final byte[] doFinal = cipher.doFinal(array4);
            final Cipher cipher2 = (Cipher)agdz.a.a("RSA/ECB/NOPADDING");
            cipher2.init(1, agem.b);
            if (new BigInteger(1, array4).equals(new BigInteger(1, cipher2.doFinal(doFinal)))) {
                agen.a(doFinal, ageo.a.I());
                return;
            }
            throw new RuntimeException("Security bug: RSA signature computation error");
        }
        catch (final GeneralSecurityException ex) {
            throw new GeneralSecurityException("RSA PSS signing with private key followed by verifying with public key failed. The key may be corrupted.", ex);
        }
    }
}
