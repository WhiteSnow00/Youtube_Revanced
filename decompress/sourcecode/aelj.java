import android.net.ConnectivityManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aelj implements arjd
{
    private final atjj a;
    
    public aelj(final atjj a) {
        this.a = a;
    }
    
    public static ConnectivityManager c(final Context context) {
        final ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        connectivityManager.getClass();
        return connectivityManager;
    }
    
    public static aelj d(final atjj atjj) {
        return new aelj(atjj);
    }
    
    public final ConnectivityManager b() {
        return c((Context)((arje)this.a).a);
    }
}
