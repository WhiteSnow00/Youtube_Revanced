import java.util.HashMap;
import android.app.Activity;
import android.app.SharedElementCallback$OnSharedElementsReadyListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aer
{
    static void a(final Object o) {
        ((SharedElementCallback$OnSharedElementsReadyListener)o).onSharedElementsReady();
    }
    
    public static void b(final Activity activity, final String[] array, final int n) {
        activity.requestPermissions(array, n);
    }
    
    public static boolean c(final Activity activity, final String s) {
        return activity.shouldShowRequestPermissionRationale(s);
    }
    
    public static final int d(final int n) {
        final HashMap a = aju.a;
        int n2 = n;
        if (n < 30) {
            n2 = 0;
        }
        return n2;
    }
}
