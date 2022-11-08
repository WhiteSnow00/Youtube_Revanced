import android.net.NetworkInfo;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjz extends adjq
{
    protected static final adkc b;
    private final BroadcastReceiver c;
    private final Context d;
    private final ConnectivityManager e;
    
    static {
        b = adkc.a(1);
    }
    
    public adjz(final Context d) {
        super(1);
        this.c = (BroadcastReceiver)new adjy(this);
        this.d = d;
        this.e = (ConnectivityManager)d.getSystemService("connectivity");
    }
    
    protected final void e() {
        this.d.registerReceiver(this.c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
    
    protected final void f() {
        this.d.unregisterReceiver(this.c);
    }
    
    public final adkc g() {
        final NetworkInfo activeNetworkInfo = this.e.getActiveNetworkInfo();
        adkc adkc;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            adkc = adkc.a;
        }
        else {
            adkc = adjz.b;
        }
        return adkc;
    }
}
