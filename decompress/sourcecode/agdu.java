import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agdu implements afvj
{
    private final byte[] a;
    
    public agdu(byte[] e) {
        if (!aesy.ao(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (e.length == 32) {
            e = agds.e(e);
            agds.f(this.a = e);
            return;
        }
        throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
    }
}
