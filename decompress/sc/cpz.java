import android.util.Log;
import android.net.ConnectivityManager$NetworkCallback;
import android.content.Context;
import android.net.ConnectivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpz extends cpw
{
    public final ConnectivityManager e;
    private final cpy f;
    
    public cpz(final Context context, final ajb ajb, final byte[] array, final byte[] array2, final byte[] array3) {
        super(context, ajb, null, null, null);
        final Object systemService = super.a.getSystemService("connectivity");
        systemService.getClass();
        this.e = (ConnectivityManager)systemService;
        this.f = new cpy(this);
    }
    
    @Override
    public final /* bridge */ Object b() {
        return cqa.a(this.e);
    }
    
    @Override
    public final void d() {
        try {
            cms.a();
            final String a = cqa.a;
            csl.a(this.e, (ConnectivityManager$NetworkCallback)this.f);
        }
        catch (final SecurityException ex) {
            cms.a();
            Log.e(cqa.a, "Received exception while registering network callback", (Throwable)ex);
        }
        catch (final IllegalArgumentException ex2) {
            cms.a();
            Log.e(cqa.a, "Received exception while registering network callback", (Throwable)ex2);
        }
    }
    
    @Override
    public final void e() {
        try {
            cms.a();
            final String a = cqa.a;
            csj.b(this.e, (ConnectivityManager$NetworkCallback)this.f);
        }
        catch (final SecurityException ex) {
            cms.a();
            Log.e(cqa.a, "Received exception while unregistering network callback", (Throwable)ex);
        }
        catch (final IllegalArgumentException ex2) {
            cms.a();
            Log.e(cqa.a, "Received exception while unregistering network callback", (Throwable)ex2);
        }
    }
}
