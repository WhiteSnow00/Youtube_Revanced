import java.util.Iterator;
import android.content.pm.PackageInstaller$SessionInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mpd
{
    static boolean a;
    static final AtomicBoolean b;
    private static boolean d;
    private static final AtomicBoolean e;
    
    static {
        b = new AtomicBoolean();
        e = new AtomicBoolean();
    }
    
    @Deprecated
    public static int a(final Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.mgoogle.android.gms", 0).versionCode;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }
    
    @Deprecated
    public static int b(final Context context, final int n) {
        return 0;
    }
    
    public static Context c(Context packageContext) {
        try {
            packageContext = packageContext.createPackageContext("com.mgoogle.android.gms", 3);
            return packageContext;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    @Deprecated
    public static void d(final Context context, final int n) {
    }
    
    public static boolean e(final Context context) {
        if (!mpd.a) {
            try {
                try {
                    final PackageInfo e = muo.b(context).e("com.mgoogle.android.gms", 64);
                    mpe.a(context);
                    if (e != null && !mpe.f(e, false) && mpe.f(e, true)) {
                        mpd.d = true;
                    }
                    else {
                        mpd.d = false;
                    }
                    mpd.a = true;
                }
                finally {}
            }
            catch (final PackageManager$NameNotFoundException ex) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", (Throwable)ex);
                mpd.a = true;
                return mpd.d || !"user".equals(Build.TYPE);
            }
            mpd.a = true;
        }
        return mpd.d || !"user".equals(Build.TYPE);
    }
    
    @Deprecated
    public static boolean f(final Context context, final int n) {
        return n == 1 && i(context);
    }
    
    @Deprecated
    public static boolean g(final int n) {
        return n == 1 || n == 2 || n == 3 || n == 9;
    }
    
    @Deprecated
    public static boolean h(final Context context, final int n, final String s) {
        return meo.D(context, n, s);
    }
    
    public static boolean i(final Context context) {
        try {
            final Iterator iterator = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (iterator.hasNext()) {
                if ("com.mgoogle.android.gms".equals(((PackageInstaller$SessionInfo)iterator.next()).getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.mgoogle.android.gms", 8192).enabled;
        }
        catch (final Exception | PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    @Deprecated
    public static String j() {
        return "CANCELED";
    }
}
