import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afza extends afyj
{
    public afza() {
        super((Class)afzv.class, new afyp[] { new afyy(afve.class) });
    }
    
    public static void g(final afzx afzx) {
        final int b = afzx.b;
        if (b < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (b <= 16) {
            return;
        }
        throw new GeneralSecurityException("tag size too long");
    }
    
    public static void h(final int n) {
        if (n == 32) {
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }
    
    public final afyi a() {
        return new afyz(afzw.class);
    }
    
    public final agbi b() {
        return agbi.b;
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }
}
