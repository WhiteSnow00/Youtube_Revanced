import org.chromium.base.PowerMonitor;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aube extends BroadcastReceiver
{
    public final void onReceive(final Context context, final Intent intent) {
        PowerMonitor.b(intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED"));
    }
}
