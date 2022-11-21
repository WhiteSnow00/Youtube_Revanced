import java.io.IOException;
import android.system.OsConstants;
import android.system.ErrnoException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbz
{
    public static boolean a(final Throwable t) {
        return t instanceof ErrnoException && ((ErrnoException)t).errno == OsConstants.EACCES;
    }
    
    public static void b(final bbn bbn) {
        if (bbn == null) {
            return;
        }
        try {
            bbn.f();
        }
        catch (final IOException ex) {}
    }
}
