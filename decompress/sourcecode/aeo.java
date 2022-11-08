import android.content.res.Configuration;
import android.app.SharedElementCallback;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeo
{
    public static void a(final Activity activity) {
        activity.finishAfterTransition();
    }
    
    public static void b(final Activity activity) {
        activity.postponeEnterTransition();
    }
    
    public static void c(final Activity activity, final SharedElementCallback enterSharedElementCallback) {
        activity.setEnterSharedElementCallback(enterSharedElementCallback);
    }
    
    public static void d(final Activity activity, final SharedElementCallback exitSharedElementCallback) {
        activity.setExitSharedElementCallback(exitSharedElementCallback);
    }
    
    public static void e(final Activity activity) {
        activity.startPostponedEnterTransition();
    }
    
    public static ajo f(final Configuration configuration) {
        return ajo.e(ajl.a(configuration));
    }
}
