// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.utils;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver
{
    static {
        cms.b("ForceStopRunnable$Rcvr");
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            cms.a();
            csh.a(context);
        }
    }
}
