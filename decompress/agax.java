import java.security.InvalidKeyException;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agax extends agcc
{
    public agax() {
        super((Class)aged.class, new agci[] { new agav(afyi.class) });
    }
    
    public final agcb a() {
        return new agaw(agee.class);
    }
    
    public final agfb b() {
        return agfb.b;
    }
    
    public final /* bridge */ MessageLite c(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)aged.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        final aged aged = (aged)messageLite;
        agii.d(aged.b);
        if (aged.c.d() == 64) {
            return;
        }
        final int d = aged.c.d();
        final StringBuilder sb = new StringBuilder("invalid key size: ");
        sb.append(d);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidKeyException(sb.toString());
    }
}
