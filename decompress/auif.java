import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auif implements InvocationHandler
{
    private final Object a;
    
    public auif(final Object a) {
        this.a = a;
    }
    
    @Override
    public final Object invoke(Object invoke, final Method method, final Object[] array) {
        final ClassLoader classLoader = this.a.getClass().getClassLoader();
        try {
            invoke = Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.a, array);
            return invoke;
        }
        catch (final ReflectiveOperationException ex) {
            new StringBuilder("Reflection failed for method ").append(method);
            throw new RuntimeException("Reflection failed for method ".concat(String.valueOf(method)), ex);
        }
        catch (final InvocationTargetException ex2) {
            throw ex2.getTargetException();
        }
    }
}
