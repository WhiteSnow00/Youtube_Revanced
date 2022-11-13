import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

final class ageq extends agak
{
    public ageq() {
        super((Class)agdb.class, new agaq[] { new agep(afxl.class) });
    }
    
    public static final void g(final agdb agdb) {
        aggq.d(agdb.b);
        if (agdb.c.d() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid Ed25519 public key: incorrect key length");
    }
    
    public final agdj b() {
        return agdj.d;
    }
    
    public final /* bridge */ MessageLite c(final ahab ahab) {
        return (MessageLite)ahbh.parseFrom((ahbh)agdb.a, ahab, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PublicKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        g((agdb)messageLite);
    }
}
