import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afcp extends RuntimeException
{
    private afcp(final Exception ex) {
        super("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", ex);
    }
    
    public static ClassCastException a(final Throwable t, final String s, final Object... array) {
        final ClassCastException ex = new ClassCastException(String.format(s, array));
        ex.initCause(t);
        return ex;
    }
    
    public static Object c(final Callable callable) {
        callable.getClass();
        try {
            return callable.call();
        }
        catch (final Exception ex) {
            throw new afcp(ex);
        }
        catch (final RuntimeException ex2) {
            throw ex2;
        }
    }
    
    @SafeVarargs
    public static void d(final String s, final Class... array) {
        for (int i = 0; i < array.length; ++i) {
            final Class clazz = array[i];
            adme.R(RuntimeException.class.isAssignableFrom(clazz) ^ true, "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", s, clazz);
        }
    }
    
    public final Exception b() {
        synchronized (this) {
            final Throwable cause = super.getCause();
            cause.getClass();
            return (Exception)cause;
        }
    }
    
    @Override
    public final /* bridge */ Throwable getCause() {
        return this.b();
    }
}
