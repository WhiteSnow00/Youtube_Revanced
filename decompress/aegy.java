import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.os.Bundle;
import android.content.Context;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aegy
{
    private static final String e = "aegy";
    public final String a;
    public final String b;
    public final int c;
    public final Resources d;
    
    public aegy(final String a, final String b, final int c, final Resources d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static aegy a(final Context context, final Bundle bundle) {
        if (bundle.containsKey("packageName") && bundle.containsKey("resourceName")) {
            if (bundle.containsKey("resourceId")) {
                final String string = bundle.getString("packageName");
                final String string2 = bundle.getString("resourceName");
                final int int1 = bundle.getInt("resourceId");
                try {
                    final PackageManager packageManager = context.getPackageManager();
                    return new aegy(string, string2, int1, packageManager.getResourcesForApplication(packageManager.getApplicationInfo(string, 512)));
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    final Bundle bundle2 = bundle.getBundle("fallbackConfig");
                    if (bundle2 != null) {
                        final String e = aegy.e;
                        final StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        sb.append(" not found, ");
                        sb.append(string2);
                        sb.append(" fallback to default value");
                        Log.w(e, sb.toString());
                        return a(context, bundle2);
                    }
                }
            }
        }
        return null;
    }
}
