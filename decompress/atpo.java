import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atpo
{
    public static final Method a;
    
    static {
        final Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        final int n = 0;
        int n2 = 0;
        int length;
        Method a2;
        while (true) {
            length = methods.length;
            a2 = null;
            final Object o = null;
            if (n2 >= length) {
                break;
            }
            final Method method = methods[n2];
            if (atqz.c(method.getName(), "addSuppressed")) {
                final Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                Object o2 = o;
                if (parameterTypes.length == 1) {
                    o2 = parameterTypes[0];
                }
                if (atqz.c(o2, Throwable.class)) {
                    a2 = method;
                    break;
                }
            }
            ++n2;
        }
        a = a2;
        for (int n3 = n; n3 < length && !atqz.c(methods[n3].getName(), "getSuppressed"); ++n3) {}
    }
}
