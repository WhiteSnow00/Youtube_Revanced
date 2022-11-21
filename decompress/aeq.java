import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.os.Handler$Callback;
import android.os.Build$VERSION;
import android.os.Handler;
import android.os.Looper;
import android.app.SharedElementCallback;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeq
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
    
    public static Handler f(final Looper looper) {
        if (Build$VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        Handler handler = null;
        try {
            handler = Handler.class.getDeclaredConstructor(Looper.class, Handler$Callback.class, Boolean.TYPE).newInstance(looper, null, true);
            return handler;
        }
        catch (final InvocationTargetException ex) {
            final Throwable cause = ex.getCause();
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            if (cause instanceof Error) {
                throw (Error)cause;
            }
            throw new RuntimeException(cause);
        }
        catch (final NoSuchMethodException handler) {}
        catch (final InstantiationException handler) {}
        catch (final IllegalAccessException ex2) {}
        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", (Throwable)handler);
        return new Handler(looper);
    }
}
