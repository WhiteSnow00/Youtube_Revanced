import java.security.spec.KeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.KeyFactory;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agex extends agaq
{
    public agex(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ Object a(final MessageLite messageLite) {
        final agea agea = (agea)messageLite;
        final KeyFactory keyFactory = (KeyFactory)agga.g.a("RSA");
        final byte[] i = agea.d.I();
        final int n = 1;
        final RSAPublicKey rsaPublicKey = (RSAPublicKey)keyFactory.generatePublic(new RSAPublicKeySpec(new BigInteger(1, i), new BigInteger(1, agea.e.I())));
        agdy agdy;
        if ((agdy = agea.c) == null) {
            agdy = agdy.a;
        }
        int e = aeuz.E(agdy.b);
        if (e == 0) {
            e = n;
        }
        return new aggm(rsaPublicKey, aevy.ab(e));
    }
}
