import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build$VERSION;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class audi
{
    public static final audh a;
    
    static {
        a = new aueh();
    }
    
    private audi() {
    }
    
    public static audh a(final Context context) {
        try {
            final ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                if (applicationInfo.metaData.getBoolean("org.chromium.net.CronetMetricsOptIn") && Build$VERSION.SDK_INT >= 30) {
                    final ClassLoader classLoader = audi.class.getClassLoader();
                    Class<? extends audh> subclass;
                    try {
                        subclass = classLoader.loadClass("com.google.net.cronet.telemetry.CronetLoggerImpl").asSubclass(audh.class);
                    }
                    catch (final ClassNotFoundException ex) {
                        subclass = null;
                    }
                    if (subclass == null) {
                        return audi.a;
                    }
                    try {
                        return (audh)subclass.getConstructor(Integer.TYPE).newInstance(1);
                    }
                    catch (final Exception ex2) {
                        return audi.a;
                    }
                }
            }
            return audi.a;
        }
        catch (final PackageManager$NameNotFoundException ex3) {
            return audi.a;
        }
    }
}
