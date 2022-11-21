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

final class agbc extends agcb
{
    public agbc(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        final agem agem = (agem)messageLite;
        agen agen;
        if ((agen = agem.b) == null) {
            agen = agen.a;
        }
        ageq ageq;
        if ((ageq = agen.b) == null) {
            ageq = ageq.a;
        }
        int p;
        if ((p = aewr.p(ageq.b)) == 0) {
            p = 1;
        }
        final KeyPair c = aexq.C(aewr.A(p));
        final ECPublicKey ecPublicKey = (ECPublicKey)c.getPublic();
        final ECPrivateKey ecPrivateKey = (ECPrivateKey)c.getPrivate();
        final ECPoint w = ecPublicKey.getW();
        final ahcr builder = ((ahcz)agep.a).createBuilder();
        builder.copyOnWrite();
        ((agep)builder.instance).b = 0;
        agen c2;
        if ((c2 = agem.b) == null) {
            c2 = agen.a;
        }
        builder.copyOnWrite();
        final agep agep = (agep)builder.instance;
        c2.getClass();
        agep.c = c2;
        final ahbt x = ahbt.x(w.getAffineX().toByteArray());
        builder.copyOnWrite();
        ((agep)builder.instance).d = x;
        final ahbt x2 = ahbt.x(w.getAffineY().toByteArray());
        builder.copyOnWrite();
        ((agep)builder.instance).e = x2;
        final agep c3 = (agep)builder.build();
        final ahcr builder2 = ((ahcz)ageo.a).createBuilder();
        builder2.copyOnWrite();
        ((ageo)builder2.instance).b = 0;
        builder2.copyOnWrite();
        final ageo ageo = (ageo)builder2.instance;
        c3.getClass();
        ageo.c = c3;
        final ahbt x3 = ahbt.x(ecPrivateKey.getS().toByteArray());
        builder2.copyOnWrite();
        ((ageo)builder2.instance).d = x3;
        return (MessageLite)builder2.build();
    }
    
    public final /* bridge */ MessageLite b(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)agem.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", agbd.g(3, aewr.L("AES128_GCM"), agbd.a, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", agbd.g(3, aewr.L("AES128_GCM"), agbd.a, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", agbd.g(4, aewr.L("AES128_GCM"), agbd.a, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", agbd.g(4, aewr.L("AES128_GCM"), agbd.a, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", agbd.g(4, aewr.L("AES128_GCM"), agbd.a, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", agbd.g(3, aewr.L("AES128_CTR_HMAC_SHA256"), agbd.a, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", agbd.g(3, aewr.L("AES128_CTR_HMAC_SHA256"), agbd.a, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", agbd.g(4, aewr.L("AES128_CTR_HMAC_SHA256"), agbd.a, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", agbd.g(4, aewr.L("AES128_CTR_HMAC_SHA256"), agbd.a, 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        agen agen;
        if ((agen = ((agem)messageLite).b) == null) {
            agen = agen.a;
        }
        aewr.y(agen);
    }
}
