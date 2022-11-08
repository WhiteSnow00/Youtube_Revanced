import java.security.GeneralSecurityException;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afwg extends afyj
{
    public afwg() {
        super(agam.class, new afyp[] { new afwe(afum.class) });
    }
    
    @Override
    public final afyi a() {
        return new afwf(agan.class);
    }
    
    @Override
    public final agbi b() {
        return agbi.b;
    }
    
    @Override
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }
}
