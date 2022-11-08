import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class beq
{
    public static bgz a(final Context context, final bew bew, final boolean b) {
        final MediaMetricsManager mediaMetricsManager = (MediaMetricsManager)context.getSystemService("media_metrics");
        bgv bgv;
        if (mediaMetricsManager == null) {
            bgv = null;
        }
        else {
            bgv = new bgv(context, mediaMetricsManager.createPlaybackSession());
        }
        if (bgv == null) {
            bao.c("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new bgz(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (b) {
            bew.I((bgb)bgv);
        }
        return new bgz(bgv.a.getSessionId());
    }
    
    public static int b(final int n) {
        return c(n, 0, 0);
    }
    
    public static int c(final int n, final int n2, final int n3) {
        return d(n, n2, n3, 0, 128);
    }
    
    public static int d(final int n, final int n2, final int n3, final int n4, final int n5) {
        return n | n2 | n3 | n4 | n5;
    }
    
    public static int e(final int n) {
        return n & 0x180;
    }
    
    public static int f(final int n) {
        return n & 0x7;
    }
    
    public static int g(final int n) {
        return n & 0x40;
    }
}
