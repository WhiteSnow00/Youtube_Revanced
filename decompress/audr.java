import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class audr
{
    public static void a(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static int b(final Context context, final String s, int checkPermission, final int n) {
        try {
            checkPermission = context.checkPermission(s, checkPermission, n);
            return checkPermission;
        }
        catch (final RuntimeException ex) {
            return -1;
        }
    }
    
    public static final Integer c(final int n) {
        return new Integer(n);
    }
    
    public static boolean d(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
}
