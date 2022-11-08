import java.security.GeneralSecurityException;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afwq extends afyj
{
    public afwq() {
        super(agce.class, new afyp[] { new afwo(afum.class) });
    }
    
    @Override
    public final afyi a() {
        return new afwp(agcf.class);
    }
    
    @Override
    public final agbi b() {
        return agbi.b;
    }
    
    @Override
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }
}
