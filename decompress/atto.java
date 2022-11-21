import java.util.Iterator;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atto
{
    private static final List a;
    
    static {
        final Iterator<CoroutineExceptionHandler> iterator = ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator();
        iterator.getClass();
        a = asbq.e((atsa)new atrz(new atsd(iterator, 2)));
    }
    
    public static final void a(final atpa atpa, final Throwable t) {
        for (final CoroutineExceptionHandler coroutineExceptionHandler : atto.a) {
            try {
                coroutineExceptionHandler.handleException(atpa, t);
            }
            finally {
                final Thread currentThread = Thread.currentThread();
                final Throwable t2;
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, asjv.e(t, t2));
            }
        }
        final Thread currentThread2 = Thread.currentThread();
        while (true) {
            try {
                aqvr.w(t, (Throwable)new attz(atpa));
                currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, t);
            }
            finally {
                continue;
            }
            break;
        }
    }
}
