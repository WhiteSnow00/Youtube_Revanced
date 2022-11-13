import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atro extends atrn implements atrb
{
    private final Executor c;
    
    public atro(final Executor c) {
        atvj.a(this.c = c);
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
    
    public final void d(final atmd atmd, final Runnable runnable) {
        atmd.getClass();
        try {
            this.c.execute(runnable);
        }
        catch (final RejectedExecutionException ex) {
            arbu.C(atmd, aqsy.u("The task was rejected", (Throwable)ex));
            atrg.b.d(atmd, runnable);
        }
    }
    
    public final boolean equals(final Object o) {
        return o instanceof atro && ((atro)o).c == this.c;
    }
    
    public final int hashCode() {
        return System.identityHashCode(this.c);
    }
    
    public final String toString() {
        return this.c.toString();
    }
}
