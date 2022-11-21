import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agbf extends agcc
{
    public agbf() {
        super((Class)agep.class, new agci[] { new agbe(afyk.class) });
    }
    
    public final agfb b() {
        return agfb.d;
    }
    
    public final /* bridge */ MessageLite c(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agep.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        final agep agep = (agep)messageLite;
        agii.d(agep.b);
        agen agen;
        if ((agen = agep.c) == null) {
            agen = agen.a;
        }
        aewr.y(agen);
    }
}
