import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public class azb extends IOException
{
    public final boolean a;
    public final int b;
    
    protected azb(final String s, final Throwable t, final boolean a, final int b) {
        super(s, t);
        this.a = a;
        this.b = b;
    }
    
    public static azb a(final String s, final Throwable t) {
        return new azb(s, t, true, 1);
    }
    
    public static azb b(final String s, final Throwable t) {
        return new azb(s, t, true, 0);
    }
    
    public static azb c(final String s, final Throwable t) {
        return new azb(s, t, true, 4);
    }
    
    public static azb d(final String s) {
        return new azb(s, null, false, 1);
    }
}
