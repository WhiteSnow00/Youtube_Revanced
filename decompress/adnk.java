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

public final class adnk extends adnf
{
    private static final adnr b;
    private static final adnr c;
    private final BroadcastReceiver d;
    private final SharedPreferences$OnSharedPreferenceChangeListener e;
    private final Context f;
    private final ConnectivityManager g;
    private final SharedPreferences h;
    private final tuv i;
    
    static {
        b = adnr.a(1);
        c = adnr.a(3);
    }
    
    public adnk(final Context f, final SharedPreferences h) {
        super(3);
        this.d = new adnj(this);
        this.e = (SharedPreferences$OnSharedPreferenceChangeListener)new jqj(this, 4);
        this.f = f;
        this.g = (ConnectivityManager)f.getSystemService("connectivity");
        this.h = h;
        this.i = new adni(f);
    }
    
    protected final void e() {
        this.f.registerReceiver(this.d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.h.registerOnSharedPreferenceChangeListener(this.e);
    }
    
    protected final void f() {
        this.f.unregisterReceiver(this.d);
        this.h.unregisterOnSharedPreferenceChangeListener(this.e);
    }
    
    public final adnr g() {
        final NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        final boolean equals = ((String)this.i.a()).equals(this.h.getString("upload_policy", (String)null));
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            adnr adnr;
            if (equals) {
                adnr = adnk.c;
            }
            else {
                adnr = adnk.b;
            }
            return adnr;
        }
        if (activeNetworkInfo.getType() == 1) {
            return adnr.a;
        }
        adnr adnr2;
        if (equals) {
            adnr2 = adnk.c;
        }
        else {
            adnr2 = adnr.a;
        }
        return adnr2;
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
