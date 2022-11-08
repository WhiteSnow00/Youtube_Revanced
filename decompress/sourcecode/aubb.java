import java.util.concurrent.ExecutionException;
import org.chromium.base.ThreadUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubb implements aubc
{
    private final Map a;
    
    public aubb() {
        this.a = new HashMap();
    }
    
    private final auaz b() {
        synchronized (this) {
            final xmm i = xmm.i;
            try {
                final FutureTask futureTask = new FutureTask((Callable<Object>)i);
                if (ThreadUtils.c()) {
                    futureTask.run();
                }
                else {
                    ThreadUtils.a().post((Runnable)futureTask);
                }
                try {
                    return (auaz)futureTask.get();
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
    
    public final void a(final aubg aubg, final Runnable runnable) {
        synchronized (this) {
            Object b;
            if ((b = this.a.get(aubg)) == null) {
                if (aubg.k) {
                    b = this.b();
                }
                else {
                    b = new aubf(aubg);
                }
                this.a.put(aubg, b);
            }
            ((aubd)b).a(runnable);
        }
    }
}
