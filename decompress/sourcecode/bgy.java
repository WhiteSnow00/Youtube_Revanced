import android.media.metrics.LogSessionId;

// 
// Decompiled by Procyon v0.6.0
// 

final class bgy
{
    public static final bgy a;
    public final LogSessionId b;
    
    static {
        a = new bgy(LogSessionId.LOG_SESSION_ID_NONE);
    }
    
    public bgy(final LogSessionId b) {
        this.b = b;
    }
}
