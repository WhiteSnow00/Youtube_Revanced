import java.lang.reflect.InvocationTargetException;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class dnd
{
    public static dnb a(String instance) {
        try {
            final Class<?> forName = Class.forName(instance);
            instance = null;
            try {
                instance = (String)forName.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            }
            catch (final InvocationTargetException ex) {
                b(forName, ex);
            }
            catch (final NoSuchMethodException ex2) {
                b(forName, ex2);
            }
            catch (final IllegalAccessException ex3) {
                b(forName, ex3);
            }
            catch (final InstantiationException ex4) {
                b(forName, ex4);
            }
            if (instance instanceof dnb) {
                return (dnb)instance;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: ".concat(String.valueOf(String.valueOf(instance))));
        }
        catch (final ClassNotFoundException ex5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", ex5);
        }
    }
    
    private static void b(final Class clazz, final Exception ex) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(String.valueOf(clazz))), ex);
    }
}
