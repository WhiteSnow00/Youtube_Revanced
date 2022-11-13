import java.security.spec.RSAPublicKeySpec;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.KeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.interfaces.RSAPrivateCrtKey;
import java.math.BigInteger;
import java.security.KeyFactory;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class ageu extends agaq
{
    public ageu(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ Object a(final MessageLite messageLite) {
        final agdz agdz = (agdz)messageLite;
        final KeyFactory keyFactory = (KeyFactory)agga.g.a("RSA");
        agea agea;
        if ((agea = agdz.c) == null) {
            agea = agea.a;
        }
        final byte[] i = agea.d.I();
        final int n = 1;
        final BigInteger bigInteger = new BigInteger(1, i);
        agea agea2;
        if ((agea2 = agdz.c) == null) {
            agea2 = agea.a;
        }
        final RSAPrivateCrtKey rsaPrivateCrtKey = (RSAPrivateCrtKey)keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, new BigInteger(1, agea2.e.I()), new BigInteger(1, agdz.d.I()), new BigInteger(1, agdz.e.I()), new BigInteger(1, agdz.f.I()), new BigInteger(1, agdz.g.I()), new BigInteger(1, agdz.h.I()), new BigInteger(1, agdz.i.I())));
        agea agea3;
        if ((agea3 = agdz.c) == null) {
            agea3 = agea.a;
        }
        agdy agdy;
        if ((agdy = agea3.c) == null) {
            agdy = agdy.a;
        }
        agea agea4;
        if ((agea4 = agdz.c) == null) {
            agea4 = agea.a;
        }
        final BigInteger bigInteger2 = new BigInteger(1, agea4.d.I());
        agea agea5;
        if ((agea5 = agdz.c) == null) {
            agea5 = agea.a;
        }
        final RSAPublicKey rsaPublicKey = (RSAPublicKey)keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger2, new BigInteger(1, agea5.e.I())));
        int e;
        if ((e = aeuz.E(agdy.b)) == 0) {
            e = 1;
        }
        aggp.b(rsaPrivateCrtKey, rsaPublicKey, aevy.ab(e));
        int e2 = aeuz.E(agdy.b);
        if (e2 == 0) {
            e2 = n;
        }
        return new aggl(rsaPrivateCrtKey, aevy.ab(e2));
    }
}
