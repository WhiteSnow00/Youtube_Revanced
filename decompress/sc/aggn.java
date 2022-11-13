import java.security.GeneralSecurityException;
import java.security.spec.KeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aggn implements afxk
{
    public final RSAPrivateCrtKey a;
    public final RSAPublicKey b;
    public final int c;
    public final int d;
    public final int e;
    
    public aggn(final RSAPrivateCrtKey a, final int d, final int e, final int c) {
        if (aeuz.T(2)) {
            final int a2 = aggq.a;
            aggq.b(a.getModulus().bitLength());
            aggq.c(a.getPublicExponent());
            this.a = a;
            this.b = (RSAPublicKey)((KeyFactory)agga.g.a("RSA")).generatePublic(new RSAPublicKeySpec(a.getModulus(), a.getPublicExponent()));
            this.d = d;
            this.e = e;
            this.c = c;
            return;
        }
        throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
    }
}