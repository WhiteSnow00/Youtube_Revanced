import java.util.logging.Level;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afla implements afks
{
    public final Set a;
    public final afka b;
    private final Level c;
    
    public afla() {
        this(Level.ALL, aflc.a, aflc.b);
    }
    
    public afla(final Level c, final Set a, final afka b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final afjp a(final String s) {
        return (afjp)new aflc(s, this.c, this.a, this.b);
    }
}
