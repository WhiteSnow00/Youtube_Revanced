import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bcs extends bcb
{
    public final int d;
    
    public bcs(final bbo bbo) {
        super(bbo, 2008, 1);
        this.d = 14;
    }
    
    @Deprecated
    public bcs(final bbo bbo, final byte[] array) {
        super("OnesieRetryingDataSource time out.", bbo, 2000, 1);
        this.d = -1;
    }
    
    public bcs(final bbo bbo, final char[] array) {
        super("HTTP request with non-empty body must set Content-Type", bbo, 1004, 1);
        this.d = 0;
    }
    
    @Deprecated
    public bcs(final IOException ex, final bbo bbo) {
        super(ex, bbo, 2000, 1);
        this.d = -1;
    }
    
    public bcs(final IOException ex, final bbo bbo, final int n, final int d) {
        super(ex, bbo, n, 1);
        this.d = d;
    }
}
