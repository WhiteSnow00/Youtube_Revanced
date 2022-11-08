import android.media.metrics.LogSessionId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bgz
{
    public static final bgz a;
    private final bgy b;
    
    static {
        bgz a2;
        if (baw.a < 31) {
            a2 = new bgz();
        }
        else {
            a2 = new bgz(bgy.a);
        }
        a = a2;
    }
    
    public bgz() {
        this((bgy)null);
        dk.h(baw.a < 31);
    }
    
    public bgz(final LogSessionId logSessionId) {
        this(new bgy(logSessionId));
    }
    
    private bgz(final bgy b) {
        this.b = b;
    }
    
    public final LogSessionId a() {
        final bgy b = this.b;
        dk.d((Object)b);
        return b.b;
    }
}
