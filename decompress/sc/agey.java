import java.math.BigInteger;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agey extends agak
{
    public agey() {
        super((Class)agea.class, new agaq[] { new agex(afxl.class) });
    }
    
    public final agdj b() {
        return agdj.d;
    }
    
    public final /* bridge */ MessageLite c(final ahab ahab) {
        return (MessageLite)ahbh.parseFrom((ahbh)agea.a, ahab, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        final agea agea = (agea)messageLite;
        aggq.d(agea.b);
        aggq.b(new BigInteger(1, agea.d.I()).bitLength());
        aggq.c(new BigInteger(1, agea.e.I()));
        agdy agdy;
        if ((agdy = agea.c) == null) {
            agdy = agdy.a;
        }
        aevy.X(agdy);
    }
    
    public final int f() {
        return 2;
    }
}
