import j$.time.Instant;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adtn
{
    public static final afma a;
    public final afui b;
    public Duration c;
    public Instant d;
    
    static {
        a = afma.m("com/google/android/livesharing/internal/state/DesiredPositionTracker");
    }
    
    public adtn(final afui b) {
        this.c = Duration.ZERO;
        this.d = null;
        this.b = b;
    }
}
