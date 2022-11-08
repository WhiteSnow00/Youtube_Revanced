// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver
{
    static {
        cmr.b("ConstrntProxyUpdtRecvr");
    }
    
    public static Intent a(final Context context, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        final Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class)ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", b).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", b2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", b3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", b4);
        return intent;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        String action;
        if (intent != null) {
            action = intent.getAction();
        }
        else {
            action = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            cmr.a();
            return;
        }
        csk.b(coe.j(context).k, (Runnable)new vo(intent, context, this.goAsync(), 8));
    }
}
