import android.text.Spanned;
import android.content.Context;
import android.app.AppOpsManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aey
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
    
    public static Spanned e(final String s) {
        return akc.a(s, 63);
    }
    
    public static String f(final Spanned spanned) {
        return akc.c(spanned, 1);
    }
}
