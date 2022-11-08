import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class afzh extends afyi
{
    public afzh(final Class clazz) {
        super(clazz);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", afzi.k(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", afzi.k(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", afzi.k(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", afzi.k(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", afzi.k(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", afzi.k(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", afzi.k(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", afzi.k(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", afzi.k(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", afzi.k(64, 64, 6, 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
}
