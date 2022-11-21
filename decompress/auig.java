import java.util.concurrent.atomic.AtomicReference;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auig
{
    public static Object a(final Class clazz, final InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return clazz.cast(Proxy.newProxyInstance(auig.class.getClassLoader(), new Class[] { clazz }, invocationHandler));
    }
    
    public static final String b(final atqw atqw) {
        String s2;
        final String s = s2 = atqw.getClass().getGenericInterfaces()[0].toString();
        if (s.startsWith("kotlin.jvm.functions.")) {
            s2 = s.substring(21);
        }
        return s2;
    }
    
    public static boolean c(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
}
