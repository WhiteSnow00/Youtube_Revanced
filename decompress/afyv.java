import java.util.Iterator;
import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afyv
{
    private static final CopyOnWriteArrayList a;
    
    static {
        a = new CopyOnWriteArrayList();
    }
    
    public static afyu a(final String s) {
        for (final afyu afyu : afyv.a) {
            if (afyu.a()) {
                return afyu;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(s)));
    }
}
