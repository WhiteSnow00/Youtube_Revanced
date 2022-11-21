import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class afzr extends agcb
{
    public afzr(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        final agea agea = (agea)messageLite;
        final ahcr builder = ((ahcz)agdz.a).createBuilder();
        final ahbt x = ahbt.x(agic.a(agea.b));
        builder.copyOnWrite();
        ((agdz)builder.instance).c = x;
        builder.copyOnWrite();
        ((agdz)builder.instance).b = 0;
        return (MessageLite)builder.build();
    }
    
    public final /* bridge */ MessageLite b(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agea.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", afzs.g(16, 1));
        hashMap.put("AES128_GCM_RAW", afzs.g(16, 3));
        hashMap.put("AES256_GCM", afzs.g(32, 1));
        hashMap.put("AES256_GCM_RAW", afzs.g(32, 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        agii.a(((agea)messageLite).b);
    }
}
