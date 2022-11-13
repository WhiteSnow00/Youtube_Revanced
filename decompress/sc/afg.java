import java.util.Locale;
import android.content.Intent;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afg
{
    public static Intent a(final Activity activity) {
        return activity.getParentActivityIntent();
    }
    
    public static boolean b(final Activity activity, final Intent intent) {
        return activity.navigateUpTo(intent);
    }
    
    public static boolean c(final Activity activity, final Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
    
    public static void d(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void e(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException((String)o);
    }
    
    public static void f(final boolean b) {
        g(b, null);
    }
    
    public static void g(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    public static void h(final int n, final int n2, final int n3, final String s) {
        if (n < n2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", s, n2, n3));
        }
        if (n <= n3) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", s, n2, n3));
    }
    
    public static void i(final int n) {
        if (n >= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void j(final int n, final String s) {
        if (n >= 0) {
            return;
        }
        throw new IllegalArgumentException(s);
    }
    
    public static void k(final Object o) {
        o.getClass();
    }
    
    public static void l(final Object o, final Object o2) {
        if (o != null) {
            return;
        }
        throw new NullPointerException((String)o2);
    }
}
