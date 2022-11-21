import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aezv
{
    public static final afco a;
    
    static {
        aezu a2;
        try {
            SystemClock.elapsedRealtimeNanos();
            final aezt aezt = new aezt();
        }
        finally {
            SystemClock.elapsedRealtime();
            a2 = new aezu();
        }
        a = a2;
    }
}
