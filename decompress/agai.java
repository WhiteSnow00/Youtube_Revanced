import java.security.GeneralSecurityException;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agai extends agcc
{
    public agai() {
        super((Class)agfx.class, new agci[] { new agag(afyf.class) });
    }
    
    public final agcb a() {
        return new agah(agfy.class);
    }
    
    public final agfb b() {
        return agfb.b;
    }
    
    public final /* bridge */ MessageLite c(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agfx.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        final agfx agfx = (agfx)messageLite;
        agii.d(agfx.b);
        if (agfx.c.d() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
    }
}
