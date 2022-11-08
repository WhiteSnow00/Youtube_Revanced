import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class afwf extends afyi
{
    public afwf(final Class clazz) {
        super(clazz);
    }
    
    @Override
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new ardu((Object)agan.a, 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new ardu((Object)agan.a, 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
}
