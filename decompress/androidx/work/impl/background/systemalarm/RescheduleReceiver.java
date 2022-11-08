// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver$PendingResult;
import android.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class RescheduleReceiver extends BroadcastReceiver
{
    private static final String a;
    
    static {
        a = cmr.b("RescheduleReceiver");
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        cmr.a();
        new StringBuilder("Received intent ").append(intent);
        try {
            final coe j = coe.j(context);
            final BroadcastReceiver$PendingResult goAsync = this.goAsync();
            synchronized (coe.a) {
                j.h = goAsync;
                if (j.g) {
                    j.h.finish();
                    j.h = null;
                }
            }
        }
        catch (final IllegalStateException ex) {
            cmr.a();
            Log.e(RescheduleReceiver.a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", (Throwable)ex);
        }
    }
}
