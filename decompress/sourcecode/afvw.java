import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class afvw extends afyi
{
    public afvw(final Class clazz) {
        super(clazz);
    }
    
    @Override
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", afvx.g(16, 1));
        hashMap.put("AES128_EAX_RAW", afvx.g(16, 3));
        hashMap.put("AES256_EAX", afvx.g(32, 1));
        hashMap.put("AES256_EAX_RAW", afvx.g(32, 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
}
