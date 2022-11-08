import android.content.Context;
import android.content.IntentFilter;
import android.os.BatteryManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeox implements aeow
{
    private final BatteryManager a;
    
    static {
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }
    
    public aeox(final Context context) {
        this.a = (BatteryManager)context.getSystemService("batterymanager");
    }
    
    public final boolean a() {
        return this.a.isCharging();
    }
}
