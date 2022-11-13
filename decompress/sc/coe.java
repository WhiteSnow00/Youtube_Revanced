import java.io.UnsupportedEncodingException;
import android.text.Layout;
import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class coe
{
    static boolean a(final Context context) {
        return context.isDeviceProtectedStorage();
    }
    
    public static final File b(final Context context) {
        final File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        return databasePath;
    }
    
    public static int c(final Layout layout) {
        if (layout == null) {
            return 0;
        }
        return layout.getHeight();
    }
    
    public static int d(final String s) {
        if (s != null) {
            try {
                return s.getBytes("UTF-8").length;
            }
            catch (final UnsupportedEncodingException ex) {
                throw new RuntimeException();
            }
        }
        return 0;
    }
    
    public static String e(final byte[] array) {
        if (array != null) {
            try {
                return new String(array, "UTF-8");
            }
            catch (final UnsupportedEncodingException ex) {
                throw new Error(ex);
            }
        }
        return null;
    }
    
    public static byte[] f(final String s) {
        if (s != null) {
            try {
                return s.getBytes("UTF-8");
            }
            catch (final UnsupportedEncodingException ex) {
                throw new Error(ex);
            }
        }
        return null;
    }
}
