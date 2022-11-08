import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agep
{
    static {
        Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);
        Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);
    }
    
    public static void a(final int n) {
        if (n != 16 && n != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", n * 8));
        }
    }
    
    public static void b(final int n) {
        if (n < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", n));
        }
        if (afxc.a() && n != 2048 && n != 3072) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", n));
        }
    }
    
    public static void c(final BigInteger bigInteger) {
        if (!bigInteger.testBit(0)) {
            throw new GeneralSecurityException("Public exponent must be odd.");
        }
        if (bigInteger.compareTo(BigInteger.valueOf(65536L)) > 0) {
            return;
        }
        throw new GeneralSecurityException("Public exponent must be greater than 65536.");
    }
    
    public static void d(final int n) {
        if (n >= 0 && n <= 0) {
            return;
        }
        throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", n, 0));
    }
}
