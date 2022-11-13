import android.content.Context;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.util.Log;
import android.net.ConnectivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cqa
{
    public static final String a;
    
    static {
        a = cms.b("NetworkStateTracker");
    }
    
    public static final cpb a(final ConnectivityManager connectivityManager) {
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
        Label_0073: {
            try {
                final NetworkCapabilities a = csj.a(connectivityManager, csk.a(connectivityManager));
                if (a != null) {
                    c = csj.c(a, 16);
                    break Label_0073;
                }
            }
            catch (final SecurityException ex) {
                cms.a();
                Log.e(cqa.a, "Unable to validate active network", (Throwable)ex);
            }
            c = false;
        }
        final boolean a2 = ajg.a(connectivityManager);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            b = false;
        }
        return new cpb(b2, c, a2, b);
    }
    
    public static final cpw b(final Context context, final ajb ajb) {
        return new cpz(context, ajb, null, null, null);
    }
}
