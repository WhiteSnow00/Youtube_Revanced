import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atle
{
    public static final Throwable a;
    
    static {
        a = new atld();
    }
    
    public static Exception a(final Throwable t) {
        if (t instanceof Exception) {
            return (Exception)t;
        }
        throw t;
    }
    
    public static RuntimeException b(final Throwable t) {
        if (t instanceof Error) {
            throw (Error)t;
        }
        if (t instanceof RuntimeException) {
            return (RuntimeException)t;
        }
        return new RuntimeException(t);
    }
    
    public static String c(final long n, final TimeUnit timeUnit) {
        final String lowerCase = timeUnit.toString().toLowerCase();
        final StringBuilder sb = new StringBuilder("The source did not signal an event for ");
        sb.append(n);
        sb.append(" ");
        sb.append(lowerCase);
        sb.append(" and has been terminated.");
        return sb.toString();
    }
    
    public static Throwable d(final AtomicReference atomicReference) {
        final Throwable t = atomicReference.get();
        final Throwable a = atle.a;
        if (t != a) {
            return atomicReference.getAndSet(a);
        }
        return t;
    }
    
    public static boolean e(final AtomicReference atomicReference, final Throwable t) {
    Label_0000:
        while (true) {
            final Throwable t2 = atomicReference.get();
            if (t2 == atle.a) {
                return false;
            }
            Throwable t3;
            if (t2 == null) {
                t3 = t;
            }
            else {
                t3 = new aslv(new Throwable[] { t2, t });
            }
            while (!atomicReference.compareAndSet(t2, t3)) {
                if (atomicReference.get() != t2) {
                    continue Label_0000;
                }
            }
            return true;
        }
    }
}
