import android.system.OsConstants;
import android.system.ErrnoException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbw
{
    public static boolean a(final Throwable t) {
        return t instanceof ErrnoException && ((ErrnoException)t).errno == OsConstants.EACCES;
    }
    
    @Deprecated
    public static void b(final bei bei) {
        if (bei instanceof bew) {
            ((bew)bei).C = false;
        }
    }
}
