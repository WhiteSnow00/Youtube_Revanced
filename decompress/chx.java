import java.io.File;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import android.os.Trace;
import android.os.Build$VERSION;
import android.animation.Animator$AnimatorPauseListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.Animator;
import java.util.Collections;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chx
{
    private static long a;
    private static Method b;
    
    public chx() {
        Collections.emptyList();
        Collections.emptyList();
    }
    
    static void a(final Animator animator, final AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener((Animator$AnimatorPauseListener)animatorListenerAdapter);
    }
    
    static void b(final Animator animator) {
        animator.pause();
    }
    
    static void c(final Animator animator) {
        animator.resume();
    }
    
    public static boolean d() {
        if (Build$VERSION.SDK_INT < 29) {
            final boolean b = false;
            boolean booleanValue;
            try {
                if (chx.b == null) {
                    chx.a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    chx.b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                booleanValue = (boolean)chx.b.invoke(null, chx.a);
            }
            catch (final Exception ex) {
                booleanValue = b;
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
        return chw.a();
    }
    
    public static final File e(final Context context) {
        final File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        return databasePath;
    }
}
