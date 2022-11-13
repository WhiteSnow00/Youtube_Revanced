import java.lang.reflect.InvocationTargetException;
import android.os.Trace;
import android.os.Build$VERSION;
import android.view.WindowInsets$Type;
import android.view.Window;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cer
{
    public static cer a;
    private static long b;
    private static Method c;
    
    static void a(final Window window) {
        window.getDecorView().getWindowInsetsController().show(WindowInsets$Type.ime());
    }
    
    public static boolean b() {
        if (Build$VERSION.SDK_INT < 29) {
            boolean booleanValue = false;
            try {
                if (cer.c == null) {
                    cer.b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    cer.c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                booleanValue = (boolean)cer.c.invoke(null, cer.b);
            }
            catch (final Exception ex) {
                if (ex instanceof InvocationTargetException) {
                    final Throwable cause = ex.getCause();
                    if (cause instanceof RuntimeException) {
                        throw (RuntimeException)cause;
                    }
                    throw new RuntimeException(cause);
                }
            }
            return booleanValue;
        }
        return cht.a();
    }
}
