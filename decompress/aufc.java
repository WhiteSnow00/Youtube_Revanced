import android.net.NetworkInfo;
import org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState;
import android.net.Network;
import org.chromium.net.NetworkChangeNotifierAutoDetect;
import android.net.NetworkCapabilities;
import android.net.LinkProperties;
import android.net.ConnectivityManager$NetworkCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aufc extends ConnectivityManager$NetworkCallback
{
    LinkProperties a;
    NetworkCapabilities b;
    final NetworkChangeNotifierAutoDetect c;
    
    public aufc(final NetworkChangeNotifierAutoDetect c) {
        this.c = c;
    }
    
    private final NetworkChangeNotifierAutoDetect$NetworkState a(final Network network) {
        final boolean hasTransport = this.b.hasTransport(1);
        int subtype = -1;
        int type;
        if (!hasTransport && !this.b.hasTransport(5)) {
            if (this.b.hasTransport(0)) {
                final NetworkInfo e = NetworkChangeNotifierAutoDetect.-$$Nest$fgetmConnectivityManagerDelegate(this.c).e(network);
                if (e != null) {
                    subtype = e.getSubtype();
                }
                final int n = 0;
                final int n2 = subtype;
                return new NetworkChangeNotifierAutoDetect$NetworkState(true, n, n2, this.b.hasCapability(11) ^ true, String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(network)), this.a.isPrivateDnsActive(), this.a.getPrivateDnsServerName());
            }
            if (this.b.hasTransport(3)) {
                type = 9;
            }
            else if (this.b.hasTransport(2)) {
                type = 7;
            }
            else if (this.b.hasTransport(4)) {
                final NetworkInfo d = NetworkChangeNotifierAutoDetect.-$$Nest$fgetmConnectivityManagerDelegate(this.c).d(network);
                if (d != null) {
                    type = d.getType();
                }
                else {
                    type = 17;
                }
            }
            else {
                type = -1;
            }
        }
        else {
            type = 1;
        }
        final int n2 = -1;
        final int n = type;
        return new NetworkChangeNotifierAutoDetect$NetworkState(true, n, n2, this.b.hasCapability(11) ^ true, String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(network)), this.a.isPrivateDnsActive(), this.a.getPrivateDnsServerName());
    }
    
    public final void onAvailable(final Network network) {
        this.a = null;
        this.b = null;
    }
    
    public final void onCapabilitiesChanged(final Network network, final NetworkCapabilities b) {
        this.b = b;
        if (NetworkChangeNotifierAutoDetect.-$$Nest$fgetmRegistered(this.c) && this.a != null && this.b != null) {
            NetworkChangeNotifierAutoDetect.-$$Nest$mconnectionTypeChangedTo(this.c, this.a(network));
        }
    }
    
    public final void onLinkPropertiesChanged(final Network network, final LinkProperties a) {
        this.a = a;
        if (NetworkChangeNotifierAutoDetect.-$$Nest$fgetmRegistered(this.c) && this.a != null && this.b != null) {
            NetworkChangeNotifierAutoDetect.-$$Nest$mconnectionTypeChangedTo(this.c, this.a(network));
        }
    }
    
    public final void onLost(final Network network) {
        this.a = null;
        this.b = null;
        if (NetworkChangeNotifierAutoDetect.-$$Nest$fgetmRegistered(this.c)) {
            NetworkChangeNotifierAutoDetect.-$$Nest$mconnectionTypeChangedTo(this.c, new NetworkChangeNotifierAutoDetect$NetworkState(false, -1, -1, false, (String)null, false, ""));
        }
    }
}
