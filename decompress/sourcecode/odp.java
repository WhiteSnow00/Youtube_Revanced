import android.os.StrictMode;
import android.os.Process;
import android.os.Binder;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class odp
{
    private static final afik b;
    private static final ThreadLocal c;
    
    static {
        b = afik.m("com/google/android/libraries/concurrent/blockable/BlockableFutures");
        c = new odo();
    }
    
    public static Object a(final Future future) {
        if (!odp.c.get()) {
            if (Binder.getCallingPid() != Process.myPid()) {
                final Thread currentThread = Thread.currentThread();
                if (currentThread.getName().startsWith("Binder:")) {
                    b();
                    return future.get();
                }
                final StackTraceElement[] stackTrace = currentThread.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    final int n = length - 1;
                    if (n < 0) {
                        break;
                    }
                    final StackTraceElement stackTraceElement = stackTrace[n];
                    length = n;
                    if (!Binder.class.getName().equals(stackTraceElement.getClassName())) {
                        continue;
                    }
                    length = n;
                    if ("execTransact".equals(stackTraceElement.getMethodName())) {
                        b();
                        return future.get();
                    }
                }
            }
            final IllegalStateException ex = new IllegalStateException("Cannot block on non-blocking thread: ".concat(String.valueOf(Thread.currentThread().getName())));
            final int ordinal = odq.d.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        qcj.u((Runnable)new nlk(ex, 14));
                        throw ex;
                    }
                }
                else {
                    StrictMode.noteSlowCall(ex.getMessage());
                }
            }
            else {
                c.i(((afig)odp.b).g(), "Cannot block on non-blocking thread", "com/google/android/libraries/concurrent/blockable/BlockableFutures", "validateThreadIsBlockable", 'w', "BlockableFutures.java", ex);
            }
        }
        return future.get();
    }
    
    public static void b() {
        odp.c.set(true);
    }
}
