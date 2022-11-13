import java.security.GeneralSecurityException;
import java.security.spec.KeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aggl implements afxk
{
    public final RSAPrivateCrtKey a;
    public final RSAPublicKey b;
    public final String c;
    
    public aggl(final RSAPrivateCrtKey a, final int n) {
        if (aeuz.T(2)) {
            final int a2 = aggq.a;
            aggq.b(a.getModulus().bitLength());
            aggq.c(a.getPublicExponent());
            this.a = a;
            this.c = aevy.B(n).concat("withRSA");
            this.b = (RSAPublicKey)((KeyFactory)agga.g.a("RSA")).generatePublic(new RSAPublicKeySpec(a.getModulus(), a.getPublicExponent()));
            return;
        }
        throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
    }
}
