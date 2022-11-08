import android.net.Network;
import android.net.ConnectivityManager$NetworkCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dmv extends ConnectivityManager$NetworkCallback
{
    final /* synthetic */ acko a;
    
    public dmv(final acko a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    private final void a(final boolean b) {
        dpg.l(new dmu(this, b, 0));
    }
    
    public final void onAvailable(final Network network) {
        this.a(true);
    }
    
    public final void onLost(final Network network) {
        this.a(false);
    }
}
