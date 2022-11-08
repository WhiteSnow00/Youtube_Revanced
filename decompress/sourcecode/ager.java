import java.security.NoSuchAlgorithmException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ager
{
    private static final Charset a;
    
    static {
        a = Charset.forName("UTF-8");
    }
    
    public static Long a(final String s) {
        if (s == null) {
            return null;
        }
        try {
            final MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(s.getBytes(ager.a));
            return ByteBuffer.wrap(instance.digest()).getLong();
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
    }
}
