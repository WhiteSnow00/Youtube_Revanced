import android.net.NetworkInfo;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.content.Context;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjv extends adjq
{
    private static final adkc b;
    private static final adkc c;
    private final BroadcastReceiver d;
    private final SharedPreferences$OnSharedPreferenceChangeListener e;
    private final Context f;
    private final ConnectivityManager g;
    private final SharedPreferences h;
    private final trp i;
    
    static {
        b = adkc.a(1);
        c = adkc.a(3);
    }
    
    public adjv(final Context f, final SharedPreferences h) {
        super(3);
        this.d = (BroadcastReceiver)new adju(this);
        this.e = (SharedPreferences$OnSharedPreferenceChangeListener)new joz(this, 4);
        this.f = f;
        this.g = (ConnectivityManager)f.getSystemService("connectivity");
        this.h = h;
        this.i = (trp)new adjt(f);
    }
    
    protected final void e() {
        this.f.registerReceiver(this.d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.h.registerOnSharedPreferenceChangeListener(this.e);
    }
    
    protected final void f() {
        this.f.unregisterReceiver(this.d);
        this.h.unregisterOnSharedPreferenceChangeListener(this.e);
    }
    
    public final adkc g() {
        final NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        final boolean equals = ((String)this.i.a()).equals(this.h.getString("upload_policy", (String)null));
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            adkc adkc;
            if (equals) {
                adkc = adjv.c;
            }
            else {
                adkc = adjv.b;
            }
            return adkc;
        }
        if (activeNetworkInfo.getType() == 1) {
            return adkc.a;
        }
        adkc adkc2;
        if (equals) {
            adkc2 = adjv.c;
        }
        else {
            adkc2 = adkc.a;
        }
        return adkc2;
    }
    
    public final boolean h() {
        final NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        return activeNetworkInfo == null || !activeNetworkInfo.isAvailable() || !activeNetworkInfo.isConnected();
    }
    
    public final boolean i() {
        if (((String)this.i.a()).equals(this.h.getString("upload_policy", (String)null))) {
            final NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                if (activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getType() == 1) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
