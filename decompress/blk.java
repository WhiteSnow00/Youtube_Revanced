import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blk extends IOException
{
    public final bbp a;
    public final long b;
    
    public blk(final bbp a, final long b, final Throwable t) {
        super(t);
        this.a = a;
        this.b = b;
    }
}
