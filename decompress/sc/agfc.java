import java.security.spec.KeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.KeyFactory;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agfc extends agaq
{
    public agfc(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ Object a(final MessageLite messageLite) {
        final agee agee = (agee)messageLite;
        final KeyFactory keyFactory = (KeyFactory)agga.g.a("RSA");
        final byte[] i = agee.d.I();
        final int n = 1;
        final RSAPublicKey rsaPublicKey = (RSAPublicKey)keyFactory.generatePublic(new RSAPublicKeySpec(new BigInteger(1, i), new BigInteger(1, agee.e.I())));
        agec agec;
        if ((agec = agee.c) == null) {
            agec = agec.a;
        }
        int e;
        if ((e = aeuz.E(agec.b)) == 0) {
            e = 1;
        }
        final int ab = aevy.ab(e);
        int e2 = aeuz.E(agec.c);
        if (e2 == 0) {
            e2 = n;
        }
        return new aggo(rsaPublicKey, ab, aevy.ab(e2), agec.d);
    }
}
