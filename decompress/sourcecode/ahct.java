import java.security.NoSuchAlgorithmException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ahct implements ahcr
{
    public static long c(final String s) {
        try {
            final MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(s.getBytes(aexb.c));
            return ByteBuffer.wrap(instance.digest()).getLong();
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public static ahcr d(final long n, final ahbe ahbe) {
        return (ahcr)new ahcs(n, ahbe);
    }
    
    public abstract long a();
    
    public abstract ahbe b();
}
