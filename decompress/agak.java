import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

// 
// Decompiled by Procyon v0.6.0
// 

final class agak extends ThreadLocal
{
    public agak() {
    }
    
    protected static final Cipher a() {
        try {
            return (Cipher)aghs.a.a("AES/GCM/NoPadding");
        }
        catch (final GeneralSecurityException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    protected final /* bridge */ Object initialValue() {
        return a();
    }
}
