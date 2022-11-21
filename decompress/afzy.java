import java.security.GeneralSecurityException;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afzy extends agcc
{
    public afzy() {
        super((Class)agef.class, new agci[] { new afzw(afyf.class) });
    }
    
    public final agcb a() {
        return new afzx(ageg.class);
    }
    
    public final agfb b() {
        return agfb.b;
    }
    
    public final /* bridge */ MessageLite c(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agef.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        final agef agef = (agef)messageLite;
        agii.d(agef.b);
        if (agef.c.d() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
    }
}
