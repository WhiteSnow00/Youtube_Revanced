import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

// 
// Decompiled by Procyon v0.6.0
// 

final class agdh extends ThreadLocal
{
    public agdh() {
    }
    
    protected static final Cipher a() {
        try {
            return (Cipher)agdz.a.a("AES/CTR/NOPADDING");
        }
        catch (final GeneralSecurityException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
