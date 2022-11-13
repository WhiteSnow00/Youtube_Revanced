// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.datasaving;

import android.content.Context;
import android.app.usage.NetworkStatsManager$UsageCallback;
import android.os.Handler;
import android.app.usage.NetworkStatsManager;

public class DefaultNetworkDataUsageMonitor implements gmx, thj
{
    public final NetworkStatsManager a;
    public final tmx b;
    public final Handler c;
    public NetworkStatsManager$UsageCallback d;
    public ashj e;
    public final vai f;
    private ashi g;
    
    public DefaultNetworkDataUsageMonitor(final Context context, final tmx b, final vai f, final aemf c) {
        final Object systemService = context.getSystemService("netstats");
        systemService.getClass();
        this.a = (NetworkStatsManager)systemService;
        this.b = b;
        this.f = f;
        this.c = c;
    }
    
    public static void k(final Throwable t) {
        ttr.f("DefaultNetworkDataUsageMonitor", "Failed to read data saving settings store.", t);
    }
    
    public static void l(final Throwable t) {
        ttr.f("DefaultNetworkDataUsageMonitor", "Failed to get threshold bytes.", t);
    }
    
    private final ashi n() {
        return ashi.m((ashk)new ixl(this, 1), ashb.c);
    }
    
    public final thh g() {
        return thh.a;
    }
    
    @Override
    public final ashi j() {
        if (this.g == null) {
            this.g = this.n();
        }
        return this.g;
    }
    
    public final void lW(final aun aun) {
    }
    
    @Override
    public final void m(final long n) {
        teu.i(this.b.b((aezf)new fmv(n, 5)), (tet)jog.b);
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
        this.g = this.n();
        if (this.f.bE()) {
            this.b.d().L((asjr)gkr.i).p().am((asjm)new gmf(this, 6));
        }
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oT() {
        tfg.g((thj)this);
    }
    
    public final void oW() {
        tfg.f((thj)this);
    }
    
    public final void oX(final aun aun) {
    }
}
