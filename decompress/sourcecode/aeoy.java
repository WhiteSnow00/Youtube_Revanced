import android.net.NetworkInfo;
import android.net.NetworkInfo$DetailedState;
import android.os.Process;
import android.content.Context;
import android.net.ConnectivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeoy implements aeow
{
    private final ConnectivityManager a;
    private final /* synthetic */ int b;
    
    public aeoy(final Context context, final ConnectivityManager a, final int b) {
        this.b = b;
        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) == 0) {
            agot.E(context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0, (Object)"An app using the NETWORK_UNMETERED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.a = a;
    }
    
    public aeoy(final Context context, final ConnectivityManager a, final int b, final byte[] array) {
        this.b = b;
        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) == 0) {
            agot.E(context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0, (Object)"An app using the NETWORK_CONNECTED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.a = a;
    }
    
    public final boolean a() {
        if (this.b != 0) {
            final NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getDetailedState() != NetworkInfo$DetailedState.BLOCKED;
        }
        final boolean a = ajf.a(this.a);
        final NetworkInfo activeNetworkInfo2 = this.a.getActiveNetworkInfo();
        return !a && activeNetworkInfo2 != null && activeNetworkInfo2.isConnected() && activeNetworkInfo2.getDetailedState() != NetworkInfo$DetailedState.BLOCKED;
    }
}
