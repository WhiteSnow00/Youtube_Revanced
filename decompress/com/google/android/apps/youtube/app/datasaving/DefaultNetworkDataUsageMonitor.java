// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.datasaving;

import android.content.Context;
import android.app.usage.NetworkStatsManager$UsageCallback;
import android.os.Handler;
import android.app.usage.NetworkStatsManager;

public class DefaultNetworkDataUsageMonitor implements gmq, tff
{
    public final NetworkStatsManager a;
    public final tku b;
    public final Handler c;
    public NetworkStatsManager$UsageCallback d;
    public asgu e;
    public final uyi f;
    private asgt g;
    
    public DefaultNetworkDataUsageMonitor(final Context context, final tku b, final uyi f, final aeke c) {
        final Object systemService = context.getSystemService("netstats");
        systemService.getClass();
        this.a = (NetworkStatsManager)systemService;
        this.b = b;
        this.f = f;
        this.c = c;
    }
    
    private final asgt n() {
        return asgt.m((asgv)new iwo(this, 1), asgm.c);
    }
    
    public final asgt j() {
        if (this.g == null) {
            this.g = this.n();
        }
        return this.g;
    }
    
    public final void m(final long n) {
        tcp.i(this.b.b((aexg)new fmp(n, 5)), (tco)jne.b);
    }
    
    public final void mq(final aum aum) {
        this.g = this.n();
        if (this.f.bF()) {
            this.b.d().L((asjc)gkj.i).p().al((asix)new gly(this, 5));
        }
    }
}
