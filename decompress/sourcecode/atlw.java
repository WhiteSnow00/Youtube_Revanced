import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atlw
{
    public static final Method a;
    
    static {
        final Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        final int length = methods.length;
        final int n = 0;
        int n2 = 0;
        Method a2;
        while (true) {
            a2 = null;
            final Object o = null;
            if (n2 >= length) {
                break;
            }
            final Method method = methods[n2];
            if (atnh.c(method.getName(), "addSuppressed")) {
                final Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                final Object[] array = parameterTypes;
                Object o2 = o;
                if (array.length == 1) {
                    o2 = array[0];
                }
                if (atnh.c(o2, Throwable.class)) {
                    a2 = method;
                    break;
                }
            }
            ++n2;
        }
        a = a2;
        for (int length2 = methods.length, n3 = n; n3 < length2 && !atnh.c(methods[n3].getName(), "getSuppressed"); ++n3) {}
    }
}
