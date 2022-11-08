import android.util.Log;
import android.net.ConnectivityManager$NetworkCallback;
import android.content.Context;
import android.net.ConnectivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpy extends cpv
{
    public final ConnectivityManager e;
    private final cpx f;
    
    public cpy(final Context context, final aja aja, final byte[] array, final byte[] array2, final byte[] array3) {
        super(context, aja, (byte[])null, (byte[])null, (byte[])null);
        final Object systemService = super.a.getSystemService("connectivity");
        systemService.getClass();
        this.e = (ConnectivityManager)systemService;
        this.f = new cpx(this);
    }
    
    public final void d() {
        try {
            cmr.a();
            final String a = cpz.a;
            csk.a(this.e, (ConnectivityManager$NetworkCallback)this.f);
        }
        catch (final SecurityException ex) {
            cmr.a();
            Log.e(cpz.a, "Received exception while registering network callback", (Throwable)ex);
        }
        catch (final IllegalArgumentException ex2) {
            cmr.a();
            Log.e(cpz.a, "Received exception while registering network callback", (Throwable)ex2);
        }
    }
    
    public final void e() {
        try {
            cmr.a();
            final String a = cpz.a;
            csi.b(this.e, (ConnectivityManager$NetworkCallback)this.f);
        }
        catch (final SecurityException ex) {
            cmr.a();
            Log.e(cpz.a, "Received exception while unregistering network callback", (Throwable)ex);
        }
        catch (final IllegalArgumentException ex2) {
            cmr.a();
            Log.e(cpz.a, "Received exception while unregistering network callback", (Throwable)ex2);
        }
    }
}
