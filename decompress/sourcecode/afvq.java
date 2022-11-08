import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class afvq extends afyi
{
    public afvq(final Class clazz) {
        super(clazz);
    }
    
    @Override
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", afvr.g(16, 16, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", afvr.g(16, 16, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", afvr.g(32, 32, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", afvr.g(32, 32, 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
}
