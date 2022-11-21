import android.net.ConnectivityManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aepc implements arom
{
    private final atnb a;
    
    public aepc(final atnb a) {
        this.a = a;
    }
    
    public static ConnectivityManager c(final Context context) {
        final ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        connectivityManager.getClass();
        return connectivityManager;
    }
    
    public static aepc d(final atnb atnb) {
        return new aepc(atnb);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final ConnectivityManager b() {
        return c((Context)((aron)this.a).a);
    }
}
