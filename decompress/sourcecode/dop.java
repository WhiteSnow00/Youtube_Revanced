import android.content.pm.PackageInfo;
import java.util.UUID;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dop
{
    private static final ConcurrentMap a;
    
    static {
        a = (ConcurrentMap)new ConcurrentHashMap();
    }
    
    public static ddj a(Context packageInfo) {
        final String packageName = packageInfo.getPackageName();
        ddj ddj;
        if ((ddj = (ddj)dop.a.get(packageName)) == null) {
            try {
                packageInfo = (Context)packageInfo.getPackageManager().getPackageInfo(packageInfo.getPackageName(), 0);
            }
            catch (final PackageManager$NameNotFoundException ex) {
                Log.e("AppVersionSignature", "Cannot resolve info for".concat(String.valueOf(packageInfo.getPackageName())), (Throwable)ex);
                packageInfo = null;
            }
            String s;
            if (packageInfo != null) {
                s = String.valueOf(((PackageInfo)packageInfo).versionCode);
            }
            else {
                s = UUID.randomUUID().toString();
            }
            final dor dor = new dor((Object)s);
            ddj = dop.a.putIfAbsent(packageName, dor);
            if (ddj == null) {
                return (ddj)dor;
            }
        }
        return ddj;
    }
}
