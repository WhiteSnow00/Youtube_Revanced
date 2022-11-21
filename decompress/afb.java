import android.content.Context;
import android.app.AppOpsManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afb
{
    public static int a(final AppOpsManager appOpsManager, final String s, final int n, final String s2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(s, n, s2);
    }
    
    public static AppOpsManager b(final Context context) {
        return (AppOpsManager)context.getSystemService((Class)AppOpsManager.class);
    }
    
    public static String c(final Context context) {
        return context.getOpPackageName();
    }
    
    public static void d(final Object o, final String s) {
        if (o != null) {
            return;
        }
        throw new NullPointerException(s);
    }
}
