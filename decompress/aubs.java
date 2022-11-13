import java.util.concurrent.ExecutionException;
import org.chromium.base.ThreadUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubs implements aubt
{
    private final Map a;
    
    public aubs() {
        this.a = new HashMap();
    }
    
    private final aubq b() {
        synchronized (this) {
            final xok i = xok.i;
            try {
                final FutureTask futureTask = new FutureTask((Callable<Object>)i);
                if (ThreadUtils.c()) {
                    futureTask.run();
                }
                else {
                    ThreadUtils.a().post((Runnable)futureTask);
                }
                try {
                    return (aubq)futureTask.get();
                }
                catch (final InterruptedException ex) {
                    throw new RuntimeException("Interrupted waiting for callable", ex);
                }
            }
            catch (final ExecutionException ex2) {
                throw new RuntimeException("Error occurred waiting for callable", ex2);
            }
        }
    }
    
    @Override
    public final void a(final aubx aubx, final Runnable runnable) {
        synchronized (this) {
            aubu b;
            if ((b = this.a.get(aubx)) == null) {
                if (aubx.k) {
                    b = this.b();
                }
                else {
                    b = new aubw(aubx);
                }
                this.a.put(aubx, b);
            }
            b.a(runnable);
        }
    }
}
