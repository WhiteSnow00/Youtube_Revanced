import java.security.GeneralSecurityException;
import javax.crypto.Mac;

// 
// Decompiled by Procyon v0.6.0
// 

final class agef extends ThreadLocal
{
    final /* synthetic */ ageg a;
    
    public agef(final ageg a) {
        this.a = a;
    }
    
    protected final Mac a() {
        try {
            final Mac mac = (Mac)agdz.b.a(this.a.a);
            mac.init(this.a.b);
            return mac;
        }
        catch (final GeneralSecurityException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
