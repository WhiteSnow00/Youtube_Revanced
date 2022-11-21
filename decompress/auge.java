import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build$VERSION;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auge
{
    public static final augd a;
    
    static {
        a = new auhd();
    }
    
    private auge() {
    }
    
    public static augd a(final Context context) {
        try {
            final ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                if (applicationInfo.metaData.getBoolean("org.chromium.net.CronetMetricsOptIn") && Build$VERSION.SDK_INT >= 30) {
                    final ClassLoader classLoader = auge.class.getClassLoader();
                    Class<? extends augd> subclass;
                    try {
                        subclass = classLoader.loadClass("com.google.net.cronet.telemetry.CronetLoggerImpl").asSubclass(augd.class);
                    }
                    catch (final ClassNotFoundException ex) {
                        subclass = null;
                    }
                    if (subclass == null) {
                        return auge.a;
                    }
                    try {
                        return (augd)subclass.getConstructor(Integer.TYPE).newInstance(1);
                    }
                    catch (final Exception ex2) {
                        return auge.a;
                    }
                }
            }
            return auge.a;
        }
        catch (final PackageManager$NameNotFoundException ex3) {
            return auge.a;
        }
    }
}
