import org.chromium.net.QuicException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auei extends QuicException
{
    private final int a;
    private final aueg b;
    
    public auei(final String s, final int n, final int n2, final int a) {
        super(s, (Throwable)null);
        this.b = new aueg(s, n, n2);
        this.a = a;
    }
    
    public final int getCronetInternalErrorCode() {
        return this.b.b;
    }
    
    public final int getErrorCode() {
        return this.b.a;
    }
    
    public final String getMessage() {
        final StringBuilder sb = new StringBuilder(this.b.getMessage());
        sb.append(", QuicDetailedErrorCode=");
        sb.append(this.a);
        return sb.toString();
    }
    
    public final int getQuicDetailedErrorCode() {
        return this.a;
    }
    
    public final boolean immediatelyRetryable() {
        return this.b.immediatelyRetryable();
    }
}
