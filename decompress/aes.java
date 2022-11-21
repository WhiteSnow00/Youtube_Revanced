import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import android.content.pm.PackageManager;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aes
{
    static boolean a(final Activity activity) {
        return activity.isLaunchedFromBubble();
    }
    
    public static boolean b(final Activity activity, final String s) {
        try {
            return (boolean)PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), s);
        }
        catch (final NoSuchMethodException | InvocationTargetException | IllegalAccessException ex) {
            return activity.shouldShowRequestPermissionRationale(s);
        }
    }
    
    public static Typeface c(final Context context, final CancellationSignal cancellationSignal, final ogz[] array) {
        return aih.e(context, cancellationSignal, array, 0);
    }
}
