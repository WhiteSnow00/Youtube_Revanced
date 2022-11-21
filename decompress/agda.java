import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agda extends agcb
{
    public agda(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        final agev agev = (agev)messageLite;
        final ahcr builder = ((ahcz)ageu.a).createBuilder();
        builder.copyOnWrite();
        ((ageu)builder.instance).b = 0;
        agew c;
        if ((c = agev.b) == null) {
            c = agew.a;
        }
        builder.copyOnWrite();
        final ageu ageu = (ageu)builder.instance;
        c.getClass();
        ageu.c = c;
        final ahbt x = ahbt.x(agic.a(agev.c));
        builder.copyOnWrite();
        ((ageu)builder.instance).d = x;
        return (MessageLite)builder.build();
    }
    
    public final /* bridge */ MessageLite b(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agev.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", agdb.k(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", agdb.k(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", agdb.k(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", agdb.k(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", agdb.k(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", agdb.k(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", agdb.k(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", agdb.k(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", agdb.k(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", agdb.k(64, 64, 6, 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        final agev agev = (agev)messageLite;
        if (agev.c >= 16) {
            agew agew;
            if ((agew = agev.b) == null) {
                agew = agew.a;
            }
            agdb.g(agew);
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
