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

final class agev extends agaj
{
    public agev(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        final agdx agdx = (agdx)messageLite;
        agdy c;
        if ((c = agdx.b) == null) {
            c = agdy.a;
        }
        final KeyPairGenerator keyPairGenerator = (KeyPairGenerator)agga.f.a("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(agdx.c, new BigInteger(1, agdx.d.I())));
        final KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        final RSAPublicKey rsaPublicKey = (RSAPublicKey)generateKeyPair.getPublic();
        final RSAPrivateCrtKey rsaPrivateCrtKey = (RSAPrivateCrtKey)generateKeyPair.getPrivate();
        final ahaz builder = ((ahbh)agea.a).createBuilder();
        builder.copyOnWrite();
        ((agea)builder.instance).b = 0;
        builder.copyOnWrite();
        final agea agea = (agea)builder.instance;
        c.getClass();
        agea.c = c;
        final ahab x = ahab.x(rsaPublicKey.getPublicExponent().toByteArray());
        builder.copyOnWrite();
        ((agea)builder.instance).e = x;
        final ahab x2 = ahab.x(rsaPublicKey.getModulus().toByteArray());
        builder.copyOnWrite();
        ((agea)builder.instance).d = x2;
        final agea c2 = (agea)builder.build();
        final ahaz builder2 = ((ahbh)agdz.a).createBuilder();
        builder2.copyOnWrite();
        ((agdz)builder2.instance).b = 0;
        builder2.copyOnWrite();
        final agdz agdz = (agdz)builder2.instance;
        c2.getClass();
        agdz.c = c2;
        final ahab x3 = ahab.x(rsaPrivateCrtKey.getPrivateExponent().toByteArray());
        builder2.copyOnWrite();
        ((agdz)builder2.instance).d = x3;
        final ahab x4 = ahab.x(rsaPrivateCrtKey.getPrimeP().toByteArray());
        builder2.copyOnWrite();
        ((agdz)builder2.instance).e = x4;
        final ahab x5 = ahab.x(rsaPrivateCrtKey.getPrimeQ().toByteArray());
        builder2.copyOnWrite();
        ((agdz)builder2.instance).f = x5;
        final ahab x6 = ahab.x(rsaPrivateCrtKey.getPrimeExponentP().toByteArray());
        builder2.copyOnWrite();
        ((agdz)builder2.instance).g = x6;
        final ahab x7 = ahab.x(rsaPrivateCrtKey.getPrimeExponentQ().toByteArray());
        builder2.copyOnWrite();
        ((agdz)builder2.instance).h = x7;
        final ahab x8 = ahab.x(rsaPrivateCrtKey.getCrtCoefficient().toByteArray());
        builder2.copyOnWrite();
        ((agdz)builder2.instance).i = x8;
        return (MessageLite)builder2.build();
    }
    
    public final /* bridge */ MessageLite b(final ahab ahab) {
        return (MessageLite)ahbh.parseFrom((ahbh)agdx.a, ahab, ExtensionRegistryLite.a);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4", new argj((Object)agew.g(5, 3072, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", new argj((Object)agew.g(5, 3072, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", new argj((Object)agew.g(5, 3072, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4", new argj((Object)agew.g(6, 4096, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", new argj((Object)agew.g(6, 4096, RSAKeyGenParameterSpec.F4), 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        final agdx agdx = (agdx)messageLite;
        agdy agdy;
        if ((agdy = agdx.b) == null) {
            agdy = agdy.a;
        }
        aevy.X(agdy);
        aggq.b(agdx.c);
        aggq.c(new BigInteger(1, agdx.d.I()));
    }
}
