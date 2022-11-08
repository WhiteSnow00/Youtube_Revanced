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

final class agcu extends afyi
{
    public agcu(final Class clazz) {
        super(clazz);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4", new ardu(agcv.g(5, 3072, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", new ardu(agcv.g(5, 3072, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", new ardu(agcv.g(5, 3072, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4", new ardu(agcv.g(6, 4096, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", new ardu(agcv.g(6, 4096, RSAKeyGenParameterSpec.F4), 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
}
