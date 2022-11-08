import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agdm implements afvj
{
    public final ECPrivateKey a;
    public final String b;
    public final int c;
    
    public agdm(final ECPrivateKey a, final int n, final int c) {
        if (aesy.ao(2)) {
            this.a = a;
            this.b = aety.w(n);
            this.c = c;
            return;
        }
        throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
    }
}
