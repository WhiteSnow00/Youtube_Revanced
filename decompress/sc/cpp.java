import android.content.Intent;
import android.util.Log;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpp extends cpu
{
    public cpp(final Context context, final ajb ajb, final byte[] array, final byte[] array2, final byte[] array3) {
        super(context, ajb, null, null, null);
    }
    
    @Override
    public final IntentFilter a() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }
    
    @Override
    public final Object b() {
        final Intent registerReceiver = super.a.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean b = false;
        Boolean b2;
        if (registerReceiver == null) {
            cms.a();
            Log.e(cpq.a, "getInitialState - null intent received");
            b2 = false;
        }
        else {
            final int intExtra = registerReceiver.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                b = true;
            }
            b2 = b;
        }
        return b2;
    }
    
    @Override
    public final void c(final Intent intent) {
        final String action = intent.getAction();
        if (action == null) {
            return;
        }
        cms.a();
        final String a = cpq.a;
        switch (action.hashCode()) {
            case 1019184907: {
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    this.g(true);
                    return;
                }
                break;
            }
            case 948344062: {
                if (action.equals("android.os.action.CHARGING")) {
                    this.g(true);
                    return;
                }
                break;
            }
            case -54942926: {
                if (action.equals("android.os.action.DISCHARGING")) {
                    this.g(false);
                    return;
                }
                break;
            }
            case -1886648615: {
                if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    break;
                }
                this.g(false);
                break;
            }
        }
    }
}
