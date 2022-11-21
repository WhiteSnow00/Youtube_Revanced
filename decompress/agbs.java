import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.GeneralSecurityException;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agbs extends agcb
{
    public agbs(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        final agex agex = (agex)messageLite;
        agey agey;
        if ((agey = agex.b) == null) {
            agey = agey.a;
        }
        final int v = aexq.V(agey.b);
        final int n = 1;
        int n2;
        if ((n2 = v) == 0) {
            n2 = 1;
        }
        n2 -= 2;
        byte[] array;
        byte[] array2;
        if (n2 != 1) {
            if (n2 != 2 && n2 != 3 && n2 != 4) {
                throw new GeneralSecurityException("Invalid KEM");
            }
            agey agey2;
            if ((agey2 = agex.b) == null) {
                agey2 = agey.a;
            }
            int v2 = aexq.V(agey2.b);
            if (v2 == 0) {
                v2 = n;
            }
            final int g = agbw.g(v2);
            final KeyPair c = aexq.C(g);
            array = aexq.I(g, ((ECPublicKey)c.getPublic()).getW());
            array2 = ((ECPrivateKey)c.getPrivate()).getS().toByteArray();
        }
        else {
            array2 = aexq.k();
            array = aexq.l(array2);
        }
        final ahcr builder = ((ahcz)agfa.a).createBuilder();
        builder.copyOnWrite();
        ((agfa)builder.instance).b = 0;
        agey c2;
        if ((c2 = agex.b) == null) {
            c2 = agey.a;
        }
        builder.copyOnWrite();
        final agfa agfa = (agfa)builder.instance;
        c2.getClass();
        agfa.c = c2;
        final ahbt x = ahbt.x(array);
        builder.copyOnWrite();
        ((agfa)builder.instance).d = x;
        final agfa c3 = (agfa)builder.build();
        final ahcr builder2 = ((ahcz)agez.a).createBuilder();
        builder2.copyOnWrite();
        ((agez)builder2.instance).b = 0;
        builder2.copyOnWrite();
        final agez agez = (agez)builder2.instance;
        c3.getClass();
        agez.c = c3;
        final ahbt x2 = ahbt.x(array2);
        builder2.copyOnWrite();
        ((agez)builder2.instance).d = x2;
        return (MessageLite)builder2.build();
    }
    
    public final /* bridge */ MessageLite b(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agex.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", agbt.g(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", agbt.g(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", agbt.g(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", agbt.g(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", agbt.g(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", agbt.g(3, 3, 5, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", agbt.g(4, 3, 3, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", agbt.g(4, 3, 3, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", agbt.g(4, 3, 4, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", agbt.g(4, 3, 4, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", agbt.g(5, 4, 3, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", agbt.g(5, 4, 3, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", agbt.g(5, 4, 4, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", agbt.g(5, 4, 4, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", agbt.g(6, 5, 3, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", agbt.g(6, 5, 3, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", agbt.g(6, 5, 4, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", agbt.g(6, 5, 4, 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        agey agey;
        if ((agey = ((agex)messageLite).b) == null) {
            agey = agey.a;
        }
        agbw.a(agey);
    }
}
