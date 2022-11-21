import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class afzx extends agcb
{
    public afzx(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        final ageg ageg = (ageg)messageLite;
        final ahcr builder = ((ahcz)agef.a).createBuilder();
        builder.copyOnWrite();
        ((agef)builder.instance).b = 0;
        final ahbt x = ahbt.x(agic.a(32));
        builder.copyOnWrite();
        ((agef)builder.instance).c = x;
        return (MessageLite)builder.build();
    }
    
    public final /* bridge */ MessageLite b(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)ageg.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new arjd(ageg.a, 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new arjd(ageg.a, 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        final ageg ageg = (ageg)messageLite;
    }
}
