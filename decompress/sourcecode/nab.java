import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nab
{
    private static final long a;
    
    static {
        a = TimeUnit.DAYS.toMillis(7L);
    }
    
    public static aexq a(final String s, final String s2) {
        final byte[] bytes = String.valueOf(s).concat(String.valueOf(s2)).getBytes(aexb.c);
        try {
            final long long1 = ByteBuffer.wrap(b(bytes, 0L)).getLong();
            final long a = nab.a;
            return aexq.k((Object)b(bytes, (System.currentTimeMillis() + (int)((long1 >>> 1) % a)) / a));
        }
        catch (final NoSuchAlgorithmException | InvalidKeyException ex) {
            return aewp.a;
        }
    }
    
    private static byte[] b(byte[] array, long n) {
        final Mac instance = Mac.getInstance("HmacSHA256");
        instance.init(new SecretKeySpec(array, "HmacSHA256"));
        array = new byte[8];
        for (int i = 7; i >= 0; --i) {
            array[i] = (byte)(0xFFL & n);
            n >>= 8;
        }
        return instance.doFinal(array);
    }
}
