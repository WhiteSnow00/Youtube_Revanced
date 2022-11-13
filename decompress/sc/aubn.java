import java.util.concurrent.atomic.AtomicReference;
import java.io.Closeable;
import java.lang.reflect.Method;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubn
{
    public static Context a(Context contextForSplit, final String s) {
        final aubg a = aubg.a();
        try {
            contextForSplit = ((Context)contextForSplit).createContextForSplit(s);
            a.close();
            return (Context)contextForSplit;
        }
        finally {
            Label_0054: {
                final Throwable t2;
                try {
                    a.close();
                    break Label_0054;
                }
                finally {
                    final Class<Throwable> clazz = Throwable.class;
                    final String s2 = "addSuppressed";
                    final int n = 1;
                    final Class[] array = new Class[n];
                    final int n2 = 0;
                    final Class<Throwable> clazz2 = Throwable.class;
                    array[n2] = clazz2;
                    final Method method = clazz.getDeclaredMethod(s2, (Class[])array);
                    final Object o = contextForSplit;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t = t2;
                    array2[n4] = t;
                    method.invoke(o, array2);
                }
                try {
                    final Class<Throwable> clazz = Throwable.class;
                    final String s2 = "addSuppressed";
                    final int n = 1;
                    final Class[] array = new Class[n];
                    final int n2 = 0;
                    final Class<Throwable> clazz2 = Throwable.class;
                    array[n2] = clazz2;
                    final Method method = clazz.getDeclaredMethod(s2, (Class[])array);
                    final Object o = contextForSplit;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t = t2;
                    array2[n4] = t;
                    method.invoke(o, array2);
                }
                catch (final Exception ex) {}
            }
        }
    }
    
    public static void b(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static final void c(final Closeable closeable, final Throwable t) {
        if (closeable != null) {
            if (t == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            }
            finally {
                final Throwable t2;
                aqsy.v(t, t2);
            }
        }
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
