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

final class agez extends agaq
{
    public agez(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ Object a(final MessageLite messageLite) {
        final aged aged = (aged)messageLite;
        final KeyFactory keyFactory = (KeyFactory)agga.g.a("RSA");
        agee agee;
        if ((agee = aged.c) == null) {
            agee = agee.a;
        }
        final byte[] i = agee.d.I();
        final int n = 1;
        final BigInteger bigInteger = new BigInteger(1, i);
        agee agee2;
        if ((agee2 = aged.c) == null) {
            agee2 = agee.a;
        }
        final RSAPrivateCrtKey rsaPrivateCrtKey = (RSAPrivateCrtKey)keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, new BigInteger(1, agee2.e.I()), new BigInteger(1, aged.d.I()), new BigInteger(1, aged.e.I()), new BigInteger(1, aged.f.I()), new BigInteger(1, aged.g.I()), new BigInteger(1, aged.h.I()), new BigInteger(1, aged.i.I())));
        agee agee3;
        if ((agee3 = aged.c) == null) {
            agee3 = agee.a;
        }
        agec agec;
        if ((agec = agee3.c) == null) {
            agec = agec.a;
        }
        agee agee4;
        if ((agee4 = aged.c) == null) {
            agee4 = agee.a;
        }
        final BigInteger bigInteger2 = new BigInteger(1, agee4.d.I());
        agee agee5;
        if ((agee5 = aged.c) == null) {
            agee5 = agee.a;
        }
        final RSAPublicKey rsaPublicKey = (RSAPublicKey)keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger2, new BigInteger(1, agee5.e.I())));
        int e;
        if ((e = aeuz.E(agec.b)) == 0) {
            e = 1;
        }
        final int ab = aevy.ab(e);
        int e2;
        if ((e2 = aeuz.E(agec.c)) == 0) {
            e2 = 1;
        }
        aggp.c(rsaPrivateCrtKey, rsaPublicKey, ab, aevy.ab(e2), agec.d);
        int e3;
        if ((e3 = aeuz.E(agec.b)) == 0) {
            e3 = 1;
        }
        final int ab2 = aevy.ab(e3);
        int e4 = aeuz.E(agec.c);
        if (e4 == 0) {
            e4 = n;
        }
        return new aggn(rsaPrivateCrtKey, ab2, aevy.ab(e4), agec.d);
    }
}
