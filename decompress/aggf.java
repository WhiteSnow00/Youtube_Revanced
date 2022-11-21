import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Arrays;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class aggf extends agcb
{
    public aggf(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        final ager ager = (ager)messageLite;
        final byte[] a = agic.a(32);
        if (a.length == 32) {
            final byte[] f = aghl.f(aghl.e(a));
            final ahcr builder = ((ahcz)aget.a).createBuilder();
            builder.copyOnWrite();
            ((aget)builder.instance).b = 0;
            final ahbt x = ahbt.x(Arrays.copyOf(f, 32));
            builder.copyOnWrite();
            ((aget)builder.instance).c = x;
            final aget d = (aget)builder.build();
            final ahcr builder2 = ((ahcz)ages.a).createBuilder();
            builder2.copyOnWrite();
            ((ages)builder2.instance).b = 0;
            final ahbt x2 = ahbt.x(Arrays.copyOf(a, 32));
            builder2.copyOnWrite();
            ((ages)builder2.instance).c = x2;
            builder2.copyOnWrite();
            final ages ages = (ages)builder2.instance;
            d.getClass();
            ages.d = d;
            return (MessageLite)builder2.build();
        }
        throw new IllegalArgumentException(String.format("Given secret seed length is not %s", 32));
    }
    
    public final /* bridge */ MessageLite b(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)ager.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("ED25519", new arjd(ager.a, 1));
        hashMap.put("ED25519_RAW", new arjd(ager.a, 3));
        hashMap.put("ED25519WithRawOutput", new arjd(ager.a, 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        final ager ager = (ager)messageLite;
    }
}
