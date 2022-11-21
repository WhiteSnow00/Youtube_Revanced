import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agah extends agcb
{
    public agah(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        final agfy agfy = (agfy)messageLite;
        final ahcr builder = ((ahcz)agfx.a).createBuilder();
        builder.copyOnWrite();
        ((agfx)builder.instance).b = 0;
        final ahbt x = ahbt.x(agic.a(32));
        builder.copyOnWrite();
        ((agfx)builder.instance).c = x;
        return (MessageLite)builder.build();
    }
    
    public final /* bridge */ MessageLite b(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agfy.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new arjd(agfy.a, 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new arjd(agfy.a, 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        final agfy agfy = (agfy)messageLite;
    }
}
