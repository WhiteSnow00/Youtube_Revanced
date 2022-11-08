import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import java.security.KeyPair;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agcz extends afyi
{
    public agcz(final Class clazz) {
        super(clazz);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("RSA_SSA_PSS_3072_SHA256_F4", new ardu(agda.g(5, 5, 32, 3072, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", new ardu(agda.g(5, 5, 32, 3072, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", new ardu(agda.g(5, 5, 32, 3072, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PSS_4096_SHA512_F4", new ardu(agda.g(6, 6, 64, 4096, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", new ardu(agda.g(6, 6, 64, 4096, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", new ardu(agda.g(6, 6, 64, 4096, RSAKeyGenParameterSpec.F4), 1));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
}
