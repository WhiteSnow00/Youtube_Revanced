import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agab extends agcc
{
    public agab() {
        super((Class)agfj.class, new agci[] { new afzz(afyf.class) });
    }
    
    public final agcb a() {
        return new agaa(agfk.class);
    }
    
    public final agfb b() {
        return agfb.e;
    }
    
    public final /* bridge */ MessageLite c(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agfj.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        agii.d(((agfj)messageLite).b);
    }
}
