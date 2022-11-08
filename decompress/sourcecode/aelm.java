import android.net.wifi.WifiManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aelm implements arjd
{
    private final atjj a;
    
    public aelm(final atjj a) {
        this.a = a;
    }
    
    public static WifiManager c(final Context context) {
        final WifiManager wifiManager = (WifiManager)context.getSystemService("wifi");
        wifiManager.getClass();
        return wifiManager;
    }
    
    public static aelm d(final atjj atjj) {
        return new aelm(atjj);
    }
    
    public final WifiManager b() {
        return c((Context)((arje)this.a).a);
    }
}
