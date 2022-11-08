import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

// 
// Decompiled by Procyon v0.6.0
// 

final class afxa extends ThreadLocal
{
    public afxa() {
    }
    
    protected static final Cipher a() {
        try {
            return (Cipher)agdz.a.a("AES/GCM-SIV/NoPadding");
        }
        catch (final GeneralSecurityException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
