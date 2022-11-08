import java.util.Iterator;
import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afvd
{
    private static final CopyOnWriteArrayList a;
    
    static {
        a = new CopyOnWriteArrayList();
    }
    
    public static afvc a(final String s) {
        for (final afvc afvc : afvd.a) {
            if (afvc.a()) {
                return afvc;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(s)));
    }
}
