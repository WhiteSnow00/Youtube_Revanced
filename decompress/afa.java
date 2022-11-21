import java.util.Locale;
import android.content.Context;
import android.app.AppOpsManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afa
{
    static int a(final AppOpsManager appOpsManager, final String s, final String s2) {
        return appOpsManager.noteProxyOp(s, s2);
    }
    
    public static int b(final AppOpsManager appOpsManager, final String s, final String s2) {
        return appOpsManager.noteProxyOpNoThrow(s, s2);
    }
    
    public static Object c(final Context context, final Class clazz) {
        return context.getSystemService(clazz);
    }
    
    public static String d(final String s) {
        return AppOpsManager.permissionToOp(s);
    }
    
    public static String e(final Locale locale) {
        return akf.c((Object)akf.a((Object)akf.b(locale)));
    }
}
