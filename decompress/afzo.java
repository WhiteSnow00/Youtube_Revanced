import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class afzo extends agcb
{
    public afzo(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        final agdx agdx = (agdx)messageLite;
        final ahcr builder = ((ahcz)agdw.a).createBuilder();
        final ahbt x = ahbt.x(agic.a(agdx.c));
        builder.copyOnWrite();
        ((agdw)builder.instance).d = x;
        agdy c;
        if ((c = agdx.b) == null) {
            c = agdy.a;
        }
        builder.copyOnWrite();
        final agdw agdw = (agdw)builder.instance;
        c.getClass();
        agdw.c = c;
        builder.copyOnWrite();
        ((agdw)builder.instance).b = 0;
        return (MessageLite)builder.build();
    }
    
    public final /* bridge */ MessageLite b(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agdx.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", afzp.g(16, 1));
        hashMap.put("AES128_EAX_RAW", afzp.g(16, 3));
        hashMap.put("AES256_EAX", afzp.g(32, 1));
        hashMap.put("AES256_EAX_RAW", afzp.g(32, 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        final agdx agdx = (agdx)messageLite;
        agii.a(agdx.c);
        agdy agdy;
        if ((agdy = agdx.b) == null) {
            agdy = agdy.a;
        }
        if (agdy.b != 12) {
            agdy agdy2;
            if ((agdy2 = agdx.b) == null) {
                agdy2 = agdy.a;
            }
            if (agdy2.b != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }
}
