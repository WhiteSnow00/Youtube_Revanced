import android.content.Intent;
import android.util.Log;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpq extends cpt
{
    public cpq(final Context context, final aja aja, final byte[] array, final byte[] array2, final byte[] array3) {
        super(context, aja, null, null, null);
    }
    
    @Override
    public final IntentFilter a() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }
    
    @Override
    public final void c(final Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        cmr.a();
        final String a = cpr.a;
        intent.getAction();
        final String action = intent.getAction();
        if (action != null) {
            final int hashCode = action.hashCode();
            if (hashCode != -1980154005) {
                if (hashCode == 490310653) {
                    if (action.equals("android.intent.action.BATTERY_LOW")) {
                        this.g((Object)false);
                    }
                }
            }
            else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                this.g((Object)true);
            }
        }
    }
}
