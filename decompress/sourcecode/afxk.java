import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import java.security.spec.ECPoint;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class afxk extends afyi
{
    public afxk(final Class clazz) {
        super(clazz);
    }
    
    @Override
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", afxl.g(3, afva.H("AES128_GCM"), afxl.a, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", afxl.g(3, afva.H("AES128_GCM"), afxl.a, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", afxl.g(4, afva.H("AES128_GCM"), afxl.a, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", afxl.g(4, afva.H("AES128_GCM"), afxl.a, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", afxl.g(4, afva.H("AES128_GCM"), afxl.a, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", afxl.g(3, afva.H("AES128_CTR_HMAC_SHA256"), afxl.a, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", afxl.g(3, afva.H("AES128_CTR_HMAC_SHA256"), afxl.a, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", afxl.g(4, afva.H("AES128_CTR_HMAC_SHA256"), afxl.a, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", afxl.g(4, afva.H("AES128_CTR_HMAC_SHA256"), afxl.a, 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
}
