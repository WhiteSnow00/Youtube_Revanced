import java.math.BigInteger;
import java.security.PublicKey;
import java.security.Principal;
import java.util.Set;
import java.util.Date;
import java.security.cert.X509Certificate;

// 
// Decompiled by Procyon v0.6.0
// 

class das extends X509Certificate
{
    private final X509Certificate a;
    
    public das(final X509Certificate a) {
        this.a = a;
    }
    
    @Override
    public final void checkValidity() {
        this.a.checkValidity();
    }
    
    @Override
    public final void checkValidity(final Date date) {
        this.a.checkValidity(date);
    }
    
    @Override
    public final int getBasicConstraints() {
        return this.a.getBasicConstraints();
    }
    
    @Override
    public final Set getCriticalExtensionOIDs() {
        return this.a.getCriticalExtensionOIDs();
    }
    
    @Override
    public byte[] getEncoded() {
        return this.a.getEncoded();
    }
    
    @Override
    public final byte[] getExtensionValue(final String s) {
        return this.a.getExtensionValue(s);
    }
    
    @Override
    public final Principal getIssuerDN() {
        return this.a.getIssuerDN();
    }
    
    @Override
    public final boolean[] getIssuerUniqueID() {
        return this.a.getIssuerUniqueID();
    }
    
    @Override
    public final boolean[] getKeyUsage() {
        return this.a.getKeyUsage();
    }
    
    @Override
    public final Set getNonCriticalExtensionOIDs() {
        return this.a.getNonCriticalExtensionOIDs();
    }
    
    @Override
    public final Date getNotAfter() {
        return this.a.getNotAfter();
    }
    
    @Override
    public final Date getNotBefore() {
        return this.a.getNotBefore();
    }
    
    @Override
    public final PublicKey getPublicKey() {
        return this.a.getPublicKey();
    }
    
    @Override
    public final BigInteger getSerialNumber() {
        return this.a.getSerialNumber();
    }
    
    @Override
    public final String getSigAlgName() {
        return this.a.getSigAlgName();
    }
    
    @Override
    public final String getSigAlgOID() {
        return this.a.getSigAlgOID();
    }
    
    @Override
    public final byte[] getSigAlgParams() {
        return this.a.getSigAlgParams();
    }
    
    @Override
    public final byte[] getSignature() {
        return this.a.getSignature();
    }
    
    @Override
    public final Principal getSubjectDN() {
        return this.a.getSubjectDN();
    }
    
    @Override
    public final boolean[] getSubjectUniqueID() {
        return this.a.getSubjectUniqueID();
    }
    
    @Override
    public final byte[] getTBSCertificate() {
        return this.a.getTBSCertificate();
    }
    
    @Override
    public final int getVersion() {
        return this.a.getVersion();
    }
    
    @Override
    public final boolean hasUnsupportedCriticalExtension() {
        return this.a.hasUnsupportedCriticalExtension();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
    
    @Override
    public final void verify(final PublicKey publicKey) {
        this.a.verify(publicKey);
    }
    
    @Override
    public final void verify(final PublicKey publicKey, final String s) {
        this.a.verify(publicKey, s);
    }
}
