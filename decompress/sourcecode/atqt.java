import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atqt extends atqs implements atqg
{
    private final Executor c;
    
    public atqt(final Executor c) {
        atum.a(this.c = c);
    }
    
    public final void close() {
        final Executor c = this.c;
        ExecutorService executorService;
        if (c instanceof ExecutorService) {
            executorService = (ExecutorService)c;
        }
        else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }
    
    public final void d(final atli atli, final Runnable runnable) {
        atli.getClass();
        try {
            this.c.execute(runnable);
        }
        catch (final RejectedExecutionException ex) {
            aqqm.t(atli, arxj.f("The task was rejected", ex));
            atql.b.d(atli, runnable);
        }
    }
    
    public final boolean equals(final Object o) {
        return o instanceof atqt && ((atqt)o).c == this.c;
    }
    
    public final int hashCode() {
        return System.identityHashCode(this.c);
    }
    
    public final String toString() {
        return this.c.toString();
    }
}
