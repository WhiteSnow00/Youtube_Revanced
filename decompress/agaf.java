import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agaf extends agcc
{
    public agaf() {
        super((Class)agfl.class, new agci[] { new agad(afyf.class) });
    }
    
    public final agcb a() {
        return new agae(agfm.class);
    }
    
    public final agfb b() {
        return agfb.e;
    }
    
    public final /* bridge */ MessageLite c(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agfl.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        agii.d(((agfl)messageLite).b);
    }
}
