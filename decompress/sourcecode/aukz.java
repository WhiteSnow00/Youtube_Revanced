import org.webrtc.NetworkMonitor;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.ConnectivityManager;
import android.os.Build$VERSION;
import org.webrtc.Logging;
import android.net.NetworkRequest$Builder;
import java.util.HashSet;
import org.webrtc.NetworkChangeDetector$ConnectionType;
import android.content.IntentFilter;
import java.util.Set;
import android.net.ConnectivityManager$NetworkCallback;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aukz extends BroadcastReceiver implements auks
{
    public final aukr a;
    public final Context b;
    public final ConnectivityManager$NetworkCallback c;
    public final ConnectivityManager$NetworkCallback d;
    public final aukv e;
    public auky f;
    final Set g;
    public boolean h;
    private final IntentFilter i;
    private NetworkChangeDetector$ConnectionType j;
    private String k;
    private final aubp l;
    
    public aukz(aukr aukr, final Context b) {
        final HashSet g = new HashSet();
        this.g = g;
        this.a = aukr;
        this.b = b;
        final aukv e = new aukv(b, (Set)g, (String)aukr.a);
        this.e = e;
        aukr = null;
        this.l = new aubp(b, (byte[])null);
        final aukw b2 = e.b();
        this.j = a(b2);
        this.k = this.d(b2);
        final IntentFilter i = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        this.i = i;
        if (!this.h) {
            this.h = true;
            b.registerReceiver((BroadcastReceiver)this, i);
        }
        if (e.d()) {
            final Object o = new ConnectivityManager$NetworkCallback();
            try {
                final NetworkRequest$Builder networkRequest$Builder = new NetworkRequest$Builder();
                networkRequest$Builder.addCapability(12).addTransportType(0);
                e.a.requestNetwork(networkRequest$Builder.build(), (ConnectivityManager$NetworkCallback)o);
                aukr = (aukr)o;
            }
            catch (final SecurityException ex) {
                Logging.d("NetworkMonitorAutoDetect", "Unable to obtain permission to request a cellular network.");
            }
            this.c = (ConnectivityManager$NetworkCallback)aukr;
            final aukx d = new aukx(this, this.g);
            this.d = (ConnectivityManager$NetworkCallback)d;
            final aukv e2 = this.e;
            final ConnectivityManager a = e2.a;
            final NetworkRequest$Builder addCapability = new NetworkRequest$Builder().addCapability(12);
            if (e2.d) {
                addCapability.removeCapability(15);
            }
            if (Build$VERSION.SDK_INT >= 31 && e2.e) {
                addCapability.setIncludeOtherUidNetworks(true);
            }
            a.registerNetworkCallback(addCapability.build(), (ConnectivityManager$NetworkCallback)d);
            return;
        }
        this.c = null;
        this.d = null;
    }
    
    public static NetworkChangeDetector$ConnectionType a(final aukw aukw) {
        return b(aukw.a, aukw.b, aukw.c);
    }
    
    public static NetworkChangeDetector$ConnectionType b(final boolean b, final int n, final int n2) {
        if (!b) {
            return NetworkChangeDetector$ConnectionType.k;
        }
        if (n != 0) {
            if (n == 1) {
                return NetworkChangeDetector$ConnectionType.c;
            }
            if (n == 6) {
                return NetworkChangeDetector$ConnectionType.e;
            }
            if (n == 7) {
                return NetworkChangeDetector$ConnectionType.i;
            }
            if (n == 9) {
                return NetworkChangeDetector$ConnectionType.b;
            }
            if (n != 17) {
                return NetworkChangeDetector$ConnectionType.a;
            }
            return NetworkChangeDetector$ConnectionType.j;
        }
        else {
            switch (n2) {
                default: {
                    return NetworkChangeDetector$ConnectionType.h;
                }
                case 20: {
                    return NetworkChangeDetector$ConnectionType.d;
                }
                case 13:
                case 18: {
                    return NetworkChangeDetector$ConnectionType.e;
                }
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17: {
                    return NetworkChangeDetector$ConnectionType.f;
                }
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16: {
                    return NetworkChangeDetector$ConnectionType.g;
                }
            }
        }
    }
    
    private final String d(final aukw aukw) {
        if (a(aukw) != NetworkChangeDetector$ConnectionType.c) {
            return "";
        }
        final Intent registerReceiver = ((Context)this.l.a).registerReceiver((BroadcastReceiver)null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
        if (registerReceiver != null) {
            final WifiInfo wifiInfo = (WifiInfo)registerReceiver.getParcelableExtra("wifiInfo");
            if (wifiInfo != null) {
                final String ssid = wifiInfo.getSSID();
                if (ssid != null) {
                    return ssid;
                }
            }
        }
        return "";
    }
    
    public final aukw c() {
        return this.e.b();
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final aukw c = this.c();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            final NetworkChangeDetector$ConnectionType a = a(c);
            final String d = this.d(c);
            if (a != this.j || !d.equals(this.k)) {
                this.j = a;
                this.k = d;
                Logging.a("NetworkMonitorAutoDetect", "Network connectivity changed, type is: ".concat(String.valueOf(String.valueOf(a))));
                final NetworkMonitor networkMonitor = (NetworkMonitor)this.a.b;
                networkMonitor.a = a;
                networkMonitor.b();
            }
        }
    }
}
