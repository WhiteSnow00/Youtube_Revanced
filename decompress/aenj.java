import android.net.ConnectivityManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aenj implements arls
{
    private final atke a;
    
    public aenj(final atke a) {
        this.a = a;
    }
    
    public static ConnectivityManager c(final Context context) {
        final ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        connectivityManager.getClass();
        return connectivityManager;
    }
    
    public static aenj d(final atke atke) {
        return new aenj(atke);
    }
    
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final ConnectivityManager b() {
        return c((Context)((arlt)this.a).a);
    }
}
