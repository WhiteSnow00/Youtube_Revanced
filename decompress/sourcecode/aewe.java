import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aewe
{
    public static final aeyx a;
    
    static {
        aewd a2;
        try {
            SystemClock.elapsedRealtimeNanos();
            final aewc aewc = new aewc();
        }
        finally {
            SystemClock.elapsedRealtime();
            a2 = new aewd();
        }
        a = (aeyx)a2;
    }
}
