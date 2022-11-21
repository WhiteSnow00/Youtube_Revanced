import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afxa
{
    private static final afjr a;
    
    static {
        a = new afdv(new afwx(), (afjr)afjm.a).c();
    }
    
    public static Object a(final Future future, final Class clazz) {
        final int a = afwz.a;
        final Iterator iterator = afwy.b.iterator();
        while (true) {
            while (iterator.hasNext()) {
                if (clazz.equals(((WeakReference<Object>)iterator.next()).get())) {
                    try {
                        return future.get();
                    }
                    catch (final ExecutionException ex) {
                        final Throwable cause = ex.getCause();
                        if (cause instanceof Error) {
                            throw new afwe((Error)cause);
                        }
                        if (cause instanceof RuntimeException) {
                            throw new afyd(cause);
                        }
                        throw b(clazz, cause);
                    }
                    catch (final InterruptedException ex2) {
                        Thread.currentThread().interrupt();
                        throw b(clazz, ex2);
                    }
                }
            }
            adme.P(RuntimeException.class.isAssignableFrom(clazz) ^ true, "Futures.getChecked exception type (%s) must not be a RuntimeException", clazz);
            adme.P(d(clazz), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", clazz);
            if (afwy.b.size() > 1000) {
                afwy.b.clear();
            }
            afwy.b.add(new WeakReference(clazz));
            continue;
        }
    }
    
    private static Exception b(final Class clazz, final Throwable t) {
        final List<Constructor> list = Arrays.asList(clazz.getConstructors());
        final afjr a = afxa.a;
        final Object[] ar = agpx.ar(list);
        Arrays.sort(ar, a);
        final Iterator iterator = agpx.N(Arrays.asList(ar)).iterator();
        while (iterator.hasNext()) {
            final Exception ex = (Exception)c((Constructor)iterator.next(), t);
            if (ex != null) {
                if (ex.getCause() == null) {
                    ex.initCause(t);
                }
                return ex;
            }
        }
        final String string = clazz.toString();
        final StringBuilder sb = new StringBuilder("No appropriate constructor for exception of type ");
        sb.append(string);
        sb.append(" in response to chained exception");
        throw new IllegalArgumentException(sb.toString(), t);
    }
    
    private static Object c(final Constructor constructor, final Throwable t) {
        final Class[] parameterTypes = constructor.getParameterTypes();
        final Object[] array = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; ++i) {
            final Class clazz = parameterTypes[i];
            if (clazz.equals(String.class)) {
                array[i] = t.toString();
            }
            else {
                if (!clazz.equals(Throwable.class)) {
                    return null;
                }
                array[i] = t;
            }
        }
        try {
            return constructor.newInstance(array);
        }
        catch (final IllegalArgumentException | InstantiationException | IllegalAccessException | InvocationTargetException ex) {
            return null;
        }
    }
    
    private static boolean d(final Class clazz) {
        try {
            b(clazz, new Exception());
            return true;
        }
        catch (final RuntimeException | Error runtimeException | Error) {
            return false;
        }
    }
}
