import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agaw extends agcb
{
    public agaw(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        final agee agee = (agee)messageLite;
        final ahcr builder = ((ahcz)aged.a).createBuilder();
        final ahbt x = ahbt.x(agic.a(agee.b));
        builder.copyOnWrite();
        ((aged)builder.instance).c = x;
        builder.copyOnWrite();
        ((aged)builder.instance).b = 0;
        return (MessageLite)builder.build();
    }
    
    public final /* bridge */ MessageLite b(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agee.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        final ahcr builder = ((ahcz)agee.a).createBuilder();
        builder.copyOnWrite();
        agee.a((agee)builder.instance);
        hashMap.put("AES256_SIV", new arjd(builder.build(), 1));
        final ahcr builder2 = ((ahcz)agee.a).createBuilder();
        builder2.copyOnWrite();
        agee.a((agee)builder2.instance);
        hashMap.put("AES256_SIV_RAW", new arjd(builder2.build(), 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        final agee agee = (agee)messageLite;
        if (agee.b == 64) {
            return;
        }
        final int b = agee.b;
        final StringBuilder sb = new StringBuilder("invalid key size: ");
        sb.append(b);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidAlgorithmParameterException(sb.toString());
    }
}
