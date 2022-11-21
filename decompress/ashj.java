import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ashj implements asfk
{
    public static final RuntimeException a;
    private static final Logger b;
    private static final Constructor c;
    private static final Method d;
    private static final Object[] e;
    private final Object f;
    
    static {
        b = Logger.getLogger(ashj.class.getName());
        Object constructors = null;
        Method d2 = null;
        Method c2 = null;
        Label_0140: {
            try {
                final Class<?> forName = Class.forName("java.util.concurrent.atomic.LongAdder");
                final Method method = forName.getMethod("add", Long.TYPE);
                try {
                    forName.getMethod("sum", (Class[])new Class[0]);
                    for (final Constructor constructor : forName.getConstructors()) {
                        if (constructor.getParameterTypes().length == 0) {
                            constructors = null;
                            d2 = method;
                            break Label_0140;
                        }
                    }
                    Constructor constructor = null;
                }
                finally {}
            }
            finally {
                c2 = null;
            }
            final Throwable t;
            ashj.b.logp(Level.FINE, "io.grpc.internal.ReflectionLongAdderCounter", "<clinit>", "LongAdder can not be found via reflection, this is normal for JDK7 and below", t);
            final Method method2 = null;
            d2 = c2;
            c2 = method2;
            constructors = t;
        }
        if (constructors == null && c2 != null) {
            c = (Constructor)c2;
            d = d2;
            a = null;
        }
        else {
            c = null;
            d = null;
            a = new RuntimeException((Throwable)constructors);
        }
        e = new Object[] { 1L };
    }
    
    public ashj() {
        final RuntimeException a = ashj.a;
        if (a == null) {
            try {
                this.f = ashj.c.newInstance(new Object[0]);
                return;
            }
            catch (final InvocationTargetException ex) {
                throw new RuntimeException(ex);
            }
            catch (final IllegalAccessException ex2) {
                throw new RuntimeException(ex2);
            }
            catch (final InstantiationException ex3) {
                throw new RuntimeException(ex3);
            }
        }
        throw a;
    }
    
    public final void a() {
        try {
            ashj.d.invoke(this.f, ashj.e);
        }
        catch (final InvocationTargetException ex) {
            throw new RuntimeException(ex);
        }
        catch (final IllegalAccessException ex2) {
            throw new RuntimeException(ex2);
        }
    }
}
