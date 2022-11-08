import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeyv
{
    private static final Object a;
    
    static {
        final Object o = a = f();
        if (o != null) {
            g("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (o == null) {
            return;
        }
        h(o);
    }
    
    public static String a(final Throwable t) {
        final StringWriter stringWriter = new StringWriter();
        t.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
    
    public static Throwable b(Throwable t) {
        int n = 0;
        final Throwable t2 = t;
        Throwable t3 = t;
        t = t2;
        while (true) {
            final Throwable cause = t3.getCause();
            if (cause == null) {
                return t3;
            }
            if (cause == t) {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause);
            }
            Throwable cause2 = t;
            if (n != 0) {
                cause2 = t.getCause();
            }
            n ^= 0x1;
            t = cause2;
            t3 = cause;
        }
    }
    
    public static void c(final Throwable t, final Class clazz) {
        d(t, clazz);
        e(t);
    }
    
    public static void d(final Throwable t, final Class clazz) {
        if (!clazz.isInstance(t)) {
            return;
        }
        throw (Throwable)clazz.cast(t);
    }
    
    public static void e(final Throwable t) {
        if (t instanceof RuntimeException) {
            throw (RuntimeException)t;
        }
        if (!(t instanceof Error)) {
            return;
        }
        throw (Error)t;
    }
    
    private static Object f() {
        Object invoke = null;
        try {
            invoke = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
            return invoke;
        }
        catch (final ThreadDeath invoke) {
            throw invoke;
        }
        finally {
            return invoke;
        }
    }
    
    private static Method g(final String s, final Class... array) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(s, (Class<?>[])array);
        }
        catch (final ThreadDeath threadDeath) {
            throw threadDeath;
        }
        finally {
            return null;
        }
    }
    
    private static void h(final Object o) {
        try {
            final Method g = g("getStackTraceDepth", Throwable.class);
            if (g == null) {
                return;
            }
            g.invoke(o, new Throwable());
        }
        catch (final UnsupportedOperationException | IllegalAccessException | InvocationTargetException ex) {}
    }
}
