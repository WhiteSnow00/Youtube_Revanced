import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build$VERSION;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aucr
{
    public static final aucq a;
    
    static {
        a = (aucq)new audq();
    }
    
    private aucr() {
    }
    
    public static aucq a(final Context context) {
        try {
            final ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                if (applicationInfo.metaData.getBoolean("org.chromium.net.CronetMetricsOptIn") && Build$VERSION.SDK_INT >= 30) {
                    final ClassLoader classLoader = aucr.class.getClassLoader();
                    Class<? extends aucq> subclass;
                    try {
                        subclass = classLoader.loadClass("com.google.net.cronet.telemetry.CronetLoggerImpl").asSubclass(aucq.class);
                    }
                    catch (final ClassNotFoundException ex) {
                        subclass = null;
                    }
                    if (subclass == null) {
                        return aucr.a;
                    }
                    try {
                        return (aucq)subclass.getConstructor(Integer.TYPE).newInstance(1);
                    }
                    catch (final Exception ex2) {
                        return aucr.a;
                    }
                }
            }
            return aucr.a;
        }
        catch (final PackageManager$NameNotFoundException ex3) {
            return aucr.a;
        }
    }
}
