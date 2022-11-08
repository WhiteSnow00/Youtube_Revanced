import android.util.Log;
import java.util.logging.Level;

// 
// Decompiled by Procyon v0.6.0
// 

final class ocy implements Runnable
{
    private final Runnable a;
    private final /* synthetic */ int b;
    
    public ocy(final Runnable a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        if (this.b != 0) {
            try {
                this.a.run();
                return;
            }
            finally {
                final Throwable t;
                ocw.a.logp(Level.SEVERE, "com.google.android.libraries.concurrent.ErrorLoggingExecutorService$LoggingRunnable", "run", "Uncaught exception from runnable", t);
                Log.e("ErrorLoggingExecutor", "Uncaught exception from runnable", t);
                return;
            }
        }
        try {
            this.a.run();
        }
        finally {
            final Thread currentThread = Thread.currentThread();
            final Throwable t2;
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, t2);
        }
    }
    
    @Override
    public final String toString() {
        if (this.b != 0) {
            return this.a.toString();
        }
        return this.a.toString();
    }
}
