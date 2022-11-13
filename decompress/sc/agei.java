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

final class agei extends agaj
{
    public agei(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        agcq c;
        if ((c = ((agcp)messageLite).b) == null) {
            c = agcq.a;
        }
        int g;
        if ((g = aeuz.G(c.c)) == 0) {
            g = 1;
        }
        final KeyPair l = aevy.L(aevy.Z(g));
        final ECPublicKey ecPublicKey = (ECPublicKey)l.getPublic();
        final ECPrivateKey ecPrivateKey = (ECPrivateKey)l.getPrivate();
        final ECPoint w = ecPublicKey.getW();
        final ahaz builder = ((ahbh)agcs.a).createBuilder();
        builder.copyOnWrite();
        ((agcs)builder.instance).b = 0;
        builder.copyOnWrite();
        final agcs agcs = (agcs)builder.instance;
        c.getClass();
        agcs.c = c;
        final ahab x = ahab.x(w.getAffineX().toByteArray());
        builder.copyOnWrite();
        ((agcs)builder.instance).d = x;
        final ahab x2 = ahab.x(w.getAffineY().toByteArray());
        builder.copyOnWrite();
        ((agcs)builder.instance).e = x2;
        final agcs c2 = (agcs)builder.build();
        final ahaz builder2 = ((ahbh)agcr.a).createBuilder();
        builder2.copyOnWrite();
        ((agcr)builder2.instance).b = 0;
        builder2.copyOnWrite();
        final agcr agcr = (agcr)builder2.instance;
        c2.getClass();
        agcr.c = c2;
        final ahab x3 = ahab.x(ecPrivateKey.getS().toByteArray());
        builder2.copyOnWrite();
        ((agcr)builder2.instance).d = x3;
        return (MessageLite)builder2.build();
    }
    
    public final /* bridge */ MessageLite b(final ahab ahab) {
        return (MessageLite)ahbh.parseFrom((ahbh)agcp.a, ahab, ExtensionRegistryLite.a);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("ECDSA_P256", agej.g(5, 4, 4, 1));
        hashMap.put("ECDSA_P256_IEEE_P1363", agej.g(5, 4, 3, 1));
        hashMap.put("ECDSA_P256_RAW", agej.g(5, 4, 3, 3));
        hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", agej.g(5, 4, 3, 3));
        hashMap.put("ECDSA_P384", agej.g(6, 5, 4, 1));
        hashMap.put("ECDSA_P384_IEEE_P1363", agej.g(6, 5, 3, 1));
        hashMap.put("ECDSA_P384_SHA512", agej.g(6, 5, 4, 1));
        hashMap.put("ECDSA_P384_SHA384", agej.g(4, 5, 4, 1));
        hashMap.put("ECDSA_P521", agej.g(6, 6, 4, 1));
        hashMap.put("ECDSA_P521_IEEE_P1363", agej.g(6, 6, 3, 1));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        agcq agcq;
        if ((agcq = ((agcp)messageLite).b) == null) {
            agcq = agcq.a;
        }
        aevy.W(agcq);
    }
}
