// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement;

import android.os.IBinder;
import android.app.job.JobParameters;
import android.content.Intent;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import android.app.Service;

public final class AppMeasurementService extends Service implements ngw
{
    private c a;
    
    private final c d() {
        if (this.a == null) {
            this.a = new c((Context)this, (byte[])null);
        }
        return this.a;
    }
    
    public final void a(final Intent intent) {
        AppMeasurementReceiver.a(intent);
    }
    
    public final boolean b(final int n) {
        return this.stopSelfResult(n);
    }
    
    public final void c(final JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }
    
    public final IBinder onBind(final Intent intent) {
        final c d = this.d();
        final IBinder binder = null;
        Object o;
        if (intent == null) {
            d.d().c.a("onBind called with null intent");
            o = binder;
        }
        else {
            final String action = intent.getAction();
            if ("com.google.android.gms.measurement.START".equals(action)) {
                o = new nej(nhj.q((Context)d.a));
            }
            else {
                d.d().f.b("onBind received unknown action", (Object)action);
                o = binder;
            }
        }
        return (IBinder)o;
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
    
    public final int onStartCommand(final Intent intent, final int n, final int n2) {
        final c d = this.d();
        final nfo i = nfo.i((Context)d.a);
        final nes aa = i.aA();
        if (intent == null) {
            aa.f.a("AppMeasurementService started with null intent");
        }
        else {
            final String action = intent.getAction();
            final agfu z = i.z;
            aa.k.c("Local AppMeasurementService called. startId, action", (Object)n2, (Object)action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                d.h((Runnable)new gka(d, n2, aa, intent, 4, (byte[])null, (byte[])null, (byte[])null));
            }
        }
        return 2;
    }
    
    public final boolean onUnbind(final Intent intent) {
        this.d().i(intent);
        return true;
    }
}
