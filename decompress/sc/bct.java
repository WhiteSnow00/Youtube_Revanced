import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bct extends bcc
{
    public final int d;
    
    public bct(final bbp bbp) {
        super(bbp, 2008, 1);
        this.d = 14;
    }
    
    @Deprecated
    public bct(final bbp bbp, final byte[] array) {
        super("OnesieRetryingDataSource time out.", bbp, 2000, 1);
        this.d = -1;
    }
    
    public bct(final bbp bbp, final char[] array) {
        super("HTTP request with non-empty body must set Content-Type", bbp, 1004, 1);
        this.d = 0;
    }
    
    @Deprecated
    public bct(final IOException ex, final bbp bbp) {
        super(ex, bbp, 2000, 1);
        this.d = -1;
    }
    
    public bct(final IOException ex, final bbp bbp, final int n, final int d) {
        super(ex, bbp, n, 1);
        this.d = d;
    }
}
