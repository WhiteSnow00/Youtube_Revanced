import java.util.Locale;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auba
{
    public static void a(final String s, final String s2, final Object o) {
        b(s, s2, o);
    }
    
    public static void b(String concat, String j, final Object... array) {
        final Throwable k = k(array);
        j = j(j, k, array);
        concat = "cr_".concat(String.valueOf(concat));
        if (k != null) {
            Log.e(concat, j, k);
            return;
        }
        Log.e(concat, j);
    }
    
    public static void c(final String s, final String s2, final Object o, final Object o2) {
        b(s, s2, o, o2);
    }
    
    public static void d(final String s, final String s2, final Object o) {
        i(s2, o);
    }
    
    public static void e(final String s, final String s2, final Object o, final Object o2) {
        i(s2, o, o2);
    }
    
    public static void f(final String s, final String s2, final Object o) {
        g(s, s2, o);
    }
    
    public static void g(String concat, String j, final Object... array) {
        final Throwable k = k(array);
        j = j(j, k, array);
        concat = "cr_".concat(String.valueOf(concat));
        if (k != null) {
            Log.w(concat, j, k);
            return;
        }
        Log.w(concat, j);
    }
    
    public static void h(final String s, final String s2, final Object o, final Object o2) {
        g(s, s2, o, o2);
    }
    
    public static void i(final String s, final Object... array) {
        j(s, k(array), array);
    }
    
    private static String j(final String s, final Throwable t, final Object... array) {
        if (t != null) {
            if (array.length <= 1) {
                return s;
            }
        }
        return String.format(Locale.US, s, array);
    }
    
    private static Throwable k(final Object[] array) {
        final Object o = array[array.length - 1];
        if (!(o instanceof Throwable)) {
            return null;
        }
        return (Throwable)o;
    }
}
