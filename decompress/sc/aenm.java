import android.net.wifi.WifiManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aenm implements arls
{
    private final atke a;
    
    public aenm(final atke a) {
        this.a = a;
    }
    
    public static WifiManager c(final Context context) {
        final WifiManager wifiManager = (WifiManager)context.getSystemService("wifi");
        wifiManager.getClass();
        return wifiManager;
    }
    
    public static aenm d(final atke atke) {
        return new aenm(atke);
    }
    
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final WifiManager b() {
        return c((Context)((arlt)this.a).a);
    }
}
