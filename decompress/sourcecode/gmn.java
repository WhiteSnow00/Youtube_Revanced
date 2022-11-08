import com.google.android.apps.youtube.app.datasaving.DefaultNetworkDataUsageMonitor;
import android.app.usage.NetworkStatsManager$UsageCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmn extends NetworkStatsManager$UsageCallback
{
    final /* synthetic */ DefaultNetworkDataUsageMonitor a;
    
    public gmn(final DefaultNetworkDataUsageMonitor a) {
        this.a = a;
    }
    
    public final void onThresholdReached(final int n, final String s) {
        final asgu e = this.a.e;
        if (e == null) {
            trn.c("DefaultNetworkDataUsageMonitor", "dataCapStateFlowableEmitter is null!");
            return;
        }
        e.c((Object)gmp.c);
    }
}
