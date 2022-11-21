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

final class agga extends agcb
{
    public agga(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        agei c;
        if ((c = ((ageh)messageLite).b) == null) {
            c = agei.a;
        }
        int p;
        if ((p = aewr.p(c.c)) == 0) {
            p = 1;
        }
        final KeyPair c2 = aexq.C(aexq.Q(p));
        final ECPublicKey ecPublicKey = (ECPublicKey)c2.getPublic();
        final ECPrivateKey ecPrivateKey = (ECPrivateKey)c2.getPrivate();
        final ECPoint w = ecPublicKey.getW();
        final ahcr builder = ((ahcz)agek.a).createBuilder();
        builder.copyOnWrite();
        ((agek)builder.instance).b = 0;
        builder.copyOnWrite();
        final agek agek = (agek)builder.instance;
        c.getClass();
        agek.c = c;
        final ahbt x = ahbt.x(w.getAffineX().toByteArray());
        builder.copyOnWrite();
        ((agek)builder.instance).d = x;
        final ahbt x2 = ahbt.x(w.getAffineY().toByteArray());
        builder.copyOnWrite();
        ((agek)builder.instance).e = x2;
        final agek c3 = (agek)builder.build();
        final ahcr builder2 = ((ahcz)agej.a).createBuilder();
        builder2.copyOnWrite();
        ((agej)builder2.instance).b = 0;
        builder2.copyOnWrite();
        final agej agej = (agej)builder2.instance;
        c3.getClass();
        agej.c = c3;
        final ahbt x3 = ahbt.x(ecPrivateKey.getS().toByteArray());
        builder2.copyOnWrite();
        ((agej)builder2.instance).d = x3;
        return (MessageLite)builder2.build();
    }
    
    public final /* bridge */ MessageLite b(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)ageh.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("ECDSA_P256", aggb.g(5, 4, 4, 1));
        hashMap.put("ECDSA_P256_IEEE_P1363", aggb.g(5, 4, 3, 1));
        hashMap.put("ECDSA_P256_RAW", aggb.g(5, 4, 3, 3));
        hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", aggb.g(5, 4, 3, 3));
        hashMap.put("ECDSA_P384", aggb.g(6, 5, 4, 1));
        hashMap.put("ECDSA_P384_IEEE_P1363", aggb.g(6, 5, 3, 1));
        hashMap.put("ECDSA_P384_SHA512", aggb.g(6, 5, 4, 1));
        hashMap.put("ECDSA_P384_SHA384", aggb.g(4, 5, 4, 1));
        hashMap.put("ECDSA_P521", aggb.g(6, 6, 4, 1));
        hashMap.put("ECDSA_P521_IEEE_P1363", aggb.g(6, 6, 3, 1));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        agei agei;
        if ((agei = ((ageh)messageLite).b) == null) {
            agei = agei.a;
        }
        aexq.N(agei);
    }
}
