import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfj implements afwo
{
    private static final ThreadLocal a;
    private static final ThreadLocal b;
    private final byte[] c;
    private final byte[] d;
    private final SecretKeySpec e;
    private final int f;
    
    static {
        a = (ThreadLocal)new agfh();
        b = (ThreadLocal)new agfi();
    }
    
    public agfj(byte[] b, final int f) {
        if (!aeuz.T(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (f != 12 && f != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f = f;
        aggq.a(b.length);
        final SecretKeySpec e = new SecretKeySpec(b, "AES");
        this.e = e;
        final Cipher cipher = agfj.a.get();
        cipher.init(1, e);
        b = b(cipher.doFinal(new byte[16]));
        this.c = b;
        this.d = b(b);
    }
    
    private static byte[] b(final byte[] array) {
        final byte[] array2 = new byte[16];
        int n;
        for (int i = 0; i < 15; i = n) {
            final byte b = array[i];
            n = i + 1;
            array2[i] = (byte)((b + b ^ (array[n] & 0xFF) >>> 7) & 0xFF);
        }
        final byte b2 = array[15];
        array2[15] = (byte)((array[0] >> 7 & 0x87) ^ b2 + b2);
        return array2;
    }
    
    private final byte[] c(final Cipher cipher, int n, byte[] array, int length, final int n2) {
        final byte[] array2 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (byte)n };
        if (n2 == 0) {
            return cipher.doFinal(d(array2, this.c));
        }
        byte[] array3 = cipher.doFinal(array2);
        final int n3 = 0;
        int i;
        for (n = 0; n2 - n > 16; n += 16) {
            for (i = 0; i < 16; ++i) {
                array3[i] ^= array[length + n + i];
            }
            array3 = cipher.doFinal(array3);
        }
        final byte[] copyOfRange = Arrays.copyOfRange(array, n + length, length + n2);
        if (copyOfRange.length == 16) {
            array = d(copyOfRange, this.c);
        }
        else {
            array = Arrays.copyOf(this.d, 16);
            n = n3;
            while (true) {
                length = copyOfRange.length;
                if (n >= length) {
                    break;
                }
                array[n] ^= copyOfRange[n];
                ++n;
            }
            array[length] ^= (byte)128;
        }
        return cipher.doFinal(d(array3, array));
    }
    
    private static byte[] d(final byte[] array, final byte[] array2) {
        final int length = array.length;
        final byte[] array3 = new byte[length];
        for (int i = 0; i < length; ++i) {
            array3[i] = (byte)(array[i] ^ array2[i]);
        }
        return array3;
    }
    
    public final byte[] a(byte[] c, byte[] c2) {
        final int length = c.length;
        final int f = this.f;
        if (length <= Integer.MAX_VALUE - f - 16) {
            final byte[] array = new byte[f + length + 16];
            final byte[] a = aggk.a(f);
            final int f2 = this.f;
            int i = 0;
            System.arraycopy(a, 0, array, 0, f2);
            final Cipher cipher = agfj.a.get();
            cipher.init(1, this.e);
            final byte[] c3 = this.c(cipher, 0, a, 0, a.length);
            c2 = this.c(cipher, 1, c2, 0, 0);
            final Cipher cipher2 = agfj.b.get();
            cipher2.init(1, this.e, new IvParameterSpec(c3));
            cipher2.doFinal(c, 0, length, array, this.f);
            c = this.c(cipher, 2, array, this.f, length);
            final int f3 = this.f;
            while (i < 16) {
                array[length + f3 + i] = (byte)(c2[i] ^ c3[i] ^ c[i]);
                ++i;
            }
            return array;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
