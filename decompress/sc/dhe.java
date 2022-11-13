import java.util.ArrayList;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhe implements dpk
{
    private final int a;
    
    public dhe(final int a) {
        this.a = a;
    }
    
    public static final dhf b() {
        try {
            return new dhf(MessageDigest.getInstance("SHA-256"));
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public final Object a() {
        final int a = this.a;
        if (a == 0) {
            return b();
        }
        if (a != 1) {
            return new ArrayList();
        }
        return new dfx();
    }
}
