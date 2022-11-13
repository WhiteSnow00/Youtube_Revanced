import java.io.InputStream;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atzp
{
    static {
        Logger.getLogger("okio.Okio");
    }
    
    public static final atzx a(final InputStream inputStream) {
        inputStream.getClass();
        return (atzx)new atzo(inputStream);
    }
    
    public static final boolean b(final AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            final String message = assertionError.getMessage();
            if (message != null && asfn.l(message, "getsockname failed")) {
                return true;
            }
        }
        return false;
    }
}
