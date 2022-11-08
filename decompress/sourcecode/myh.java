import android.content.pm.PackageManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class myh
{
    private static final phq a;
    
    static {
        a = new phq("AndroidIdProvider");
    }
    
    public static aexq a(final Context context) {
        if (ogg.d(context)) {
            myh.a.E("getAndroidId called in direct boot mode.", new Object[0]);
            return aewp.a;
        }
        final PackageManager packageManager = context.getPackageManager();
        final String packageName = context.getPackageName();
        if (packageManager.checkPermission("com.google.android.providers.gsf.permission.READ_GSERVICES", packageName) == 0) {
            return aexq.k((Object)nnx.g(context.getContentResolver(), 0L));
        }
        myh.a.E("app %s doesn't have gservice read permission", new Object[] { packageName });
        return aewp.a;
    }
}
