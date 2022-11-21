import java.util.concurrent.ExecutionException;
import org.chromium.base.ThreadUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auep implements aueq
{
    private final Map a;
    
    public auep() {
        this.a = new HashMap();
    }
    
    private final auen b() {
        synchronized (this) {
            final vcs j = vcs.j;
            try {
                final FutureTask futureTask = new FutureTask((Callable<Object>)j);
                if (ThreadUtils.c()) {
                    futureTask.run();
                }
                else {
                    ThreadUtils.a().post((Runnable)futureTask);
                }
                try {
                    return (auen)futureTask.get();
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
    public final void a(final aueu aueu, final Runnable runnable) {
        synchronized (this) {
            auer b;
            if ((b = this.a.get(aueu)) == null) {
                if (aueu.k) {
                    b = this.b();
                }
                else {
                    b = new auet(aueu);
                }
                this.a.put(aueu, b);
            }
            b.a(runnable);
        }
    }
}
