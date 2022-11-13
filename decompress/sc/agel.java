import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agel extends agak
{
    public agel() {
        super((Class)agcs.class, new agaq[] { new agek(afxl.class) });
    }
    
    public final agdj b() {
        return agdj.d;
    }
    
    public final /* bridge */ MessageLite c(final ahab ahab) {
        return (MessageLite)ahbh.parseFrom((ahbh)agcs.a, ahab, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPublicKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        final agcs agcs = (agcs)messageLite;
        aggq.d(agcs.b);
        agcq agcq;
        if ((agcq = agcs.c) == null) {
            agcq = agcq.a;
        }
        aevy.W(agcq);
    }
    
    public final int f() {
        return 2;
    }
}
