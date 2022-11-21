import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class aggd extends agcc
{
    public aggd() {
        super((Class)agek.class, new agci[] { new aggc(afzc.class) });
    }
    
    public final agfb b() {
        return agfb.d;
    }
    
    public final /* bridge */ MessageLite c(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agek.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPublicKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        final agek agek = (agek)messageLite;
        agii.d(agek.b);
        agei agei;
        if ((agei = agek.c) == null) {
            agei = agei.a;
        }
        aexq.N(agei);
    }
    
    public final int f() {
        return 2;
    }
}
