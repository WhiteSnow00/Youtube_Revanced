import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Locale;
import android.os.Build$VERSION;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aueo
{
    private static final Object a;
    private static int b;
    
    static {
        a = new Object();
    }
    
    public static String a(final Context context) {
        final StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append('/');
        synchronized (aueo.a) {
            int b;
            if ((b = aueo.b) == 0) {
                final PackageManager packageManager = context.getPackageManager();
                final String packageName = context.getPackageName();
                try {
                    b = (aueo.b = packageManager.getPackageInfo(packageName, 0).versionCode);
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    throw new IllegalStateException("Cannot determine package version");
                }
            }
            monitorexit(aueo.a);
            sb.append(b);
            sb.append(" (Linux; U; Android ");
            sb.append(Build$VERSION.RELEASE);
            sb.append("; ");
            sb.append(Locale.getDefault().toString());
            final String model = Build.MODEL;
            if (model.length() > 0) {
                sb.append("; ");
                sb.append(model);
            }
            final String id = Build.ID;
            if (id.length() > 0) {
                sb.append("; Build/");
                sb.append(id);
            }
            sb.append(";");
            b(sb);
            sb.append(')');
            return sb.toString();
        }
    }
    
    public static void b(final StringBuilder sb) {
        sb.append(" Cronet/108.0.5340.9");
    }
}
