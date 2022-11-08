import java.util.ArrayList;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhd implements dpj
{
    private final /* synthetic */ int a;
    
    public dhd(final int a) {
        this.a = a;
    }
    
    public static final dhe b() {
        try {
            return new dhe(MessageDigest.getInstance("SHA-256"));
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
    }
}
