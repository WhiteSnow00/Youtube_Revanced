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

final class agfa extends agaj
{
    public agfa(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ MessageLite a(final MessageLite messageLite) {
        final ageb ageb = (ageb)messageLite;
        agec c;
        if ((c = ageb.b) == null) {
            c = agec.a;
        }
        aggq.b(ageb.c);
        int e;
        if ((e = aeuz.E(c.b)) == 0) {
            e = 1;
        }
        aevy.ab(e);
        final KeyPairGenerator keyPairGenerator = (KeyPairGenerator)agga.f.a("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(ageb.c, new BigInteger(1, ageb.d.I())));
        final KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        final RSAPublicKey rsaPublicKey = (RSAPublicKey)generateKeyPair.getPublic();
        final RSAPrivateCrtKey rsaPrivateCrtKey = (RSAPrivateCrtKey)generateKeyPair.getPrivate();
        final ahaz builder = agee.a.createBuilder();
        builder.copyOnWrite();
        ((agee)builder.instance).b = 0;
        builder.copyOnWrite();
        final agee agee = (agee)builder.instance;
        c.getClass();
        agee.c = c;
        final ahab x = ahab.x(rsaPublicKey.getPublicExponent().toByteArray());
        builder.copyOnWrite();
        ((agee)builder.instance).e = x;
        final ahab x2 = ahab.x(rsaPublicKey.getModulus().toByteArray());
        builder.copyOnWrite();
        ((agee)builder.instance).d = x2;
        final agee c2 = (agee)builder.build();
        final ahaz builder2 = aged.a.createBuilder();
        builder2.copyOnWrite();
        ((aged)builder2.instance).b = 0;
        builder2.copyOnWrite();
        final aged aged = (aged)builder2.instance;
        c2.getClass();
        aged.c = c2;
        final ahab x3 = ahab.x(rsaPrivateCrtKey.getPrivateExponent().toByteArray());
        builder2.copyOnWrite();
        ((aged)builder2.instance).d = x3;
        final ahab x4 = ahab.x(rsaPrivateCrtKey.getPrimeP().toByteArray());
        builder2.copyOnWrite();
        ((aged)builder2.instance).e = x4;
        final ahab x5 = ahab.x(rsaPrivateCrtKey.getPrimeQ().toByteArray());
        builder2.copyOnWrite();
        ((aged)builder2.instance).f = x5;
        final ahab x6 = ahab.x(rsaPrivateCrtKey.getPrimeExponentP().toByteArray());
        builder2.copyOnWrite();
        ((aged)builder2.instance).g = x6;
        final ahab x7 = ahab.x(rsaPrivateCrtKey.getPrimeExponentQ().toByteArray());
        builder2.copyOnWrite();
        ((aged)builder2.instance).h = x7;
        final ahab x8 = ahab.x(rsaPrivateCrtKey.getCrtCoefficient().toByteArray());
        builder2.copyOnWrite();
        ((aged)builder2.instance).i = x8;
        return (MessageLite)builder2.build();
    }
    
    public final /* bridge */ MessageLite b(final ahab ahab) {
        return (MessageLite)ahbh.parseFrom((ahbh)ageb.a, ahab, ExtensionRegistryLite.a);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("RSA_SSA_PSS_3072_SHA256_F4", new argj((Object)agfb.g(5, 5, 32, 3072, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", new argj((Object)agfb.g(5, 5, 32, 3072, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", new argj((Object)agfb.g(5, 5, 32, 3072, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PSS_4096_SHA512_F4", new argj((Object)agfb.g(6, 6, 64, 4096, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", new argj((Object)agfb.g(6, 6, 64, 4096, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", new argj((Object)agfb.g(6, 6, 64, 4096, RSAKeyGenParameterSpec.F4), 1));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final /* bridge */ void d(final MessageLite messageLite) {
        final ageb ageb = (ageb)messageLite;
        agec agec;
        if ((agec = ageb.b) == null) {
            agec = agec.a;
        }
        aevy.Y(agec);
        aggq.b(ageb.c);
        aggq.c(new BigInteger(1, ageb.d.I()));
    }
}
