import android.content.Intent;
import android.content.Context;
import org.chromium.net.ProxyChangeListener;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aucm extends BroadcastReceiver
{
    private final ProxyChangeListener a;
    
    public aucm(final ProxyChangeListener a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
            this.a.updateProxyConfigFromConnectivityManager(intent);
        }
    }
}
