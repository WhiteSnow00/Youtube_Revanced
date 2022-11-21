import java.security.GeneralSecurityException;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbv extends agcc
{
    public agbv() {
        super((Class)agfa.class, new agci[] { new agbu(afyk.class) });
    }
    
    public final agfb b() {
        return agfb.d;
    }
    
    public final /* bridge */ MessageLite c(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agfa.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        final agfa agfa = (agfa)messageLite;
        agii.d(agfa.b);
        final agey c = agfa.c;
        if (c != null) {
            agbw.a(c);
            return;
        }
        throw new GeneralSecurityException("Missing HPKE key params.");
    }
}
