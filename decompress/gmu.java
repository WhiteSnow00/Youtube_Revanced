import com.google.android.apps.youtube.app.datasaving.DefaultNetworkDataUsageMonitor;
import android.app.usage.NetworkStatsManager$UsageCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmu extends NetworkStatsManager$UsageCallback
{
    final DefaultNetworkDataUsageMonitor a;
    
    public gmu(final DefaultNetworkDataUsageMonitor a) {
        this.a = a;
    }
    
    public final void onThresholdReached(final int n, final String s) {
        final ashj e = this.a.e;
        if (e == null) {
            ttr.c("DefaultNetworkDataUsageMonitor", "dataCapStateFlowableEmitter is null!");
            return;
        }
        e.c((Object)gmw.c);
    }
}
