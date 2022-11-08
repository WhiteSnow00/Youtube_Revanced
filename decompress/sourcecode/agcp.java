import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

final class agcp extends afyj
{
    public agcp() {
        super((Class)agba.class, new afyp[] { new agco(afvk.class) });
    }
    
    public static final void g(final agba agba) {
        agep.d(agba.b);
        if (agba.c.d() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid Ed25519 public key: incorrect key length");
    }
    
    public final agbi b() {
        return agbi.d;
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PublicKey";
    }
}
