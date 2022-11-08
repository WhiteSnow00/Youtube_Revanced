import android.net.LinkProperties;
import android.net.Network;
import org.chromium.net.NetworkChangeNotifierAutoDetect;
import android.net.ConnectivityManager$NetworkCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubq extends ConnectivityManager$NetworkCallback
{
    final /* synthetic */ NetworkChangeNotifierAutoDetect a;
    
    public aubq(final NetworkChangeNotifierAutoDetect a) {
        this.a = a;
    }
    
    public final void onAvailable(final Network network) {
        if (NetworkChangeNotifierAutoDetect.-$$Nest$fgetmRegistered(this.a)) {
            NetworkChangeNotifierAutoDetect.-$$Nest$mconnectionTypeChanged(this.a);
        }
    }
    
    public final void onLinkPropertiesChanged(final Network network, final LinkProperties linkProperties) {
        this.onAvailable(null);
    }
    
    public final void onLost(final Network network) {
        this.onAvailable(null);
    }
}
