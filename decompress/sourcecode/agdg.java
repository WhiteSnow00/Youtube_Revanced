import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

// 
// Decompiled by Procyon v0.6.0
// 

final class agdg extends ThreadLocal
{
    public agdg() {
    }
    
    protected static final Cipher a() {
        try {
            return (Cipher)agdz.a.a("AES/ECB/NOPADDING");
        }
        catch (final GeneralSecurityException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
