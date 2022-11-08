import android.os.Build$VERSION;
import android.content.Context;
import android.graphics.Typeface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lb
{
    static Typeface a(final Typeface typeface, final int n, final boolean b) {
        return Typeface.create(typeface, n, b);
    }
    
    public static boolean b(final Context context, final String s, int i) {
        if (s == null) {
            return false;
        }
        final String[] stringArray = context.getResources().getStringArray(i);
        int length;
        for (length = stringArray.length, i = 0; i < length; ++i) {
            if (s.equals(stringArray[i])) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean c(final Context context, final String s, int i) {
        if (s == null) {
            return false;
        }
        final String[] stringArray = context.getResources().getStringArray(i);
        int length;
        for (length = stringArray.length, i = 0; i < length; ++i) {
            if (s.startsWith(stringArray[i])) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean d(final Context context, final String s, int i) {
        if (s == null) {
            return false;
        }
        final String[] stringArray = context.getResources().getStringArray(i);
        int length;
        for (length = stringArray.length, i = 0; i < length; ++i) {
            if (s.equalsIgnoreCase(stringArray[i])) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean e(final Context context, final String s) {
        return Build$VERSION.SDK_INT == 28 && c(context, s, 2130903064);
    }
}
