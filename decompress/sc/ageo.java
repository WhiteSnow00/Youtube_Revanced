import java.security.GeneralSecurityException;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ageo extends agar
{
    public ageo() {
        super((Class)agda.class, new agaq[] { new agem(afxk.class) });
    }
    
    public final agaj a() {
        return new agen(agcz.class);
    }
    
    public final agdj b() {
        return agdj.c;
    }
    
    public final /* bridge */ MessageLite c(final ahab ahab) {
        return (MessageLite)ahbh.parseFrom((ahbh)agda.a, ahab, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        final agda agda = (agda)messageLite;
        aggq.d(agda.b);
        new ageq();
        agdb agdb;
        if ((agdb = agda.d) == null) {
            agdb = agdb.a;
        }
        ageq.g(agdb);
        if (agda.c.d() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid Ed25519 private key: incorrect key length");
    }
}
