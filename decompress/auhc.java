import org.chromium.net.NetworkException;

// 
// Decompiled by Procyon v0.6.0
// 

public class auhc extends NetworkException
{
    protected final int a;
    protected final int b;
    
    public auhc(final String s, final int a, final int b) {
        super(s, (Throwable)null);
        this.a = a;
        this.b = b;
    }
    
    public final int getCronetInternalErrorCode() {
        return this.b;
    }
    
    public final int getErrorCode() {
        return this.a;
    }
    
    public final String getMessage() {
        final StringBuilder sb = new StringBuilder(super.getMessage());
        sb.append(", ErrorCode=");
        sb.append(this.a);
        if (this.b != 0) {
            sb.append(", InternalErrorCode=");
            sb.append(this.b);
        }
        sb.append(", Retryable=");
        sb.append(this.immediatelyRetryable());
        return sb.toString();
    }
    
    public boolean immediatelyRetryable() {
        final int a = this.a;
        return a == 3 || a == 4 || a == 5 || a == 6 || a == 8;
    }
}
