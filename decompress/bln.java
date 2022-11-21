import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bln extends IOException
{
    public final bbr a;
    public final long b;
    
    public bln(final bbr a, final long b, final Throwable t) {
        super(t);
        this.a = a;
        this.b = b;
    }
}
