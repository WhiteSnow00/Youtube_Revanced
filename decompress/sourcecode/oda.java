import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.AbstractExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oda extends AbstractExecutorService
{
    private final ExecutorService a;
    private final kju b;
    
    private oda(final ExecutorService a, final kju b, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    public static ExecutorService a(final aexq aexq, final ExecutorService executorService) {
        if (aexq.h()) {
            return new oda(executorService, (kju)aexq.c(), null);
        }
        return executorService;
    }
    
    @Override
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        return this.a.awaitTermination(n, timeUnit);
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        final boolean a = this.b.a;
        tmn tmn = null;
        if (!a) {
            final tml c = tmd.c();
            if (c != null) {
                tmn = new tmn(c);
            }
        }
        final ExecutorService a2 = this.a;
        if (tmn == null) {
            a2.execute(runnable);
            return;
        }
        a2.execute((Runnable)new nlt(tmn, runnable, 15));
    }
    
    @Override
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }
    
    @Override
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }
    
    @Override
    public final void shutdown() {
        this.a.shutdown();
    }
    
    @Override
    public final List shutdownNow() {
        return this.a.shutdownNow();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
