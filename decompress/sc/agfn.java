import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfn implements afxk
{
    public final ECPrivateKey a;
    public final String b;
    public final int c;
    
    public agfn(final ECPrivateKey a, final int n, final int c) {
        if (aeuz.T(2)) {
            this.a = a;
            this.b = aevy.x(n);
            this.c = c;
            return;
        }
        throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
    }
}
