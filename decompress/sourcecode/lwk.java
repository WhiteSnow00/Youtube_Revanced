import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public class lwk extends IOException implements zbb
{
    public lwk(final String s) {
        super(s);
    }
    
    public lwk(final String s, final Throwable t) {
        super(s, t);
    }
    
    public lwk(final Throwable t) {
        super(t);
    }
    
    public final String a(final boolean b) {
        return "cache.exception";
    }
    
    public final String b() {
        return "m.".concat(String.valueOf(this.getMessage()));
    }
}
