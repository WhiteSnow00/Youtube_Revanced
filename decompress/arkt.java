import java.util.logging.Level;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arkt extends arkw
{
    final Logger a;
    
    public arkt(final String s) {
        this.a = Logger.getLogger(s);
    }
    
    @Override
    public final void a(final String s) {
        this.a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", s);
    }
    
    @Override
    public final void b(final String s) {
        this.a.logp(Level.SEVERE, "com.googlecode.mp4parser.util.JuliLogger", "logError", s);
    }
    
    @Override
    public final void c(final String s) {
        this.a.logp(Level.WARNING, "com.googlecode.mp4parser.util.JuliLogger", "logWarn", s);
    }
}
