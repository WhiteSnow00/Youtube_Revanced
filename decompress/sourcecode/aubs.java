import org.chromium.net.NetworkChangeNotifierAutoDetect$MyNetworkCallback$$ExternalSyntheticBackport0;
import org.chromium.base.TraceEvent;
import android.net.NetworkCapabilities;
import org.chromium.net.NetworkChangeNotifierAutoDetect;
import android.net.Network;
import android.net.ConnectivityManager$NetworkCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubs extends ConnectivityManager$NetworkCallback
{
    public Network a;
    public final /* synthetic */ NetworkChangeNotifierAutoDetect b;
    
    public aubs(final NetworkChangeNotifierAutoDetect b) {
        this.b = b;
    }
    
    private final boolean a(final Network network, final NetworkCapabilities networkCapabilities) {
        if (!this.b(network)) {
            NetworkCapabilities c;
            if ((c = networkCapabilities) == null) {
                c = NetworkChangeNotifierAutoDetect.-$$Nest$fgetmConnectivityManagerDelegate(this.b).c(network);
            }
            if (c != null) {
                if (c.hasTransport(4)) {
                    NetworkChangeNotifierAutoDetect.-$$Nest$fgetmConnectivityManagerDelegate(this.b);
                    if (!aubp.g(network)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }
    
    private final boolean b(final Network network) {
        final Network a = this.a;
        return a != null && !a.equals((Object)network);
    }
    
    public final void onAvailable(final Network a) {
        final TraceEvent b = TraceEvent.b("NetworkChangeNotifierCallback::onAvailable");
        try {
            final NetworkCapabilities c = NetworkChangeNotifierAutoDetect.-$$Nest$fgetmConnectivityManagerDelegate(this.b).c(a);
            if (this.a(a, c)) {
                if (b != null) {
                    b.close();
                }
                return;
            }
            boolean b2 = false;
            Label_0074: {
                if (c.hasTransport(4)) {
                    final Network a2 = this.a;
                    if (a2 == null || !a.equals((Object)a2)) {
                        b2 = true;
                        break Label_0074;
                    }
                }
                b2 = false;
            }
            if (b2) {
                this.a = a;
            }
            NetworkChangeNotifierAutoDetect.-$$Nest$mrunOnThread(this.b, (Runnable)new aubr(this, NetworkChangeNotifierAutoDetect.networkToNetId(a), NetworkChangeNotifierAutoDetect.-$$Nest$fgetmConnectivityManagerDelegate(this.b).a(a), b2, 0));
            if (b != null) {
                b.close();
            }
        }
        finally {
            if (b != null) {
                try {
                    b.close();
                }
                finally {
                    final Throwable t;
                    NetworkChangeNotifierAutoDetect$MyNetworkCallback$$ExternalSyntheticBackport0.m((Throwable)a, t);
                }
            }
        }
    }
    
    public final void onCapabilitiesChanged(final Network network, final NetworkCapabilities networkCapabilities) {
        final TraceEvent b = TraceEvent.b("NetworkChangeNotifierCallback::onCapabilitiesChanged");
        try {
            if (this.a(network, networkCapabilities)) {
                if (b != null) {
                    b.close();
                }
                return;
            }
            NetworkChangeNotifierAutoDetect.-$$Nest$mrunOnThread(this.b, (Runnable)new bsl(this, NetworkChangeNotifierAutoDetect.networkToNetId(network), NetworkChangeNotifierAutoDetect.-$$Nest$fgetmConnectivityManagerDelegate(this.b).a(network), 3));
            if (b != null) {
                b.close();
            }
        }
        finally {
            if (b != null) {
                try {
                    b.close();
                }
                finally {
                    final Throwable t;
                    NetworkChangeNotifierAutoDetect$MyNetworkCallback$$ExternalSyntheticBackport0.m((Throwable)network, t);
                }
            }
        }
    }
    
    public final void onLosing(final Network network, final int n) {
        final TraceEvent b = TraceEvent.b("NetworkChangeNotifierCallback::onLosing");
        try {
            if (this.a(network, null)) {
                if (b != null) {
                    b.close();
                }
                return;
            }
            NetworkChangeNotifierAutoDetect.-$$Nest$mrunOnThread(this.b, (Runnable)new ynq(this, NetworkChangeNotifierAutoDetect.networkToNetId(network), 14));
            if (b != null) {
                b.close();
            }
        }
        finally {
            if (b != null) {
                try {
                    b.close();
                }
                finally {
                    final Throwable t;
                    NetworkChangeNotifierAutoDetect$MyNetworkCallback$$ExternalSyntheticBackport0.m((Throwable)network, t);
                }
            }
        }
    }
    
    public final void onLost(final Network network) {
        final TraceEvent b = TraceEvent.b("NetworkChangeNotifierCallback::onLost");
        try {
            if (this.b(network)) {
                if (b != null) {
                    b.close();
                }
                return;
            }
            NetworkChangeNotifierAutoDetect.-$$Nest$mrunOnThread(this.b, (Runnable)new atyo(this, network, 2));
            if (this.a != null) {
                this.a = null;
                final Network[] -$$Nest$smgetAllNetworksFiltered = NetworkChangeNotifierAutoDetect.-$$Nest$smgetAllNetworksFiltered(NetworkChangeNotifierAutoDetect.-$$Nest$fgetmConnectivityManagerDelegate(this.b), network);
                for (int length = -$$Nest$smgetAllNetworksFiltered.length, i = 0; i < length; ++i) {
                    this.onAvailable(-$$Nest$smgetAllNetworksFiltered[i]);
                }
                NetworkChangeNotifierAutoDetect.-$$Nest$mrunOnThread(this.b, (Runnable)new aaqw(this, this.b.getCurrentNetworkState().getConnectionType(), 20));
            }
            if (b != null) {
                b.close();
            }
        }
        finally {
            Label_0168: {
                if (b != null) {
                    try {
                        b.close();
                        break Label_0168;
                    }
                    finally {
                        final Throwable t;
                        NetworkChangeNotifierAutoDetect$MyNetworkCallback$$ExternalSyntheticBackport0.m((Throwable)network, t);
                    }
                    break Label_0168;
                }
                break Label_0168;
            }
            while (true) {}
        }
    }
}
