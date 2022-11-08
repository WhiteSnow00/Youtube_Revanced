import android.content.Context;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.util.Log;
import android.net.ConnectivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpz
{
    public static final String a;
    
    static {
        a = cmr.b("NetworkStateTracker");
    }
    
    public static final cpa a(final ConnectivityManager connectivityManager) {
        final NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean b = true;
        boolean b2;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        boolean c = false;
        Label_0072: {
            try {
                final NetworkCapabilities a = csi.a(connectivityManager, csj.a(connectivityManager));
                if (a != null) {
                    c = csi.c(a, 16);
                    break Label_0072;
                }
            }
            catch (final SecurityException ex) {
                cmr.a();
                Log.e(cpz.a, "Unable to validate active network", (Throwable)ex);
            }
            c = false;
        }
        final boolean a2 = ajf.a(connectivityManager);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            b = false;
        }
        return new cpa(b2, c, a2, b);
    }
    
    public static final cpv b(final Context context, final aja aja) {
        return (cpv)new cpy(context, aja, (byte[])null, (byte[])null, (byte[])null);
    }
}
