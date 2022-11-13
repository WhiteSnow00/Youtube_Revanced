import org.chromium.net.NetworkChangeNotifier;
import org.chromium.net.NetworkChangeNotifierAutoDetect$Observer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aucf implements NetworkChangeNotifierAutoDetect$Observer
{
    final NetworkChangeNotifier a;
    
    public aucf(final NetworkChangeNotifier a) {
        this.a = a;
    }
    
    public final void onConnectionCostChanged(final int n) {
        this.a.notifyObserversOfConnectionCostChange(n);
    }
    
    public final void onConnectionSubtypeChanged(final int n) {
        this.a.notifyObserversOfConnectionSubtypeChange(n);
    }
    
    public final void onConnectionTypeChanged(final int n) {
        NetworkChangeNotifier.-$$Nest$mupdateCurrentConnectionType(this.a, n);
    }
    
    public final void onNetworkConnect(final long n, final int n2) {
        this.a.notifyObserversOfNetworkConnect(n, n2);
    }
    
    public final void onNetworkDisconnect(final long n) {
        this.a.notifyObserversOfNetworkDisconnect(n);
    }
    
    public final void onNetworkSoonToDisconnect(final long n) {
        this.a.notifyObserversOfNetworkSoonToDisconnect(n);
    }
    
    public final void purgeActiveNetworkList(final long[] array) {
        this.a.notifyObserversToPurgeActiveNetworkList(array);
    }
}
