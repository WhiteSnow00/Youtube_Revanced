import android.os.AsyncTask;
import android.app.Service;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.CastOptions;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mkb
{
    static {
        new mnb("CastDynamiteModule");
    }
    
    public static mja a(final Context context, final CastOptions castOptions, final mvn mvn, final miw miw) {
        if (mvn == null) {
            return null;
        }
        try {
            return c(context).b(castOptions, mvn, miw);
        }
        catch (final RemoteException | mjk remoteException | mjk) {
            return null;
        }
    }
    
    public static mje b(final Service service, final mvn mvn, final mvn mvn2) {
        if (mvn != null) {
            if (mvn2 != null) {
                try {
                    return c(service.getApplicationContext()).g(mvm.a((Object)service), mvn, mvn2);
                }
                catch (final RemoteException | mjk remoteException | mjk) {}
            }
        }
        return null;
    }
    
    public static mkd c(final Context context) {
        return null;
    }
    
    public static mjg d(final Context context, final String s, final String s2, final mhb mhb) {
        try {
            return c(context).h(s, s2, mhb);
        }
        catch (final RemoteException | mjk remoteException | mjk) {
            return null;
        }
    }
    
    public static mlz e(final Context context, final AsyncTask asyncTask, final mhb mhb, final int n, final int n2) {
        try {
            return c(context.getApplicationContext()).i(mvm.a((Object)asyncTask), mhb, n, n2);
        }
        catch (final RemoteException | mjk remoteException | mjk) {
            return null;
        }
    }
}
