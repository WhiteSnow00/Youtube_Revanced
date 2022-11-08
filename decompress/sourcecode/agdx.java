import java.util.Iterator;
import java.security.GeneralSecurityException;
import java.security.Provider;

// 
// Decompiled by Procyon v0.6.0
// 

final class agdx implements agdy
{
    private final ageb a;
    private final /* synthetic */ int b;
    
    public agdx(final ageb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object a(String s) {
        final int b = this.b;
        Throwable t = null;
        if (b == 0) {
            return this.a.a(s, (Provider)null);
        }
        if (b != 1) {
            for (final Provider provider : agdz.b(new String[] { "GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt" })) {
                try {
                    return this.a.a(s, provider);
                }
                catch (final Exception ex) {
                    if (t == null) {
                        t = ex;
                        continue;
                    }
                    continue;
                }
                break;
            }
            throw new GeneralSecurityException("No good Provider found.", t);
        }
        for (final Provider provider2 : agdz.b(new String[] { "GmsCore_OpenSSL", "AndroidOpenSSL" })) {
            try {
                s = (String)this.a.a(s, provider2);
                return s;
            }
            catch (final Exception ex2) {
                continue;
            }
            break;
        }
        s = (String)this.a.a(s, (Provider)null);
        return s;
    }
}
