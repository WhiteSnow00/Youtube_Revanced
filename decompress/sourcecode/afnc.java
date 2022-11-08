import java.util.logging.Logger;
import java.util.logging.Level;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afnc implements afne
{
    static final afnc a;
    
    static {
        a = new afnc();
    }
    
    public afnc() {
    }
    
    public final void a(final Closeable closeable, final Throwable t, final Throwable t2) {
        final Logger a = afnb.a;
        final Level warning = Level.WARNING;
        new StringBuilder("Suppressing exception thrown when closing ").append(closeable);
        a.logp(warning, "com.google.common.io.Closer$LoggingSuppressor", "suppress", "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), t2);
    }
}
