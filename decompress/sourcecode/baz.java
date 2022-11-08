import javax.crypto.ShortBufferException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import java.nio.ByteBuffer;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class baz
{
    private final Cipher a;
    private final int b;
    private final byte[] c;
    private final byte[] d;
    private int e;
    
    public baz(final int n, byte[] ex, final long n2, final long n3) {
        try {
            final Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
            this.a = instance;
            final int blockSize = instance.getBlockSize();
            this.b = blockSize;
            this.c = new byte[blockSize];
            this.d = new byte[blockSize];
            final long n4 = blockSize;
            final long n5 = n3 / n4;
            final int n6 = (int)(n3 % n4);
            final SecretKeySpec secretKeySpec = new SecretKeySpec((byte[])(Object)ex, baw.aq(instance.getAlgorithm(), "/")[0]);
            ex = (InvalidAlgorithmParameterException)new IvParameterSpec(ByteBuffer.allocate(16).putLong(n2).putLong(n5).array());
            instance.init(n, secretKeySpec, (AlgorithmParameterSpec)ex);
            if (n6 != 0) {
                ex = (InvalidAlgorithmParameterException)(Object)new byte[n6];
                this.a((byte[])(Object)ex, 0, n6, (byte[])(Object)ex, 0);
            }
            return;
        }
        catch (final InvalidAlgorithmParameterException ex) {}
        catch (final InvalidKeyException ex) {}
        catch (final NoSuchPaddingException ex) {}
        catch (final NoSuchAlgorithmException ex2) {}
        throw new RuntimeException(ex);
    }
    
    public baz(final int n, final byte[] array, final String s, final long n2) {
        long n3 = 0L;
        long n4;
        if (s == null) {
            n4 = n3;
        }
        else {
            int n5 = 0;
            while (true) {
                n4 = n3;
                if (n5 >= s.length()) {
                    break;
                }
                final long n6 = n3 ^ (long)s.charAt(n5);
                n3 = n6 + (n6 + n6 + (n6 << 4) + (n6 << 5) + (n6 << 7) + (n6 << 8) + (n6 << 40));
                ++n5;
            }
        }
        this(n, array, n4, n2);
    }
    
    private final int b(final byte[] array, int update, final int n, final byte[] array2, final int n2) {
        try {
            update = this.a.update(array, update, n, array2, n2);
            return update;
        }
        catch (final ShortBufferException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public final void a(final byte[] array, int b, int i, final byte[] array2, int e) {
        do {
            final int e2 = this.e;
            if (e2 > 0) {
                array2[e] = (byte)(array[b] ^ this.d[this.b - e2]);
                ++e;
                ++b;
                this.e = e2 - 1;
            }
            else {
                b = this.b(array, b, i, array2, e);
                if (i == b) {
                    return;
                }
                final int n = i - b;
                final int b2 = this.b;
                i = 0;
                final boolean b3 = true;
                dk.h(n < b2);
                b += e;
                e = this.b - n;
                this.e = e;
                dk.h(this.b(this.c, 0, e, this.d, 0) == this.b && b3);
                while (i < n) {
                    array2[b] = this.d[i];
                    ++i;
                    ++b;
                }
            }
        } while (--i != 0);
    }
}
