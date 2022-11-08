import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lwx extends IOException implements zbb
{
    private final String a;
    
    public lwx(final String s, final Exception ex) {
        super(s, ex);
        this.a = "file";
    }
    
    public final String a(final boolean b) {
        return this.a;
    }
    
    public final String b() {
        return this.getMessage();
    }
}
