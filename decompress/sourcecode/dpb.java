import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dpb
{
    private static final double a;
    
    static {
        a = 1.0 / Math.pow(10.0, 6.0);
    }
    
    public static double a(final long n) {
        final double n2 = (double)(SystemClock.elapsedRealtimeNanos() - n);
        final double a = dpb.a;
        Double.isNaN(n2);
        return n2 * a;
    }
    
    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
