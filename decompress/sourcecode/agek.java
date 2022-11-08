import java.security.GeneralSecurityException;
import java.security.spec.KeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agek implements afvj
{
    public final RSAPrivateCrtKey a;
    public final RSAPublicKey b;
    public final String c;
    
    public agek(final RSAPrivateCrtKey a, final int n) {
        if (aesy.ao(2)) {
            final int a2 = agep.a;
            agep.b(a.getModulus().bitLength());
            agep.c(a.getPublicExponent());
            this.a = a;
            this.c = aety.A(n).concat("withRSA");
            this.b = (RSAPublicKey)((KeyFactory)agdz.g.a("RSA")).generatePublic(new RSAPublicKeySpec(a.getModulus(), a.getPublicExponent()));
            return;
        }
        throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
    }
}
