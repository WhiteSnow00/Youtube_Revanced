import java.security.NoSuchAlgorithmException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ahgj implements ahgh
{
    public static long c(final String s) {
        try {
            final MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(s.getBytes(afas.c));
            return ByteBuffer.wrap(instance.digest()).getLong();
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public static ahgh d(final long n, final ahev ahev) {
        return (ahgh)new ahgi(n, ahev);
    }
    
    public abstract long a();
    
    public abstract ahev b();
}
