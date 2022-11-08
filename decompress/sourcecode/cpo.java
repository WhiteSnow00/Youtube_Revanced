import android.content.Intent;
import android.util.Log;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpo extends cpt
{
    public cpo(final Context context, final aja aja, final byte[] array, final byte[] array2, final byte[] array3) {
        super(context, aja, null, null, null);
    }
    
    @Override
    public final IntentFilter a() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }
    
    @Override
    public final void c(final Intent intent) {
        final String action = intent.getAction();
        if (action == null) {
            return;
        }
        cmr.a();
        final String a = cpp.a;
        switch (action.hashCode()) {
            case 1019184907: {
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    this.g((Object)true);
                    return;
                }
                break;
            }
            case 948344062: {
                if (action.equals("android.os.action.CHARGING")) {
                    this.g((Object)true);
                    return;
                }
                break;
            }
            case -54942926: {
                if (action.equals("android.os.action.DISCHARGING")) {
                    this.g((Object)false);
                    return;
                }
                break;
            }
            case -1886648615: {
                if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    break;
                }
                this.g((Object)false);
                break;
            }
        }
    }
}
