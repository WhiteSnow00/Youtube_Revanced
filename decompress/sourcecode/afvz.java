import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class afvz extends afyi
{
    public afvz(final Class clazz) {
        super(clazz);
    }
    
    @Override
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", afwa.g(16, 1));
        hashMap.put("AES128_GCM_RAW", afwa.g(16, 3));
        hashMap.put("AES256_GCM", afwa.g(32, 1));
        hashMap.put("AES256_GCM_RAW", afwa.g(32, 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
}
