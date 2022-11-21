import java.security.interfaces.ECKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.InvalidKeyException;
import com.google.firebase.appindexing.internal.Thing$Metadata;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.KeyPair;
import java.security.spec.EllipticCurve;
import java.security.PublicKey;
import java.security.spec.ECPoint;
import java.security.InvalidAlgorithmParameterException;
import java.security.GeneralSecurityException;
import java.math.BigInteger;
import java.security.Key;
import javax.crypto.KeyAgreement;
import java.security.spec.KeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.ECPrivateKey;

// 
// Decompiled by Procyon v0.6.0
// 

public class aexq
{
    public static volatile arzi a;
    
    public static byte[] A(final ECPrivateKey ecPrivateKey, final ECPublicKey ecPublicKey) {
        y(ecPublicKey, ecPrivateKey);
        final ECPoint w = ecPublicKey.getW();
        agbz.b(w, ecPrivateKey.getParams().getCurve());
        final PublicKey generatePublic = ((KeyFactory)aghs.g.a("EC")).generatePublic(new ECPublicKeySpec(w, ecPrivateKey.getParams()));
        final KeyAgreement keyAgreement = (KeyAgreement)aghs.e.a("ECDH");
        keyAgreement.init(ecPrivateKey);
        try {
            keyAgreement.doPhase(generatePublic, true);
            final byte[] generateSecret = keyAgreement.generateSecret();
            final EllipticCurve curve = ecPrivateKey.getParams().getCurve();
            final BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(agbz.a(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            final BigInteger a = agbz.a(curve);
            final BigInteger mod = bigInteger.multiply(bigInteger).add(curve.getA()).multiply(bigInteger).add(curve.getB()).mod(a);
            if (a.signum() == 1) {
                final BigInteger mod2 = mod.mod(a);
                BigInteger bigInteger2 = null;
                Label_0624: {
                    if (mod2.equals(BigInteger.ZERO)) {
                        bigInteger2 = BigInteger.ZERO;
                    }
                    else {
                        if (a.testBit(0) && a.testBit(1)) {
                            bigInteger2 = mod2.modPow(a.add(BigInteger.ONE).shiftRight(2), a);
                        }
                        else {
                            final boolean testBit = a.testBit(0);
                            final BigInteger bigInteger3 = bigInteger2 = null;
                            if (testBit) {
                                bigInteger2 = bigInteger3;
                                if (!a.testBit(1)) {
                                    bigInteger2 = BigInteger.ONE;
                                    final BigInteger shiftRight = a.subtract(BigInteger.ONE).shiftRight(1);
                                    int n = 0;
                                    while (true) {
                                        final BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(a);
                                        if (mod3.equals(BigInteger.ZERO)) {
                                            break Label_0624;
                                        }
                                        final BigInteger modPow = mod3.modPow(shiftRight, a);
                                        if (modPow.add(BigInteger.ONE).equals(a)) {
                                            final BigInteger shiftRight2 = a.add(BigInteger.ONE).shiftRight(1);
                                            BigInteger bigInteger4 = BigInteger.ONE;
                                            int i = shiftRight2.bitLength() - 2;
                                            BigInteger mod4 = bigInteger2;
                                            while (i >= 0) {
                                                final BigInteger multiply = mod4.multiply(bigInteger4);
                                                final BigInteger mod5 = mod4.multiply(mod4).add(bigInteger4.multiply(bigInteger4).mod(a).multiply(mod3)).mod(a);
                                                bigInteger4 = multiply.add(multiply).mod(a);
                                                if (shiftRight2.testBit(i)) {
                                                    mod4 = mod5.multiply(bigInteger2).add(bigInteger4.multiply(mod3)).mod(a);
                                                    bigInteger4 = bigInteger2.multiply(bigInteger4).add(mod5).mod(a);
                                                }
                                                else {
                                                    mod4 = mod5;
                                                }
                                                --i;
                                            }
                                            bigInteger2 = mod4;
                                            break;
                                        }
                                        if (!modPow.equals(BigInteger.ONE)) {
                                            throw new InvalidAlgorithmParameterException("p is not prime");
                                        }
                                        final BigInteger add = bigInteger2.add(BigInteger.ONE);
                                        final int n2 = n + 1;
                                        bigInteger2 = add;
                                        if ((n = n2) != 128) {
                                            continue;
                                        }
                                        if (!a.isProbablePrime(80)) {
                                            throw new InvalidAlgorithmParameterException("p is not prime");
                                        }
                                        bigInteger2 = add;
                                        n = n2;
                                    }
                                }
                            }
                        }
                        if (bigInteger2 != null) {
                            if (bigInteger2.multiply(bigInteger2).mod(a).compareTo(mod2) != 0) {
                                throw new GeneralSecurityException("Could not find a modular square root");
                            }
                        }
                    }
                }
                if (!bigInteger2.testBit(0)) {
                    a.subtract(bigInteger2).mod(a);
                }
                return generateSecret;
            }
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        catch (final IllegalStateException ex) {
            throw new GeneralSecurityException(ex);
        }
    }
    
    public static byte[] B(final byte[] array) {
        final int n = 0;
        int n2 = 0;
        int length;
        while (true) {
            length = array.length;
            if (n2 >= length || array[n2] != 0) {
                break;
            }
            ++n2;
        }
        int n3;
        if ((n3 = n2) == length) {
            n3 = length - 1;
        }
        int n4 = n;
        if ((array[n3] & 0x80) == 0x80) {
            n4 = 1;
        }
        final int n5 = length - n3;
        final byte[] array2 = new byte[n5 + n4];
        System.arraycopy(array, n3, array2, n4, n5);
        return array2;
    }
    
    public static KeyPair C(final int n) {
        return w(F(n));
    }
    
    public static ECPrivateKey D(final int n, final byte[] array) {
        return (ECPrivateKey)((KeyFactory)aghs.g.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, array), F(n)));
    }
    
    public static ECPublicKey E(final int n, final byte[] array, final byte[] array2) {
        final ECParameterSpec f = F(n);
        final ECPoint ecPoint = new ECPoint(new BigInteger(1, array), new BigInteger(1, array2));
        agbz.b(ecPoint, f.getCurve());
        return (ECPublicKey)((KeyFactory)aghs.g.a("EC")).generatePublic(new ECPublicKeySpec(ecPoint, f));
    }
    
    public static ECParameterSpec F(int n) {
        if (--n == 0) {
            return agbz.a;
        }
        if (n != 1) {
            return agbz.c;
        }
        return agbz.b;
    }
    
    public static byte[] G(final EllipticCurve ellipticCurve, int n, final ECPoint ecPoint) {
        agbz.b(ecPoint, ellipticCurve);
        int v = v(ellipticCurve);
        if (--n == 0) {
            n = v + v + 1;
            final byte[] array = new byte[n];
            final byte[] byteArray = ecPoint.getAffineX().toByteArray();
            final byte[] byteArray2 = ecPoint.getAffineY().toByteArray();
            final int length = byteArray2.length;
            System.arraycopy(byteArray2, 0, array, n - length, length);
            n = byteArray.length;
            System.arraycopy(byteArray, 0, array, v + 1 - n, n);
            array[0] = 4;
            return array;
        }
        byte b = 2;
        if (n != 2) {
            final byte[] array2 = new byte[++v];
            final byte[] byteArray3 = ecPoint.getAffineX().toByteArray();
            n = byteArray3.length;
            System.arraycopy(byteArray3, 0, array2, v - n, n);
            if (ecPoint.getAffineY().testBit(0)) {
                b = 3;
            }
            array2[0] = b;
            return array2;
        }
        n = v + v;
        final byte[] array3 = new byte[n];
        final byte[] byteArray4 = ecPoint.getAffineX().toByteArray();
        final int length2 = byteArray4.length;
        byte[] copyOfRange = byteArray4;
        if (length2 > v) {
            copyOfRange = Arrays.copyOfRange(byteArray4, length2 - v, length2);
        }
        final byte[] byteArray5 = ecPoint.getAffineY().toByteArray();
        final int length3 = byteArray5.length;
        byte[] copyOfRange2 = byteArray5;
        if (length3 > v) {
            copyOfRange2 = Arrays.copyOfRange(byteArray5, length3 - v, length3);
        }
        final int length4 = copyOfRange2.length;
        System.arraycopy(copyOfRange2, 0, array3, n - length4, length4);
        n = copyOfRange.length;
        System.arraycopy(copyOfRange, 0, array3, v - n, n);
        return array3;
    }
    
    public static ECPublicKey H(int length, final byte[] array) {
        final ECParameterSpec f = F(length);
        final EllipticCurve curve = f.getCurve();
        int v = v(curve);
        length = array.length;
        if (length != v + v + 1) {
            throw new GeneralSecurityException("invalid point size");
        }
        if (array[0] == 4) {
            ++v;
            final ECPoint ecPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(array, 1, v)), new BigInteger(1, Arrays.copyOfRange(array, v, length)));
            agbz.b(ecPoint, curve);
            return (ECPublicKey)((KeyFactory)aghs.g.a("EC")).generatePublic(new ECPublicKeySpec(ecPoint, f));
        }
        throw new GeneralSecurityException("invalid point format");
    }
    
    public static byte[] I(final int n, final ECPoint ecPoint) {
        return G(F(n).getCurve(), 1, ecPoint);
    }
    
    public static void J(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2, final ByteBuffer byteBuffer3, final int n) {
        if (n >= 0 && byteBuffer2.remaining() >= n && byteBuffer3.remaining() >= n && byteBuffer.remaining() >= n) {
            for (int i = 0; i < n; ++i) {
                byteBuffer.put((byte)(byteBuffer2.get() ^ byteBuffer3.get()));
            }
            return;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }
    
    public static byte[] K(final byte[]... array) {
        int n = 0;
        int n2 = 0;
        while (true) {
            final int length = array.length;
            if (n >= length) {
                final byte[] array2 = new byte[n2];
                int i = 0;
                int n3 = 0;
                while (i < length) {
                    final byte[] array3 = array[i];
                    final int length2 = array3.length;
                    System.arraycopy(array3, 0, array2, n3, length2);
                    n3 += length2;
                    ++i;
                }
                return array2;
            }
            final int length3 = array[n].length;
            if (n2 > Integer.MAX_VALUE - length3) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            n2 += length3;
            ++n;
        }
    }
    
    public static byte[] L(final byte[] array, final byte[] array2) {
        final int length = array.length;
        if (length == array2.length) {
            return M(array, 0, array2, 0, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }
    
    public static byte[] M(final byte[] array, final int n, final byte[] array2, final int n2, final int n3) {
        if (array.length - n3 >= n && array2.length - n3 >= n2) {
            final byte[] array3 = new byte[n3];
            for (int i = 0; i < n3; ++i) {
                array3[i] = (byte)(array[i + n] ^ array2[i + n2]);
            }
            return array3;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }
    
    public static void N(final agei agei) {
        int q;
        if ((q = aewr.q(agei.d)) == 0) {
            q = 1;
        }
        int z;
        if ((z = Z(agei.b)) == 0) {
            z = 1;
        }
        int p;
        if ((p = aewr.p(agei.c)) == 0) {
            p = 1;
        }
        q -= 2;
        if (q != 1 && q != 2) {
            throw new GeneralSecurityException("unsupported signature encoding");
        }
        final int n = p - 2;
        if (n != 2) {
            if (n != 3) {
                if (n != 4) {
                    throw new GeneralSecurityException("Invalid ECDSA parameters");
                }
                if (z != 6) {
                    throw new GeneralSecurityException("Invalid ECDSA parameters");
                }
            }
            else if (z != 4) {
                if (z != 6) {
                    throw new GeneralSecurityException("Invalid ECDSA parameters");
                }
            }
        }
        else if (z != 5) {
            throw new GeneralSecurityException("Invalid ECDSA parameters");
        }
    }
    
    public static void O(final agfq agfq) {
        int z;
        if ((z = Z(agfq.b)) == 0) {
            z = 1;
        }
        S(z);
    }
    
    public static void P(final agfu agfu) {
        final int z = Z(agfu.b);
        int n = 1;
        int n2 = z;
        if (z == 0) {
            n2 = 1;
        }
        S(n2);
        int z2;
        if ((z2 = Z(agfu.b)) == 0) {
            z2 = 1;
        }
        final int z3 = Z(agfu.c);
        if (z3 != 0) {
            n = z3;
        }
        if (z2 != n) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        if (agfu.d >= 0) {
            return;
        }
        throw new GeneralSecurityException("salt length is negative");
    }
    
    public static int Q(final int n) {
        final int n2 = n - 2;
        if (n2 == 2) {
            return 1;
        }
        if (n2 == 3) {
            return 2;
        }
        if (n2 != 4) {
            String s;
            if (n != 1) {
                if (n != 2) {
                    if (n != 4) {
                        if (n != 5) {
                            if (n != 6) {
                                if (n != 7) {
                                    s = "null";
                                }
                                else {
                                    s = "CURVE25519";
                                }
                            }
                            else {
                                s = "NIST_P521";
                            }
                        }
                        else {
                            s = "NIST_P384";
                        }
                    }
                    else {
                        s = "NIST_P256";
                    }
                }
                else {
                    s = "UNKNOWN_CURVE";
                }
            }
            else {
                s = "UNRECOGNIZED";
            }
            throw new GeneralSecurityException("unknown curve type: ".concat(s));
        }
        return 3;
    }
    
    public static int R(final int n) {
        final int n2 = n - 2;
        int n3 = 1;
        if (n2 != 1) {
            n3 = 2;
            if (n2 != 2) {
                String s;
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            s = "UNRECOGNIZED";
                        }
                        else {
                            s = "DER";
                        }
                    }
                    else {
                        s = "IEEE_P1363";
                    }
                }
                else {
                    s = "UNKNOWN_ENCODING";
                }
                throw new GeneralSecurityException("unknown ECDSA encoding: ".concat(s));
            }
        }
        return n3;
    }
    
    public static int S(final int n) {
        final int n2 = n - 2;
        if (n2 == 2) {
            return 4;
        }
        if (n2 == 3) {
            return 3;
        }
        if (n2 != 4) {
            String s = null;
            switch (n) {
                default: {
                    s = "UNRECOGNIZED";
                    break;
                }
                case 7: {
                    s = "SHA224";
                    break;
                }
                case 6: {
                    s = "SHA512";
                    break;
                }
                case 5: {
                    s = "SHA256";
                    break;
                }
                case 4: {
                    s = "SHA384";
                    break;
                }
                case 3: {
                    s = "SHA1";
                    break;
                }
                case 2: {
                    s = "UNKNOWN_HASH";
                    break;
                }
            }
            throw new GeneralSecurityException("unsupported hash type: ".concat(s));
        }
        return 5;
    }
    
    public static int T(final int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 3;
        }
        if (n == 2) {
            return 4;
        }
        if (n != 3) {
            return 0;
        }
        return 5;
    }
    
    public static String U(final int n) {
        if (n == 2) {
            return "KEM_UNKNOWN";
        }
        if (n == 3) {
            return "DHKEM_X25519_HKDF_SHA256";
        }
        if (n == 4) {
            return "DHKEM_P256_HKDF_SHA256";
        }
        if (n == 5) {
            return "DHKEM_P384_HKDF_SHA384";
        }
        if (n != 6) {
            return "UNRECOGNIZED";
        }
        return "DHKEM_P521_HKDF_SHA512";
    }
    
    public static int V(final int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 3;
        }
        if (n == 2) {
            return 4;
        }
        if (n == 3) {
            return 5;
        }
        if (n != 4) {
            return 0;
        }
        return 6;
    }
    
    public static int W(final int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 3;
        }
        if (n == 2) {
            return 4;
        }
        if (n != 3) {
            return 0;
        }
        return 5;
    }
    
    public static int X(final int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 3;
        }
        if (n == 2) {
            return 4;
        }
        if (n != 3) {
            return 0;
        }
        return 5;
    }
    
    public static int Y(final int n) {
        if (n != 1) {
            return n - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    public static int Z(final int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 3;
        }
        if (n == 2) {
            return 4;
        }
        if (n == 3) {
            return 5;
        }
        if (n == 4) {
            return 6;
        }
        if (n != 5) {
            return 0;
        }
        return 7;
    }
    
    public static ListenableFuture a(final Runnable runnable, final long n, long convert, final TimeUnit timeUnit, final oco oco, final afxk afxk) {
        final long d = oco.d();
        final long convert2 = TimeUnit.MILLISECONDS.convert(n, timeUnit);
        convert = TimeUnit.MILLISECONDS.convert(convert, timeUnit);
        final SettableFuture create = SettableFuture.create();
        final AtomicReference atomicReference = new AtomicReference(null);
        while (true) {
            while (!atomicReference.compareAndSet(null, afxk.e(new afae(create, runnable, atomicReference, afxk, d + convert2, convert, oco), n, timeUnit))) {
                if (atomicReference.get() != null) {
                    create.addListener((Runnable)new aevy(atomicReference, 6), (Executor)afwd.a);
                    return (ListenableFuture)create;
                }
            }
            continue;
        }
    }
    
    public static int aA(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int aB(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int aa(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int ab(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ac(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int ad(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ae(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int af(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ag(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int ah(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n == 4) {
            return 5;
        }
        if (n != 5) {
            return 0;
        }
        return 6;
    }
    
    public static int ai(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int aj(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ak(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int al(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int am(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int an(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ao(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int ap(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int aq(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int ar(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int as(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int at(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int au(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int av(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int aw(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ax(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int ay(final int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 3;
        }
        if (n == 2) {
            return 4;
        }
        if (n != 3) {
            return 0;
        }
        return 5;
    }
    
    public static int az(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static afax b() {
        return new afay();
    }
    
    public static boolean c(final Object o, final Object o2) {
        boolean b = true;
        if (o != o2) {
            if (o != null) {
                if (!o.equals(o2)) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public static void d(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static boolean e(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
    
    public static agkw f(final String s) {
        try {
            final Class<?> forName = Class.forName(s);
            if (agkw.class.isAssignableFrom(forName)) {
                return (agkw)forName.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            }
            throw new aglf(String.format("Class %s is not an instance of %s", s, "com.google.firebase.components.ComponentRegistrar"));
        }
        catch (final InvocationTargetException ex) {
            throw new aglf(String.format("Could not instantiate %s", s), (Throwable)ex);
        }
        catch (final NoSuchMethodException ex2) {
            throw new aglf(String.format("Could not instantiate %s", s), (Throwable)ex2);
        }
        catch (final InstantiationException ex3) {
            throw new aglf(String.format("Could not instantiate %s.", s), (Throwable)ex3);
        }
        catch (final IllegalAccessException ex4) {
            throw new aglf(String.format("Could not instantiate %s.", s), (Throwable)ex4);
        }
        catch (final ClassNotFoundException ex5) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", s), (Throwable)ex5);
            return null;
        }
    }
    
    public static agkd g(final Status status, final String s) {
        kht.aL((Object)status);
        final String h = status.h;
        String s2 = s;
        if (h != null) {
            s2 = s;
            if (!h.isEmpty()) {
                s2 = h;
            }
        }
        switch (status.g) {
            default: {
                return new agkd(s2);
            }
            case 17514: {
                return (agkd)new agkc(s2);
            }
            case 17513: {
                return (agkd)new agke(s2);
            }
            case 17511: {
                return (agkd)new agkg(s2);
            }
            case 17510: {
                return (agkd)new agkf(s2);
            }
        }
    }
    
    public static Thing$Metadata h(final boolean b, final int n, final String s, final Bundle bundle) {
        return new Thing$Metadata(b, n, s, bundle, (Bundle)null);
    }
    
    public static int i(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static byte[] j(byte[] copy, final byte[] array) {
        if (copy.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        final long[] array2 = new long[11];
        final byte[] copy2 = Arrays.copyOf(copy, 32);
        copy2[0] &= (byte)248;
        final int n = copy2[31] & 0x7F;
        copy2[31] = (byte)n;
        copy2[31] = (byte)(n | 0x40);
        final byte[][] a = aghe.a;
        if (array.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        copy = Arrays.copyOf(array, 32);
        copy[31] &= 0x7F;
        for (int i = 0; i < 7; ++i) {
            if (MessageDigest.isEqual(aghe.a[i], copy)) {
                throw new InvalidKeyException("Banned public key: ".concat(s(aghe.a[i])));
            }
        }
        final long[] l = aghv.l(copy);
        long[] array3 = new long[19];
        long[] array4 = new long[19];
        array4[0] = 1L;
        long[] array5 = new long[19];
        array5[0] = 1L;
        long[] array6 = new long[19];
        long[] array7 = new long[19];
        long[] array8 = new long[19];
        array8[0] = 1L;
        long[] array9 = new long[19];
        long[] array10 = new long[19];
        array10[0] = 1L;
        System.arraycopy(l, 0, array3, 0, 10);
        for (int j = 0; j < 32; ++j) {
            final int n2 = copy2[32 - j - 1] & 0xFF;
            long[] array18;
            long[] array19;
            long[] array20;
            long[] array21;
            for (int k = 0; k < 8; ++k, array18 = array7, array7 = array3, array19 = array10, array20 = array9, array21 = array4, array9 = array5, array10 = array6, array3 = array18, array4 = array8, array5 = array20, array6 = array19, array8 = array21) {
                final int n3 = n2 >> 7 - k & 0x1;
                aghe.b(array5, array3, n3);
                aghe.b(array6, array4, n3);
                final long[] copy3 = Arrays.copyOf(array5, 10);
                final long[] array11 = new long[19];
                final long[] array12 = new long[19];
                final long[] array13 = new long[19];
                final long[] array14 = new long[19];
                final long[] array15 = new long[19];
                final long[] array16 = new long[19];
                final long[] array17 = new long[19];
                aghv.j(array5, array5, array6);
                aghv.i(array6, copy3, array6);
                final long[] copy4 = Arrays.copyOf(array3, 10);
                aghv.j(array3, array3, array4);
                aghv.i(array4, copy4, array4);
                aghv.c(array14, array3, array6);
                aghv.c(array15, array5, array4);
                aghv.f(array14);
                aghv.e(array14);
                aghv.f(array15);
                aghv.e(array15);
                System.arraycopy(array14, 0, copy4, 0, 10);
                aghv.j(array14, array14, array15);
                aghv.i(array15, copy4, array15);
                aghv.h(array17, array14);
                aghv.h(array16, array15);
                aghv.c(array15, array16, l);
                aghv.f(array15);
                aghv.e(array15);
                System.arraycopy(array17, 0, array7, 0, 10);
                System.arraycopy(array15, 0, array8, 0, 10);
                aghv.h(array12, array5);
                aghv.h(array13, array6);
                aghv.c(array9, array12, array13);
                aghv.f(array9);
                aghv.e(array9);
                aghv.i(array13, array12, array13);
                Arrays.fill(array11, 10, 18, 0L);
                aghv.g(array11, array13, 121665L);
                aghv.e(array11);
                aghv.j(array11, array11, array12);
                aghv.c(array10, array13, array11);
                aghv.f(array10);
                aghv.e(array10);
                aghe.b(array9, array7, n3);
                aghe.b(array10, array8, n3);
            }
        }
        final long[] array22 = new long[10];
        aghv.a(array22, array6);
        aghv.b(array2, array5, array22);
        final long[] array23 = new long[10];
        final long[] array24 = new long[10];
        final long[] array25 = new long[11];
        final long[] array26 = new long[11];
        final long[] array27 = new long[11];
        aghv.b(array23, l, array2);
        aghv.j(array24, l, array2);
        final long[] array28 = new long[10];
        array28[0] = 486662L;
        aghv.j(array26, array24, array28);
        aghv.b(array26, array26, array4);
        aghv.j(array26, array26, array3);
        aghv.b(array26, array26, array23);
        aghv.b(array26, array26, array3);
        aghv.g(array25, array26, 4L);
        aghv.e(array25);
        aghv.b(array26, array23, array4);
        aghv.i(array26, array26, array4);
        aghv.b(array27, array24, array3);
        aghv.j(array26, array26, array27);
        aghv.h(array26, array26);
        if (MessageDigest.isEqual(aghv.k(array25), aghv.k(array26))) {
            return aghv.k(array2);
        }
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(s(array)));
    }
    
    public static byte[] k() {
        final byte[] a = agic.a(32);
        a[0] |= 0x7;
        final int n = a[31] & 0x3F;
        a[31] = (byte)n;
        a[31] = (byte)(n | 0x80);
        return a;
    }
    
    public static byte[] l(final byte[] array) {
        if (array.length == 32) {
            final byte[] array2 = new byte[32];
            array2[0] = 9;
            return j(array, array2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
    
    public static BigInteger m(final byte[] array) {
        return new BigInteger(1, array);
    }
    
    public static boolean n() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }
    
    public static byte[] o(final BigInteger bigInteger, final int n) {
        final byte[] byteArray = bigInteger.toByteArray();
        final int length = byteArray.length;
        if (length == n) {
            return byteArray;
        }
        final int n2 = n + 1;
        if (length > n2) {
            throw new GeneralSecurityException("integer too large");
        }
        if (length != n2) {
            final byte[] array = new byte[n];
            System.arraycopy(byteArray, 0, array, n - length, length);
            return array;
        }
        if (byteArray[0] == 0) {
            return Arrays.copyOfRange(byteArray, 1, length);
        }
        throw new GeneralSecurityException("integer too large");
    }
    
    public static String p(int n) {
        if (--n == 2) {
            return "SHA-256";
        }
        if (n != 3) {
            return "SHA-512";
        }
        return "SHA-384";
    }
    
    public static String q(final int n) {
        final int a = agii.a;
        return u(n).concat("withECDSA");
    }
    
    public static byte[] r(final byte[] array, final int n, int n2) {
        final MessageDigest messageDigest = (MessageDigest)aghs.d.a(p(n2));
        final int digestLength = messageDigest.getDigestLength();
        final byte[] array2 = new byte[n];
        int i = 0;
        n2 = 0;
        while (i <= (n - 1) / digestLength) {
            messageDigest.reset();
            messageDigest.update(array);
            messageDigest.update(o(BigInteger.valueOf(i), 4));
            final byte[] digest = messageDigest.digest();
            final int length = digest.length;
            System.arraycopy(digest, 0, array2, n2, Math.min(length, n - n2));
            n2 += length;
            ++i;
        }
        return array2;
    }
    
    public static String s(final byte[] array) {
        final int length = array.length;
        final StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length; ++i) {
            final int n = array[i] & 0xFF;
            sb.append("0123456789abcdef".charAt(n >> 4));
            sb.append("0123456789abcdef".charAt(n & 0xF));
        }
        return sb.toString();
    }
    
    public static byte[] t(final String s) {
        if (s.length() % 2 == 0) {
            final int n = s.length() / 2;
            final byte[] array = new byte[n];
            for (int i = 0; i < n; ++i) {
                final int n2 = i + i;
                final int digit = Character.digit(s.charAt(n2), 16);
                final int digit2 = Character.digit(s.charAt(n2 + 1), 16);
                if (digit == -1 || digit2 == -1) {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
                array[i] = (byte)(digit * 16 + digit2);
            }
            return array;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }
    
    public static String u(final int n) {
        if (n == 3) {
            return "SHA256";
        }
        if (n != 4) {
            return "SHA512";
        }
        return "SHA384";
    }
    
    public static int v(final EllipticCurve ellipticCurve) {
        return (agbz.a(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }
    
    public static KeyPair w(final ECParameterSpec ecParameterSpec) {
        final KeyPairGenerator keyPairGenerator = (KeyPairGenerator)aghs.f.a("EC");
        keyPairGenerator.initialize(ecParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }
    
    public static void x(final ECPublicKey ecPublicKey) {
        agbz.b(ecPublicKey.getW(), ecPublicKey.getParams().getCurve());
    }
    
    public static void y(ECPublicKey ex, final ECPrivateKey ecPrivateKey) {
        try {
            if (agbz.c(((ECKey)ex).getParams(), ecPrivateKey.getParams())) {
                return;
            }
            ex = (NullPointerException)new GeneralSecurityException("invalid public key spec");
            throw ex;
        }
        catch (final NullPointerException ex) {}
        catch (final IllegalArgumentException ex2) {}
        throw new GeneralSecurityException(ex);
    }
    
    public static boolean z(final byte[] array) {
        final int length = array.length;
        if (length < 8) {
            return false;
        }
        if (array[0] != 48) {
            return false;
        }
        int n = array[1] & 0xFF;
        int n2;
        if (n == 129) {
            n = (array[2] & 0xFF);
            if (n < 128) {
                return false;
            }
            n2 = 2;
        }
        else {
            if (n == 128 || n > 129) {
                return false;
            }
            n2 = 1;
        }
        if (n != length - 1 - n2) {
            return false;
        }
        if (array[n2 + 1] != 2) {
            return false;
        }
        final int n3 = array[n2 + 2] & 0xFF;
        final int n4 = n2 + 3;
        final int n5 = n4 + n3;
        final int n6 = n5 + 1;
        if (n6 >= length) {
            return false;
        }
        if (n3 == 0) {
            return false;
        }
        final byte b = array[n4];
        if ((b & 0xFF) >= 128) {
            return false;
        }
        if (n3 > 1 && b == 0 && (array[n2 + 4] & 0xFF) < 128) {
            return false;
        }
        if (array[n5] != 2) {
            return false;
        }
        final int n7 = array[n6] & 0xFF;
        if (n5 + 2 + n7 != length) {
            return false;
        }
        if (n7 == 0) {
            return false;
        }
        final byte b2 = array[n2 + 5 + n3];
        return (b2 & 0xFF) < 128 && (n7 <= 1 || b2 != 0 || (array[n2 + 6 + n3] & 0xFF) >= 128);
    }
}
