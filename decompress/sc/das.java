import java.security.cert.X509Certificate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class das extends dat
{
    private final byte[] a;
    
    public das(final X509Certificate x509Certificate, final byte[] a) {
        super(x509Certificate);
        this.a = a;
    }
    
    @Override
    public final byte[] getEncoded() {
        return this.a;
    }
}
