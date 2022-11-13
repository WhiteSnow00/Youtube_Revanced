import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asen implements asco
{
    public static final RuntimeException a;
    private static final Logger b;
    private static final Constructor c;
    private static final Method d;
    private static final Object[] e;
    private final Object f;
    
    static {
        b = Logger.getLogger(asen.class.getName());
        Object constructors = null;
        Throwable t = null;
        Method d2 = null;
        Label_0128: {
            try {
                final Class<?> forName = Class.forName("java.util.concurrent.atomic.LongAdder");
                forName.getMethod("add", Long.TYPE);
                try {
                    forName.getMethod("sum", (Class<?>[])new Class[0]);
                    for (final Constructor constructor : forName.getConstructors()) {
                        if (constructor.getParameterTypes().length == 0) {
                            t = null;
                            constructors = constructor;
                            break Label_0128;
                        }
                    }
                    Constructor constructor = null;
                }
                finally {}
            }
            finally {
                d2 = null;
            }
            final Throwable t2;
            asen.b.logp(Level.FINE, "io.grpc.internal.ReflectionLongAdderCounter", "<clinit>", "LongAdder can not be found via reflection, this is normal for JDK7 and below", t2);
            constructors = null;
            t = t2;
        }
        if (t == null && constructors != null) {
            c = (Constructor)constructors;
            d = d2;
            a = null;
        }
        else {
            c = null;
            d = null;
            a = new RuntimeException(t);
        }
        e = new Object[] { 1L };
    }
    
    public asen() {
        final RuntimeException a = asen.a;
        if (a == null) {
            try {
                this.f = asen.c.newInstance(new Object[0]);
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
            asen.d.invoke(this.f, asen.e);
        }
        catch (final InvocationTargetException ex) {
            throw new RuntimeException(ex);
        }
        catch (final IllegalAccessException ex2) {
            throw new RuntimeException(ex2);
        }
    }
}
