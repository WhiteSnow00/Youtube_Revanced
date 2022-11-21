import android.net.NetworkInfo;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adno extends adnf
{
    protected static final adnr b;
    private final BroadcastReceiver c;
    private final Context d;
    private final ConnectivityManager e;
    
    static {
        b = adnr.a(1);
    }
    
    public adno(final Context d) {
        super(1);
        this.c = new adnn(this);
        this.d = d;
        this.e = (ConnectivityManager)d.getSystemService("connectivity");
    }
    
    protected final void e() {
        this.d.registerReceiver(this.c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
    
    protected final void f() {
        this.d.unregisterReceiver(this.c);
    }
    
    public final adnr g() {
        final NetworkInfo activeNetworkInfo = this.e.getActiveNetworkInfo();
        adnr adnr;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            adnr = adnr.a;
        }
        else {
            adnr = adno.b;
        }
        return adnr;
    }
}
