import java.security.MessageDigest;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public interface ddk
{
    public static final Charset a = Charset.forName("UTF-8");
    
    void a(final MessageDigest p0);
    
    boolean equals(final Object p0);
    
    int hashCode();
}
