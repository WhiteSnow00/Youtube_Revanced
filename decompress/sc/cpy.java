import android.net.NetworkCapabilities;
import android.net.Network;
import android.net.ConnectivityManager$NetworkCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpy extends ConnectivityManager$NetworkCallback
{
    final cpz a;
    
    public cpy(final cpz a) {
        this.a = a;
    }
    
    public final void onCapabilitiesChanged(final Network network, final NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        cms.a();
        final String a = cqa.a;
        new StringBuilder("Network capabilities changed: ").append(networkCapabilities);
        networkCapabilities.toString();
        final cpz a2 = this.a;
        a2.g(cqa.a(a2.e));
    }
    
    public final void onLost(final Network network) {
        network.getClass();
        cms.a();
        final String a = cqa.a;
        final cpz a2 = this.a;
        a2.g(cqa.a(a2.e));
    }
}
