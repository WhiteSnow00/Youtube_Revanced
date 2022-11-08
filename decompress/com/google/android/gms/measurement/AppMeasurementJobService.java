// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.content.Intent;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import android.app.job.JobService;

public final class AppMeasurementJobService extends JobService implements ngw
{
    private c a;
    
    private final c d() {
        if (this.a == null) {
            this.a = new c((Context)this, (byte[])null);
        }
        return this.a;
    }
    
    public final void a(final Intent intent) {
    }
    
    public final boolean b(final int n) {
        throw new UnsupportedOperationException();
    }
    
    public final void c(final JobParameters jobParameters) {
        this.jobFinished(jobParameters, false);
    }
    
    public final void onCreate() {
        super.onCreate();
        this.d().e();
    }
    
    public final void onDestroy() {
        this.d().f();
        super.onDestroy();
    }
    
    public final void onRebind(final Intent intent) {
        this.d().g(intent);
    }
    
    public final boolean onStartJob(final JobParameters jobParameters) {
        final c d = this.d();
        final nfo i = nfo.i((Context)d.a);
        final nes aa = i.aA();
        final String string = jobParameters.getExtras().getString("action");
        final agfu z = i.z;
        aa.k.b("Local AppMeasurementJobService called. action", (Object)string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            d.h((Runnable)new ngo(d, aa, jobParameters, 4, (byte[])null, (byte[])null, (byte[])null));
        }
        return true;
    }
    
    public final boolean onStopJob(final JobParameters jobParameters) {
        return false;
    }
    
    public final boolean onUnbind(final Intent intent) {
        this.d().i(intent);
        return true;
    }
}
