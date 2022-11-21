import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class afzi extends agcb
{
    public afzi(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        final agds agds = (agds)messageLite;
        final agcb a = new afzm().a();
        agdu agdu;
        if ((agdu = agds.b) == null) {
            agdu = agdu.a;
        }
        final MessageLite a2 = a.a((MessageLite)agdu);
        final agcb a3 = new agdb().a();
        agev agev;
        if ((agev = agds.c) == null) {
            agev = agev.a;
        }
        final MessageLite a4 = a3.a((MessageLite)agev);
        final ahcr builder = ((ahcz)agdr.a).createBuilder();
        builder.copyOnWrite();
        final agdr agdr = (agdr)builder.instance;
        a2.getClass();
        agdr.c = (agdt)a2;
        builder.copyOnWrite();
        final agdr agdr2 = (agdr)builder.instance;
        a4.getClass();
        agdr2.d = (ageu)a4;
        builder.copyOnWrite();
        ((agdr)builder.instance).b = 0;
        return (MessageLite)builder.build();
    }
    
    public final /* bridge */ MessageLite b(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agds.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", afzj.g(16, 16, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", afzj.g(16, 16, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", afzj.g(32, 32, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", afzj.g(32, 32, 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        final agds agds = (agds)messageLite;
        final agcb a = new afzm().a();
        agdu agdu;
        if ((agdu = agds.b) == null) {
            agdu = agdu.a;
        }
        a.d((MessageLite)agdu);
        final agcb a2 = new agdb().a();
        agev agev;
        if ((agev = agds.c) == null) {
            agev = agev.a;
        }
        a2.d((MessageLite)agev);
        agdu agdu2;
        if ((agdu2 = agds.b) == null) {
            agdu2 = agdu.a;
        }
        agii.a(agdu2.c);
    }
}
