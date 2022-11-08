// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement;

import android.os.PowerManager$WakeLock;
import android.content.ComponentName;
import android.os.PowerManager;
import android.content.Intent;
import android.content.Context;

public final class AppMeasurementReceiver extends att
{
    private mrm c;
    
    public final void onReceive(final Context context, final Intent intent) {
        if (this.c == null) {
            this.c = new mrm(this);
        }
        final mrm c = this.c;
        final nfo i = nfo.i(context);
        final nes aa = i.aA();
        if (intent == null) {
            aa.f.a("Receiver called with null intent");
            return;
        }
        final agfu z = i.z;
        final String action = intent.getAction();
        aa.k.b("Local receiver got", (Object)action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            final Intent setClassName = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            setClassName.setAction("com.google.android.gms.measurement.UPLOAD");
            aa.k.a("Starting wakeful intent.");
            final Object a = c.a;
            synchronized (att.a) {
                final int b = att.b;
                if ((att.b = b + 1) <= 0) {
                    att.b = 1;
                }
                setClassName.putExtra("androidx.contentpager.content.wakelockid", b);
                setClassName.putExtra("android.support.content.wakelockid", b);
                final ComponentName startService = context.startService(setClassName);
                if (startService == null) {
                    return;
                }
                final PowerManager powerManager = (PowerManager)context.getSystemService("power");
                final StringBuilder sb = new StringBuilder("androidx.core:wake:");
                sb.append(startService.flattenToShortString());
                final PowerManager$WakeLock wakeLock = powerManager.newWakeLock(1, sb.toString());
                wakeLock.setReferenceCounted(false);
                wakeLock.acquire(60000L);
                att.a.put(b, (Object)wakeLock);
                return;
            }
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            aa.f.a("Install Referrer Broadcasts are deprecated");
        }
    }
}
