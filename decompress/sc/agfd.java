import java.math.BigInteger;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agfd extends agak
{
    public agfd() {
        super((Class)agee.class, new agaq[] { new agfc(afxl.class) });
    }
    
    public final agdj b() {
        return agdj.d;
    }
    
    public final /* bridge */ MessageLite c(final ahab ahab) {
        return (MessageLite)ahbh.parseFrom((ahbh)agee.a, ahab, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        final agee agee = (agee)messageLite;
        aggq.d(agee.b);
        aggq.b(new BigInteger(1, agee.d.I()).bitLength());
        aggq.c(new BigInteger(1, agee.e.I()));
        agec agec;
        if ((agec = agee.c) == null) {
            agec = agec.a;
        }
        aevy.Y(agec);
    }
}
