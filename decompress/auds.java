import java.lang.reflect.Method;
import android.preference.PreferenceManager;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auds
{
    public static final SharedPreferences a;
    
    static {
        final aued b = aued.b();
        try {
            final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(atpp.a);
            b.close();
            a = defaultSharedPreferences;
        }
        finally {
            Label_0058: {
                final Throwable t2;
                final Throwable t4;
                try {
                    b.close();
                    break Label_0058;
                }
                finally {
                    final Class<Throwable> clazz = Throwable.class;
                    final String s = "addSuppressed";
                    final int n = 1;
                    final Class[] array = new Class[n];
                    final int n2 = 0;
                    final Class<Throwable> clazz2 = Throwable.class;
                    array[n2] = clazz2;
                    final Method method = clazz.getDeclaredMethod(s, (Class[])array);
                    final Throwable t = t2;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t3 = t4;
                    array2[n4] = t3;
                    method.invoke(t, array2);
                }
                try {
                    final Class<Throwable> clazz = Throwable.class;
                    final String s = "addSuppressed";
                    final int n = 1;
                    final Class[] array = new Class[n];
                    final int n2 = 0;
                    final Class<Throwable> clazz2 = Throwable.class;
                    array[n2] = clazz2;
                    final Method method = clazz.getDeclaredMethod(s, (Class[])array);
                    final Throwable t = t2;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t3 = t4;
                    array2[n4] = t3;
                    method.invoke(t, array2);
                }
                catch (final Exception ex) {}
            }
        }
    }
}
