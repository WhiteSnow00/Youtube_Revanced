import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Arrays;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agen extends agaj
{
    public agen(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        final agcz agcz = (agcz)messageLite;
        final byte[] a = aggk.a(32);
        if (a.length == 32) {
            final byte[] f = agft.f(agft.e(a));
            final ahaz builder = ((ahbh)agdb.a).createBuilder();
            builder.copyOnWrite();
            ((agdb)builder.instance).b = 0;
            final ahab x = ahab.x(Arrays.copyOf(f, 32));
            builder.copyOnWrite();
            ((agdb)builder.instance).c = x;
            final agdb d = (agdb)builder.build();
            final ahaz builder2 = ((ahbh)agda.a).createBuilder();
            builder2.copyOnWrite();
            ((agda)builder2.instance).b = 0;
            final ahab x2 = ahab.x(Arrays.copyOf(a, 32));
            builder2.copyOnWrite();
            ((agda)builder2.instance).c = x2;
            builder2.copyOnWrite();
            final agda agda = (agda)builder2.instance;
            d.getClass();
            agda.d = d;
            return (MessageLite)builder2.build();
        }
        throw new IllegalArgumentException(String.format("Given secret seed length is not %s", 32));
    }
    
    public final /* bridge */ MessageLite b(final ahab ahab) {
        return (MessageLite)ahbh.parseFrom((ahbh)agcz.a, ahab, ExtensionRegistryLite.a);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("ED25519", new argj((Object)agcz.a, 1));
        hashMap.put("ED25519_RAW", new argj((Object)agcz.a, 3));
        hashMap.put("ED25519WithRawOutput", new argj((Object)agcz.a, 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        final agcz agcz = (agcz)messageLite;
    }
}
