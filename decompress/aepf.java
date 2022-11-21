import android.net.wifi.WifiManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aepf implements arom
{
    private final atnb a;
    
    public aepf(final atnb a) {
        this.a = a;
    }
    
    public static WifiManager c(final Context context) {
        final WifiManager wifiManager = (WifiManager)context.getSystemService("wifi");
        wifiManager.getClass();
        return wifiManager;
    }
    
    public static aepf d(final atnb atnb) {
        return new aepf(atnb);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final WifiManager b() {
        return c((Context)((aron)this.a).a);
    }
}
