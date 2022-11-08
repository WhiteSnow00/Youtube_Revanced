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

final class agch extends afyi
{
    public agch(final Class clazz) {
        super(clazz);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("ECDSA_P256", agci.g(5, 4, 4, 1));
        hashMap.put("ECDSA_P256_IEEE_P1363", agci.g(5, 4, 3, 1));
        hashMap.put("ECDSA_P256_RAW", agci.g(5, 4, 3, 3));
        hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", agci.g(5, 4, 3, 3));
        hashMap.put("ECDSA_P384", agci.g(6, 5, 4, 1));
        hashMap.put("ECDSA_P384_IEEE_P1363", agci.g(6, 5, 3, 1));
        hashMap.put("ECDSA_P384_SHA512", agci.g(6, 5, 4, 1));
        hashMap.put("ECDSA_P384_SHA384", agci.g(4, 5, 4, 1));
        hashMap.put("ECDSA_P521", agci.g(6, 6, 4, 1));
        hashMap.put("ECDSA_P521_IEEE_P1363", agci.g(6, 6, 3, 1));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
}
