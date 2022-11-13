import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfv implements afxk
{
    private final byte[] a;
    
    public agfv(byte[] e) {
        if (!aeuz.T(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (e.length == 32) {
            e = agft.e(e);
            agft.f(this.a = e);
            return;
        }
        throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
    }
}
