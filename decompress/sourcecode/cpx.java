import android.net.NetworkCapabilities;
import android.net.Network;
import android.net.ConnectivityManager$NetworkCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpx extends ConnectivityManager$NetworkCallback
{
    final /* synthetic */ cpy a;
    
    public cpx(final cpy a) {
        this.a = a;
    }
    
    public final void onCapabilitiesChanged(final Network network, final NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        cmr.a();
        final String a = cpz.a;
        new StringBuilder("Network capabilities changed: ").append(networkCapabilities);
        networkCapabilities.toString();
        final cpy a2 = this.a;
        ((cpv)a2).g(cpz.a(a2.e));
    }
    
    public final void onLost(final Network network) {
        network.getClass();
        cmr.a();
        final String a = cpz.a;
        final cpy a2 = this.a;
        ((cpv)a2).g(cpz.a(a2.e));
    }
}
