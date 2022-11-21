import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class afzu extends agcb
{
    public afzu(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        final agec agec = (agec)messageLite;
        final ahcr builder = ((ahcz)ageb.a).createBuilder();
        final ahbt x = ahbt.x(agic.a(agec.b));
        builder.copyOnWrite();
        ((ageb)builder.instance).c = x;
        builder.copyOnWrite();
        ((ageb)builder.instance).b = 0;
        return (MessageLite)builder.build();
    }
    
    public final /* bridge */ MessageLite b(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agec.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", afzv.h(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", afzv.h(16, 3));
        hashMap.put("AES256_GCM_SIV", afzv.h(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", afzv.h(32, 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        agii.a(((agec)messageLite).b);
    }
}
