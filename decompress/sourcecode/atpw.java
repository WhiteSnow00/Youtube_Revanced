import java.util.Iterator;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atpw
{
    private static final List a;
    
    static {
        final Iterator<CoroutineExceptionHandler> iterator = ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator();
        iterator.getClass();
        a = arxi.d((atoi)new atoh((atoi)new atol((Iterator)iterator, 2)));
    }
    
    public static final void a(final atli atli, final Throwable t) {
        for (final CoroutineExceptionHandler coroutineExceptionHandler : atpw.a) {
            try {
                coroutineExceptionHandler.handleException(atli, t);
            }
            finally {
                final Thread currentThread = Thread.currentThread();
                final Throwable t2;
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, aume.j(t, t2));
            }
        }
        final Thread currentThread2 = Thread.currentThread();
        while (true) {
            try {
                aume.l(t, (Throwable)new atqh(atli));
                currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, t);
            }
            finally {
                continue;
            }
            break;
        }
    }
}
