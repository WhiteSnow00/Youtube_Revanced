import android.os.RemoteException;
import java.util.List;
import com.google.android.gms.cast.framework.media.NotificationOptions;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mme
{
    private static final mnb a;
    
    static {
        a = new mnb("MediaSessionUtils");
    }
    
    public static int a(final NotificationOptions notificationOptions, final long n) {
        int n2 = notificationOptions.l;
        if (n == 10000L) {
            n2 = notificationOptions.m;
        }
        else if (n == 30000L) {
            return notificationOptions.n;
        }
        return n2;
    }
    
    public static int b(final NotificationOptions notificationOptions, final long n) {
        int n2 = notificationOptions.z;
        if (n == 10000L) {
            n2 = notificationOptions.A;
        }
        else if (n == 30000L) {
            return notificationOptions.B;
        }
        return n2;
    }
    
    public static int c(final NotificationOptions notificationOptions, final long n) {
        int n2 = notificationOptions.o;
        if (n == 10000L) {
            n2 = notificationOptions.p;
        }
        else if (n == 30000L) {
            return notificationOptions.q;
        }
        return n2;
    }
    
    public static int d(final NotificationOptions notificationOptions, final long n) {
        int n2 = notificationOptions.C;
        if (n == 10000L) {
            n2 = notificationOptions.D;
        }
        else if (n == 30000L) {
            return notificationOptions.E;
        }
        return n2;
    }
    
    public static List e(final mkt mkt) {
        try {
            return mkt.a();
        }
        catch (final RemoteException ex) {
            mme.a.c((Throwable)ex, "Unable to call %s on %s.", "getNotificationActions", mkt.class.getSimpleName());
            return null;
        }
    }
    
    public static int[] f(final mkt mkt) {
        try {
            return mkt.b();
        }
        catch (final RemoteException ex) {
            mme.a.c((Throwable)ex, "Unable to call %s on %s.", "getCompactViewActionIndices", mkt.class.getSimpleName());
            return null;
        }
    }
}
