import java.util.Locale;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class audx
{
    public static String a(final String s) {
        if (s.startsWith("cr_")) {
            return s;
        }
        int n;
        if (!s.startsWith("cr.")) {
            n = 0;
        }
        else {
            n = 3;
        }
        return "cr_".concat(String.valueOf(s.substring(n, s.length())));
    }
    
    public static void b(final String s, String e, final Object... array) {
        final Throwable f = f(array);
        e = e(e, f, array);
        if (f != null) {
            Log.e(a(s), e, f);
            return;
        }
        Log.e(a(s), e);
    }
    
    public static void c(final String s, final String s2, final Object... array) {
        final Throwable f = f(array);
        e(s2, f, array);
        if (f != null) {
            a(s);
            return;
        }
        a(s);
    }
    
    public static void d(final String s, String e, final Object... array) {
        final Throwable f = f(array);
        e = e(e, f, array);
        if (f != null) {
            Log.w(a(s), e, f);
            return;
        }
        Log.w(a(s), e);
    }
    
    private static String e(final String s, final Throwable t, final Object... array) {
        if (t != null || array.length <= 0) {
            final String format = s;
            if (array.length <= 1) {
                return format;
            }
        }
        return String.format(Locale.US, s, array);
    }
    
    private static Throwable f(final Object[] array) {
        final int length = array.length;
        if (length == 0) {
            return null;
        }
        final Object o = array[length - 1];
        if (!(o instanceof Throwable)) {
            return null;
        }
        return (Throwable)o;
    }
}
