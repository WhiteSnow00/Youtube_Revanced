import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

// 
// Decompiled by Procyon v0.6.0
// 

final class anp
{
    public static Field a;
    public static Field b;
    public static Field c;
    public static boolean d;
    
    static {
        try {
            (anp.a = View.class.getDeclaredField("mAttachInfo")).setAccessible(true);
            final Class<?> forName = Class.forName("android.view.View$AttachInfo");
            (anp.b = forName.getDeclaredField("mStableInsets")).setAccessible(true);
            (anp.c = forName.getDeclaredField("mContentInsets")).setAccessible(true);
            anp.d = true;
        }
        catch (final ReflectiveOperationException ex) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo ".concat(String.valueOf(ex.getMessage())), (Throwable)ex);
        }
    }
}
