import android.content.Intent;
import android.util.Log;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpr extends cpu
{
    public cpr(final Context context, final ajb ajb, final byte[] array, final byte[] array2, final byte[] array3) {
        super(context, ajb, null, null, null);
    }
    
    @Override
    public final IntentFilter a() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }
    
    @Override
    public final Object b() {
        final Intent registerReceiver = super.a.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean b = false;
        Boolean b2;
        if (registerReceiver == null) {
            cms.a();
            Log.e(cps.a, "getInitialState - null intent received");
            b2 = false;
        }
        else {
            final int intExtra = registerReceiver.getIntExtra("status", -1);
            final int intExtra2 = registerReceiver.getIntExtra("level", -1);
            final int intExtra3 = registerReceiver.getIntExtra("scale", -1);
            final float n = (float)intExtra2;
            final float n2 = (float)intExtra3;
            if (intExtra == 1 || n / n2 > 0.15f) {
                b = true;
            }
            b2 = b;
        }
        return b2;
    }
    
    @Override
    public final void c(final Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        cms.a();
        final String a = cps.a;
        intent.getAction();
        final String action = intent.getAction();
        if (action != null) {
            final int hashCode = action.hashCode();
            if (hashCode != -1980154005) {
                if (hashCode == 490310653) {
                    if (action.equals("android.intent.action.BATTERY_LOW")) {
                        this.g(false);
                    }
                }
            }
            else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                this.g(true);
            }
        }
    }
}
